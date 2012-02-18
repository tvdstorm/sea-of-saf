package visualization;
import java.util.ArrayList;
import java.util.List;

import objects.*;

public class visualize
{
	private ArrayList<Fighter> fighters=new ArrayList<Fighter>();
	private int distance;
	private int finish;
	Fighter left= this.fighters.get(0);
	Fighter right=this.fighters.get(1);
	
	public visualize()
	{
		this.distance=20;
		this.finish=0;
	}
	
	void fight()
	{	
		while(finish==0)
		{
			presentCondition(this.left,this.right);
			presentCondition(this.right,this.left);
		}
	}
	public Move presentCondition(Fighter f1,Fighter f2)
	{
		if (searchIfConditionTrue("near",f1,f2))
			draw(searchRules(f1,f2,"near"));
		else if (searchIfConditionTrue("much_stronger",f1,f2))
			draw(searchRules(f1,f2,"much_stronger"));
		else if (searchIfConditionTrue("stronger",f1,f2))
			draw(searchRules(f1,f2,"stronger"));
		else if (searchIfConditionTrue("even",f1,f2))
			draw(searchRules(f1,f2,"even"));
		else if (searchIfConditionTrue("weaker",f1,f2))
			draw(searchRules(f1,f2,"weaker"));
		return null;
	}
	
	public Condition searchRules(Fighter f,Fighter f2,String searchCondition)
	{
		
		for (Condition condition : f.getCondition())
		{
			if (condition.getConditionName().equals(searchCondition))
			{
				if(condition.getId()==0)
				{
					return condition;
				}
				else
				{
					for (Condition findAndCondition : f.getCondition())
					{
						if (findAndCondition.getId()==condition.getId())
						{
							if(searchIfConditionTrue(findAndCondition.getConditionName(),f,f2))
							{
								return condition;
							}							
						}
								
					}
				}
			}				
		}
		return null;
	}
	
	private boolean searchIfConditionTrue(String conditionName, Fighter f1, Fighter f2)
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
			  case near:return (f1.getLocation()-f2.getLocation()<5);
			  case far:return (f1.getLocation()-f2.getLocation()>5);
			  default: return false;
			  }
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);								
		}
		return false;
		
	}

	private void draw(Condition condition) {
		// TODO Auto-generated method stub
		
	}

	private int distance() {
		// TODO Auto-generated method stub
		return 0;
	}
		
				

}
