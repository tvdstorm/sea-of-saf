package saf;

import java.io.File;
import java.util.Observable;

import javax.swing.ImageIcon;

import saf.Match.VisibleObject;
import saf.fighter.Fighter;
import saf.fighter.Fighter.ActionEffect;

class Player extends Observable implements VisibleObject, Runnable {
	
	protected final static File ANIMATION_DIRECTORY = new File("./data/saf/animations/");
	protected final static File IDLE_ANIMATION_IMAGE_FILE = new File(ANIMATION_DIRECTORY,"idle.gif");
	protected final static String ANIMATION_EXTENSION = ".gif";
	public final static double ATTACK_STAGE = 0.8;
	protected final static double GROUND_LEVEL = 0.0;
	
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
			
			System.out.println("DEBUG: "+this+" initiates "+initiatedAction.attackName+
														" and "+initiatedAction.moveName);//DEBUG
		}
		initiatedEffect.applyNextFrame();
		setChanged();
	}
	
	private void waitAFrame() {
		try {
			Thread.sleep((long) fighter.getRelativeActSpeed() * game.getTimeStep());
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
		System.out.println("DEBUG: "+this+" has "+healthPercentage+" health left after taking "+damage+" damage");//DEBUG
	}
	
	public void move(double distance) {
		horizontalPosition += distance;
	}
	
	public void attack(int attackDamage) {
		System.out.println("DEBUG: "+this+" attacks for "+attackDamage+" damage");//DEBUG
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
			return currentFrame > action.moveFrames;
		}
		
		public void applyNextFrame() {
			assert hasEnded(): "don't applyNextFrame() when hasEnded()";
			applyFrame(currentFrame++);
		}
		
		private void applyFrame(int frameNr) {
			int frameOfAttack = (int) (ATTACK_STAGE * action.moveFrames);
			double absDistance = Math.abs(actor.distance());
			
			if(frameNr == 1 && action.attackDamage < 0) {
				actor.startBlocking(action.attackDamage);
			}
			if(frameNr == frameOfAttack && action.attackDamage > 0 && absDistance < action.attackRange){
				actor.attack(action.attackDamage);
			}
			if(frameNr == action.moveFrames) {
				actor.stopBlocking();
			}
			
			actor.move(action.moveDistance / action.moveFrames);
			
			actor.setAppearance(action.attackName+"-"+action.moveName+"-"+frameNr+ANIMATION_EXTENSION);
		}
	}
}
