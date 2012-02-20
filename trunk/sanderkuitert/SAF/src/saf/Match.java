package saf;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

import javax.swing.ImageIcon;

import saf.fighter.Fighter;
import saf.fighter.Fighter.ActionEffect;


public class Match extends Observable implements Runnable {

	protected final static File BACKGROUND_IMAGE_FILE = new File("./data/saf/background.gif");
	protected final static File ANIMATION_DIRECTORY = new File("./data/saf/animations/");
	protected final static File IDLE_ANIMATION_IMAGE_FILE = new File(ANIMATION_DIRECTORY,"idle.gif");
	protected final static String ANIMATION_EXTENSION = ".gif";
	public final static double ATTACK_STAGE = 0.8;
	protected final static double GROUND_LEVEL = 0.0;
	protected final static long TIME_STEP = 100; //in ms
	
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
//		player1.addObserver(gui); //TODO
//		player2.addObserver(gui); //TODO

	}
	
	
	public void run() {
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
	//TODO move to be an inner class of Player
	private class AnimatedActionEffect {
		
		
		protected final ActionEffect action;
		protected Player actor;
		private int currentFrame;
		
		
		public AnimatedActionEffect(ActionEffect action, Player actor) {
			this.action = action;
			this.actor = actor;
			this.currentFrame = 1;
		}
		
		
		public boolean hasEnded() {
			return currentFrame > action.moveFrames;
		}
		
		public void applyNextFrame() {
			applyFrame(currentFrame++);
		}
		
		private void applyFrame(int frameNr) {
			int frameOfAttack = (int) (ATTACK_STAGE * action.moveFrames);
			
			if(frameNr == 1 && action.attackDamage < 0) {
				actor.startBlocking(action.attackDamage);
			}
			if(frameNr == frameOfAttack && action.attackDamage > 0 && actor.distance() < action.attackRange){
				actor.attack(action.attackDamage);
			}
			if(frameNr == action.moveFrames) {
				actor.stopBlocking();
			}
			
			actor.move(action.moveDistance / action.moveFrames);
			
			actor.setAppearance(action.attackName+"-"+action.moveName+"-"+frameNr+ANIMATION_EXTENSION);
		}
	}
	
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
	
	
	//TODO Extract to seperate file
	private class Player implements VisibleObject, Runnable {
		
		protected Fighter fighter;
		protected int healthPercentage;
		protected Match game;
		protected double horizontalPosition;
		protected ImageIcon appearance;
		protected int blockStrength;
		protected AnimatedActionEffect initiatedEffect;
		
		
		public Player(Match game, Fighter fighter, double startPosition) {
			this.game = game;
			this.fighter = fighter;
			this.healthPercentage = Fighter.TOTAL_HEALTH;
			this.horizontalPosition = startPosition;
			this.appearance = new ImageIcon(IDLE_ANIMATION_IMAGE_FILE.getPath());
			this.blockStrength = 0;
			this.initiatedEffect= null;
		}


		public void run() {
			while(!game.hasEnded()) {
				act();
				
				notifyObservers();
				
				waitAFrame();
			}
		}
		
		private void act() {
			if(initiatedEffect == null || initiatedEffect.hasEnded()) {
				double strengthDifference = game.getStrengthDifference(this);
				ActionEffect initiatedAction = fighter.act(distance(), strengthDifference);
				
				initiatedEffect = new AnimatedActionEffect(initiatedAction, this);
			}
			initiatedEffect.applyNextFrame();
			setChanged();
		}
		
		private void waitAFrame() {
			try {
				wait((long) fighter.getRelativeActSpeed()*TIME_STEP);
			} catch (InterruptedException e) { 
				assert false: "Don't interrupt when I'm asleep!";
			}
		}
		
		public void startBlocking(int blockStrength) {
			this.blockStrength = blockStrength;
		}
		
		public void stopBlocking() {
			this.blockStrength = 0;
		}
		
		public void takeHit(int damage) {
			damage = (damage > blockStrength) ? damage - blockStrength : 0; //avoid negative damage
			healthPercentage -= damage;
		}
		
		public void move(double distance) {
			horizontalPosition += distance;
		}
		
		public void attack(int attackDamage) {
			game.applyDamage(this, attackDamage);
		}
		
		public boolean isAlive() {
			return healthPercentage > 0;
		}
		
		public double distance() {
			return game.getDistance(this);
		}
		
		public String toString() {
			return fighter.getName();
		}
		
		//--- Implementing VisibleObject
		public void setAppearance(String imageName){
			this.appearance = new ImageIcon(new File(ANIMATION_DIRECTORY, imageName).getPath());
		}

		public ImageIcon appearance() {
			return appearance;
		}
		
		public double xPosition() {
			return horizontalPosition;
		}
		
		public double yPosition() {
			return GROUND_LEVEL;
		}
		
		public boolean stretchMe() {
			return false;
		}
	}

}
