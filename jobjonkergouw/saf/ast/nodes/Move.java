package saf.ast.nodes;

import saf.ast.Visitor;

public class Move extends Action {
    public Move(String move) {
        super(move);
    }
    
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }     
}

