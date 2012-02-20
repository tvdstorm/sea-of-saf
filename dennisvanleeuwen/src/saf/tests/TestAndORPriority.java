package saf.tests;

import static org.junit.Assert.*;
import org.junit.* ;

import parser.ParseException;
import parser.SAFParser;
import saf.astnodes.Fighter;
import saf.astnodes.ICondition;
import saf.astnodes.conditions.AndConnective;
import saf.astnodes.conditions.OrConnective;

public class TestAndORPriority {
	@Test
	public void test_priorityOne(){
		SAFParser parser = FileLoader.loadFile(FileLoader.testFileDirectory + "AndOrOne.saf");
		Fighter fighter = null;
		try {
			fighter = parser.Fighter();
		} catch (ParseException e) {
			assertTrue(false);
		}
		ICondition condition = fighter.getRules().get(0).getCondition();
		//always or always and always or always
		assertEquals(condition.getClass(), OrConnective.class);
		assertEquals(((OrConnective)condition).getRhsCondition().getClass(), OrConnective.class);
		assertEquals(((OrConnective)((OrConnective)condition).getRhsCondition()).getLhsCondition().getClass(), AndConnective.class);
	}
	
	@Test
	public void test_priorityTwo(){
		SAFParser parser = FileLoader.loadFile(FileLoader.testFileDirectory + "AndOrTwo.saf");
		Fighter fighter = null;
		try {
			fighter = parser.Fighter();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			assertTrue(false);
		}
		ICondition condition = fighter.getRules().get(0).getCondition();
		//always and always or always and always 
		assertEquals(condition.getClass(), OrConnective.class);
		assertEquals(((OrConnective)condition).getLhsCondition().getClass(), AndConnective.class);
		assertEquals(((OrConnective)condition).getRhsCondition().getClass(), AndConnective.class);
	}
}
