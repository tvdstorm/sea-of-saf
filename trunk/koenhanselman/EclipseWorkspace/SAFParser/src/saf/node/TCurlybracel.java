/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class TCurlybracel extends Token
{
    public TCurlybracel()
    {
        super.setText("{");
    }

    public TCurlybracel(int line, int pos)
    {
        super.setText("{");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCurlybracel(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCurlybracel(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCurlybracel text.");
    }
}