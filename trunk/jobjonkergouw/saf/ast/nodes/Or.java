package saf.ast.nodes;

import saf.ast.Visitor;

public class Or extends ASTNode {
    private final String name = "or";
    
    public Or() { }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public String getName() {
            return name;
    }
}

