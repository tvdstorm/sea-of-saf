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
        this.leftFighter = new Fighter(leftData, 10, 1);

        saf.data.Fighter rightData =    
                saf.data.Fighter.getRandom(random.nextInt());
        this.rightFighter = new Fighter(rightData, 200, -1);

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
            handleFighter(leftFighter, rightFighter, 
                          0, rightFighter.getPosition().getX());
            handleFighter(rightFighter, leftFighter,  
                          leftFighter.getPosition().getX(), 210);

            animator.bufferTimeStep(leftFighter, rightFighter);
        }

        animator.runAnimation();
    }

    private void handleFighter(Fighter fighter, Fighter opponent, int min, 
                               int max)
    {
        if (fighter.mayAct())
        {
            State leftState = State.getState(fighter, opponent);
            State rightState = State.getState(opponent, fighter);
            saf.data.Action action = fighter.act(leftState);
            fighter.move(action.getMove(), min, max);
            opponent.defend(action.getAttack(), rightState);
        }
        fighter.tick();
    }
}

