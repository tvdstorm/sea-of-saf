package game;

import java.util.ArrayList;
import java.util.List;

import objects.Behavior;
import objects.ConditionsNames;
import objects.Fighter;

public class LeftFighter extends BaseFighter{
	private Fighter f;
	private int locationX;
	private int locationY;
	private Behavior currentBehavior;
	private double weight;
	private double height;
	private double speed;
	private int lifeStr;
	private int life;
	private List<Behavior> trueBehaviors;
	private List<String> currentConditionName;
	
	
	 public LeftFighter()
	{
		//f=new Fighter();
		weight=0.0;
		height=0.0;
		speed=0.0;
		lifeStr=100;
		life=100;
		currentConditionName=new ArrayList<String>();
		trueBehaviors=new ArrayList<Behavior>();
	}
	 public void addCurrentBehavior(Behavior b)
     {
    	 this.trueBehaviors.add(b);
     }
	 public List<Behavior> getCurrentBehavior() {
			return trueBehaviors;
		}
	 public int getLocationY()
	 {
		return this.locationY;
	 }
	 public int getLocationX()
	 {
		return this.locationX;
	 }
	 public void setLocation(int x,int y) 
	 {
		this.locationX=x;
		this.locationY=y;
	 }
	 public int getStrLife() {
		// TODO Auto-generated method stub
		return this.lifeStr;
	}
	 public void addCurrentConditions(String c) {
		currentConditionName.add(c);	
	 }
	 public List<String> getCurrentConditions() {
		return currentConditionName;
	 }
	 public void printCurrent()
	 {
		System.out.println(this.currentConditionName);
	 }
	 public void setFighter(Fighter fighter)
	 {
		this.f = fighter;
	 }
	 public Fighter getFighter()
	 {return this.f;}
	 public Behavior chooseRandomBehavior() {
	    	int count=0;
	    	int flag=0;
	    	int i=(int) (Math.random() *10);
	    	while(flag==0)
	    	{
	    		for (Behavior behavior :trueBehaviors)
	    		{
	    			if(i==count)
	    			{
	    				flag=1;
	    				return behavior;
	    				}
	    			else count+=1;
	    			}
	    		}
	    	
			return null;
		}
}