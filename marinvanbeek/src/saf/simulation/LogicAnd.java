package saf.simulation;

import saf.data.*;

public abstract class LogicAnd
{
    public static boolean isTrue(saf.data.LogicAnd and, State state)
    {
        return Logic.isTrue(and.getOperand1(), state) && 
               Logic.isTrue(and.getOperand2(), state);
    }
}

