package visualization;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import objects.Condition;
import objects.ConditionNames;
import objects.Fighter;
import objects.Move;



public class Fight
{
	private boolean isLeft=false;
	private Fighter leftFighter= new Fighter();
	private Fighter rightFighter=new Fighter();
	private int finish=0;
	private Condition c = new Condition();
	private ArrayList<Condition> trueConditionsF1 = new ArrayList<Condition>();
	private Animations animation=new Animations();
    
    public void startGame(ArrayList<Fighter> fighters) throws IOException
    {
    	this.leftFighter= fighters.get(0);
    	leftFighter.setIsLeft(true);
    	this.rightFighter=fighters.get(1);
    
    	rightFighter.setIsLeft(false);

    	animation.Initialize();
    	try
    	{   		
    		while(finish==0)
    		{
    			isLeft=true;
    			evaluateCondition(leftFighter,rightFighter);
				chooseRandomCondition();
				leftFighter.setCurrentCondition(c);
    			animation.refreshFrame(leftFighter,rightFighter);
    			isLeft=true;
    			evaluateCondition(rightFighter,leftFighter);
    			chooseRandomCondition();
				rightFighter.setCurrentCondition(c);
    			animation.refreshFrame(leftFighter,rightFighter);
    			}    
       	}
    	catch(Exception e)
    	{
    		System.err.println(e.getMessage());
    		e.printStackTrace();
    	}
     }
   
    
    public void chooseRandomCondition() {
    	int count=0;
    	int i=(int) (Math.random() *10);
		for (Condition condition : trueConditionsF1)
		{
			if(i==count)
				c=condition;
			else count+=1;
		}
	}


	public void evaluateCondition(Fighter f1,Fighter f2)
	{
		if (searchIfConditionTrue("near",f1,f2))
		{
			searchFighterRules(f1,f2,"near");
		}
		if (searchIfConditionTrue("much_stronger",f1,f2))
		{
			searchFighterRules(f1,f2,"much_stronger");
		}
		if (searchIfConditionTrue("stronger",f1,f2))
		{
			searchFighterRules(f1,f2,"stronger");
		}
		if (searchIfConditionTrue("even",f1,f2))
		{
			searchFighterRules(f1,f2,"even");
		}
		if (searchIfConditionTrue("weaker",f1,f2))
		{
			searchFighterRules(f1,f2,"weaker");
		}
		else 
		{
			searchFighterRules(f1,f2,"always");
		}
		//updateLocation(c.getMovesName());
		//return updateImageFile(c.getAttacksName());
	}
	
	public void searchFighterRules(Fighter f,Fighter f2,String searchCondition)
	{
		trueConditionsF1= new ArrayList<Condition>();
		for (Condition condition : f.getCondition())
		{
			if (condition.getConditionName().equals(searchCondition))
			{
				if(condition.getId()==0)
				{
					trueConditionsF1.add(condition);
				}
				else
				{
					for (Condition findAndCondition : f.getCondition())
					{
						if (findAndCondition.getId()==condition.getId())
						{
							if(searchIfConditionTrue(findAndCondition.getConditionName(),f,f2))
							{
								trueConditionsF1.add(condition);
							}	
						}
					}
				}
			}				
		}
	}
	
	public boolean searchIfConditionTrue(String conditionName, Fighter f1, Fighter f2)
	{
		try
		{
			ConditionNames currCondition=ConditionNames.valueOf(conditionName);
			switch (currCondition) {
			  case stronger:return (f1.getStrLife()-f2.getStrLife()>30);
			  case weaker:return (f1.getStrLife()-f2.getStrLife()<-10) && (f1.getStrLife()-f2.getStrLife()>-40);
			  case much_stronger:return (f1.getStrLife()-f2.getStrLife()>40);
			  case much_weaker:return (f1.getStrLife()-f2.getStrLife()<-40);
			  case even:return (f1.getStrLife()-f2.getStrLife()==0);
			  case near:return (f1.getLocationX()-f2.getLocationX()<5);
			  case far:return (f1.getLocationX()-f2.getLocationX()>5);
			  default: return false;
			  }
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);								
		}
		return false;
		
	}

	
	public void updateLocation(String movesName) {
		Move currMove=Move.valueOf(movesName);
		if(this.isLeft)
		{
			switch (currMove)
			{	
				case jump:leftFighter.setLocation(leftFighter.getLocationX(),200);
				case crouch:leftFighter.setLocation(leftFighter.getLocationX(),400);
				case stand:leftFighter.setLocation(leftFighter.getLocationX(),300);
				case run_away:leftFighter.setLocation(10,400);
				case walk_towards:leftFighter.setLocation(300,300);
				case walk_away:leftFighter.setLocation(10,400);
				default:leftFighter.setLocation(10,300);
			 }
		}
		else
		{
			switch (currMove)
			{	
				case jump:rightFighter.setLocation(rightFighter.getLocationX(),200);
				case crouch:rightFighter.setLocation(rightFighter.getLocationX(),400);
				case stand:rightFighter.setLocation(rightFighter.getLocationX(),400);
				case run_away:rightFighter.setLocation(400,400);
				case walk_towards:rightFighter.setLocation(350,300);
				case walk_away:rightFighter.setLocation(400,400);
				default:rightFighter.setLocation(400,400);
			 }
		}
	}

}



