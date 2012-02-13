package data;

public abstract class LogicOperator implements Logic
{
    public Logic operand1;
    public Logic operand2;

    public LogicOperator(Logic operand1, Logic operand2)
    {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
}

