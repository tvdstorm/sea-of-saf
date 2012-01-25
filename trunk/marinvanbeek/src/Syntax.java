//package saf.syntax;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

interface SyntaxCheck
{
    public boolean isWellFormed(List<String> errorMessages);
}

class Fighter implements SyntaxCheck
{
    public static final Integer MAX_HEALTH = 100;

    private String name;
    private int healthPoints;
    private List<Attribute> attributes;
    private Behaviour behaviour;

    public Fighter(String name, List<Attribute> attributes,
                      Behaviour behaviour)
    {
        this.name = name;
        this.healthPoints = MAX_HEALTH;
        this.attributes = attributes;
        this.behaviour = behaviour;
    }

    public boolean isWellFormed(List<String> errorMessages)
    {
        for (Attribute attribute : attributes)
        {
            attribute.isWellFormed(errorMessages);
        }

        return behaviour.isWellFormed(errorMessages);
    }

    public Action act(State state)
    {
        return new Action(new Move("illegal_name"), 
                             new Attack("illegal_name"));
    }
}

class Attribute implements SyntaxCheck
{
    public static final Integer MAX_VALUE = 10;
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

    public boolean isWellFormed(List<String> errorMessages)
    {
        boolean wellFormed = true;

        if (!LEGAL.contains(name))
        {
            errorMessages.add("Illegal attribute name: '" + name + "'.");
            wellFormed = false;
        }

        if (!((value > 0) && (value <= MAX_VALUE)))
        {
            errorMessages.add("Illegal attribute value: '" + value + "'.");
            wellFormed = false;
        }

        return wellFormed;
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

class Behaviour implements SyntaxCheck
{
    private List<Tactic> tactics;

    public Behaviour(List<Tactic> tactics)
    {
        this.tactics = tactics;
    }

    public Action chooseAction(State state)
    {
        return new Action(new Move("illegal_name"), 
                             new Attack("illegal_name"));
    }

    public boolean isWellFormed(List<String> errorMessages)
    {
        boolean wellFormed = true;

        boolean hasRequired = false;
        for (String requiredCondition : Condition.REQUIRED)
        {
            hasRequired = false;
            for (Tactic tactic : tactics)
            {
                if (tactic.getCondition().hasCondition(requiredCondition))
                {
                    hasRequired = true;
                }
            }

            if (!hasRequired)
            {
                errorMessages.add("Missing required condition: '" +
                                  requiredCondition + "'.");
                wellFormed = false;
            }
        }

        return wellFormed;
    }
}

class Tactic implements SyntaxCheck
{
    private Logic condition;
    private Action action;

    public Tactic(Logic condition, Action action)
    {
        this.condition = condition;
        this.action = action;
    }

    public boolean isWellFormed(List<String> errorMessages)
    {
        return condition.isWellFormed(errorMessages) &&
               action.isWellFormed(errorMessages);
    }

    public Logic getCondition()
    {
        return condition;
    }
}

interface Logic extends SyntaxCheck
{
    public boolean isTrue(State state);
    public boolean hasCondition(String condition);
}

abstract class LogicOperator implements Logic
{
    protected Logic operand1;
    protected Logic operand2;

    public LogicOperator(Logic operand1, Logic operand2)
    {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public boolean hasCondition(String condition)
    {
        return false;
    }

    public boolean isWellFormed(List<String> errorMessages)
    {
        return true;
    }
}

class LogicAnd extends LogicOperator
{
    public LogicAnd(Logic operand1, Logic operand2)
    {
        super(operand1, operand2);
    }

    public boolean isTrue(State state)
    {
        return operand1.isTrue(state) && 
               operand2.isTrue(state);
    }
}

class LogicOr extends LogicOperator
{
    public LogicOr(Logic operand1, Logic operand2)
    {
        super(operand1, operand2);
    }

    public boolean isTrue(State state)
    {
        return operand1.isTrue(state) || 
               operand2.isTrue(state);
    }
}

class Condition implements Logic
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

    public Condition(String name)
    {
        this.name = name;
    }

    public boolean isTrue(State state)
    {
        return true;
    }

    public boolean hasCondition(String condition)
    {
        return name.equals(condition);
    }

    public boolean isWellFormed(List<String> errorMessages)
    {
        boolean wellFormed = true;

        if (!(REQUIRED.contains(name) || LEGAL.contains(name)))
        {
            errorMessages.add("Illegal condition: '" + name + "'.");
            wellFormed = false;
        }

        return wellFormed;
    }
}

class Action implements SyntaxCheck
{
    private Move move;
    private Attack attack;

    public Action(Move move, Attack attack)
    {
        this.move = move;
        this.attack = attack;
    }

    public boolean isWellFormed(List<String> errorMessages)
    {
        return move.isWellFormed(errorMessages) &&
               attack.isWellFormed(errorMessages);
    }
}

class Move implements SyntaxCheck
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

    public Move(String name)
    {
        this.name = name;
    }

    public boolean isWellFormed(List<String> errorMessages)
    {
        boolean wellFormed = true;

        if (!LEGAL.contains(name))
        {
            errorMessages.add("Illegal move: '" + name + "'.");
            wellFormed = false;
        }

        return wellFormed;
    }
}

class Attack implements SyntaxCheck
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

    public Attack(String name)
    {
        this.name = name;
    }

    public boolean isWellFormed(List<String> errorMessages)
    {
        boolean wellFormed = true;

        if (!LEGAL.contains(name))
        {
            errorMessages.add("Illegal attack: '" + name + "'.");
            wellFormed = false;
        }

        return wellFormed;
    }
}

