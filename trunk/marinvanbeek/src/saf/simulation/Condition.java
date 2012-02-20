package saf.simulation;

import saf.data.*;

public abstract class Condition 
{
    public static boolean isTrue(saf.data.Condition condition, State state)
    {
        /* FIXME Should determine if 'condition' is true based on 'state'. */
        if (condition.equals(state.getRelativeStrength()))
        {
            return true;
        }
        else if (condition.equals(state.getDistanceToOpponent()))
        {
            return true;
        }

        return false;
    }
}

