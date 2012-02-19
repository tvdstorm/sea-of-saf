package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import game.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import ast.AtomType;
import ast.AttackAtom;
import ast.Behaviour;
import ast.ConditionAtom;
import ast.MoveAtom;
import ast.Saf;

public class EvaluatorTest {
	private  Saf testSaf;
	private  Map<AtomType, Boolean> conditions;
	private Behaviour b;
	
	private void assertBehaviour(Behaviour b, MoveAtom.Type m, AttackAtom.Type a) {
		assertEquals(b.getMove().getType(),m);
		assertEquals(b.getAttack().getType(), a);
	}

	private void assertNotBehaviour(Behaviour b, MoveAtom.Type m, AttackAtom.Type a) {
		assertFalse(b.getMove().getType() ==  m);
		assertFalse(b.getAttack().getType() == a);
	}

	@Before 
	public void setup() {
		List<String> messages = new ArrayList<String>();
		testSaf = null;
		b = null;
				
		testSaf = Main.loadSafFromFile("data/boolchecker.fdl");
		testSaf.validate(messages);		
		
		conditions = new HashMap<AtomType, Boolean>();
	}
	
	@Test
	public void testAnd() {
		// far and weaker [crouch kick_high]
		conditions.put(ConditionAtom.Type.MUCH_WEAKER, true);
		conditions.put(ConditionAtom.Type.WEAKER, true);
		b = testSaf.getMatchingBehaviour(conditions);

		assertBehaviour(b, MoveAtom.Type.CROUCH, AttackAtom.Type.KICK_HIGH);
		
		conditions.put(ConditionAtom.Type.MUCH_WEAKER, true);
		conditions.put(ConditionAtom.Type.WEAKER, false);
		try {
			b = testSaf.getMatchingBehaviour(conditions);
			assertNotBehaviour(b, MoveAtom.Type.CROUCH, AttackAtom.Type.KICK_HIGH);
		} catch (Exception e) {
			// no behaviour, normally this should be an error, but this Saf has no always rule
		}

		conditions.put(ConditionAtom.Type.MUCH_WEAKER, false);
		conditions.put(ConditionAtom.Type.WEAKER, true);
		try {
			b = testSaf.getMatchingBehaviour(conditions);
			assertNotBehaviour(b, MoveAtom.Type.CROUCH, AttackAtom.Type.KICK_HIGH);
		} catch (Exception e) {
			// no behaviour, normally this should be an error, but this Saf has no always rule
		}

		conditions.put(ConditionAtom.Type.MUCH_WEAKER, false);
		conditions.put(ConditionAtom.Type.WEAKER, false);
		try {
			b = testSaf.getMatchingBehaviour(conditions);
			assertNotBehaviour(b, MoveAtom.Type.CROUCH, AttackAtom.Type.KICK_HIGH);
		} catch (Exception e) {
			// no behaviour, normally this should be an error, but this Saf has no always rule
		}

	}
	
	@Test
	public void testOr() {
		// near or far [run_towards kick_low]
		conditions.put(ConditionAtom.Type.NEAR, true);
		conditions.put(ConditionAtom.Type.FAR, false);
		b = testSaf.getMatchingBehaviour(conditions);
		
		assertBehaviour(b, MoveAtom.Type.RUN_TOWARDS, AttackAtom.Type.KICK_LOW);
		
		conditions.put(ConditionAtom.Type.NEAR, false);
		conditions.put(ConditionAtom.Type.FAR, true);
		b = testSaf.getMatchingBehaviour(conditions);
		
		assertBehaviour(b, MoveAtom.Type.RUN_TOWARDS, AttackAtom.Type.KICK_LOW);

		conditions.put(ConditionAtom.Type.NEAR, true);
		conditions.put(ConditionAtom.Type.FAR, true);
		b = testSaf.getMatchingBehaviour(conditions);
		
		assertBehaviour(b, MoveAtom.Type.RUN_TOWARDS, AttackAtom.Type.KICK_LOW);

		conditions.put(ConditionAtom.Type.NEAR, false);
		conditions.put(ConditionAtom.Type.FAR, false);
		try {
			b = testSaf.getMatchingBehaviour(conditions);
			assertNotBehaviour(b, MoveAtom.Type.RUN_TOWARDS, AttackAtom.Type.KICK_LOW);
		} catch (Exception e) {
			// no behaviour, normally this should be an error, but this Saf has no always rule
		}
		
	}

