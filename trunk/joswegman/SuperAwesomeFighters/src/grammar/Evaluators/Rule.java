package grammar.Evaluators;

import grammar.Evaluators.InputRule;


public class Rule implements Visitable {
   private  final Conditions id;	
   private  final InputRule frule;
   private  final InputRule srule;

   public Rule(Conditions id, InputRule frule, InputRule srule) {
	this.id = id;
	this.frule = frule;
	this.srule = srule;
   }
   
   public  String toString () {
	   return "Rule: " + this.id + " " + this.frule.toString() + " "+ this.srule.toString();
   }

  @Override
  public void accept(BotVisit visitor) {
	  	visitor.visit(this);
  }
   
}
