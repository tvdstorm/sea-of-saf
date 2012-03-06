package saf.game;

public class Game {
	private Bot bot1;
	private Bot bot2;
	
	private final double GAME_WIDTH = 14.;
	private final int SLEEPTIME = 500;	

	public Game(Bot bot1, Bot bot2) {
		this.bot1 = bot1;
		this.bot2 = bot2;

		bot1.setCurrentPosition(0.);
		bot2.setCurrentPosition(GAME_WIDTH);
	}

	// run game with graphics
	public void runGUI() {
		Window w = new Window(GAME_WIDTH, bot1, bot2);
		
		do {
			try {
				Thread.sleep(SLEEPTIME);
			} catch (java.lang.InterruptedException e) {
				java.lang.System.exit(1);
				e.printStackTrace();
			}
			
			runTimeStep();
			w.setBotStates(bot1, bot2);
			w.updateScreen();			
		} while (!bot1.isDead() && !bot2.isDead() );
	}

	// run a text based version
	public void runText() {
		do {
			try {
				Thread.sleep(SLEEPTIME);
			} catch (java.lang.InterruptedException e) {
				java.lang.System.exit(1);
				e.printStackTrace();
			}
			runTimeStep();
			System.out.println(bot1.botStateAsString());
			System.out.println(bot2.botStateAsString());
		} while (!bot1.isDead() && !bot2.isDead() );
	}

	private void runTimeStep() {
			bot1.compareStrengthConditions(bot2);
			bot2.compareStrengthConditions(bot1);
			bot1.compareRangeConditions(bot2);
			bot2.compareRangeConditions(bot1);

			bot1.determineMoveAndAttackByRules();
			bot2.determineMoveAndAttackByRules();

			bot1.moveOtherAccordingToState(bot2);
			bot2.moveOtherAccordingToState(bot1);

			bot1.attackOtherAccordingToState(bot2);
			bot2.attackOtherAccordingToState(bot1);
			
			bot2.checkIfDead();
			bot2.checkIfDead();
	}
}