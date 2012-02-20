package saf.simulation.event;

import saf.simulation.Instance;
import saf.syntax.Simple;
import saf.visualization.Visualizer;

public class Block extends Event
{
    private final Instance subject;
    private final Instance complement;
    private final Simple attack;

    public Block(Instance subject, Instance complement, Simple attack)
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
