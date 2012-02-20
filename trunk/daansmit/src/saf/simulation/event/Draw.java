package saf.simulation.event;

import saf.simulation.Instance;
import saf.visualization.Visualizer;

public class Draw extends Event
{
    private final Instance left;
    private final Instance right;

    public Draw(Instance left, Instance right)
    {
        this.left = left;
        this.right = right;
    }

    public Instance getLeft() { return left; }
    public Instance getRight() { return right; }

    @Override
    public void visualize(Visualizer visualizer)
    {
        visualizer.visualize(this);
    }
}