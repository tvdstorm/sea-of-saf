package saf.syntax;

import java.util.ArrayList;
import java.util.List;

public class Choose extends Response
{
    private final List<Response> responses = new ArrayList<Response>();

//    public Choose(List<Response> responses)
    public Choose(List<Simple> responses)
    {
        for (Response response : responses)
        {
            this.responses.add(response);
        }
    }

    public String toString()
    {
        return "Choose(" + responses.toString() + ")";
    }
}
