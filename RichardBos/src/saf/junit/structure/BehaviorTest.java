package saf.junit.structure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import saf.checker.ElementChecker;
import saf.parser.FileParser;
import saf.structure.Bots;

public class BehaviorTest {

	private List<String> listNoAlwaysError;
	private List<String> listInvalidError;
	private List<String> listDuplicateError;
	private List<String> listConditionError;
	
	private Bots botsCondition;
		
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
		listConditionError = ElementChecker.check(botsCondition);
	}
	
	@Test
	public void alwaysConditionTest()
	{
		assertEquals("Error found in alwaysTest. ", 1, listNoAlwaysError.size());
		assertEquals("Error found in alwaysTest. ", "Behavior condition 'always' was not found. Atleast one behavior with condition 'always' is required.", listNoAlwaysError.get(0));
	}
	
	@Test
	public void invalidActionTest()
	{
		assertEquals("Error found in invalidAction. ", 0, listInvalidError.size());
		assertEquals("Error found in invalidAction. ", "Unknown Moveaction found:'wrongone'.", listInvalidError.get(0));
		assertEquals("Error found in invalidAction. ", "Unknown Fightaction found:'wrongtwo'.", listInvalidError.get(1));
	}
	
	@Test
	public void duplicateActionTest()
	{
		assertEquals("Error not found in duplicateAction. ", 0, listDuplicateError.size());
		assertEquals("Error not found in duplicateAction. ", "Duplicate Fightaction found in choose clause: 'kick_low', please remove the duplicates.", listDuplicateError.get(0));
	}
	
	@Test
	public void conditionTest()
	{
		assertEquals("Error not found in checkCondition. ", 0,listConditionError.size());
		
		assertEquals("Error not found in checkCondition. ", "The behavior condition 'wrong' is invalid.", listConditionError.get(0));
		assertEquals("Error not found in checkCondition. ", "Invalid behavior condition found, 'always' is not a valid option in a clause.", listConditionError.get(1));
		
		assertEquals("Error in constructing condition structure.", "(near and far) or (stronger and even) or much_weaker", getConditionStringBy(3));
		assertEquals("Error in constructing condition structure.", "(near and far) or much_weaker", getConditionStringBy(4));
		assertEquals("Error in constructing condition structure.", "much_weaker or (near and far)", getConditionStringBy(5));
		assertEquals("Error in constructing condition structure.", "much_weaker or far", getConditionStringBy(6));
		assertEquals("Error in constructing condition structure.", "(much_weaker and far)", getConditionStringBy(7));
		
	}
	
	private String getConditionStringBy(int index)
	{
		return botsCondition.getBots().get(0).getBehaviors().get(index).getCondition().toString();
	}
}