package saf.data;

public class LogicOr extends LogicOperator
{
    public LogicOr(Logic operand1, Logic operand2)
    {
        super(operand1, operand2);
    }

    public String toString()
    {
        return "(" + getOperand1() + " and " + getOperand2() + ")";
    }

    public String getName() { return "or"; }
}

