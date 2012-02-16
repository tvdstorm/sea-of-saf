package program;

public class Engine {
	Fight fight;
	int distance;
	String leftStatus, rightStatus;
	
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
	public Engine(Fight fight) {
		this.fight = fight;
		this.distance = this.fight.getPositionRight() - this.fight.getPositionLeft();
		calculateLife();
		//System.out.println(String.valueOf(this.distance));
	}
	
	
	
	public void doAction() {
		this.fight.setLifeLeft(this.fight.getLifeLeft() + 10);
		this.fight.setLifeRight(this.fight.getLifeRight() - 10);
		calculateLife();
		System.out.println(String.valueOf(Integer.toString(this.fight.getLifeLeft()) + "  "+ Integer.toString(this.fight.getLifeRight())));
	}
	
	

	private void calculateLife(){
		int lifeLeft = this.fight.getLifeLeft();
		int lifeRight = this.fight.getLifeRight();
		
		if (lifeLeft > lifeRight) {
			int restLife = lifeLeft - lifeRight;
			if ((restLife < 20) & (restLife > 0 )){this.fight.setStatusLeft("even");this.fight.setStatusRight("even");};
			if ((restLife >= 20) & (restLife < 40)){this.fight.setStatusLeft("stronger"); this.fight.setStatusRight("weaker");};
			if (restLife >= 40) {this.fight.setStatusLeft("much stronger"); this.fight.setStatusRight("much weaker");};
		} else {
			int restLife = lifeRight - lifeLeft;
			if ((restLife < 20) & (restLife > 0 )){this.fight.setStatusRight("even"); this.fight.setStatusLeft("even");};
			if ((restLife >=20) & (restLife < 40)){this.fight.setStatusRight("stronger");this.fight.setStatusLeft("weaker");};
			if (restLife >=40) {this.fight.setStatusRight("much stronger"); this.fight.setStatusLeft("much weaker");};
		}
	}

	public boolean stillAlive() {
		if (this.fight.getLifeLeft() <= 0 || this.fight.getLifeRight() <= 0 ){
			return false;
		} else {
			return true;
		}	
	}
	
	public int getLifeLeft(){
		return this.fight.getLifeLeft();
	}
	
	public int getLifeRight(){
		return this.fight.getLifeRight();
	}
	
	public int getPositionLeft(){
		return this.fight.getPositionLeft();
	}
	
	public int getPositionRight(){
		return this.fight.getPositionRight();
	}
	
	
}
	

