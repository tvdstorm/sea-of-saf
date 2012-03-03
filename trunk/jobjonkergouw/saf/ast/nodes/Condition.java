package saf.ast.nodes;

import saf.ast.Visitor;

public class Condition extends ASTNode {
    private String name;
    
    public Condition(String name) {
        this.setName(name);
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

