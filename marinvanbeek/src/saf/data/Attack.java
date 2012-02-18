package saf.data;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Attack
{
    public static final List<String> LEGAL = Collections.unmodifiableList(
            Arrays.asList("punch_low",
                          "punch_high",
                          "kick_low",
                          "kick_high",
                          "block_low",
                          "block_high")
    );

    private ChooseConstruct possibleNames;

    public Attack(String name)
    {
        this.possibleNames = new ChooseConstruct(name);
    }

    public Attack(List<String> possibleNames)
    {
        this.possibleNames = new ChooseConstruct(possibleNames);
    }

    public static Attack getRandom(Random random)
    {
        int randomIndex = random.nextInt(LEGAL.size());

        return new Attack(new String(LEGAL.get(randomIndex)));
    }

    public String toString()
    {
        return possibleNames.toString();
    }
    
    public String getName() { return possibleNames.getName(); }
    public List<String> getAllPossibilities() 
    { 
        return possibleNames.getAllPossibilities(); 
    }
}

