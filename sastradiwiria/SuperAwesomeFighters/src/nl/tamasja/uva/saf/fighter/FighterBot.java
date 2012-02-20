package nl.tamasja.uva.saf.fighter;
import java.awt.Graphics;

import nl.tamasja.uva.saf.fighter.SpecificationMapper.Attack;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Move;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Strength;
import nl.tamasja.uva.saf.fighter.action.ActionOptions;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Height;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Type;
import nl.tamasja.uva.saf.graphics.IFighterGraphics;

public class FighterBot {
	
	private String name;
	private int position = 0;
	
	private int health = 100;
	
	private double cooldown = 0;
	protected Behaviour behaviour;
	private Personality personality;
	
	private FighterBot enemyFighter;
	
	protected Height block;
	protected Height verticalPosition;
	
	protected IFighterGraphics fighterGraphics;
	
	protected int direction = 1;
	private int maxPosition = 100;
	
	private boolean reset = false;
	
	public FighterBot(String name, Behaviour behaviour, Personality personality,IFighterGraphics fighterGraphics) {
		this.name = name;
		this.behaviour = behaviour;
		this.personality = personality;
		this.fighterGraphics = fighterGraphics;
	}
	
	public void SetEnemyFighter(FighterBot enemyFighter) {
		this.enemyFighter = enemyFighter;
	}
	
	public FighterBot getEnemyFighter() {
		return enemyFighter;
	}	
	
	public void draw(Graphics g) {
		fighterGraphics.draw(g,this);
	}
	
	public void act() {
		

		
		if(isKnockOut()) {
		} else {
			if(cooldown == 0) {

				behaviour.decideBehaviour(this,enemyFighter);
				cooldown += this.getSpeed();
				reset = true;

			} else {

				if(reset && cooldown < getSpeed()/2) {
					reset();
				}
				cooldown = Math.max(cooldown-0.1 ,0.0);
				
			}
		}
	}
	
	public void attack(Type strikeType, Height strikeHeight) {

		ActionOptions actionOptions = new ActionOptions();
		
		Attack attack = actionOptions.MapAttack(strikeType, strikeHeight);
		
		if(attack != null) {
			Strength powerStat = actionOptions.getPowerStat(strikeType);
			if(powerStat != null) {
				int damage = getStat(powerStat);
				getEnemyFighter().takeHit(damage, strikeHeight);
			}
			
		}
		fighterGraphics.setAttack(attack);
		block(strikeType == Type.BLOCK ? strikeHeight : null);
	}
	
	public void move(int movement, Height height, Move move) {
		
		if(position > getEnemyFighter().getPosition()) {
			direction = -1;
		} else {
			direction = 1;
		}

		int newPosition = position + movement*direction;
		newPosition = Math.min( Math.max(newPosition,0),maxPosition);
		
		
		if(direction == 1) {
			newPosition = Math.min(getEnemyFighter().getPosition()-1, newPosition);
		} else {
			newPosition = Math.max(getEnemyFighter().getPosition()+1, newPosition);
		}
	
		position = newPosition;
		
		fighterGraphics.setDirection(direction);
		fighterGraphics.move(fighterGraphics.getWidth()+position*fighterGraphics.getWidth());
		
		verticalPosition = height;
		fighterGraphics.setMove(move);

	}
	
	void takeHit(int damage, Height strikeHeight) {
		if(damage > 0 && verticalPosition != null && verticalPosition != strikeHeight) {
			damage = 0;
		}
		
		if(damage > 0 && block == strikeHeight) {
			damage = Math.max(damage - (getPower()*2),0);
		}
		
		takeDamage(damage);
	}
	
	private void takeDamage(int damage) {
		if(damage > 0) {
			health = Math.max(health - damage,0);
			setHitStatus(true);
		}
	}	
	
	private void reset() {

		move(0,null,null);
		if(block == null) attack(null, null);
		setHitStatus(false);
		reset = false;
	}
	
	public void setHitStatus(boolean status) {
		fighterGraphics.isHit(status);
	}
	
	public void block(Height blockHeight) {
		block = blockHeight;
	}
	
	public double getWeight() {
		return (personality.getStat("punchPower") + personality.getStat("kickPower")) / 2;
	}
	
	public double getHeight() {
		return (personality.getStat("punchReach") + personality.getStat("kickReach")) / 2;
	}
	
	public double getSpeed() {
		return 0.5 * (this.getHeight() + this.getWeight());
	}
	
	public int getPower() {
		return (int) getSpeed();
	}
	
	public String getName() {
		return name;
	}
	
	
	public int getStat(Strength str) {
		return personality.getStat(str);
	}
	

	
	public int getHealth() {
		return health;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int pos) {
		position = Math.min( Math.max(pos,0),maxPosition);
	}	
	
	public int getDistance() {
		
		return Math.abs(getPosition() - getEnemyFighter().getPosition());
	}
	
	public boolean isKnockOut() {
		return getHealth() == 0;
	}
	
	public Behaviour getBehaviour() {
		return this.behaviour;
	}
	
	public Height getBlock() {
		return block;
	}
	public void setBlock(Height block) {
		this.block = block;
	}
	
	public Height getVerticalPosition() {
		return verticalPosition;
	}
	public void setVerticalPosition(Height vp) {
		this.verticalPosition = vp;
	}
	
	public void setMaxPosition(int maxPos) {
		this.maxPosition  = maxPos;
	}
	
	public double getCooldown() {
		return this.cooldown;
	}

	

}
