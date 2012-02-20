package saf.simulation;

import java.lang.Math;

public class Coordinate
{
    private static final int MAX = 1000;

    private int x;

    public Coordinate(int x)
    {
        this.x = x;
    }

    /* 
     * Returns 1 if target is on the right
     *         0 if target is at the same position
     *        -1 if target is on the left
     */
    public int getDirection(Coordinate target)
    {
        if (this.x < target.x)
        {
            return 1;
        }
        else if (this.x == target.x)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }

    public int getDistance(Coordinate other)
    {
        return Math.abs(this.x - other.x);
    }

    public void add(int delta)
    {
        x = Math.max(0, Math.min(MAX, x + delta));
    }
}