	@Test
	public void testOrAnd() {
		// even or stronger and much_weaker [jump punch_low] 
		conditions.put(ConditionAtom.Type.EVEN, true);
		conditions.put(ConditionAtom.Type.STRONGER, true);
		conditions.put(ConditionAtom.Type.MUCH_WEAKER, true);
		b = testSaf.getMatchingBehaviour(conditions);

		assertBehaviour(b, MoveAtom.Type.JUMP, AttackAtom.Type.PUNCH_LOW);
		
		conditions.put(ConditionAtom.Type.EVEN, true);
		conditions.put(ConditionAtom.Type.STRONGER, false);
		conditions.put(ConditionAtom.Type.MUCH_WEAKER, false);
		b = testSaf.getMatchingBehaviour(conditions);
		
		assertBehaviour(b, MoveAtom.Type.JUMP, AttackAtom.Type.PUNCH_LOW);
		
		conditions.put(ConditionAtom.Type.EVEN, true);
		conditions.put(ConditionAtom.Type.STRONGER, true);
		conditions.put(ConditionAtom.Type.MUCH_WEAKER, false);
		b = testSaf.getMatchingBehaviour(conditions);
		
		assertBehaviour(b, MoveAtom.Type.JUMP, AttackAtom.Type.PUNCH_LOW);
		
		conditions.put(ConditionAtom.Type.EVEN, true);
		conditions.put(ConditionAtom.Type.STRONGER, false);
		conditions.put(ConditionAtom.Type.MUCH_WEAKER, true);
		b = testSaf.getMatchingBehaviour(conditions);
		
		assertBehaviour(b, MoveAtom.Type.JUMP, AttackAtom.Type.PUNCH_LOW);
		
		conditions.put(ConditionAtom.Type.EVEN, false);
		conditions.put(ConditionAtom.Type.STRONGER, true);
		conditions.put(ConditionAtom.Type.MUCH_WEAKER, true);
		b = testSaf.getMatchingBehaviour(conditions);
		
		assertBehaviour(b, MoveAtom.Type.JUMP, AttackAtom.Type.PUNCH_LOW);
		
		conditions.put(ConditionAtom.Type.EVEN, false);
		conditions.put(ConditionAtom.Type.STRONGER, false);
		conditions.put(ConditionAtom.Type.MUCH_WEAKER, false);
		try {
			b = testSaf.getMatchingBehaviour(conditions);
			assertNotBehaviour(b, MoveAtom.Type.JUMP, AttackAtom.Type.PUNCH_LOW);
		} catch (Exception e) {
			// no behaviour, normally this should be an error, but this Saf has no always rule
		}
		
		conditions.put(ConditionAtom.Type.EVEN, false);
		conditions.put(ConditionAtom.Type.STRONGER, true);
		conditions.put(ConditionAtom.Type.MUCH_WEAKER, false);
		try {
			b = testSaf.getMatchingBehaviour(conditions);
			assertNotBehaviour(b, MoveAtom.Type.JUMP, AttackAtom.Type.PUNCH_LOW);
		} catch (Exception e) {
			// no behaviour, normally this should be an error, but this Saf has no always rule
		}

		conditions.put(ConditionAtom.Type.EVEN, false);
		conditions.put(ConditionAtom.Type.STRONGER, false);
		conditions.put(ConditionAtom.Type.MUCH_WEAKER, true);
		try {
			b = testSaf.getMatchingBehaviour(conditions);
			assertNotBehaviour(b, MoveAtom.Type.JUMP, AttackAtom.Type.PUNCH_LOW);
		} catch (Exception e) {
			// no behaviour, normally this should be an error, but this Saf has no always rule
		}		
	}

}
