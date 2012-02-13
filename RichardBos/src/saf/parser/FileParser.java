package saf.parser;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import saf.parser.SAFParser.bots_return;
import saf.structure.Bots;

public class FileParser {
	public static Bots consume(String path) throws IOException
	{
		SAFLexer lexer;

		lexer = new SAFLexer(new ANTLRFileStream(path));

		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		SAFParser parser = new SAFParser(tokens);
		
		Bots bots = null;
		try {
			bots_return _bots = parser.bots();
			bots = _bots.bots;
		} catch (RecognitionException ex) {
			ex.printStackTrace();
			return null;
		}
		
		return bots;
	}
}
