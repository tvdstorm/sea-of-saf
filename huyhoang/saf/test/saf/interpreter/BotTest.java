package saf.interpreter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import saf.AllTests;
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
	public void testSetOpponent() {
		Bot bruceLee = new Bot(null, 0);
		Bot jackieChan = new Bot(null, 1);
		
		assertEquals(null, bruceLee.getOpponentBot());
		assertEquals(null, jackieChan.getOpponentBot());
		assertEquals(0, bruceLee.countObservers());
		assertEquals(0, jackieChan.countObservers());
		
		bruceLee.setOpponentBot(jackieChan);
		
		assertEquals(jackieChan, bruceLee.getOpponentBot());
		assertEquals(bruceLee, jackieChan.getOpponentBot());
		assertEquals(1, bruceLee.countObservers());
		assertEquals(1, jackieChan.countObservers());
	}

	@Test
	public void testSetPosition() {
		Bot alpha = new Bot(new Fighter("alpha"), 0);
		Bot beta = new Bot(new Fighter("beta"), 3);
		alpha.setOpponentBot(beta);
		
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
	
	@Test
	public void testIsStrongerWeaker() {
		Bot bruceLee = new Bot(null, 0);
		bruceLee.kickPower = 8;
		bruceLee.kickReach = 8;
		bruceLee.punchPower = 8;
		bruceLee.punchReach = 8;
		
		Bot jackieChan = new Bot(null, 5);
		jackieChan.kickPower = 5; 
		jackieChan.kickReach = 5; 
		jackieChan.punchPower = 5; 
		jackieChan.punchReach = 5;
		
		bruceLee.setOpponentBot(jackieChan);
		
		assertTrue(bruceLee.isMuchStronger());
		assertTrue(bruceLee.isStronger());
		assertFalse(bruceLee.isWeaker());
		assertFalse(bruceLee.isMuchWeaker());
		
		assertFalse(jackieChan.isMuchStronger());
		assertFalse(jackieChan.isStronger());
		assertTrue(jackieChan.isWeaker());
		assertTrue(jackieChan.isMuchWeaker());
	}
	
	@Test
	public void testIsStandingLeft() {
		Bot bruceLee = new Bot(null, 0);
		Bot jackieChan = new Bot(null, 4);
		bruceLee.setOpponentBot(jackieChan);
		
		assertTrue(bruceLee.isStandingLeft());
		assertFalse(jackieChan.isStandingLeft());
	}
	
	@Test
	public void testWalkTowards() {
		Bot bruceLee = new Bot(null, 0);
		Bot jackieChan = new Bot(null, 4);
		bruceLee.setOpponentBot(jackieChan);
		
		assertEquals(0, bruceLee.getPosition());
		assertEquals(4, jackieChan.getPosition());
		bruceLee.walkTowards();
		jackieChan.walkTowards();
		assertEquals(1, bruceLee.getPosition());
		assertEquals(3, jackieChan.getPosition());
		bruceLee.walkTowards();
		jackieChan.walkTowards();
		assertEquals(2, bruceLee.getPosition());
		assertEquals(3, jackieChan.getPosition());
	}
	
	@Test
	public void testIsPunchInReach() {
		Bot bruceLee = new Bot(null, 0);
		Bot jackieChan = new Bot(null, 3);
		bruceLee.setOpponentBot(jackieChan);
		
		assertEquals(5, bruceLee.punchReach);
		assertTrue(bruceLee.isPunchInReach());
	}
	
	@Test
	public void testIsAllowedToPerformNewAction() {
		Bot bruceLee = new Bot(null, 0);
		Bot jackieChan = new Bot(null, 3);
		bruceLee.setOpponentBot(jackieChan);
		
		assertEquals(100, bruceLee.getHitpoints());
		assertEquals(100, jackieChan.getHitpoints());
		assertTrue(bruceLee.isAllowedToPerformAction());
	}
	
	@Test
	public void testFight() {
		Bot bruceLee = new Bot(null, 0);
		Bot jackieChan = new Bot(null, 4);
		bruceLee.setOpponentBot(jackieChan);
		
		assertEquals(5, bruceLee.punchReach);
		assertEquals(100, bruceLee.getHitpoints());
		assertEquals(100, jackieChan.getHitpoints());

		bruceLee.performAction("punch_high");
		assertEquals(90, jackieChan.getHitpoints());
		jackieChan.getLastAction().equals("hit");
	}
}
