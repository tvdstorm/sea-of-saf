package saf.parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import net.sf.oval.configuration.annotation.IsInvariant;
import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import saf.entities.BehaviourRule;
import saf.entities.Bot;
import saf.entities.CombinedCondition;
import saf.entities.ConcreteCondition;
import saf.entities.Condition;
import saf.entities.State;
import saf.entities.FightAction;
import saf.entities.MoveAction;

@Guarded
public class BotParser {

	/**
	 * Parses the given file and returns the bot.
	 * @param path path of the bot definition file
	 * @return the bot
	 * @throws IOException error while reading file
	 * @throws BotDefinitionMalformedException when the bot definition doesn't have the right format
	 */
	@IsInvariant
	@NotNull
	public Bot parseBot(@NotNull String path) throws IOException, BotDefinitionMalformedException {
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
	@IsInvariant
	@NotNull
	public Bot parseBot(@NotNull InputStream stream) throws IOException, BotDefinitionMalformedException {
		try {
			ANTLRInputStream input = new ANTLRInputStream(stream);

			SAFLexer lexer = new ErrorHandlingSAFLexer(input);
			CommonTokenStream token = new CommonTokenStream(lexer);

			SAFParser parser = new ErrorHandlingSAFParser(token);

			SAFParser.prog_return r;
			try {
				r = parser.prog();
			} catch (RecognitionException e) {
				throw new BotDefinitionMalformedException(e);
			} catch (ParseException e) {
				throw new BotDefinitionMalformedException(e);
			}
			CommonTree tree = (CommonTree) r.getTree();

			return walkBotTree(tree);
		} finally {
			stream.close();
		}
	}

	/**
	 * Retrieves the information from the tree and returns a bot with that information set.
	 * @param tree the whole AST tree
	 * @return the bot
	 * @throws BotDefinitionMalformedException when the bot definition doesn't have the right format
	 */
	@IsInvariant
	@NotNull
	protected Bot walkBotTree(@NotNull Tree tree) throws BotDefinitionMalformedException {
		Bot bot = new Bot();
		for (int i = 0; i < tree.getChildCount(); i++) {
			Tree child = tree.getChild(i);
			switch (child.getType()) {
			case SAFParser.NAME:
				walkBotName(child, bot);
				break;
			case SAFParser.ASSIGNMENT:
				walkAssignment(child, bot);
				break;
			case SAFParser.ACTION:
				walkAction(child, bot);
				break;
			}

		}

		return bot;
	}

	/**
	 * Sets the name property in the bot.
	 * @param tree part of the tree that contains the name
	 * @param bot bot to update
	 * @throws BotDefinitionMalformedException when the bot definition doesn't have the right format
	 */
	protected void walkBotName(@NotNull Tree tree, @NotNull Bot bot) throws BotDefinitionMalformedException {
		String name = tree.getText();
		if (name == null || name.equals(""))
			throw new BotDefinitionMalformedException("Invalid name");
		bot.setName(name);
	}

	/**
	 * Adds the given assignment to the bot.
	 * @param tree part of the tree that contains one assignment
	 * @param bot bot to update
	 * @throws BotDefinitionMalformedException when the bot definition doesn't have the right format
	 */
	protected void walkAssignment(@NotNull Tree tree, @NotNull Bot bot) throws BotDefinitionMalformedException {
		String var = tree.getChild(0).getText();

		int newValue = Integer.parseInt(tree.getChild(1).getText());

		if (newValue < 1 || newValue > 10)
			throw new BotDefinitionMalformedException("Value for \"" + var + "\" outside range.");

		if ("punchReach".equals(var))
			bot.setPunchReach(newValue);
		else if ("kickReach".equals(var))
			bot.setKickReach(newValue);
		else if ("kickPower".equals(var))
			bot.setKickPower(newValue);
		else if ("punchPower".equals(var))
			bot.setPunchPower(newValue);
	}

	/**
	 * Adds the given action to the bot.
	 * @param tree part of the tree that contains one action
	 * @param bot bot to update
	 */
	protected void walkAction(@NotNull Tree tree, @NotNull Bot bot) {
		Condition condition = walkCondition(tree.getChild(0));
		MoveAction moveAction = MoveAction.valueOf(tree.getChild(1).getText());
		FightAction fightAction = FightAction.valueOf(tree.getChild(2).getText());

		BehaviourRule rule = new BehaviourRule();
		rule.setMoveAction(moveAction);
		rule.setFightAction(fightAction);
		rule.setCondition(condition);

		bot.getBehaviourRules().add(rule);
	}

	/**
	 * Returns a condition.
	 * @param tree part of the tree that contains one condition (the condition can include subconditions)
	 * @return the condition
	 */
	@IsInvariant
	@NotNull
	protected Condition walkCondition(@NotNull Tree tree) {
		if (tree.getChild(0).getType() == SAFParser.CONDITION) {
			return walkCondition(tree.getChild(0)); // handles the case for
													// (...)
		}

		State type1 = State.valueOf(tree.getChild(0).getText());

		Condition c1 = new ConcreteCondition(type1);
		if (tree.getChildCount() > 1) {
			String operator = tree.getChild(1).getText();
			Condition c2 = walkCondition(tree.getChild(2));
			boolean requireBoth = "and".equalsIgnoreCase(operator);
			return new CombinedCondition(c1, c2, requireBoth);

		}
		return c1;
	}
}
