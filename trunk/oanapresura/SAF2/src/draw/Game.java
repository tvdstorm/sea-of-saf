package draw;
import game.*;
import java.awt.*;


public class Game implements Runnable {
	
	Thread runner = null;
	private GameState gs;

	
	public Game(GameState gs) {
		this.gs = gs;
	}
	
	private void init() {
		
		StdDraw.setCanvasSize(800,450);
		StdDraw.setXscale(0,100);
		StdDraw.setYscale(0,100);
	}
	
    public void start() {

        // user visits the page, create a new thread

        if ( runner == null ) {

            runner = new Thread( this );
            runner.start();
        }
    }


    public void stop() {

        // user leaves the page, stop the thread

        if ( runner != null && runner.isAlive() )
            runner.stop();

        runner = null;
    }
	
    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    public void run() {
    	
    	init();

        while (runner != null) {

        	
            draw();
            gs.makeGameUpdate();           
            draw();
           
            try {

                Thread.sleep( 20 );

            } catch ( InterruptedException e ) {

                // do nothing
            }
        }
    }
    
	private void drawFighterLeft(){
		StdDraw.picture(gs.fighter1.position, 30, gs.fighter1.getCurrentPic());
		System.out.println("[drawFL]" + gs.fighter1.position);
		System.out.println("[drawFL]" + gs.fighter1.getCurrentPic());
	}
	
	private void drawFighterRight(){
		StdDraw.picture(gs.fighter2.position, 30, gs.fighter2.getCurrentPic());
		System.out.println("[drawFR]" + gs.fighter2.position);
	}
	
	private void drawBackground(){
		StdDraw.picture(50, 50, "pics/eco_background.png");
	}
	
	public void draw(){
							
		drawBackground();
		drawFighterLeft();
		drawFighterRight();
		StdDraw.show(700);
		
	}
	
	
}
