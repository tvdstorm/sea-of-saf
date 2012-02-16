package saf.syntax;

public abstract class BinaryOperation implements Evaluable
{
    private final Evaluable left;
    private final Evaluable right;

    public BinaryOperation(Evaluable left, Evaluable right)
    {
        this.left = left;
        this.right = right;
    }

    public Evaluable getLeft() { return left; }
    public Evaluable getRight() { return right; }

    public abstract boolean evaluate(State current);
}
