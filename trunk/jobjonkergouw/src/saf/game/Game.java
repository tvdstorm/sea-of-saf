package saf.game;

import saf.ErrorHandler;

/**
 * Let two saf bots fight with graphics or text.
 * @author job
 *
 */
public class Game {
	private Bot bot1;
	private Bot bot2;
	
	private final double GAME_WIDTH = 15.;	// size of game area in game position units
	private final int SLEEPTIME = 1000;		// determines real clock time per timestep
	private final double dt	= 0.1;			// size of time increments
	
	private Window gameWindow;
	boolean enableGUI;
	boolean enableText;

	/**
	 * 
	 * @param bot1	first bot
	 * @param bot2  second bot
	 */
	public Game(Bot bot1, Bot bot2) {
		this.bot1 = bot1;
		this.bot2 = bot2;

		bot1.setGameWidth(GAME_WIDTH);
		bot2.setGameWidth(GAME_WIDTH);
		
		bot1.setCurrentPosition(5.);
		bot2.setCurrentPosition(15);
		
		enableGUI = false;
		enableText = false;
	}

	/**
	 * Run the game with graphics only
	 */
	public void runGUI() {
		enableGUI = true;
		enableText = false;		
		runGame();
	}
	
	/**
	 * Run the game with text only
	 */
	public void runText() {
		enableGUI = false;
		enableText = true;		
		runGame();		
	}
	
	/**
	 * Run the game by iterating over time
	 */
	private void runGame() {
		if (enableGUI) {
			gameWindow = new Window(GAME_WIDTH, bot1, bot2);
		}
		if (enableText) {
			System.out.println( bot1.botSummaryAsString() );
			System.out.println( bot2.botSummaryAsString() );			
		}

		for (double t=0; !bot1.isDead() && !bot2.isDead(); t += dt ) {
			try {
				Thread.sleep(SLEEPTIME);
			} catch (java.lang.InterruptedException e) {
				ErrorHandler.exitWithException(e);
			}
			
			checkAndUpdateBot(t, bot1, bot2);
			checkAndUpdateBot(t, bot2, bot1);			
		}
		

	}
	
	/**
	 * Check if its time for botA to perform actions
	 * @param t 	= the time
	 * @param botA	= the bot
	 * @param botB  = his opponent
	 */
	private void checkAndUpdateBot(double t, Bot botA, Bot botB) {
		if ( botA.isTimeForNextAction(t) ) {
			botA.updateBotActions(botB);
			botA.updateTimeForNextAction();
			
			if (enableGUI) {
				gameWindow.setBotStates(botA, botB);
				gameWindow.updateScreen();
			}
			if (enableText) {
				System.out.println("Bot states at t=" + t);
				System.out.print(bot1.botStateAsString());
				System.out.println(bot2.botStateAsString());					
			}
		}		
	}


}