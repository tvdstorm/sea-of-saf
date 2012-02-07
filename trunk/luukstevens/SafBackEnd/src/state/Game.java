package state;

import state.Bot.Position;

public class Game {
	private Bot leftBot;
	private Bot rightBot;
	
	public Game() {
		
		setLeftBot(new Bot(Position.LEFT));
		setRightBot(new Bot(Position.RIGHT));
	}

	public Bot getLeftBot() {
		return leftBot;
	}

	public void setLeftBot(Bot leftBot) {
		this.leftBot = leftBot;
	}

	public Bot getRightBot() {
		return rightBot;
	}

	public void setRightBot(Bot rightBot) {
		this.rightBot = rightBot;
	}
}
