package grammar.Evaluators;

import grammar.Evaluators.InputRule;


public class Rule implements Visitable {
   private  final Condition id;	
   private  final InputRule frule;
   private  final InputRule mrule;

   public Rule(Condition id, InputRule frule, InputRule mrule) {
	this.id = id;
	this.frule = frule;
	this.mrule = mrule;
   }
   
   public InputRule getRule (boolean firstRule) {
	   if (firstRule) {
		   return this.frule;
	   } else {
		   return this.mrule;
	   }
   }
   
   public Condition getCondition () {
	   return this.id;
   }
   
   public  String toString () {
	   return "Rule: " + this.id + " " + this.frule.toString() + " "+ this.mrule.toString();
   }

  @Override
  public void accept(BotVisit visitor) {
	  	visitor.visit(this);
  }
   
}
