package mylib;

import java.util.Calendar;
import java.util.Random;

/* Returns only random positive numbers! */
public class Randomizer {
	private static final Random getRandomGenerator(){
		Calendar calendar = Calendar.getInstance();
		java.util.Date now = calendar.getTime();
		return new Random(now.getTime());
	}
	
	public static int generateRandomNumber(){
		return Math.abs(getRandomGenerator().nextInt());
	}
	public static int generateRandomNumber(int max){
		return generateRandomNumber() % max;
	}
	public static int generateRandomNumber(int min, int max){
		return generateRandomNumber(max - min) + min;
	}
}
