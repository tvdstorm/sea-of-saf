package visitor;

import java.util.List;

import logger.ErrorLog;

import constants.SAFConstants;

import astelements.Behaviour;
import astelements.Bot;
import astelements.Bots;
import astelements.Characteristic;
import astelements.ConditionChoices;
import astelements.ConditionGroup;

public class SAFElementValidatorVisitor implements SAFElementVisitor
{

	@Override
	public void visit(Behaviour botBehaviour) throws Exception
	{
		/* The amount of moves in a behaviour should not be empty */
		if (botBehaviour.getMoveChoices().isEmpty())
		{
			ErrorLog.throwException(new Exception("Behaviour found without moves"));
		}

		/* Only moves from SAFConstants are allowed */
		for (String behaviourMoveOption : botBehaviour.getMoveChoices())
		{
			if (!SAFConstants.MoveTypes.contains(behaviourMoveOption))
			{
				String closestMatch = getClosestStringMatch(behaviourMoveOption, SAFConstants.MoveTypes);
				ErrorLog.throwException(new Exception("Invalid behaviour move detected: " + behaviourMoveOption + ", did you mean: " + closestMatch));
			}
		}

		/* Only attacks from SAFConstants are allowed */
		for (String behaviourAttackOption : botBehaviour.getAttackChoices())
		{
			if (!SAFConstants.AttackTypes.contains(behaviourAttackOption))
			{
				String closestMatch = getClosestStringMatch(behaviourAttackOption, SAFConstants.MoveTypes);
				ErrorLog.throwException(new Exception("Invalid behaviour attack detected: " + behaviourAttackOption + ", did you mean: " + closestMatch));
			}
		}
	}

	@Override
	public void visit(Bot bot) throws Exception
	{
		/* Botname should not be empty */
		if (bot.getBotName().isEmpty() || bot.getBotName() == null)
		{
			ErrorLog.throwException(new Exception("Botname is empty or null"));
		}

		boolean hasAlwaysRule = false;

		/* Each bot should at least have one Always rule */
		for (Behaviour behaviour : bot.getBehaviours())
		{
			if (conditionChoiceHasAlwaysRule(behaviour.getConditionChoices()))
			{
				hasAlwaysRule = true;
			}
		}
		if (!hasAlwaysRule)
		{
			ErrorLog.throwException(new Exception("Bot \"" + bot.getBotName() + "\" does not have an always rule."));
		}
	}

	@Override
	public void visit(Bots bots) throws Exception
	{
		/* Firstbot and Secondbot should be instantiated */
		if (bots.getFirstBot() == null)
		{
			ErrorLog.throwException(new Exception("First bot is not instantiated"));
		}
		if (bots.getSecondBot() == null)
		{
			ErrorLog.throwException(new Exception("Second bot is not instantiated"));
		}
	}

	@Override
	public void visit(Characteristic characteristic) throws Exception
	{
		/* Each characteristic should have a name */
		if (characteristic.getName().isEmpty() || characteristic.getName() == null)
		{
			ErrorLog.throwException(new Exception("Characteristic found with empty or null name"));
		}

		/* Only characteristics with values from SAFConstants are allowed */
		if (!SAFConstants.CharacteristicTypes.contains(characteristic.getName()))
		{
			String closestMatch = getClosestStringMatch(characteristic.getName(), SAFConstants.CharacteristicTypes);
			ErrorLog.throwException(new Exception("Invalid characteristic: " + characteristic.getName() + ", did you mean: " + closestMatch));
		}

		/* Characteristics should have a value in between 1 and 10 */
		if (characteristic.getValue() < 1)
		{
			ErrorLog.throwException(new Exception("Characteristic \"" + characteristic.getName() + "\" has too low value: " + characteristic.getValue()
					+ ". Should be in between 1/10"));
		}
		else if (characteristic.getValue() > 10)
		{
			ErrorLog.throwException(new Exception("Characteristic \"" + characteristic.getName() + "\" has too high value: " + characteristic.getValue()
					+ ". Should be in between 1/10"));
		}
	}

	/* Function for check whether a conditionchoice contains an always rule */
	public boolean conditionChoiceHasAlwaysRule(ConditionChoices conditionChoices)
	{
		boolean alwaysCondition = false;
		for (ConditionGroup conditionGroup : conditionChoices.getConditionGroups())
		{
			if (conditionGroup.getConditionTypes().size() == 1)
			{
				if (conditionGroup.getConditionTypes().get(0).equals("always"))
				{
					alwaysCondition = true;
				}
			}
		}

		return alwaysCondition;
	}

	@Override
	public void visit(ConditionGroup conditionGroup) throws Exception
	{
		/* Only conditions from SAFConstants are allowed */
		for (String condition : conditionGroup.getConditionTypes())
		{
			if (!SAFConstants.ConditionTypes.contains(condition))
			{
				String closestMatch = getClosestStringMatch(condition, SAFConstants.ConditionTypes);
				ErrorLog.throwException(new Exception("Invalid condition: " + condition + ", did you mean: " + closestMatch));
			}
		}
	}

	/*
	 * returns the best-matched string from a list, based on the levenshtein
	 * distance
	 */
	private String getClosestStringMatch(String searchString, List<String> matchList) throws Exception
	{
		String closestMatch = "";
		int closestLevenshteinDistance = 0;
		for (String matchingString : matchList)
		{
			int currentLevenshteinDistance = getLevenshteinDistance(matchingString, searchString);

			if (closestLevenshteinDistance == 0) // occurs only first iteration.
			{
				closestMatch = matchingString;
				closestLevenshteinDistance = currentLevenshteinDistance;
			}
			else if (currentLevenshteinDistance < closestLevenshteinDistance)
			{
				closestMatch = matchingString;
				closestLevenshteinDistance = currentLevenshteinDistance;
			}
		}
		return closestMatch;
	}

	/* Returns the Levenshtein distance between two strings */
	public int getLevenshteinDistance(String s, String t) throws Exception
	{
		if (s == null || t == null)
		{
			ErrorLog.throwException(new IllegalArgumentException("Strings must not be null"));
		}

		int n = s.length(); // length of s
		int m = t.length(); // length of t

		if (n == 0)
		{
			return m;
		}
		else if (m == 0)
		{
			return n;
		}

		int p[] = new int[n + 1]; // 'previous' cost array, horizontally
		int d[] = new int[n + 1]; // cost array, horizontally
		int _d[]; // placeholder to assist in swapping p and d

		// indexes into strings s and t
		int i; // iterates through s
		int j; // iterates through t

		char t_j; // jth character of t

		int cost; // cost

		for (i = 0; i <= n; i++)
		{
			p[i] = i;
		}

		for (j = 1; j <= m; j++)
		{
			t_j = t.charAt(j - 1);
			d[0] = j;

			for (i = 1; i <= n; i++)
			{
				cost = s.charAt(i - 1) == t_j ? 0 : 1;
				// minimum of cell to the left+1, to the top+1, diagonally left
				// and up +cost
				d[i] = Math.min(Math.min(d[i - 1] + 1, p[i] + 1), p[i - 1] + cost);
			}

			// copy current distance counts to 'previous row' distance counts
			_d = p;
			p = d;
			d = _d;
		}

		// our last action in the above loop was to switch d and p, so p now
		// actually has the most recent cost counts
		return p[n];
	}
}
