/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class ANearConditionType extends PConditionType
{
    private TNear _near_;

    public ANearConditionType()
    {
        // Constructor
    }

    public ANearConditionType(
        @SuppressWarnings("hiding") TNear _near_)
    {
        // Constructor
        setNear(_near_);

    }

    @Override
    public Object clone()
    {
        return new ANearConditionType(
            cloneNode(this._near_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANearConditionType(this);
    }

    public TNear getNear()
    {
        return this._near_;
    }

    public void setNear(TNear node)
    {
        if(this._near_ != null)
        {
            this._near_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._near_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._near_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._near_ == child)
        {
            this._near_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._near_ == oldChild)
        {
            setNear((TNear) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}