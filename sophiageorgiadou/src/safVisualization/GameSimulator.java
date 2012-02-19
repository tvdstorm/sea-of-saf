package safVisualization;

public class GameSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdDraw.setCanvasSize(800, 600);
		StdDraw.setXscale(0, 10.0);
		StdDraw.setYscale(0, 10.0);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledSquare(0, 0, 20.0);
		
		FighterVisualization f1=new FighterVisualization(3.0,1,"Roger",30);		
		FighterVisualization f2=new FighterVisualization(3.0,2,"Rafa",42);
		
		f1.drawFighter();
		f2.drawFighter();
			
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.text(1, 9.0, f1.getName());
		
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.text(9.0, 9.0, f2.getName());
		
		// display and pause for 20 ms
		StdDraw.show(1000);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledSquare(0, 0, 20.0);
		
//		f1.block(FighterVisualization.LOW);
//		f2.block(FighterVisualization.HIGH);
		f1.moveUpDown(FighterVisualization.CROUCH);
		f2.moveUpDown(FighterVisualization.JUMP);
		f1.drawFighter();
		f2.drawFighter();
		// display and pause for 20 ms
		StdDraw.show(20);
		
		
	}

}
