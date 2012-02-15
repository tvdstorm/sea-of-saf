package simulation;

import data.*;

public class Action extends data.Action {
    public Action(data.Action actionData)
    {
        super(new Move(actionData.move),
              new Attack(actionData.attack));
    }

    public Action(Move move, Attack attack)
    {
        super(move, attack);
    }
}

