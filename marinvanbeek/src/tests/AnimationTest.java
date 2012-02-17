//import org.testng.annotations.*;
import org.junit.*;

import data.*;
import simulation.*;
import animation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class AnimationTest
{
    @Test
    public void testPredefinedActions()
    {
        List<simulation.Fighter> fighters = getCompleteFighters();
        ArenaAnimator animator = new ArenaAnimator("bison", "bison");

        System.out.println();
        for (simulation.Fighter fighter : fighters)
        {
            animator.bufferTimeStep(fighter, fighter);
            System.out.print("<");
        }
        System.out.println();

        animator.runAnimation();
    }

    /*
     * Returns a list of simulated Fighters, where every move and every attack
     * is guaranteed to appear and where the Fighter's position changes.
     */
    private List<simulation.Fighter> getCompleteFighters()
    {
        /* This data Fighter is needed for the simulation Fighter, but not used
         * in the actual animation. */
        data.Fighter generalFighter = data.Fighter.getRandom(0);
        data.Action generalAction = new data.Action(new data.Move("stand"), 
                                            new data.Attack("punch_high"));
        List<data.Action> actions = getCompleteActions();
        List<simulation.Fighter> fighters = new ArrayList<simulation.Fighter>();

        for (data.Action action : actions)
        {
            fighters.add(new simulation.Fighter(generalFighter, 0, action));
        }

        for (int i = 0; i < 10; i++)
        {
            fighters.add(new simulation.Fighter(generalFighter, i*3,
                                                generalAction));
        }

        return fighters;
    }

    /*
     * Returns a list of actions, where every move and every attack is
     * guaranteed to appear.
     */
    private List<data.Action> getCompleteActions()
    {
        List<String> moves = data.Move.LEGAL;
        List<String> attacks = data.Attack.LEGAL;

        List<data.Action> actions = new ArrayList<data.Action>();

        for (String move : moves)
        {
            actions.add(new data.Action(new data.Move(move), 
                                        new data.Attack(attacks.get(0))));
        }

        for (String attack : attacks)
        {
            actions.add(new data.Action(new data.Move(moves.get(0)), 
                                        new data.Attack(attack)));
        }

        return actions;
    }
}

