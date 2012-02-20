package saf.simulation.event;

import saf.simulation.Instance;
import saf.simulation.Coordinate;
import saf.visualization.Visualizer;

public class MoveTo extends Event
{
    private final Instance subject;

    public MoveTo(Instance subject)
    {
        this.subject = subject;
    }

    public Instance getSubject() { return subject; }
    public Coordinate getPosition() { return subject.getPosition(); }

    @Override
    public void visualize(Visualizer visualizer)
    {
        visualizer.visualize(this);
    }
}
