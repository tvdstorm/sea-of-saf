package saf.junit.structure;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import saf.checker.ElementChecker;
import saf.junit.TestHelpers;
import saf.parser.FileParser;
import saf.structure.Bots;

public class BotsTest {

	@Test
	public void loadingTest()
	{
		Bots bots = FileParser.consume("src\\saf\\junit\\input\\Bot_Char_Normal.txt");
		
		List<String> errors = ElementChecker.check(bots);
		
		assertEquals("Errors found in loading bot: " + TestHelpers.convertListToReadableString(errors), 0, errors.size());
		assertEquals("Error in loading number of bots", 1, bots.getBots().size());

		bots = FileParser.consume("src\\saf\\junit\\input\\Bot_Empty.txt");
		
		errors = ElementChecker.check(bots);
			
		if(errors.size() == 0)
			fail("Error not found in loading bot file Empty.");	
		else
			assertEquals("Error not found in loading bot.", "No bots were found.", errors.get(0));
	}
	
}
