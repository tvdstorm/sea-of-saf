package saf.parser;

import static org.junit.Assert.*;
import org.junit.Test;

import saf.ast.ASTNode;
import saf.ast.Fighter;
import saf.ast.condition.AndOperator;
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
	public void testFighterAndOrPrecedence() {
		String specification =	"JackieChan {" +
								"always or near and far [ choose(a b) c ]" +
								"stronger and weaker or near [ choose(a b) c ]" +
								"(weaker and stronger) or near [ choose(a b) c ] }";
		
		specification =	"JackieChan {" +
						"stronger and weaker or near [ choose(a b) c ] }";
		
		Fighter fighter = getFighterAst(specification);
		assertEquals(1, fighter.getDefinitions().size());
		
		for (ASTNode node: fighter.getDefinitions()) {
			assertEquals(Behaviour.class, node.getClass());
			Behaviour behaviour = (Behaviour)node;
			assertEquals(OrOperator.class, behaviour.getCondition().getClass());
		}
	}
}
