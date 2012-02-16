package simulation;

import data.*;

public abstract class Behaviour
{
    public static data.Action determineAction(data.Behaviour behaviour, 
                                              State state)
    {
        return new data.Action(new data.Move("stand"), 
                               new data.Attack("kick_high"));
    }
}

