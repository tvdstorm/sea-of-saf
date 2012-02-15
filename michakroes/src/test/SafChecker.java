package test;

import static org.junit.Assert.*;
import org.junit.Test;

import saf.*;

public class SafChecker {

	@Test
	public void testSaf() {
		Saf saf = new Saf();
		
		assertNotNull("Check for personality", saf.getPersonality());
		assertNotNull("Check for Behaviour", saf.getBehaviour()); 
	}
}
