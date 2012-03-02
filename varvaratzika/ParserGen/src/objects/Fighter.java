package objects;
import java.util.ArrayList;
import java.util.List;



public class Fighter{
	 private String fighterName;
	 private List<Strength> strengths;
     private List<Behavior> behaviors;
   
     public Fighter(String name)
     {
    	 this.fighterName = name;
    	 strengths = new ArrayList<Strength>();
    	 behaviors = new ArrayList<Behavior>();
     }
     public Fighter()
     {
    	 this("");
    	 
     }
     public void setFighterName(String fighter1)
     {
         this.fighterName = fighter1;
     }
     public void setStrengths (List<Strength> s)
     {
         this.strengths.addAll(s);
     }
     public List<Strength> getStrengths()
     {
         return strengths;
     }
     public void setBehavior(Behavior c)
     {
         this.behaviors.add(c);
     }
     public void setBehaviors(List<Behavior> b)
     {
         this.behaviors.addAll(b);
     }
     public String getFighterName()
     {
         return fighterName;
     }
     public List <Behavior> getBehaviors()
     {
         return behaviors;
     }
}

