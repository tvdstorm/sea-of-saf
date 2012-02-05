package saf.ast;

import java.util.*;
import saf.checker.*;
import Game.Interpreter;

/**
 * The Behaviour class represents the Behaviour node in the Fighter AST.
 * 
 * @author huyhoang
 *
 */
public class Behaviour implements Statement
{
	private Statement condition;
	private Statement move;	
	private Statement attack;
	
	public Statement getCondition() {
		return this.condition;
	}
	
	public Function getMove() {
		return (Function)this.move;
	}
	
	public Function getAttack() {
		return (Function)this.attack;
	}
	
	// condition = expression
	public Behaviour(Statement condition, Statement move, Statement attack)
	{
		this.condition = condition;
		this.move = move;
		this.attack = attack;
	}

	@Override
	public void accept(FighterVisitor visitor)
	{
		visitor.visit(this);
	}
}
