package saf.parser;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

import saf.entities.FightActionType;
import saf.entities.MoveActionType;
import saf.parser.SAFParser.prog_return;

public class ErrorHandlingSAFParserTest {
	
	private ErrorHandlingSAFParser getParser(String toParse) throws IOException
	{
		ByteArrayInputStream stream = new ByteArrayInputStream(toParse.getBytes());
		ANTLRInputStream input = new ANTLRInputStream(stream);
		
		SAFLexer lexer = new ErrorHandlingSAFLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		
		return new ErrorHandlingSAFParser(token);
	}

	@Test
	public void testProg() throws Exception {
		final String program = "testname {\nkickReach  = 9\nnear [crouch punch_low]\n}";
		ErrorHandlingSAFParser parser = getParser(program);
		
		prog_return result = parser.prog();
		Tree tree = (Tree) result.getTree();
		
		assertEquals(3, tree.getChildCount());
		assertEquals("testname", tree.getChild(0).getText());
	}

	@Test
	public void testAssignment() throws Exception {
		final String[] assignmentVariables = {"punchReach", "kickReach", "kickPower" , "punchPower"};
		final String[] formats = {"%1s = %2d", "%1s=\t%2d", "%1s\n=  \n%2d"};
		
		for (String assignmentVariable : assignmentVariables) {
			for (int i = 1; i <= 10; i++) {
				for (String format : formats) {
					ErrorHandlingSAFParser parser = getParser(String.format(format, assignmentVariable, i));
					SAFParser.assignment_return result = parser.assignment();
					
					Tree tree = (Tree) result.getTree();
					
					assertEquals(2, tree.getChildCount());
					assertEquals(assignmentVariable, tree.getChild(0).getText());
					assertEquals(Integer.toString(i), tree.getChild(1).getText());					
				}
			}
		}
	}

	@Test
	public void testAction() throws Exception {
		final MoveActionType[] moveActions = MoveActionType.class.getEnumConstants();
		final FightActionType[] fightActions = FightActionType.class.getEnumConstants();
		final String[] formats = {"%1s [%2s %3s]", "%1s\t\t[%2s %3s]", "%1s [ %2s %3s ]"};
		final String condition = "always";
		
		for(MoveActionType moveAction : moveActions) {
			for (FightActionType fightAction : fightActions) {
				for (String format : formats) {
					ErrorHandlingSAFParser parser = getParser(String.format(format, condition, moveAction.toString(), fightAction.toString()));
					SAFParser.action_return result = parser.action();
					
					Tree tree = (Tree) result.getTree();
					assertEquals(3, tree.getChildCount());
					assertEquals(moveAction.toString(), tree.getChild(1).getText());
					assertEquals(fightAction.toString(), tree.getChild(2).getText());
				}
			}
		}
		
	}
}
