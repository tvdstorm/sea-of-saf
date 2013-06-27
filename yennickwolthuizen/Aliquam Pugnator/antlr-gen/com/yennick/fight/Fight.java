package com.yennick.fight;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import com.yennick.fighter.SAFLexer;
import com.yennick.fighter.SAFParser;
import com.yennick.fighter.bot.Bot;


public class Fight {
	
/*	public Fight() {
		
	}
	*/
	public Bot getFighter(String name)  {
		CharStream charStream = null;
		
		try {
			charStream = new ANTLRFileStream("src/"+name+".txt");
		} catch (IOException e) {
			System.out.println( e.getMessage());
			
			return null;
			//e.printStackTrace();
		}
		SAFLexer lexer = new SAFLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		
		Bot bot = null;
		try {
			bot = parser.fighter();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		
		System.out.println("Building Fighter\n-----");
		return bot;
	}
}
