package data;

public class LogicAnd extends LogicOperator
{
    public LogicAnd(Logic operand1, Logic operand2)
    {
        super(operand1, operand2);
    }

    public String toString()
    {
        return "(" + operand1 + " and " + operand2 + ")";
    }
}

