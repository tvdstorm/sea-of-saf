package saf.simulation;

import saf.data.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public abstract class Behaviour
{
    /*
     * Returns the correct action by checking which conditions are true in
     * 'state' and then randomly picking one of the actions associated with
     * these conditions.
     * Returns the always action if no conditions are true.
     */
    public static saf.data.Action determineAction(
            saf.data.Behaviour behaviour, State state)
    {
        List<saf.data.Tactic> tactics = behaviour.getTactics();
        List<saf.data.Action> viableActions = new ArrayList<saf.data.Action>();

        for (saf.data.Tactic tactic : tactics)
        {
            saf.data.Logic condition = tactic.getCondition();
            saf.data.Action action = tactic.getAction();

            if (Logic.isTrue(condition, state))
            {
                viableActions.add(action);
            }
        }

        if (viableActions.size() > 0)
        {
            Random random = new Random();
            int randomIndex = random.nextInt(viableActions.size());

            return viableActions.get(randomIndex);
        }
        else
        {
            return behaviour.getAlwaysAction();
        }
    }
}

