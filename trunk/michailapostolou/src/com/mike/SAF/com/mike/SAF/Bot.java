package com.mike.SAF;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JLabel;

import messages.AlwaysMessage;
import messages.AndMessage;
import messages.Message;
import messages.ValueMessage;


public class Bot {
	private Map<String,Integer> personality = new HashMap<String,Integer>();
	private ArrayList<Behavior> behaviors = new ArrayList<Behavior>();
	private ArrayList<String> moveSet = new ArrayList<String>();
	private ArrayList<String> alwaysMoves = new ArrayList<String>();
	private ArrayList<String> alwaysFightMoves = new ArrayList<String>();
	private String botName;
	private int health;
	private String healthCondition;
	private String distanceCondition;
	private int speed;
	private static String[] healthLevel = {"much_weaker","weaker","even","stronger","much_stronger"};
	private static String[] distance = {"near","far"};
	private int orientation;
	
	public Bot(){
		this.health = 100;
		this.personality.put("kickPower", 5);
		this.personality.put("kickReach", 5);
		this.personality.put("punchPower", 5);
		this.personality.put("punchReach", 5);
		setSpeed();

	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void addAttribute(Attribute attribute){
		this.personality.put(attribute.getName(),attribute.getValue());
	}
	
	public void addBehavior(Behavior behavior){
		this.behaviors.add(behavior);
	}
	public void addBehavior(ArrayList<Behavior> behaviors){
		this.behaviors.addAll(behaviors);
	}
	
	public void setBehaviors(ArrayList<Behavior> behaviors) {
		this.behaviors = behaviors;
	}
	
	public void setPersonality(Map<String, Integer> personality) {
		this.personality = personality;
	}
	
	public void setBotName(String botName) {
		this.botName = botName;
	}
	
	public String getBotName() {
		return botName;
	}
	
	private void setSpeed() {
		this.speed = 50+Math.abs( ( ((personality.get("punchReach") + personality.get("kickReach"))/2) - ((personality.get("kickPower")+personality.get("punchPower"))/2) ) /2);
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public Map<String, Integer> getPersonality() {
		return personality;
	}
	
	public void checkConsistency(ArrayList<Message> stream){		
		if(!checkAlways())
			stream.add(new AlwaysMessage(botName));
		checkPersonality(stream);
		checkConditionLists(stream);
	}
	
	private boolean checkAlways(){
		for(Behavior behavior:this.behaviors){
			ArrayList<String> conditions = behavior.getConditions();
			for(String condition:conditions)
				if(condition.equals("always")){
					alwaysMoves.addAll(behavior.getMoves());
					alwaysFightMoves.addAll(behavior.getFight_moves());
					return true;
				}
		}
		return false;
	}
	
	private void checkPersonality(ArrayList<Message> stream){
		for(String attribute:personality.keySet()){
			int value = personality.get(attribute);
			if(value<0 || value>10)
				stream.add(new ValueMessage(botName, attribute, value));
		}
	}
	
	private void checkConditionLists(ArrayList<Message> stream){
		for(Behavior behavior:this.behaviors){
			ArrayList<String> conditions = behavior.getConditions();
			if(conditions.size()>1){
				if(isDistance(conditions.get(0))){
					for(int i=1; i<conditions.size(); i++)
						if(isDistance(conditions.get(i))){
							stream.add(new AndMessage(botName,"distance"));
							i=conditions.size();
						}
				}
				else if(isHealthLevel(conditions.get(0))){
					for(int i=1; i<conditions.size(); i++)						
						if(isHealthLevel(conditions.get(i))){
							stream.add(new AndMessage(botName,"health"));
							i=conditions.size();
						}
				}
			}
		}
	}
	
	public ArrayList<String> getObservation(Point me, Point you, int yourHealth){
		ArrayList<String> result = new ArrayList<String>();
		this.healthCondition = getHealthLevel(yourHealth);
		this.distanceCondition = getDistance(me, you);
		result.add(this.healthCondition);
		result.add(this.distanceCondition);
		return result;
	}
	
	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
	
	public int getOrientation() {
		return orientation;
	}
	public ArrayList<String> decideMove(Point me,Point you,int yourHealth){
		ArrayList<String> observation = getObservation(me, you, yourHealth);
		ArrayList<String> availableMoves = new ArrayList<String>();
		ArrayList<String> availableFightMoves = new ArrayList<String>();
		boolean ok = false;
		for(Behavior behavior:behaviors){
			ArrayList<String> conditions = behavior.getConditions();
			if(conditions.contains(observation.get(0)) || conditions.contains(observation.get(1))){
				availableMoves.addAll(behavior.getMoves());
				availableFightMoves.addAll(behavior.getFight_moves());
				ok = true;
			}
		}
		if(!ok){
			availableMoves = alwaysMoves;
			availableFightMoves = alwaysFightMoves;
		}
		
		if(availableMoves.size()>1)
			moveSet.add(availableMoves.get(new Random().nextInt(2)));
		else moveSet.add(availableMoves.get(0));
		if(availableFightMoves.size()>1)
			moveSet.add(availableFightMoves.get(new Random().nextInt(2)));
		else moveSet.add(availableFightMoves.get(0));
		
		return moveSet;
	}
	
	private String getHealthLevel(int yourHealth) {
		int healthDifference =  health-yourHealth;
		if(healthDifference==0){
			return "even";
		}
		else if(healthDifference<=-1 && healthDifference>=-50)
			return "weaker";
		else if(healthDifference<=-51)
			return "much_weaker";
		else if(healthDifference>0 && healthDifference<=50)
			return "stronger";
		else return "much_stronger";
	}
	
	private String getDistance(Point me, Point you){
		return distance[(Math.abs(me.x - you.x))/120<1?0:1];
	}
	
	private boolean isDistance(String input){
		if(input.equals(distance[0]) || input.equals(distance[1]))
				return true;
		else return false;
	}
	
	private boolean isHealthLevel(String input){
		for(int i=0; i<healthLevel.length; i++)
			if(!input.equals(healthLevel[i]))
				return false;
		return true;
	}

	
}
