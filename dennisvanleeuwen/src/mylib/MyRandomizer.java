package mylib;

import java.util.Random;

public class MyRandomizer {
	static private final Random randomGenerator = new Random(923754773);
	
	static public int generateRandomNumber(){
		return randomGenerator.nextInt();
	}
	static public int generateRandomNumber(int max){
		return generateRandomNumber() % max;
	}
	static public int generateRandomNumber(int min, int max){
		return generateRandomNumber(max - min) + min;
	}
}
