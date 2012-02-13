package simulation;

import data.*;

public class Attack extends data.Attack {
    public Attack(data.Attack attackData)
    {
        super(new String(attackData.name));
    }
}

