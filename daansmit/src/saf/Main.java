package saf;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.RecognitionException;

import saf.check.CheckLog;
import saf.parser.SAFParser;
import saf.simulation.Simulation;
import saf.simulation.event.Event;
import saf.syntax.Fighter;
import saf.visualization.Visualizer;
import saf.visualization.SimpleTextVisualizer;
import saf.visualization.CompleteTextVisualizer;
import saf.visualization.GraphicalVisualizer;

public class Main
{
    public static void main(String[] args)
        throws RecognitionException, InterruptedException
    {
        Fighter left;
        Fighter right;

        if (args.length < 2)
        {
            System.out.println("ERROR: Not enough fighters!");
            return;
        }

        try
        {
            left = SAFParser.parseFromFile(args[0]);
            right = SAFParser.parseFromFile(args[1]);
        }
        catch (java.io.IOException e)
        {
            System.out.println("ERROR: Invalid fighter file(s)!");
            return;
        }

        CheckLog leftLog = new CheckLog();
        left.check(leftLog);
        CheckLog rightLog = new CheckLog();
        right.check(rightLog);

        System.out.println("LEFT:\n" + leftLog);
        System.out.println("RIGHT:\n" + rightLog);

        fight(left, right);
    }

    public static void fight(Fighter left, Fighter right)
        throws InterruptedException
    {
        Simulation s = new Simulation(left, right);
        Visualizer text = new SimpleTextVisualizer();
        Visualizer graphics = new GraphicalVisualizer();
        Thread thread = Thread.currentThread();

        while (s.isRunning())
        {
            for (Event e : s.step())
            {
                e.visualize(text);
                e.visualize(graphics);
            }
            thread.sleep(30);
        }        
    }
}
