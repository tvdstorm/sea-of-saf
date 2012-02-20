package saf.syntax;

import java.util.List;

public class Or extends BinaryOperation
{
    public Or(Evaluable left, Evaluable right)
    {
        super(left, right);
    }

    @Override
    public boolean evaluate(List<State> situation)
    {
        return getLeft().evaluate(situation) || getRight().evaluate(situation);
    }

    public String toString()
    {
        return getLeft().toString() + " or " + getRight().toString();
    }
}
