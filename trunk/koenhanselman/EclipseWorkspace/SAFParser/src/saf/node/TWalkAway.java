/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class TWalkAway extends Token
{
    public TWalkAway()
    {
        super.setText("walk_away");
    }

    public TWalkAway(int line, int pos)
    {
        super.setText("walk_away");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TWalkAway(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTWalkAway(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TWalkAway text.");
    }
}