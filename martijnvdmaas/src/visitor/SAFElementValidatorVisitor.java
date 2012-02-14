package visitor;

import java.util.Arrays;

import constants.SAFConstants;

import astelements.Behaviour;
import astelements.Bot;
import astelements.Bots;
import astelements.Characteristic;
import astelements.ConditionChoices;
import astelements.ConditionGroup;




public class SAFElementValidatorVisitor implements SAFElementVisitor {
	
	@Override
	public void visit(Behaviour botBehaviour) throws Exception {
		/* The amount of moves in a behaviour should not be empty */
		if(botBehaviour.getMoveChoices().isEmpty()) {
			throw new Exception("Behaviour found without moves");
		}
		
		/* Only moves from SAFConstants are allowed */
		for(String behaviourMoveOption : botBehaviour.getMoveChoices()) {
			if(!Arrays.asList(SAFConstants.validMoves).contains(behaviourMoveOption)) {
				throw new Exception("Invalid behaviour move detected: " + behaviourMoveOption);
			}
		}
		
		/* Only attacks from SAFConstants are allowed */
		for(String behaviourAttackOption : botBehaviour.getAttackChoices()) {
			if(!Arrays.asList(SAFConstants.validAttacks).contains(behaviourAttackOption)) {
				throw new Exception("Invalid behaviour attack detected: " + behaviourAttackOption);
			}
		}
	}

	@Override
	public void visit(Bot bot) throws Exception {
		/* Botname should not be empty */
		if(bot.getBotName().isEmpty() || bot.getBotName() == null) {
			throw new Exception("Botname is empty or null");
		}
		
		boolean hasAlwaysRule = false;
		
		/* Each bot should at least have one Always rule */
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
		/* Firstbot and Secondbot should be instantiated */
		if(bots.getFirstBot() == null) {
			throw new Exception("First bot is not instantiated");
		}
		if(bots.getSecondBot() == null) {
			throw new Exception("Second bot is not instantiated");
		}
	}

	@Override
	public void visit(Characteristic characteristic) throws Exception {
		/* Each characteristic should have a name */
		if(characteristic.getName().isEmpty() || characteristic.getName() == null) {
			throw new Exception("Characteristic found with empty or null name");
		}
		
		/* Only characteristics with values from SAFConstants are allowed */
		if(!Arrays.asList(SAFConstants.validCharacteristics).contains(characteristic.getName())) {
			throw new Exception("Invalid characteristic name: " + characteristic.getName());
		}
		
		/* Characteristics should have a value in between 1 and 10 */
		if (characteristic.getValue() < 1) 
 		{
			throw new Exception("Characteristic \"" + characteristic.getName() + "\" has too low value: " +characteristic.getValue() + ". Should be in between 1/10");
 		}
 		else if(characteristic.getValue() > 10) 
 		{
 			throw new Exception("Characteristic \"" + characteristic.getName() + "\" has too high value: " +characteristic.getValue() + ". Should be in between 1/10");
 	 	}	
	}

	/* Function for check whether a conditionchoice contains an always rule */
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
		/* Only conditions from SAFConstants are allowed */
		for(String condition : conditionGroup.getConditionTypes()) 
		{
			if(!Arrays.asList(SAFConstants.validConditions).contains(condition)) {
				throw new Exception("Invalid condition: " + condition);
			}
		}
	}
}
