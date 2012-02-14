package saf.ast;

import javax.xml.bind.annotation.*;

import saf.variable.IEnums;

@XmlType(name = "action")
public abstract class Action implements IEnums {
	
	@XmlAttribute
	private String value;

	public String getValue() {
		return value;
	}
	
	public abstract boolean isAttack(Attack attack);
	
	public abstract boolean isMove(Move move);
	
	public abstract Attack getAttack();
	
	public abstract Move getMove();
}
