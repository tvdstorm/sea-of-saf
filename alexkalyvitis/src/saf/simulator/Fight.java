package saf.simulator;

import java.awt.*;
import java.awt.geom.Path2D;
import java.util.List;

import saf.ast.Fighter;

public class Fight {
	private Fighter firstFighter;
	private Fighter secondFighter;
	
	public Fight(List<Fighter> fighters){
		int firstFighterPosition = (int)((Math.random() * 10) % fighters.size() -1);
		firstFighter = fighters.get(firstFighterPosition);
		fighters.remove(firstFighterPosition);
		
		int secondFighterPosition = (int)((Math.random() * 10) % fighters.size() -1);
		secondFighter = fighters.get(secondFighterPosition);
		fighters.remove(secondFighterPosition);
	}
	
	public Fighter getFirstFighter(){ return firstFighter; }
	public Fighter getSecondFighter(){ return secondFighter; }
	
	public void nextAction(){
		
	}
	
//	public Shape drawState(){
//		// Draw stick figure
//		Shape s = new Path2D();
//		
//		s.drawOval(75, 125, 50, 75); // Head
//		s.drawLine(100, 200, 100, 300); // Body
//		s.drawLine(75, 225, 100, 225); // Left Arm
//		s.drawLine(125, 225, 100, 225); // Right Arm
//		s.drawLine(75, 350, 100, 300); // Left Leg
//		s.drawLine(125, 350, 100, 300); // Right Leg
//	}
}
