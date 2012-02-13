package simulation;

import data.*;
// FIXME temp for Constructor(java.lang.String)
import java.util.ArrayList;

class Fighter extends data.Fighter {
    int position;
    int healthPoints;
    int timeToNextMove;

    public Fighter(data.Fighter fighterData)
    {
        super(new String(fighterData.name),
              Attribute.convertDataList(fighterData.attributes),
              (data.Behaviour)new Behaviour(fighterData.behaviour));

        timeToNextMove = 100;
        healthPoints = data.Fighter.MAX_HEALTH;
        position = 0;
    }

    public Fighter(String blah)
    {
        super(new String(blah),
              new ArrayList<data.Attribute>(),
              new data.Behaviour(new ArrayList<data.Tactic>()));
    }

    public boolean isAlive()
    {
        return true;
    }

    public void tick()
    {
        timeToNextMove -= 1;
    }

    public boolean mayAttack()
    {
        return timeToNextMove == 0;
    }
}

