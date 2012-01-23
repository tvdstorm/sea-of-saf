package grammar.Evaluators;

import grammar.Evaluators.InputRule;


public class Rule {
   String id;	
   InputRule item1;
   InputRule item2;

   public Rule(String id, InputRule item1, InputRule item2) {
	super();
	this.id = id;
	this.item1 = item1;
	this.item2 = item2;
   }
   
   public  String toString () {
	   return "Rule: " + this.id + " " + this.item1.toString() + " "+ this.item2.toString();
   }
   
}
