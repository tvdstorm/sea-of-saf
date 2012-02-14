package saf.ast;

import javax.xml.bind.annotation.*;

import saf.variable.Options;

@XmlType(name = "action")
public abstract class Action implements Options {
	
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
