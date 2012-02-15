package simulation;

import data.*;

public class Attack extends data.Attack {
    public Attack(data.Attack attackData)
    {
        super(new String(attackData.name));
    }

    public Attack(String name)
    {
        super(name);
    }

    public static int determineDamage(Attack attack, State state)
    {
        return data.Fighter.MAX_HEALTH;
    }
}

