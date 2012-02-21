package core;

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import parser.SAFLexer;
import parser.SAFParser;
import data.Fighter;

public class FighterLoader {

	public Fighter loadFighterByFile(String filename) {
		
		try {
			CharStream inputStream = new ANTLRFileStream(filename);
			
			SAFLexer lexer = new SAFLexer(inputStream);

			TokenStream tokenStream = new CommonTokenStream(lexer);
			SAFParser parser = new SAFParser(tokenStream);

			try {
				Fighter fighter = parser.fighter();
				return fighter;
			} catch (RecognitionException exc) {
				exc.printStackTrace();
			}
		} catch (IOException exc) {
			exc.printStackTrace();
		}
		return null;
		
	}

}
