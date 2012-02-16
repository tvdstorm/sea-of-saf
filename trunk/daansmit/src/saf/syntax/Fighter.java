package saf.syntax;

import java.util.ArrayList;
import java.util.List;

public class Fighter
{
    private final String name;
    private final List<Characteristic> personality = new ArrayList<Characteristic>();
    private final List<Action> behaviour = new ArrayList<Action>();

    public Fighter(String name)
    {
        this.name = name;
    }

    public void addCharacteristic(Characteristic characteristic)
    {
        personality.add(characteristic);
    }

    public void addAction(Action action)
    {
        behaviour.add(action);
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
