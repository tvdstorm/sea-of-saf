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

