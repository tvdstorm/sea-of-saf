package saf.simulation;

import java.util.Collections;
import java.util.List;

import saf.simulation.event.Event;
import saf.syntax.Choose;
import saf.syntax.Fighter;
import saf.syntax.Response;
import saf.syntax.Simple;

public abstract class Process
{
    private static final int BASE_DURATION = 10;

    private final Instance subject;
    private final Instance complement;
    private final Simple activity;
    private final int duration;
    private int step = 0;

    public Process(Response activity, Instance subject, Instance complement)
    {
        this.activity = choose(activity);
        this.subject = subject;
        this.complement = complement;

        Fighter template = subject.getTemplate();
        duration = BASE_DURATION - template.getSpeed();
    }

    public Simple getActivity() { return activity; }
    public Instance getComplement() { return complement; }
    public Instance getSubject() { return subject; }

    public boolean isFinished() { return (step > duration); }
    private Simple choose(Response response)
    {
        while (response instanceof Choose)
        {
            List<Response> choices = ((Choose) response).getResponses();
            Collections.shuffle(choices);
            response = choices.get(0);
        }
        return ((Simple) response);        
    }

    public void step(List<Event> events)
    {
        if (step == 0)
        {
            first(events);
        }
        else if (step == duration)
        {
            last(events);
        }
        else if (step < duration)
        {
            every(events);
        }
        step++;
    }

    public abstract void first(List<Event> events);
    public abstract void last(List<Event> events);
    public abstract void every(List<Event> events);

}
