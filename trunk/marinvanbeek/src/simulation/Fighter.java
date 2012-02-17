package simulation;

import data.*;

// FIXME temp for Constructor(java.lang.String)
import java.util.ArrayList;

public class Fighter {
    data.Fighter fighterData;

    public int position;
    int healthPoints;
    int timeToNextMove;
    /* FIXME speed and strength shouldn't be static. */
    int speed = 10;
    int strength = 10;

    public data.Action currentAction = null;

    public Fighter(data.Fighter fighterData, int initialPosition)
    {
        this.fighterData = fighterData;
        timeToNextMove = speed;
        healthPoints = data.Fighter.MAX_HEALTH;
        position = initialPosition;
    }

    /*
     * Constructor provided for animation testing, where both the action and
     * the position are animated.
     */
    public Fighter(data.Fighter fighterData, int initialPosition, 
                   data.Action initialAction)
    {
        this(fighterData, initialPosition);

        this.currentAction = initialAction;
    }

    public data.Action act(State state)
    {
        timeToNextMove = speed;
        currentAction = Behaviour.determineAction(fighterData.behaviour, 
                                                  state);

        return currentAction;
    }

    public void move(data.Move moveAction)
    {
        position += Move.determineMoveDistance(moveAction);
    }

    public void defend(data.Attack attack, State state)
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

