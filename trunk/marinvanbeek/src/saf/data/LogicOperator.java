package saf.data;

public abstract class LogicOperator implements Logic
{
    private Logic operand1;
    private Logic operand2;

    public LogicOperator(Logic operand1, Logic operand2)
    {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Logic getOperand1() { return operand1; }
    public Logic getOperand2() { return operand2; }
}

