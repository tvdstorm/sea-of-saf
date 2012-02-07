package ast;

import javax.xml.bind.annotation.*;

import enums.*;

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
		return move.equals(getMove());
	}
	
	public Attack getAttack() {
		for(Attack attack : enums.Attack.values()) {
			if(attack.getText().equals(value)) return attack;
		}
		
		return null;
	}
	
	public Move getMove() {
		for(Move move : enums.Move.values()) {
			if(move.getText().equals(value)) return move;
		}
		
		return null;
	}
}
