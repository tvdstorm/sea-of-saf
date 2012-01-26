/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class APunchPowerProgramCharacteristic extends PProgramCharacteristic
{
    private PProgramPunchPower _programPunchPower_;

    public APunchPowerProgramCharacteristic()
    {
        // Constructor
    }

    public APunchPowerProgramCharacteristic(
        @SuppressWarnings("hiding") PProgramPunchPower _programPunchPower_)
    {
        // Constructor
        setProgramPunchPower(_programPunchPower_);

    }

    @Override
    public Object clone()
    {
        return new APunchPowerProgramCharacteristic(
            cloneNode(this._programPunchPower_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPunchPowerProgramCharacteristic(this);
    }

    public PProgramPunchPower getProgramPunchPower()
    {
        return this._programPunchPower_;
    }

    public void setProgramPunchPower(PProgramPunchPower node)
    {
        if(this._programPunchPower_ != null)
        {
            this._programPunchPower_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._programPunchPower_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._programPunchPower_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._programPunchPower_ == child)
        {
            this._programPunchPower_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._programPunchPower_ == oldChild)
        {
            setProgramPunchPower((PProgramPunchPower) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}