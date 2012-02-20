package saf.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import saf.ast.FighterDefinition;

public class FighterDefinitionParser {
	private final FighterDefinition definition;
	private final List<String> errorList = new ArrayList<String>();
	
	public FighterDefinitionParser(File file) throws IOException {
		FileInputStream stream = null;
		try {
			stream = new FileInputStream(file);
			definition = parseFighterDefinition(stream);
		} finally {
			if (stream != null)
				stream.close();
		}
	}
	
	public FighterDefinitionParser(InputStream stream) throws IOException {
		definition = parseFighterDefinition(stream);
	}

	private FighterDefinition parseFighterDefinition(InputStream stream) throws IOException {		
		ANTLRInputStream input = new ANTLRInputStream(stream);
		
		CommonTokenStream tokens = lexSAF(input);

		SAFParser.fighter_return fighterTree = parseSAF(tokens); 
		
		if (!errorList.isEmpty() || fighterTree == null)
			return null;
		
		FighterDefinition fighter = walkSAF(tokens, fighterTree);
		
		if (!errorList.isEmpty())
			return null;
		
		
		fighter.validate(errorList);
		if (!errorList.isEmpty())
			return null;
		
		return fighter;		
	}

	private CommonTokenStream lexSAF(ANTLRInputStream input) {
		SAFLexer lexer = new SAFLexer(input);
		lexer.setErrorList(errorList);		
		return new CommonTokenStream(lexer);
	}

	private SAFParser.fighter_return parseSAF(CommonTokenStream tokens) {
		SAFParser parser = new SAFParser(tokens);
		parser.setErrorList(errorList);

		SAFParser.fighter_return fighterTree = null;
		try {
			fighterTree = parser.fighter();
		} catch (RecognitionException e) {
			errorList.add("Exception in parser: " + e.getMessage());
		}
		return fighterTree;
	}
	
	private FighterDefinition walkSAF(CommonTokenStream tokens, SAFParser.fighter_return fighterTree) {
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(fighterTree.getTree());
		nodes.setTokenStream(tokens);

		SAFWalker walker = new SAFWalker(nodes);
		walker.setErrorList(errorList);
		
		FighterDefinition fighter = null;
		try {
			fighter = walker.fighter();
		} catch (RecognitionException e) {
			errorList.add("Exception in walker: " + e.getMessage());
		}
		return fighter;
	}

	public FighterDefinition getDefinition() {
		return definition;
	}
	
	public List<String> getErrorList() {
		return Collections.unmodifiableList(errorList);
	}
	
	public String getErrorMessage() {
		if (getErrorList().isEmpty())
			return null;
		
		StringBuilder builder = new StringBuilder();
		for (String error : errorList) {
			builder.append(error);
			builder.append('\n');
		}
		return builder.toString();
	}

}
