package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import model.Fighter;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import Parser.safLexer;
import Parser.safParser;

public class FighterCompiler {

	public Fighter compileFighter(FileInputStream file) throws IOException, RecognitionException{
		InputStream inputStream = file;
		ANTLRInputStream input = new ANTLRInputStream(inputStream);
		safLexer lexer = new safLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		safParser parser = new safParser(tokens);
		safParser.fighter_return result = parser.fighter();
		Fighter fighter = result.fighter;
		return fighter;
	}
}
