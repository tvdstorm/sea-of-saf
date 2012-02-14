package data;

import java.util.List;
import java.util.Random;

public class Behaviour
{
    public List<Tactic> tactics;

    public Behaviour(List<Tactic> tactics)
    {
        this.tactics = tactics;
    }

    public String toString()
    {
        String s = "";
        for (Tactic tactic : tactics)
        {
            s += "    " + tactic + "\n";
        }

        return s;
    }

    public static Behaviour getRandom(Random random)
    {
        return new Behaviour(Tactic.getRandomList(random));
    }
}

