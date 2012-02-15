//import org.testng.annotations.*;
import org.junit.*;

import data.*;
import simulation.*;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class FightTest
{
    private static final String LOG_FILE = "fight_test_results.txt";

    @BeforeClass
    public static void redirect()
    {
        try
        {
            PrintStream logFile = new PrintStream(LOG_FILE);
            System.setOut(logFile);
            System.setErr(logFile);
        } catch (FileNotFoundException e)
        {
            System.err.println("Couldn't open log file\n" + e.getMessage());
        }
    }

    @Before
    public void setup()
    {
        System.out.println();
    }

    @Test
    public void testRandomFighter()
    {
        Random seedGenerator = new Random();

        System.out.println(data.Fighter.getRandom(seedGenerator.nextInt()));
    }

    @Test
    public void testFight()
    {
        Simulator simulator = new Simulator();

        simulator.runSimulation();
    }
}

