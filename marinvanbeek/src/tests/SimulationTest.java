import org.junit.*;

import saf.data.Fighter;
import saf.simulation.Simulator;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class SimulationTest extends RedirectOutput
{
    public static final int NR_OF_TESTS = 1000;
    private static final String LOG_FILE = "simulation_test_results.txt";

    @BeforeClass
    public static void redirect()
    {
        redirectTo(LOG_FILE);
    }

    @Test
    public void testRandomFighter()
    {
        Random seedGenerator = new Random(0);

        System.out.println("Random fighter: " +
                           Fighter.getRandom(seedGenerator.nextInt()));
    }

    @Test
    public void testFight()
    {
        Random seedGenerator = new Random(0);
        Fighter leftRandomFighter;
        Fighter rightRandomFighter;
        Simulator simulator;

        for (int i = 0; i < NR_OF_TESTS; i++)
        {
            leftRandomFighter = Fighter.getRandom(seedGenerator.nextInt());
            rightRandomFighter = Fighter.getRandom(seedGenerator.nextInt());
            
            simulator = new Simulator(leftRandomFighter, rightRandomFighter);
            simulator.runSimulation();
        }
    }
}

