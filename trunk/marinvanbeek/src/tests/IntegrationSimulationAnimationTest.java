import org.junit.*;

import saf.data.Fighter;
import saf.data.SimulationData;
import saf.simulation.Simulator;
import saf.animation.Animator;
import saf.animation.ArenaAnimator;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class IntegrationSimulationAnimationTest
{
    private static final String LOG_FILE = 
            "integration_sim_anim_test_results.txt";

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
    public void testAnimatedFight()
    {
        Random seedGenerator = new Random(0);
        Fighter leftRandomFighter = Fighter.getRandom(seedGenerator.nextInt());
        Fighter rightRandomFighter = 
                Fighter.getRandom(seedGenerator.nextInt());
            
        SimulationData data = runSimulation(leftRandomFighter, 
                                            rightRandomFighter);
        runAnimation(data);
    }

    private SimulationData runSimulation(Fighter left, Fighter right)
    {
        Simulator simulator = new Simulator(left, right);
        simulator.runSimulation();

        return simulator.getSimulationData();
    }

    private void runAnimation(SimulationData data)
    {
        System.out.println("Simulation data size: " +
                           data.getLeftData().size());
        Animator animator = new ArenaAnimator("Simulation and Animation " + 
                                              "Integration Test", "bison", 
                                              "bison", data);
        animator.runAnimation();
    }
}

