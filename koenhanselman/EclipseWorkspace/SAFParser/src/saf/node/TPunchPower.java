/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class TPunchPower extends Token
{
    public TPunchPower()
    {
        super.setText("punchPower");
    }

    public TPunchPower(int line, int pos)
    {
        super.setText("punchPower");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPunchPower(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPunchPower(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPunchPower text.");
    }
}