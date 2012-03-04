package arena;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import behaviours.Action.EnumActions;
import behaviours.Movement.EnumMovements;

import fighter.Combatmove;
import fighter.Fighter;
import fighter.Property.EnumProperties;
import fighter.Rules;

import parser.SAFLexer;
import parser.SAFParser;

public class Engine 
{
	public enum EnumFighters 	{	
		FighterA, FighterB
	}
	
	private Fighter _fighterA;
	private Fighter _fighterB;
	
	private Combatmove _lastCombatmoveA;
	private Combatmove _lastCombatmoveB;
	private int _fatigue;
	
	public Engine(String filea, String fileb) throws IOException, RecognitionException
	{
		_fighterA = loadFighter(filea);
		_fighterB = loadFighter(fileb);
		_fighterA.movePosition(20);
		_fighterB.movePosition(360);
		_fatigue=100;
	}
	
	private Fighter loadFighter(String file) throws IOException, RecognitionException
	{
		ANTLRFileStream fstream = new ANTLRFileStream(file);
		SAFLexer lexer = new SAFLexer(fstream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream); 
		Fighter fighter = parser.fighter();
		Rules rules = new Rules(1,10,50);
		fighter.setRules(rules);
		
		return fighter;
	}
	
	public void doMoves()
	{
		int distance = Math.abs(_fighterA.getPosition()-_fighterB.getPosition());
		_lastCombatmoveA = _fighterA.performAction(distance, _fighterB.getHealth());
		_lastCombatmoveB = _fighterB.performAction(distance, _fighterA.getHealth());
		
		_fighterA.doMove(_lastCombatmoveA, EnumFighters.FighterA);
		_fighterB.doMove(_lastCombatmoveB, EnumFighters.FighterB);
		
		while (_fighterA.getPosition()>=_fighterB.getPosition())
		{
			_fighterA.movePosition(-1);
			_fighterB.movePosition(1);
		}
		
		_fighterA.getDamage(doDamage(_fighterB, _lastCombatmoveB, _lastCombatmoveA, distance));
		_fighterB.getDamage(doDamage(_fighterA, _lastCombatmoveA, _lastCombatmoveB, distance));
		fatigue();
	}
	
	private void fatigue()
	{
		if (_fatigue>0)
		{
			_fatigue-=1;
		}
		else
		{
			_fighterA.getDamage(1);
			_fighterB.getDamage(1);
		}
	}
	
	public Combatmove getCombatmove(EnumFighters fighter)
	{
		switch (fighter)
		{
			case FighterA:
				return _lastCombatmoveA;
			case FighterB:
				return _lastCombatmoveB;
			default:
				return new Combatmove(EnumMovements.stand, EnumActions.nothing);
		}
	}
	
	private int doDamage(Fighter f, Combatmove combatmoveA, Combatmove combatmoveB, int distance)
	{
		if (distance<=f.getPropertyValue(EnumProperties.punchReach))
		{
			switch (combatmoveA.getAction())
			{
				case punch_low:
					if (combatmoveB.getAction()==EnumActions.block_low || combatmoveB.getMovement() == EnumMovements.jump)
						return 0;
					else
						return f.getPropertyValue(EnumProperties.punchPower);
				case punch_high:
					if (combatmoveB.getAction()==EnumActions.block_high || combatmoveB.getMovement() == EnumMovements.crouch)
						return 0;
					else
						return f.getPropertyValue(EnumProperties.punchPower);
			}
		}
		if (distance<=f.getPropertyValue(EnumProperties.kickReach))
		{
			switch (combatmoveA.getAction())
			{
				case kick_low:
					if (combatmoveB.getAction()==EnumActions.block_low || combatmoveB.getMovement() == EnumMovements.jump)
						return 0;
					else
						return f.getPropertyValue(EnumProperties.kickPower);
				case kick_high:
					if (combatmoveB.getAction()==EnumActions.block_high || combatmoveB.getMovement() == EnumMovements.crouch)
						return 0;
					else
						return f.getPropertyValue(EnumProperties.kickPower);
			}
		}
		
		return 0;
	}
	
	public int getHealth(EnumFighters fighter)
	{
		switch (fighter)
		{
			case FighterA:
				return _fighterA.getHealth();
			case FighterB:
				return _fighterB.getHealth();
			default:
				return 0;
		}
	}
	
	public int getPosition(EnumFighters fighter)
	{
		switch (fighter)
		{
			case FighterA:
				return _fighterA.getPosition();
			case FighterB:
				return _fighterB.getPosition();
			default:
				return 0;
		}
	}
	
	public List<String> getErrors(EnumFighters fighter)
	{
		switch (fighter)
		{
			case FighterA:
				return _fighterA.getErrors();
			case FighterB:
				return _fighterB.getErrors();
			default:
				return new LinkedList<String>();
		}
	}
}
