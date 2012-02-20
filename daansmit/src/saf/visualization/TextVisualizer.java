package saf.visualization;

import saf.syntax.Simple;
import saf.simulation.Instance;
import saf.simulation.Coordinate;
import saf.simulation.event.*;

public class TextVisualizer implements Visualizer
{
    public TextVisualizer() { }

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
    public void visualize(Block block)
    {
        Instance subject = block.getSubject();
        Instance complement = block.getComplement();
        Simple attack = block.getAttack();
        display(subject.getName() + " blocks " + complement.getName()
                + "'s attack (" + attack.getId() + ")");
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
    public void visualize(ChangeHealth changeHealth)
    {
        Instance subject = changeHealth.getSubject();
        display(subject.getName()
                + "'s health changed to " + subject.getHealth());
    }

    @Override
    public void visualize(Crouch crouch)
    {
        Instance subject = crouch.getSubject();
        display(subject.getName() + " crouches.");
    }

    @Override
    public void visualize(Hit hit)
    {
        Instance subject = hit.getSubject();
        Instance complement = hit.getComplement();
        Simple attack = hit.getAttack();
        display(subject.getName()
                + " hit (" + attack + ") " + complement.getName());
    }

    @Override
    public void visualize(Jump jump)
    {
        Instance subject = jump.getSubject();
        display(subject.getName() + " jumps.");
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
        Instance complement = miss.getSubject();
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

    @Override
    public void visualize(Win win)
    {
        Instance subject = win.getSubject();
        display(subject.getName()
                + " has won the fight with " + subject.getHealth()
                + " health remaining!");
    }
}