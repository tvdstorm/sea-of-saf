/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class AFarConditionType extends PConditionType
{
    private TFar _far_;

    public AFarConditionType()
    {
        // Constructor
    }

    public AFarConditionType(
        @SuppressWarnings("hiding") TFar _far_)
    {
        // Constructor
        setFar(_far_);

    }

    @Override
    public Object clone()
    {
        return new AFarConditionType(
            cloneNode(this._far_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFarConditionType(this);
    }

    public TFar getFar()
    {
        return this._far_;
    }

    public void setFar(TFar node)
    {
        if(this._far_ != null)
        {
            this._far_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._far_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._far_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._far_ == child)
        {
            this._far_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._far_ == oldChild)
        {
            setFar((TFar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
