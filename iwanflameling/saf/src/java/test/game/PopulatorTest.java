/**
 * 
 */
package game;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ast.action.Action;
import ast.action.SimpleAction;
import ast.condition.And;
import ast.condition.Leaf;
import ast.condition.Or;
import ast.fighter.Behavior;
import ast.fighter.Fighter;
import ast.fighter.FighterProp;

/**
 * @author iwan
 *
 */
public class PopulatorTest {
	
	Populator populator;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		populator = new Populator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link game.Populator#populate(java.util.Set, game.FighterAI)}.
	 */
	@Test
	public void testPopulate() {
		//fail("Not yet implemented");
		Set<String> conditions = createConditions_FarAndMuchStronger();
		List<FighterProp> properties = createProp_Far_MuchStrongerAndFar();
		
		Fighter ast = new Fighter("TestIwan", properties);
		FighterAI fighter = new FighterAI(ast, 0);
		
		List<Set<String>> expecteds = new ArrayList<Set<String>>();
		expecteds.add(new HashSet<String>(Arrays.asList("far")));
		expecteds.add(new HashSet<String>(Arrays.asList("far", "much_stronger")));
		List<Set<String>> actuals = populator.populate(conditions, fighter);
		
		assertArrayEquals(expecteds.toArray(), actuals.toArray());
	}
	
	private Set<String> createConditions_FarAndMuchStronger(){
		Set<String> conditions = new HashSet<String>();
		conditions.add("far");
		conditions.add("much_stronger");
		return conditions;
	}
	
	private List<FighterProp> createProp_Far_MuchStrongerAndFar(){
		Action moveAction = new SimpleAction("run_towards");
		Action fightAction = new SimpleAction("kick");
		
		List<FighterProp> properties = new ArrayList<FighterProp>();
		properties.add(new Behavior(
				new Leaf("far"), moveAction, fightAction));
		properties.add(new Behavior(
				new And(new Leaf("much_stronger"),
				new Or(new Leaf("far"),
						new And(new Leaf("stronger"),
								new Leaf("near")))), moveAction, fightAction));
		return properties;
	}

}
