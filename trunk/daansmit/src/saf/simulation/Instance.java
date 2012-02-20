package saf.simulation;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import saf.simulation.event.Event;
import saf.syntax.Action;
import saf.syntax.Fighter;
import saf.syntax.Response;
import saf.syntax.State;

public class Instance
{
    private final Fighter template;
    private final int hash;
    private final List<Process> processes = new ArrayList<Process>();
    private Coordinate position;
    private Instance other;
    private int health = 100;

    private boolean blockingHigh = false;
    private boolean blockingLow = false;
    private boolean crouching = false;
    private boolean jumping = false;

    public Instance(Fighter template, Coordinate position)
    {
        this.template = template;
        this.position = position;
        hash = template.getName().hashCode() + position.getX();
    }

    public Coordinate getPosition() { return position; }
    public Fighter getTemplate() { return template; }
    public String getName() { return template.getName(); }
    public int getHealth() { return health; }

    public void setOther(Instance other) { this.other = other; }

    public void modHealth(int modifier)
    {
        health += modifier;
    }

    public void setBlockingHigh(boolean state) { this.blockingHigh = state; }
    public void setBlockingLow(boolean state) { this.blockingLow = state; }
    public void setCrouching(boolean state) { this.crouching = state; }
    public void setJumping(boolean state) { this.jumping = state; }

    public boolean isBlockingHigh() { return blockingHigh; }
    public boolean isBlockingLow() { return blockingLow; }
    public boolean isCrouching() { return crouching; }
    public boolean isJumping() { return jumping; }

    @Override
    public int hashCode()
    {
        return hash;
    }

    public boolean isAlive()
    {
        return (health > 0);
    }

    public void move(int distance)
    {
        Coordinate target = position.add(distance);
        if (Math.abs(target.getX() - other.getPosition().getX()) >= 16)
        {
            position = target;
        }
        else if (distance > 1)
        {
            move(distance - 1);
        }
    }

    public boolean inReach(int reach)
    {
        return position.getDistance(other.getPosition()) <= reach;
    }

    public void plan()
    {
        if (processes.isEmpty())
        {
            planNextAction(getSituation());
        }
    }

    public void step(List<Event> events)
    {
        if (isAlive())
        {
            ListIterator<Process> it = processes.listIterator();
            while (it.hasNext())
            {
                Process p = it.next();
                p.step(events);
                if (p.isFinished())
                {
                    it.remove();
                }
            }
        }
    }

    public void planNextAction(List<State> situation)
    {
        List<Action> actions = template.getMatchingActions(situation);
        Action next;
        if (actions.size() == 0)
        {
            next = template.getAlways();
        }
        else
        {
            Collections.shuffle(actions);
            next = actions.get(0);
        }
        processes.add(new Move(next.getMove(), this, other));
        processes.add(new Fight(next.getAttack(), this, other));
    }

    public List<State> getSituation()
    {
        List<State> situation = new ArrayList<State>();
        int healthDiff = health - other.getHealth();
        if (healthDiff != 0)
        {
            if (healthDiff > 20)
            {
                situation.add(new State("much_weaker"));
            }
            else if (healthDiff > 0)
            {
                situation.add(new State("weaker"));
            }
            else if (healthDiff < 0)
            {
                situation.add(new State("stronger"));
            }
            else if (healthDiff < 20)
            {
                situation.add(new State("much_stronger"));
            }
        }

        int distance = position.getDistance(other.getPosition());
        if (distance <= 50)
        {
            situation.add(new State("near"));
        }
        else if (distance >= 200)
        {
            situation.add(new State("far"));
        }
        return situation;
    }
}
