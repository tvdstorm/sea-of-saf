package nl.uva.lap.saf.arena;

import javax.swing.JOptionPane;

public class Arena
{
	private void initializeWindow()
	{
		StdDraw.setTitle("Super Awesome Fighters");
		StdDraw.setCanvasSize(1280, 720);
		StdDraw.setXscale(0, 100.0);
		StdDraw.setYscale(0, 100.0);
	}

	private void reset()
	{
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledSquare(0, 0, 100.0);
	}

	public void display()
	{
		initializeWindow();
		double x = 20.0;
		while(true)
		{
			reset();
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(10.0, 10.0, "test");
			StdDraw.picture(50.0, 50.0, "recourses/sprites/dojo.png");
			StdDraw.picture(x, 11.0, "recourses/sprites/blue/stand.gif");
			StdDraw.pictureFlipped(80.0, 11.0, "recourses/sprites/green/low_kick.png");
			StdDraw.show(20);
			x += 0.5;
		}
	}
	
	public static void main(String[] args)
	{
		Arena a = new Arena();
		a.display();
	}
}
