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
import saf.entities.ConditionType;
import saf.entities.FightActionType;
import saf.entities.MoveActionType;

@Guarded
public class BotParser {

	@IsInvariant
	@NotNull
	public Bot parseBot(@NotNull String path) throws IOException, BotDefinitionMalformedException
	{
		FileInputStream stream = new FileInputStream(path);
		return parseBot(stream);
	}
	
	@IsInvariant
	@NotNull
	public Bot parseBot(@NotNull InputStream stream) throws IOException, BotDefinitionMalformedException
	{
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
		stream.close();
		return walkBotTree(tree);
	}
	
	@IsInvariant
	@NotNull
	protected Bot walkBotTree(@NotNull Tree tree) throws BotDefinitionMalformedException
	{
		Bot bot = new Bot();
		for (int i = 0; i < tree.getChildCount(); i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
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
	
	protected void walkBotName(@NotNull Tree tree, @NotNull Bot bot) throws BotDefinitionMalformedException
	{
		String name = tree.getText();
		if (name == null || name.equals(""))
			throw new BotDefinitionMalformedException("Invalid name");
		bot.setName(name);
	}
	
	protected void walkAssignment(@NotNull Tree tree, @NotNull Bot bot) throws BotDefinitionMalformedException
	{
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
	
	
	protected void walkAction(@NotNull Tree tree, @NotNull Bot bot)
	{
		Condition condition = walkCondition(tree.getChild(0));
		MoveActionType moveAction = MoveActionType.valueOf(tree.getChild(1).getText());
		FightActionType fightAction = FightActionType.valueOf(tree.getChild(2).getText());
		
		BehaviourRule rule = new BehaviourRule();
		rule.setMoveAction(moveAction);
		rule.setFightAction(fightAction);
		rule.setCondition(condition);
		
		bot.getBehaviourRules().add(rule);
	}
	
	@IsInvariant
	@NotNull
	protected Condition walkCondition(@NotNull Tree tree)
	{
		if (tree.getChild(0).getType() == SAFParser.CONDITION)
		{
			return walkCondition(tree.getChild(0)); // handles the case for (...)
		}
		
		ConditionType type1 = ConditionType.valueOf(tree.getChild(0).getText());

		Condition c1 = new ConcreteCondition(type1);
		if (tree.getChildCount() > 1)
		{
			String operator = tree.getChild(1).getText();
			Condition c2 = walkCondition(tree.getChild(2));
			boolean requireBoth = "and".equalsIgnoreCase(operator);
			return new CombinedCondition(c1, c2, requireBoth);
			
		}
		return c1;
	}
}
