/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class AProgramPunchReach extends PProgramPunchReach
{
    private TPunchReach _punchReach_;
    private TEquals _equals_;
    private TDigit _digit_;
    private TNewline _newline_;

    public AProgramPunchReach()
    {
        // Constructor
    }

    public AProgramPunchReach(
        @SuppressWarnings("hiding") TPunchReach _punchReach_,
        @SuppressWarnings("hiding") TEquals _equals_,
        @SuppressWarnings("hiding") TDigit _digit_,
        @SuppressWarnings("hiding") TNewline _newline_)
    {
        // Constructor
        setPunchReach(_punchReach_);

        setEquals(_equals_);

        setDigit(_digit_);

        setNewline(_newline_);

    }

    @Override
    public Object clone()
    {
        return new AProgramPunchReach(
            cloneNode(this._punchReach_),
            cloneNode(this._equals_),
            cloneNode(this._digit_),
            cloneNode(this._newline_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgramPunchReach(this);
    }

    public TPunchReach getPunchReach()
    {
        return this._punchReach_;
    }

    public void setPunchReach(TPunchReach node)
    {
        if(this._punchReach_ != null)
        {
            this._punchReach_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._punchReach_ = node;
    }

    public TEquals getEquals()
    {
        return this._equals_;
    }

    public void setEquals(TEquals node)
    {
        if(this._equals_ != null)
        {
            this._equals_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equals_ = node;
    }

    public TDigit getDigit()
    {
        return this._digit_;
    }

    public void setDigit(TDigit node)
    {
        if(this._digit_ != null)
        {
            this._digit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._digit_ = node;
    }

    public TNewline getNewline()
    {
        return this._newline_;
    }

    public void setNewline(TNewline node)
    {
        if(this._newline_ != null)
        {
            this._newline_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._newline_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._punchReach_)
            + toString(this._equals_)
            + toString(this._digit_)
            + toString(this._newline_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._punchReach_ == child)
        {
            this._punchReach_ = null;
            return;
        }

        if(this._equals_ == child)
        {
            this._equals_ = null;
            return;
        }

        if(this._digit_ == child)
        {
            this._digit_ = null;
            return;
        }

        if(this._newline_ == child)
        {
            this._newline_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._punchReach_ == oldChild)
        {
            setPunchReach((TPunchReach) newChild);
            return;
        }

        if(this._equals_ == oldChild)
        {
            setEquals((TEquals) newChild);
            return;
        }

        if(this._digit_ == oldChild)
        {
            setDigit((TDigit) newChild);
            return;
        }

        if(this._newline_ == oldChild)
        {
            setNewline((TNewline) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}