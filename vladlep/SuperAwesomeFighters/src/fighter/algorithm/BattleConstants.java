package fighter.algorithm;

public class BattleConstants {

	public static final int arenaLength = 100;
	public static final int arenaHeight = 50;
	public static final int defaulWalkTime = 1;

	public static final int farDistanceThreshold = 10;
	public static final int startingHealth = 100;
	public static final int stepSize = 1;
	public static final double unballacedThreash = 0.80;
	// much weaker and mmuch stronger percentage threashold
	// power_fighter1 < unballacedThreash * power_fighter2
	// => fighter1-much weaker , fighter2- much stronger
	public static final double veryUnballacedThreash = 0.5;
	public static final int leftFighterStartPositionX = 20;
	public static final int rightFighterStartPositionX = 80;
	public static final int groundPositionY = 25;

}
