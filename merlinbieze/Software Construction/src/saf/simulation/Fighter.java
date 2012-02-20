package saf.simulation;

import saf.ast.Action;
import saf.ast.FighterDef;

//wrapper class to support fight simulations
public class Fighter {
	
	private final FighterDef definition;
	private int health = 100;
	private int position;
	private Action stance;
	private Boolean moving = false;
	
	private double speed = 0.0; 
	
	public Fighter(FighterDef definition, int startPosition) {
		
		this.definition = definition;
		this.position = startPosition;
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
		return this.position;
	}
	
	public Action getCurrentStance() {
		return this.stance;
	}
	
	public int getCharacteristicValue(String name) {
		return this.definition.getCharacteristicValue(name);
	}
	
	
	public void doDamage(int damage) {
		this.health -= damage;
		if(this.health < 0) {
			this.health = 0;
		}
	}
	
	public void doMove(int movement) {
		position += movement;
	}
	
	private void setSpeed(FighterDef def) {
		double weight = (def.getCharacteristicValue("punchPower") + def.getCharacteristicValue("kickPower") / 2);
		double height = (def.getCharacteristicValue("punchReach") + def.getCharacteristicValue("kickReach") / 2);
				
		this.speed = 0.5*(height-weight);			
	}
	
}