package saf.ast;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import saf.ast.ConcreteCondition;
import saf.ast.State;

public class ConcreteConditionTest {
	
	Set<State> testSet;

	@Before
	public void setUp() throws Exception {
		testSet = new HashSet<State>();
		testSet.add(State.always);
		testSet.add(State.even);
	}

	@Test
	public void testMatched() {
		ConcreteCondition condition1 = new ConcreteCondition(State.always);
		assertTrue(condition1.matched(testSet));
		
		ConcreteCondition condition2 = new ConcreteCondition(State.far);
		assertFalse(condition2.matched(testSet));
	}
	


}
