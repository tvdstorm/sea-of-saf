package saf.syntax;

public abstract class Response extends ASTNode
{
    public abstract String toString();

    public abstract boolean isMove();

    public abstract boolean isAttack();
}
