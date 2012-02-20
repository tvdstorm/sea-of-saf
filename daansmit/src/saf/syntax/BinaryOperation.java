package saf.syntax;

import saf.check.CheckLog;

public abstract class BinaryOperation extends Evaluable
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

    @Override
    public void check(CheckLog log)
    {
        left.check(log);
        right.check(log);
    }
}
