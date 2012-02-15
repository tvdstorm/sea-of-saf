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

	private final CommonTree ast;
	
	/** 
	 * Reads(parses) given fdl
	 * @throws InvalidParameterException when parsing fails
	 * @require fdl != null
	 */
	public FDLReader(String fdl) throws InvalidParameterException {
		if(fdl == null)
			throw new NullPointerException("Parameter fdl is null!");
		
		this.ast = parse(lex(fdl));
	}
	
	/**
	 * Applies fdl to given fighter iff fdl is valid
	 * @return true iff fdl was applied
	 * @require fighter != null
	 */ 
	public boolean applyAttributes(DescribableFighter fighter) {
		if(fighter == null)
			throw new NullPointerException("Parameter fighter is null!");
		
		List<InvalidAttributeMessage> failMsgs = check(fighter);
		
		if (failMsgs.size() == 0){
			return apply(fighter);
		}
		
		System.err.println("As the given FDL was invalid, no attributes have been applied.");
		for(InvalidAttributeMessage msg: failMsgs){
			System.err.println(msg);
		}
		return false;
	}
	
	/** Returns the ast from the parsed fdl */
	public String toString() {
		assert ast != null: "Constructor should have created an ast";
		return ast.toStringTree();
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
			ast = parser.parse();
		} catch (RecognitionException e) {
			//Rethrow as ANTLR-library-independent exception
			throw new InvalidParameterException(e.getMessage());
		}
		
		return ast;
	}
	
	private List<InvalidAttributeMessage> check(DescribableFighter fighter) {
		List<InvalidAttributeMessage> invalidAttributes;
		
		FDLChecker checker = new FDLChecker(new CommonTreeNodeStream(ast));
		try {
			invalidAttributes = checker.check(fighter);
		} catch (RecognitionException e) {
			assert false: "RecognitionException should already have been thrown by the parser";
			return null;
		}
		
		return invalidAttributes;
	}
	
	private boolean apply(DescribableFighter fighter){		
		
		FDLInterpreter interpreter = new FDLInterpreter(new CommonTreeNodeStream(ast));
		try {
			interpreter.applyAttributes(fighter);
		} catch (RecognitionException e) {
			assert false: "RecognitionException should already have been thrown by the parser";
			return false;
		}
		
        return true;
	}
	
}
