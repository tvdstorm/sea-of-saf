import java.io.IOException;

import org.antlr.runtime.*;

public class SAF {

	/**
	 * @param args
	 * @throws RecognitionException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws RecognitionException, IOException, NullPointerException {
	

		ANTLRFileStream fstream = new ANTLRFileStream("c:\\Antlr\\SAF\\chicken.saf");

		SAFLexer lexer = new SAFLexer(fstream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream); 
		Fighter fighter = parser.fighter();
		fighter.outputData();
	}
}