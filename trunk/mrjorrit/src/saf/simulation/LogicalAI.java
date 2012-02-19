package saf.simulation;

import saf.structure.Logical;
import saf.structure.LogicalClause;
import saf.structure.LogicalSimple;


public class LogicalAI 
{
	private final static int farNearThreshold = 15;
	private final static int muchStrongerWeakerThreshold = 15;
	
	public static boolean computeLogical(FighterState fighterState, FighterState otherFighterState, Logical logical)
	{
		if(logical instanceof LogicalClause)
			return ((LogicalClause) logical).computeClause(
					computeLogical(fighterState, otherFighterState, ((LogicalClause) logical).getLeftHandSide()),
					computeLogical(fighterState, otherFighterState, ((LogicalClause) logical).getLeftHandSide()));
		
		switch(((LogicalSimple) logical).getCondition())
		{
			case always:
				return true;
			case near:
				if(Math.abs(fighterState.getFighterX() - otherFighterState.getFighterX()) <= farNearThreshold)
					return true;
				break;
			case far:
				if(Math.abs(fighterState.getFighterX() - otherFighterState.getFighterX()) > farNearThreshold)
					return true;
				break;
			case much_stronger:
				if((fighterState.getHealth() - otherFighterState.getHealth()) > muchStrongerWeakerThreshold)
					return true;
				break;
			case stronger:
				if(fighterState.getHealth() > otherFighterState.getHealth())
					return true;
				break;
			case even:
				if(fighterState.getHealth() == otherFighterState.getHealth())
					return true;
				break;
			case weaker:
				if(fighterState.getHealth() < otherFighterState.getHealth())
					return true;
				break;
			case much_weaker:
				if((otherFighterState.getHealth() - fighterState.getHealth()) > muchStrongerWeakerThreshold)
					return true;
				break;
		}
		return false;
	}
}
