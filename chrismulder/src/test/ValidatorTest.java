package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import game.Main;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ast.Saf;


public class ValidatorTest {

	private boolean hasStringContaining(List<String> list, String needle) {
		for (String s : list) {
			if (s.contains(needle)) {
				return true;
			}
		}
		return false;
	}

	@Test
	public void testAllWrongFDL() {
		List<String> messages = new ArrayList<String>();
		Saf testSaf = null;
		
		testSaf = Main.loadSafFromFile("data/all-wrong.fdl");
		testSaf.validate(messages);
		assertEquals(11, messages.size());
		assertTrue(hasStringContaining(messages, "not a valid strength value"));
		assertTrue(hasStringContaining(messages, "not a valid strength."));
		assertTrue(hasStringContaining(messages, "not a valid value for class ast.ConditionAtom"));
		assertTrue(hasStringContaining(messages, "not a valid value for class ast.AttackAtom"));
		assertTrue(hasStringContaining(messages, "not a valid value for class ast.MoveAtom"));
		assertTrue(hasStringContaining(messages, "always rule"));
	}
	
	@Test
	public void testCorrectFDL() {
		List<String> messages = new ArrayList<String>();
		Saf testSaf = null;
		
		testSaf = Main.loadSafFromFile("data/chicken.fdl");
		testSaf.validate(messages);
		assertEquals(0, messages.size());
	}

}
