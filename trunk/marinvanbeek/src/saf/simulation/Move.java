package saf.simulation;

import saf.data.*;

public abstract class Move
{
    public static PositionDifference determineMoveDistance(saf.data.Move move)
    {
        String moveName = move.getName();
        PositionDifference moveDistance;

        if (moveName.equals("jump"))
        {
            moveDistance = new PositionDifference(0,
                                                  saf.data.Move.JUMP_HEIGHT);
        }
        else if (moveName.equals("crouch"))
        {
            moveDistance = new PositionDifference(0,
                                                  saf.data.Move.CROUCH_HEIGHT);
        }
        else if (moveName.equals("stand"))
        {
            moveDistance = new PositionDifference(0,0);
        }
        else if (moveName.equals("walk_towards"))
        {
            moveDistance = new PositionDifference(saf.data.Move.WALK_DISTANCE, 
                                                  0);
        }
        else if (moveName.equals("run_towards"))
        {
            moveDistance = new PositionDifference(saf.data.Move.RUN_DISTANCE, 
                                                  0);
        }
        else if (moveName.equals("walk_away"))
        {
            moveDistance = new PositionDifference(-saf.data.Move.WALK_DISTANCE,
                                                  0);
        }
        else /* if (moveName.equals("run_away")) */
        {
            moveDistance = new PositionDifference(-saf.data.Move.RUN_DISTANCE, 
                                                  0);
        }

        return moveDistance;
    }
}

