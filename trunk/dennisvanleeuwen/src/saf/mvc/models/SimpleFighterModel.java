package saf.mvc.models;

import saf.astelements.Characteristic;
import saf.astelements.Fighter;
import saf.mvc.FighterModel;

public class SimpleFighterModel extends FighterModel{
	public SimpleFighterModel(int x, int y, int health, String startMoveState, String startFightState, Fighter fighterNode){
		super(x, y, health, startMoveState, startFightState, fighterNode);
	}
	
	public int findCharacteristicValue(String characteristicItem){
		for(Characteristic fighterChar: this.getFighterNode().getCharacteristics()){
			if(fighterChar.item.equals(characteristicItem))
				return fighterChar.value;
		}
		return 5;//Default value;
	}
	
	//weight = (punchPower + kickPower) / 2
	public double getWeight(){
		return (this.findCharacteristicValue("punchPower") + this.findCharacteristicValue("kickPower")) /2;
	}
	
	//height = (punchReach + kickReach) / 2
	public double getHeight(){
		return (this.findCharacteristicValue("punchReach") + this.findCharacteristicValue("kickReach")) /2;
	}
	
	//speed = | 0.5*(height-weight) |
	public double getSpeed(){
		return Math.abs(0.5*(this.getHeight() - this.getWeight()));
	}
}
