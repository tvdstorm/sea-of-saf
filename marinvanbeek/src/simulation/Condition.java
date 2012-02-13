package simulation;

import data.*;

public class Condition extends data.Condition implements Logic
{
    public Condition (data.Condition conditionData)
    {
        super(new String(conditionData.name));
    }

    public boolean isTrue(State state)
    {
        /* Determine what is close and what is stronger. */
        return true;
    }
}

