package saf.ast;

import saf.ast.nodes.*;
import java.util.ArrayList;

public class Validator implements Visitor {
    private ArrayList<String> messages = new ArrayList<String>();
    
    // print all message, not only errors
    private boolean verbose;
    private int errorsFound;                                 
    
    
    public Validator() {
        this(false);
    }
    
    public Validator(boolean enableVerbosity) {
        verbose = enableVerbosity;
        errorsFound = 0;
    }
    
    public String messagesAsString() {
        String result = "";
        for ( int i=0; i < messages.size(); i++ ) {
            result += messages.get(i);
            if ( i+1 < messages.size() ) {
                result += "\n";
            }
        }
        return result;
    }    

    public void visit(Attack attack) {
        if (verbose) messages.add("Visiting Attack node: " + attack.getName());
        
    }
    
    public void visit(Move move) {
        if (verbose) messages.add("Visiting Move node: " + move.getName());
    }
    
    public void visit(Condition condition) {
        if (verbose) messages.add("Visiting Condition node: " + condition.getName());
    }
 
    public void visit(Strength strength) {
        if (verbose) messages.add("Visiting Strength node " + strength.getName());
        String[] allowStrengths = {
        if (strength.getName()
    }
       
    public void visit(Fighter fighter) {
        if (verbose) messages.add("Visiting Fighter node: " + fighter.getName());
        visitChildren(fighter);
    }
 
    public void visit(Rule rule) {
        if (verbose) messages.add("Visiting Rule node");    
        visitChildren(rule);  
    }
       
    public void visit(And and) {
        if (verbose) messages.add("Visiting And node");
        if (and.childCount() != 2) {
            messages.add("Error: And node find with " + and.childCount() + " children");
            errorsFound += 1;
        }        
        visitChildren(and);            
    }
    
    // Note: a clone of visit(And and)!
    public void visit(Or or) {
        if (verbose) messages.add("Visiting Or node");
        if (or.childCount() != 2) {
            messages.add("Error: Or node find with " + or.childCount() + " children");
            errorsFound += 1;
        }        
        visitChildren(or);    
    }
    
    private void visitChildren(ASTNode node) {        
        for (int i = 0; i < node.childCount(); i++) {
            ASTNode child = node.getChild(i);
            child.accept(this);
        }      
    }
}

