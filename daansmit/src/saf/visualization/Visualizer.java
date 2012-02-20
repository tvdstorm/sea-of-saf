package saf.visualization;

import saf.simulation.event.*;

public interface Visualizer
{
    public void visualize(Event event);
    public void visualize(Block block);
    public void visualize(BlockHigh blockHigh);
    public void visualize(BlockLow blockLow);
    public void visualize(ChangeHealth changeHealth);
    public void visualize(Crouch crouch);
    public void visualize(Draw draw);
    public void visualize(Hit hit);
    public void visualize(Init init);
    public void visualize(Jump jump);
    public void visualize(KickHigh kickHigh);
    public void visualize(KickLow kickLow);
    public void visualize(Miss miss);
    public void visualize(MoveTo moveTo);
    public void visualize(PunchHigh punchHigh);
    public void visualize(PunchLow punchLow);
    public void visualize(Stand stand);
    public void visualize(StopAttack stopAttack);
    public void visualize(Win win);
}
