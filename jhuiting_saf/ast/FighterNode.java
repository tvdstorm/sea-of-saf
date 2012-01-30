package ast;

import visitor.FighterVisitor;

public interface FighterNode {

    public abstract void accept(FighterVisitor v);

}
