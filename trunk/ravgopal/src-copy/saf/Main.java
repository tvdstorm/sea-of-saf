package saf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import saf.ast.fighter.Fighter;
import saf.ast.util.Printer;
import saf.ast.util.SemanticCheckVisitor;
import saf.check.Error;
import saf.check.Message;
import saf.game.play.GameState;
import saf.game.vis.RenderVisualisation;
import saf.syntax.SAFLexer;
import saf.syntax.SAFParser;

public class Main {
	
	private static final String fileOne = "jackiechan.saf";
	private static final String fileTwo = "brucelee.saf";
	private static Fighter fighterOne = null;
	private static Fighter fighterTwo = null;
	private static List<Message> messages;

	public static void main(String[] args) {
		messages = new ArrayList<Message>();
		
		createFighters();
		
		messages = SemanticCheckVisitor.checkFighter(fighterOne);
		checkForErrors();
		messages = SemanticCheckVisitor.checkFighter(fighterTwo);
		checkForErrors();
		
		Printer.print(fighterOne);
		Printer.print(fighterTwo);
		
		if (fighterOne != null && fighterTwo != null) {
			GameState state = new GameState(fighterOne, fighterTwo);
			RenderVisualisation game = new RenderVisualisation(state);
			game.renderGame();
		}
		
	}
	
	public static void checkForErrors() {
		if (messages.size() > 0) {
			for (Message m : messages) 
				System.out.println(m.toString());
			
			System.exit(0);
		}
	}
	
	public static void createFighters() {
		fighterOne = loadFighterFromFile(fileOne);
		fighterTwo = loadFighterFromFile(fileTwo);
	}
	
	public static Fighter loadFighterFromFile(String fighterName) {
		Fighter fighter = null;
		String fighterFile = Config.MODEL_URL + fighterName;
		
		try {
			ANTLRFileStream fs = new ANTLRFileStream(fighterFile);
			SAFLexer lexer = new SAFLexer(fs);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			SAFParser parser = new SAFParser(tokenStream);
			fighter = parser.fighter();
		} catch (IOException e) {
			messages.add(new Error("Could not read the fighter file " + fighterFile));
		} catch (RecognitionException e) {
			messages.add(new Error("Grammar problem caused Recognition Exception"));
		}
		
		return fighter;
	}

}
