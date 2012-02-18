package program;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.lang.Math;
import grammar.Evaluators.*;

/* regels van het gevecht
 * punchReachh 1..10
 * punchPower 1..10
 * kickReach 1..10
 * kickPower 1..10
 * 
 * Distance Fight. posistionLeft - Fight. positionRight
 * even   stronger/weaker  much stronger/weaker worden bepaalt door
 *  life. bot1 - life. bot2  
 *  even = 10 - 20
 *  stronger/ weaker = 20 - 40
 *  much stronger / weaker > 40
 *  
 *  far > 20
 *  near <= 20
 *  
 *  kickpower over punchpower 
 *  block over kick
 *  punch over block
 *  
 *  Eerst afstand bepalen en gesteldheid tov de tegenstander.
 * 
*/


public class Fight {
	Bot botLeft, botRight;
	private int lifeLeft, lifeRight;
	private int positionLeft, positionRight;
	private String statusLeft, statusRight;
	private int distance;
	private InputRule currentMoveLeft,currentMoveRight;
	private InputRule currentFightLeft, currentFightRight;
	
	
	
	private static final Random RANDOM = new Random();
	
	public Fight(Bot botLeft, Bot botRight) {
		this.botLeft = botLeft;
		this.lifeLeft = 100;
		this.botRight = botRight;
		this.lifeRight = 100;
		this.positionLeft = 10;
		this.positionRight = 500;
		this.statusLeft = "even";
		this.statusRight = "even";
		this.botLeft.setSpeed(calcSpeed (botLeft));
		this.botRight.setSpeed(calcSpeed (botRight));
	}

	
	
	public int getPositionLeft() {
		return positionLeft;
	}
	
	public void setPositionLeft(int positionLeft) {
		this.positionLeft = positionLeft;
	}
	
	public int getDistance(){
		return this.positionRight - this.positionLeft;
	}
	
	public int getPositionRight() {
		return positionRight;
	}

	public void setPositionRight(int positionRight) {
		this.positionRight = positionRight;
	}
	
	public int getLifeRight(){
		if (this.lifeRight > 0){
			return this.lifeRight;
		}else{
			return 0;
		}
	}
	
	public void setLifeRight(int value) {
		this.lifeRight = value;
	}
	
	public int getLifeLeft(){
		if (this.lifeLeft > 0){
			return this.lifeLeft;
		}else{
			return 0;
		}
	}
	
	public void setLifeLeft(int value) {
		this.lifeLeft = value;
	}
	
	
	public String getStatusLeft() {
		return statusLeft;
	}

	public void setStatusLeft(String statusLeft) {
		this.statusLeft = statusLeft;
	}

	public String getStatusRight() {
		return statusRight;
	}

	public void setStatusRight(String statusRight) {
		this.statusRight = statusRight;
	}

	public String getCurrentFightAction (boolean left){
		if (left){
			return this.currentFightLeft.getInputrule(true);
		} else {
			return this.currentFightRight.getInputrule(true);
		}
	}
	
	public String calculateStrengthDif (int hisLife, int opponentLife){
		int dif = hisLife - opponentLife;
		if ((dif <   20) & (dif >   0)) {return "even";}
		if ((dif >=  20) & (dif <  40)) {return "stronger";}
		if ( dif >=  40) {return "much stronger";}
		if ((dif >  -20) & (dif <   0)) {return "even";}
		if ((dif <= -20) &( dif > -40)) {return "weaker";}
		if ( dif <= -40) {return "much weaker";}
		return "even";
	}
	
	public boolean stillAlive() {
		if (this.getLifeLeft() <= 0 || this.getLifeRight() <= 0 ){
			return false;
		} else {
			return true;
		}	
	}
	
