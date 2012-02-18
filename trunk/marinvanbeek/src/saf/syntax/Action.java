package saf.syntax;

import saf.data.*;

public abstract class Action
{
    public boolean isWellFormed(data.Action actionData, 
                                List<String> errorMessages)
    {
        data.Move actionMove = actionData.getMove();
        data.Attack actionAttack = actionData.getAttack();

        return Move.isWellFormed(actionMove, errorMessages) &&
               Attack.isWellFormed(actionAttack, errorMessages);
    }
}

