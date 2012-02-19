package utils;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;

import reader.antlr.SAFLexer;
import reader.antlr.SAFParser;

public class TestUtils {

	public static SAFParser getParserForFile(String fileName) {
		SAFParser parser;
		String inputFile = "." + File.separator + "tests" + File.separator
				+ "inputFiles" + File.separator + fileName;
		CharStream chStream = null;
		try {
			chStream = new ANTLRFileStream(inputFile);
		} catch (IOException e1) {
			fail("Could not find or read the grammar file");
		}
		SAFLexer lexer = new SAFLexer(chStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		parser = new SAFParser(tokenStream);
		return parser;
	}

}
