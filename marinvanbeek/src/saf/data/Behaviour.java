package saf.data;

import java.util.List;
import java.util.Random;

public class Behaviour
{
    private List<Tactic> tactics;

    public Behaviour(List<Tactic> tactics)
    {
        this.tactics = tactics;
    }

    public static Behaviour getRandom(Random random)
    {
        return new Behaviour(Tactic.getRandomList(random));
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

    public List<Tactic> getTactics() { return tactics; }
}

