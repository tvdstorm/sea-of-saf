package data;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

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
}

