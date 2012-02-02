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
	 *  Eerst afstand bepalen en geteldheid tov de tegenstander.
	 * 
	*/
	public Engine(Fight fight) {
		this.fight = fight;
		this.distance = fight.positionRight - fight.positionLeft;
		berekenleven();
		System.out.println(String.valueOf(this.distance));
	}
	
	private void berekenleven(){
		int lifeLeft = fight.lifeLeft;
		int lifeRight = fight.lifeRight;
		
		if (lifeLeft > lifeRight) {
			int restLife = lifeLeft - lifeRight;
			if ((restLife < 20) & (restLife > 0 )){leftStatus = "even"; rightStatus = "even";};
			if ((restLife >=20) & (restLife < 40)){leftStatus = "stronger"; rightStatus = "weaker";};
			if (restLife >=40) {leftStatus = "much stronger"; rightStatus = "much weaker";};
		} else {
			int restLife = lifeRight - lifeLeft;
			if ((restLife < 20) & (restLife > 0 )){rightStatus = "even"; leftStatus = "even";};
			if ((restLife >=20) & (restLife < 40)){rightStatus = "stronger"; leftStatus = "weaker";};
			if (restLife >=40) {rightStatus = "much stronger"; leftStatus = "much weaker";};
		}
		
	}
	
}
