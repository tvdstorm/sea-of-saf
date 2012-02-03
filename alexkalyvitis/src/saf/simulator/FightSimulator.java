package saf.simulator;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.List;

import saf.ast.*;

public class FightSimulator extends Frame{
	private static final long serialVersionUID = 1L;
	private Fight fight;
	
	public FightSimulator(List<Fighter> fighters){
		fight = new Fight(fighters);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(WindowEvent winEvt) {
		        System.exit(0); 
		    }
		});
	}
	
	public void windowClosing(WindowEvent e) {
		this.dispose();
    }
	
	public void paint(Graphics graphic)
    {
		Graphics2D g = (Graphics2D) graphic;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g.setStroke(new BasicStroke(2));
		
//		// stand_still
//		g.drawOval(75, 125, 50, 75); // Head
//		g.drawLine(100, 200, 100, 300); // Body
//		g.drawLine(75, 225, 100, 225); // Left Arm
//		g.drawLine(125, 225, 100, 225); // Right Arm
//		g.drawLine(75, 350, 100, 300); // Left Leg
//		g.drawLine(125, 350, 100, 300); // Right Leg
//		
//		// punch_high
//		g.drawOval(75, 125, 50, 75); // Head
//		g.drawLine(100, 200, 100, 300); // Body
//		g.drawLine(75, 250, 100, 225); // Left Arm
//		g.drawLine(75, 250, 75, 275); // Left Arm
//		g.drawLine(75, 275, 100, 250); // Left Arm
//		g.drawLine(100, 225, 150, 175); // Right Arm
//		g.drawLine(75, 350, 100, 300); // Left Leg
//		g.drawLine(125, 350, 100, 300); // Right Leg
//		
//		// punch_low
//		g.drawOval(75, 125, 50, 75); // Head
//		g.drawLine(100, 200, 100, 300); // Body
//		g.drawLine(75, 200, 100, 225); // Left Arm
//		g.drawLine(75, 200, 75, 225); // Left Arm
//		g.drawLine(75, 225, 100, 250); // Left Arm
//		g.drawLine(100, 225, 150, 275); // Right Arm
//		g.drawLine(75, 350, 100, 300); // Left Leg
//		g.drawLine(125, 350, 100, 300); // Right Leg
		
//		// kick_high
//		g.drawOval(75, 125, 50, 75); // Head
//		g.drawLine(100, 200, 100, 300); // Body
//		g.drawLine(75, 225, 100, 225); // Left Arm
//		g.drawLine(125, 225, 100, 225); // Right Arm
//		g.drawLine(75, 325, 100, 300); // Left Leg
//		g.drawLine(75, 325, 75, 350); // Left Leg
//		g.drawLine(75, 350, 100, 325); // Left Leg
//		g.drawLine(150, 250, 100, 300); // Right Leg
		
		// kick_low
		g.drawOval(75, 125, 50, 75); // Head
		g.drawLine(100, 200, 100, 300); // Body
		g.drawLine(75, 225, 100, 225); // Left Arm
		g.drawLine(125, 225, 100, 225); // Right Arm
		g.drawLine(75, 300, 100, 300); // Left Leg
		g.drawLine(75, 300, 75, 325); // Left Leg
		g.drawLine(75, 325, 100, 325); // Left Leg
		g.drawLine(150, 300, 100, 300); // Right Leg
		
//		while(true){
//			fight.nextAction();
//			fight.delay();
//			g.fill(fight.drawState());
//			
//			if(fight.getFirstFighter().getHealth() <= 0 || fight.getSecondFighter().getHealth() <= 0 || new Date().getTime() >= timeIsUp){
//				break;
//			}
//		}
    }
	
	public void Simulate(){
		System.out.println("Simulating...");
		// TODO Simulate
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setTitle(fight.getFirstFighter().getName() + " VS " + fight.getSecondFighter().getName());
	    this.setSize(640,400);
	    
	    int x = (dim.width - this.getSize().width)/2;
		int y = (dim.height - this.getSize().height)/2;
		this.setLocation(x,y);
	    
		this.setVisible(true);
		
		System.out.println("Simulating Finished");
	}
}
