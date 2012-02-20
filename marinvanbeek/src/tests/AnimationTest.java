import org.junit.*;

import saf.data.*;
import saf.animation.*;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class AnimationTest
{
    private static final String LOG_FILE = "simulation_test_results.txt";

    private static PrintStream systemStdout;
    private static PrintStream systemStderr;

    @BeforeClass
    public static void redirect()
    {
        try
        {
            systemStdout = System.out;
            systemStderr = System.err;

            PrintStream logFile = new PrintStream(LOG_FILE);
            System.setOut(logFile);
            System.setErr(logFile);
        } catch (FileNotFoundException e)
        {
            System.err.println("Couldn't open log file\n" + e.getMessage());
        }
    }

    @AfterClass
    public static void unRedirect()
    {
        System.setOut(systemStdout);
        System.setErr(systemStderr);
    }

    @Test
    public void testPredefinedActions()
    {
        List<Fighter> leftFighters = getCompleteFighters(10);
        List<Fighter> rightFighters = getCompleteFighters(110);
        SimulationData simulationData = 
                new SimulationData(leftFighters, rightFighters);

        Animator animator = new ArenaAnimator("Animation Test", "bison", 
                                              "bison", simulationData);

        animator.runAnimation();
    }

    /*
     * Returns a list of simulated Fighters, where every attack is guaranteed
     * to appear and where the Fighter's position changes.
     */
    private List<Fighter> getCompleteFighters(int xPosition) 
    {
        List<Action> actions = getCompleteActions();
        List<Fighter> fighters = new ArrayList<Fighter>();
        Position position = new Position(xPosition, 0);

        for (saf.data.Action action : actions)
        {
            /* Add the Fighter several times to slow down the animation; in the
             * simulation a fighter will only perform a move every
             * Fighter.speed timesteps (~10-15). */
            for (int i = 0; i < 5; i++)
            {
                saf.data.Fighter randomFighter = Fighter.getRandom(0);
                randomFighter.setPosition(position);
                randomFighter.setAction(action);
                fighters.add(randomFighter);
            }
        }

        saf.data.Action generalAction = new Action(new Move("stand"), 
                                                   new Attack("punch_high"));
        for (int i = 0; i < 15; i++)
        {
            PositionDifference difference = new PositionDifference(i*3, 0);
            Position movedPosition = position.move(difference, 1, 0, 
                                                   i*15 + 110);

            saf.data.Fighter randomFighter = Fighter.getRandom(0);
            randomFighter.setPosition(movedPosition);
            randomFighter.setAction(generalAction);
            fighters.add(randomFighter);
        }

        return fighters;
    }

    /*
     * Returns a list of actions, where every attack is guaranteed to appear.
     */
    private List<saf.data.Action> getCompleteActions()
    {
        List<String> moves = saf.data.Move.LEGAL;
        List<String> attacks = saf.data.Attack.LEGAL;

        List<saf.data.Action> actions = new ArrayList<saf.data.Action>();

        for (String attack : attacks)
        {
            actions.add(
                    new saf.data.Action(new saf.data.Move(moves.get(0)), 
                                        new saf.data.Attack(attack)));
        }

        return actions;
    }
}

