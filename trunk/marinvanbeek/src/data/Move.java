package data;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Move
{
    public static final List<String> LEGAL = Collections.unmodifiableList(
            Arrays.asList("jump",
                          "crouch",
                          "stand",
                          "walk_towards",
                          "run_towards",
                          "walk_away",
                          "run_away")
    );

    public String name;

    public Move(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
}

