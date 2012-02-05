package Game;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import saf.ast.Fighter;
import saf.checker.CheckerVisitor;
import safparser.*;

public class Arena {
	private List<Bot> bots;
	private Interpreter interpreter;
	
	public static void main(String args []) {
        System.out.println("Arena");
        Arena arena = new Arena();
    }
	
	// replace later with a real function to load from file
	protected Fighter loadFighterFromFile(String fileName) {
		System.out.println("Loading bot specification '" + fileName + "'");
		
		String specification = "";
		
		if (fileName == "1") {
			specification = "jackiechan { punchPower = 5 always [ run_away punch_high ] }";
		}
		if (fileName == "2") {
			specification = "brucelee { kickPower = 10 always [ run_towards kick_high ] }";
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

		Bot firstBot = new Bot(loadFighterFromFile("1"));
		Bot secondBot = new Bot(loadFighterFromFile("2"));
		firstBot.setOpponentBot(secondBot);
		secondBot.setOpponentBot(firstBot);
		
		bots.add(firstBot);
		bots.add(secondBot);

		// drop bots randomly in the arena
		Random random = new Random();
		firstBot.setPosition(0);
		secondBot.setPosition(1 + Math.round(10));
	}
	
	public Arena() {
		this.initializeBots();
		for ( Bot bot : bots ) {
			CheckerVisitor checker = new CheckerVisitor(bot.getFighter());
			checker.visitAllAstStatements();
			if (checker.getErrors().size() > 0) {
				System.out.println("Saf specification contains errors...");
				for ( String error : checker.getErrors() ) {
					System.out.println(error);
				}
				return;
			}
		}
		
		interpreter = new Interpreter();
		interpreter.Evaluate(bots.get(0).getFighter(), bots.get(0));
		interpreter.Evaluate(bots.get(1).getFighter(), bots.get(1));
	}
}
