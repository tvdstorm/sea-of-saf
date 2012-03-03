package saf.ast.nodes;

import saf.ast.Visitor;

public class Strength extends ASTNode {
    private String name;
    private Integer value;
    
    public Strength(String name, Integer value) {
            this.setName(name);
            this.setValue(value);
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
    
    public Integer getValue() {
            return value;
    }

    public void setValue(Integer value) {
            this.value = value;
    }         
}

