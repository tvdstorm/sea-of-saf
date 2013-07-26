package com.yennick.fight;

import com.yennick.fighter.bot.Action;
import com.yennick.fighter.bot.Behaviour;
import com.yennick.fighter.bot.Bot;
import com.yennick.fighter.bot.Constants;

public class Engine {
	
	public final SAFFile fight;
	private Bot homeFighter;
	private Bot challenger;
	
	
	private int distance = 5;
	private boolean nextAttacker;
	private boolean gameOver;
	
	public Engine(){
		fight = new SAFFile();
		fight.toString();
	}
	
	public Bot getHomeFighter(){
		return homeFighter;
	}
	
	public Bot getChallenger(){
		return challenger;
	}
	
	public void fight(){
		
		startFight();
	}
	
	public int getDistance(){
		return distance;
	}
	
	private void refresh() {
		
		homeFighter.info();
		challenger.info();
		
		homeFighter.stickMan.revalidate();
		homeFighter.stickMan.repaint();
		
		challenger.stickMan.revalidate();
		challenger.stickMan.repaint();
		
	}
	
	private void startFight(){
		
		System.out.println("\nnext move...");
		boolean isVictim = nextAction();
		Bot fighter = (isVictim)? homeFighter : challenger;
		Bot victim = (isVictim)? challenger : homeFighter;
		
		if(homeFighter.getHealth() ==0 || challenger.getHealth() == 0){
			setGameOver();
		} else{
			act(fighter,victim);
		}
		
	}
	
	private boolean nextAction(){
		nextAttacker ^=true;
		return nextAttacker;
	}
	
	private void setGameOver() {
		gameOver = true;
	}
	
	public boolean getGameOverStatus(){
		return gameOver;
	}

	private void act(Bot fighter,Bot victim){
		
		fighter.stickMan.unAct();
		victim.stickMan.unAct();
		
		String difference = getStrengthDiff(fighter,victim);
		Behaviour turn = getDistance(fighter,difference);
		doMove(fighter,turn);
		
		
		//reacts
		difference = getStrengthDiff(victim,fighter);
		Behaviour react = getDistance(victim,difference);
		doMove(victim,react);
		
		doAction(fighter,victim,turn,react);
		
		refresh();
		
		
	}
	
	private String getStrengthDiff(Bot fighter, Bot victim) {
		int Strength = (int) (fighter.getWeight() - victim.getWeight());
		
		
		if(Strength > 3)return Constants.getConditions().get(7);
		else if(Strength <=3 && Strength > 0) return Constants.getConditions().get(6);
		else if(Strength == 0) return Constants.getConditions().get(5);
		else if(Strength < 0 && Strength >= -3)return Constants.getConditions().get(4);
		else return Constants.getConditions().get(3); // smaller than -3 (much weaker)
	}

	private Behaviour getDistance(Bot fighter, String difference){
		
		Behaviour turn;
		if(getOutOfReach(fighter.isChallenger())){
			turn = fighter.getBehaviour("far",difference);
		} else {
			turn = fighter.getBehaviour("near",difference);
		}
		return turn;
	}

	private void doAction(Bot fighter,Bot victim, Behaviour turn, Behaviour reaction) {
		Action fightAction = turn.getAction();
		Action defenseAction = reaction.getAction();
		
		System.out.println(fightAction.getActionString());
		fighter.stickMan.doAction(fightAction.getActionString());
		
		victim.stickMan.doAction(defenseAction.getActionString());
			
		String act = fightAction.getActionString();
		String react = defenseAction.getActionString();
		
		System.out.println(fighter.getFighterName() + " - " + act + " | "+ victim.getFighterName() + " - " + react);
		
		int block = 0;
		int victimD = 0;
		int fighterD = 0;
		
		if(!act.contains("block")){
			
			int damage = fighter.getPersonality(act.substring(0, act.indexOf('_'))+ "Power");
			block = (react.contains("block"))? (int) victim.getWeight() /2: 0;
			victimD = victim.damage(Math.max(damage - block,0));
		}
			
		if(!react.contains("block")){
			
			int damage = victim.getPersonality(react.substring(0, react.indexOf('_'))+ "Power");
			block = (act.contains("block"))? (int) fighter.getWeight() / 2 : 0;
			fighterD = fighter.damage(Math.max(damage - block,0));
		}
		
		System.out.println(fighter.getFighterName()+ fighter.getHealth() + " - " + act + " : " + victimD + " | "+ victim.getFighterName()+victim.getHealth() + " - " + react + " : "+ fighterD);

	}

	private void doMove(Bot fighter, Behaviour turn){
		Action moveAction = turn.getMoveAction();
		
		if(moveAction.getActionString().contains("crouch")){
			fighter.stickMan.crouch();
		}
		if(moveAction.getActionString().contains("jump")){
			fighter.stickMan.jump();
		}
		
		int move = Constants.getMoveDistance(moveAction.getActionString());
		fighter.stickMan.move(0,move*10);
		distance = Math.max(0,distance - move);
	}
		
	private boolean getOutOfReach(boolean isChallenger){
		return (!isChallenger)? (homeFighter.getReach() < distance) : (challenger.getReach() < distance);
	}
	
/*	public void setFighter(String fighterName, boolean isChallenger) {
		fighterName = fighterName.substring(0, fighterName.lastIndexOf('.'));
		
		if(!isChallenger && homeFighter == null){
			homeFighter = fight.getFighter(fighterName);
			homeFighter.checkAlways();
		}
		else if(isChallenger && challenger == null ) {
			challenger = fight.getFighter(fighterName);
			challenger.checkAlways();
			challenger.setAsChallenger();
		}
	}
*/	
	public Bot setFighter(String fighterName, boolean isChallenger) {
		fighterName = fighterName.substring(0, fighterName.lastIndexOf('.'));
		
			Bot fighter = fight.getFighter(fighterName);
			fighter.checkAlways();
		if(isChallenger) {
			fighter.setAsChallenger();
			challenger = fighter;
		} else {
			homeFighter = fighter;
		}
		
		return fighter;
	}
}