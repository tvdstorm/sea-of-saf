package saf.simulation;

import java.util.List;

import saf.simulation.Instance;
import saf.simulation.event.*;
import saf.syntax.Response;

public class Move extends Process
{
    private static final int RUN_DISTANCE = 3;
    private static final int WALK_DISTANCE = 2;

    public Move(Response activity, Instance subject, Instance complement)
    {
        super(activity, subject, complement);
    }

    @Override
    public void first(List<Event> events)
    {
        switch (getActivity().getId())
        {
        case "jump":
            getSubject().setJumping(true);
            events.add(new Jump(getSubject()));
            break;
        case "crouch":
            getSubject().setCrouching(true);
            events.add(new Crouch(getSubject()));
            break;
        }
    }

    @Override
    public void last(List<Event> events)
    {
        switch (getActivity().getId())
        {
        case "jump":
            getSubject().setJumping(false);
            events.add(new Stand(getSubject()));
            break;
        case "crouch":
            getSubject().setCrouching(false);
            events.add(new Stand(getSubject()));
            break;
        }
    }

    @Override
    public void every(List<Event> events)
    {
        Coordinate position = getSubject().getPosition();
        Coordinate other = getComplement().getPosition();
        int towards = position.getDirection(other);
        int away = other.getDirection(position);

        Integer distance;
        switch (getActivity().getId())
        {
        case "run_away":
            distance = (away * RUN_DISTANCE);
            break;
        case "run_towards":
            distance = (towards * RUN_DISTANCE);
            break;
        case "walk_away":
            distance = (away * WALK_DISTANCE);
            break;
        case "walk_towards":
            distance = (towards * WALK_DISTANCE);
            break;
        default:
            return;
        }

        getSubject().move(distance);
        if (!position.equals(getSubject().getPosition()))
        {
            events.add(new MoveTo(getSubject()));
        }
    }
}
