package saf.simulation;

public class Engine {
	
	private Arena arena;
	
	public Engine(Arena arena)
	{
		this.arena = arena;
	}
	
	public void start()
	{
		while(!arena.getLeftFighterState().fighterLost() && !arena.getRightFighterState().fighterLost())
		{
			new FighterAI().determineActions(arena.getLeftFighterState(), arena.getRightFighterState());
		}
		
		//Game Ends
	}
}
