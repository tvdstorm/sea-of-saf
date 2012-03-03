package saf.ast;

import saf.ast.nodes.*;

public interface Visitor {
    public void visit(And and);
    public void visit(Attack attack);
    public void visit(Condition condition);
    public void visit(Fighter fighter);
    public void visit(Move move);
    public void visit(Or or);
    public void visit(Rule rule);
    public void visit(Strength strength);
}

