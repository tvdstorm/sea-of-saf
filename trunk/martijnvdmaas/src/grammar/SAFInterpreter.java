package grammar;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import safobjects.Behaviour;
import safobjects.Bot;
import safobjects.Bots;
import safobjects.Characteristic;
import safobjects.ConditionChoices;
import safobjects.ConditionGroup;

public class SAFInterpreter {
	Bots bots;
	
	private String[] validCharacteristics  = { "kickReach", "kickPower", "punchReach", "punchPower" };
	private String[] validMoves  = { "jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away" };
	private String[] validAttacks = { "punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high" };
	private String[] validConditions = { "stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always" };
	
	public SAFInterpreter(Bots bots) {
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
	 	ArrayList<Characteristic> characteristicSet 	= new ArrayList<Characteristic>();
	 	
		for(Characteristic characteristic : characteristics) 
	 	{
	 		if(!isStringInArray(characteristic.getName(), validCharacteristics)) 
	 		{
	 			interpretError("Unkown characteristic found: " + characteristic.getName());
	 			continue;
	 		}
	 		boolean duplicateFound = false;
	 		for(int j = 0; j < characteristicSet.size(); j++) 
	 		{
	 			if(characteristic.getName().equals((characteristicSet.get(j).getName()))) 
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
		 		
		 		characteristicSet.add(characteristic);
	 		}
	 	}
		
	 	return characteristicSet;	 
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
	
	public HashSet<String> removeInvalidItemsInSet(HashSet<String> items, String[] validItems, String typeName) 
	{
		ArrayList<String> removedMoves = new ArrayList<String>();
		for(String item : items) 
		{
			if(!isStringInArray(item, validItems))
			{
				interpretError("Invalid " + typeName + " detected: " + item);
				removedMoves.add(item);
			}
		}
		items.removeAll(removedMoves);
		return items;
	}
	
	public boolean isStringInArray(String name, String[] validNames) 
	{
		for (String option : validNames) 
		{
			if(option.equals(name)) 
			{
				return true;
			}
		}
		return false;
	}
	
	public void interpretError(String error) 
	{
		System.err.println(error);
	}
}
