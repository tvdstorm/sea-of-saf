package model;

import java.util.ArrayList;
import util.Visitor;

public class Fighter extends ASTNode{
	
	private String name;
	private ArrayList<Behaviour> behaviours = new ArrayList<Behaviour>();
	private ArrayList<Characteristic> characteristics = new ArrayList<Characteristic>();
	
	public void setName(String nameFighter) {
        this.name = nameFighter;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addBehaviour(Behaviour behaviour) {
		this.behaviours.add(behaviour);
	}
	
	public void addCharacteristic(Characteristic characteristic) {
		this.characteristics.add(characteristic);
	}
	
	public ArrayList<Behaviour> getBehaviours() {
		return this.behaviours;
	}
	
	public ArrayList<Characteristic> getCharacteristics() {
		return this.characteristics;
	}
	
	public int getCharacteristic(String characteristic){
		int ret =0;
		for(int i=0; i<characteristics.size();i++){
			if(this.characteristics.get(i).getNameCharacteristic().equals(characteristic)){ret = this.characteristics.get(i).getValue();}
		}
		return ret;
	}
	
	public ArrayList<Characteristic> getCharacteristic() {
		return this.characteristics;
	}
	
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
