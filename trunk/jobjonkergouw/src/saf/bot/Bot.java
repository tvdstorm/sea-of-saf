package saf.bot;

import java.util.ArrayList;

/**
 * Contains all bot properties gathered from the AST
 **/
public abstract class Bot { 
	protected String name;
	protected int punchReach;
    protected int punchPower;
    protected int kickReach;
    protected int kickPower;         
    protected double speed;
    protected int totalPower;
    protected ArrayList<BehaviourRule> rules = new ArrayList<BehaviourRule>();

	public Bot(String name, int punchReach, int punchPower, int kickReach, int kickPower) {
        this.name = name;
        this.punchReach = punchReach;
        this.punchPower = punchPower;
        this.kickReach = kickReach;
        this.kickPower = kickPower;
        
        double weight = (punchPower + kickPower) / 2.;
        double height = (punchReach + kickReach) / 2.;
        speed = java.lang.Math.abs(0.5 * (height - weight));
                                     
        computeTotalPower();
    }

    public String attributesAsString() {
        String result = "Bot " + name + "\n";
        result += "----------------------------\n";
        result += "Attributes = (" + punchReach + ", " + punchPower + ", " + kickReach + ", " + kickPower + ")\n"; 
        result += "Speed = " + speed + "\n";  
        result += "totalPower = " + totalPower + "\n"; 
        result += "rules:\n";
        for (BehaviourRule rule : rules) {
            result += "\t" + rule.toString() + "\n";
        }
        return result;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    /**
     * Add a rule to the bot
     * @param rule
     */
    public void addRule(BehaviourRule rule) {
        rules.add(rule);
    }

    private void computeTotalPower() {
        totalPower = punchPower + punchReach + kickReach + kickPower;
    }
    
}
