package saf.fighter.fdl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

/** Reads and applies Fighter Description Language */
public class FDLReader {

	private CommonTree ast;
	
	/** 
	 * Starts parsing given fdl
	 * @throws InvalidParameterException when parsing fails
	 * @require fdl != null
	 */
	public FDLReader(String fdl) throws InvalidParameterException {
		assert fdl != null: "An attribute description in FDL is required!";
		
		this.ast = parse(lex(fdl));
	}
	
	/**
	 * Applies fdl to given fighter
	 * @require fighter != null
	 */ 
	public DescribableFighter applyAttributes(DescribableFighter fighter) {
		assert fighter != null: "Broken requirement: fighter is null!";
		
		if (check(ast, fighter)){ // if given FDL is completely valid
			apply(ast, fighter);
		}else {
			System.out.println("As the given FDL was invalid, no attributes are applied.");
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
	
	// @returns true iff all checked attributes are valid
	private boolean check(CommonTree ast, DescribableFighter fighter) {
		
		FDLChecker checker = new FDLChecker(new CommonTreeNodeStream(ast));
		List<InvalidAttributeMessage> invalidAttributes;
		try {
			invalidAttributes = checker.check(fighter);
		} catch (RecognitionException e) {
			assert false: "RecognitionException should already have been thrown by the parser";
			return false;
		}
		
		if(invalidAttributes.size()>1) {
			System.out.println("The given FDL contained invalid attributes:");
			for(InvalidAttributeMessage msg: invalidAttributes){
				System.out.println(msg);
			}
		}
		
		return invalidAttributes.size() == 0;
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
