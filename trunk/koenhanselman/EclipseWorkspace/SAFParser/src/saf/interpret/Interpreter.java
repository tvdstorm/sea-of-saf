/* The interpreter for the SAF language */ 
package saf.interpret; 
  
import saf.node.* ; 
import saf.analysis.* ; 
import java.lang.System; 
  
public class Interpreter extends DepthFirstAdapter { 
  
   public void caseAProgram(AProgram node) { 
      //String lhs = node.getLeft().getText().trim(); 
      //String rhs = node.getRight().getText().trim(); 
      //int result = (new Integer(lhs)).intValue() + (new Integer(rhs)).intValue(); 
      //System.out.println(lhs + "+" + rhs + "=" + result); 
   } 
}