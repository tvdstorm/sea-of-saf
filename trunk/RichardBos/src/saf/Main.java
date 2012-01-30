package saf;

import generated.SAFLexer;
import generated.SAFParser;
import generated.SAFParser.bots_return;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


import saf.checker.ElementChecker;
import saf.structure.Bots;


public class Main {
	public static void main(String args[]) throws Exception {
		
		SAFLexer lexer = new SAFLexer(new ANTLRFileStream("src/SAF/Tests/test.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SAFParser parser = new SAFParser(tokens);

        DebugFunctions DF = new DebugFunctions();

        try {
        	bots_return _bots = parser.bots();
        	Bots bots = _bots.bots;
        	
        	ElementChecker.check(bots);
        	
        	
        	
        	DF.PrintAST(bots);
        	
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
        
    	
        
    }
	
	
}