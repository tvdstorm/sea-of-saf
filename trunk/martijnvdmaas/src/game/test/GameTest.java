package game.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import game.FightEngine;
import grammar.ParseException;

import java.io.IOException;

import main.Main;
import main.Parser;

import org.junit.Before;
import org.junit.Test;

import astelements.Bots;

public class GameTest {
	
	/* Parser should always run once, before it can restart */
	@Before
	public void initializeParser() throws ParseException, IOException {
		new Parser(Main.getRelativeProjectPath() + "input\\validInput.saf");
	}

	/* Tests for a correct initialization of the fighters */
	@Test
	public void testFightersAreInitialized() throws ParseException, IOException
	{
		System.out.println("nu2");
		Bots bots = new Parser(Main.getRelativeProjectPath() + "input\\validInput.saf").getBots();
		FightEngine fightEngine = new FightEngine(bots);
		
		assertNotNull(fightEngine.getLeftFighter());
		assertNotNull(fightEngine.getRightFighter());
	}

	/* Tests for a winner after a fight */
	@Test
	public void testWinnerAfterAFight() throws ParseException, IOException
	{
		System.out.println("nu3");
		Bots bots = new Parser(Main.getRelativeProjectPath() + "input\\validInput.saf").getBots();
		FightEngine fightEngine = new FightEngine(bots);

		while (fightEngine.isPlaying())
		{
			fightEngine.doStep();
		}
		assertFalse(fightEngine.getWinner().equals(""));
	}
	

	/* Tests for the unbeatable player (chuck) who should always win */
	@Test
	public void testUnbeatablePlayerWins() throws ParseException, IOException
	{
		System.out.println("nu4");
		Bots bots = new Parser(Main.getRelativeProjectPath() + "input\\chuck.saf").getBots();
		FightEngine fightEngine = new FightEngine(bots);

		while (fightEngine.isPlaying())
		{
			fightEngine.doStep();
		}
		assertEquals(fightEngine.getWinner(), "chuck");		
	}
}
