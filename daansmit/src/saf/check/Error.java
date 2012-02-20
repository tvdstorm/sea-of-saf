package saf.check;

import saf.syntax.ASTNode;

public class Error extends Message
{
    public Error(String message, ASTNode node)
    {
        super(message, node);
    }

    @Override
    public boolean isFatal()
    {
        return true;
    }

    @Override
    public String toString()
    {
        return "ERROR: " + super.toString();
    }
}
