package simulation;

import data.*;

public class Behaviour extends data.Behaviour
{
    public Behaviour(data.Behaviour behaviourData)
    {
        super(Tactic.convertDataList(behaviourData.tactics));
    }

    public Action determineAction(State state)
    {
        return new Action(new Move("stand"), new Attack("kick_high"));
    }
}

