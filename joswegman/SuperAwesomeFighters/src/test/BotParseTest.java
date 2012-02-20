package test;

import static org.junit.Assert.*;

import java.io.IOException;

import grammar.SafLexer;
import grammar.SafParser;
import grammar.Evaluators.*;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.junit.Test;

public class BotParseTest {

	@Test
	public void testCheckerVisitor_MissingAlwaysKeyword() throws IOException,
			RecognitionException {
		String defaultpath = "/home/jos/workspace/SuperAwesomeFighters/src/safs/";
		ANTLRFileStream fileStream = new ANTLRFileStream(defaultpath
				+ "kicking-no-always.saf");
		SafLexer lexer = new SafLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SafParser parser = new SafParser(tokenStream);
		Bot b = parser.bot();
		BotChecker bc = new BotChecker();
		b.accept(bc);
		assertEquals(1, bc.getErrorMessages().size());
		assertEquals(bc.getErrorMessages().get(0),
				"There is no always condition");
	}

	@Test
	public void testCheckerVisitor_InvalidCondition() throws IOException,
			RecognitionException {
		String defaultpath = "/home/jos/workspace/SuperAwesomeFighters/src/safs/";
		ANTLRFileStream fileStream = new ANTLRFileStream(defaultpath
				+ "chicken-invalid-cond.saf");
		SafLexer lexer = new SafLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SafParser parser = new SafParser(tokenStream);
		Bot b = parser.bot();
		BotChecker bc = new BotChecker();
		b.accept(bc);
		assertEquals(1, bc.getErrorMessages().size());
		assertEquals(bc.getErrorMessages().get(0),
				"Condition: nar is not a valid condition");
	}

	@Test
	public void testCheckerVisitor_InvalidMove() throws IOException,
			RecognitionException {
		String defaultpath = "/home/jos/workspace/SuperAwesomeFighters/src/safs/";
		ANTLRFileStream fileStream = new ANTLRFileStream(defaultpath
				+ "chuck-invalid-move.saf");
		SafLexer lexer = new SafLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SafParser parser = new SafParser(tokenStream);
		Bot b = parser.bot();
		BotChecker bc = new BotChecker();
		b.accept(bc);
		assertEquals(1, bc.getErrorMessages().size());
		assertEquals(bc.getErrorMessages().get(0),
				"Inputrule:  walk_twards  is not valid!");
	}

	@Test
	public void testCheckerVisitor_OutOfBounds() throws IOException,
			RecognitionException {
		String defaultpath = "/home/jos/workspace/SuperAwesomeFighters/src/safs/";
		ANTLRFileStream fileStream = new ANTLRFileStream(defaultpath
				+ "challenging-outofbounds.saf");
		SafLexer lexer = new SafLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SafParser parser = new SafParser(tokenStream);
		Bot b = parser.bot();
		BotChecker bc = new BotChecker();
		b.accept(bc);
		assertEquals(1, bc.getErrorMessages().size());
		assertEquals(bc.getErrorMessages().get(0),
				"Character value : kickReach = 15 is not within range!");
	}
}
