import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;


class Bot extends CommonTree
{
    public Bot(int ttype)
    {
        token = new CommonToken(ttype, "<Bot>");
    }

    public Bot(int ttype, String s)
    {
        token = new CommonToken(ttype, s);
    }
}


class Personality extends CommonTree
{
    public Personality(int ttype)
    {
        token = new CommonToken(ttype, "<Personality>");
    }
}

class Behaviour extends CommonTree
{
    public Behaviour(int ttype)
    {
        token = new CommonToken(ttype, "<Behaviour>");
    }
}

class Characteristic extends CommonTree
{
    public String name;
    public int value;

    public Characteristic(int ttype, String name, String value)
    {
        this.name = name;
        this.value = Integer.parseInt(value);

        token = new CommonToken(ttype, this.name + ": "
                                + Integer.toString(this.value));
    }
}

class Condition extends CommonTree
{
    public Condition(int ttype)
    {
        token = new CommonToken(ttype, "<Condition>");
    }
}

class State extends CommonTree
{
    public String id;

    public State(int ttype, String id)
    {
        this.id = id;

        token = new CommonToken(ttype, "<State=" + this.id);
    }
}

abstract class Action extends CommonTree { }

class Choose extends Action
{
    public Choose(int ttype)
    {
        token = new CommonToken(ttype, "<Choose>");
    }
}

class MoveAction extends Action
{
    public MoveAction(int ttype, String id)
    {
        token = new CommonToken(ttype, id);
    }
}

class FightAction extends Action
{
    public FightAction(int ttype, String id)
    {
        token = new CommonToken(ttype, id);
    }
}
