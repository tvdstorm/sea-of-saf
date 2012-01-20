package saf;

import saf.arena.*;
import saf.fighter.*;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

@SuppressWarnings("unused") //TODO
public class Play {
	
	public static void main(String[] args) throws Exception{
        String arg = args.length>0 ? args[0] : null; 
        
        readFDL(arg); //TODO store checked AST
        
        //TODO make two new SAFs with these read properties
        
        //TODO make new Arena and give them the SAFs
        
        //TODO start game(s)
	}
	
	private static void readFDL(String file) throws Exception{
		//Input
		CharStream input = null;
        if (file != null)
            input = new ANTLRFileStream(file);
        else
            input = new ANTLRInputStream(System.in);
        
        //Lexer
        FDLLexer lexer = new FDLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        //Parser
        FDLParser parser = new FDLParser(tokens);
        parser.property();//TODO store tree for checker
        
        //Checker
        //TODO
		
        //return TODO;
	}
}
