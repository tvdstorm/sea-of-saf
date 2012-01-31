/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class AKickHighFightActionType extends PFightActionType
{
    private TKickHigh _kickHigh_;

    public AKickHighFightActionType()
    {
        // Constructor
    }

    public AKickHighFightActionType(
        @SuppressWarnings("hiding") TKickHigh _kickHigh_)
    {
        // Constructor
        setKickHigh(_kickHigh_);

    }

    @Override
    public Object clone()
    {
        return new AKickHighFightActionType(
            cloneNode(this._kickHigh_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAKickHighFightActionType(this);
    }

    public TKickHigh getKickHigh()
    {
        return this._kickHigh_;
    }

    public void setKickHigh(TKickHigh node)
    {
        if(this._kickHigh_ != null)
        {
            this._kickHigh_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kickHigh_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kickHigh_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kickHigh_ == child)
        {
            this._kickHigh_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kickHigh_ == oldChild)
        {
            setKickHigh((TKickHigh) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}