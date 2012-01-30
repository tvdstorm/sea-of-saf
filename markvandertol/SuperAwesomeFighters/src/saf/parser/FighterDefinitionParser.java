package saf.parser;


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

	/**
	 * Parses the given file and returns the bot.
	 * @param path path of the bot definition file
	 * @return the bot
	 * @throws IOException error while reading file
	 * @throws BotDefinitionMalformedException when the bot definition doesn't have the right format
	 */
	public FighterDefinition parseFighterDefinition(String path) throws IOException, BotDefinitionMalformedException {
		FileInputStream stream = null;
		try {
			stream = new FileInputStream(path);
			return parseFighterDefinition(stream);
		} finally {
			if (stream != null)
				stream.close();
		}
	}

	/**
	 * Parses the given stream and returns the bot.
	 * @param stream stream that contains the definition
	 * @return the bot
	 * @throws IOException error while reading file
	 * @throws BotDefinitionMalformedException when the bot definition doesn't have the right format
	 */
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
		try {
			walker.fighter();
		} catch (RecognitionException e) {
			throw new BotDefinitionMalformedException(e);
		}
		
		if (!errorList.isEmpty()) {
			throw new BotDefinitionMalformedException("Errors during walking.", errorList);
		}
		
		FighterDefinition fighter = walker.getFighterDefinition();
		
		fighter.validate(errorList);
		if (!errorList.isEmpty()) {
			throw new BotDefinitionMalformedException("Errors during validation.", errorList);
		}
		return fighter;		
	}


}
