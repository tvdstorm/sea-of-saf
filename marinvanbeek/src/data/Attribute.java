package data;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Attribute
{
    public static final Integer MAX_VALUE = 10;
    public static final List<String> LEGAL = Collections.unmodifiableList(
            Arrays.asList("punch_power", 
                          "punch_reach", 
                          "kick_power", 
                          "kick_reach")
    );

    public String name;
    public int value;

    public Attribute(String name, int value)
    {
        this.name = name;
        this.value = value;
    }

    public String toString()
    {
        return name + " = " + value;
    }
}

