package simulation;

import data.*;

import java.util.Random;

public class Simulator {
    Fighter leftFighter;
    Fighter rightFighter;

    public Simulator()
    {
        Random random = new Random(0);

        data.Fighter leftData = data.Fighter.getRandom(random.nextInt());
        this.leftFighter = new Fighter(leftData);

        data.Fighter rightData = data.Fighter.getRandom(random.nextInt());
        this.rightFighter = new Fighter(rightData);
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
                data.Action a = leftFighter.act(leftState);
                leftFighter.move(a.move);
                rightFighter.defend(a.attack, rightState);
            }
        }
    }
}

