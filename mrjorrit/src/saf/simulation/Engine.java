package saf.simulation;

public class Engine {
	
	private Arena arena;
	
	public Engine(Arena arena)
	{
		this.arena = arena;
	}
	
	public void start()
	{
		FighterState left = arena.getLeftFighterState();
		FighterState right = arena.getRightFighterState();
		
		while(!left.fighterLost() && !right.fighterLost())
		{
			FighterAI.determineAction(left, right);
			FighterAI.determineAction(right, left);
			
			FighterAI.performAction(left, right);
			FighterAI.performAction(right, left);
			
			left.incrementStep();
			right.incrementStep();
			wait(1);
		}
		
		//Game Ends
	}
	
	public void wait (int n){
        
        long t0, t1;

        t0 =  System.currentTimeMillis();

        do{
            t1 = System.currentTimeMillis();
        }
        while ((t1 - t0) < (n * 10));
    }
}
