package saf.fighter.fdl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidParameterException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import saf.fighter.Fighter;
import saf.fighter.SuperAwesomeFighter;


public class FDLReader {

	public Fighter createFighter(String fdl) throws IOException, InvalidParameterException {
		if(fdl==null)
			return null;
		
		CommonTree ast;
		try {
			ast = readFDL(fdl);
		} catch (RecognitionException e) {
			System.err.println(e);
			throw new InvalidParameterException(e.getMessage()); //keep ANTLR lib usage to this package
		}
		
		Fighter fighter = new SuperAwesomeFighter();
		fighter.setDefaults();
		
		applyFDL(ast, fighter);
		
		return fighter;
	}
	
	private CommonTree readFDL(String fdl) throws IOException, RecognitionException, 
																InvalidParameterException {
		
		//Input
		CharStream input = new ANTLRInputStream(new ByteArrayInputStream(fdl.getBytes()));
		
        //Lexer
        FDLLexer lexer = new FDLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //Parser
        FDLParser parser = new FDLParser(tokens);
        CommonTree ast = (CommonTree) parser.fighter().getTree();

        //Checker
		FDLChecker checker = new FDLChecker(new CommonTreeNodeStream(ast));
		checker.fighter();
		
		return ast;
	}	
	
	private Fighter applyFDL(CommonTree ast, Fighter fighter){
		
		//Interpreter
		FDLInterpreter interpreter = new FDLInterpreter(new CommonTreeNodeStream(ast));
		interpreter.applyAttributes(fighter);
		
        return fighter;
	}
	
}