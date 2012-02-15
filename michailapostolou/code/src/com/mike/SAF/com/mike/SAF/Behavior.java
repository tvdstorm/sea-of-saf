package com.mike.SAF;

import java.util.ArrayList;
import java.util.Vector;

import org.antlr.runtime.tree.Tree;

public class Behavior {
	
	private ArrayList<String> conditions = new ArrayList<String>();
	private ArrayList<String> moves = new ArrayList<String>();
	private ArrayList<String> fight_moves = new ArrayList<String>();
	
	public Behavior(ArrayList<String> conditions, ArrayList<String> moves, ArrayList<String> fight_moves){
		this.conditions = conditions;
		this.moves = moves;
		this.fight_moves = fight_moves;		
	}
	
	public Behavior(){
	}
	
	public Behavior(ArrayList<String> conditions){
		this.conditions = conditions;
	}
	
	public void setConditions(ArrayList<String> conditions) {
		this.conditions = conditions;
	}
	
	public void setMoves(ArrayList<String> moves) {
		this.moves = moves;
	}
	
	public void setFight_moves(ArrayList<String> fightMoves) {
		fight_moves = fightMoves;
	}
	
	public void addCondition(String condtion){
		this.conditions.add(condtion);
	}
	
	public void addMove(String move){
		this.moves.add(move);
	}
	
	public void addFight_move( String fight_move){
		this.fight_moves.add(fight_move);
	}	
	
	public void addCondition(ArrayList<String> condtion){
		this.conditions.addAll(condtion);
	}
	
	public void addMove(ArrayList<String> move){
		this.moves.addAll(move);
	}
	
	public void addFight_move(ArrayList<String> fight_move){
		this.fight_moves.addAll(fight_move);
	}
	
	public ArrayList<String> getConditions() {
		return conditions;
	}
	public ArrayList<String> getMoves() {
		return moves;
	}
	
	public ArrayList<String> getFight_moves() {
		return fight_moves;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public Tree t;
//	private static String[] conditions = {"always", "near", "far","much_stronger" , "stronger" , "even", "weaker", "much_weaker"};
//	private static String[] moves = {"walk_towards","walk_away","run_towards","run_away","jump","crouch","stand"};
//	private static String[] fights = {"block_low","block_high","punch_low","punch_high","kick_low","kick_high"};
//	public String condition;					
//	public Vector<String> move = new Vector<String>();		
//	public Vector<String> fight = new Vector<String>();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public Behavior(Tree tree){
//		this.t = tree;
//		this.condition = tree.getChild(0).getText();
//		String m = tree.getChild(2).getText();
//		if(m.equals("choose"))							//REMOVE CHOOSE PARENTHESIS
//		{
//			for(int i =0; i<tree.getChild(2).getChildCount(); i++){
//				String e = tree.getChild(2).getChild(i).getText();
//				if(!e.equals("(") && !e.equals(")"))
//					this.move.add(e);
//			}
//		}
//		else this.move.add(m);
//		String f = tree.getChild(3).getText();
//		if(f.equals("choose"))
//		{
//			for(int j=0; j<tree.getChild(3).getChildCount(); j++){
//				String e1 = tree.getChild(3).getChild(j).getText();
//				if(!e1.equals("(") && !e1.equals(")"))
//					this.fight.add(e1);
//			}
//		}
//		else this.fight.add(f);
//	}
//	
//	public boolean checkConsistency(){
//		boolean result = false;
//		int value = 0;
//		if(checkValidity())
//		{
//				System.out.println(this.condition);
//				for(int j=0; j<move.size(); j++)
//					System.out.println(move.get(j));
//				for(int k=0; k< fight.size(); k++)
//					System.out.println(fight.get(k));
//			}
//		return result;
//	}
//	
//	public boolean isCondition(String query){			//IS THIS CONDITION VALID?
//		boolean result = false;
//		for(int i=0; i<this.conditions.length; i++)
//			if(query.equals(this.conditions[i]))
//				result = true;
//		return result;
//	}
//	
//	public boolean isMove(Vector<String> move){			//IS THIS MOVE VALID CHOOSE CASE
//		boolean result = false;
//		for(int i=0; i<this.moves.length; i++)
//			for(int j=0; j< move.size(); j++)
//				if(move.get(j).equals(this.moves[i]))
//					result = true;
//		return result;
//	}
//	
//	public boolean isMove(String move){
//		boolean result = false;
//		for(int i=0; i<this.moves.length; i++)
//			if(move.equals(this.moves[i]))
//				result = true;
//		return result;
//	}
//	
//	public boolean isFight(Vector<String> fight){		//IS THIS FIGHT VALID? CHOOSE CASE
//		boolean result = false;
//		for(int i=0; i<this.fights.length; i++)
//			for(int j=0; j< fight.size(); j++)
//				if(fight.get(j).equals(this.fights[i]))
//					result = true;
//		return result;
//	}
//	
//	public boolean isFight(String fight){
//		boolean result = false;
//		for(int i=0; i<this.fights.length; i++)
//			if(fight.equals(this.fights[i]))
//				result = true;
//		return result;
//	}
//	
//	public boolean checkValidity(){
//		boolean result = true;
//		String temp="";
//		if(!isCondition(this.condition))
//			result = false;
//		if(this.move.size()>1)			//IF YOU MORE THAN ONE MOVES (CHOOSE CASE)
//		{
//			if(!(isMove(this.move)))	//check if there are more than one moves for
//			{							//the same condition
//				if(isFight(this.move)){
//					if(isMove(this.fight)){
//						temp = this.move.get(0);
//						this.move = this.fight;
//						this.fight.set(0,temp);
//					}
//					else{
//						System.out.println("You use the same type of arguments in the "+this.condition+" command");
//						result = false;
//					}
//				}
//				else{
//					result = false;
//					System.out.println("Wrong argument in the "+this.condition +" command");
//				}
//			}
//		}
//		else
//			result = checkChooseValidity(this.fight);
//		if(this.move.size()>1)
//		{
//			if(!(isFight(this.fight)))
//			{
//				if(isMove(this.fight)){
//					if(isFight(this.move)){
//						temp = this.fight.get(0);
//						this.fight = this.move;
//						this.move.set(0, temp);
//					}
//					else{
//						System.out.println("You use the same type of arguments in the "+this.condition+" command");
//						result = false;
//					}
//				}
//				else{
//					result = false;
//					System.out.println("Wrong argument in the "+this.condition +" command");
//				}
//			}
//		}
//		else
//			result = checkChooseValidity(this.move);
//		
//		return result;
//	}
//	
//	boolean checkChooseValidity(Vector<String> elements){	//CHECK if choose elements are of the same type
//		boolean result = true;
//		String base = elements.get(0);
//		if(isMove(base)){
//			for(int i =1; i<elements.size(); i++)
//				if(!isMove(elements.get(i)))
//					result = false;
//		}
//		else if(isFight(base)){
//			for(int j=0; j< elements.size(); j++)
//				if(!isFight(elements.get(j)))
//					result = false;
//		}
//		else result = false;
//			
//		return result;
//	}

}