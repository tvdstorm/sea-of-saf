package saf.simulation.event;

import saf.simulation.Instance;
import saf.visualization.Visualizer;

public class Win extends Event
{
    private final Instance winner;
    private final Instance loser;

    public Win(Instance winner, Instance loser)
    {
        this.winner = winner;
        this.loser = loser;
    }

    public Instance getWinner() { return winner; }
    public Instance getLoser() { return loser; }

    @Override
    public void visualize(Visualizer visualizer)
    {
        visualizer.visualize(this);
    }
}
