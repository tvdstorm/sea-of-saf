package com.yennick.fight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.swing.JFileChooser;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import com.yennick.fighter.SAFLexer;
import com.yennick.fighter.SAFParser;
import com.yennick.fighter.bot.Bot;


public class SAFFile {
	
	public Bot getFighter(String name)  {
		CharStream charStream = null;
		
		try {
			charStream = new ANTLRFileStream("src/"+name+".txt");
		} catch (IOException e) {
			System.out.println( e.getMessage());
			
			return null;
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
	
	public String[] getFighters(){
		String[] fighters;

		File dir = new File("src/");
		FilenameFilter filter = new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		    	return name.endsWith(".txt");
		    }
		};
		
		fighters = dir.list(filter);
    	return fighters;
	}
}
