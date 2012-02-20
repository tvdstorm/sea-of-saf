package saf.simulation.event;

import saf.simulation.Instance;
import saf.visualization.Visualizer;

public class Crouch extends Event
{
    private final Instance subject;

    public Crouch(Instance subject)
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
