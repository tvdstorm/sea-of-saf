package saf.simulation;

import saf.data.*;

import java.lang.Math;
import java.util.List;

public class Fighter {
    public static final Position STARTING_POSITION = new Position(0,0);

    private saf.data.Fighter fighterData;

    private Position position;
    private int healthPoints;
    private int timeToNextMove;
    /* FIXME speed and strength shouldn't be static. */
    private int speed;
    private int strength;
    private saf.data.Action currentAction = null;

    public Fighter(saf.data.Fighter fighterData, Position initialPosition)
    {
        this.fighterData = fighterData;
        this.position = initialPosition;

        this.speed = calculateSpeed(fighterData.getAttributes());
        this.timeToNextMove = 0;
        this.strength = calculateStrength(fighterData.getAttributes());

        this.healthPoints = saf.data.Fighter.MAX_HEALTH;
    }

    /*
     * Constructor provided for animation testing, where both the action and
     * the position are animated.
     */
    public Fighter(saf.data.Fighter fighterData, Position initialPosition, 
                   saf.data.Action initialAction)
    {
        this(fighterData, initialPosition);

        this.currentAction = initialAction;
    }

    public static int calculateSpeed(List<saf.data.Attribute> attributes)
    {
        int punchPower = Attribute.getValueByName(attributes, "punch_power");
        int kickPower = Attribute.getValueByName(attributes, "kick_power");
        int punchReach = Attribute.getValueByName(attributes, "punch_reach");
        int kickReach = Attribute.getValueByName(attributes, "kick_reach");

        int weight = (int)((punchPower + kickPower) / 2.0);
        int height = (int)((punchReach + kickReach) / 2.0);

        return Math.abs((int)(0.5 * (height - weight))) + 10;
    }

    public static int calculateStrength(List<saf.data.Attribute> attributes)
    {
        int punchPower = Attribute.getValueByName(attributes, "punch_power");
        int kickPower = Attribute.getValueByName(attributes, "kick_power");
        
        return punchPower + kickPower;
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
        position.move(Move.determineMoveDistance(moveAction));
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

    public Position getPosition() { return position; }
    public saf.data.Action getAction() { return currentAction; }
    public int getStrength() { return strength; }
    public int getHealth() { return healthPoints; }
}

