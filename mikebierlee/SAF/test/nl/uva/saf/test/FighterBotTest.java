package nl.uva.saf.test;

import java.util.ArrayList;

import junit.framework.Assert;

import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.FighterAttribute;
import nl.uva.saf.simulation.FighterBot;

import org.junit.Test;

public class FighterBotTest {

	@Test
	public void getAttributesTest() {
		ArrayList<FighterAttribute> attributes = new ArrayList<FighterAttribute>();
		attributes.add(new Characteristic("punchPower", 2));
		Fighter fighter = new Fighter("getAttributesTest", attributes);		
		FighterBot bot = new FighterBot(fighter);
		
		Assert.assertEquals(bot.getAttribute("punchPower"), 2);
		Assert.assertEquals(bot.getAttribute("kickPower"), 5);
	}

}
