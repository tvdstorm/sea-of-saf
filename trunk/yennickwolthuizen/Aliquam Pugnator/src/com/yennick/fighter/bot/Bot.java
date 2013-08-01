package com.yennick.fighter.bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.yennick.fighter.bot.Behaviour;
import com.yennick.gui.StickMan;

public class Bot{
	private final String fighterName;
	private final List<Personality> personality;
	private final List<Behaviour> behaviour;
	
	private final JLabel info = new JLabel();
	private int health = 100;
	private boolean challenger = false;
	
	public final StickMan stickMan;
	
	public Bot(String fighterName){
			this.fighterName = fighterName;
			this.behaviour = new ArrayList<Behaviour>();
			this.personality = new ArrayList<Personality>();
			this.stickMan = new StickMan();
	}
	
	public String getFighterName(){
		return fighterName;
	}
	
	public void addPersonality(Personality personality){
		this.personality.add(personality);
	}

	public void addBehaviour(Behaviour behaviour){
		this.behaviour.add(behaviour);
	}
	
	public List<Personality> getPersonalities(){
		return this.personality;
	}

	public Behaviour getBehaviour(String conditionString,String difference){
		
		List<Integer> possibleMoves = new ArrayList<Integer>();
		List<String> conditions = new ArrayList<String>();
		
		conditions.add(conditionString);
		conditions.add(difference);
		conditions.add(Constants.getDef());
		
		behaviour.toString();
		
		for (int i = 0; i < behaviour.size(); i++){
			Condition cond = behaviour.get(i).getCondition();
			
			if(cond.hasCondition(conditions)){
				possibleMoves.add(i);
			}
		}
		return getMove(possibleMoves);
	}
	
	private Behaviour getMove(List<Integer> possibleMoves) {
		
		Behaviour move = null;
		
		if(possibleMoves.size() > 1){
			Random rand = new Random();
			int moveInt = possibleMoves.get(rand.nextInt(possibleMoves.size() -1));
			move =  behaviour.get(moveInt);
		} else if (possibleMoves.size() == 1) {
			move =  behaviour.get(0);
		}
		return move;
	}

	public void checkAlways(){
		if(getBehaviour(Constants.getDef(),null) == null){
			buildAlways();
		} else {
		}
	}

	private void buildAlways(){
		
		//pick a random action
		Random rand = new Random();
		int fA = rand.nextInt(Constants.getFightActions().size());
		int mvA = rand.nextInt(Constants.getMoveActions().size());
		
		Action moveAction = new Action(Constants.getMoveActions().get(mvA));
		Action fightAction= new Action(Constants.getFightActions().get(fA));
		
		Behaviour beh = new Behaviour(new ConcreteCondition(Constants.getDef()),moveAction,fightAction);

		addBehaviour(beh);
	}
	
	public int getPersonality(String getP) {
		
		for(Personality pers: personality){
			if(pers.getCharacteristic().equals(getP)){
				return pers.getValue();
			}
		}
		return Constants.getDefaultValue();
	}
	
	public int getPowerByMove(String move){
		
		move = move.substring(0, move.indexOf('_'))+ "Power";
		return getPersonality(move);
	}
	
	public int getHealth(){
		return health;
	}
	
	public void setAsChallenger(){
		challenger = true;
	}
	
	public boolean isChallenger(){
		return challenger;
	}
	
	public int damage(int damage){
		
		health =  Math.max(health - damage, 0);
		if(health == 0){
			
			stickMan.die();
		}
		return damage;
	}

	public double getWeight(){
		return (this.getPersonality("punchPower")+this.getPersonality("kickPower")) /2;
	}
	
	public int getHeight(){
		return (this.getPersonality("punchReach")+this.getPersonality("kickReach")) /2;
	}
	
	public int getReach(){
		return Math.min(this.getPersonality("punchReach"),this.getPersonality("kickReach"));
	}
	
	public double getSpeed(){
		return 0.5*(getHeight() - getWeight()) ;
	}
			
	public JLabel setInfo(){
		info.setText("Health: " + getHealth());
		return info;
	}
	
	public JPanel stickMan(){
		this.stickMan.setProps(getHeight(),challenger);
		
		JPanel stickPanel = new JPanel();
		
	    stickPanel.add(stickMan);
		
		return stickPanel;
	}
	
	public void repaint(){
		setInfo();
		
		stickMan.refresh();
	}
	
	public void goToCorner(){
		stickMan.unAct();
	}
	
	public void doAction(String action){
		stickMan.doAction(action);
	}
	
	public void move(int vertical,int horizontal){
		stickMan.move(vertical, horizontal);
	}
	
	
	public void doMove(String move) {
		if(move.contains("crouch")){
			stickMan.crouch();
		}
		if(move.contains("jump")){
			stickMan.jump();
		}
	}


	public String toString(){
		return "Name: " +fighterName + "\n" ;
		
		
	}

	public String getStrengthDifference(int strength) {
		int diff = Constants.getStrengthDiff();
		
		if(strength > diff)return Constants.getConditions().get(7);
		else if(strength <=diff && strength > 0) return Constants.getConditions().get(6);
		else if(strength == 0) return Constants.getConditions().get(5);
		else if(strength < 0 && strength >= -diff)return Constants.getConditions().get(4);
		else return Constants.getConditions().get(diff); // smaller than -3 (much weaker)
	}
}