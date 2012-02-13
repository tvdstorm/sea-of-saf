package saf.interpreter;

import static org.junit.Assert.*;
import org.junit.Test;
import saf.interpreter.*;
import saf.ast.*;

public class BotTest {

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

}
