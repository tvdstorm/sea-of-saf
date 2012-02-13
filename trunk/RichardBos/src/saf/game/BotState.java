package saf.game;

import saf.game.gui.GameController;
import saf.structure.Bot;
import saf.structure.intelligence.BehaviorIntelligence;

public class BotState {
	
	public BotState(Bot bot, String side, GameController gameController)
	{
		this.gameController = gameController;
		this.bot = bot;
		this.side = side;
		this.hitpoints = 100;
		this.winner = false;
		this.speed = calculateSpeed(bot);
		this.distanceFromWall = 50;
		this.lastFightAction = "";
		this.lastMoveAction = "stand";
	}
	
	private GameController gameController;
	private Bot bot;
	private String side;
	private int hitpoints;
	private boolean winner;
	private double speed;
	private int distanceFromWall;
	private double credits;
	private String lastFightAction;
	private String lastMoveAction;

	public int getHitpoints() {
		return hitpoints;
	}
	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
		this.gameController.setHitpoints(this);
	}
	public void updateHitpoints(double attackPower) {
		this.hitpoints = (int)(this.hitpoints - attackPower);
		this.gameController.setHitpoints(this);
	}
	
	public boolean isJumping() {
		return lastMoveAction.equals(GameConstant.MOVETYPE_JUMP);
	}
	
	
	public Bot getBot() {
		return bot;
	}
	public String getSide() {
		return side;
	}
	
	public boolean isWinner() {
		return winner;
	}
	public void setWinner(boolean value)
	{
		this.winner = value;
	}
	
	public double getSpeed()
	{
		return this.speed;
	}
	
	public void setCredits(double credits)
	{
		this.credits = credits;
	}
	public double getCredits()
	{
		return this.credits;
	}
	public void updateCredits()
	{
		this.credits += this.speed;
	}
	public void updateCredits(double dAmount)
	{
		this.credits += dAmount;
	}
		
	public int getDistanceFromWall() {
		return distanceFromWall;
	}
	public void setDistanceFromWall(int distanceFromWall) {
		this.distanceFromWall = distanceFromWall;
	}
	public void updateDistanceFromWall(int dAmount)
	{
		this.distanceFromWall += dAmount;
	}
	
	public String getLastFightAction() {
		return lastFightAction;
	}
	public void setLastFightAction(String lastFightAction) {
		this.lastFightAction = lastFightAction;
	}	
		
	private double calculateSpeed(Bot bot) {
		
		int punchPower = BehaviorIntelligence.getCharacteristic(bot,GameConstant.Characteristic_punchPower);
		int kickPower = BehaviorIntelligence.getCharacteristic(bot, GameConstant.Characteristic_kickPower);
		
		int punchReach = BehaviorIntelligence.getCharacteristic(bot, GameConstant.Characteristic_punchReach);
		int kickReach = BehaviorIntelligence.getCharacteristic(bot, GameConstant.Characteristic_kickReach);
		
		//Formula as noted on blackboard.
		double weight = (punchPower + kickPower) / 2;
		double height = (punchReach + kickReach) / 2;
		
		return 0.5 * (height-weight);
	}

	public String getLastMoveAction() {
		return lastMoveAction;
	}
	public void setLastMoveAction(String lastMoveAction) {
		this.lastMoveAction = lastMoveAction;
	}
	

}