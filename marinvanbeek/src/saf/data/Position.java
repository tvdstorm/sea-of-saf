package saf.data;

import java.util.Random;

public class Position
{
    private int x;
    private int y;

    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Position move(PositionDifference move, int movementDirection, 
                         int min, int max)
    {
        int newX = x + (move.getX() * movementDirection);
        /* Don't increment y: you shouldn't keep going higher or lower. */
        int newY = move.getY();

        if (newX < min)
        {
            newX = min;
        }

        if (newX > max)
        {
            newX = max;
        }

        System.out.println("data.Position, newx, newy, min, max: " + newX + ", " +
                           newY + ", " + min + ", " + max);
        return new Position(newX, newY);
    }

    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

    public int getX() { return x; }
    public int getY() { return y; }
}

