package saf.check;

import saf.syntax.ASTNode;

public abstract class Message
{
    private final String message;
    private final ASTNode node;

    public Message(String message, ASTNode node)
    {
        this.message = message;
        this.node = node;
    }

    public String getMessage() { return message; }
    public ASTNode getNode() { return node; }

    public boolean isFatal()
    {
        return false;
    }

    public String toString()
    {
        return message;
    }
}
