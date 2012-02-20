package saf.simulation;

import java.util.List;

import saf.simulation.Instance;
import saf.simulation.event.*;
import saf.syntax.Fighter;
import saf.syntax.Response;

public class Fight extends Process
{
    private final static int BASE_REACH = 42;
    private final static int BASE_DAMAGE = 20;
    private final static int BLOCK_REDUCTION = 10;
    private final int punchDamage;
    private final int kickDamage;
    private final int punchReach;
    private final int kickReach;
    private Boolean striked = null;

    public Fight(Response activity, Instance subject, Instance complement)
    {
        super(activity, subject, complement);

        Fighter base = subject.getTemplate();
        punchDamage = BASE_DAMAGE + base.getCharacteristic("punchPower");
        kickDamage = BASE_DAMAGE + base.getCharacteristic("kickPower");

        punchReach = BASE_REACH + base.getCharacteristic("punchReach");
        kickReach = BASE_REACH + base.getCharacteristic("kickReach");
    }

    @Override
    public void first(List<Event> events)
    {
        switch (getActivity().getId())
        {
        case "block_high":
            getSubject().setBlockingHigh(true);
            events.add(new BlockHigh(getSubject()));
            break;
        case "block_low":
            getSubject().setBlockingLow(true);
            events.add(new BlockLow(getSubject()));
            break;
        case "punch_high":
            events.add(new PunchHigh(getSubject()));
            striked = false;
            break;
        case "punch_low":
            events.add(new PunchLow(getSubject()));
            striked = false;
            break;
        case "kick_high":
            events.add(new KickHigh(getSubject()));
            striked = false;
            break;
        case "kick_low":
            events.add(new KickLow(getSubject()));
            striked = false;
            break;
        }
    }

    @Override
    public void last(List<Event> events)
    {
        switch (getActivity().getId())
        {
        case "block_high":
            getSubject().setBlockingHigh(false);
            break;
        case "block_low":
            getSubject().setBlockingLow(false);
            break;
        }
        events.add(new StopAttack(getSubject()));
        if (striked != null && striked == false)
        {
            events.add(new Miss(getSubject(), getComplement(), getActivity()));
        }
    }

    @Override
    public void every(List<Event> events)
    {
        if (striked == null || striked == true) { return; }

        boolean inReach;
        boolean blocking;
        boolean dodging;
        int damage;

        switch (getActivity().getId())
        {
        case "punch_high":
            inReach = getSubject().inReach(punchReach);
            blocking = getComplement().isBlockingHigh();
            dodging = getComplement().isCrouching();
            damage = punchDamage;
            break;
        case "punch_low":
            inReach = getSubject().inReach(punchReach);
            blocking = getComplement().isBlockingLow();
            dodging = getComplement().isJumping();
            damage = punchDamage;
            break;
        case "kick_high":
            inReach = getSubject().inReach(kickReach);
            blocking = getComplement().isBlockingHigh();
            dodging = getComplement().isCrouching();
            damage = kickDamage;
            break;
        case "kick_low":
            inReach = getSubject().inReach(kickReach);
            blocking = getComplement().isBlockingLow();
            dodging = getComplement().isJumping();
            damage = kickDamage;
            break;
        default:
            return;
        }
        if (inReach && !dodging)
        {
            if (blocking)
            {
                damage -= BLOCK_REDUCTION;
                events.add(new Block(getComplement(), getSubject(), getActivity()));
            }
            getComplement().modHealth(-damage);
            events.add(new ChangeHealth(getComplement()));
            striked = true;
            if (!getComplement().isAlive())
            {
                events.add(new Win(getSubject()));
            }
        }
    }
}