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
    	draw();

        while (runner != null) {
        	  
        	
            gs.makeGameUpdate();   
            System.out.println(gs.fighter1.getHealth() + "    " + gs.fighter2.getHealth());
            draw();
           
            try {

                Thread.sleep( 100 );

            } catch ( InterruptedException e ) {

                // do nothing
            }
        }
    }
    
	private void drawFighterLeft(){
		StdDraw.picture(gs.fighter1.getPosition(), 30, gs.fighter1.getCurrentPic());
		System.out.println("[drawFL]" + gs.fighter1.getPosition());
		System.out.println("[drawFL]" + gs.fighter1.getCurrentPic());		
	}
	
	private void drawFighterRight(){
		StdDraw.picture(gs.fighter2.getPosition(), 30, gs.fighter2.getCurrentPic());
		System.out.println("[drawFR]" + gs.fighter2.getPosition());
		System.out.println("[drawFR]" + gs.fighter2.getCurrentPic());		
	}
	
	private void drawBackground(){
		StdDraw.picture(50, 50, "pics/eco_background.png");
	}
	
	private void drawHealth(){
		StdDraw.setFont(StdDraw.getHealthFont());
		StdDraw.setPenColor(Color.DARK_GRAY);
		StdDraw.text(50, 100, "[L HEALTH]: " + gs.fighter1.getHealth() + "    " + "[R HEALTH]: " + gs.fighter2.getHealth());
	}
	public void draw(){
							
		drawBackground();
		drawFighterLeft();
		drawFighterRight();
		drawHealth();
		if (!( (gs.fighter1.getHealth() > 0) && (gs.fighter2.getHealth() > 0))){
    		StdDraw.setFont(StdDraw.getDefaultFont());
			StdDraw.setPenColor(Color.BLUE);			
    		if (gs.fighter1.getHealth() > 0){        			
    			StdDraw.text(50, 60, "Left side wins!");
    		}	
    		else{
    			StdDraw.text(50, 60, "Right side wins!");
    		}
    		runner = null;    		
    	}
		StdDraw.show(800);
		
	}
	
	
}
