package saf.parser;

import static org.junit.Assert.*;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import saf.entities.Bot;


public class BotParserTest {
	BotParser botParser;

	@Before
	public void setUp() throws Exception {
		botParser = new BotParser();
	}
	
	private Tree getTextNode(int type, String text)
	{
		Token t = new CommonToken(type, text);
		return new CommonTree(t);
	}

	@Test
	public void testParseBot() throws BotDefinitionMalformedException {
		final String botname = "testname";
		CommonTree tree = new CommonTree();
		tree.addChild(getTextNode( SAFParser.NAME, botname));
		
		CommonTree assignmentTree = new CommonTree(new CommonToken(SAFParser.ASSIGNMENT));
		assignmentTree.addChild(getTextNode(0, "punchReach"));
		assignmentTree.addChild(getTextNode(0, "10"));
		
		tree.addChild(assignmentTree);
		
		Bot result = botParser.walkBotTree(tree);
		
		assertEquals(botname, result.getName());
		assertEquals(10, result.getPunchReach());
		
		assertEquals("test default value", 5, result.getKickPower());
	}

}
