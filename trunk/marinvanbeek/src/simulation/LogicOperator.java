package simulation;

import data.*;

public abstract class LogicOperator extends data.LogicOperator implements Logic
{
    public LogicOperator(Logic operand1, Logic operand2)
    {
        super(operand1, operand2);
    }
}

