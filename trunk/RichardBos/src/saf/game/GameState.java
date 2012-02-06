package saf.game;

import saf.structure.Bot;

public class GameState {
	private Bot BotLeft;
	private GameBot GameBotLeft;
	private Bot BotRight;
	private GameBot GameBotRight;
	private int Distance;
	
	public Bot getBotLeft() {
		return BotLeft;
	}
	public void setBotLeft(Bot botOne) {
		BotLeft = botOne;
		GameBotLeft = new GameBot();
	}
	
	public Bot getBotRight() {
		return BotRight;
	}
	public void setBotRight(Bot botTwo) {
		BotRight = botTwo;
		GameBotRight = new GameBot();
	}
	
	public int getDistance() {
		return Distance;
	}
	public void setDistance(int distance) {
		Distance = distance;
	}
	public void updateDistance(int dAmount)
	{
		Distance += dAmount;
	}

	public int getBotLeftHitpoints()
	{
		return GameBotLeft.getHitpoints();
	}
	public void substractBotLeftHitpoints(int amount)
	{
		GameBotLeft.setHitpoints(GameBotLeft.getHitpoints() - amount);
	}
	
	public int getBotRightHitpoints()
	{
		return GameBotRight.getHitpoints();
	}
	public void substractBotRightHitpoints(int amount)
	{
		GameBotRight.setHitpoints(GameBotRight.getHitpoints() - amount);
	}
	
	public boolean getBoLefteIsJumping()
	{
		return GameBotLeft.isJumping();
	}
	public void setBotLeftJumping(boolean isJumping)
	{
		GameBotLeft.setIsJumping(isJumping);
	}
	
	public boolean getBotRightIsJumping()
	{
		return GameBotRight.isJumping();
	}
	public void setBotRightIsJumping(boolean isJumping)
	{
		GameBotRight.setIsJumping(isJumping);
	}
	
	private class GameBot
	{
		private GameBot()
		{
			this.Hitpoints = 100;
			this.Jumping = false;
		}
		private int Hitpoints;
		private boolean Jumping;
		
		public int getHitpoints() {
			return Hitpoints;
		}
		public void setHitpoints(int hitpoints) {
			Hitpoints = hitpoints;
		}
		
		public boolean isJumping() {
			return Jumping;
		}
		public void setIsJumping(boolean isJumping) {
			Jumping = isJumping;
		}
		
	}
}