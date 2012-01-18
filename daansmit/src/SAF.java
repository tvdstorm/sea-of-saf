import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;


class SAFException extends org.antlr.runtime.RecognitionException
{
    public String message;

    public SAFException(String message)
    {
        this.message = message;
    }

    public String toString()
    {
        return message;
    }
}


class SAFTree extends CommonTree
{
    public SAFTree() { }

    public SAFTree(SAFTree node) { }

    public SAFTree(Token t)
    {
        token = t;
    }

    public SAFTree(int ttype)
    {
        token = new CommonToken(ttype, "<" + this.getClass().getName() + ">");
    }

    public SAFTree(int ttype, Token id)
    {
        token = new CommonToken(ttype, id.getText());
    }

    public SAFTree(int ttype, String id)
    {
        token = new CommonToken(ttype, id);
    }

    public boolean isWelformed()
    {
        return childrenWelformed();
    }

    public boolean childrenWelformed()
    {
        boolean welformed = true;
        for (Object child : getChildren())
        {
            welformed &= ((SAFTree)child).isWelformed();
        }
        return welformed;
    }

    public String toString()
    {
        return token.getText() + "<" + this.getClass().getName() + ">";
    }
}


class Bot extends SAFTree
{
    public Bot(int ttype, Token id) { super(ttype, id); }
}


class Personality extends SAFTree
{
    public Personality(int ttype) { super(ttype); }
}

class Behaviour extends SAFTree
{
    public Behaviour(int ttype) { super(ttype); }

    // public boolean childrenWelformed()
    // {
    //     boolean hasAlwaysRule = false;
    //     for (Object rule : getChildren())
    //     {
    //         SAFTree condition = ((SAFTree) rule).getFirstChildWithType(CONDITION);
    //         hasAlwaysRule |= condition.getChildCount() == 1
    //             && condition.getChild(0).getText() == "always";
    //     }
    //     return hasAlwaysRule && childrenWelformed();
    // }
}

class Characteristic extends SAFTree
{
    public Characteristic(int ttype, Token id) { super(ttype, id); }
}

class Digit extends SAFTree
{
    public int value;

    public Digit(int ttype, Token value)
    {
        this.value = Integer.parseInt(value.getText());
        token = new CommonToken(ttype, Integer.toString(this.value));
    }
}

class Condition extends SAFTree
{
    public Condition(int ttype) { super(ttype); }
}

class Rule extends SAFTree
{
    public Rule(int ttype) { super(ttype); }
}

class And extends SAFTree
{
    public And(Token t) { super(t); }
}

class Or extends SAFTree
{
    public Or(Token t) { super(t); }
}

class State extends SAFTree
{
    public State(int ttype, Token id) { super(ttype, id); }
}

class Action extends SAFTree
{
    public Action(int ttype) { super(ttype); }
}

class Choose extends SAFTree
{
    public Choose(Token t) { super(t); }
}

class MoveAction extends SAFTree
{
    public MoveAction(int ttype, Token id) { super(ttype, id); }
}

class FightAction extends SAFTree
{
    public FightAction(int ttype, Token id) { super(ttype, id); }
}
