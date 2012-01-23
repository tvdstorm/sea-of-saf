/* This file was generated by SableCC (http://www.sablecc.org/). */

package saf.node;

import saf.analysis.*;

@SuppressWarnings("nls")
public final class AProgram extends PProgram
{
    private PProgramHeader _programHeader_;
    private PProgramPersonality _programPersonality_;
    private PProgramBehaviour _programBehaviour_;
    private PProgramFooter _programFooter_;

    public AProgram()
    {
        // Constructor
    }

    public AProgram(
        @SuppressWarnings("hiding") PProgramHeader _programHeader_,
        @SuppressWarnings("hiding") PProgramPersonality _programPersonality_,
        @SuppressWarnings("hiding") PProgramBehaviour _programBehaviour_,
        @SuppressWarnings("hiding") PProgramFooter _programFooter_)
    {
        // Constructor
        setProgramHeader(_programHeader_);

        setProgramPersonality(_programPersonality_);

        setProgramBehaviour(_programBehaviour_);

        setProgramFooter(_programFooter_);

    }

    @Override
    public Object clone()
    {
        return new AProgram(
            cloneNode(this._programHeader_),
            cloneNode(this._programPersonality_),
            cloneNode(this._programBehaviour_),
            cloneNode(this._programFooter_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgram(this);
    }

    public PProgramHeader getProgramHeader()
    {
        return this._programHeader_;
    }

    public void setProgramHeader(PProgramHeader node)
    {
        if(this._programHeader_ != null)
        {
            this._programHeader_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._programHeader_ = node;
    }

    public PProgramPersonality getProgramPersonality()
    {
        return this._programPersonality_;
    }

    public void setProgramPersonality(PProgramPersonality node)
    {
        if(this._programPersonality_ != null)
        {
            this._programPersonality_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._programPersonality_ = node;
    }

    public PProgramBehaviour getProgramBehaviour()
    {
        return this._programBehaviour_;
    }

    public void setProgramBehaviour(PProgramBehaviour node)
    {
        if(this._programBehaviour_ != null)
        {
            this._programBehaviour_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._programBehaviour_ = node;
    }

    public PProgramFooter getProgramFooter()
    {
        return this._programFooter_;
    }

    public void setProgramFooter(PProgramFooter node)
    {
        if(this._programFooter_ != null)
        {
            this._programFooter_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._programFooter_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._programHeader_)
            + toString(this._programPersonality_)
            + toString(this._programBehaviour_)
            + toString(this._programFooter_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._programHeader_ == child)
        {
            this._programHeader_ = null;
            return;
        }

        if(this._programPersonality_ == child)
        {
            this._programPersonality_ = null;
            return;
        }

        if(this._programBehaviour_ == child)
        {
            this._programBehaviour_ = null;
            return;
        }

        if(this._programFooter_ == child)
        {
            this._programFooter_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._programHeader_ == oldChild)
        {
            setProgramHeader((PProgramHeader) newChild);
            return;
        }

        if(this._programPersonality_ == oldChild)
        {
            setProgramPersonality((PProgramPersonality) newChild);
            return;
        }

        if(this._programBehaviour_ == oldChild)
        {
            setProgramBehaviour((PProgramBehaviour) newChild);
            return;
        }

        if(this._programFooter_ == oldChild)
        {
            setProgramFooter((PProgramFooter) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}