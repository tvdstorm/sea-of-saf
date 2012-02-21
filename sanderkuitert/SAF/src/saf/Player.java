package saf;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Array;

import javax.swing.ImageIcon;

import saf.fighter.PassiveFighter;
import saf.fighter.PassiveFighter.ActionEffect;


class Player implements MatchSimulator.VisibleObject, Runnable {
	
	protected final static int STARTING_HEALTH = 50;
	protected final static double ATTACK_STAGE = 0.8;
	protected final static String ANIMATION_DIRECTORY = "./data/images/player/";
	protected final static FilenameFilter PNG = new FilenameFilter() {
		public boolean accept(File dir, String name) 	{ return name.endsWith(".png"); }
		public String toString() 						{ return ".png"; 				}
	};
	protected final static double PLAYER_WIDTH = 25;
	protected final static double GROUND_LEVEL = 55;

	protected PassiveFighter passiveFighter;
	protected int healthPercentage;
	protected MatchSimulator environment;
	protected double horizontalPosition;
	protected ImageIcon appearance;
	protected int currentBlockStrength;
	protected AnimatedActionEffect initiatedEffect;
	
	
	public Player(MatchSimulator environment, PassiveFighter passiveFighter, double startPosition) {
		this.environment = environment;
		this.passiveFighter = passiveFighter;
		this.healthPercentage = STARTING_HEALTH;
		this.horizontalPosition = startPosition;
		String direction = startPosition < (MatchSimulator.TOTAL_ARENA_WIDTH / 2) ? "left-right" : "right-left";
		this.appearance = new ImageIcon(new File(ANIMATION_DIRECTORY+direction+"/stand/1"+PNG).getPath());
		this.currentBlockStrength = 0;
		this.initiatedEffect= null;
	}


	public void run() {
		while(!environment.hasEnded()) {
			act();
			
			waitAFrame();
		}
	}
	
	private void act() {
		if(initiatedEffect == null || initiatedEffect.hasEnded()) {
			ActionEffect initiatedAction = passiveFighter.selectAction(opponentDistance(), strengthDifference());
			
			initiatedEffect = new AnimatedActionEffect(initiatedAction, this, opponentDistance() > 0);
		}
		initiatedEffect.applyNextFrame();
	}
	
	private void waitAFrame() {
		try {
			Thread.sleep((long) passiveFighter.getRelativeActSpeed() * environment.getTimeStep());
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
		healthPercentage -= Math.max(0, damage - currentBlockStrength);
		System.out.println("> "+this+"\ttakes "+damage+" damage ("+healthPercentage+" left)");	//LOG
	}
	
	public void attack(int attackDamage) {
		System.out.println("> "+this+"\tattacks for "+attackDamage+" damage");					//LOG
		environment.applyAttack(this, attackDamage);
	}
	
	// 0 <= resulting position <= TOTAL_ARENA_WIDTH - PLAYER_WIDTH
	public void move(double distance) {
		distance = Math.max(0.0, horizontalPosition+distance);  
		horizontalPosition = Math.min(distance, MatchSimulator.TOTAL_ARENA_WIDTH - PLAYER_WIDTH);
	}
	
	public void setAppearance(String imageName){
		this.appearance = new ImageIcon(new File(imageName).getPath());
		environment.appearanceChanged(this);
	}
	
	public boolean isAlive() {
		return healthPercentage > 0;
	}
	
	public double strengthDifference() {
		return environment.getStrengthDifference(this);
	}
	
	public double opponentDistance() {
		return environment.getDistance(this);
	}
	
	public String toString() {
		return passiveFighter.getName();
	}
	
	
	//--- Implementing VisibleObject
	public ImageIcon appearance() {
		return appearance;
	}
	
	public int xPosition() {
		return (int) horizontalPosition;
	}
	
	public int yPosition() {
		return (int) GROUND_LEVEL;
	}
	
	public boolean isBackGround() {
		return false;
	}
	
	
	//=== Inner class ========================================================
	private class AnimatedActionEffect {
		
		protected final ActionEffect action;
		protected Player actor;
		private String attackAnimationDir;
		private String moveAnimationDir;
		private int totalAttackFrames;
		private int totalMoveFrames;
		private int currentAttackFrame;
		private int currentMoveFrame;
		
		
		public AnimatedActionEffect(ActionEffect action, Player actor, boolean facesRight) {
			this.action = action;
			this.actor = actor;
			String animationDir = ANIMATION_DIRECTORY+(facesRight ? "left-right" : "right-left")+"/";
			this.attackAnimationDir = animationDir+action.attackName+"/";
			this.moveAnimationDir = animationDir+action.moveName+"/";
			assert new File(attackAnimationDir).exists() && new File(moveAnimationDir).exists():
				"Can't find" + attackAnimationDir + " and " + moveAnimationDir;
			this.totalAttackFrames = Array.getLength(new File(attackAnimationDir).listFiles(PNG));
			this.totalMoveFrames = Array.getLength(new File(moveAnimationDir).listFiles(PNG));
			this.currentAttackFrame = 1;
			this.currentMoveFrame = 1;
		}
		
		
		public boolean hasEnded() {
			return currentAttackFrame >= totalAttackFrames && currentMoveFrame >= totalMoveFrames;
		}
		
		public void applyNextFrame() {
			assert !hasEnded(): "don't applyNextFrame() when hasEnded()!";
			
			if(currentAttackFrame < currentMoveFrame) {
				applyNextAttackFrame(currentAttackFrame++);
			} else {
				applyNextMoveFrame(currentMoveFrame++);
			}
		}
		
		private void applyNextAttackFrame(int frameNr) {
			int frameOfAttack = (int) (ATTACK_STAGE * totalAttackFrames);
			double opponentDistance = Math.abs(actor.opponentDistance());
			
			if(frameNr == 1 && action.attackDamage < 0) {
				actor.startBlocking(action.attackDamage);
			}
			if(frameNr == frameOfAttack && action.attackDamage > 0 && opponentDistance < action.attackRange){
				actor.attack(action.attackDamage);
			}
			if(frameNr == totalAttackFrames) {
				actor.stopBlocking();
			}
			
			actor.setAppearance(attackAnimationDir+frameNr+PNG);
		}
		
		private void applyNextMoveFrame(int frameNr) {
			actor.move((action.moveDistance * MatchSimulator.TOTAL_ARENA_WIDTH) / totalMoveFrames);		
		
			actor.setAppearance(moveAnimationDir+frameNr+PNG);
		}
		
		public String toString() {
			return actor+" is doing "+action.attackName+" ("+currentAttackFrame+""+totalAttackFrames+")"+" and "+
										action.moveName+" ("+currentMoveFrame+""+totalMoveFrames+")";
		}
	}
}
