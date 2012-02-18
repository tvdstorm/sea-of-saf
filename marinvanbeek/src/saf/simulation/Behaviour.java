package saf.simulation;

import saf.data.*;

public abstract class Behaviour
{
    public static saf.data.Action determineAction(
            saf.data.Behaviour behaviour, State state)
    {
        return new saf.data.Action(new saf.data.Move("stand"), 
                                   new saf.data.Attack("kick_high"));
    }
}

