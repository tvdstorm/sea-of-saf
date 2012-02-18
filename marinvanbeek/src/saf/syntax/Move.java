package saf.syntax;

import saf.data.*;

import java.util.List;

public abstract class Move
{
    public static boolean isWellFormed(saf.data.Move moveData,
                                       List<String> errorMessages)
    {
        boolean wellFormed = true;

        List<String> legalMoves = saf.data.Move.LEGAL;
        List<String> possibleNames = moveData.getAllPossibilities();

        for (String moveName : possibleNames)
        {
            if (!legalMoves.contains(moveName))
            {
                errorMessages.add("Illegal move: '" + moveName + "'.");
                wellFormed = false;
            }
        }

        return wellFormed;
    }
}

