package saf.syntax;

import java.util.ArrayList;
import java.util.List;

import saf.check.CheckLog;

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

    public List<Response> getResponses() { return responses; }

    public boolean isMove()
    {
        boolean isMove = true;
        for (Response r : responses)
        {
            isMove &= r.isMove();
        }
        return isMove;
    }

    public boolean isAttack()
    {
        boolean isAttack = true;
        for (Response r : responses)
        {
            isAttack &= r.isAttack();
        }
        return isAttack;
    }

    @Override
    public void check(CheckLog log)
    {
        for (Response r : responses)
        {
            r.check(log);
        }
    }

    public String toString()
    {
        return "Choose(" + responses.toString() + ")";
    }
}
