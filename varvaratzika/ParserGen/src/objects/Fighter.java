package objects;

import java.util.ArrayList;



public class Fighter {
	 private String fighterName = new String();
	 private ArrayList<Strength> strengths = new ArrayList<Strength>();
     private ArrayList<Condition> condition = new ArrayList<Condition>();
   
   
     
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
     public String getFighterName()
     {
         return fighterName;
     }
     public ArrayList<Strength> getStrength()
     {
         return strengths;
     }
     public ArrayList<Condition> getCondition()
     {
         return condition;
     }
}
