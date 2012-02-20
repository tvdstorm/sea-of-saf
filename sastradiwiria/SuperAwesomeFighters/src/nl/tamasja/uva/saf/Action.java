package nl.tamasja.uva.saf;

import java.util.Timer;
import java.util.TimerTask;

public abstract class Action extends Thread
{

	abstract void perform();
	long timeGap;
	boolean going = true;

	public Action(long gapMillisecconds)
	{
		timeGap = gapMillisecconds;
	}
	
	@Override
	public void run()
	{
		long pastTime = System.currentTimeMillis();
		while (going)
		{
			long currentTime = System.currentTimeMillis();
			
			if (currentTime - pastTime > timeGap)
			{
				perform();
				pastTime = System.currentTimeMillis();
			}

		}
	}
	
	public void halt()
	{
		going = false;
	}

}

/*
public class Test
{

	
	public static void main(String[] args)
	{
		Action action = new Action(1000)
		{
			@Override
			public void perform()
			{
				System.out.println("HEYO");
			}
		};
		
		action.start();

	}

}

*/