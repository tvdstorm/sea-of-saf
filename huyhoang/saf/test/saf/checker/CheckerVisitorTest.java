package saf.checker;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import saf.checker.CheckerVisitor;
import saf.ast.*;
import safparser.Parser;
import safparser.ParseException;
import saf.ast.definition.Strength;

public class CheckerVisitorTest {
	protected CheckerVisitor checkParsedSpecification(String specification) {
		ByteArrayInputStream input = new ByteArrayInputStream(specification.getBytes());
		Parser parser = new Parser(input);
		try {
			parser.Root();
			CheckerVisitor visitor = new CheckerVisitor(parser.getFighter());
			visitor.visitAllAstStatements();
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
		assertTrue(visitor.getErrors().get(0).matches("The choose keyword requires at least 1 action"));
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
			checker.checkAssignmentStatementRange(strengthAssignment);
			
			if (strength < 11) {
				assertEquals(1, checker.getErrors().size());
			}
			else if (strength == 11) {
				assertEquals(2, checker.getErrors().size());
			}
		}
	}
}
