package saf.syntax;

public class Or extends BinaryOperation
{
    public Or(Evaluable left, Evaluable right)
    {
        super(left, right);
    }

    public boolean evaluate(State current)
    {
        return getLeft().evaluate(current) || getRight().evaluate(current);
    }

    public String toString()
    {
        return getLeft().toString() + " or " + getRight().toString();
    }
}
