package simulation;

import data.*;

public class Move extends data.Move
{
    public Move (data.Move moveData)
    {
        super(new String(moveData.name));
    }

    public static int determineDistance(Move move)
    {
        return 0;
    }
}

