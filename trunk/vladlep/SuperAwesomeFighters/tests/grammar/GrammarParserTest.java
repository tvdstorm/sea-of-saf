package grammar;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.junit.Test;

import fighter.Bot;
import fighter.Personality;

import reader.antlr.SAFLexer;
import reader.antlr.SAFParser;

public class GrammarParserTest {

	private SAFParser parser;

	public GrammarParserTest() {
		String inputFile = "." + File.separator + "tests" + File.separator
				+ "grammar" + File.separator + "fighters.txt";
		CharStream chStream = null;
		try {
			chStream = new ANTLRFileStream(inputFile);
		} catch (IOException e1) {
			fail("Could not find or read the grammar file");
		}
		SAFLexer lexer = new SAFLexer(chStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		parser = new SAFParser(tokenStream);

	}

	@Test
	public void parseNormalGrammar() throws RecognitionException {
		parser.fighter();

	}

	@Test
	public void testNameAssignment() throws RecognitionException {
		Bot fighter = parser.fighter();
		assertEquals("JackieChan", fighter.getName());
	}

	@Test
	public void testCaracteristic() throws RecognitionException {
		Bot fighter = parser.fighter();
		Personality personality = fighter.getPersonality();

		assertEquals(7, personality.getKickPower());
		assertEquals(3, personality.getKickReach());
		assertEquals(5, personality.getPunchPower());
		assertEquals(9, personality.getPunchReach());

	}
}
