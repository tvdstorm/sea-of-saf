package grammar.Evaluators;

import java.util.LinkedList;
import java.util.List;

import grammar.Evaluators.InputRule;


public class Rule implements Visitable {
   private  final List <Condition> conditionList = new LinkedList<Condition>();	
   private InputRule frule;
   private InputRule mrule;

   public Rule(){
	   this.frule = null;
	   this.mrule = null;
   }
   
   public InputRule getFightRule(){
	   return frule;
   }
   
   public InputRule getMoveRule(){
	   return mrule;
   }

   public void setInputFRule(InputRule f) {
	  this.frule = f;
   }

   public void setInputMRule(InputRule m) {
	  this.mrule = m;
   }

   public void addCondition(Condition c){
	   this.conditionList.add(c);
   }
   
   public List<Condition> getConditionList() {
	   return this.conditionList;
   }
   
   @Override
   public void accept(BotVisit visitor) {
	  	visitor.visit(this);
   }

  
   @Override
   public String toString() {
	  return "Rule [conditionList=" + conditionList + ", frule=" + frule
  			+ ", mrule=" + mrule + "]";
   }   
}
