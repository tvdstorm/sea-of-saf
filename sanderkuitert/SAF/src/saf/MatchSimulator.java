package saf;

import java.util.Observable;
import java.util.Random;

import saf.fighter.Fighter;
import saf.fighter.Fighter.ActionEffect;


//TODO make properly observable
public class MatchSimulator extends Observable implements Runnable{
	
	private Player player1;
	private Player player2;
	
	protected MatchSimulatorGUI gui;
	protected final static double totalArenaWidth = 100.0;
	protected double timeStep;
	protected boolean quit;
	
	/** This class simulates matches of TWO players. */
	public MatchSimulator(Fighter fighter1, Fighter fighter2) {
		assert fighter1 != null: "Fighter player1 is not properly initialized";
		assert fighter2 != null: "Fighter player2 is not properly initialized";
		
		double relativeStrength = fighter2.getRelativeStrength() - fighter1.getRelativeStrength();
		this.player1 = new Player(fighter1,totalArenaWidth/5, relativeStrength, fighter1.getRelativeSpeed());
		this.player2 = new Player(fighter2,1-(totalArenaWidth/5),-1*relativeStrength, fighter2.getRelativeSpeed());
		this.gui = new MatchSimulatorGUI();
		this.timeStep = 50.0; //ms
		this.quit = false;
	}
	
	
	public void run() {
		boolean whoStarts = new Random().nextBoolean();
		Player active = whoStarts ? player1 : player2;
		Player other = !whoStarts ? player1 : player2;
		
		//TODO schedule to call player1 after player1.speed()*timeStep
		
		while(!quit) {
			double distance = other.position() - active.position();
			ActionEffect newAction = active.act(distance);
			animate(newAction.animationName);
			if(distance < newAction.range && newAction.physicalEffect > 0) {
				active.clearBlock();
				boolean kills = !other.takeHit(newAction.physicalEffect);
				if(kills) {
					presentWinner(active);
					break;
				}
			}
			if(newAction.physicalEffect < 0) {
				active.blockFor(newAction.physicalEffect);
			}
			//Change turns
			Player tmp = active;
			active = other;
			other = tmp;
		}
	}
	
	private void animate(String animationName) {
		// TODO implement gui effect
		System.out.println("Imagine the animation "+animationName);
	}

	private void presentWinner(Player winner) {
		// TODO implement gui effect
		System.out.println("Player "+winner.fighter.getName());
	}
	
	//TODO temporary?
	public void quitGracefully() {
		this.quit = true;
	}
	
	
	//=== Inner class ========================================================
	private class Player {
		
		protected Fighter fighter;
		protected int healthPercentage;
		protected double horizontalPosition;
		
		private double cachedRelativeSpeed;
		private double cachedStrengthDifference;
		private int block;
		
		
		public Player(Fighter fighter, double startPosition, double relativeSpeed, double relativeStrength) {
			this.fighter = fighter;
			this.healthPercentage = 100;
			this.horizontalPosition = startPosition;
			this.cachedRelativeSpeed = relativeSpeed;
			this.cachedStrengthDifference = relativeStrength;
			this.block = 0;
		}

		
		public ActionEffect act(double distance) {
			return fighter.act(distance, cachedStrengthDifference);
		}


		@SuppressWarnings("unused")
		public int health() {
			return healthPercentage;
		}
		
		/** @return true when still alive */
		public boolean takeHit(int damage) {
			healthPercentage -= (damage >= block) ? (damage - block) : 0;
			return healthPercentage <= 0;
		}
		
		public void blockFor(int preventingStrength) {
			block = preventingStrength;
		}
		
		public void clearBlock() {
			block = 0;
		}
		
		public double position() {
			return horizontalPosition;
		}
		
		/** Positive distance is to the right */
		@SuppressWarnings("unused")
		public void move(double distance) {
			horizontalPosition += distance;			
		}

		@SuppressWarnings("unused")
		public double speed() {
			return cachedRelativeSpeed;
		}
		
	}
	
}
