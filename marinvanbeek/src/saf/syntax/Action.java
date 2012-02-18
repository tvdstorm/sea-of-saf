package saf.syntax;

import saf.data.*;

import java.util.List;

public abstract class Action
{
    public static boolean isWellFormed(saf.data.Action actionData, 
                                       List<String> errorMessages)
    {
        saf.data.Move actionMove = actionData.getMove();
        saf.data.Attack actionAttack = actionData.getAttack();

        return Move.isWellFormed(actionMove, errorMessages) &&
               Attack.isWellFormed(actionAttack, errorMessages);
    }
}

