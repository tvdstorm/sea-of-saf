package game;

import java.awt.*;
import java.util.*;
import java.applet.*;
import java.net.*;

public class Main extends Applet implements Runnable{

	private Fighter one, two;
	private Thread th;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void start ()
	{		
		th = new Thread (this);
		th.start ();
	}

	public void stop ()
	{
		th.stop();
	}
	
	public void run ()
	{
	
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

		while (true)
		{
	/*		if (player.getLives() >= 0 && !isStoped)
			{
				redball.move();
				blueball.move();
			}
	*/
			repaint();

			try
			{
	
				Thread.sleep (1000);
			}
			catch (InterruptedException ex)
			{
				// do nothing
			}

			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		}
	}
}
