import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Engine 
{
	private Fighter _fighterA;
	private Fighter _fighterB;
	private int _posFighterA;
	private int _posFighterB;
	
	private Combatmove _lastCombatmoveA;
	private Combatmove _lastCombatmoveB;
	
	public Engine(String filea, String fileb) throws IOException, RecognitionException
	{
		_fighterA = loadFighter(filea);
		_fighterB = loadFighter(fileb);
		_posFighterA=180;
		_posFighterB=220;
	}
	
	private Fighter loadFighter(String file) throws IOException, RecognitionException
	{
		ANTLRFileStream fstream = new ANTLRFileStream(file);
		SAFLexer lexer = new SAFLexer(fstream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream); 
		Fighter fighter = parser.fighter();
		Rules rules = new Rules(10,10,10,50);
		fighter.setRules(rules);
		
		return fighter;
	}
	
	public boolean doMoves()
	{
		int distance = Math.abs(_posFighterA-_posFighterB);
		Combatmove combatmoveA = _fighterA.performAction(distance, _fighterB.getHealth());
		Combatmove combatmoveB = _fighterB.performAction(distance, _fighterA.getHealth());

		_posFighterA+=_fighterA.doMove(combatmoveA);
		_posFighterB+=_fighterB.doMove(combatmoveB);
		if (_posFighterA>=_posFighterB)
		{
			_posFighterB=_posFighterA+1;
		}
		if (_posFighterB>=_posFighterA)
		{
			_posFighterA=_posFighterB+1;
		}
		
		boolean a = _fighterA.getDamage(doDamage(_fighterB, combatmoveB, combatmoveA, distance));
		boolean b = _fighterB.getDamage(doDamage(_fighterA, combatmoveA, combatmoveB, distance));
		System.out.println("PA:"+_posFighterA+" PB:"+_posFighterB+" Distance: "+distance);
		System.out.println("Fighter A: "+combatmoveA._movement+" "+combatmoveA._action);
		System.out.println("Fighter B: "+combatmoveB._movement+" "+combatmoveB._action);
		
		_lastCombatmoveA = combatmoveA;
		_lastCombatmoveB = combatmoveB;
		
		return a||b;

	}
	
	public Combatmove getCombatmove(int fighter)
	{
		switch (fighter)
		{
			case 1:
				return _lastCombatmoveA;
			case 2:
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
	
	public int getHealth(int fighter)
	{
		switch (fighter)
		{
			case 1:
				return _fighterA.getHealth();
			case 2:
				return _fighterB.getHealth();
		}
		return 0;
	}
	
	public int getPosition(int fighter)
	{
		switch (fighter)
		{
			case 1:
				return _posFighterA;
			case 2:
				return _posFighterB;
		}
		return 0;
	}
}
