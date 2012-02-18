package saf.parser;

import static org.junit.Assert.*;
import org.junit.Test;

import saf.ast.ASTNode;
import saf.ast.Fighter;
import saf.ast.condition.AndOperator;
import saf.ast.condition.Condition;
import saf.ast.condition.LogicalCondition;
import saf.ast.condition.OrOperator;
import saf.ast.definition.Behaviour;
import saf.ast.definition.Strength;
import safparser.*;
import java.io.*;

public class ParserTest {

	@Test
	public void testWellformedSpecification() {
		String specification = "JackieChan {\r\n" +
							   "	someStrength = 0\r\n" +
							   "	anotherStrength = 11\r\n" +
							   "	someCondition [someMoveAction someFightAction]\r\n" +
							   "	someCondition [someAction(someAction1 someAction2 someAction3)" +
							   "				   moreAction(fight(kick punch block) superhero(fly crawl))]\r\n" +
							   "}";
		ByteArrayInputStream input = new ByteArrayInputStream(specification.getBytes());
		Parser parser = new Parser(input);
		
		try {
			parser.Root();
		}
		catch ( ParseException ex ) {
			fail("ParseException should not have occurred");
		}
	}

	private Fighter getFighterAst(String specification) {
		ByteArrayInputStream input = new ByteArrayInputStream(specification.getBytes());
		Parser parser = new Parser(input);
		try {
			parser.Root();
			return parser.getFighter();
		}
		catch (ParseException exception) {
			fail("ParseException not expected");
			return null;
		}
	}
	
	@Test
	public void testFighterAndPredenceOverOr() {
		String specification =	"JackieChan {" +
								"	always or near and far [ choose(a b) c ]" +
								"	stronger and weaker or near [ choose(a b) c ]" +
								"	(weaker and stronger) or near [ choose(a b) c ]" +
								"}";
		
		Fighter fighter = getFighterAst(specification);
		assertEquals(3, fighter.getDefinitions().size());
		
		for (ASTNode node: fighter.getDefinitions()) {
			assertEquals(Behaviour.class, node.getClass());
			Behaviour behaviour = (Behaviour)node;
			assertEquals(OrOperator.class, behaviour.getCondition().getClass());
		}
	}
	
	@Test
	public void testFighterParenthesis() {
		String specification = 	"BruceLee { (stronger or weaker) and (stronger and weaker) [jump kickHigh] }";
		
		Fighter fighter = getFighterAst(specification);
		assertEquals(1, fighter.getDefinitions().size());
		
		Behaviour behaviour = (Behaviour)fighter.getDefinitions().get(0);
		assertEquals(AndOperator.class, behaviour.getCondition().getClass());
		
		AndOperator andOperator = (AndOperator)behaviour.getCondition();
		assertEquals(OrOperator.class, andOperator.getLeftExpression().getClass());
		assertEquals(AndOperator.class, andOperator.getRightExpression().getClass());
	}
	
	@Test
	public void testFighterBehaviourExpressions() {
		String specification = 	"JetLi {" +
								"	stronger [jump kickLow]" +
								"	stronger and stronger [jump kickLow]" +
								"	stronger or stronger [jump kickLow]" +
								"	(stronger) [jump kickLow]" +
								"	(stronger and stronger) [jump kickLow]" +
								"	(stronger) and stronger [jump kickLow]" +
								"	(stronger) or stronger [jump kickLow]" +
								"}";
		
		Fighter fighter = getFighterAst(specification);
		assertEquals(7, fighter.getDefinitions().size());
	}
}
