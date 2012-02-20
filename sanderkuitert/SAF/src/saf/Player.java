package saf;

import java.io.File;

import javax.swing.ImageIcon;

import saf.Match.VisibleObject;
import saf.fighter.PassiveFighter;
import saf.fighter.PassiveFighter.ActionEffect;

class Player implements VisibleObject, Runnable {
	
	protected final static int STARTING_HEALTH_PERCENTAGE = 100;
	protected final static double ATTACK_STAGE = 0.8;
	protected final static File ANIMATION_DIRECTORY = new File("./data/saf/animations/");
	protected final static File IDLE_ANIMATION_IMAGE_FILE = new File(ANIMATION_DIRECTORY,"idle.gif");
	protected final static String ANIMATION_EXTENSION = ".gif";
	protected final static double GROUND_LEVEL = 0.0;

	protected PassiveFighter passiveFighter;
	protected int healthPercentage;
	protected Match game;
	protected double horizontalPosition;
	protected ImageIcon appearance;
	protected int currentBlockStrength;
	protected AnimatedActionEffect initiatedEffect;
	
	
	public Player(Match game, PassiveFighter passiveFighter, double startPosition) {
		this.game = game;
		this.passiveFighter = passiveFighter;
		this.healthPercentage = STARTING_HEALTH_PERCENTAGE;
		this.horizontalPosition = startPosition;
		this.appearance = new ImageIcon(IDLE_ANIMATION_IMAGE_FILE.getPath());
		this.currentBlockStrength = 0;
		this.initiatedEffect= null;
	}


	public void run() {
		while(!game.hasEnded()) {
			act();
			
			waitAFrame();
		}
	}
	
	private void act() {
		if(initiatedEffect == null || initiatedEffect.hasEnded()) {
			double strengthDifference = game.getStrengthDifference(this);
			ActionEffect initiatedAction = passiveFighter.selectAction(opponentDistance(), strengthDifference);
			
			initiatedEffect = new AnimatedActionEffect(initiatedAction, this);
		}
		initiatedEffect.applyNextFrame();
	}
	
	private void waitAFrame() {
		try {
			Thread.sleep((long) passiveFighter.getRelativeActSpeed() * game.getTimeStep());
		} catch (InterruptedException e) { 
			assert false: "Don't interrupt when I'm asleep!";
		}
	}
	
	public void startBlocking(int blockStrength) {
		this.currentBlockStrength = blockStrength;
	}
	
	public void stopBlocking() {
		this.currentBlockStrength = 0;
	}
	
	public void takeHit(int damage) {
		damage = (damage > currentBlockStrength) ? damage - currentBlockStrength : 0; //avoid negative damage
		healthPercentage -= damage;
		System.out.println("> "+this+"\ttakes "+damage+" damage ("+healthPercentage+" left)");	//DEBUG
	}
	
	public void attack(int attackDamage) {
		System.out.println("> "+this+"\tattacks for "+attackDamage+" damage");					//DEBUG
		game.applyAttack(this, attackDamage);
	}
	
	public void move(double distance) {
		horizontalPosition += distance;
	}
	
	public void setAppearance(String imageName){
		this.appearance = new ImageIcon(new File(ANIMATION_DIRECTORY, imageName).getPath());
		game.appearanceChanged(this);
	}
	
	public boolean isAlive() {
		return healthPercentage > 0;
	}
	
	public double opponentDistance() {
		return game.getDistance(this);
	}
	
	public String toString() {
		return passiveFighter.getName();
	}
	
	
	//--- Implementing VisibleObject
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
	
	
	//=== Inner class ========================================================
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
			return currentFrame > action.moveSteps;
		}
		
		public void applyNextFrame() {
			assert !hasEnded(): "don't applyNextFrame() when hasEnded()";
			applyFrame(currentFrame++);
		}
		
		private void applyFrame(int frameNr) {
			int frameOfAttack = (int) (ATTACK_STAGE * action.moveSteps);
			double opponentDistance = Math.abs(actor.opponentDistance());
			
			if(frameNr == 1 && action.attackDamage < 0) {
				actor.startBlocking(action.attackDamage);
			}
			if(frameNr == frameOfAttack && action.attackDamage > 0 && opponentDistance < action.attackRange){
				actor.attack(action.attackDamage);
			}
			if(frameNr == action.moveSteps) {
				actor.stopBlocking();
			}
			
			actor.move((action.moveDistance * Match.TOTAL_ARENA_WIDTH) / action.moveSteps);
			
			actor.setAppearance(action.attackName+"-"+action.moveName+"-"+frameNr+ANIMATION_EXTENSION);
		}
		
		public String toString() {
			return actor+" is doing "+action.attackName+" and "+action.moveName+
																" ("+currentFrame+"/"+action.moveSteps+")";
		}
	}
}
