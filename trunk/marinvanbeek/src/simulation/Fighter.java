package simulation;

import data.*;

// FIXME temp for Constructor(java.lang.String)
import java.util.ArrayList;

class Fighter extends data.Fighter {
    int position;
    int healthPoints;
    int timeToNextMove;
    /* FIXME speed and strength shouldn't be static. */
    int speed = 10;
    int strength = 10;

    public Fighter(data.Fighter fighterData)
    {
        super(new String(fighterData.name),
              Attribute.convertDataList(fighterData.attributes),
              (data.Behaviour)new Behaviour(fighterData.behaviour));

        timeToNextMove = speed;
        healthPoints = data.Fighter.MAX_HEALTH;
        position = 0;
    }

    public Fighter(String blah)
    {
        super(new String(blah),
              new ArrayList<data.Attribute>(),
              new data.Behaviour(new ArrayList<data.Tactic>()));
    }

    public Action act(State state)
    {
        timeToNextMove = speed;

        return behaviour.determineAction(state);
    }

    public void move(Move moveAction)
    {
        position += Move.determineMoveDistance(moveAction);
    }

    public void defend(Attack attack, State state)
    {
        healthPoints -= Attack.determineDamage(attack, state);
    }

    public boolean isAlive()
    {
        return healthPoints > 0;
    }

    public void tick()
    {
        timeToNextMove -= 1;
    }

    public boolean mayAct()
    {
        return timeToNextMove == 0;
    }
}

