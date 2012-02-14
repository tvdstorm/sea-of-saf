package data;

import java.util.Random;

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

    public static Action getRandom(Random random)
    {
        return new Action(Move.getRandom(random),
                          Attack.getRandom(random));
    }
}

