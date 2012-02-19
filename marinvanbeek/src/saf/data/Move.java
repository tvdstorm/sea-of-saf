package saf.data;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Move
{
    public static final int WALK_DISTANCE = 10;
    public static final int RUN_DISTANCE = 20;
    public static final int JUMP_HEIGHT = 10;
    public static final int CROUCH_HEIGHT= 5;
    public static final List<String> LEGAL = Collections.unmodifiableList(
            Arrays.asList("jump",
                          "crouch",
                          "stand",
                          "walk_towards",
                          "run_towards",
                          "walk_away",
                          "run_away")
    );

    private ChooseConstruct possibleNames;

    public Move(String name)
    {
        this.possibleNames = new ChooseConstruct(name);
    }

    public Move(List<String> possibleNames)
    {
        this.possibleNames = new ChooseConstruct(possibleNames);
    }

    public static Move getRandom(Random random)
    {
        int randomIndex = random.nextInt(LEGAL.size());

        return new Move(new String(LEGAL.get(randomIndex)));
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

