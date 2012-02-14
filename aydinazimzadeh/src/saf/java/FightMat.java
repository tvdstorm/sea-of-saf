package saf.java;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;

import antlr.RecognitionException;
 
import saf.grammer.*;
import saf.grammer.GRMParser.saf_return;

public class FightMat {

	public static void main(String[] args) throws RecognitionException, IOException, org.antlr.runtime.RecognitionException {

		
		 //get the content from a file 
		 CharStream charStream         = new ANTLRFileStream("G://UvA//SAF.txt");
		 
		 //create parser instance
		 GRMLexer lexer        = new GRMLexer(charStream);		 
		 CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		GRMParser parser      = new GRMParser(tokenStream);		 
		
		 saf_return saf =  parser.saf();	
		 
		 System.out.println("OK");
		 
			}
}