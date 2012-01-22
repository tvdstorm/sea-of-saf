package test;

import reader.antlr.SAFLexer;
import reader.antlr.SAFParser;

import java.io.File;
import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {

	public static void main(String[] args) throws RecognitionException,
			IOException {
		String inputFile = "." + File.separator + "fighters.txt";
		CharStream chStream = new ANTLRFileStream(inputFile);
		SAFLexer lexer = new SAFLexer(chStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		parser.rule();
		System.out.println("succes");
	}
}
