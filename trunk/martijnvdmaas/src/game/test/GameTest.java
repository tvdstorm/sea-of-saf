package game.test;


import static org.junit.Assert.*;

import java.io.IOException;

import game.FightEngine;
import game.FightStart;
import grammar.ParseException;
import main.Parser;

import org.junit.Test;

import astelements.Bots;

public class GameTest {

	/* Tests for a successful parsing of a valid input */
	@Test 
	public void testValidPlayers() throws ParseException, IOException {
		Bots bots = new Parser("C:\\Users\\martijn.van.der.maas\\workspace\\SAF-Martijn\\input\\validInput.saf", false).getBots();
		
		FightEngine fightEngine = new FightEngine(bots);
		while(fightEngine.isPlaying()) {
			fightEngine.doStep();
		}
		assertEquals(fightEngine.getWinner(), "goose");
	}
}
