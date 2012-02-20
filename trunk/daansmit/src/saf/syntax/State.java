package saf.syntax;

import java.util.Arrays;
import java.util.List;

import saf.check.CheckLog;

public class State extends Evaluable
{
    private static final List<String> STATES =
        Arrays.asList("stronger", "weaker", "much_stronger",
                      "much_weaker", "even", "near", "far", "always");

    private static final String ALWAYS = "always";

    private final String id;

    public State(String id)
    {
        this.id = id;
    }

    public String getId() { return id; }

    @Override
    public boolean isAlways()
    {
        return id.equals(ALWAYS);
    }

    @Override
    public void check(CheckLog log)
    {
        if (!STATES.contains(id))
        {
            log.add(new saf.check.Error("Invalid state: \"" + toString() + "\"", this));
        }
    }

    @Override
    public boolean evaluate(List<State> situation)
    {
        boolean isValid = false;
        for (State current : situation)
        {
            isValid |= equals(current);
        }
        return isValid;
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

    public String toString()
    {
        return id;
    }
}