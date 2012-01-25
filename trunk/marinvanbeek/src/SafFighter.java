//package saf.syntax;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

interface ISyntaxCheck
{
    public boolean isWellFormed();
}

public class SafFighter implements ISyntexCheck
{
    public static final Integer MAX_HEALTH = 100;

    private String name;
    private int healthPoints;
    private List<SafAttribute> attributes;
    private SafBehaviour behaviour;

    public SafFighter(String name, List<SafAttribute> attributes,
                      SafBehaviour behaviour)
    {
        this.name = name;
        this.healthPoints = MAX_HEALTH;
        this.attributes = attributes;
        this.behaviour = behaviour;
    }

    public SafAction act(SafState state)
    {
        return new SafAction(new SafMove("illegal_name"), 
                             new SafAttack("illegal_name"));
    }
}

class SafAttribute
{
    /* This is determined by the value defined in the grammar (SAF.g). */
    public static final Integer MAX_VALUE = 10;
    public static final List<String> LEGAL = Collections.unmodifiableList(
            Arrays.asList("punch_power", 
                          "punch_reach", 
                          "kick_power", 
                          "kick_reach")
    );

    private String name;
    private int value;

    public SafAttribute(String name, int value)
    {
        this.name = name;
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public int getValue()
    {
        return value;
    }
}

class SafBehaviour
{
    private SafTactic[] tactics;

    public SafBehaviour()
    {
    }

    public SafAction chooseAction(SafState state)
    {
        return new SafAction(new SafMove("illegal_name"), 
                             new SafAttack("illegal_name"));
    }
}

class SafTactic
{
    private SafLogic condition;
    private SafAction action;

    public SafTactic(SafLogic condition, SafAction action)
    {
        this.condition = condition;
        this.action = action;
    }
}

interface SafLogic
{
    public boolean isTrue(SafState state);
}

class SafLogicOperator implements SafLogic
{
    private String name;
    private SafLogic[] subLogic;

    public SafLogicOperator(String name, SafLogic[] subLogic)
    {
        this.name = name;
        this.subLogic = subLogic;
    }

    public boolean isTrue(SafState state)
    {
        return true;
    }
}

class SafCondition implements SafLogic
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

    private String name;

    public SafCondition(String name)
    {
        this.name = name;
    }

    public boolean isTrue(SafState state)
    {
        return true;
    }
}

class SafAction
{
    private SafMove move;
    private SafAttack attack;

    public SafAction(SafMove move, SafAttack attack)
    {
        this.move = move;
        this.attack = attack;
    }
}

class SafMove
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

    private String name;

    public SafMove(String name)
    {
        this.name = name;
    }
}

class SafAttack
{
    public static final List<String> LEGAL = Collections.unmodifiableList(
            Arrays.asList("punch_low",
                          "punch_high",
                          "kick_low",
                          "kick_high",
                          "block_low",
                          "block_high")
    );

    private String name;

    public SafAttack(String name)
    {
        this.name = name;
    }
}

