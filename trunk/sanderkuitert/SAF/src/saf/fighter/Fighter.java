package saf.fighter;


public interface Fighter {
	
	public final static double NEAR_ZONE_DISTANCE = 0.1;
	public final static double LITTLE_STRENGTH_DIFFERENCE = 1.0;
	public final static double MUCH_STRENGTH_DIFFERENCE = 5.0;
	
	public String getName();
	public double getRelativeSpeed(); 		//adjusts the frequency that act(...)  is called
	public double getRelativeStrength();	//determines strengthDifference status
	public ActionEffect act(double distance, double strengthDifference);

	
	public static class ActionEffect {
		public final String animationName;
		public final int physicalEffect;
		public final int range;
		
		/** 
		 * @param physicalEffect 	positive values mean damage to the other,
		 * 							negative values mean preventing damage to self */
		public ActionEffect(String animationName, int physicalEffect, int range) {
			this.animationName = animationName;
			this.physicalEffect = physicalEffect;
			this.range = range;
		}
	}
	
}
