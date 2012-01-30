import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;


class Bot
{
    private List<Characteristic> personality;
    private List<BehaviourRule> behaviour;

    public Bot()
    {
        personality = new List<Characteristic>;
        behaviour = new List<BehaviourRule>;
    }

    public addCharacteristic(Characteristic characteristic)
    {
        personality.add(characteristic);
    }

    public addBehaviourRule(BehaviourRule rule)
    {
        behaviour.add(rule);
    }
}

class Characteristic
{
    private String name;
    private int value;

    public Characteristic(String name, int value)
    {
        this.name = name;
        this.value = value;
    }
}

class BehaviourRule
{
    private ConditionTree condition;
    private List<Action> action;

    public BehaviourRule()
    {
        this.action = new List<Action>;
    }
}

interface Evaluable
{
    abstract public bool evaluate(State);
}

class ConditionNode implements Evaluable
{
    private TwoPlaceLogicalOperation operation;
    public Evaluable left;
    public Evaluable right;

    public ConditionNode(LogicalOperation operation)
    {
        this.operation = operation;
    }

    public bool evaluate(State current)
    {
        return True;
    }
}

class ConditionLeaf implements Evaluable
{
    private State state;

    public ConditionLeaf(State state)
    {
        this.state = state;
    }

    public bool evaluate(State current)
    {
        return True;
    }
}

abstract class TwoPlaceLogicalOperation
{
    public bool evaluate(State, State, State);
}

class And
{
    public And() { }

    public bool evaluate(State current, State a, State b)
    {
        return True;
    }
}

class Or
{
    public Or() { }

    public bool evaluate(State current, State a, State b)
    {
        return True;
    }
}

class State
{
    private String id;

    public State(id)
    {
        this.id = id;
    }
}
