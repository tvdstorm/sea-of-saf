package game;


import java.util.ArrayList;
import java.util.List;

import objects.*;

public class Fight {
	private LeftFighter left;
	private RightFighter right;
	
	public Fight()
	{
		left=new LeftFighter();
		right=new RightFighter();
	}
	public Fight(List<Fighter> fighters)
	{
		this();
		left.setFighter(fighters.get(0));
		right.setFighter(fighters.get(1));
	}
	public void StartFight ()
	{
		
	}
	public void evaluateCondition()
	{
		ConditionsNames[] names = ConditionsNames.values();
		for(ConditionsNames name : names)
		{
			searchIfConditionTrue(name);
		}
		searchFighterRules(left);
		searchFighterRules(right);
		//Behavior bl=new Behavior(left.chooseRandomBehavior());
		//Behavior br=new Behavior(right.chooseRandomBehavior());
		
}
	public void searchIfConditionTrue(ConditionsNames conditionName)
	{
		switch (conditionName) {
				case stronger		:if((left.getStrLife()-right.getStrLife())>30){left.addCurrentConditions("stronger");right.addCurrentConditions("weaker");};break;
				case weaker		    :if((left.getStrLife()-right.getStrLife()<-10) && (left.getStrLife()-right.getStrLife()>-40)){left.addCurrentConditions("weaker");right.addCurrentConditions("stronger");};break;
				case much_stronger  :if(left.getStrLife()-right.getStrLife()>40){left.addCurrentConditions("much_stronger");right.addCurrentConditions("much_weaker");};break;
				case much_weaker	:if(left.getStrLife()-right.getStrLife()<-40){left.addCurrentConditions("much_weaker");right.addCurrentConditions("much_stronger");};break;
				case even			:if(left.getStrLife()-right.getStrLife()==0){left.addCurrentConditions("even");right.addCurrentConditions("even");};break;
				case near			:if(left.getLocationX()-right.getLocationX()<5){left.addCurrentConditions("near");right.addCurrentConditions("near");};break;
				case far			:if(left.getLocationX()-right.getLocationX()>5){left.addCurrentConditions("far");right.addCurrentConditions("far");};break;
				default				:left.addCurrentConditions("always");right.addCurrentConditions("always");break;
			}
		}

	public void searchFighterRules(BaseFighter f)
	{
		Fighter fighter=f.getFighter();
		for (Behavior behavior : fighter.getBehaviors())
		{		Condition c=behavior.getCondition();
		List<String> list=f.getCurrentConditions();
				if (c.eval(list))
				{
					f.addCurrentBehavior(behavior);
				}
		}				
	}
	
	public LeftFighter getLeftFighter()
	{
		return this.left;
	}
	
	public RightFighter getRightFighter()
	{
		return this.right;
	}


}
