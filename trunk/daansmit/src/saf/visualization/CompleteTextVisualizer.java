package saf.visualization;

import saf.syntax.Simple;
import saf.simulation.Instance;
import saf.simulation.Coordinate;
import saf.simulation.event.*;

public class CompleteTextVisualizer
    extends SimpleTextVisualizer implements Visualizer
{
    public CompleteTextVisualizer() { }

    public void display(String content)
    {
        System.out.println(content);
    }

    @Override
    public void visualize(Event event)
    {
        display("unknown event");
    }

    @Override
    public void visualize(BlockHigh blockHigh)
    {
        Instance subject = blockHigh.getSubject();
        display(subject.getName() + " blocks high.");
    }

    @Override
    public void visualize(BlockLow blockLow)
    {
        Instance subject = blockLow.getSubject();
        display(subject.getName() + " blocks low.");
    }

    @Override
    public void visualize(KickHigh kickHigh)
    {
        Instance subject = kickHigh.getSubject();
        display(subject.getName() + " kicks high.");
    }

    @Override
    public void visualize(KickLow kickLow)
    {
        Instance subject = kickLow.getSubject();
        display(subject.getName() + " kicks low.");
    }

    @Override
    public void visualize(Miss miss)
    {
        Instance subject = miss.getSubject();
        Instance complement = miss.getComplement();
        Simple attack = miss.getAttack();
        display(subject.getName() + " misses ("
                + attack.getId() + ") " + complement.getName());
    }

    @Override
    public void visualize(MoveTo moveTo)
    {
        Instance subject = moveTo.getSubject();
        Coordinate position = moveTo.getPosition();
        display(subject.getName()
                + " moved to " + position.toString());
    }

    @Override
    public void visualize(PunchHigh punchHigh)
    {
        Instance subject = punchHigh.getSubject();
        display(subject.getName() + " punches high.");
    }

    @Override
    public void visualize(PunchLow punchLow)
    {
        Instance subject = punchLow.getSubject();
        display(subject.getName() + " punches low.");
    }

    @Override
    public void visualize(Stand stand)
    {
        Instance subject = stand.getSubject();
        display(subject.getName() + " stands normally again.");
    }

    @Override
    public void visualize(StopAttack stopAttack)
    {
        Instance subject = stopAttack.getSubject();
        display(subject.getName() + ": stopAttack");
    }
}