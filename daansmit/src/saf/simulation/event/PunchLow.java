package saf.simulation.event;

import saf.simulation.Instance;
import saf.visualization.Visualizer;

public class PunchLow extends Event
{
    private final Instance subject;

    public PunchLow(Instance subject)
    {
        this.subject = subject;
    }

    public Instance getSubject() { return subject; }

    @Override
    public void visualize(Visualizer visualizer)
    {
        visualizer.visualize(this);
    }
}