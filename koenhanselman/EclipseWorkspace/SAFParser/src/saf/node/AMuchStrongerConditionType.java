/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class AMuchStrongerConditionType extends PConditionType
{
    private TMuchStronger _muchStronger_;

    public AMuchStrongerConditionType()
    {
        // Constructor
    }

    public AMuchStrongerConditionType(
        @SuppressWarnings("hiding") TMuchStronger _muchStronger_)
    {
        // Constructor
        setMuchStronger(_muchStronger_);

    }

    @Override
    public Object clone()
    {
        return new AMuchStrongerConditionType(
            cloneNode(this._muchStronger_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMuchStrongerConditionType(this);
    }

    public TMuchStronger getMuchStronger()
    {
        return this._muchStronger_;
    }

    public void setMuchStronger(TMuchStronger node)
    {
        if(this._muchStronger_ != null)
        {
            this._muchStronger_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._muchStronger_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._muchStronger_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._muchStronger_ == child)
        {
            this._muchStronger_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._muchStronger_ == oldChild)
        {
            setMuchStronger((TMuchStronger) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}