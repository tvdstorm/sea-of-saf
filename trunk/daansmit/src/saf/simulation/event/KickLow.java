package saf.simulation.event;

import saf.simulation.Instance;
import saf.visualization.Visualizer;

public class KickLow extends Event
{
    private final Instance subject;

    public KickLow(Instance subject)
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