	public double calcSpeed (Bot b){
		b.getCharacteristics();
		int punchPower = 5;
		int kickPower  = 5;
		int punchReach = 5;
		int kickReach  = 5;
		for (Characteristic c : b.getCharacteristics()){
			if (c.getCharacterName().equalsIgnoreCase("punchPower")){punchPower = c.getCharacterValue();};
			if (c.getCharacterName().equalsIgnoreCase("kickPower")) {kickPower  = c.getCharacterValue();};
			if (c.getCharacterName().equalsIgnoreCase("punchReach")){punchReach = c.getCharacterValue();};
			if (c.getCharacterName().equalsIgnoreCase("kickReach")) {kickReach  = c.getCharacterValue();};
		}
		double weight = (punchPower + kickPower) / 2;
		double heigth = (punchReach + kickReach) / 2;
		double speed = Math.abs(0.5 * (heigth - weight));
		if (speed == 0) { speed = 1.0;} //aanpassing om met speed te vermenigvuldigen ipv optellen
		return speed;
	}

	private String getDistanceString(){
		String distance = "";
		if (this.getDistance() < 20 ){
			distance = "near";
		}else{
			distance ="far";
		}
		return distance;
	}
	
	public InputRule getAction(Bot b, String sd, boolean move){
		List<InputRule> action = new LinkedList<InputRule>();
		for (Rule r:b.getRules()){
			for(Condition c: r.getConditionList()){
				if ((c.getLeft().equalsIgnoreCase(sd))||(c.getLeft().equalsIgnoreCase(getDistanceString()))){
					if (move){
						action.add(r.getMoveRule());
					}else{
						action.add(r.getFightRule());
					}
				}
			}
		}
		if (action.size() == 0 ) {
			return getAction(b , "always", move);
		} 
		return action.get(RANDOM.nextInt(action.size()));
	}
	
	
	public void doAction() {
		this.setStatusLeft(calculateStrengthDif(this.lifeLeft,this.lifeRight));
		this.setStatusRight(calculateStrengthDif(this.lifeRight,this.lifeLeft));
		this.distance = this.positionRight - this.positionLeft;
		this.currentMoveLeft = getAction(botLeft,this.statusLeft,true);
		this.currentMoveRight = getAction(botRight,this.statusRight, true);
		this.currentFightLeft = getAction(botLeft,this.statusLeft, false);
		this.currentFightRight = getAction(botRight, this.statusRight, false);
		calculateLife(this.currentFightLeft, this.currentFightRight);
		calculatePositions(this.currentMoveLeft,this.currentMoveRight);
	}
	
	public void calculateLife(InputRule irl, InputRule irr){
		if (this.distance <= 10) {
			if ((!irl.getInputrule(true).contains("block")) && (irr.getInputrule(true).contains("kick"))) { this.lifeLeft -= 5 * this.botLeft.getSpeed() ;}
			if ((!irl.getInputrule(true).contains("block")) && (irr.getInputrule(true).contains("punch"))){ this.lifeLeft -= 3 * this.botLeft.getSpeed();}
			if ((irl.getInputrule(true).contains("block"))  && (irr.getInputrule(true).contains("kick"))) { this.lifeLeft -= 3 * this.botLeft.getSpeed();}
			if ((irl.getInputrule(true).contains("block"))  && (irr.getInputrule(true).contains("punch"))){ this.lifeLeft -= 1 * this.botLeft.getSpeed();}
			if ((!irr.getInputrule(true).contains("block")) && (irl.getInputrule(true).contains("kick"))) { this.lifeRight -= 5 * this.botRight.getSpeed();}
			if ((!irr.getInputrule(true).contains("block")) && (irl.getInputrule(true).contains("punch"))){ this.lifeRight -= 3 * this.botRight.getSpeed();}
			if ((irr.getInputrule(true).contains("block"))  && (irl.getInputrule(true).contains("kick"))) { this.lifeRight -= 3 * this.botRight.getSpeed();}
			if ((irr.getInputrule(true).contains("block"))  && (irl.getInputrule(true).contains("punch"))){ this.lifeRight -= 1 * this.botRight.getSpeed();}
		}
	}
	
	public void calculatePositions(InputRule irl, InputRule irr){
		this.positionLeft  = this.positionLeft +  calcMove(irl.getInputrule(true));
		this.positionRight = this.positionRight - calcMove(irr.getInputrule(true));
	}
	
	public int calcMove (String m){
		if (m.contains("run_towards")) {return  10;}
		if (m.contains("run_away"))    {return -10;}
		if (m.contains("walk_towards")){return   5;}
		if (m.contains("walk_away"))   {return  -5;}
		return 0;
	}

	
	
	
		

	
}
