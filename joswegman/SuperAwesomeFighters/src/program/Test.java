package program;
import java.io.IOException;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.*;

import grammar.SafLexer;
import grammar.SafParser;
import grammar.Evaluators.*;

public class Test  {
    /*mogelijke safs
     * all-wrong.saf
     * challenging-outofbounds.saf
     * challenging.saf
     * chicken-invalid-condition.saf
     * chicken.saf
     * chuck-invalid-move.saf
     * chuck.saf
     * jackie.saf
     * jackie-invalid-fight.saf
     * kicking-no-always.saf
     * unbeatable-warning.saf
     * unbeatable.saf
     * Sample.saf
     * Test.saf
	*/  
	public static void main(String[] args) throws RecognitionException, IOException {
		String defaultpath = "/home/jos/workspace/SuperAwesomeFighters/src/safs/";
		
		ANTLRFileStream fileStream = new ANTLRFileStream (defaultpath + "unbeatable-warning.saf");
		SafLexer lexer = new SafLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SafParser parser = new SafParser(tokenStream);
		Bot b = parser.bot();
		b.accept(new BotChecker());
		
		ANTLRFileStream fileStream1 = new ANTLRFileStream(defaultpath + "chuck.saf");
		SafLexer lexer1 = new SafLexer(fileStream1);
		TokenStream tokenStream1 = new CommonTokenStream(lexer1);
		SafParser parser1 = new SafParser(tokenStream1);
		Bot b1 = parser1.bot();
		b1.accept(new BotChecker());
		b1.toString();
		
	}

}
