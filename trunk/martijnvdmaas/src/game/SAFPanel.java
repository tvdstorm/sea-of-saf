// "Java Tech"
//  Code provided with book for educational purposes only.
//  No warranty or guarantee implied.
//  This code freely available. No copyright claimed.
//  2003
//
//

// Begun with StartJApplet6

/*
 <applet code="Drop2DApplet.class" width=300 height=300>
 </applet>
 */

package game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

import elements.Bot;
import elements.Bots;



public class SAFPanel extends JPanel {
	
	private Graphics2D graphics;
	private Bot leftBot;
	private Bot rightBot;
	
	private final int HEIGHT = 500;
	private final int WIDTH = 250;
	
	public void paint(Graphics g) {
		graphics = (Graphics2D) g;
		graphics.clearRect(0,  0 , WIDTH, HEIGHT);

		updateGraphic(leftBot, graphics, 0);
		
	}

	public void updateGraphic(Bot opponent, Graphics2D drawing, int distance) {
		Shape circle = new Ellipse2D.Float(100.0f + distance, 100.0f, 100.0f, 100.0f);

		drawing.drawString(leftBot.getBotName(), 120 + distance, 150);
		drawing.draw(circle);
		drawing.drawLine(150 + distance,200,150 + distance,300); //spine
		drawing.drawLine(150 + distance,300,100 + distance,350); //left foot
		drawing.drawLine(150 + distance,300,200 + distance,350); //right foot
		drawing.drawLine(150 + distance,230,110 + distance,230); //left arm
		drawing.drawLine(150 + distance,230,190 + distance,230); //right arm
	}

	public SAFPanel(Bots fightOpponents) {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		leftBot = fightOpponents.getFirstBot();
		rightBot = fightOpponents.getSecondBot();
	}
}