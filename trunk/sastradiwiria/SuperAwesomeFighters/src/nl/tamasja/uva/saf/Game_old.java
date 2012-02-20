package nl.tamasja.uva.saf;

import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.graphics.DrawFighter;

public class Game_old extends JFrame {
	public int x = 50;
	
	
	
	DrawFighter fb1;
	DrawFighter fb2;
	Timer timer;
	
	FighterBot f1;
	FighterBot f2;
	
	Arena arena;
	
	public Game_old() {
		
		//setDoubleBuffering(true);
		//setDoubleBuffered(true);
		//timer = new Timer();
		
		arena = new Arena(100,100,20);
		//IFighterGraphics fg1 = new DrawFighter(100, 100,false);
		
		Test t = new Test();
		f1 = t.Fighter1();
		f2 = t.Fighter2();
		
		//f1.position = 10;
		//f2.position = 12;
		
		f1.SetEnemyFighter(f2);
		f2.SetEnemyFighter(f1);
		
		
		arena.addFighter(f1,10);
		arena.addFighter(f2,20);

		//arena.sortFighters();
	
		
		setLayout( null );
		
		

		

		
		//fb1 = new DrawFighter(100,100,false);
		//fb2 = new DrawFighter(500,100,true);

	    timer = new Timer();
	    timer.schedule(new GameStep(), 0,200);
	    
    	//close
	    /*
		addWindowListener (new WindowAdapter () {
			 public void windowClosing (WindowEvent e) {
				 dispose();
				 System.exit(0);
			 }
		});
		*/
   	 	//window properties
        setSize (1500, 750);
       // setTitle ("Super Awesome Fighters");
        setVisible(true);		
	}
	
	public void paint(Graphics g)
	{
		//fb1.draw(g);
		//fb2.draw(g);
		
		//f1.draw(g);
		//f2.draw(g);
		
		arena.draw(g);
	}
	
	class GameStep extends TimerTask {

		@Override
		public void run() {
			//System.out.println("derp");
			//fb1.move(10);
			//fb2.move(10);
			//repaint();
			
			//f1.act();
			//f2.act();
			//repaint();
			
			arena.fightStep();
			//update(g);
			repaint();
			
		}
	}

	
}
