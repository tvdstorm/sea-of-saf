package com.yennick.fighter.bot;

import java.awt.Color;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.yennick.fighter.gui.StickMan;
import com.yennick.fighter.bot.Behaviour;

public class Bot{
	private final String fighterName;
	private final List<Personality> personality;
	private final List<Behaviour> behaviour;
	private final List<Integer> possibleMoves;
	
	private JLabel info = new JLabel();
	private int health = 100;
	private boolean challenger = false;
	
	public final StickMan stickMan;
	
	public Bot(String fighterName){
			this.fighterName = fighterName;
			this.behaviour = new ArrayList<Behaviour>();
			this.personality = new ArrayList<Personality>();
			this.possibleMoves = new ArrayList<Integer>();
			this.stickMan = new StickMan();
			
	}
	
	public String getFighterName() {
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

	public Behaviour getBehaviour(String conditionString,String difference) {
		
		System.out.println(conditionString + " - " + difference);
			
		for (int i = 0; i < behaviour.size(); i++) {
			
			Condition cond = behaviour.get(i).getCondition();
			
			if(cond.hasCondition(conditionString) || cond.hasCondition(difference) || cond.hasCondition("always")){
				possibleMoves.add(i);
			}
		}
		
			if(possibleMoves.size() > 1){
				Random rand = new Random();
				int move = possibleMoves.get(rand.nextInt(possibleMoves.size() -1));
				return behaviour.get(move);
			} else if (possibleMoves.size() == 1) {
				return behaviour.get(0);
			}
		return null;

	}
	
	public void checkAlways(){
		if(getBehaviour("always",null) == null){
			
			System.out.println("building always");
			buildAlways();
		} else {
			System.out.println("found always");
		}
	}

	private void buildAlways(){
		System.out.println("Build always");
		
		//pick a random action
		Random rand = new Random();
		int fA = rand.nextInt(Constants.getFightActions().size());
		int mvA = rand.nextInt(Constants.getMoveActions().size());
		
		Action moveAction = new Action(Constants.getMoveActions().get(mvA));
		Action fightAction= new Action(Constants.getFightActions().get(fA));
		
		Behaviour beh = new Behaviour(new Condition("always"),moveAction,fightAction);

		addBehaviour(beh);
	}
	
	public int getPersonality(String getP) {
		System.out.println(getP + " check");
		
		for(Personality pers: personality){
			if(pers.getCharacteristic().equals(getP)){
				System.out.println(getP + " "+pers.getValue());
				return pers.getValue();
			}
		}
		System.out.println(getP + " def");
		return Constants.getDefaultValue();
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
		
	
	// far future implementation ... 
	public Color getColor(){
		List<String> colorList = Constants.getColors();
		Color color;

		try {
		    Field field = Class.forName("java.awt.Color").getField(colorList.get(this.getPersonality("color")));
		    color = (Color)field.get(null);
		} catch (Exception e) {
		    color = null; // Not defined
		}
		
		return color;
	}
	
	public JLabel info(){
		info.setText("Health: " + getHealth());
		return info;
	}
	
	public JPanel stickMan(){
		this.stickMan.setProps(getHeight(),challenger);
		
		JPanel stickPanel = new JPanel();
		
	    stickPanel.add(stickMan);
		
		return stickPanel;
	}

	public String toString(){
		return "Name: " +fighterName + "\n";
	}
}