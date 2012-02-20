package nl.tamasja.uva.saf;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import nl.tamasja.uva.saf.fighter.FighterBot;

public class Arena {
	
	private int xOffset;
	private int yOffset;
	
	private int steps = 100;
	//private int height = 300;
	
	private ArrayList<FighterBot> fighters;
	
	public Arena(int xOffset, int yOffset, int steps) {
		fighters = new ArrayList<FighterBot>();
		
		this.xOffset = xOffset;
		this.yOffset = yOffset;
		
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
		}
		
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
	
	public void sortFighters() {
		/*
		double x = 1.0;
		
        Collections.sort(fighters, new Comparator(){
        	 
            public int compare(Object o1, Object o2) {
            	FighterBot f1 = (FighterBot) o1;
            	FighterBot f2 = (FighterBot) o2;
              // return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
            	
            	return f1.getSpeed().compareTo(f1.getSpeed());
            	
            }
 
        });		
		*/
		
		System.out.println(fighters);
		fighters = sort(fighters);
		System.out.println(fighters);
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
