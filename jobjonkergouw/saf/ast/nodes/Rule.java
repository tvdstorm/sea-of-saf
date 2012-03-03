package saf.ast.nodes;

import saf.ast.Visitor;

public class Rule extends ASTNode {
    private String name = "rule";
    
    public Rule() {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }
}

