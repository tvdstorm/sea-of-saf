package nl.uva.saf.test;

import java.util.ArrayList;

import junit.framework.Assert;

import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.FighterAttribute;
import nl.uva.saf.fdl.types.CharacteristicType;
import nl.uva.saf.simulation.FighterBot;

import org.junit.Test;

public class FighterBotTest {

	@Test
	public void getAttributesTest() {
		ArrayList<FighterAttribute> attributes = new ArrayList<FighterAttribute>();
		attributes.add(new Characteristic("punchPower", 2));
		Fighter fighter = new Fighter("getAttributesTest", attributes);		
		FighterBot bot = new FighterBot(fighter);
		
		Assert.assertEquals(bot.getAttribute(CharacteristicType.punchPower), 2);
		Assert.assertEquals(bot.getAttribute(CharacteristicType.kickPower), 5);
	}
	
	@Test
	public void calculateSpeedTest() {
		Fighter fighter = new Fighter("calculateSpeedTest", null);
		FighterBot bot = new FighterBot(fighter);
				
		// weight = (punchPower + kickPower) / 2 = (5 + 5) / 2 = 5
		// height = (punchReach + kickReach) / 2 = (5 + 5) / 2 = 5
		// speed = | 0.5*(height-weight) | = | 0.5*(5 - 5) | = 0
		
		Assert.assertEquals(0, bot.getSpeed());
	}
	
	@Test
	public void calculateSpeedTest2() {
		ArrayList<FighterAttribute> attributes = new ArrayList<FighterAttribute>();
		attributes.add(new Characteristic("punchPower", 2));
		attributes.add(new Characteristic("kickPower", 10));
		attributes.add(new Characteristic("punchReach", 2));
		attributes.add(new Characteristic("kickReach", 9));
		
		Fighter fighter = new Fighter("getAttributesTest", attributes);		
		FighterBot bot = new FighterBot(fighter);
		
		// weight = (punchPower + kickPower) / 2 = (2 + 10) / 2 = 6
		// height = (punchReach + kickReach) / 2 = (2 + 9) / 2 = 5.5
		// speed = | 0.5*(height-weight) | = | 0.5*(5.5 - 6) | = 0.25
		// But INT, so 0
		
		Assert.assertEquals(0, bot.getSpeed());
	}
	
	@Test
	public void calculateSpeedTest3() {
		ArrayList<FighterAttribute> attributes = new ArrayList<FighterAttribute>();
		attributes.add(new Characteristic("punchPower", 3));
		attributes.add(new Characteristic("kickPower", 7));
		attributes.add(new Characteristic("punchReach", 6));
		attributes.add(new Characteristic("kickReach", 10));
		
		Fighter fighter = new Fighter("getAttributesTest", attributes);		
		FighterBot bot = new FighterBot(fighter);
		
		// weight = (punchPower + kickPower) / 2 = (3 + 7) / 2 = 5
		// height = (punchReach + kickReach) / 2 = (6 + 10) / 2 = 8
		// speed = | 0.5*(height-weight) | = | 0.5*(8 - 5) | = 1.5
		// But INT, so 1
		
		Assert.assertEquals(1, bot.getSpeed());
	}
}
