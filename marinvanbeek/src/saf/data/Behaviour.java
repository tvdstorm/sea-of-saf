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

    /* 
     * Returns 'null' if this Behaviour doesn't contain an always action. This
     * should have been checked by saf.syntax, though.
     */
    public Action getAlwaysAction()
    {
        for (Tactic tactic : tactics)
        {
            Logic condition = tactic.getCondition();
            String conditionName = condition.getName();

            if (conditionName.equals("always"))
            {
                return tactic.getAction();
            }
        }

        return null;
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

