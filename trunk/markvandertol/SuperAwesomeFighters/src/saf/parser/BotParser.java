package saf.parser;

import java.io.FileInputStream;
import java.io.IOException;

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

public class BotParser {

	public Bot parseBot(String path) throws IOException, BotDefinitionMalformedException
	{
		FileInputStream stream = new FileInputStream(path);
		ANTLRInputStream input = new ANTLRInputStream(stream);
		
		SuperAwesomeFightersLexer lexer = new SuperAwesomeFightersLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		
		SuperAwesomeFightersParser parser = new SuperAwesomeFightersParser(token);
		//parser.setTreeAdaptor(new MyAdaptor());
		SuperAwesomeFightersParser.prog_return r;
		try {
			r = parser.prog();
		} catch (RecognitionException e) {
			throw new BotDefinitionMalformedException(e);
		}
		
		CommonTree tree = (CommonTree) r.getTree();
		
		System.out.println(tree.toStringTree());
		
		return walkBotTree(tree);
	}
	
	private Bot walkBotTree(Tree tree) throws BotDefinitionMalformedException
	{
		Bot bot = new Bot();
		for (int i = 0; i < tree.getChildCount(); i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
			case SuperAwesomeFightersParser.NAME:
				walkBotName(child, bot);
				break;
			case SuperAwesomeFightersParser.ASSIGNMENT:
				walkAssignment(child, bot);
				break;
			case SuperAwesomeFightersParser.ACTION:
				walkAction(child, bot);
				break;
			}
			
		}
		
		return bot;
	}
	
	private void walkBotName(Tree tree, Bot bot) throws BotDefinitionMalformedException
	{
		String name = tree.getText();
		if (name == null || name.equals(""))
			throw new BotDefinitionMalformedException("Invalid name");
		bot.setName(name);
	}
	
	private void walkAssignment(Tree tree, Bot bot) throws BotDefinitionMalformedException
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
	
	private void walkAction(Tree tree, Bot bot)
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
	
	private Condition walkCondition(Tree tree)
	{
		System.out.println(tree.toStringTree());
		if (tree.getChild(0).getType() == SuperAwesomeFightersParser.CONDITION)
		{
			return walkCondition(tree.getChild(0)); // (..)
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
