package saf.simulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;

import saf.ast.Fighter;
import saf.checker.CheckerVisitor;
import saf.interpreter.Game;
import saf.parser.ParseException;
import saf.parser.Parser;

public class Loader {
	private Window window;
	private Game game;
	
	private List<Fighter> fighters;
    public List<Fighter> getFighters() {
    	if (fighters == null)
    		fighters = new ArrayList<Fighter>();
    	
    	return fighters;
    }
    
    private List<String> errors;
    public List<String> getErrors() {
    	if (errors == null)
    		errors = new ArrayList<String>();

    	return errors;
    }
    
    public void addError(String identifier, String errorMessage) {
    	getErrors().add(String.format("[%s] %s", identifier, errorMessage));
    }
	
	public static void main(String[] args) {
		Loader loader = new Loader();
		loader.loadFighters(args);
		
    	if (loader.getErrors().size() > 0) {
    		System.out.println(String.format("%d error(s) encountered. See dump", loader.getErrors().size()));

    		for (String error : loader.getErrors())
        		System.out.println(error);
    	}
    	else {
    		loader.initialize();
    	}
    }
	
	public void loadFighters(String[] fileNames) {
    	if (fileNames.length != 2) {
    		getErrors().add("Please specify exactly 2 fdl files");
    		return;
    	}
    	
    	for (String fileName : fileNames)
    		loadFighterFromFile(fileName);
    	
    	for (Fighter fighter : getFighters())
    		checkFighter(fighter);
    }
    
    private void loadFighterFromFile(String fileName) {
    	try {
			Parser parser = new Parser(fileName);
			parser.Root();
			getFighters().add(parser.getFighter());
		} catch (FileNotFoundException e) {
			addError(fileName, e.getMessage());
		} catch (ParseException e) {
			addError(fileName, e.getMessage());
		}
    }
    
    private void checkFighter(Fighter fighter) {
    	CheckerVisitor checker = new CheckerVisitor(fighter);
    	checker.visitAllASTNodes();
    	for (String error : checker.getErrors())
    		addError(fighter.getName(), error);
    }
    
    public void initialize() {
    	initializeWindow();
    	initializeGameEngine();
    	initializeTimer();
    }
	
    private void initializeWindow() {
    	window = new Window();
    	window.getFighters().addAll(getFighters());
    }
    
    private void initializeGameEngine() {
    	game = new Game();
    	for (Fighter fighter : getFighters())
    		game.addFighter(fighter);
    	
    	game.addObserver(window.getRender());
    }
    
    private void initializeTimer() {
    	int delay = 750;
    	ActionListener taskPerformer = new ActionListener() {
    		public void actionPerformed(ActionEvent evt) {
    			game.EvaluateBots();
    		}
    	};
    	new Timer(delay, taskPerformer).start();
    }
}
