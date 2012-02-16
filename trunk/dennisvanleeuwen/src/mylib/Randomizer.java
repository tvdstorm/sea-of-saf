package mylib;

import java.util.Calendar;
import java.util.Random;

/* Returns only random positive numbers! */
public class Randomizer {
	static private final Random getRandomGenerator(){
		Calendar calendar = Calendar.getInstance();
		java.util.Date now = calendar.getTime();
		return new Random(now.getTime());
	}
	
	static public int generateRandomNumber(){
		return Math.abs(getRandomGenerator().nextInt());
	}
	static public int generateRandomNumber(int max){
		return generateRandomNumber() % max;
	}
	static public int generateRandomNumber(int min, int max){
		return generateRandomNumber(max - min) + min;
	}
}
