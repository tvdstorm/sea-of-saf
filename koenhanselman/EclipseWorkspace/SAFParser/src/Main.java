/* Create the AST, then invoke the interpreter */ 
import saf.interpret.Interpreter; 
import saf.parser.* ; 
import saf.lexer.* ; 
import saf.node.* ; 
  
import java.io.* ; 
  
public class Main { 
   public static void main(String[] args) { 
      if (args.length > 0) { 
         try { 
            /* Form the AST */ 
            Lexer lexer = new Lexer (new PushbackReader( 
               new FileReader(args[0]), 1024)); 
            Parser parser = new Parser(lexer); 
            Start ast = parser.parse() ; 
  
            /* Start the interpreter */ 
            Interpreter interp = new Interpreter () ; 
            ast.apply(interp) ; 
            System.out.println (ast) ;
         } 
         catch (Exception e) { 
            System.out.println (e) ; 
         } 
      } else { 
         System.err.println("usage: java simpleAdder inputFile"); 
         System.exit(1); 
      } 
   } 
}