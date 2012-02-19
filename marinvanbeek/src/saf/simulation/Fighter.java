package saf.simulation;

import saf.data.*;

import java.lang.Math;
import java.util.List;

public class Fighter {
    private saf.data.Fighter fighterData;

    private Position position;
    private int healthPoints;
    private int timeToNextMove;
    private int movementDirection;
    /* FIXME speed and strength shouldn't be static. */
    private int speed;
    private int strength;
    private saf.data.Action currentAction = null;

    public Fighter(saf.data.Fighter fighterData, int startingX, 
                   int movementDirection)
    {
        this.fighterData = fighterData;
        this.position = new Position(startingX, 0);

        this.speed = calculateSpeed(fighterData.getAttributes());
        this.timeToNextMove = 0;
        this.movementDirection = movementDirection;
        this.strength = calculateStrength(fighterData.getAttributes());
        this.healthPoints = saf.data.Fighter.MAX_HEALTH;
    }

    /*
     * Constructor provided for animation testing, where both the action and
     * the position are animated.
     */
    public Fighter(saf.data.Fighter fighterData, saf.data.Action initialAction)
    {
        this(fighterData, 0, -1);
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

    public void move(saf.data.Move moveAction, int min, int max)
    {
        System.out.println("<sim.Fighter> min, max " + min + ", " + max);
        position = position.move(Move.determineMoveDistance(moveAction),
                                 movementDirection, min, max);
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

