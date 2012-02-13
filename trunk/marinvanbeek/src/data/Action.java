package data;

public class Action
{
    public Move move;
    public Attack attack;

    public Action(Move move, Attack attack)
    {
        this.move = move;
        this.attack = attack;
    }

    public String toString()
    {
        return move + " " + attack;
    }
}

