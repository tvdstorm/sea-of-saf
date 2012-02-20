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

    public boolean isSafe()
    {
        for (Message message : messages)
        {
            if (message.isFatal())
            {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty()
    {
        return messages.isEmpty();
    }

    public String toString()
    {
        if (messages.size() == 0)
        {
            return "No messages.";
        }

        String log = "";
        for (Message message : messages)
        {
            log += message + "\n";
        }
        return log;
    }
}
