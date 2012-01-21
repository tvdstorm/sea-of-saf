import java.util.ArrayList;


public class Fighter {
	 private ArrayList<Strengths> Strength = new ArrayList<Strengths>();
     private ArrayList<Conditions> Condition = new ArrayList<Conditions>();
     private String FighterName = new String();
     
     public void setFighterName(String FighterName)
     {
         this.FighterName = FighterName;
     }
     public void setStrength(ArrayList<Strengths> Strength)
     {
         this.Strength = Strength;
     }
     public void setFighterName(ArrayList<Conditions> Condition)
     {
         this.Condition = Condition;
     }
     public String getFighterName()
     {
         return FighterName;
     }
     public ArrayList<Strengths> setStrength()
     {
         return Strength;
     }
     public ArrayList<Conditions> setFighterName()
     {
         return Condition;
     }
}
