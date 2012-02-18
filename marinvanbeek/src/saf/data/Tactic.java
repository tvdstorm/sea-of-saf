package saf.data;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Tactic
{
    private Logic condition;
    private Action action;

    public Tactic(Logic condition, Action action)
    {
        this.condition = condition;
        this.action = action;
    }

    public static List<Tactic> getRandomList(Random random)
    {
        List<Condition> requiredConditions = Condition.getRequired();
        List<Logic> randomLogics =
                Logic.RandomLogicGenerator.getRandomList(random);
        List<Tactic> randomTactics = new ArrayList<Tactic>();

        for (Logic randomLogic : randomLogics)
        {
            randomTactics.add(new Tactic(randomLogic, 
                                         Action.getRandom(random)));
        }

        for (Condition requiredCondition : requiredConditions)
        {
            randomTactics.add(new Tactic(requiredCondition, 
                                         Action.getRandom(random)));
        }

        return randomTactics;
    }


    public static Tactic getRandom(Random random)
    {
        return new Tactic (Logic.RandomLogicGenerator.getRandom(random),
                           Action.getRandom(random));
    }

    public String toString()
    {
        return condition + " [" + action + "]";
    }

    public Logic getCondition() { return condition; }
    public Action getAction() { return action; }
}

