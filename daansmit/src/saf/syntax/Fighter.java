package saf.syntax;

import java.util.ArrayList;
import java.util.List;

public class Fighter
{
    private final String name;
    private final List<Characteristic> personality;
    private final List<Action> behaviour;

    public Fighter(String name, List<Characteristic> personality, List<Action> behaviour)
    {
        this.name = name;
        this.personality = personality;
        this.behaviour = behaviour;
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
