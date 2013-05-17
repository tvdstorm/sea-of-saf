package game;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ast.fighter.Fighter;
import ast.fighter.FighterProp;
import ast.fighter.Strength;

public class SpeedCalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEqualEverything() {
		//fail("Not yet implemented");
		Fighter ast = createFighterAst(5,5,5,5);
		FighterAI fighter = new FighterAI(ast, 0);
		long speed = fighter.calculateSpeed();
		long expected = Math.round((0.5*(((5+5)/2)-((5 + 5)/2))));
		assertEquals(expected, speed);
	}
	@Test
	public void testNotBelowZero(){
		Fighter ast = createFighterAst(10,10,1,1);
		FighterAI fighter = new FighterAI(ast, 0);
		long speed = fighter.calculateSpeed();
		assertFalse("speed seems to be below zero: " + speed, speed < 0);
		
	}
	
	private Fighter createFighterAst(int kickPower, int punchPower, int kickReach, int punchReach){
		List<FighterProp> properties = new ArrayList<FighterProp>();
		properties.add(new Strength("kickPower", kickPower));
		properties.add(new Strength("punchPower", punchPower));
		properties.add(new Strength("kickReach", kickReach));
		properties.add(new Strength("punchReach", punchReach));
		Fighter fighter = new Fighter("speedtestAST", properties);
		return fighter;
	}

}
