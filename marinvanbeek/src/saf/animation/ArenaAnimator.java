package saf.animation;

import saf.simulation.Fighter;

import java.util.List;
import java.util.ArrayList;

import java.lang.Thread;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class ArenaAnimator extends JFrame
{
    public static final long serialVersionUID = 1L;

    public static final int ARENA_WIDTH = 256;
    public static final int ARENA_HEIGHT = 256;
    public static final int ANIMATION_DELAY_MS = 500;

    private FighterAnimator leftAnimator;
    private FighterAnimator rightAnimator;

    public ArenaAnimator(String leftName, String rightName)
    {
        setupArena();

        Container contentPane = getContentPane();
        leftAnimator = new FighterAnimator(leftName, contentPane);
        rightAnimator = new FighterAnimator(rightName, contentPane, true);
    }

    public void setupArena()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(ARENA_WIDTH, ARENA_HEIGHT);
        setVisible(true);
    }

    public void runAnimation()
    {
        while (leftAnimator.hasAnimations() &&
               rightAnimator.hasAnimations())
        {
            leftAnimator.animateNext();
            rightAnimator.animateNext();

            System.out.print(">");

            try
            {
                Thread.currentThread().sleep(ANIMATION_DELAY_MS);
            }
            catch (InterruptedException e)
            {
                System.out.println("The Animation sleep was interrupted: " +
                                   e.getMessage());
            }
        }
        System.out.println();
    }

    public void bufferTimeStep(Fighter leftFighter, Fighter rightFighter)
    {
        leftAnimator.bufferAnimation(leftFighter);
        rightAnimator.bufferAnimation(rightFighter);
    }
}

