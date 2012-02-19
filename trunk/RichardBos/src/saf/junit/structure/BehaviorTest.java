package saf.junit.structure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import saf.checker.ElementChecker;
import saf.parser.FileParser;
import saf.structure.Behavior;
import saf.structure.Bots;

public class BehaviorTest {

	private List<String> listNoAlwaysError;
	private List<String> listInvalidError;
	private List<String> listDuplicateError;
	private List<String> listConditionError;
	
	private Bots botsCondition;
	private ArrayList<Behavior> botConditionBehaviors;
		
	@Before
	public void init()
	{
		Bots bots = FileParser.consume("src\\saf\\junit\\input\\Bot_Behavior_NoAlways.txt");
		listNoAlwaysError = ElementChecker.check(bots);
		
		bots = FileParser.consume("src\\saf\\junit\\input\\Bot_Behavior_Invalid.txt");
		listInvalidError = ElementChecker.check(bots);
		
		bots = FileParser.consume("src\\saf\\junit\\input\\Bot_Behavior_Duplicate.txt");
		listDuplicateError = ElementChecker.check(bots);
		
		botsCondition = FileParser.consume("src\\saf\\junit\\input\\Bot_Behavior_Condition.txt");
		botConditionBehaviors = botsCondition.getBots().get(0).getBehaviors();
		listConditionError = ElementChecker.check(botsCondition);
	}
	
	@Test
	public void alwaysConditionTest()
	{
		String alwaysError = "Error found in alwaysTest.";
		assertEquals(alwaysError, 1, listNoAlwaysError.size());
		assertEquals(alwaysError, "Behavior condition 'always' was not found. Atleast one behavior with condition 'always' is required.", listNoAlwaysError.get(0));
	}
	
	@Test
	public void invalidActionTest()
	{
		String invalidActionError = "Error found in invalidAction. ";
		assertEquals(invalidActionError, 2, listInvalidError.size());
		assertEquals(invalidActionError, "Unknown Moveaction found:'wrongone'.", listInvalidError.get(0));
		assertEquals(invalidActionError, "Unknown Fightaction found:'wrongtwo'.", listInvalidError.get(1));
	}
	
	@Test
	public void duplicateActionTest()
	{
		String duplicateActionError = "Error not found in duplicateAction. ";
		assertEquals(duplicateActionError, 1, listDuplicateError.size());
		assertEquals(duplicateActionError, "Duplicate Fightaction found in choose clause: 'kick_low', please remove the duplicates.", listDuplicateError.get(0));
	}
	
	@Test
	public void conditionTest()
	{
		String conditionError = "Error not found in checkCondition. ";
		assertEquals(conditionError, 2,listConditionError.size());
		
		assertEquals(conditionError, "The behavior condition 'wrong' is invalid.", listConditionError.get(0));
		assertEquals(conditionError, "Invalid behavior condition found, 'always' is not a valid option in a clause.", listConditionError.get(1));
		
		String conditionStructureError = "Error in constructing condition structure.";
		assertEquals(conditionStructureError, "(near and far) or (stronger and even) or much_weaker", getConditionStringBy(3));
		assertEquals(conditionStructureError, "(near and far) or much_weaker", getConditionStringBy(4));
		assertEquals(conditionStructureError, "much_weaker or (near and far)", getConditionStringBy(5));
		assertEquals(conditionStructureError, "much_weaker or far", getConditionStringBy(6));
		assertEquals(conditionStructureError, "(much_weaker and far)", getConditionStringBy(7));
		
	}
	
	private String getConditionStringBy(int index)
	{
		return botConditionBehaviors.get(index).getCondition().toString();
	}
}