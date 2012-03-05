package safcr.test;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.ANTLRStringStream;

import safcr.ast.*;
import safcr.parser.SAFGrammarLexer;
import safcr.parser.SAFGrammarParser;

public class Test {

	public static void main(String[] args) throws RecognitionException, IOException {
		String testFile = System.getProperty("user.dir") + "\\src\\safcr\\test\\test.saf";
		ANTLRFileStream fileStream = new ANTLRFileStream(testFile);
		CharStream charStream = new ANTLRStringStream(fileStream.toString());
		SAFGrammarLexer lexer = new SAFGrammarLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFGrammarParser parser = new SAFGrammarParser(tokenStream);
			
		Saf tree = parser.saf();
		//TreePrinter printer = new TreePrinter();
		//tree.accept(printer);
		
		CheckData cd = new CheckData();
		tree.accept(cd);
		cd.printErrors();
	}

}
