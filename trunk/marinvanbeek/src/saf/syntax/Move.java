package saf.syntax;

import saf.data.*;

public abstract class Move
{
    public boolean isWellFormed(data.Move moveData,
                                List<String> errorMessages)
    {
        boolean wellFormed = true;

        List<String> legalMoves = data.Move.LEGAL;
        String moveName = moveData.getName();

        if (!legalMoves.contains(moveName))
        {
            errorMessages.add("Illegal move: '" + moveName + "'.");
            wellFormed = false;
        }

        return wellFormed;
    }
}

