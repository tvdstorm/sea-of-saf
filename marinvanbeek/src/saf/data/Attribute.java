package saf.data;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Attribute
{
    public static final Integer MAX_VALUE = 10;
    public static final Integer DEFAULT_VALUE = 5;
    public static final List<String> LEGAL = Collections.unmodifiableList(
            Arrays.asList("punch_power", 
                          "punch_reach", 
                          "kick_power", 
                          "kick_reach")
    );

    private String name;
    private int value;

    public Attribute(String name, int value)
    {
        this.name = name;
        this.value = value;
    }

    /*
     * Returns an Attribute List containing all legal attribute names, with a
     * random value.
     */
    public static List<Attribute> getRandomList(Random random)
    {
        List<Attribute> randomAttributes = new ArrayList<Attribute>();

        for (String attributeName : LEGAL)
        {
            randomAttributes.add(new Attribute(new String(attributeName),
                                               random.nextInt(MAX_VALUE) + 1));
        }

        return randomAttributes;
    }

    public static Attribute getRandom(Random random)
    {
        int randomIndex = random.nextInt(LEGAL.size());
        
        return new Attribute(new String(LEGAL.get(randomIndex)), 
                             random.nextInt(MAX_VALUE) + 1);
    }

    public String toString()
    {
        return name + " = " + value;
    }

    public String getName() { return name; }
    public int getValue() { return value; }
}

