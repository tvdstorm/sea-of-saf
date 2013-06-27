package com.yennick.fighter;

import java.io.IOException;

import org.antlr.runtime.RecognitionException;

import com.yennick.fighter.gui.*;


public class Exec {
	
	public static void main(String[] args) throws RecognitionException, IOException{
	//	Fight fight = new Fight();

		System.setProperty("apple.laf.useScreenMenuBar", "true");
	    System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Aliquam Pugnator");

		new Gui();
	}
	
/*
	public static void main(String[] args) throws RecognitionException, IOException {
		CharStream charStream = new ANTLRFileStream("src/JackieChan.txt");
		SAFLexer lexer = new SAFLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		System.out.println("Building Fighter\n-----");
		parser.fighter();
		System.out.println("\n----\n");
	}
*/
}
