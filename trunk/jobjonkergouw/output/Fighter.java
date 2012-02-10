package SAF;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Math;

/**
 * This class contains all properties of a fighter bot
 **/
public class Fighter {
/////////////// interface ///////////////
    public void print() {
        System.out.println("Fighter " + name);
        System.out.println("---------------------");
        System.out.println("punchReach = " + punchReach);
        System.out.println("punchPower = " + punchPower);
        System.out.println("kickReach = " + kickReach);
        System.out.println("kickPower = " + kickPower);
        
        // print rules
        Iterator it=rules.iterator();
        while(it.hasNext()) {
            BehaviourRule rule = (BehaviourRule)it.next();
            rule.print();
        }
        
        System.out.print("\n");
    }
  
    // calculate derived attributes for fighter
    public void calculateFinalAttributes() {
        weight = (punchPower + kickPower) / 2.;
        height = (punchReach + kickReach) / 2.;
        speed = Math.abs(0.5 * (height - weight));       
    }
    
    public void addRule (String c1, String c2, String lo, 
                         String m1, String m2, String f1, String f2) {
        rules.add(new BehaviourRule(c1, c2, lo, m1, m2, f1, f2));              
    }
    
/////////////// getters & setters ///////////////
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    
    public int getPunchReach() {
        return punchReach;
    } 
    public void setPunchReach(int reach) {
        punchReach = reach;
    }  
    
    public int getPunchPower() {
        return punchPower;
    }
    public void setPunchPower(int power) {
        punchPower = power;
    }
    
    public int getKickReach() {
        return kickReach;
    }
    public void setKickReach(int reach) {
        kickReach = reach;
    }
    
    public int getKickPower() {
        return kickPower;
    }
    public void setKickPower(int power) {
        kickPower = power;
    }
    
    public List<BehaviourRule> getRules() {
        return rules;
    }    
    
//////////// constructor ///////////////    
    Fighter () {
        punchReach = 5;
        punchPower = 5;
        kickReach = 5;
        kickPower = 5;
        weight = 0;
        height = 0;
        speed = 0;
        
        rules = new ArrayList<BehaviourRule>();
    }

//////////// variables ///////////////    
    List<BehaviourRule> rules;
   
    private String name;
    private int punchReach;
    private int punchPower;
    private int kickReach;
    private int kickPower;
    private double height;
    private double weight;
    private double speed;
    
}