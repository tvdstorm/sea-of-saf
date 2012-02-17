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
    private ArenaAnimator animator;

    @Test
    public void testPredefinedActions()
    {
        List<Action> actions = getCompleteActions();

        animator = new ArenaAnimator("bison", "bison");

        animator.runAnimation();
    }

    /*
     * Returns a list of actions, where every move and every attack is
     * guaranteed to appear.
     */
    private List<Action> getCompleteActions()
    {
        List<String> moves = data.Move.LEGAL;
        List<String> attacks = data.Attack.LEGAL;

        List<Action> actions = new ArrayList();

        for (String move : moves)
        {
            actions.add(new Action(new Move(move), 
                                   new Attack(attacks.get(0))));
        }

        for (String attack : attacks)
        {
            actions.add(new Action(new Move(moves.get(0)), 
                                   new Attack(attack)));
        }

        return actions;
    }
}

