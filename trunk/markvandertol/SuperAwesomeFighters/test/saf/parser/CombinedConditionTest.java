package saf.parser;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import saf.entities.CombinedCondition;
import saf.entities.Condition;
import saf.entities.ConditionType;

public class CombinedConditionTest {
	
	Condition conditionTrue = new Condition() {
		
		@Override
		public boolean matched(Set<ConditionType> currentConditions) {
			return true;
		}
	};
	
	Condition conditionFalse = new Condition() {
		
		@Override
		public boolean matched(Set<ConditionType> currentConditions) {
			return false;
		}
	};

	Set<ConditionType> setDummy = new HashSet<ConditionType>();

	@Test
	public void testMatchedAnd() {
		CombinedCondition condition1 = new CombinedCondition(conditionTrue, conditionTrue, true);
		assertTrue(condition1.isRequireBoth());
		assertTrue(condition1.matched(setDummy));
		
		CombinedCondition condition2 = new CombinedCondition(conditionTrue, conditionFalse, true);
		assertFalse(condition2.matched(setDummy));
		
		CombinedCondition condition3 = new CombinedCondition(conditionFalse, conditionTrue, true);
		assertFalse(condition3.matched(setDummy));
		
		CombinedCondition condition4 = new CombinedCondition(conditionFalse, conditionFalse, true);
		assertFalse(condition4.matched(setDummy));
	}
	
	@Test
	public void testMatchedOr() {
		CombinedCondition condition1 = new CombinedCondition(conditionTrue, conditionTrue, false);
		assertFalse(condition1.isRequireBoth());
		assertTrue(condition1.matched(setDummy));
		
		CombinedCondition condition2 = new CombinedCondition(conditionTrue, conditionFalse, false);
		assertTrue(condition2.matched(setDummy));
		
		CombinedCondition condition3 = new CombinedCondition(conditionFalse, conditionTrue, false);
		assertTrue(condition3.matched(setDummy));
		
		CombinedCondition condition4 = new CombinedCondition(conditionFalse, conditionFalse, false);
		assertFalse(condition4.matched(setDummy));
	}

}
