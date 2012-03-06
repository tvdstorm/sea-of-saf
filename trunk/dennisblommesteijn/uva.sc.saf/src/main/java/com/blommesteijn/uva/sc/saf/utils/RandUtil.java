package com.blommesteijn.uva.sc.saf.utils;

import java.util.Random;

/**
 * 
 * @author dblommesteijn
 *
 */
public class RandUtil 
{
	public static int getRandom(int start, int size)
	{
		Random r = new Random();
		return start + r.nextInt(size);
	}
}
