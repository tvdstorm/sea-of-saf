package saf;

import java.io.File;
import java.util.Observable;
import java.util.Random;

import javax.swing.ImageIcon;

import saf.fighter.Fighter;
import saf.fighter.Fighter.ActionEffect;


//TODO make properly observable
public class MatchSimulator extends Observable implements Runnable{

	public final static File ANIMATION_DIRECTORY = new File("./data/saf/animations/");
	public final static File START_ANIMATION = new File("./data/saf/animations/idle.gif");
	
	String name;
	private Player player1;
	private Player player2;
	
	protected MatchSimulatorGUI gui;
	protected long timeStep; //in ms
	
	
	/** This class simulates matches of TWO players. */
	public MatchSimulator(String matchName, Fighter fighter1, Fighter fighter2) {
		assert fighter1 != null: "Fighter fighter1 is not properly initialized";
		assert fighter2 != null: "Fighter fighter2 is not properly initialized";
		
		this.name = matchName;
		double relativeStrength = fighter2.getRelativeStrength() - fighter1.getRelativeStrength();
		double startPosition = Fighter.TOTAL_ARENA_WIDTH/5;
		this.player1 = new Player(fighter1,startPosition, relativeStrength, fighter1.getRelativeSpeed());
		this.player2 = new Player(fighter2,1-startPosition,-1*relativeStrength, fighter2.getRelativeSpeed());
		this.gui = new MatchSimulatorGUI();
		this.timeStep = 50;
		
	}
	
	
	public void run() {
		//Select starting player
		Player active = player1;
		Player other = player2;
		if(new Random().nextBoolean()) {
			active = player2;
			other = player1;
		}
		
		//TODO schedule to call player1 after player1.speed()*timeStep?
		int loops = 5; //TODO remove
		for(int i=0; i < loops; i++) {
			//Let active act
			double distance = other.position() - active.position();
			ActionEffect actInProgress = active.act(distance);
			notifyObservers(active);
			
			//Apply act to other
			if(distance < actInProgress.attackRange && actInProgress.attackDamage> 0) {
				other.takeHit(actInProgress.attackDamage);
				if(other.health() <= 0) {
					presentWinner(active);
					break;
				}
			}
			notifyObservers(other);
			
			System.out.println(this.name+": The turn ended for "+active.fighter.getName()); //DEBUG
			try {
				Thread.sleep(timeStep*20); //TODO debug
			} catch (InterruptedException e) {
				break;
			}
			
			//Next turn
			Player swapStore = active;
			active = other;
			other = swapStore;
		}
	}
	
	private void presentWinner(Player winner) {
		// TODO implement gui effect
//		gui.setVisible(true);
		System.out.println("Player "+winner.fighter.getName()+" wins!");
	}
	
	//TODO let parent manage animation steps instead?
	private void notifyObservers(Player player) {
		hasChanged();
//		notifyObservers(player); //TODO fix
	}
	
	//=== Inner class ========================================================
	public class Player { //TODO make private? And then let parent manage animation steps...
		
		protected Fighter fighter;
		protected int healthPercentage;
		protected double horizontalPosition;
		protected ActionEffect lastAction;
		protected ImageIcon animation;
		protected double targetPosition;
		protected int moveStepsLeft;
		
		private double cachedRelativeSpeed;
		private double cachedStrengthDifference;
		
		
		public Player(Fighter fighter, double startPosition, double relativeSpeed, double relativeStrength) {
			this.fighter = fighter;
			this.healthPercentage = Fighter.TOTAL_HEALTH;
			this.horizontalPosition = startPosition;
			this.lastAction = null;
			this.animation = new ImageIcon(ANIMATION_DIRECTORY.getPath() + START_ANIMATION); //TODO
			this.targetPosition = startPosition;
			this.moveStepsLeft = 0; 
			this.cachedRelativeSpeed = relativeSpeed;
			this.cachedStrengthDifference = relativeStrength;
		}

		
		public ActionEffect act(double distance) {
			this.lastAction = fighter.act(distance, cachedStrengthDifference);
			this.animation = new ImageIcon(ANIMATION_DIRECTORY.getPath() + lastAction.moveName + "-" +
																	lastAction.attackName + ".gif");
			this.targetPosition = horizontalPosition + lastAction.moveDistance;
			this.moveStepsLeft = lastAction.moveSteps;
			
			return lastAction;
		}
		
		// TODO Call every speed()*timeStep ms? Or let parent manage this...
		// @return true iff position changed
		public boolean move() {
			if(moveStepsLeft>0) {
				horizontalPosition += lastAction.moveDistance / lastAction.moveSteps;
				//TODO next sprite in animation? But then attack also needs steps...
				
				moveStepsLeft--;
				return true;
			}
			return false;
		}

		public void takeHit(int damage) {
			if(lastAction != null && lastAction.attackDamage < 0 ) { //I'm blocking
				damage -= lastAction.attackDamage;
			}
			healthPercentage -= damage >= 0 ? damage : 0; //only DECREASE health
		}
		
		public int health() {
			return healthPercentage;
		}
		
		public double position() {
			return horizontalPosition;
		}
		
		public double speed() {
			return cachedRelativeSpeed;
		}
		
	}
	
}
