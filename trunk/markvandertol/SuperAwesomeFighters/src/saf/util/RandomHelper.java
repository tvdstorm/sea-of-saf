package saf.util;

import java.util.List;
import java.util.Random;

public class RandomHelper {
	private static Random random = new Random();
	
	public static <T> T getElementFromList(List<T> list) {
		if (list.size() == 0)
			return null;
		return list.get(random.nextInt(list.size()));
	}

}
