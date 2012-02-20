package saf;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.RecognitionException;

import saf.check.CheckLog;
import saf.parser.SAFParser;
import saf.simulation.Simulation;
import saf.simulation.event.Event;
import saf.syntax.Fighter;
import saf.visualization.Visualizer;
import saf.visualization.TextVisualizer;
import saf.visualization.GraphicalVisualizer;

public class Main
{
    public static void main(String[] args)
        throws RecognitionException, java.io.IOException
    {
        for (String s : args)
        {
            Fighter fighter = SAFParser.parseFromFile(s);
            System.out.println(fighter.toString());
            CheckLog checklog = new CheckLog();
            fighter.check(checklog);
            System.out.println(checklog.toString());
            System.out.println("");
        }
        List<Fighter> fighters = new ArrayList<Fighter>();

        fighters.add(SAFParser.parseFromString("monkey {\n" +
                                               "mounthsize=12\n" +
                                               "always [run_towards kick_high]\n" +
                                               "}"));
        // fighters.add(SAFParser.parseFromString("WithoutEmpty {\n" + 
        //                                        "punchReach=6\n" +
        //                                        "near [crouch block_high]\n" + 
        //                                        "}"));

        for (Fighter fighter : fighters)
        {
            System.out.println(fighter.toString());
            CheckLog checklog = new CheckLog();
            fighter.check(checklog);
            System.out.println(checklog.toString());
            System.out.println("");
        }

        Fighter left = SAFParser.parseFromString("chicken { "
                                                 + "punchPower=1 "
                                                 + "kickPower=1 "
                                                 + "near [run_away block_low] "
                                                 + "always [crouch block_low] "
                                                 + "}");
        CheckLog log = new CheckLog();
        left.check(log);
        System.out.println(log.toString());
        System.out.println("");

        Fighter right = SAFParser.parseFromString("default { "
                                                  + "far [run_towards punch_high] "
                                                  + "near [crouch kick_low] "
                                                  + "always [jump kick_high] "
                                                  + "}");
        log = new CheckLog();
        right.check(log);
        System.out.println(log.toString());
        System.out.println("");

        Simulation s = new Simulation(left, right);
        Visualizer graphics = new GraphicalVisualizer();
        Visualizer text = new TextVisualizer();

        while (s.isRunning())
        {
            for (Event e : s.step())
            {
                System.out.print("event:");
                e.visualize(graphics);
                e.visualize(text);
            }
        }
    }
}
