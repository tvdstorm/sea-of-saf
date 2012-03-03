package saf.game;




/**
 * This class contains all properties of a fighter bot
 **/
public class Bot {
    public enum Move { JUMP, CROUCH, STAND, RUN_TOWARDS, RUN_AWAY, WALK_TOWARDS, WALK_AWAY };
    // design decision: idle attack defined to use as default attack
    public enum Attack { PUNCH_LOW, PUNCH_HIGH, KICK_LOW, KICK_HIGH, BLOCK_LOW, BLOCK_HIGH, IDLE };
    public enum StrengthCondition { STRONGER, WEAKER, MUCH_STRONGER, MUCH_WEAKER, EVEN };
    public enum RangeCondition { NEAR, FAR };   

    private String name;
    private int punchReach;
    private int punchPower;
    private int kickReach;
    private int kickPower;         
    private double speed;
    // extra attribute used to compare fighters
    private int totalPower;
    
    private Move currentMove = STAND;
    private Attack currentAttack = IDLE;
    private FightCondition strengthCondition = EVEN;
    private RangeCondition rangeCondition = FAR;  
    private double currentPosition = 0.;
    
    Bot (int punchReach, int punchPower, int kickReach, int kickPower) {
        this.punchReach = punchReach;
        this.punchPower = punchPower;
        this.kickReach = kickReach;
        this.kickPower = kickPower;
        
        weight = (punchPower + kickPower) / 2.;
        height = (punchReach + kickReach) / 2.;
        speed = Java.util.Math.abs(0.5 * (height - weight));                          
    }

    public void setPosition(double position) {
        currentPosition = position;
    }
    
    public void compareAndAdjustConditions(Bot other) {
        // compare the fight condition
        double strengthDifference = this.totalPower - other.totalPower;
        if (strengthDifference > 15) {
            this.strengthCondition = MUCH_STRONGER;
            other.strengthCondition = MUCH_WEAKER;;
        } else if (strengthDifference > 5) {
            this.strengthCondition = STRONGER;
            other.strengthCondition = WEAKER;        
        } else if (strengthDifference < -15) {
            this.strengthCondition = MUCH_WEAKER;
            other.strengthCondition = MUCH_STRONGER;        
        }
    }
    
    private void computeTotalPower() {
        totalPower = punchPower + punchReach + kickReach + kickPower;
    }
    
}










/////////////// getters & setters ///////////////
//////////// variables ///////////////    

//////////// constructor ///////////////    
//     // calculate derived attributes for fighter
//     public void calculateFinalAttributes() {
 
//     }
//     
//     public void addRule (String c1, String c2, String lo, 
//                          String m1, String m2, String f1, String f2) {
//         rules.add(new BehaviourRule(c1, c2, lo, m1, m2, f1, f2));              
//     }

// /////////////// interface ///////////////
//     public String botSummaryAsString() {
//         String result = "";
//         result += "Fighter " + name + "\n";
//         result += "---------------------");
//         result += "punchReach = " + punchReach);
//         result += "punchPower = " + punchPower);
//         result += "kickReach = " + kickReach);
//         result += "kickPower = " + kickPower);
//         
// //         // print rules
// //         Iterator it=rules.iterator();
// //         while(it.hasNext()) {
// //             BehaviourRule rule = (BehaviourRule)it.next();
// //             rule.print();
// //         }
// //         
// //         System.out.print("\n");
//     }
  
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     
//     public int getPunchReach() {
//         return punchReach;
//     } 
//     public void setPunchReach(int reach) {
//         this.punchReach = reach;
//     }  
//     
//     public int getPunchPower() {
//         return punchPower;
//     }
//     public void setPunchPower(int power) {
//         this.punchPower = power;
//     }
//     
//     public int getKickReach() {
//         return kickReach;
//     }
//     public void setKickReach(int reach) {
//         this.kickReach = reach;
//     }
//     
//     public int getKickPower() {
//         return kickPower;
//     }
//     public void setKickPower(int power) {
//         this.kickPower = power;
//     }  