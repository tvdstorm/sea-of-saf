package saf.simulation;

import saf.data.*;

// FIXME temp for Constructor(java.lang.String)
import java.util.ArrayList;

public class Fighter {
    private saf.data.Fighter fighterData;

    private int position;
    private int healthPoints;
    private int timeToNextMove;
    /* FIXME speed and strength shouldn't be static. */
    private int speed = 10;
    private int strength = 10;

    private saf.data.Action currentAction = null;

    public Fighter(saf.data.Fighter fighterData, int initialPosition)
    {
        this.fighterData = fighterData;
        timeToNextMove = speed;
        healthPoints = saf.data.Fighter.MAX_HEALTH;
        position = initialPosition;
    }

    /*
     * Constructor provided for animation testing, where both the action and
     * the position are animated.
     */
    public Fighter(saf.data.Fighter fighterData, int initialPosition, 
                   saf.data.Action initialAction)
    {
        this(fighterData, initialPosition);

        this.currentAction = initialAction;
    }

    public saf.data.Action act(State state)
    {
        timeToNextMove = speed;
        currentAction = Behaviour.determineAction(fighterData.getBehaviour(), 
                                                  state);

        return currentAction;
    }

    public void move(saf.data.Move moveAction)
    {
        position += Move.determineMoveDistance(moveAction);
    }

    public void defend(saf.data.Attack attack, State state)
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

    public int getPosition() { return position; }
    public saf.data.Action getAction() { return currentAction; }
    public int getStrength() { return strength; }
}

