import java.util.ArrayList;
import java.util.Arrays;

public class SafFighter
{
    String name;
    SafAttribute[] attributes;
    SafBehaviour behaviour;

    public SafFighter(String name, SafAttribute[] attributes, SafBehaviour behaviour)
    {
        this.name = name;
        this.attributes = attributes;
        this.behaviour = behaviour;
    }

    public SafAction act(SafState state)
    {
        return new SafAction(new SafMove("illegal"), new SafAttack("illegal"));
    }
}

class SafAttribute
{
    public static final ArrayList<String> LEGAL = new ArrayList<String>(
            Arrays.asList("punch_power", 
                          "punch_reach", 
                          "kick_power", 
                          "kick_reach"));

    private String name;
    private int value;

    public SafAttribute()
    {
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
        return new SafAction(new SafMove("illegal"), new SafAttack("illegal"));
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
    public static final ArrayList<String> REQUIRED = new ArrayList<String>(
            Arrays.asList("always"));

    public static final ArrayList<String> LEGAL = new ArrayList<String>(
            Arrays.asList("stronger",
                          "much_stronger",
                          "weaker",
                          "much_weaker",
                          "even",
                          "near",
                          "far"));

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
    public static final ArrayList<String> LEGAL = new ArrayList<String>(
            Arrays.asList("jump",
                          "crouch",
                          "stand",
                          "walk_towards",
                          "run_towards",
                          "walk_away",
                          "run_away"));

    private String name;

    public SafMove(String name)
    {
        this.name = name;
    }
}

class SafAttack
{
    public static final ArrayList<String> LEGAL = new ArrayList<String>(
            Arrays.asList("punch_low",
                          "punch_high",
                          "kick_low",
                          "kick_high",
                          "block_low",
                          "block_high"));

    private String name;

    public SafAttack(String name)
    {
        this.name = name;
    }
}

