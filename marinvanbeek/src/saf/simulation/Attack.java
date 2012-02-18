package saf.simulation;

import saf.data.*;

public abstract class Attack
{
    public static int determineDamage(saf.data.Attack attack, State state)
    {
        return saf.data.Fighter.MAX_HEALTH;
    }
}

