package saf;

import saf.arena.*;
import saf.fighter.*;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Play {
	
	public static void main(String[] args) throws Exception{
        String arg = args.length>0 ? args[0] : null; 
        
        CommonTree ast = readFDL(arg);
        
        //TODO make two new SAFs from these ASTs
        
        //TODO make new Arena and give them the SAFs
        
        //TODO start game(s)
	}
	
	private static CommonTree readFDL(String file) throws Exception{
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
        CommonTree ast = (CommonTree) parser.saf().getTree();
        
        //Checker
		FDLChecker checker = new FDLChecker(new CommonTreeNodeStream(ast));
		checker.saf();
		
        return ast;
	}
}
