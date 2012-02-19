package saf.simulation;

import saf.data.*;
import saf.animation.ArenaAnimator;

import java.util.Random;

public class Simulator {
    private Fighter leftFighter;
    private Fighter rightFighter;
    private ArenaAnimator animator;

    public Simulator()
    {
        Random random = new Random(0);

        saf.data.Fighter leftData = 
                saf.data.Fighter.getRandom(random.nextInt());
        this.leftFighter = new Fighter(leftData, new saf.data.Position(0,0));

        saf.data.Fighter rightData =    
                saf.data.Fighter.getRandom(random.nextInt());
        this.rightFighter = new Fighter(rightData, 
                                        new saf.data.Position(100,0));

        this.animator = new ArenaAnimator("bison", "bison");
    }

    public Simulator(String leftFileName, String rightFileName)
    {
        /* FIXME uses random fighters instead of the fighters specified by the
         * filenames. */
        this();
    }

    public void runSimulation()
    {
        while (leftFighter.isAlive() && rightFighter.isAlive())
        {
            handleFighter(leftFighter, rightFighter);
            handleFighter(rightFighter, leftFighter);

            animator.bufferTimeStep(leftFighter, rightFighter);
        }

        animator.runAnimation();
    }

    private void handleFighter(Fighter fighter, Fighter opponent)
    {
        if (fighter.mayAct())
        {
            State leftState = State.getState(fighter, opponent);
            State rightState = State.getState(opponent, fighter);
            saf.data.Action action = fighter.act(leftState);
            fighter.move(action.getMove());
            opponent.defend(action.getAttack(), rightState);
        }
        fighter.tick();
    }
}

