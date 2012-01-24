/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class TRunTowards extends Token
{
    public TRunTowards()
    {
        super.setText("run_towards");
    }

    public TRunTowards(int line, int pos)
    {
        super.setText("run_towards");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRunTowards(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRunTowards(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRunTowards text.");
    }
}