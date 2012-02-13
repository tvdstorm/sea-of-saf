package checker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import elements.Behaviour;
import elements.Bot;
import elements.Bots;
import elements.Characteristic;
import elements.ConditionChoices;
import elements.ConditionGroup;



import logger.ErrorLog;


public class SAFChecker 
{
	private Bots bots;
	private final String ERROR_PREFIX = "Check error: ";
	
	private String[] validCharacteristics  	= { "kickReach", "kickPower", "punchReach", "punchPower" };
	private String[] validMoves  			= { "jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away" };
	private String[] validAttacks 			= { "punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high" };
	private String[] validConditions 		= { "stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always" };
	
	public SAFChecker(Bots bots) 
	{ 
		this.bots = bots;
	}
	
	public Bots check()
	{
		checkBot(bots.getFirstBot());
		checkBot(bots.getSecondBot());
		
		return bots;
	}

	private boolean checkBot(Bot bot)
	{

	 	ArrayList<Characteristic> characteristics = interpetCharacteristics(bot.getCharacteristics());
	 	ArrayList<Behaviour> behaviours = interpetBehaviours(bot.getBehaviours());

	 	bot.setCharacteristics(characteristics);
	 	bot.setBehaviours(behaviours);
	 	
	 	return true;
 	}
	
	private ArrayList<Characteristic> interpetCharacteristics(ArrayList<Characteristic> characteristics) 
	{
	 	ArrayList<Characteristic> newCharacteristics 	= new ArrayList<Characteristic>();
	 	ArrayList<String> definedCharacteristicNames 	= new ArrayList<String>();
	 	
		for(Characteristic characteristic : characteristics) 
	 	{
			if(!Arrays.asList(validCharacteristics).contains(characteristic.getName()))
	 		{
	 			checkError("Unknown characteristic found: " + characteristic.getName());
	 			continue;
	 		}
	 		boolean duplicateFound = false;
	 		for(int j = 0; j < newCharacteristics.size(); j++) 
	 		{
	 			if(characteristic.getName().equals((newCharacteristics.get(j).getName()))) 
	 			{
	 				duplicateFound = true;
	 			}
	 		}
	 		if(duplicateFound) 
	 		{
	 			checkError("Duplicate characteristic definition found: " + characteristic.getName());
	 		}
	 		else 
	 		{
		 		if (characteristic.getValue() < 1) 
		 		{
		 			checkError("Characteristic with lower value than 1 detected. Set to default value: 5");
		 			characteristic.setValue(5);
		 		}
		 		else if(characteristic.getValue() > 10) 
		 		{
		 			checkError("Characteristic with higher value than 10 detected. Set to default value: 5");
		 			characteristic.setValue(5);
		 		}	
		 		definedCharacteristicNames.add(characteristic.getName());
		 		newCharacteristics.add(characteristic);
	 		}
	 	}
		
		newCharacteristics = addDefaultCharacteristics(newCharacteristics, definedCharacteristicNames);
		
	 	return newCharacteristics;	 
	}
	
	private ArrayList<Characteristic> addDefaultCharacteristics(ArrayList<Characteristic> newCharacteristics, ArrayList<String> definedCharacteristicNames) {
		for(String characteristicName : validCharacteristics) 
		{
			if(!definedCharacteristicNames.contains(characteristicName)) 
			{
				newCharacteristics.add(new Characteristic(characteristicName, 5));
			}
		}
		return newCharacteristics;
	}

	private ArrayList<Behaviour> interpetBehaviours(ArrayList<Behaviour> behaviours) 
	{
		HashSet<Behaviour> removedBehaviours = new HashSet<Behaviour>();
		for(Behaviour behaviour : behaviours) 
		{
			ArrayList<String> moves = removeInvalidItemsInArrayList(behaviour.getMoveChoices(), validMoves, "move");
			if(moves.isEmpty())	
			{
				removedBehaviours.add(behaviour);
			}
			else 
			{
				behaviour.setMoveChoices(moves);
			}

			ArrayList<String> attacks = removeInvalidItemsInArrayList(behaviour.getAttackChoices(), validAttacks, "attack");
			if(attacks.isEmpty())	
			{
				removedBehaviours.add(behaviour);
			}
			else 
			{
				behaviour.setAttackChoices(attacks);
			}
			ConditionChoices conditionChoices = behaviour.getConditionChoices();
			
			ArrayList<ConditionGroup> conditionGroups = conditionChoices.getConditionGroups();
			ArrayList<ConditionGroup> removedConditionGroups = new ArrayList<ConditionGroup>();
			
			for(ConditionGroup conditionGroup : conditionGroups) 
			{
				ArrayList<String> conditionTypes = conditionGroup.getConditionTypes();
				ArrayList<String> newConditions = new ArrayList<String>(removeInvalidItemsInArrayList(conditionTypes, validConditions, "condition"));
				if(newConditions.isEmpty()) 
				{
					removedConditionGroups.add(conditionGroup);
				}
			}
			
			conditionGroups.removeAll(removedConditionGroups);
			if(conditionGroups.isEmpty()) 
			{
				removedBehaviours.add(behaviour);
			}
		}
		
		behaviours.removeAll(removedBehaviours);
		return behaviours;
	}
	
	public ArrayList<String> removeInvalidItemsInArrayList(ArrayList<String> items, String[] validItems, String errorTypeName) 
	{
		ArrayList<String> removedMoves = new ArrayList<String>();
		for(String item : items) 
		{
			if(!Arrays.asList(validItems).contains(item))
			{
				checkError("Invalid " + errorTypeName + " detected: " + item);
				removedMoves.add(item);
			}
		}
		items.removeAll(removedMoves);
		return items;
	}
	
	public boolean isStringInArray(String name, String[] validNames) 
	{
		if(Arrays.asList(validNames).contains(name)) return true;
		
		return false;
	}
	
	public void checkError(String error) 
	{
		new ErrorLog(ERROR_PREFIX + error); 
	}
}
