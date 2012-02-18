package saf.simulation;

import saf.data.*;

public abstract class Logic 
{
    public static boolean isTrue(saf.data.Logic logic, State state)
    {
        if (logic instanceof saf.data.Condition)
        {
            return Condition.isTrue((saf.data.Condition)logic, state);
        }
        else if (logic instanceof saf.data.LogicAnd)
        {
            return LogicAnd.isTrue((saf.data.LogicAnd)logic, state);
        }
        else /* if (logic instanceof saf.data.LogicOr) */
        {
            return LogicOr.isTrue((saf.data.LogicOr)logic, state);
        }
    }
}

