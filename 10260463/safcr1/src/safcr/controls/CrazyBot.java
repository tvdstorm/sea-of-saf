package safcr.controls;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import safcr.ast.*;

public class CrazyBot {
	private int hp = 100;
	private String name;
	private BotData bData;
	
	private List<ArrayList<String>> currentRules;
	
	public CrazyBot(String botName){
		name = botName;
		bData = new BotData();
		currentRules = new ArrayList<ArrayList<String>>();
	}
	
	public void addCharacteristic(String name, int value){
		bData.setCharacteristic(name, value);
	}
	
	public void addRule(Rule r){
		bData.addRule(r);
	}
	
	public void setHp(int h){
		hp = h;
	}
	
	public int getHp(){
		return hp;
	}
	
	public boolean update(int enemyHP){
		Map<Integer, List<String>> rules = bData.getRules();
		int ruleToUse = 0;
		
		for(int i = 1; i <= rules.size();i++){
			List<String> l = rules.get(i);
			if(hp == enemyHP){
				if(l.get(0).contains("even")){
					ruleToUse = i;
				}
			}
			else if(hp > enemyHP && (hp - enemyHP) <= 30){
				if(l.get(0).contains("stronger")){
					ruleToUse = i;
				}
			}
			else if(hp > enemyHP && (hp - enemyHP) > 30){
				if(l.get(0).contains("much_stronger")){
					ruleToUse = i;
				}
			}
			else if(hp < enemyHP && (enemyHP - hp) <= 30){
				if(l.get(0).contains("weaker")){
					ruleToUse = i;
				}
			}
			else if(hp < enemyHP && (enemyHP - hp) > 30){
				if(l.get(0).contains("much_weaker")){
					ruleToUse = i;
				}
			}
			
			if(ruleToUse != 0){
				currentRules.add((ArrayList<String>) rules.get(ruleToUse));
			}
		}
		
		return true;
	}
	
	@Override
	public String toString(){
		return bData.getRules().toString();
	}
}
