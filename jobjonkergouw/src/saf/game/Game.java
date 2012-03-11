package saf.game;

import saf.ErrorHandler;
import saf.bot.GameBot;

/**
 * Let two saf bots fight with graphics or text.
 * @author job
 *
 */
public class Game {
	private GameBot bot1;
	private GameBot bot2;
	
	private final double GAME_WIDTH = 14.;	// size of game area in game position units
	private final int SLEEPTIME = 50;		// determines real clock time per timestep
	private final double dt	= 0.05;			// size of time increments
	
	private Window gameWindow;
	boolean enableGUI;
	boolean enableText;

	/**
	 * 
	 * @param bot1	first bot
	 * @param bot2  second bot
	 */
	public Game(GameBot bot1, GameBot bot2) {
		if (bot1 == null || bot2 == null) {
			ErrorHandler.exitWithString("Incorrect bot given to play with");
		}	
		this.bot1 = bot1;
		this.bot2 = bot2;

		bot1.setGameWidth(GAME_WIDTH);
		bot2.setGameWidth(GAME_WIDTH);
		
		bot1.setCurrentPosition(2.);
		bot2.setCurrentPosition(12.);
		
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
	 * Run the game with both graphics and text
	 */
	public void runGUIWithText() {
		enableGUI = true;
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
			System.out.println( bot1.attributesAsString() );
			System.out.println( bot2.attributesAsString() );			
		}

		for (double t=0; !bot1.isDead() && !bot2.isDead(); t += dt ) {
			try {
				Thread.sleep(SLEEPTIME);
			} catch (java.lang.InterruptedException e) {
				ErrorHandler.printException(e);
			}
			
			checkAndUpdateBot(t, bot1, bot2);
			checkAndUpdateBot(t, bot2, bot1);			
		}
		if (enableText) {
			if ( bot1.isDead() ) {
				System.out.println(bot1.getName() + " is dead!");				
			}
			if ( bot2.isDead() ) {
				System.out.println(bot2.getName() + " is dead!");				
			}
		}
		

	}
	
	/**
	 * Check if its time for botA to perform actions
	 * @param t 	= the time
	 * @param botA	= the bot
	 * @param botB  = his opponent
	 */
	private void checkAndUpdateBot(double t, GameBot botA, GameBot botB) {
		if ( botA.isTimeForNextAction(t) ) {
			botA.updateBotActions(botB);
			botA.updateTimeForNextAction();
			
			if (enableGUI) {
				// Note: Here we must use bot1, bot2; not the arguments of this method!
				gameWindow.setBotStates(bot1, bot2);
				gameWindow.updateScreen();
			}
			if (enableText) {
				System.out.println("GameBot states at t=" + t);
				System.out.print(bot1.statesAsString());
				System.out.println(bot2.statesAsString());					
			}
		}		
	}


}