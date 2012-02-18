package saf.checker;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import saf.checker.CheckerVisitor;
import saf.ast.*;
import saf.parser.Parser;
import saf.parser.ParseException;
import saf.ast.condition.Condition;
import saf.ast.definition.Action;
import saf.ast.definition.Behaviour;
import saf.ast.definition.Procedure;
import saf.ast.definition.Strength;

public class CheckerVisitorTest {
	private CheckerVisitor checkParsedSpecification(String specification) {
		ByteArrayInputStream input = new ByteArrayInputStream(specification.getBytes());
		Parser parser = new Parser(input);
		try {
			parser.Root();
			CheckerVisitor visitor = new CheckerVisitor(parser.getFighter());
			visitor.visitAllASTNodes();
			return visitor;
		}
		catch (ParseException ex) {
			fail("ParseException should not have occurred");
			return null;
		}
	}
	
	@Test
	public void testCheckerVisitor_MissingAlwaysKeyword() {
		String specification = "Huy {}";
		CheckerVisitor visitor = checkParsedSpecification(specification);
		assertEquals(1, visitor.getErrors().size());
		assertEquals(visitor.getErrors().get(0), "The condition 'always' is obliged and must be defined!");
	}
	
	@Test
	public void testCheckerVisitor_InvalidStrength() {
		String specification = "Huy { kickPowa = 10 always [ jump punch_high ] }";
		CheckerVisitor visitor = checkParsedSpecification(specification);
		assertEquals(1, visitor.getErrors().size());
		assertEquals(visitor.getErrors().get(0), "Undefined strength 'kickPowa'");
	}
	
	@Test
	public void testCheckerVisitor_InvalidCondition() {
		String specification = "Huy { super_strong [ jump punch_high ] always [ jump punch_high ] }";
		CheckerVisitor visitor = checkParsedSpecification(specification);
		assertEquals(1, visitor.getErrors().size());
		assertTrue(visitor.getErrors().get(0).matches("Condition 'super_strong' is invalid"));
	}
	
	@Test
	public void testCheckerVisitor_EmptyChoose() {
		String specification = "Huy { always [ choose punch_high ] }";
		CheckerVisitor visitor = checkParsedSpecification(specification);
		assertEquals(1, visitor.getErrors().size());
		assertTrue(visitor.getErrors().get(0).matches("The 'choose' keyword requires at least 1 action as its parameter"));
	}
	
	@Test
	public void testCheckerVisitor_InvalidActionOrder() {
		String specification = "Huy { always [ punch_high jump ] }";
		CheckerVisitor visitor = checkParsedSpecification(specification);
		assertEquals(2, visitor.getErrors().size());
		assertTrue(visitor.getErrors().get(0).matches("'punch_high' is a 'attack' keyword. A 'choose' keyword or 'move' keyword was expected"));
		assertTrue(visitor.getErrors().get(1).matches("'jump' is a 'move' keyword. A 'choose' keyword or 'attack' keyword was expected"));
	}
	
	@Test
	public void testWellformedSpecification() {
		String specification = "JackieChan {\r\n" +
				   "	kickPower = 10\r\n" +
				   "	always [ jump punch_high ]\r\n" +
				   "	always or always [ jump punch_high ]\r\n" +
				   "}";
		
		ByteArrayInputStream input = new ByteArrayInputStream(specification.getBytes());
		Parser parser = new Parser(input);
		
		try {
			parser.Root();
		}
		catch (ParseException ex) {
			fail("ParseException should not have occurred");
		}
		
		CheckerVisitor visitor = new CheckerVisitor(parser.getFighter());
		assertEquals(0, visitor.getErrors().size());
	}
	
	@Test
	public void testCheckAssignmentStatementRange() {
		Fighter fighter = new Fighter("JackieChan");
		CheckerVisitor checker = new CheckerVisitor(fighter);
		
		assertEquals(0, checker.getErrors().size());
		
		for (int strength = 0; strength < 12; strength++) {
			Strength strengthAssignment = new Strength("invariant", strength);
			checker.checkAssignmentRange(strengthAssignment);
			
			if (strength < 11) {
				assertEquals(1, checker.getErrors().size());
			}
			else if (strength == 11) {
				assertEquals(2, checker.getErrors().size());
			}
		}
	}
	
	@Test
	public void testInvalidActionNode() {
		Fighter fighter = new Fighter("TerranGhost");
		
		Condition condition = new Condition("always");
		Procedure move = new Action("jump");
		move.getProcedures().add(new Action("very high"));
		Procedure attack = new Action("kickHigh");
		Behaviour behaviour = new Behaviour(condition, move, attack);
		fighter.getDefinitions().add(behaviour);
		
		CheckerVisitor checker = new CheckerVisitor(fighter);
		checker.visitAllASTNodes();
		
		assertEquals(1, checker.getErrors().size());
		
		assertTrue(checker.getErrors().get(0).matches("The action 'jump' does not accept any parameters"));
	}
}
