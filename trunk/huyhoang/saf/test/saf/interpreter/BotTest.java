package saf.interpreter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import saf.interpreter.*;
import saf.ast.*;

public class BotTest {
	private Bot bruceLee;
	private Bot jackieChan;
	
	@Before
	public void setUp() {
		bruceLee = new Bot(new Fighter("BruceLee"), 0);
		jackieChan = new Bot(new Fighter("JackieChan"), 10);
		
		bruceLee.setOpponentBot(jackieChan);
		jackieChan.setOpponentBot(bruceLee);
	}

	@Test
	public void testSetPosition() {
		Bot alpha = new Bot(new Fighter("alpha"), 0);
		Bot beta = new Bot(new Fighter("beta"), 3);
		
		alpha.setOpponentBot(beta);
		beta.setOpponentBot(alpha);
		
		alpha.setPosition(4);
		assertEquals(2, alpha.getPosition());
		
		alpha.setPosition(-2);
		assertEquals(-2, alpha.getPosition());
		
		beta.setPosition(-2);
		assertEquals(-1, beta.getPosition());
	}

	@Test
	public void testIsEven() {
		assertTrue(bruceLee.kickPower == jackieChan.kickPower);
		assertTrue(bruceLee.kickReach == jackieChan.kickReach);
		assertTrue(bruceLee.punchPower == jackieChan.punchPower);
		assertTrue(bruceLee.punchReach == jackieChan.punchReach);
		
		assertTrue(bruceLee.isEven());
	}
}
