package nl.tamasja.uva.saf.tree;

import java.io.IOException;

import nl.tamasja.uva.saf.grammar.SAFLexer;
import nl.tamasja.uva.saf.grammar.SAFParser;
import nl.tamasja.uva.saf.tree.ast.*;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class FighterAstLoader {
	
	
	public Fighter loadFile(String fileName) {
		CharStream charStream;
		Fighter fighter = null;
		
		try {
			charStream = new ANTLRFileStream(fileName);

			SAFLexer lexer = new SAFLexer(charStream );
			TokenStream tokenStream = new CommonTokenStream(lexer);
			SAFParser parser = new SAFParser(tokenStream);
			
			try {
				fighter = parser.parse().fighter;
			} catch (RecognitionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return fighter;
	}
	
	
	
}
