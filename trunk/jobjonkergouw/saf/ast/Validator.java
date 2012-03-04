package saf.ast;

import saf.ast.nodes.*;
import java.util.ArrayList;
import java.util.List;

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
    
    public boolean isValid(Fighter fighter) {
        visit(fighter);
        if (errorsFound == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
    
    /************************************ Visit methods ************************************/
    
    public void visit(Attack attack) {
        if (verbose) messages.add("Visiting Attack node: " + attack.getName() );
        
        String[] allowedAttacksArray = {"punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high"};
        List<String> allowedAttacks = java.util.Arrays.asList(allowedAttacksArray); 
        for ( String attackChoice : attack.getActionsAsArrayList() ) {
            if ( !allowedAttacks.contains(attackChoice) ) {
                messages.add( "Invalid AST: Attack node contains unkown attack type: " + attackChoice );
                errorsFound += 1;        
            }
        }  
    }
    
    // notice: This is a clone of visit(Attack) !
    public void visit(Move move) {
        if (verbose) messages.add("Visiting Move node: " + move.getName() );
        
        String[] allowedMovesArray = {"jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away"};
        List<String> allowedMoves = java.util.Arrays.asList(allowedMovesArray); 
        for ( String moveChoice : move.getActionsAsArrayList() ) {
            if ( !allowedMoves.contains(moveChoice) ) {
                messages.add( "Invalid AST: Move node contains unkown move type: " + moveChoice );
                errorsFound += 1;        
            }
        }          
    }
    
    // notice: This is a semi-clone of visit(Attack) !
    public void visit(Condition condition) {
        if (verbose) messages.add("Visiting Condition node: " + condition.getName() );
        
        String[] allowedConditionsArray = {"stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always"};
        List<String> allowedConditions = java.util.Arrays.asList(allowedConditionsArray);         
        if ( !allowedConditions.contains(condition.getName()) ) {
            messages.add( "Invalid AST: Condition node of unkown type: " + condition.getName() );
            errorsFound += 1;        
        }
    }
    
    // notice: This is a semi-clone of visit(Attack) !
    public void visit(Strength strength) {
        if (verbose) messages.add( "Visiting Strength node " + strength.getName() );
        
        String[] allowedStrengthsArray = {"punchReach", "kickReach", "kickPower", "punchPower"};
        List<String> allowedStrengths = java.util.Arrays.asList(allowedStrengthsArray);     
        if ( !allowedStrengths.contains(strength.getName()) ) {
            messages.add( "Invalid AST: Strength node of unkown type: " + strength.getName() );
            errorsFound += 1;        
        }
        
        if (strength.getValue() > 10 | strength.getValue() < 1) {
            messages.add( "Invalid AST: Strength node " + strength.getName() + " with invalid value " + strength.getValue() );
            errorsFound += 1;          
        }
    }
       
    public void visit(Fighter fighter) {
        if (verbose) messages.add( "Visiting Fighter node: " + fighter.getName() );
        visitChildren(fighter);
    }
 
    public void visit(Rule rule) {
        if (verbose) messages.add("Visiting Rule node");    
        visitChildren(rule);  
    }
       
    public void visit(And and) {
        if (verbose) messages.add("Visiting And node");
        if (and.childCount() != 2) {
            messages.add( "Invalid AST: And node find with " + and.childCount() + " children" );
            errorsFound += 1;
        }        
        visitChildren(and);            
    }
    
    // Note: a clone of visit(And and)! 
    public void visit(Or or) {
        if (verbose) messages.add("Visiting Or node");
        if (or.childCount() != 2) {
            messages.add( "Invalid AST: Or node find with " + or.childCount() + " children" );
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

