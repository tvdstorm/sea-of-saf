package saf.simulation.event;

import saf.syntax.Simple;
import saf.simulation.Instance;
import saf.visualization.Visualizer;

public class Hit extends Event
{
    private final Instance subject;
    private final Instance complement;
    private final Simple attack;

    public Hit(Instance subject, Instance complement, Simple attack)
    {
        this.subject = subject;
        this.complement = complement;
        this.attack = attack;
    }

    public Instance getSubject() { return subject; }
    public Instance getComplement() { return complement; }
    public Simple getAttack() { return attack; }

    @Override
    public void visualize(Visualizer visualizer)
    {
        visualizer.visualize(this);
    }
}