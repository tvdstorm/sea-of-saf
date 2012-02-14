package game.test;


import static org.junit.Assert.*;

import java.io.IOException;

import game.FightStart;
import grammar.ParseException;
import main.Parser;

import org.junit.Test;

import astelements.Bots;

public class GameTest {

	/* Tests for a successful parsing of a valid input */
	@Test 
	public void testValidPlayers() throws ParseException, IOException {
		Bots bots = new Parser("validInput.saf", true).getBots();
		FightStart fight = new FightStart(bots);
		fight.getFightEngine().doStep();
	}
}
