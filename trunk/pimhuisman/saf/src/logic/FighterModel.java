package logic;

import gui.FighterAnimation;
import java.awt.Graphics;
import java.awt.Point;
import core.FighterLoader;
import core.TypeCheckerVisitor;
import data.Characteristic;
import data.Fighter;
import data.Personality;

public class FighterModel extends BaseGameObject {

	private int health;
	private final int maxHealth;
	private final FighterAnimation animation;
	private final String fighterFilename;
	private Fighter fighterData;
	
	public FighterModel(String imageDirectory, String fighterFilename) {
		health = 10;
		maxHealth = 10;
		animation = new FighterAnimation(imageDirectory);
		this.fighterFilename = fighterFilename;
		fighterData = null;
	}
	
	@Override
	public void initialize() {
		animation.onInitialize();
		FighterLoader loader = new FighterLoader();
		fighterData = loader.loadFighterByFile(fighterFilename);
		TypeCheckerVisitor typeChecker = new TypeCheckerVisitor();
		fighterData.acceptTreeVisitor(typeChecker);
	}
	
	@Override
	public void draw(Graphics g) {
		Graphics localGraphics = g.create();
		localGraphics.translate(position.x, position.y);
		animation.draw(localGraphics);
	}
	
	@Override
	public void destroy() {
		animation.onDestroy();
	}
	
	private FighterState stringToAction(String action) {
		if ( action.equals("punch_high") ) {
			return FighterState.FIGHTER_PUNCH_HIGH;
		} else if ( action.equals("punch_low") ) {
			return FighterState.FIGHTER_PUNCH_LOW;
		} else if ( action.equals("kick_high") ) {
			return FighterState.FIGHTER_KICK_HIGH;
		} else if ( action.equals("kick_low") ) {
			return FighterState.FIGHTER_KICK_LOW;
		} else if ( action.equals("block_high") ) {
			return FighterState.FIGHTER_BLOCK_HIGH;
		} else if ( action.equals("block_low") ) {
			return FighterState.FIGHTER_BLOCK_LOW;
		}
		return FighterState.FIGHTER_STANDING;
	}
	
	public void performAttackAction(FighterModel otherFighter, String attackAction) {
		FighterState fighterState = stringToAction(attackAction);
		setState(fighterState);
		if ( isAggressive() ) {
			if ( isReaching(otherFighter) && !isBlocked(otherFighter) ) {
				otherFighter.setRelativeHealth(-1);
			}
		}
	}
	
	private void move(FighterModel otherFighter, double speed, boolean backwards) {
		int distance = getPosition().x - otherFighter.getPosition().x;
		int stepSize = (int)(speed * 10);
		if ( backwards ) stepSize = -stepSize;
		Point position = new Point(getPosition());
		if ( distance > 0 ) {
			if ( stepSize > distance-60 ) {
				position.x -= distance-60;
			} else if ( position.x-stepSize > 1220 ) {
				position.x = 1220;
			} else {
				position.x -= stepSize;
			}
			setPosition(position);
		} else {
			distance = -distance;
			if ( stepSize > distance-60 ) {
				position.x += distance-60;
			} else if ( position.x+stepSize < 0 ) {
				position.x = 0;
			} else {
				position.x += stepSize;
			}
		}
		setPosition(position);
	}
	
	public void performMoveAction(FighterModel otherFighter, String moveAction) {
		Personality personality = fighterData.getPersonality();
		Characteristic punchPower = personality.getCharacteristic("punchPower");
		Characteristic punchReach = personality.getCharacteristic("punchReach");
		Characteristic kickPower = personality.getCharacteristic("kickPower");
		Characteristic kickReach = personality.getCharacteristic("kickReach");
		double weight = (double)(punchPower.getValue() + kickPower.getValue()) / 2;
		double height = (double)(punchReach.getValue() + kickReach.getValue()) / 2;
		double speed = 0.5*(height-weight);
		
		if ( moveAction.equals("run_towards") ) {
			move(otherFighter, (speed*2)+1, false);
		} else if ( moveAction.equals("walk_towards") ) {
			move(otherFighter, speed+1, false);
		} else if ( moveAction.equals("run_away") ) {
			move(otherFighter, (speed*2)+1, true);
		} else if ( moveAction.equals("walk_away") ) {
			move(otherFighter, speed+1, true);
		}
	}
	
	private boolean isReaching(FighterModel otherFighter) {
		if ( distanceBetween(otherFighter) <= 60 ) return true;
		return false;
	}
	
	public int distanceBetween(FighterModel otherFighter) {
		int distance = getPosition().x - otherFighter.getPosition().x;
		if ( distance < 0 ) {
			distance = -distance;
		}
		return distance;
	}
	
	private boolean isBlocked(FighterModel otherFighter) {
		FighterState fighterState = getState();
		if ( fighterState == FighterState.FIGHTER_PUNCH_LOW || fighterState == FighterState.FIGHTER_KICK_LOW ) {
			return ( otherFighter.getState() == FighterState.FIGHTER_BLOCK_LOW );
		} else if ( fighterState == FighterState.FIGHTER_PUNCH_HIGH || fighterState == FighterState.FIGHTER_KICK_HIGH ) {
			return ( otherFighter.getState() == FighterState.FIGHTER_BLOCK_HIGH );
		}
		return true;
	}
	
	public boolean isAggressive() {
		FighterState fighterState = getState();
		return ( fighterState == FighterState.FIGHTER_PUNCH_LOW || fighterState == FighterState.FIGHTER_KICK_LOW || fighterState == FighterState.FIGHTER_PUNCH_HIGH || fighterState == FighterState.FIGHTER_KICK_HIGH );
	
	}
	
	public void setHealth(int health) {
		if ( health < 0 ) {
			this.health = 0;
		} else if ( health > maxHealth ) {
			this.health = maxHealth;
		} else {
			this.health = health;
		}
	}
	
	public void setRelativeHealth(int relativeHealth) {
		setHealth(health+relativeHealth);
	}
	
	public void setState(FighterState state) {
		animation.setState(state);
	}
	
	public FighterState getState() {
		return animation.getState();
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}
	
	public Fighter getFighterData() {
		return fighterData;
	}
	
}
