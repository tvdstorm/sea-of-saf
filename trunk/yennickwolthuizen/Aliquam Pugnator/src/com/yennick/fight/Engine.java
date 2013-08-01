package com.yennick.fight;

import java.util.ArrayList;
import java.util.List;

import com.yennick.fighter.bot.Behaviour;
import com.yennick.fighter.bot.Bot;
import com.yennick.fighter.bot.Constants;

public class Engine {
	
	public final SAFFile fight;
	private final List<String> errors;
	private Bot homeFighter;
	private Bot challenger;
	
	
	private int distance = 5;
	private boolean nextAttacker;
	private boolean gameOver;
	
	public Engine(){
		fight = new SAFFile();
		errors = new ArrayList<String>();
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
	
	private void refresh(){
		homeFighter.repaint();
		challenger.repaint();
	}
	
	private void startFight(){
		boolean isVictim = nextAction();
	
		Bot fighter = (isVictim)? homeFighter : challenger;
		Bot victim = (isVictim)? challenger : homeFighter;
		
		if(checkHealth()){
			setGameOver();
		} else{
			act(fighter,victim);
		}
	}
	
	private boolean checkHealth(){
		return homeFighter.getHealth() ==0 || challenger.getHealth() == 0;
	}
	
	private boolean nextAction(){
		nextAttacker ^=true;
		return nextAttacker;
	}
	
	private void setGameOver(){
		gameOver = true;
		refresh();
	}
	
	public boolean getGameOverStatus(){
		return gameOver;
	}

	private void act(Bot fighter,Bot victim){
		
		fighter.goToCorner();
		victim.goToCorner();
		
		//act
		String difference = getStrengthDiff(fighter,victim);
		Behaviour turn = getDistance(fighter,difference);
		doMove(fighter,turn);
		
		//reacts
		difference = getStrengthDiff(victim,fighter);
		Behaviour react = getDistance(victim,difference);
		doMove(victim,react);
		
		doAction(fighter,victim,turn,react);
		
		System.out.println(turn.toString() + " - " + react.toString());
		refresh();
	}
	
	private String getStrengthDiff(Bot fighter, Bot victim){
		int strength = (int) (fighter.getWeight() - victim.getWeight());
		
		return fighter.getStrengthDifference(strength);
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

	private void doAction(Bot fighter,Bot victim, Behaviour turn, Behaviour reaction){
		
		String act = turn.getActionString();
		String react = reaction.getActionString();

		takeDamage(fighter,victim,act,react);
		takeDamage(victim,fighter,react,act);
		
	}
	
	private void takeDamage(Bot attacker,Bot defender, String act, String react){
		attacker.doAction(act);
	
		if(!act.contains("block")){
			
			int damage = attacker.getPowerByMove(act);
			int block = (react.contains("block"))? (int) defender.getWeight() /2: 0;
			defender.damage(Math.max(damage - block,0));
		}
	}
	
	private void doMove(Bot fighter, Behaviour turn){
		String move = turn.getMoveActionString();
		
		fighter.doMove(move);
		
		int moveDistance = Constants.getMoveDistance(move);
		fighter.move(0,moveDistance);
		
		distance = Math.max(0,distance - moveDistance);
	}
		
	private boolean getOutOfReach(boolean isChallenger){
		return (!isChallenger)? (homeFighter.getReach() < distance) : (challenger.getReach() < distance);
	}
	
	public Bot setFighter(String fighterName, boolean isChallenger){
		fighterName = fighterName.substring(0, fighterName.lastIndexOf('.'));
		
		Bot fighter = fight.getFighter(fighterName);
		fighter.check(errors);

		if(isChallenger){
			fighter.setAsChallenger();
			challenger = fighter;
		} else {
			homeFighter = fighter;
		}
		
		return fighter;
	}
}