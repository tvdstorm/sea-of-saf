package saf.entities;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class ConcreteConditionTest {
	
	Set<ConditionType> testSet;

	@Before
	public void setUp() throws Exception {
		testSet = new HashSet<ConditionType>();
		testSet.add(ConditionType.always);
		testSet.add(ConditionType.even);
	}

	@Test
	public void testMatched() {
		ConcreteCondition condition1 = new ConcreteCondition(ConditionType.always);
		assertTrue(condition1.matched(testSet));
		
		ConcreteCondition condition2 = new ConcreteCondition(ConditionType.far);
		assertFalse(condition2.matched(testSet));
	}
	


}
