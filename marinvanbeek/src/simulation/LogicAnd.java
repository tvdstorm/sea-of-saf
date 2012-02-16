package simulation;

import data.*;

public abstract class LogicAnd
{
    public static boolean isTrue(data.LogicAnd and, State state)
    {
        return Logic.isTrue(and.operand1, state) && 
               Logic.isTrue(and.operand2, state);
    }
}

