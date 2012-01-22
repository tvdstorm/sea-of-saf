package nl.tamasja.uva.saf;

import java.io.IOException;

import nl.tamasja.uva.saf.SAFParser.parse_return;
import nl.tamasja.uva.saf.bot.FighterBot;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class BotLoader {
	
	
	public FighterBot loadFile(String fileName) {
		CharStream charStream;
		FighterBot fighterBot = null;
		
		try {
			charStream = new ANTLRFileStream(fileName);

			SAFLexer lexer = new SAFLexer(charStream );
			TokenStream tokenStream = new CommonTokenStream(lexer);
			SAFParser parser = new SAFParser(tokenStream);
			
			try {
				fighterBot = parser.parse().fighterBot;
			} catch (RecognitionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return fighterBot;
	}
	
	
	
}
