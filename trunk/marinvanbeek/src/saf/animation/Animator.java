package saf.animation;

import saf.data.Fighter;
import saf.data.Position;

import java.util.List;
import java.util.ArrayList;

import java.lang.Thread;

import javax.swing.JFrame;

public abstract class Animator extends JFrame
{
    public static final long serialVersionUID = 1L;

    public Animator(String windowName, int width, int height)
    {
        setTitle(windowName);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
        setVisible(true);
    }

    public abstract void runAnimation();

    protected void sleepDelay(int miliseconds)
    {
        try
        {
            Thread.currentThread().sleep(miliseconds);
        }
        catch (InterruptedException e)
        {
            System.out.println("The Animation sleep was interrupted: " +
                               e.getMessage());
        }
    }
}

