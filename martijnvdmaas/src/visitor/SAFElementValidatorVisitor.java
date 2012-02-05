package visitor;

import java.util.Arrays;

import elements.Behaviour;
import elements.Bot;
import elements.Bots;
import elements.Characteristic;
import elements.ConditionChoices;
import elements.ConditionGroup;

public class SAFElementValidatorVisitor implements SAFElementVisitor {

	
	private String[] validCharacteristics  	= { "kickReach", "kickPower", "punchReach", "punchPower" };
	private String[] validMoves  			= { "jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away" };
	private String[] validAttacks 			= { "punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high" };
	private String[] validConditions 		= { "stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always" };
	
	@Override
	public void visit(Behaviour behaviour) {
		
	}

	@Override
	public void visit(Bot bot) throws Exception {
		if(bot.getBotName().isEmpty() || bot.getBotName() == null) {
			throw new Exception("Botname is empty or null");
		}
	}

	@Override
	public void visit(Bots bots) throws Exception {
		if(bots.getFirstBot() == null) {
			throw new Exception("First bot is not instantiated");
		}
		if(bots.getSecondBot() == null) {
			throw new Exception("Second bot is not instantiated");
		}
	}

	@Override
	public void visit(Characteristic characteristic) throws Exception {
		if(characteristic.getName().isEmpty() || characteristic.getName() == null) {
			throw new Exception("Characteristic found with empty or null name");
		}
		
		if(!Arrays.asList(validCharacteristics).contains(characteristic.getName())) {
			throw new Exception("Invalid characteristic name: " + characteristic.getName());
		}
		
		if (characteristic.getValue() < 1) 
 		{
			throw new Exception("Characteristic \"" + characteristic.getName() + "\" has too low value: " +characteristic.getValue() + ". Should be in between 1/10");
 		}
 		else if(characteristic.getValue() > 10) 
 		{
 			throw new Exception("Characteristic \"" + characteristic.getName() + "\" has too high value: " +characteristic.getValue() + ". Should be in between 1/10");
 	 	}	
	}

	@Override
	public void visit(ConditionChoices conditionChoices) throws Exception {
		boolean validCondition = false;
		for(ConditionGroup conditionGroup : conditionChoices.getConditionGroups()) 
		{
			if(conditionGroup.getConditionTypes().size() == 1) 
			{
				System.err.println(conditionGroup.getConditionTypes().get(0));
				if(conditionGroup.getConditionTypes().get(0).equals("always")) {
					validCondition = true;
				}
			}
		}

		System.err.println("nu");
		if(validCondition == false) {
			//throw new Exception("There should be at least one \"always\" rule in a bot.");
		}
	}

	@Override
	public void visit(ConditionGroup conditionGroup) throws Exception {
		for(String condition : conditionGroup.getConditionTypes()) 
		{
			if(!Arrays.asList(validConditions).contains(condition)) {
				throw new Exception("Invalid condition: " + condition);
			}
		}
	}
}
