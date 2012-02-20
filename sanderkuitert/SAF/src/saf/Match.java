package saf;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

import javax.swing.ImageIcon;

import saf.fighter.Fighter;


class Match extends Observable implements Runnable {

	protected final static File BACKGROUND_IMAGE_FILE = new File("./data/saf/background.gif");
	protected final static long DEFAULT_TIME_STEP = 10; //in ms
	
	protected MatchGUI gui;
	protected Background staticBackground; 
	protected Player player1;
	protected Player player2;
	private String gameEndMessage;
	private boolean gameEnded;	
	
	
	/** This class simulates matches of two players. */
	public Match(Fighter fighter1, Fighter fighter2) {
		assert fighter1 != null: "Fighter fighter1 is not properly initialized";
		assert fighter2 != null: "Fighter fighter2 is not properly initialized";
		
		this.gui = new MatchGUI();
		this.staticBackground = new Background();
		this.player1 = new Player(this, fighter1,   (Fighter.TOTAL_ARENA_WIDTH/5));
		this.player2 = new Player(this, fighter2, 1-(Fighter.TOTAL_ARENA_WIDTH/5));

		this.addObserver(gui);
		player1.addObserver(gui);
		player2.addObserver(gui);

	}
	
	
	public void run() {
		System.out.println("DEBUG: Match "+this+" started");//DEBUG
		new Thread(player1).start();
		new Thread(player2).start();
	}
	
	public boolean hasEnded() {
		return gameEnded;
	}
	
	public String getEndMessage() {
		return gameEndMessage;
	}
	
	private void gameEnds(String endMessage) {
		gameEndMessage = endMessage;
		gameEnded = true;
		setChanged();
		
		notifyObservers();
	}
	
	public List<VisibleObject> getSimulatedObjects() {
		return new LinkedList<VisibleObject> (Arrays.asList(player1, player2));
	}

	public long getTimeStep() {
		return DEFAULT_TIME_STEP; // in ms
	}
	
	public String toString() {
		return player1 + " vs " + player2;
	}
	
	/** Negative distance means to the left */
	public double getDistance(Player player) {
		double distanceFromPlayer1Perspective = player2.xPosition() - player1.xPosition();
		double distanceFromPlayer2Perspective = player1.xPosition() - player2.xPosition();
		return player.equals(player1) ? distanceFromPlayer1Perspective : distanceFromPlayer2Perspective;
	}

	public double getStrengthDifference(Player player) {
		double differenceFromPlayer1Perspective = player2.xPosition() - player1.xPosition();
		double differenceFromPlayer2Perspective = player1.xPosition() - player2.xPosition();
		return player.equals(player1) ? differenceFromPlayer1Perspective : differenceFromPlayer2Perspective;
	}
	
	public void applyDamage(Player actor, int attackDamage) {
		Player other = actor.equals(player1) ?  player1 : player2;
		other.takeHit(attackDamage);
		if(!other.isAlive()) {
			gameEnds("Player "+actor+" wins!");
		}
	}
	
	
	//=== Inner classes ========================================================
	//TODO redesign to use some general Graphics format
	public interface VisibleObject {
		public final static double MAX_POSITION_VALUE = Fighter.TOTAL_ARENA_WIDTH;
		public double xPosition(); /** @ensure between 0.0 and MAX_POSITION_VALUE */
		public double yPosition(); /** @ensure between 0.0 and MAX_POSITION_VALUE */
		public boolean stretchMe();
		public ImageIcon appearance();
	}
	
	private class Background implements VisibleObject {
		public double xPosition() {
			return 0.0;
		}
		
		public double yPosition() {
			return 0.0;
		}

		public boolean stretchMe() {
			return true;
		}
		
		public ImageIcon appearance() {
			return new ImageIcon(BACKGROUND_IMAGE_FILE.getPath());
		}
	}

}
