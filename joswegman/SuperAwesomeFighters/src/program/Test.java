package program;
import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.*;

import grammar.SafLexer;
import grammar.SafParser;
import grammar.Evaluators.*;


public class Test {

	
	public static void main(String[] args) throws RecognitionException, IOException {
		ANTLRFileStream fileStream = new ANTLRFileStream ("/home/jos/workspace/SuperAwesomeFighters/src/program/Sample.saf");
		SafLexer lexer = new SafLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SafParser parser = new SafParser(tokenStream);
		Bot b = parser.bot();
		b.accept(new BotChecker());
		
		ANTLRFileStream fileStream1 = new ANTLRFileStream("/home/jos/workspace/SuperAwesomeFighters/src/program/Test.saf");
		SafLexer lexer1 = new SafLexer(fileStream1);
		TokenStream tokenStream1 = new CommonTokenStream(lexer1);
		SafParser parser1 = new SafParser(tokenStream1);
		Bot b1 = parser1.bot();
		b1.accept(new BotChecker());
	}

}
