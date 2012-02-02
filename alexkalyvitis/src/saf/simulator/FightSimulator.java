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
		
		long timeIsUp = new Date().getTime() + 30 * 100;
		
		while(true){
			fight.nextAction();
//			fight.delay();
//			g.fill(fight.drawState());
			
			if(fight.getFirstFighter().getHealth() <= 0 || fight.getSecondFighter().getHealth() <= 0 || new Date().getTime() >= timeIsUp){
				break;
			}
		}
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
