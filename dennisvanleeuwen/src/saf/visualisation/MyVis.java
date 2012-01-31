//package saf.visualisation;
//
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//import javax.swing.JApplet;
//import javax.swing.JFrame;
//
//public class MyVis extends JApplet {
//	private float x,y;
//	
//	public MyVis(){
//		x = 50;
//		y = 50;
//	}
//	public void paint (Graphics g) {
//		//static float x = 0, y
//	    Graphics2D g2 = (Graphics2D) g;
//	    g2.clearRect( 0, 0, this.getWidth(), this.getHeight());
//	    SimpleFighter fighter = new SimpleFighter();
//		fighter.draw(g2, null, this.x, this.y);
//		this.x++;
//		this.y++;
//	}
// }