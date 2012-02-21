package saf.fighter;


public interface PassiveFighter {
	
	public String getName();
	public double getRelativeActSpeed();
	public double getRelativeStrength();
	public ActionEffect selectAction(double distance, double strengthDifference);

	
	public static class ActionEffect {
		
		public final String attackName;
		public final int attackDamage; 		/** Negative values block damage to self	*/
		public final double attackRange;	/** As percentage of the total space		*/
		public final String moveName;		
		public final double moveDistance;	/** As percentage of the total space 		*/
		

		public ActionEffect(String attackName, int attackDamage, double attackRange,
													String moveName, double moveDistance) {
			this.attackName = attackName;
			this.attackDamage = attackDamage;
			this.attackRange = attackRange;
			this.moveName = moveName;
			this.moveDistance = moveDistance;
		}
		
	}
	
}
