package saf.simulation;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import saf.ast.Behaviour;
import saf.ast.FighterDef;
import saf.ast.action.*;
import saf.ast.condition.*;

//wrapper class to support fight simulations
public class Fighter {
	private final Random random = new Random();
	private final FighterDef definition;
	private int health = 100;
	private int position;
	private String stance;
	private Boolean moving = false;
	private final int startPosition;
	private final int moveDirection;

	private double speed = 0.0;

	public Fighter(FighterDef definition, int startPosition, int direction) {
		this.definition = definition;
		this.position = startPosition;
		this.startPosition = startPosition;
		this.moveDirection = direction;
		setSpeed(definition);
	}

	public FighterDef getDefinition() {
		return this.definition;
	}

	public Boolean isMoving() {
		return moving;
	}

	public int getHealth() {
		return this.health;
	}

	// position at fighter center
	public int getPosition() {
		return this.position + (moveDirection * 20);
	}

	public String getCurrentStance() {
		return this.stance;
	}
	
	public void setCurrentStance(String actionType){
		this.stance = actionType; 
	}

	public int getCharacteristicValue(String name) {
		return this.definition.getCharacteristicValue(name);
	}

	public void doDamage(int damage) {
		this.health -= damage;
		if (this.health < 0) {
			this.health = 0;
		}
	}

	public Boolean doMove(int movement) {
		if(moveDirection > 0){
			if(getPosition() + (moveDirection * movement) >= startPosition){
				position += (moveDirection * movement);
				return true;
			}
		}else{
			if(getPosition() + (moveDirection * movement) <= startPosition){
				position += (moveDirection * movement);
				return true;
			}
		}
		return false;
	}

	private void setSpeed(FighterDef def) {
		double weight = (def.getCharacteristicValue("punchPower") + def.getCharacteristicValue("kickPower")) / 2;
		double height = (def.getCharacteristicValue("punchReach") + def.getCharacteristicValue("kickReach")) / 2;

		this.speed = Math.abs(0.5 * (height - weight));
	}

	public Behaviour getBehaviour(Fighter opponent) {

		List<Behaviour> validBehaviours = new ArrayList<Behaviour>();

		for (Behaviour b : this.definition.getBehaviours()) {
			if (isApplicableCondition(b.getCondition(), opponent))
				validBehaviours.add(b);
		}
		
		if (validBehaviours.size() > 0) {
			return validBehaviours.get(random.nextInt(validBehaviours.size()));
		} else {
			// do nothing
			return null;
		}
	}

	private Boolean isApplicableCondition(Condition c, Fighter opponent) {
		int distance = Math.abs(this.getPosition() - opponent.getPosition());
		int health = this.getHealth() - opponent.getHealth();
		
		return c.match(Rules.ResolveCondition(distance, health));
	}

}