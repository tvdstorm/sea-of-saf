//import org.testng.annotations.*;
import org.junit.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.lang.Long;

public class FightTest
{
//    @Beforeclass
//    public void setUp()
//    {
//        // code that will be invoked when this test is instantiated
//    }
//
//    @Afterclass
//    public void tearDown()
//    {
//        // code that will be invoked when this test is instantiated
//    }

    @Test
    public void testRandomFighter()
    {
        Random random = new Random(0);

        System.out.println(getRandomFighter(random.nextInt()));
    }

    @Test
    public void testFight()
    {
        Random random = new Random(0);

        Fighter fighter1 = getRandomFighter(random.nextInt());
        Fighter fighter2 = getRandomFighter(random.nextInt());

        /* Arena.fight(f1,f2) => winner. */
    }





    public void getRandomState(long seed)
    {
        Random random = new Random(seed);
        
        /* Generate random State. */
    }



    public Fighter getRandomFighter(long seed)
    {
        Random random = new Random(seed);

        Fighter fighter = new Fighter(Long.toString(seed),
                                      getRandomAttributes(random),
                                      new Behaviour(getRandomTactics(random)));

        return fighter;
    }

    public List<Attribute> getRandomAttributes(Random random)
    {
        List<String> legalAttributes = Attribute.LEGAL;
        List<Attribute> attributes = new ArrayList<Attribute>();
        for (String legalAttribute : legalAttributes)
        {
            int value = random.nextInt(Attribute.MAX_VALUE) + 1;
            attributes.add(new Attribute(legalAttribute, value));
        }

        return attributes;
    }

    public List<Tactic> getRandomTactics(Random random)
    {
        List<Tactic> tactics = new ArrayList<Tactic>();
        List<String> requiredConditions = Condition.REQUIRED;

        int nrTactics = random.nextInt(10) + 1;
        int i = 0;
        for (i = 0; i < nrTactics; i++)
        {
            tactics.add(new Tactic(getRandomLogic(random),
                                   getRandomAction(random)));
        }


        for (String requiredCondition : requiredConditions)
        {
            tactics.add(new Tactic(new Condition(requiredCondition),
                                   getRandomAction(random)));
        }

        return tactics;
    }

    public Logic getRandomLogic(Random random)
    {
        int logicTreeDepth = random.nextInt(2);

        return getRandomLogic(random, logicTreeDepth);
    }
    
    public Logic getRandomLogic(Random random, int depth)
    {
        boolean isLogicAnd = random.nextBoolean();

        if (depth == 0)
        {
            return getRandomCondition(random);
        }

        if (isLogicAnd)
        {
            if (depth == 1)
            {
                return new LogicAnd(getRandomCondition(random), 
                                    getRandomCondition(random));
            } else
            {
                return new LogicAnd(getRandomLogic(random, depth-1), 
                                    getRandomLogic(random, depth-1));
            }
        } else
        {
            if (depth == 1)
            {
                return new LogicOr(getRandomCondition(random), 
                                   getRandomCondition(random));
            } else
            {
                return new LogicOr(getRandomLogic(random, depth-1), 
                                   getRandomLogic(random, depth-1));
            }
        }
    }

    public Condition getRandomCondition(Random random)
    {
        List<String> legalConditions = Condition.LEGAL;

        return new Condition(pickElementFrom(legalConditions,random));
    }

    public Action getRandomAction(Random random)
    {
        List<String> legalMoves = Move.LEGAL;
        List<String> legalAttacks = Attack.LEGAL;

        return new Action(new Move(pickElementFrom(legalMoves,random)),
                          new Attack(pickElementFrom(legalAttacks,random)));
    }

    public static <T> T pickElementFrom(List<T> list, Random random)
    {
        int elementIndex = random.nextInt(list.size());

        return list.get(elementIndex);
    }
}

