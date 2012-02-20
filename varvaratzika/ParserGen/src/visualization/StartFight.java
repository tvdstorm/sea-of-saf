package visualization;
import objects.*;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.swing.JFrame;

import objects.AttacksNames;
import objects.Condition;
import objects.ConditionNames;
import objects.Fighter;
import objects.Move;



public class StartFight
{
	private boolean isLeft=false;
	Fighter left= new Fighter();
	Fighter right=new Fighter();
	private int finish=0;
	private Condition c = new Condition();
	private Animations animation=new Animations();
    
    public void startGame(ArrayList<Fighter> fighters)
    {
    	this.left= fighters.get(0);
    	this.right=fighters.get(1);
    	animation.Initialize();
    	try
    	{   		
    		while(finish==0)
    		{
    			//this.isLeft=true;
    			//animation.drawFile(presentCondition(this.left,this.right), left.getLocationX(),left.getLocationY());
    			//this.isLeft=false;
    			//animation.drawFile(presentCondition(this.right,this.left), right.getLocationX(),right.getLocationY());    			
    		}
    		        
       	}
    	catch(Exception e)
    	{
    		System.err.println(e.getMessage());
    		e.printStackTrace();
    	}
               
  }
   
    
    public File presentCondition(Fighter f1,Fighter f2)
	{
		if (searchIfConditionTrue("near",f1,f2))
		{
			c = searchFighterRules(f1,f2,"near");
			updateLocation(c.getMovesName());
			return updateImageFile(c.getAttacksName());
		}
		else if (searchIfConditionTrue("much_stronger",f1,f2))
		{
			c = searchFighterRules(f1,f2,"much_stronger");
			updateLocation(c.getMovesName());
			return updateImageFile(c.getAttacksName());
		}
		else if (searchIfConditionTrue("stronger",f1,f2))
		{
			c = searchFighterRules(f1,f2,"stronger");
			updateLocation(c.getMovesName());
			return updateImageFile(c.getAttacksName());
		}
		else if (searchIfConditionTrue("even",f1,f2))
		{
			c = searchFighterRules(f1,f2,"even");
			updateLocation(c.getMovesName());
			return updateImageFile(c.getAttacksName());
		}
		else if (searchIfConditionTrue("weaker",f1,f2))
		{
			c = searchFighterRules(f1,f2,"weaker");
			updateLocation(c.getMovesName());
			return updateImageFile(c.getAttacksName());
		}
		else 
		{
			c = searchFighterRules(f1,f2,"always");
			updateLocation(c.getMovesName());
			return updateImageFile(c.getAttacksName());
		}	
	}
	
	public Condition searchFighterRules(Fighter f,Fighter f2,String searchCondition)
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


	public File updateImageFile(String attacksName)
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
		return path;
	}

	
	public void updateLocation(String movesName) {
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



