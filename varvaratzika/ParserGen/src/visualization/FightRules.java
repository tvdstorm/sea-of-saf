package visualization;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import objects.*;

public class FightRules
{
	private ArrayList<Fighter> fighters=new ArrayList<Fighter>();
	private int distance;
	private int finish;
	private boolean isLeft=false;
	Fighter left= this.fighters.get(0);
	Fighter right=this.fighters.get(1);
	
	public FightRules(ArrayList f)
	{
		this.fighters=f;
	}
	public FightRules()
	{
		this.distance=20;
		this.finish=0;
	}
	
	public void fight()
	{	
		while(finish==0)
		{
			this.isLeft=true;
			presentCondition(this.left,this.right);
			this.isLeft=false;
			presentCondition(this.right,this.left);
			
		}
	}
	public void presentCondition(Fighter f1,Fighter f2)
	{
		if (searchIfConditionTrue("near",f1,f2))
			searchRules(f1,f2,"near");
		else if (searchIfConditionTrue("much_stronger",f1,f2))
			draw(searchRules(f1,f2,"much_stronger"));
		else if (searchIfConditionTrue("stronger",f1,f2))
			draw(searchRules(f1,f2,"stronger"));
		else if (searchIfConditionTrue("even",f1,f2))
			draw(searchRules(f1,f2,"even"));
		else if (searchIfConditionTrue("weaker",f1,f2))
			draw(searchRules(f1,f2,"weaker"));
	
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

	private void draw(Condition condition) 
	{
		drawMove(condition.getMovesName());
		drawAttack(condition.getAttacksName());
	}

	private File drawAttack(String attacksName)
	{
		AttacksNames currAttack=AttacksNames.valueOf(attacksName);
		String p=new String();
		if(this.isLeft)
		{
			switch (currAttack)
			{	
				case punch_low:p=".\\src\\images\\LeftPunchLow.gif";
				case punch_high:p=".\\src\\images\\LeftPunchHigh.gif";
				case kick_low:p=".\\src\\images\\LeftKickLow.gif";
				case kick_high:p=".\\src\\images\\LeftKickHigh.gif";
				case block_low:p=".\\src\\images\\LeftBlockLow.gif";
				case block_high:p=".\\src\\images\\LeftBlockHigh.gif";
				default:p=".\\src\\images\\LeftFighter.gif";
			 }
		}
		else
		{
			switch (currAttack)
			{	
				case punch_low:p=".\\src\\images\\RightPunchLow.gif";
				case punch_high:p=".\\src\\images\\RightPunchHigh.gif";
				case kick_low:p=".\\src\\images\\RightKickLow.gif";
				case kick_high:p=".\\src\\images\\RightKickHigh.gif";
				case block_low:p=".\\src\\images\\RightBlockLow.gif";
				case block_high:p=".\\src\\images\\RightBlockHigh.gif";
				default:p=".\\src\\images\\RightFighter.gif";
			 }			
		}
		File path=new File(p);
		StartFight strF=new StartFight();
		strF.drawFile(path);
		return path;
	}

	
	private void drawMove(String movesName) {
		Move currMove=Move.valueOf(movesName);
		if(this.isLeft)
		{
			switch (currMove)
			{	
				case jump:left.setLocation(0,5);
				case crouch:left.setLocation(0,-2);
				case stand:left.setLocation(0,0);
				case run_away:left.setLocation(-10,0);
				case walk_towards:left.setLocation(5,0);
				case walk_away:left.setLocation(-5,0);
				default:left.setLocation(0,0);
			 }
		}
		else
		{
			switch (currMove)
			{	
				case jump:right.setLocation(0,5);
				case crouch:right.setLocation(0,-2);
				case stand:right.setLocation(0,0);
				case run_away:right.setLocation(10,0);
				case walk_towards:right.setLocation(-5,0);
				case walk_away:right.setLocation(5,0);
				default:right.setLocation(0,0);
			 }
		}
		
		
	}			

}
