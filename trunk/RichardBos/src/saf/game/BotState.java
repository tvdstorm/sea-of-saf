package saf.game;

import saf.game.gui.GameController;
import saf.structure.Bot;
import saf.structure.Characteristic;
import saf.structure.intelligence.BotIntelligence;

public class BotState {
	
	public BotState(Bot bot, String side, GameController gameController)
	{
		this.gameController = gameController;
		this.bot = bot;
		this.side = side;
		this.hitpoints = 100;
		this.jumping = false;
		this.winner = false;
		this.speed = calculateSpeed(bot);
	}
	
	private GameController gameController;
	private Bot bot;
	private String side;
	private int hitpoints;
	private boolean jumping;
	private boolean winner;
	private double speed;
	
	private double credits;
	
	public int getHitpoints() {
		return hitpoints;
	}
	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
		gameController.setHitpoints(this);
	}
	
	public boolean isJumping() {
		return jumping;
	}
	public void setJumping(boolean jumping) {
		this.jumping = jumping;
		gameController.setJumping(this);
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
	
	
	private double calculateSpeed(Bot bot) {
		int punchPower = loadCharacteristic(GameConstant.Characteristic_punchPower);
		int kickPower = loadCharacteristic(GameConstant.Characteristic_kickPower);
		
		int punchReach = loadCharacteristic(GameConstant.Characteristic_punchReach);
		int kickReach = loadCharacteristic(GameConstant.Characteristic_kickReach);
		
		//Formula as noted on blackboard.
		double weight = (punchPower + kickPower) / 2;
		double height = (punchReach + kickReach) / 2;
		this.speed = 0.5 * (height-weight);
		return 0;
	}
	
	private int loadCharacteristic(String name)
	{
		Characteristic characteristic = BotIntelligence.getCharacteristic(bot, name); 
		return characteristic.getValue();
	}
}
