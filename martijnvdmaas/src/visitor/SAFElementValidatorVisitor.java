package visitor;

import java.util.Arrays;

import astelements.Behaviour;
import astelements.Bot;
import astelements.Bots;
import astelements.Characteristic;
import astelements.ConditionChoices;
import astelements.ConditionGroup;




public class SAFElementValidatorVisitor implements SAFElementVisitor {

	
	private String[] validCharacteristics  	= { "kickReach", "kickPower", "punchReach", "punchPower" };
	private String[] validMoves  			= { "jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away" };
	private String[] validAttacks 			= { "punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high" };
	private String[] validConditions 		= { "stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always" };
	
	@Override
	public void visit(Behaviour botBehaviour) throws Exception {
		if(botBehaviour.getMoveChoices().isEmpty()) {
			throw new Exception("Behaviour found without moves");
		}
		for(String behaviourMoveOption : botBehaviour.getMoveChoices()) {
			if(!Arrays.asList(validMoves).contains(behaviourMoveOption)) {
				throw new Exception("Invalid behaviour move detected: " + behaviourMoveOption);
			}
		}
	}

	@Override
	public void visit(Bot bot) throws Exception {
		if(bot.getBotName().isEmpty() || bot.getBotName() == null) {
			throw new Exception("Botname is empty or null");
		}
		
		boolean hasAlwaysRule = false;
		
		for(Behaviour behaviour : bot.getBehaviours()) {
			if(conditionChoiceHasAlwaysRule(behaviour.getConditionChoices())) {
				hasAlwaysRule = true;
			}
		}
		if(!hasAlwaysRule) {
			throw new Exception("Bot \"" + bot.getBotName() + "\" does not have an always rule.");
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

	public boolean conditionChoiceHasAlwaysRule(ConditionChoices conditionChoices) {
		boolean alwaysCondition = false;
		for(ConditionGroup conditionGroup : conditionChoices.getConditionGroups()) 
		{
			if(conditionGroup.getConditionTypes().size() == 1) 
			{
				if(conditionGroup.getConditionTypes().get(0).equals("always")) {
					alwaysCondition = true;
				}
			}
		}
		
		return alwaysCondition;
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
