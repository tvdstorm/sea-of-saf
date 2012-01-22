/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class AEvenConditionType extends PConditionType
{
    private TEven _even_;

    public AEvenConditionType()
    {
        // Constructor
    }

    public AEvenConditionType(
        @SuppressWarnings("hiding") TEven _even_)
    {
        // Constructor
        setEven(_even_);

    }

    @Override
    public Object clone()
    {
        return new AEvenConditionType(
            cloneNode(this._even_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEvenConditionType(this);
    }

    public TEven getEven()
    {
        return this._even_;
    }

    public void setEven(TEven node)
    {
        if(this._even_ != null)
        {
            this._even_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._even_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._even_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._even_ == child)
        {
            this._even_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._even_ == oldChild)
        {
            setEven((TEven) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
