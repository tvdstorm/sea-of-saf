package grammar.test;


import static org.junit.Assert.*;

import java.io.IOException;

import grammar.ParseException;
import main.Parser;

import org.junit.Test;

import astelements.Bots;

public class GrammarTest {
	
	/* Test for an exception that will be thrown when only one player exists in the input file */
	@Test (expected=ParseException.class)
	public void testOnePlayerException() throws ParseException, IOException {
		new Parser("onePlayer.saf", false);
	}
	
	/* Tests for a successful parsing of a valid input */
	@Test 
	public void testValidPlayers() throws ParseException, IOException {
		Bots bots = new Parser("validInput.saf", true).getBots();
		assertEquals("chicken", bots.getFirstBot().getBotName());
		assertEquals("chuck", bots.getSecondBot().getBotName());
	}
}
