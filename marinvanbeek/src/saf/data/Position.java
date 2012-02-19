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

    public void move(Position move)
    {
        x += move.getX();
        /* Don't increment y: you shouldn't keep going higher or lower. */
        y = move.getY();
    }

    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

    public int getX() { return x; }
    public int getY() { return y; }
}

