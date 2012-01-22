/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class AWeakerConditionType extends PConditionType
{
    private TWeaker _weaker_;

    public AWeakerConditionType()
    {
        // Constructor
    }

    public AWeakerConditionType(
        @SuppressWarnings("hiding") TWeaker _weaker_)
    {
        // Constructor
        setWeaker(_weaker_);

    }

    @Override
    public Object clone()
    {
        return new AWeakerConditionType(
            cloneNode(this._weaker_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWeakerConditionType(this);
    }

    public TWeaker getWeaker()
    {
        return this._weaker_;
    }

    public void setWeaker(TWeaker node)
    {
        if(this._weaker_ != null)
        {
            this._weaker_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._weaker_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._weaker_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._weaker_ == child)
        {
            this._weaker_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._weaker_ == oldChild)
        {
            setWeaker((TWeaker) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
