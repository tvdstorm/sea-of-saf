/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class AKickPowerProgramCharacteristic extends PProgramCharacteristic
{
    private PProgramKickPower _programKickPower_;

    public AKickPowerProgramCharacteristic()
    {
        // Constructor
    }

    public AKickPowerProgramCharacteristic(
        @SuppressWarnings("hiding") PProgramKickPower _programKickPower_)
    {
        // Constructor
        setProgramKickPower(_programKickPower_);

    }

    @Override
    public Object clone()
    {
        return new AKickPowerProgramCharacteristic(
            cloneNode(this._programKickPower_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAKickPowerProgramCharacteristic(this);
    }

    public PProgramKickPower getProgramKickPower()
    {
        return this._programKickPower_;
    }

    public void setProgramKickPower(PProgramKickPower node)
    {
        if(this._programKickPower_ != null)
        {
            this._programKickPower_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._programKickPower_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._programKickPower_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._programKickPower_ == child)
        {
            this._programKickPower_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._programKickPower_ == oldChild)
        {
            setProgramKickPower((PProgramKickPower) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}