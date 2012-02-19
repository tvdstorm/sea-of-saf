package safcr.test;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.ANTLRStringStream;

import safcr.antlr.SAFGrammarLexer;
import safcr.antlr.SAFGrammarParser;
import safcr.ast.*;

public class Test {

	public static void main(String[] args) throws RecognitionException, IOException {
		String testFile = System.getProperty("user.dir") + "\\src\\safcr\\test\\test.saf";
		ANTLRFileStream fileStream = new ANTLRFileStream(testFile);
		CharStream charStream = new ANTLRStringStream(fileStream.toString());
		SAFGrammarLexer lexer = new SAFGrammarLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFGrammarParser parser = new SAFGrammarParser(tokenStream);
			
		Node tree = parser.saf();
		//System.out.println(tree.toTreeString(""));
		
		for(String error : tree.getErrors()){
			System.err.println(error);
		}
	}

}
