import org.junit.*;

import saf.parser.SAFLexer;
import saf.parser.SAFParser;

import org.antlr.runtime.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import saf.data.Fighter;
import saf.data.SimulationData;
import saf.simulation.Simulator;
import saf.animation.Animator;
import saf.animation.ArenaAnimator;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class IntegrationAllTest extends RedirectOutput
{
    private static final String TEST_FILES_LOCATION = "src/tests/safs/";
    private static final String LOG_FILE = "integration_all_test_results.txt";

    @BeforeClass
    public static void redirect()
    {
        redirectTo(LOG_FILE);
    }

    @Test
    public void testAnimatedAndParsedFighterSimulation()
        throws IOException, RecognitionException
    {
        Random seedGenerator = new Random(0);
        Fighter leftRandomFighter = parseFighter("left.saf");
        Fighter rightRandomFighter = parseFighter("right.saf");
            
        SimulationData data = runSimulation(leftRandomFighter, 
                                            rightRandomFighter);
        runAnimation(data);
    }

    private Fighter parseFighter(String fileName)
        throws IOException, RecognitionException
    {
        ANTLRFileStream input = new ANTLRFileStream(TEST_FILES_LOCATION + 
                                                    fileName);
        SAFLexer lexer = new SAFLexer(input);
        SAFParser parser = new SAFParser(new CommonTokenStream(lexer));
        parser.parse();
        saf.syntax.SyntaxCheck syntaxCheck = parser.getSyntaxCheck();

        if (syntaxCheck.isWellFormed(new ArrayList<String>()))
        {
            return syntaxCheck.getFighterData();
        }
        else
        {
            System.out.println("Parsed fighter not well formed! Name = " +
                               fileName);
            return null;
        }
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
        Animator animator = new ArenaAnimator("Complete Integration Test", 
                                              "bison", "bison", data);
        animator.runAnimation();
    }
}


