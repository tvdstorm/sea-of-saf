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
	public void testIsStrongerWeaker() {
		Bot bruceLee = new Bot(null, 0);
		bruceLee.setKickPower(8);
		bruceLee.setKickReach(8);
		bruceLee.setPunchPower(8);
		bruceLee.setPunchReach(8);
		
		Bot jackieChan = new Bot(null, 5);
		jackieChan.setKickPower(5); 
		jackieChan.setKickReach(5); 
		jackieChan.setPunchPower(5); 
		jackieChan.setPunchReach(5);
		
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
	public void testIsStandingLeft_Reversed() {
		Bot bruceLee = new Bot(null, 4);
		Bot jackieChan = new Bot(null, 0);
		bruceLee.setOpponentBot(jackieChan);
		
		assertFalse(bruceLee.isStandingLeft());
		assertTrue(jackieChan.isStandingLeft());
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
		
		assertEquals(5, bruceLee.getPunchReach());
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
	public void testPunchReducesHitpoints() {
		Bot bruceLee = new Bot(null, 0);
		Bot jackieChan = new Bot(null, 2);
		bruceLee.setOpponentBot(jackieChan);
		
		bruceLee.setKickPower(1);
		bruceLee.setKickReach(1);
		bruceLee.setPunchPower(1);
		bruceLee.setPunchReach(1);
		bruceLee.performAction("punch_high");
		assertEquals(100, jackieChan.getHitpoints());
		assertEquals(100, bruceLee.getHitpoints());
		
		// has two wait 3 steps before he can continue with a new move (this is the pause after each move)
		for (int counter=0; counter<3; counter++)
			bruceLee.performAction("");
		
		bruceLee.performAction("walk_towards");
		bruceLee.performAction("punch_high");
		assertEquals(95, jackieChan.getHitpoints());
		assertEquals(100, bruceLee.getHitpoints());
	}
	
	@Test
	public void testPunchingBlock() {
		Bot bruceLee = new Bot(null, 0);
		Bot jackieChan = new Bot(null, 4);
		bruceLee.setOpponentBot(jackieChan);
		
		assertEquals(100, bruceLee.getHitpoints());
		assertTrue(jackieChan.isPunchInReach());
		bruceLee.performAction("block_high");
		jackieChan.performAction("punch_high");
		assertEquals(100, bruceLee.getHitpoints());

		for (int counter=0; counter<3; counter++)
			jackieChan.performAction("");
		
		jackieChan.performAction("punch_low");
		assertEquals(95, bruceLee.getHitpoints());
	}
	
	@Test
	public void testKickBlock() {
		Bot bruceLee = new Bot(null, 0);
		Bot jackieChan = new Bot(null, 4);
		bruceLee.setOpponentBot(jackieChan);
		
		assertEquals(100, bruceLee.getHitpoints());
		assertTrue(jackieChan.isKickInReach());
		bruceLee.performAction("block_low");
		jackieChan.performAction("kick_low");
		assertEquals(100, bruceLee.getHitpoints());

		for (int counter=0; counter<3; counter++)
			jackieChan.performAction("");
		
		jackieChan.performAction("kick_high");
		assertEquals(95, bruceLee.getHitpoints());
	}
	
	@Test
	public void testIsFarNear() {
		Bot bruceLee = new Bot(null, 0);
		Bot jackieChan = new Bot(null, 4);
		bruceLee.setOpponentBot(jackieChan);
		
		assertTrue(bruceLee.isFar());
		assertFalse(bruceLee.isNear());
		bruceLee.performAction("walk_towards");
		assertFalse(bruceLee.isFar());
		assertTrue(bruceLee.isNear());
	}
}
