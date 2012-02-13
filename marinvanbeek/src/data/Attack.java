package data;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

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

    public String name;

    public Attack(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
}

