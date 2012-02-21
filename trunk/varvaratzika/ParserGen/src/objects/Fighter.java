package objects;
import java.util.ArrayList;
import java.util.List;



public class Fighter{
	 private String fighterName = new String();
	 private List<Strength> strengths = new ArrayList<Strength>();
     private List<Condition> condition = new ArrayList<Condition>();
     private double weight=0.0;
     private double height=0.0;
     private double speed=0.0;
     private int locationX=15;
     private int locationY=200;
     private int life=100;
     private Condition currentCondition=new Condition();
     private int lifeStr=100;
	 private boolean IsLeft;
   
     public Fighter(String name)
     {
    	 this.fighterName = name;
     }
     public Fighter()
     {}
     
     public void setFighterName(String fighter1)
     {
         this.fighterName = fighter1;
     }
     public void setStrength (Strength s)
     {
         this.strengths.add(s);
     }
     public void setCondition(Condition c)
     {
         this.condition.add(c);
     }
     public void setConditions(ArrayList <Condition> c)
     {
         this.condition.addAll(c);
     }
     public String getFighterName()
     {
         return fighterName;
     }
     public List <Strength> getStrength()
     {
         return strengths;
     }
     public List <Condition> getCondition()
     {
         return condition;
     }
     public void setWeight(double w)
     {
    		 this.weight=w;
     }
     public void setHeight(double h)
     {
    		 this.height=h;
     }
     public void setSpeed(double s)
     {
    		 this.speed=s;
     }
     public void setCurrentCondition(Condition c)
     {
    	 this.currentCondition=c;
     }

     public Condition getCurrentCondition()
     {
    	 return this.currentCondition;
     }

	public int getStrLife() {
		// TODO Auto-generated method stub
		return this.lifeStr;
	}
	public int getLocationX()
	{
		return this.locationX;
	}
	public int getLocationY()
	{
		return this.locationY;
	}

	public void setLocation(int x,int y) 
	{
		this.locationX=x;
		this.locationY=y;
	}
	public void setIsLeft(boolean b) {
		this.IsLeft=b;
	}	
	
	
}

