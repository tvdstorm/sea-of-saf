package saf.ast;

import javax.xml.bind.annotation.*;

import saf.enums.*;

@XmlType(name = "action")
public class Action {
	
	@XmlAttribute
	private String value;

	public String getValue() {
		return value;
	}
	
	public boolean isAttack(Attack attack) {	
		if(getAttack() == null) return false;
		return attack.equals(getAttack());
	}
	
	public boolean isMove(Move move) {
		if(getMove() == null) return false;
		return move.equals(getMove());
	}
	
	public Attack getAttack() {
		for(Attack attack : saf.enums.Attack.values()) {
			if(attack.getText().equals(value)) return attack;
		}
		
		return null;
	}
	
	public Move getMove() {
		for(Move move : saf.enums.Move.values()) {
			if(move.getText().equals(value)) return move;
		}
		
		return null;
	}
}
