import java.io.*;

public class BehaviourRule {
    void print() {
        System.out.print("If " + condition1 + " ");
        if (!logicalOperator.isEmpty()) {
            System.out.print(logicalOperator + " " + condition2 + " ");
        }
        
        System.out.println("-> ");
    }
    
    
    BehaviourRule (String c1, String c2, String lo, String m1, String m2, String f1, String f2) {
            condition1 = c1;
            condition2 = c2;
            logicalOperator = lo;
            
            moveAction1 = m1;
            moveAction2 = m2;
            
            fightAction1 = f1;
            fightAction2 = f2;               
    }
    
    private String condition1;
    private String condition2;
    private String logicalOperator;
    
    private String moveAction1;
    private String moveAction2;
    
    private String fightAction1;
    private String fightAction2;
}