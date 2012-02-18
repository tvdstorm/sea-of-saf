package saf.simulation;

import saf.data.*;

public abstract class LogicOr
{
    public static boolean isTrue(saf.data.LogicOr or, State state)
    {
        return Logic.isTrue(or.getOperand1(), state) || 
               Logic.isTrue(or.getOperand2(), state);
    }
}

