package saf;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

import javax.swing.ImageIcon;

import saf.fighter.PassiveFighter;


class MatchSimulator extends Observable implements Runnable {

	protected final static ImageIcon BACKGROUND_IMAGE = new ImageIcon(new File("./data/images/background.gif").getPath());
	protected final static int TOTAL_ARENA_WIDTH = 100;
	protected final static long DEFAULT_TIME_STEP = 150; //in ms
	
	protected MatchSimulatorGUI gui;
	protected StaticBackground staticBackground; 
	protected Player player1;
	protected Player player2;
	private String matchEndMessage;
	private boolean matchEnded;	
	
	/** This class simulates matches of two players. */
	public MatchSimulator(PassiveFighter fighter1, PassiveFighter fighter2) {
		assert fighter1 != null: "PassiveFighter fighter1 is not properly initialized";
		assert fighter2 != null: "PassiveFighter fighter2 is not properly initialized";
		
		this.player1 = new Player(this, fighter1,   (TOTAL_ARENA_WIDTH/5));
		this.player2 = new Player(this, fighter2, 1-(TOTAL_ARENA_WIDTH/5));
		this.staticBackground = new StaticBackground();
		this.gui = new MatchSimulatorGUI(this.toString(), staticBackground.appearance().getIconWidth(), 
																	staticBackground.appearance().getIconHeight());
		this.matchEndMessage = "The match ended";
		this.matchEnded = false;
		setChanged();
		
		this.addObserver(gui);
	}
	
	
	public void run() {
		matchStarts();
		
		while(!hasEnded()) {
			try {
				Thread.sleep(DEFAULT_TIME_STEP);
			} catch (InterruptedException e) {
			}
			notifyObservers();
		}
	}
	
	protected void matchStarts() {
		System.out.println("> "+this.toString()+" started\n"); //LOG
		notifyObservers(staticBackground);
		gui.setVisible(true);
		
		new Thread(player1).start();
		new Thread(player2).start();
	}	
	
	protected void matchEnds(String endMessage) {
		matchEndMessage = endMessage;
		matchEnded = true;
		setChanged();
	}
	
	public boolean hasEnded() {
		return matchEnded;
	}
	
	public String getEndMessage() {
		return matchEndMessage;
	}
	
	public List<VisibleObject> getVisibleObjects() {
		return new LinkedList<VisibleObject> (Arrays.asList(staticBackground, player1, player2));
	}

	public long getTimeStep() {
		return DEFAULT_TIME_STEP; // in ms
	}
	
	public String toString() {
		return "MatchSimulator between "+player1+" and "+player2;
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
	
	public void applyAttack(Player actor, int attackDamage) {
		Player other = actor.equals(player1) ?  player2 : player1;
		other.takeHit(attackDamage);
		setChanged();
		
		if(!other.isAlive()) {
			matchEnds("-=[  Player "+actor+" wins!  ]=-");
		}
	}
	
	public void appearanceChanged(Player player) {
		setChanged();
	}
	
	
	//=== Inner classes ========================================================
	public interface VisibleObject {
		public final static int MIN_POSITION = 0;
		public final static int MAX_POSITION = TOTAL_ARENA_WIDTH;
		public int xPosition();
		public int yPosition();
		public boolean isBackGround();
		public ImageIcon appearance();
	}
	
	protected class StaticBackground implements VisibleObject {
		public int xPosition() {
			return MIN_POSITION;
		}
		
		public int yPosition() {
			return MIN_POSITION;
		}

		public boolean isBackGround() {
			return true;
		}
		
		public ImageIcon appearance() {
			return BACKGROUND_IMAGE;
		}
	}

}
