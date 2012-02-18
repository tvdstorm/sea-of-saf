package saf.interpreter;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

import saf.ast.Fighter;
import saf.checker.CheckerVisitor;
import saf.parser.*;

public class Arena extends Observable {
	private List<Bot> bots;
	
	public List<Bot> getBots() {
		return bots;
	}
	
	private InterpreterVisitor interpreter;
	
	public static void main(String args []) {
        System.out.println("Arena");
        Arena arena = new Arena();
        arena.EvaluateBots();
    }
	
	// replace later with a real function to load from file
	protected Fighter loadFighterFromFile(String fileName) {
		System.out.println("Loading bot specification '" + fileName + "'");
		
		String specification = "";
		
		if (fileName == "1") {
			specification = "jackiechan { punchPower = 5 weaker [ run_away block_low ] always [ run_towards punch_high ] }";
		}
		if (fileName == "2") {
			specification = "brucelee { kickPower = 10 stronger [ run_towards kick_high ] always [ crouch block_high ] }";
		}

		ByteArrayInputStream input = new ByteArrayInputStream(specification.getBytes());
		Parser parser = new Parser(input);
		try {
			parser.Root();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parser.getFighter();
	}
	
	protected void initializeBots() {
		bots = new ArrayList<Bot>();

		Random random = new Random();
		Bot firstBot = new Bot(loadFighterFromFile("1"), 5);
		Bot secondBot = new Bot(loadFighterFromFile("2"), 10);
		firstBot.setOpponentBot(secondBot);
		secondBot.setOpponentBot(firstBot);
		
		bots.add(firstBot);
		bots.add(secondBot);
	}
	
	public Arena() {
		this.initializeBots();
		for (Bot bot : bots) {
			CheckerVisitor checker = new CheckerVisitor(bot.getFighter());
			checker.visitAllASTNodes();
			if (checker.getErrors().size() > 0) {
				System.out.println("Saf specification contains errors...");
				for ( String error : checker.getErrors() ) {
					System.out.println(error);
				}
				return;
			}
		}
	}
	
	public void EvaluateBots() {
		interpreter = new InterpreterVisitor();
		for (int counter=0; counter<2; counter++) {
			interpreter.Evaluate(bots.get(counter).getFighter(), bots.get(counter));
		}
		
		this.setChanged();
		this.notifyObservers();
	}
}
