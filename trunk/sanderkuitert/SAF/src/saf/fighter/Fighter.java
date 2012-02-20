package saf.fighter;


public interface Fighter {
	
	public final static int TOTAL_HEALTH = 100; 			//attack damage is relative to this
	public final static double TOTAL_ARENA_WIDTH = 100.0; 	//all distances are relative to this
	public final static double NEAR_ZONE_DISTANCE = 10.0;
	public final static double LITTLE_STRENGTH_DIFFERENCE = 1.0;
	public final static double MUCH_STRENGTH_DIFFERENCE = 5.0;
	
	public String getName();
	public double getRelativeActSpeed(); 	//adjusts the frequency that act(...)  is called
	public double getRelativeStrength();	//determines strengthDifference status
	public ActionEffect act(double distance, double strengthDifference);

	
	public static class ActionEffect {
		public final String attackName;
		public final int attackDamage;
		public final int attackRange;
		public final String moveName;
		public final int moveFrames;
		public final double moveDistance;
		
		/**	 @param attackDamage 	negative values block damage to self  */ 
		public ActionEffect(String attackName, int attackDamage, int attackRange,
												String moveName, int moveFrames, double moveDistance) {
			this.attackName = attackName;
			this.attackDamage = attackDamage;
			this.attackRange = attackRange;
			this.moveName = moveName;
			this.moveFrames = moveFrames;
			this.moveDistance = moveDistance;
		}
	}
	
}
