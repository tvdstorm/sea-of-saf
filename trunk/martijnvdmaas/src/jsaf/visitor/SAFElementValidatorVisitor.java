package jsaf.visitor;

import java.util.ArrayList;
import java.util.List;

import jsaf.astelements.Behaviour;
import jsaf.astelements.Bot;
import jsaf.astelements.Bots;
import jsaf.astelements.Characteristic;
import jsaf.astelements.ConditionChoices;
import jsaf.astelements.ConditionGroup;
import jsaf.constants.ErrorConstants;
import jsaf.constants.SAFConstants;
import jsaf.logger.ErrorLog;

public class SAFElementValidatorVisitor implements SAFElementVisitor, ErrorConstants
{
	private List<String> errorMessages;

	public SAFElementValidatorVisitor()
	{
		errorMessages = new ArrayList<String>();
	}

	@Override
	public void visit(Behaviour botBehaviour)
	{

		/* The amount of moves in a behaviour should not be empty */
		if (botBehaviour.getMoveChoices().isEmpty())
		{
			String errorMessage = BEHAVIOUR_EMPTY_MOVES;
			errorMessages.add(errorMessage);
			new ErrorLog(errorMessage);
		}

		/* Only moves from SAFConstants are allowed */
		for (String behaviourMoveOption : botBehaviour.getMoveChoices())
		{
			if (!SAFConstants.MoveTypes.contains(behaviourMoveOption))
			{
				String closestMatch = getClosestStringMatch(behaviourMoveOption, SAFConstants.MoveTypes);

				String errorMessage = BEHAVIOUR_INVALID_MOVE_NAME + " : " + behaviourMoveOption + "," +  ERROR_OTHER_SUGGESTION + " : " + closestMatch;
				errorMessages.add(errorMessage);
				new ErrorLog(errorMessage);
			}
		}

		/* Only attacks from SAFConstants are allowed */
		for (String behaviourAttackOption : botBehaviour.getAttackChoices())
		{
			if (!SAFConstants.AttackTypes.contains(behaviourAttackOption))
			{
				String closestMatch = getClosestStringMatch(behaviourAttackOption, SAFConstants.AttackTypes);
				
				String errorMessage = BEHAVIOUR_INVALID_ATTACK_NAME + " : " + behaviourAttackOption + "," +  ERROR_OTHER_SUGGESTION + " : " + closestMatch;
				errorMessages.add(errorMessage);
				new ErrorLog(errorMessage);
			}
		}
	}

	@Override
	public void visit(Bot bot)
	{
		/* Botname should not be empty */
		if (bot.getBotName().isEmpty() || bot.getBotName() == null)
		{
			String errorMessage = BOTNAME_EMPTY_NAME;
			errorMessages.add(errorMessage);
			new ErrorLog(errorMessage);
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
			String errorMessage = BOT_HAS_NOT_ALWAYS + " : " + bot.getBotName();
			errorMessages.add(errorMessage);
			new ErrorLog(errorMessage);
		}
	}

	@Override
	public void visit(Bots bots)
	{
		/* Firstbot and Secondbot should be instantiated */
		if (bots.getLeftBot() == null)
		{
			String errorMessage = LEFTBOT_NOT_INSTANTIATED;
			errorMessages.add(errorMessage);
			new ErrorLog(errorMessage);
		}
		if (bots.getRightBot() == null)
		{
			String errorMessage = RIGHTBOT_NOT_INSTANTIATED;
			errorMessages.add(errorMessage);
			new ErrorLog(errorMessage);
		}
	}

	@Override
	public void visit(Characteristic characteristic)
	{
		/* Each characteristic should have a name */
		if (characteristic.getName().isEmpty() || characteristic.getName() == null)
		{
			String errorMessage = CHARACTERISTIC_EMPTY_NAME;
			errorMessages.add(errorMessage);
			new ErrorLog(errorMessage);
		}

		/* Only characteristics with values from SAFConstants are allowed */
		if (!SAFConstants.CharacteristicTypes.contains(characteristic.getName()))
		{
			String closestMatch = getClosestStringMatch(characteristic.getName(), SAFConstants.CharacteristicTypes);
			
			String errorMessage = CHARACTERISTIC_INVALID_NAME + " : " + characteristic.getName() + ". " + ERROR_OTHER_SUGGESTION + closestMatch;
			errorMessages.add(errorMessage);
			
			new ErrorLog(errorMessage);
		}

		/* Characteristics should have a value in between 1 and 10 */
		if (characteristic.getValue() < 1)
		{
			String errorMessage = CHARACTERISTIC_TOO_LOW_VALUE + " : " + characteristic.getName();
			errorMessages.add(errorMessage);
			
			new ErrorLog(errorMessage);
		}
		else if (characteristic.getValue() > 10)
		{
			String errorMessage = CHARACTERISTIC_TOO_HIGH_VALUE + " : " + characteristic.getName();
			errorMessages.add(errorMessage);
			
			new ErrorLog(errorMessage);}
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
	public void visit(ConditionGroup conditionGroup)
	{
		/* Only conditions from SAFConstants are allowed */
		for (String condition : conditionGroup.getConditionTypes())
		{
			if (!SAFConstants.ConditionTypes.contains(condition))
			{
				String closestMatch = getClosestStringMatch(condition, SAFConstants.ConditionTypes);
				
				String errorMessage = CONDITION_INVALID_NAME + " : " + condition + ". " + ERROR_OTHER_SUGGESTION + closestMatch;
				errorMessages.add(errorMessage);
				new ErrorLog(errorMessage);
			}
		}
	}

	/*
	 * returns the best-matched string from a list, based on the levenshtein
	 * distance
	 */
	private String getClosestStringMatch(String searchString, List<String> matchList)
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
	public int getLevenshteinDistance(String s, String t)
	{
		if (s == null || t == null)
		{
			return 0;
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

	public List<String> getErrorMessages()
	{
		return errorMessages;
	}
}
