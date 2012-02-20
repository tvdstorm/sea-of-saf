package main;

public class Config {

	public static final int MIN_STRENGTH = 1;
	public static final int MAX_STRENGTH = 10;
	public static final int DEFAULT_STRENGTH = 5;

	public static final int arenaLength = 100;
	public static final int startingHealth = 100;

	// much weaker and mmuch stronger percentage threashold
	// power_fighter1 < unballacedThreash * power_fighter2
	// => fighter1-much weaker , fighter2- much stronger
	public static final double veryUnballacedThreash = 0.5;
	public static final double unballacedThreash = 0.80;

	public static final int farDistanceThreshold = 10;
}
