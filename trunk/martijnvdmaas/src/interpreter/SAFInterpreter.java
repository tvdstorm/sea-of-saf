package interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import logger.ErrorLog;

import safobjects.Behaviour;
import safobjects.Bot;
import safobjects.Bots;
import safobjects.Characteristic;
import safobjects.ConditionChoices;
import safobjects.ConditionGroup;

public class SAFInterpreter 
{
	private Bots bots;
	private final String ERROR_PREFIX = "Interpret error: ";
	
	private String[] validCharacteristics  	= { "kickReach", "kickPower", "punchReach", "punchPower" };
	private String[] validMoves  			= { "jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away" };
	private String[] validAttacks 			= { "punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high" };
	private String[] validConditions 		= { "stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always" };
	
	public SAFInterpreter(Bots bots) 
	{
		this.bots = bots;
	}
	
	public void interpret()
	{
		interpretBot(bots.getFirstBot());
		interpretBot(bots.getSecondBot());
	}

	private boolean interpretBot(Bot bot)
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
	 			interpretError("Unknown characteristic found: " + characteristic.getName());
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
	 			interpretError("Duplicate characteristic definition found: " + characteristic.getName());
	 		}
	 		else 
	 		{
		 		if (characteristic.getValue() < 1) 
		 		{
		 			interpretError("Characteristic with lower value than 1 detected. Set to default value: 5");
		 			characteristic.setValue(5);
		 		}
		 		else if(characteristic.getValue() > 10) 
		 		{
		 			interpretError("Characteristic with higher value than 10 detected. Set to default value: 5");
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
			HashSet<String> moves = removeInvalidItemsInSet(behaviour.getMoveChoices(), validMoves, "move");
			if(moves.isEmpty())	
			{
				removedBehaviours.add(behaviour);
			}
			else 
			{
				behaviour.setMoveChoices(moves);
			}

			HashSet<String> attacks = removeInvalidItemsInSet(behaviour.getAttackChoices(), validAttacks, "attack");
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
				HashSet<String> conditionTypes = new HashSet<String>(conditionGroup.getConditionTypes());
				ArrayList<String> newConditions = new ArrayList<String>(removeInvalidItemsInSet(conditionTypes, validConditions, "condition"));
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
	
	public HashSet<String> removeInvalidItemsInSet(HashSet<String> items, String[] validItems, String errorTypeName) 
	{
		ArrayList<String> removedMoves = new ArrayList<String>();
		for(String item : items) 
		{
			if(!Arrays.asList(validItems).contains(item))
			{
				interpretError("Invalid " + errorTypeName + " detected: " + item);
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
	
	public void interpretError(String error) 
	{
		new ErrorLog(ERROR_PREFIX + error); 
		System.err.println(ERROR_PREFIX + error);
	}
}
