package simulation;

import data.*;

public abstract class Logic 
{
    public static boolean isTrue(data.Logic logic, State state)
    {
        if (logic instanceof data.Condition)
        {
            return Condition.isTrue((data.Condition)logic, state);
        }
        else if (logic instanceof data.LogicAnd)
        {
            return LogicAnd.isTrue((data.LogicAnd)logic, state);
        }
        else /* if (logic instanceof data.LogicOr) */
        {
            return LogicOr.isTrue((data.LogicOr)logic, state);
        }
    }
}

