package saf.syntax;

import java.util.Arrays;
import java.util.List;

import saf.check.CheckLog;

public class Simple extends Response
{
    private static final List<String> ATTACKS = 
        Arrays.asList("punch_low", "punch_high", "kick_low",
                      "kick_high", "block_low", "block_high");

    private static final List<String> MOVES = 
        Arrays.asList("jump", "crouch", "stand", "run_towards",
                      "run_away", "walk_towards", "walk_away");

    private final String id;

    public Simple(String id)
    {
        this.id = id;
    }

    public String getId() { return id; }

    public boolean isMove()
    {
        return MOVES.contains(id);
    }

    public boolean isAttack()
    {
        return ATTACKS.contains(id);
    }

    public void check(CheckLog log)
    {
        if (!isMove() && !isAttack())
        {
            log.add(new saf.check.Error("Invalid response \""
                                        + toString() + "\"", this));
        }
    }

    public String toString()
    {
        return id;
    }
}
