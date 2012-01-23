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
import org.antlr.runtime.tree.Tree;

import saf.entities.BehaviourRule;
import saf.entities.Bot;
import saf.entities.CombinedCondition;
import saf.entities.ConcreteCondition;
import saf.entities.Condition;
import saf.entities.FightAction;
import saf.entities.MoveAction;
import saf.entities.State;

public class BotParser {

	/**
	 * Parses the given file and returns the bot.
	 * @param path path of the bot definition file
	 * @return the bot
	 * @throws IOException error while reading file
	 * @throws BotDefinitionMalformedException when the bot definition doesn't have the right format
	 */
	public Bot parseBot(String path) throws IOException, BotDefinitionMalformedException {
		FileInputStream stream = new FileInputStream(path);
		return parseBot(stream);
	}

	/**
	 * Parses the given stream and returns the bot.
	 * @param stream stream that contains the definition
	 * @return the bot
	 * @throws IOException error while reading file
	 * @throws BotDefinitionMalformedException when the bot definition doesn't have the right format
	 */
	public Bot parseBot(InputStream stream) throws IOException, BotDefinitionMalformedException {
		try {
			ANTLRInputStream input = new ANTLRInputStream(stream);

			List<String> errorList = new ArrayList<String>();
			
			SAFLexer lexer = new SAFLexer(input);
			lexer.setErrorList(errorList);
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			SAFParser parser = new SAFParser(tokens);
			parser.setErrorList(errorList);

			SAFParser.prog_return r;
			try {
				r = parser.prog();
			} catch (RecognitionException e) {
				throw new BotDefinitionMalformedException(e);
			} catch (ParseException e) {
				throw new BotDefinitionMalformedException(e);
			}
			CommonTree tree = (CommonTree) r.getTree();

			CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
			nodes.setTokenStream(tokens);


			SAFWalker walker = new SAFWalker(nodes);
			walker.setErrorList(errorList);
			try {
				walker.prog();
			} catch (RecognitionException e) {
				throw new BotDefinitionMalformedException(e);
			}
			
			return walker.getBot();
		} finally {
			stream.close();
		}
	}


}
