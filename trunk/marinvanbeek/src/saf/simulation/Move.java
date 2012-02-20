package saf.simulation;

import saf.data.*;

public abstract class Move
{
    public static PositionDifference determineMoveDistance(saf.data.Move move)
    {
        String moveName = move.getName();
        int moveDistance;
        int height;

        if (moveName.equals("jump"))
        {
            moveDistance = 0;
            height = saf.data.Move.JUMP_HEIGHT;
        }
        else if (moveName.equals("crouch"))
        {
            moveDistance = 0;
            height = saf.data.Move.CROUCH_HEIGHT;
        }
        else if (moveName.equals("stand"))
        {
            moveDistance = 0;
            height = saf.data.Move.STAND_HEIGHT;
        }
        else if (moveName.equals("walk_towards"))
        {
            moveDistance = saf.data.Move.WALK_DISTANCE;
            height = saf.data.Move.STAND_HEIGHT;
        }
        else if (moveName.equals("run_towards"))
        {
            moveDistance = saf.data.Move.RUN_DISTANCE;
            height = saf.data.Move.STAND_HEIGHT;
        }
        else if (moveName.equals("walk_away"))
        {
            moveDistance = -saf.data.Move.WALK_DISTANCE;
            height = saf.data.Move.STAND_HEIGHT;
        }
        else /* if (moveName.equals("run_away")) */
        {
            moveDistance = -saf.data.Move.RUN_DISTANCE;
            height = saf.data.Move.STAND_HEIGHT;
        }

        return new PositionDifference(moveDistance, height);
    }
}

