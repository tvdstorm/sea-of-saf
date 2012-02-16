package simulation;

import data.*;

public abstract class Attack
{
    public static int determineDamage(data.Attack attack, State state)
    {
        return data.Fighter.MAX_HEALTH;
    }
}

