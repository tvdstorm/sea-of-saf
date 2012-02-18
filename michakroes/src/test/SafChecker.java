package test;

//import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import org.junit.Test;

import saf.*;

public class SafChecker extends TestCase {

	@Test
	public void testSaf() {
		Saf saf = new Saf();
		
		assertNotNull("Check for personality", saf.getPersonality());
		assertNotNull("Check for Behaviour", saf.getBehaviour()); 
	}
	/*
	@Test
	public void testStrenght() {
		Strength power = new Strength("kickpower", 8);
		
		assertEquals("Check power", power.checkStrenght());
	}
	*/
	@Test
	public void testPersonality() {
		List<Strength> strenghts = new ArrayList<Strength>();
		strenghts.add(new Strength("kickpower", 8));
		
		Saf saf = new Saf();
		
		assertNotNull("Check for personality", saf.getPersonality());
		assertNotNull("Check for Behaviour", saf.getBehaviour()); 
	}
}
