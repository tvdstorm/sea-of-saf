package saf.syntax;

public class And extends BinaryOperation
{
    public And(Evaluable left, Evaluable right)
    {
        super(left, right);
    }

    public boolean evaluate(State current)
    {
        return getLeft().evaluate(current) && getRight().evaluate(current);
    }

    public String toString()
    {
        return getLeft().toString() + " and " + getRight().toString();
    }
}
