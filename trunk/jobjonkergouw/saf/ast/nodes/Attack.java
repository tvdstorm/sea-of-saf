package saf.ast.nodes;

import saf.ast.Visitor;

public class Attack extends Action {
    public Attack(String attack) {
        super(attack);
    }
    
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
