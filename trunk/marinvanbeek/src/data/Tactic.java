package data;

public class Tactic
{
    public Logic condition;
    public Action action;

    public Tactic(Logic condition, Action action)
    {
        this.condition = condition;
        this.action = action;
    }

    public String toString()
    {
        return condition + " [" + action + "]";
    }
}

