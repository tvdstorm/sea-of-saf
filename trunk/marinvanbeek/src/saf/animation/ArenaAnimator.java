package saf.animation;

import saf.data.Fighter;
import saf.data.Position;
import saf.data.SimulationData;
import saf.animation.Animator;

import java.util.List;
import java.util.ArrayList;

import java.lang.Thread;

import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ArenaAnimator extends Animator
{
    public static final long serialVersionUID = 1L;

    public static final int ARENA_WIDTH = 512;
    public static final int ARENA_HEIGHT = 512;
    public static final int ANIMATION_DELAY_MS = 1;
    public static final int START_END_DELAY_MS = 500;

    private FighterAnimator leftAnimator;
    private FighterAnimator rightAnimator;

    public ArenaAnimator(String leftFileName, String rightFileName, 
                         SimulationData simulationData)
    {
        this("Super Awesome Fighters Arena", leftFileName, rightFileName,
             simulationData);
    }

    public ArenaAnimator(String windowName, String leftFileName, 
                         String rightFileName, SimulationData simulationData)
    {
        super(windowName, ARENA_WIDTH, ARENA_HEIGHT);

        Container contentPane = getContentPane();

        leftAnimator = new FighterAnimator(leftFileName, contentPane);
        for (Fighter simulationStep : simulationData.getLeftData())
        {
            leftAnimator.bufferAnimation(simulationStep);
        }

        rightAnimator = new FighterAnimator(rightFileName, contentPane, true);
        for (Fighter simulationStep : simulationData.getRightData())
        {
            rightAnimator.bufferAnimation(simulationStep);
        }
    }

    public void runAnimation()
    {
        leftAnimator.animateFirst();
        rightAnimator.animateFirst();
        sleepDelay(START_END_DELAY_MS);

        while (leftAnimator.hasAnimations() &&
               rightAnimator.hasAnimations())
        {
            leftAnimator.animateNext();
            rightAnimator.animateNext();

            sleepDelay(ANIMATION_DELAY_MS);
        }
        System.out.println();

        sleepDelay(START_END_DELAY_MS);
    }
}

