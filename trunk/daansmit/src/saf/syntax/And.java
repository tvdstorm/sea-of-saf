package saf.syntax;

import java.util.List;

public class And extends BinaryOperation
{
    public And(Evaluable left, Evaluable right)
    {
        super(left, right);
    }

    @Override
    public boolean evaluate(List<State> situation)
    {
        return getLeft().evaluate(situation) && getRight().evaluate(situation);
    }

    public String toString()
    {
        return getLeft().toString() + " and " + getRight().toString();
    }
}
