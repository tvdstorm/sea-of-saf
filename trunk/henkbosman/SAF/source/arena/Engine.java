package arena;

import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import behaviours.Action;
import behaviours.Movement;

import fighter.Combatmove;
import fighter.Fighter;
import fighter.Property;
import fighter.Rules;

import parser.SAFLexer;
import parser.SAFParser;

public class Engine 
{
	public enum Fighters 	{	
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
		_fatigue=50;
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
	
	public boolean doMoves()
	{
		int distance = Math.abs(_fighterA.getPosition()-_fighterB.getPosition());
		Combatmove combatmoveA = _fighterA.performAction(distance, _fighterB.getHealth());
		Combatmove combatmoveB = _fighterB.performAction(distance, _fighterA.getHealth());
		_lastCombatmoveA = combatmoveA;
		_lastCombatmoveB = combatmoveB;
		
		_fighterA.doMove(combatmoveA, Fighters.FighterA);
		_fighterB.doMove(combatmoveB, Fighters.FighterB);
		
		while (_fighterA.getPosition()>=_fighterB.getPosition())
		{
			_fighterA.movePosition(-1);
			_fighterB.movePosition(1);
		}
		
		boolean a = _fighterA.getDamage(doDamage(_fighterB, combatmoveB, combatmoveA, distance));
		boolean b = _fighterB.getDamage(doDamage(_fighterA, combatmoveA, combatmoveB, distance));
		fatigue();
		
		return a||b;
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
	
	public Combatmove getCombatmove(Fighters fighter)
	{
		switch (fighter)
		{
			case FighterA:
				return _lastCombatmoveA;
			case FighterB:
				return _lastCombatmoveB;
		}
		return new Combatmove(Movement.Movements.stand, Action.Actions.nothing);
	}
	
	private int doDamage(Fighter f, Combatmove combatmoveA, Combatmove combatmoveB, int distance)
	{
		
		if (distance<=f.getPropertyValue(Property.Properties.punchReach))
		{
			switch (combatmoveA._action)
			{
				case punch_low:
					if (combatmoveB._action==Action.Actions.block_low || combatmoveB._movement == Movement.Movements.jump)
						return 0;
					else
						return f.getPropertyValue(Property.Properties.punchPower);
			case punch_high:
					if (combatmoveB._action==Action.Actions.block_high || combatmoveB._movement == Movement.Movements.crouch)
						return 0;
					else
						return f.getPropertyValue(Property.Properties.punchPower);
			}
		}
		if (distance<=f.getPropertyValue(Property.Properties.kickReach))
		{
			switch (combatmoveA._action)
			{
				case kick_low:
					if (combatmoveB._action==Action.Actions.block_low || combatmoveB._movement == Movement.Movements.jump)
						return 0;
					else
						return f.getPropertyValue(Property.Properties.kickPower);
				case kick_high:
					if (combatmoveB._action==Action.Actions.block_high || combatmoveB._movement == Movement.Movements.crouch)
						return 0;
					else
						return f.getPropertyValue(Property.Properties.kickPower);
			}
		}
		
		return 0;
	}
	
	public int getHealth(Fighters fighter)
	{
		switch (fighter)
		{
			case FighterA:
				return _fighterA.getHealth();
			case FighterB:
				return _fighterB.getHealth();
		}
		return 0;
	}
	
	public int getPosition(Fighters fighter)
	{
		switch (fighter)
		{
			case FighterA:
				return _fighterA.getPosition();
			case FighterB:
				return _fighterB.getPosition();
		}
		return 0;
	}
	
	public List<String> getErrors(Fighters fighter)
	{
		switch (fighter)
		{
			case FighterA:
				return _fighterA.getErrors();
			case FighterB:
				return _fighterB.getErrors();
		}
		
		return null;
	}
}
