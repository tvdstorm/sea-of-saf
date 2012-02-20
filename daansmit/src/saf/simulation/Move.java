package saf.simulation;

import java.util.List;

import saf.simulation.Instance;
import saf.simulation.event.*;
import saf.syntax.Response;

public class Move extends Process
{
    private static final int BASE_DURATION = 45;
    private static final int RUN_DISTANCE = 3;
    private static final int WALK_DISTANCE = 2;

    public Move(Response activity, Instance subject, Instance complement)
    {
        super(activity, subject, complement);
    }

    @Override
    public void first(List<Event> events)
    {
        if (getActivity().getId() == "jump")
        {
            getSubject().setJumping(true);
            events.add(new Jump(getSubject()));
        }
        else if (getActivity().getId() == "crouch")
        {
            getSubject().setCrouching(true);
            events.add(new Crouch(getSubject()));
        }
    }

    @Override
    public void last(List<Event> events)
    {
        if (getActivity().getId() == "jump")
        {
            getSubject().setJumping(false);
            events.add(new Stand(getSubject()));
        }
        else if (getActivity().getId() == "crouch")
        {
            getSubject().setCrouching(false);
            events.add(new Stand(getSubject()));
        }
    }

    @Override
    public void every(List<Event> events)
    {
        Coordinate position = getSubject().getPosition();
        Coordinate other = getComplement().getPosition();
        int towards = position.getDirection(other);
        int away = other.getDirection(position);

        int distance = 0;
        if (getActivity().getId() == "run_away")
        {
            distance = (away * RUN_DISTANCE);
        }
        else if (getActivity().getId() == "run_towards")
        {
            distance = (towards * RUN_DISTANCE);
        }
        else if (getActivity().getId() == "walk_away")
        {
            distance = (away * WALK_DISTANCE);
        }
        else if (getActivity().getId() == "run_towards")
        {
            distance = (towards * WALK_DISTANCE);
        }
        else
        {
            return;
        }
        getSubject().move(distance);
        events.add(new MoveTo(getSubject()));
    }
}
