package saf;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {

	/**
	 * @param args
	 * @throws RecognitionException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws RecognitionException, IOException {
		// TODO Auto-generated method stub
		String filePath = "D:\\SAF\\AntlrSAF\\src\\saf\\code.txt";
		CharStream charStream = new ANTLRFileStream(filePath) ;
		SAFLexer lexer = new SAFLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		parser.bot();
		System.out.println("ok");

	}

}
