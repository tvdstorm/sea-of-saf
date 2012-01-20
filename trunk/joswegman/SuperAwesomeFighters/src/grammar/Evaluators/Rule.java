package grammar.Evaluators;

import grammar.Evaluators.InputRule;


public class Rule {
   InputRule item1;
   InputRule item2;

   public Rule(InputRule item1, InputRule item2) {
	super();
	this.item1 = item1;
	this.item2 = item2;
   }
   
   public void toString (String value) {
	   System.out.println(value);
   }
   
}
