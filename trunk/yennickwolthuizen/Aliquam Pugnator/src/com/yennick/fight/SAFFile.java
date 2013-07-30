package com.yennick.fight;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.swing.JFileChooser;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import com.yennick.fighter.bot.Bot;
import com.yennick.parser.SAFLexer;
import com.yennick.parser.SAFParser;


public class SAFFile {
	
	private final static String ext = ".txt";
	private String path = null;
	
	JFileChooser pathChooser;
	
	public SAFFile(){
		pathChooser = new JFileChooser(); 
	    pathChooser.setCurrentDirectory(new java.io.File("."));
	    pathChooser.setDialogTitle("Pick directory with fighters");
//	    pathChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//	    pathChooser.setAcceptAllFileFilterUsed(false);
	    path = getFighterDir()+ File.separator;
	}
	
	private String getFighterDir(){
		File dir = null;
		if(pathChooser.showOpenDialog(pathChooser) == JFileChooser.APPROVE_OPTION){
			dir = pathChooser.getCurrentDirectory();
		}
		return dir.toString();
	}
	
	public Bot getFighter(String name)  {
		CharStream charStream = null;
		
		
		try {
			charStream = new ANTLRFileStream(path+name+ext);
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
		
		return bot;
	}
	
	public String[] getFighters(){
		String[] fighters;

		File dir = new File(path);
		FilenameFilter filter = new FilenameFilter() {
		    
			public boolean accept(File dir, String name) {
		    	return name.endsWith(ext);
		    }
		};
		
		fighters = dir.list(filter);
    	return fighters;
	}
}
 