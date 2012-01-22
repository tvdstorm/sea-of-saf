/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class TFar extends Token
{
    public TFar()
    {
        super.setText("far");
    }

    public TFar(int line, int pos)
    {
        super.setText("far");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFar(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFar text.");
    }
}
