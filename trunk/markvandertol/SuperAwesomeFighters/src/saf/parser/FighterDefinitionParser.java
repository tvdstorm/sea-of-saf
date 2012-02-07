package saf.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import saf.ast.FighterDefinition;

public class FighterDefinitionParser {
	public FighterDefinition parseFighterDefinition(File file) throws IOException, BotDefinitionMalformedException {
		FileInputStream stream = null;
		try {
			stream = new FileInputStream(file);
			return parseFighterDefinition(stream);
		} finally {
			if (stream != null)
				stream.close();
		}
	}

	public FighterDefinition parseFighterDefinition(InputStream stream) throws IOException, BotDefinitionMalformedException {		
		ANTLRInputStream input = new ANTLRInputStream(stream);

		List<String> errorList = new ArrayList<String>();
		
		SAFLexer lexer = new SAFLexer(input);
		lexer.setErrorList(errorList);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		SAFParser parser = new SAFParser(tokens);
		parser.setErrorList(errorList);

		SAFParser.fighter_return fighterTree;
		try {
			fighterTree = parser.fighter();
		} catch (RecognitionException e) {
			throw new BotDefinitionMalformedException(e);
		} 

		CommonTreeNodeStream nodes = new CommonTreeNodeStream((CommonTree) fighterTree.getTree());
		nodes.setTokenStream(tokens);

		if (!errorList.isEmpty()) {
			throw new BotDefinitionMalformedException("Errors during parsing.", errorList);
		}

		SAFWalker walker = new SAFWalker(nodes);
		walker.setErrorList(errorList);
		
		FighterDefinition fighter;
		try {
			fighter = walker.fighter();
		} catch (RecognitionException e) {
			throw new BotDefinitionMalformedException(e);
		}
		
		if (!errorList.isEmpty()) {
			throw new BotDefinitionMalformedException("Errors during walking.", errorList);
		}
		
		
		
		fighter.validate(errorList);
		if (!errorList.isEmpty()) {
			throw new BotDefinitionMalformedException("Errors during validation.", errorList);
		}
		return fighter;		
	}


}
