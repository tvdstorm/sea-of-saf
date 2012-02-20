package test;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {

	/**
	 * @param args
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws RecognitionException {
		
		CharStream charStream = new ANTLRStringStream("program XLSample1 =\r\n" + 
				"begin\r\n" + 
				"end XLSample1.");
		XLLexer lexer = new XLLexer(charStream);
		
		TokenStream tokenStream = new CommonTokenStream(lexer);
		XLParser parser = new XLParser(tokenStream);
		parser.program();
		System.out.println("done");
		
		

	}

}
