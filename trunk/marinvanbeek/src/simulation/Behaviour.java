package simulation;

import data.*;

public class Behaviour extends data.Behaviour
{
    public Behaviour(data.Behaviour behaviourData)
    {
        super(Tactic.convertDataList(behaviourData.tactics));
    }
}

