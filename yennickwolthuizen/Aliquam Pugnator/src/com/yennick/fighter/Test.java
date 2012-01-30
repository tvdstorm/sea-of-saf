package com.yennick.fighter;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import com.yennick.fighter.SAFLexer;
import com.yennick.fighter.SAFParser;


public class Test {

	public static void main(String[] args) throws RecognitionException, IOException {
		CharStream charStream = new ANTLRFileStream("src/JackieChan.txt");
		SAFLexer lexer = new SAFLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		System.out.println("Building Fighter\n-----");
		parser.fighter();
		System.out.println("\n----\n");
	}

}
