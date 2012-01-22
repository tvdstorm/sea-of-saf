package cb.saf.game;

/**
 * Class Representing the characteristics of the fighter
 * @author Mpounta
 *
 */
public class Characteristics {
	
	/*
	 * Fields
	 */
	private static final int defaultValue=5; 
	private int kickReach=defaultValue;
	private int punchReach=defaultValue;
	private int kickPower=defaultValue;
	private int punchPower=defaultValue;
	
	/**
	 * Empty constructor
	 */
	public Characteristics(){
		
	}
	/**
	 * Constructor with initializations
	 * @param kickReach
	 * @param punchReach
	 * @param kickPower
	 * @param punchPower
	 */
	public Characteristics(int kickReach,int punchReach, int kickPower, int punchPower){
		this.setKickPower(kickPower);
		this.setKickReach(kickReach);
		this.setPunchPower(punchPower);
		this.setPunchReach(punchReach);
	}
	/**
	 * @return the kickReach
	 */
	public int getKickReach() {
		return kickReach;
	}
	/**
	 * @param kickReach the kickReach to set
	 */
	public void setKickReach(int kickReach) {
		this.kickReach = kickReach;
	}
	/**
	 * @return the punchReach
	 */
	public int getPunchReach() {
		return punchReach;
	}
	/**
	 * @param punchReach the punchReach to set
	 */
	public void setPunchReach(int punchReach) {
		this.punchReach = punchReach;
	}
	/**
	 * @return the kickPower
	 */
	public int getKickPower() {
		return kickPower;
	}
	/**
	 * @param kickPower the kickPower to set
	 */
	public void setKickPower(int kickPower) {
		this.kickPower = kickPower;
	}
	/**
	 * @return the punchPower
	 */
	public int getPunchPower() {
		return punchPower;
	}
	/**
	 * @param punchPower the punchPower to set
	 */
	public void setPunchPower(int punchPower) {
		this.punchPower = punchPower;
	}

}
