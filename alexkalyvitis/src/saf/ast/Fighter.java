package saf.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import saf.ast.base.Identifier;
import saf.ast.identifiers.Attacks;
import saf.ast.identifiers.Strengths;
//import saf.simulator.enums.*;

public class Fighter extends Identifier{
	
	private String name;
	private List<Strength> strengths;
	private List<Behavior> behaviors;
	
	public Fighter(){
		this("");
	}
	
	public Fighter(String n){
		this.name = n;
		this.strengths = new ArrayList<Strength>();
		this.behaviors = new ArrayList<Behavior>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void appendName(String name) {
		this.name = this.name + " " + name;
	}

	public List<Strength> getStrengths() {
		return strengths;
	}
	
	public int getStrengthValue(String strength){
		int index = strengths.indexOf(new Strength(strength));
		if(index == -1)
			return 5;
		return strengths.get(index).getValue();
	}

	public void setStrengths(List<Strength> strengths) {
		this.strengths = strengths;
	}
	
	public void addStrength(Strength strength){
		this.strengths.add(strength);
	}

	public List<Behavior> getBehaviors() {
		Collections.shuffle(behaviors);
		return behaviors;
	}

	public void addBehaviors(List<Behavior> behaviors) {
		this.behaviors.addAll(behaviors);
	}

	public float getWeight() {
		return (float)(getValueOfStrength(Strengths.PUNCHPOWER) + getValueOfStrength(Strengths.KICKPOWER)) / 2;
	}

	public float getHeight() {
		return (float)(getValueOfStrength(Strengths.PUNCHREACH) + getValueOfStrength(Strengths.KICKREACH)) / 2;
	}

	public float getSpeed() {
		return (float)Math.abs(getHeight() - getWeight()) / 2;
	}
	
	public int getTotalStrength(){ 
		int sumStrength = 0;
		for(Strength s : strengths) { 
			sumStrength += s.getValue(); 
		}
		return sumStrength;
	}
	
	public int getAttackDamage(Attack a){
		switch(Attacks.valueOf(a.getName())){
		case PUNCH_HIGH	:
		case PUNCH_LOW	: 
			return getValueOfStrength(Strengths.PUNCHPOWER);
		case KICK_HIGH	:
		case KICK_LOW	:
			return getValueOfStrength(Strengths.PUNCHPOWER);
		default			:
			return 0;
		}
	}
	
	public int getAttackReach(Attack a) {
		switch(Attacks.valueOf(a.getName())){
		case PUNCH_HIGH	:
		case PUNCH_LOW	: 
			return getValueOfStrength(Strengths.PUNCHREACH);
		case KICK_HIGH	:
		case KICK_LOW	:
			return getValueOfStrength(Strengths.KICKREACH);
		default			:
			return 0;
		}
	}
	
	public int getValueOfStrength(Strengths s){
		for(Strength strength : strengths){
			if(strength.getStrength().equals(s)){
				return strength.getValue();
			}
		}
		return 5;
	}
	
	public void print(){
		for (Strength strength : strengths){
			System.out.println("\tStrength :" + strength.toString());
		}
		for (Behavior behavior : behaviors){
			System.out.println("\tBehavior :" + behavior);
		}
	}
}
