package grammar.Evaluators;
import java.util.Arrays;

public class BotChecker implements BotVisit {

	@Override
	public void visit(Characteristic character) {
		String[] charItems = { "punchReach", "punchPower","kickReach","kickPower"};

		if (Arrays.asList(charItems).contains(character.getCharacterName())) {
			System.out.print(character.getCharacterName());
			System.out.println( " = " + character.getCharacterValue());
					
		} else {
		  System.out.println("Characteristic:  "+ character.getCharacterName() +"  is not valid!");
		}
	}

	@Override
	public void visit(InputRule inputrule) {
		// TODO Auto-generated method stub
		System.out.println("InputRule printout");
	}

	@Override
	public void visit(Rule rule) {
		// TODO Auto-generated method stub
		System.out.println("Rule printout");
	}

	@Override
	public void visit(Bot bot) {
		// TODO Auto-generated method stub
		System.out.println("Bot printout");
		for (Characteristic c : bot.getCharacteristics()) {
			visit(c);	
		}
		
	}

	@Override
	public void visit(Condition condition) {
		// TODO Auto-generated method stub
		System.out.println("Condition printout");
		
	}

}
