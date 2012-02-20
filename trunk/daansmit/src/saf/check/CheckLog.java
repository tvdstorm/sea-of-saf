package saf.check;

import java.util.ArrayList;
import java.util.List;

public class CheckLog
{
    private final List<Message> messages = new ArrayList<Message>();

    public CheckLog() { }

    public void add(Message m)
    {
        messages.add(m);
    }

    public String toString()
    {
        return messages.toString();
    }
}
