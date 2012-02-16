package saf.syntax;

public class State implements Evaluable
{
    private final String id;

    public State(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }

    public String toString()
    {
        return id;
    }

    public boolean evaluate(State current)
    {
        return equals(current);
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof State))
        {
            return false;
        }
        State s = (State)other;
        return getId().equals(s.getId());
    }
}