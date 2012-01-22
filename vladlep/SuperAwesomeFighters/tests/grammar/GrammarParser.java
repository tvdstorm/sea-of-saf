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

import reader.antlr.SAFLexer;
import reader.antlr.SAFParser;

public class GrammarParser {

	@Test
	public void parseNormalGrammar() {
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
		SAFParser parser = new SAFParser(tokenStream);
		try {
			parser.fighter();
		} catch (RecognitionException e) {
			fail("Could not parse correcltly the grammar");
		}

	}

}
