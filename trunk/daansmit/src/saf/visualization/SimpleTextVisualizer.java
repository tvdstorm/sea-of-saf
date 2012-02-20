package saf.visualization;

import saf.syntax.Simple;
import saf.simulation.Instance;
import saf.simulation.Coordinate;
import saf.simulation.event.*;

public class SimpleTextVisualizer implements Visualizer
{
    public SimpleTextVisualizer() { }

    public void display(String content)
    {
        System.out.println(content);
    }

    @Override
    public void visualize(Event event) { }

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
    public void visualize(BlockHigh blockHigh) { }

    @Override
    public void visualize(BlockLow blockLow) { }

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
    public void visualize(Draw draw)
    {
        display("* DRAW *");
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
    public void visualize(Init init)
    {
        Instance left = init.getLeft();
        Instance right = init.getRight();
        display(left.getName() + " vs. " + right.getName());
    }

    @Override
    public void visualize(Jump jump)
    {
        Instance subject = jump.getSubject();
        display(subject.getName() + " jumps.");
    }

    @Override
    public void visualize(KickHigh kickHigh) { }

    @Override
    public void visualize(KickLow kickLow) { }

    @Override
    public void visualize(Miss miss) { }

    @Override
    public void visualize(MoveTo moveTo) { }

    @Override
    public void visualize(PunchHigh punchHigh) { }

    @Override
    public void visualize(PunchLow punchLow) { }

    @Override
    public void visualize(Stand stand) { }

    @Override
    public void visualize(StopAttack stopAttack) { }

    @Override
    public void visualize(Win win)
    {
        Instance winner = win.getWinner();
        display("* VICTORY * " + winner.getName()
                + " has won the fight with " + winner.getHealth()
                + " health remaining!");
    }
}