package saf.simulation;

import java.util.ArrayList;
import java.util.List;

import saf.simulation.event.Draw;
import saf.simulation.event.Event;
import saf.simulation.event.Init;
import saf.syntax.Fighter;

public class Simulation
{
    private static final int MAX_STEP = 1000;
    private static final Coordinate POSITION_LEFT = new Coordinate(200);
    private static final Coordinate POSITION_RIGHT = new Coordinate(800);

    private final List<Process> processes = new ArrayList<Process>();
    private final Instance left;
    private final Instance right;
    private boolean running = true;
    private int stepCounter = 0;

    public Simulation(Fighter left, Fighter right)
    {
        this.left = new Instance(left, POSITION_LEFT);
        this.right = new Instance(right, POSITION_RIGHT);

        this.left.setOther(this.right);
        this.right.setOther(this.left);
    }

    public boolean isRunning() { return running; }

    public List<Event> step()
    {
        if (!running) { return null; }

        List<Event> events = new ArrayList<Event>();

        if (stepCounter == 0)
        {
            events.add(new Init(left, right));
            stepCounter++;
            return events;
        }
        else if (stepCounter >= MAX_STEP)
        {
            events.add(new Draw(left, right));
        }

        left.plan();
        right.plan();

        left.step(events);
        right.step(events);

        running = left.isAlive() && right.isAlive();
        stepCounter++;
        return events;
    }
}
