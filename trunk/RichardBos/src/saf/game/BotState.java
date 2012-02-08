package saf.game;

import saf.game.gui.GameController;
import saf.structure.Bot;

public class BotState {
	
	public BotState(Bot bot, String side, GameController gameController)
	{
		this.gameController = gameController;
		this.bot = bot;
		this.side = side;
		this.hitpoints = 100;
		this.jumping = false;
	}
	
	private GameController gameController;
	private Bot bot;
	private String side;
	private int hitpoints;
	private boolean jumping;
	
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
	
}
