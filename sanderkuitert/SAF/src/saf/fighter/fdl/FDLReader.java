package saf.fighter.fdl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidParameterException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

/** Reads and applies Fighter Description Language */
public class FDLReader {

	CommonTree ast;
	
	/** 
	 * Starts parsing given fdl
	 * @throws InvalidParameterException when parsing fails
	 * @require fdl != null 
	 */
	public FDLReader(String fdl) throws InvalidParameterException {
		assert fdl != null: "An attribute description in FDL is required!";
		
		this.ast = parse(lex(fdl));
		
	}
	
	/** @require fighter != null */ 
	public DescribableFighter applyAttributes(DescribableFighter fighter) {
		assert fighter != null: "fighter is null!";
		assert ast != null: "ast is null!"; //TODO the object should not have been constructed...
		
		if (check(ast)){ // if given FDL is valid
			apply(ast, fighter);
		}
		
		return fighter;
	}
	
	
	
	private CommonTokenStream lex(String fdl){
		
		FDLLexer lexer;
		try{
			lexer = new FDLLexer(new ANTLRInputStream(new ByteArrayInputStream(fdl.getBytes())));
		}catch (IOException e){
			assert false: "A string should never give an IOException";
			return null;
		}		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		return tokens;
	}
	
	private CommonTree parse(CommonTokenStream tokens) throws InvalidParameterException {
		
		FDLParser parser = new FDLParser(tokens);
		CommonTree ast;
		try {
			ast = (CommonTree) parser.fighter().getTree(); //TODO change to 'parse()'
		} catch (RecognitionException e) {
			//Rethrow as ANTLR-library-independent exception
			throw new InvalidParameterException(e.getMessage());
		}
		
		return ast;
	}
	
	private boolean check(CommonTree ast) {
		
		FDLChecker checker = new FDLChecker(new CommonTreeNodeStream(ast));
		try {
			checker.fighter();	//TODO change to 'check()' that returns a list of InvalidAttributeMessages
		} catch (RecognitionException e) {
			assert false: "RecognitionException should already have been thrown by the parser";
		}
		
		//TODO print list of InvalidAttributeMessages
		
		return false;
	}
	
	private DescribableFighter apply(CommonTree ast, DescribableFighter fighter){		
		
		FDLInterpreter interpreter = new FDLInterpreter(new CommonTreeNodeStream(ast));
		try {
			interpreter.applyAttributes(fighter);
		} catch (RecognitionException e) {
			assert false: "RecognitionException should already have been thrown by the parser";
		}
		
        return fighter;
	}
	
}
