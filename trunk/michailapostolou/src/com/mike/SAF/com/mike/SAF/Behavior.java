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

}