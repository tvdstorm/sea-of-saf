//import org.testng.annotations.*;
import org.junit.*;

import saf.data.*;
import saf.simulation.*;
import saf.animation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class AnimationTest
{
    @Test
    public void testPredefinedActions()
    {
        List<saf.simulation.Fighter> leftFighters = getCompleteFighters(0);
        List<saf.simulation.Fighter> rightFighters = getCompleteFighters(100);
        ArenaAnimator animator = new ArenaAnimator("bison", "bison");

        System.out.println();
        for (int i = 0; i < leftFighters.size(); i++)
        {
            animator.bufferTimeStep(leftFighters.get(i), rightFighters.get(i));
            System.out.print("<");
        }
        System.out.println();

        animator.runAnimation();
    }

    /*
     * Returns a list of simulated Fighters, where every move and every attack
     * is guaranteed to appear and where the Fighter's position changes.
     */
    private List<saf.simulation.Fighter> getCompleteFighters(int position)
    {
        /* This data Fighter is needed for the simulation Fighter, but not used
         * in the actual animation. */
        saf.data.Fighter generalFighter = saf.data.Fighter.getRandom(0);
        saf.data.Action generalAction = 
                new saf.data.Action(new saf.data.Move("stand"), 
                                    new saf.data.Attack("punch_high"));
        List<saf.data.Action> actions = getCompleteActions();
        List<saf.simulation.Fighter> fighters = 
                new ArrayList<saf.simulation.Fighter>();

        for (saf.data.Action action : actions)
        {
            fighters.add(new saf.simulation.Fighter(generalFighter, position, 
                                                    action));
        }

        for (int i = 0; i < 10; i++)
        {
            fighters.add(new saf.simulation.Fighter(generalFighter,
                                                    i*3+position,
                                                    generalAction));
        }

        return fighters;
    }

    /*
     * Returns a list of actions, where every move and every attack is
     * guaranteed to appear.
     */
    private List<saf.data.Action> getCompleteActions()
    {
        List<String> moves = saf.data.Move.LEGAL;
        List<String> attacks = saf.data.Attack.LEGAL;

        List<saf.data.Action> actions = new ArrayList<saf.data.Action>();

        for (String move : moves)
        {
            actions.add(
                    new saf.data.Action(new saf.data.Move(move), 
                                        new saf.data.Attack(attacks.get(0))));
        }

        for (String attack : attacks)
        {
            actions.add(
                    new saf.data.Action(new saf.data.Move(moves.get(0)), 
                                        new saf.data.Attack(attack)));
        }

        return actions;
    }
}

