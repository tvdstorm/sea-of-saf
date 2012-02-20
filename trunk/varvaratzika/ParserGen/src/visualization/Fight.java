package visualization;
import java.util.ArrayList;

import objects.*;

public class Fight {
	
	public void initScreen(){
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(0, 10.0);
        StdDraw.setYscale(0, 10.0);
        repaint();
}

	private void repaint() {
		StdDraw.setPenColor(StdDraw.PINK);
        StdDraw.filledSquare(0, 0, 20.0);
	}
	
	 public void simulate(ArrayList<Fighter> fighters) 
	 {
         initScreen();
       //  p1.drawFighter();
        // p2.drawFighter();
         repaint();
         StdDraw.setPenColor(StdDraw.MAGENTA);
         StdDraw.text(1, 9.0,"f1");
         StdDraw.text(9.0, 9.0,"f2");
         //p1.drawFighter();
         //p2.drawFighter();
         repaint();
         StdDraw.setPenColor(StdDraw.MAGENTA);
         StdDraw.show(300);
      }

}
