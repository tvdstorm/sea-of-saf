package test;

import saf.*;
import test.*;

public class SafVisitorCheck implements SafVisitor {

	public void visit(Saf saf) {      
        System.out.println("Visiting " + saf.getName());
       
        if (saf.getBehaviour() == null) System.err.println("There is no behaviour defined");
        if (saf.getPersonality() == null) System.err.println("There is no personality defined");
    }
 
    public void visit(Personality p) {
        System.out.println("Visiting personality");
    }
 
    public void visit(Behaviour b) {
        System.out.println("Visiting behaviour");
    }
    
    public void visit(BehaviourRule br) {
        System.out.println("Visiting BehaviourRule");
    }
    
    public void visit(Condition c) {
        System.out.println("Visiting condition");
    }
    
    public void visit(Type t) {
        System.out.println("Visiting type:" + t.getType());
    }
}
