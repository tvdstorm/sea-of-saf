package saf.check;

import saf.syntax.ASTNode;

public class Warning extends Message
{
    public Warning(String message, ASTNode node)
    {
        super(message, node);
    }

    @Override
    public String toString()
    {
        return "WARNING: " + super.toString();
    }
}
