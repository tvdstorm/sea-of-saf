package nl.tamasja.uva.saf;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;

import nl.tamasja.uva.saf.fighter.FighterBot;

public class Arena {

	
	private int steps = 100;
	
	private ArrayList<FighterBot> fighters;
	
	private boolean runGame = true;
	
	public Arena(int steps) {
		fighters = new ArrayList<FighterBot>();
		
		this.steps = steps;
		
	}
	
	public void addFighter(FighterBot fighter, int position) {
		fighter.setPosition(position);
		fighter.setMaxPosition(steps);
		fighters.add(fighter);
	}
	
	public void fightStep() {
		
		for(FighterBot fighterBot : fighters) {
			fighterBot.act();
			if(fighterBot.isKnockOut() == true) runGame = false;
		}
	}
	
	public boolean gameRunning() {
		return runGame;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(30, 340, 30+steps*60, 5);
		g.fillRect(30, 140, 5, 200);
		g.fillRect(55+steps*60, 140, 5, 200);
		for(FighterBot fighterBot : fighters) {
			fighterBot.draw(g);
		}
		
		
	}
	
	public ArrayList<FighterBot> sort(ArrayList<FighterBot> list)
	  {
	    double[] speeds = new double[list.size()];
	    for(int x = 0; x < list.size(); x++)
	    {
	      speeds[x] = list.get(x).getSpeed();
	    }
	    
	    Arrays.sort(speeds);
	    
	    ArrayList<FighterBot> newList = new ArrayList<FighterBot>();
	    
	    for(FighterBot b : list)
	    {
	      for(double d : speeds)
	      {
	        if(b.getSpeed() == d)
	        {
	          newList.add(b);
	        }
	      }
	    }
	    
	    list = newList;
	    return list;
	  }
}
