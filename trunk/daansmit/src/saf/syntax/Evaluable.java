package saf.syntax;

import java.util.List;

public abstract class Evaluable extends ASTNode
{
    public boolean isAlways()
    {
        return false;
    }

    public abstract boolean evaluate(List<State> situation);
}
