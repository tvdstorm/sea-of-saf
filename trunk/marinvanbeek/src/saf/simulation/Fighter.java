package saf.simulation;

import saf.data.*;

import java.lang.Math;
import java.util.List;

public class Fighter {
    private saf.data.Fighter fighterData;

    private int timeToNextMove;
    private int movementDirection;
    private int speed;
    private int strength;

    public Fighter(saf.data.Fighter fighterData, int startingX, 
                   int movementDirection)
    {
        this.fighterData = fighterData;
        this.fighterData.setPosition(new Position(startingX, 0));

        this.speed = calculateSpeed(fighterData.getAttributes());
        this.timeToNextMove = 0;
        this.movementDirection = movementDirection;
        this.strength = calculateStrength(fighterData.getAttributes());
        this.fighterData.setHealth(saf.data.Fighter.MAX_HEALTH);
    }

    /*
     * Constructor provided for animation testing, where both the action and
     * the position are animated.
     */
    public Fighter(saf.data.Fighter fighterData, saf.data.Action initialAction,
                   int startingX)
    {
        this(fighterData, startingX, 1);
        this.fighterData.setAction(initialAction);
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
        saf.data.Behaviour fighterBehaviour = fighterData.getBehaviour();
        saf.data.Action action = Behaviour.determineAction(fighterBehaviour, 
                                                           state);
        fighterData.setAction(action);
        timeToNextMove = speed;

        return action;
    }

    public void move(saf.data.Move moveAction, int min, int max)
    {
        PositionDifference moveDistance = 
                Move.determineMoveDistance(moveAction);
        Position previousPosition = fighterData.getPosition();

        Position newPosition = previousPosition.move(moveDistance, 
                                                     movementDirection, 
                                                     min, max);
        fighterData.setPosition(newPosition);
    }

    public void defend(saf.data.Attack attack, State state)
    {
        int damage = Attack.determineDamage(attack, state);
        int currentHealth = fighterData.getHealth();

        fighterData.setHealth(currentHealth - damage);
    }

    public boolean isAlive()
    {
        return getHealth() > 0;
    }

    public void tick()
    {
        timeToNextMove -= 1;
    }

    public boolean mayAct()
    {
        return timeToNextMove == 0;
    }

    public Position getPosition() { return fighterData.getPosition(); }
    public saf.data.Action getAction() { return fighterData.getAction(); }
    public int getStrength() { return strength; }
    public int getHealth() { return fighterData.getHealth(); }
    public saf.data.Fighter getData() { return fighterData; }
}

