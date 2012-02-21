package safcr.controls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import safcr.ast.*;

public class BotData {
	
	private Map<String,Integer> characteristic;
	private Map<Integer,List<String>>rules;
	private List<String> conditions;
	private List<String> moves;
	private List<String> attackMoves;
	private int iRule = 1;
	
	public BotData(){
		characteristic = new HashMap<String,Integer>();
		rules = new HashMap<Integer,List<String>>();
		conditions = new ArrayList<String>();
		moves = new ArrayList<String>();
		attackMoves = new ArrayList<String>();
		loadData();
	}
	
	public void loadData(){
		String[] cond = {"stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always"};
		String[] mov = {"jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away"};
		String[] aMov = {"punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high"};
		
		int i = 0;
		while(true){
			if(cond.length > i) conditions.add(cond[i]);
			if(mov.length > i) moves.add(mov[i]);
			if(aMov.length > i) attackMoves.add(aMov[i]);
			i++;
			
			if(cond.length <= i && mov.length <= i && aMov.length <= i) break;
		}
	}
	
	public Map<String,Integer> getCharacteristic(){
		return characteristic;
	}
	
	public void setCharacteristic(String name, int value){
		characteristic.put(name, value);
	}
	
	public Map<Integer,List<String>> getRules(){
		return rules;
	}
	
	public void addRule(Rule r){
		List<String> list = new ArrayList<String>();
		
		Action a = (Action) r.getAction();
		Node c = r.getCondition();
		List<Node> types = a.getTypes();
		
		if(c instanceof Condition){
			Condition con = (Condition) c;
			list.add(con.getType());
		}
		
		if(c instanceof And){
			And an = (And) c;
			String s = "";
			int i = 0;
			for(Node n : an.getAndNodes()){
				Condition con = (Condition) n;
				s += con.getType();
				if(i == 0) s += " and ";
				i++;
			}
			list.add(s);
		}
		
		if(c instanceof Or){
			Or o = (Or) c;
			String s = "";
			int i = 0;
			for(Node n : o.getOrNodes()){
				Condition con = (Condition) n;
				s += con.getType();
				if(i == 0) s += " or ";
				i++;
			}
			list.add(s);
		}
		
		for(Node n : types){
			if(n instanceof ActionType){
				ActionType at = (ActionType) n;
				list.add(at.getActionType());
			}
			
			if(n instanceof MultiActionType){
				MultiActionType m = (MultiActionType) n;
				String s = m.getTypeChoice1() + " or " + m.getTypeChoice2();
				list.add(s);
			}
		}
		
		rules.put(iRule, list);
		iRule++;
	}
	
	public List<String> getConditions(){
		return conditions;
	}
	
	public List<String> getMove(){
		return moves;
	}
	
	public List<String> getAttackMoves(){
		return attackMoves;
	}
}
