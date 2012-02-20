package saf.syntax;

import java.util.Arrays;
import java.util.List;

import saf.check.CheckLog;

public class Characteristic extends ASTNode
{
    private static final List<String> CHARACTERISTICS =
        Arrays.asList("kickPower", "kickReach", "punchPower", "punchReach");

    private final String name;
    private final int value;

    public Characteristic(String name, int value)
    {
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }
    public int getValue() { return value; }

    @Override
    public void check(CheckLog log)
    {
        if (value < 1)
        {
            log.add(new saf.check.Error("Characteristics can't be lower than 1.", this));
        }
        else if (value > 10)
        {
            log.add(new saf.check.Error("Characteristics can't be higher than 10.", this));
        }
        if (!CHARACTERISTICS.contains(name))
        {
            log.add(new saf.check.Warning("Unknown characteristic \"" + name
                                          + "\" is ignored. Valid characteristics: "
                                          + CHARACTERISTICS.toString(), this));
        }
    }

    public String toString()
    {
        return name + " = " + Integer.toString(value);
    }
}
