package saf.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import saf.Config;
import saf.Main;
import saf.ast.action.Action;
import saf.ast.action.FightAction;
import saf.ast.action.MoveAction;
import saf.ast.fighter.Characteristic;
import saf.ast.fighter.Fighter;
import saf.ast.fighter.Personality;
import saf.ast.util.SemanticCheckVisitor;
import saf.check.Message;

public class Tester extends TestCase {
	Fighter testFighter = Main.loadFighterFromFile("tester.saf");
	
	@Test
	public void testSemanticFighter() {
		Fighter fighter = Main.loadFighterFromFile("jackiechan.saf");
		List<Message> messages = SemanticCheckVisitor.checkFighter(fighter);

		assertEquals(0, messages.size());
	}
	
	@Test
	public void testPersonality() {
		List<Characteristic> characteristics = new ArrayList<Characteristic>();
		characteristics.add(new Characteristic(Config.PUNCH_POWER, 8));
		Personality p = new Personality(characteristics);
		
		assertEquals(p.getPunchPower(), 8);
	}
	
	@Test
	public void testSpeed() {
		List<Characteristic> characteristics = new ArrayList<Characteristic>(Arrays.asList(
				new Characteristic(Config.KICK_POWER, 8),
				new Characteristic(Config.KICK_REACH, 4),
				new Characteristic(Config.PUNCH_POWER, 6),
				new Characteristic(Config.PUNCH_REACH, 2)));
		Personality p = new Personality(characteristics);
		
		double height = (4 + 2) / 2;
		double weight = (6 + 8) / 2;
		double speed = Math.abs(0.5 * (height - weight));
		
		assertEquals(p.getSpeed(), speed);
	}
	
	@Test
	public void testFightAction() {
		Action action = new FightAction(Config.STRIKES.get(1));
		
		assertTrue(Config.STRIKES.contains(action.getAction()));
	}
	
	@Test
	public void testMoveAction() {
		Action walkAway = new MoveAction("walk_away");
		
		assertTrue(Config.MOVES.contains(walkAway.getAction()));
	}
	
	@Test
	public void testSemanticsPersonality() {
		List<Message> messages = SemanticCheckVisitor.checkFighter(testFighter);
		
		assertEquals("ERROR: Puchpower outside valid range", messages.get(0).toString().trim());
		assertEquals("ERROR: Kickpower outside valid range", messages.get(1).toString().trim());
	}
	
	@Test public void testConditionClauses() {
		saf.ast.condition.Condition condition1 = testFighter.getBehaviour().getRules().get(0).getCondition();
		saf.ast.condition.Condition condition2 = testFighter.getBehaviour().getRules().get(1).getCondition();
		saf.ast.condition.Condition condition3 = testFighter.getBehaviour().getRules().get(2).getCondition();
		saf.ast.condition.Condition condition4 = testFighter.getBehaviour().getRules().get(3).getCondition();
		
		assertEquals("(far or near) and (weaker or much_stronger)", condition1.toString());
		assertEquals("(near or far) and stronger", condition2.toString());
		assertEquals("(far or near) and (much_weaker or much_weaker)", condition3.toString());
		assertEquals("near or far or weaker", condition4.toString());
	}
}
