import org.junit.*;

import saf.data.Fighter;
import saf.data.SimulationData;
import saf.simulation.Simulator;
import saf.animation.Animator;
import saf.animation.ArenaAnimator;

import java.util.Random;

public class IntegrationSimulationAnimationTest extends RedirectOutput
{
    private static final String LOG_FILE = 
            "integration_sim_anim_test_results.txt";

    @BeforeClass
    public static void redirect()
    {
        redirectTo(LOG_FILE);
    }

    @Test
    public void randomTest()
    {
        testAnimatedFight(new Random().nextInt());
    }

    @Test
    public void pseudoRandomTest()
    {
        testAnimatedFight(3);
    }

    public void testAnimatedFight(int seed)
    {
        Random seedGenerator = new Random();
        Fighter leftRandomFighter = Fighter.getRandom(seedGenerator.nextInt());
        Fighter rightRandomFighter = 
                Fighter.getRandom(seedGenerator.nextInt());

        System.out.println("New fight, generated with seed " + seed);
        System.out.println("In the left corner: " + leftRandomFighter);
        System.out.println("In the right corner: " + rightRandomFighter);
            
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

