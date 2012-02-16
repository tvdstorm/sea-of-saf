package saf.syntax;

public class Action
{
    private Evaluable condition;
    private Response move;
    private Response fight;

    public Action(Evaluable condition, Response move, Response fight)
    {
        this.condition = condition;
        this.move = move;
        this.fight = fight;
    }

    public String toString()
    {
        return condition.toString() + " [" + move.toString()
            + " " + fight.toString() + "]";
    }
}
