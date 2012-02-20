package saf.syntax;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

import saf.check.CheckLog;

public class Fighter extends ASTNode
{
    private static final int DEFAULT_CHARACTERISTIC_VALUE = 5;

    private final String name;
    private final List<Characteristic> personality;
    private final List<Action> behaviour;

    public Fighter(String name, List<Characteristic> personality, List<Action> behaviour)
    {
        this.name = name;
        this.personality = personality;
        this.behaviour = behaviour;
    }

    public String getName() { return name; }

    public int getSpeed()
    {
        double weight = (getCharacteristic("punchPower") + getCharacteristic("kickPower")) / 2.0;
        double height = (getCharacteristic("punchReach") + getCharacteristic("kickReach")) / 2.0;
        return ((int) Math.round(Math.abs((height - weight) / 2)));        
    }

    public int getCharacteristic(String name)
    {
        for (Characteristic c : personality)
        {
            if (name.equals(c.getName()))
            {
                return c.getValue();
            }
        }
        return DEFAULT_CHARACTERISTIC_VALUE;
    }

    public List<Action> getMatchingActions(List<State> situation)
    {
        List<Action> actions = new ArrayList<Action>();
        for (Action current : behaviour)
        {
            if (current.matches(situation))
            {
                actions.add(current);
            }
        }
        return actions;
    }

    public Action getAlways()
    {
        for (Action current : behaviour)
        {
            if (current.isAlways())
            {
                return current;
            }
        }
        return null;
    }

    public void check(CheckLog log)
    {
        for (Characteristic c : personality)
        {
            c.check(log);
        }
        boolean hasAlwaysRule = false;
        for (Action a : behaviour)
        {
            hasAlwaysRule |= a.isAlways();
            a.check(log);
        }
        if (!hasAlwaysRule)
        {
            log.add(new saf.check.Error("Fighter has no always rule.", this));
        }
    }

    public String toString()
    {
        String fighter = name + " {\n";
        for (Characteristic c : personality)
        {
            fighter += "  " + c.toString() + "\n";
        }
        for (Action a : behaviour)
        {
            fighter += "  " + a.toString() + "\n";
        }
        return fighter + "}\n";
    }
}
