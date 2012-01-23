import java.io.IOException;

import org.antlr.runtime.*;

public class SAF {

	/**
	 * @param args
	 * @throws RecognitionException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws RecognitionException, IOException {
	

		ANTLRFileStream fstream = new ANTLRFileStream("c:\\Antlr\\chicken.saf");

		SAFLexer lexer = new SAFLexer(fstream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream); 
		parser.fighter();
		System.out.println();  
	}

}