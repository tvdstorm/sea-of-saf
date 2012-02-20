package saf.data;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Fighter
{
    public static final int MAX_HEALTH = 100;

    private String name;
    private List<Attribute> attributes;
    private Behaviour behaviour;

    private int healthPoints = MAX_HEALTH;
    private Position position = new Position(0,0);
    private Action previousAction = new Action(new Move(Move.LEGAL.get(0)), 
                                               new Attack(Attack.LEGAL.get(0)));

    public Fighter(String name, List<Attribute> attributes,
                      Behaviour behaviour)
    {
        this.name = name;
        this.attributes = attributes;
        this.behaviour = behaviour;
    }

    public Fighter(Fighter f)
    {
        this.name = f.getName();
        this.attributes = f.getAttributes();
        this.behaviour = f.getBehaviour();

        this.healthPoints = f.getHealth();
        this.position = f.getPosition();
        this.previousAction = f.getAction();
    }

    public static Fighter getRandom(int seed)
    {
        Random random = new Random(seed);

        return new Fighter(seed + "",
                           Attribute.getRandomList(random),
                           Behaviour.getRandom(random));
    }

    public String toString()
    {
        String stringRep = name + "\n{\n";

        for (Attribute attribute : attributes)
        {
            stringRep += "    " + attribute + "\n";
        }

        stringRep += behaviour + "}\n";

        return stringRep;
    }

    public String getName() { return name; }
    public List<Attribute> getAttributes() { return attributes; }
    public Behaviour getBehaviour() { return behaviour; }

    public int getHealth() { return healthPoints; }
    public void setHealth(int health) { this.healthPoints = health; }
    public Position getPosition() { return position; }
    public void setPosition(Position position) { this.position = position; }
    public Action getAction() { return previousAction; }
    public void setAction(Action action) { this.previousAction = action; }
}

