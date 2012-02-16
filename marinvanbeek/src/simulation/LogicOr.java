package simulation;

import data.*;

public abstract class LogicOr
{
    public static boolean isTrue(data.LogicOr or, State state)
    {
        return Logic.isTrue(or.operand1, state) || 
               Logic.isTrue(or.operand2, state);
    }
}

