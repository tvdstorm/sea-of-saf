package saf.simulation;

import saf.structure.Attribute;
import saf.structure.FightActionType;
import saf.structure.Fighter;
import saf.structure.MoveActionType;
import saf.structure.Rule;

public class FighterState extends Subject {

	private int health;
	private double height, weight, speed, fighterX, fighterY, step;
	private boolean actionPerform;
	private Fighter fighter;
	private StartingPosition startingPosition;
	private Rule currentRule;
	private MoveActionType currentMoveActionType;
	private FightActionType currentFightActionType;
	
	public FighterState(Fighter fighter, StartingPosition startingPosition)
	{
		switch (startingPosition) 
		{
			case left:
				this.fighterX = 10;
				break;
			case right:
				this.fighterX = 90;
				break;
		}
		this.setCurrentMoveActionType(MoveActionType.stand);
		this.fighter = fighter;
		this.startingPosition = startingPosition;
		this.fighterY = 0;
		this.health = 100;
		this.setHeightWeightAndSpeed();
		this.step = 0;
	}
	
	private void setHeightWeightAndSpeed()
	{
		int punchPower = AttributeAI.getAttributePower(fighter, Attribute.punchPower);
		int kickPower = AttributeAI.getAttributePower(fighter, Attribute.kickPower);
		int punchReach = AttributeAI.getAttributePower(fighter, Attribute.punchReach);
		int kickReach = AttributeAI.getAttributePower(fighter, Attribute.kickReach);
		
		weight = (punchPower + kickPower) / 2;
		height = (punchReach + kickReach) / 2;
		speed = (0.5*(height-weight) + 5); //+ 5 beceause we want to mitigate negatives
	}
	
	public double getFighterX() 
	{
		return fighterX;
	}
	
	public void moveFighterX(double move)
	{
		setFighterX(getFighterX() + move);
	}

	public void setFighterX(double fighterX) 
	{
		if(fighterX < 0) fighterX = 0;
		if(fighterX > 100) fighterX = 100;
		this.fighterX = fighterX;
		this.notifyObservers();
	}

	public double getFighterY() 
	{
		return fighterY;
	}

	public void setFighterY(double fighterY) 
	{
		this.fighterY = fighterY;
		this.notifyObservers();
	}

	public int getHealth() 
	{
		return health;
	}

	public void setHealth(int health) 
	{
		this.health = health;
		this.notifyObservers();
	}
	
	public void doDamage(int damage, FightActionType fightAction)
	{
		this.setHealth(this.getHealth() - FightActionAI.damageDone(this, damage, fightAction));
	}
	
	public boolean fighterLost()
	{
		return this.health <= 0;
	}

	public Fighter getFighter() {
		return fighter;
	}

	public Rule getCurrentRule() {
		return currentRule;
	}

	public void setCurrentRule(Rule currentRule) {
		this.currentRule = currentRule;
	}

	public StartingPosition getStartingPosition() {
		return startingPosition;
	}

	public MoveActionType getCurrentMoveActionType() {
		return currentMoveActionType;
	}

	public void setCurrentMoveActionType(MoveActionType currentMoveActionType) {
		this.currentMoveActionType = currentMoveActionType;
	}

	public FightActionType getCurrentFightActionType() {
		return currentFightActionType;
	}

	public void setCurrentFightActionType(FightActionType currentFightActionType) {
		this.currentFightActionType = currentFightActionType;
	}

	public boolean isActionPerform() {
		return actionPerform;
	}

	public void setActionPerform(boolean actionPerformed) {
		this.actionPerform = actionPerformed;
		this.notifyObservers();
	}

	public double getStep() {
		return step;
	}
	
	public void setStep(double step)
	{
		this.step = step;
	}

	public void incrementStep() {
		step += speed;
	}
	
	
}
