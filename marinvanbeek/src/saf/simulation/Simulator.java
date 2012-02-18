package saf.simulation;

import saf.data.*;

import java.util.Random;

public class Simulator {
    private Fighter leftFighter;
    private Fighter rightFighter;

    public Simulator()
    {
        Random random = new Random(0);

        saf.data.Fighter leftData = 
                saf.data.Fighter.getRandom(random.nextInt());
        this.leftFighter = new Fighter(leftData, 10);

        saf.data.Fighter rightData =    
                saf.data.Fighter.getRandom(random.nextInt());
        this.rightFighter = new Fighter(rightData, 35);
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
            leftFighter.tick();
            if (leftFighter.mayAct())
            {
                State leftState = State.getState(leftFighter, rightFighter);
                State rightState = State.getState(rightFighter, leftFighter);
                saf.data.Action action = leftFighter.act(leftState);
                leftFighter.move(action.getMove());
                rightFighter.defend(action.getAttack(), rightState);
            }
        }
    }
}

