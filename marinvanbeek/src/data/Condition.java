package data;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Condition implements Logic
{
    public static final List<String> REQUIRED = Collections.unmodifiableList(
            Arrays.asList("always")
    );

    public static final List<String> LEGAL = Collections.unmodifiableList(
            Arrays.asList("stronger",
                          "much_stronger",
                          "weaker",
                          "much_weaker",
                          "even",
                          "near",
                          "far")
    );

    public String name;

    public Condition(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }

    public static Condition getRandom(Random random)
    {
        int randomIndex = random.nextInt(LEGAL.size());
        
        return new Condition(new String(LEGAL.get(randomIndex)));
    }

    public static List<Condition> getRequired()
    {
        List<Condition> requiredConditions = new ArrayList<Condition>();

        for (String requiredCondition : REQUIRED)
        {
            requiredConditions.add(
                    new Condition(new String(requiredCondition)));
        }

        return requiredConditions;
    }
//
//    public static List<Condition> getRandomList(Random random)
//    {
//        List<Condition> randomConditions = new ArrayList<Condition>();
//        int numberOfConditions = random.nextInt(6);
//
//        for (int i = 0; i < numberOfConditions; i++)
//        {
//            randomConditions.add(getRandom());
//        }
//
//        return randomConditions;
//    }
}

