package saf.mvc.models;

import saf.astnodes.Characteristic;
import saf.astnodes.Fighter;
import saf.mvc.FighterModel;

public class SimpleFighterModel extends FighterModel{
	private static final int DEFAULT_VALUE = 5;
	
	public SimpleFighterModel(int x, int health, String startMoveState, String startFightState, Fighter fighterNode){
		super(x, health, startMoveState, startFightState, fighterNode);
	}
	
	public int findCharacteristicValue(String characteristicItem){
		for(Characteristic fighterChar: this.getFighterNode().getCharacteristics()){
			if(fighterChar.item.equals(characteristicItem))
				return fighterChar.value;
		}
		System.out.println("Default characteristic!");
		return DEFAULT_VALUE;
	}
	
	public double getWeight(){
		return (this.findCharacteristicValue("punchPower") + this.findCharacteristicValue("kickPower")) /2;
	}
	
	public double getHeight(){
		return (this.findCharacteristicValue("punchReach") + this.findCharacteristicValue("kickReach")) /2;
	}
	
	public double getSpeed(){
		return Math.abs(0.5*(this.getHeight() - this.getWeight()));
	}
}
