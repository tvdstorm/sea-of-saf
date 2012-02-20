package nl.tamasja.uva.saf;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.event.*;
import java.io.IOException;

public abstract class Buffer extends Applet implements Runnable
{

	private Image dbImage;
	private Graphics dbg;

	@Override
	public void init()
	{
		try
		{
			onInit();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dimension dim = getMaximumSize();
		this.setSize(640, 480);
		MediaTracker mt = new MediaTracker(this);

		try
		{
			mt.waitForID(0);
		} catch (InterruptedException ie)
		{
		}
	}

	@Override
	public void start()
	{

		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void stop()
	{

	}

	@Override
	public void destroy()
	{

	}

	@Override
	public void run()
	{

		// lower ThreadPriority
		this.requestFocusInWindow();
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

		while (true)
		{
			onUpdate();
			repaint();

			try
			{
				// Stop thread for 1 milliseconds
				Thread.sleep(20);
			} catch (InterruptedException ex)
			{
				// do nothing
			}

			// set ThreadPriority to maximum value
			Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		}
	}
	
	abstract void onUpdate();
	abstract void onInit() throws IOException;
	abstract void draw(Graphics g);
	
	@Override
	public void paint(Graphics g)
	{
		draw(g);
	}

	

	@Override
	public void update(Graphics g)
	{

		if (dbImage == null)
		{
			dbImage = createImage(this.getSize().width, this.getSize().height);
			dbg = dbImage.getGraphics();
		}

		dbg.setColor(getBackground());
		dbg.fillRect(0, 0, this.getSize().width, this.getSize().height);

		dbg.setColor(getForeground());
		paint(dbg);

		g.drawImage(dbImage, 0, 0, this);
	}

}