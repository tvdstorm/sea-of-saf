package game;

import java.util.ArrayList;
import java.util.List;

import objects.AttacksNames;
import objects.Behavior;
import objects.Fighter;
import objects.Move;
import objects.MovesNames;

public class LeftFighter extends BaseFighter{
	private Fighter f;
	private int locationX;
	private int locationY;
	private Behavior currentBehavior;
	private int life;
	private List<Behavior> trueBehaviors;
	private List<String> currentConditionName;
	
	
	 public LeftFighter()
	{
		f=new Fighter();
		life=200;
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
	 
	 public int getLife() 
	 {
		return this.life;
	}
	 public void setLife(int decresedValue)
	 {
		 this.life= ((this.getLife())-decresedValue);
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
	    				this.currentBehavior=behavior;
	    				return behavior;
	    				}
	    			else count+=1;
	    			}
	    		}
	    	
			return null;
		}
	 public boolean isLeft() {return true;}
	 public void updateLife(RightFighter opponent)
		{
			Behavior b=this.currentBehavior;
			String a=b.getAttack().getAttackName();
			int decreaseLife=0;
		
			try
			{
				AttacksNames currAttack=AttacksNames.valueOf(a);
				switch (currAttack)
				{	
					case punch_low:decreaseLife=this.f.getStrengthFromList("punchPower");break;
					case punch_high:decreaseLife=this.f.getStrengthFromList("punchPower");;break;
					case kick_low:decreaseLife=this.f.getStrengthFromList("kickPower");;break;
					case kick_high:decreaseLife=this.f.getStrengthFromList("kickPower");;break;
					default:decreaseLife=0;break;
				}
				opponent.setLife(decreaseLife);
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	 public void updateLocation(LeftFighter f)
		{
			Behavior b=f.chooseRandomBehavior();
			Move m=b.getMove();
			try
			{
				MovesNames currMove=MovesNames.valueOf(m.getMoveName());
				switch (currMove)
				{	
					case jump:f.setLocation(f.getLocationX(),40);break;
					case crouch:f.setLocation(f.getLocationX(),15);break;
					case stand:f.setLocation(f.getLocationX(),15);break;
					case run_away:f.setLocation(15,15);break;
					case walk_towards:f.setLocation(40,15);break;
					case walk_away:f.setLocation(15,15);break;
					default:f.setLocation(15,15);break;
				 }
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	
}