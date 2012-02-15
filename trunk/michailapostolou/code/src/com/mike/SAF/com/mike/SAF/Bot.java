package com.mike.SAF;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JLabel;


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
	private int power;
	private static String[] healthLevel = {"dead","much_weaker","weaker","stronger","much_stronger","full"};
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
	
	public boolean checkConsistency(){
		boolean result = true;
		
		if(!checkAlwaysy())
			result = false;
		
		return result;
	}
	
	private boolean checkAlwaysy(){
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
	
	public ArrayList<String> getObservation(Point me, Point you){
		ArrayList<String> result = new ArrayList<String>();
		this.healthCondition = getHealthLevel();
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
	public ArrayList<String> decideMove(Point me,Point you){
//		checkAlways();
		ArrayList<String> observation = getObservation(me, you);
		ArrayList<String> availableMoves = new ArrayList<String>();
		ArrayList<String> availableFightMoves = new ArrayList<String>();
		boolean ok = false;
		for(Behavior behavior:behaviors){
			ArrayList<String> conditions = behavior.getConditions();
			if(conditions.contains(observation.get(0)) || conditions.contains(observation.get(1))){
//				if(conditions.size()>1)
				System.out.println(conditions.get(0));
//					Öif(conditions.contains(observation.get(1))){
						availableMoves.addAll(behavior.getMoves());
						availableFightMoves.addAll(behavior.getFight_moves());
						ok = true;
//					}
			}
		}
		if(!ok){
			availableMoves = alwaysMoves;
			availableFightMoves = alwaysFightMoves;
		}
		
		if(availableMoves.size()>1)
			moveSet.add(availableMoves.get(new Random().nextInt(availableMoves.size()-1)));
		else moveSet.add(availableMoves.get(0));
		if(availableFightMoves.size()>1)
			moveSet.add(availableFightMoves.get(new Random().nextInt(availableFightMoves.size()-1)));
		else moveSet.add(availableFightMoves.get(0));
		
		return moveSet;
	}
	
	private String getHealthLevel() {
		return healthLevel[health/20];
	}
	
	private String getDistance(Point me, Point you){
		System.out.println(Math.abs(me.x-you.x)/120);
		return distance[(Math.abs(me.x - you.x))/120<1?0:1];
	}
	
}
