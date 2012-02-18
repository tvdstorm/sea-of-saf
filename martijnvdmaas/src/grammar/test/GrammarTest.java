package grammar.test;

import static org.junit.Assert.*;

import java.io.IOException;

import game.FightEngine;
import grammar.ParseException;
import main.Main;
import main.Parser;

import org.junit.Test;

import astelements.Bots;

public class GrammarTest
{

	/*
	 * Test for an exception that will be thrown when only one player exists in
	 * the input file
	 */
	@Test(expected = ParseException.class)
	public void testOnePlayerException() throws ParseException, IOException
	{
		new Parser(Main.getRelativeProjectPath() + "input\\onePlayer.saf");
	}

	/* Tests for a successful parsing of a valid input */
	@Test
	public void testPlayersAreValid() throws ParseException, IOException
	{
		Bots bots = new Parser(Main.getRelativeProjectPath() + "input\\validInput.saf").getBots();
		assertEquals("chicken", bots.getFirstBot().getBotName());
		assertEquals("goose", bots.getSecondBot().getBotName());
	}
}
