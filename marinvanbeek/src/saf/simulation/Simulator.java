package saf.simulation;

import saf.data.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Simulator {
    public static final int LEFT_BORDER = 0;
    public static final int LEFT_START = 50;
    public static final int RIGHT_BORDER = 200;
    public static final int RIGHT_START = 150;
    public static final int MAXIMUM_STEPS = 300;

    private Fighter leftFighter;
    private List<saf.data.Fighter> leftSimulationData =
            new ArrayList<saf.data.Fighter>();
    private Fighter rightFighter;
    private List<saf.data.Fighter> rightSimulationData = 
            new ArrayList<saf.data.Fighter>();

    public Simulator(saf.data.Fighter leftData, saf.data.Fighter rightData)
    {
        this.leftFighter = new Fighter(leftData, LEFT_START, 1);
        this.rightFighter = new Fighter(rightData, RIGHT_START, -1);
    }

    public void runSimulation()
    {
        int i;
        for (i = 0; i < MAXIMUM_STEPS; i++)
        {
            handleFighter(leftFighter, rightFighter, leftSimulationData,
                          LEFT_BORDER, rightFighter.getPosition().getX());
            handleFighter(rightFighter, leftFighter, rightSimulationData,
                          leftFighter.getPosition().getX(), RIGHT_BORDER);

            if (!(leftFighter.isAlive() && rightFighter.isAlive()))
            {
                if (leftFighter.isAlive())
                {
                    System.out.println("Left won!");
                }
                else
                {
                    System.out.println("Right won!");
                }

                break;
            }
        }
        addData(leftFighter, leftSimulationData);
        addData(rightFighter, rightSimulationData);

        if (i == MAXIMUM_STEPS)
        {
            System.out.println("Draw!");
        }
    }

    private void handleFighter(Fighter fighter, Fighter opponent, 
                               List<saf.data.Fighter> simulationData, 
                               int min, int max)
    {
        if (fighter.mayAct())
        {
            State leftState = State.getState(fighter, opponent);
            State rightState = State.getState(opponent, fighter);
            saf.data.Action action = fighter.act(leftState);
            fighter.move(action.getMove(), min, max);
            opponent.defend(action.getAttack(), rightState);
        }

        addData(fighter, simulationData);
        fighter.tick();
    }

    private void addData(Fighter fighter, List<saf.data.Fighter> data)
    {
        data.add(new saf.data.Fighter(fighter.getData()));
    }

    public saf.data.SimulationData getSimulationData()
    {
        return new saf.data.SimulationData(leftSimulationData,
                                           rightSimulationData);
    }
}

