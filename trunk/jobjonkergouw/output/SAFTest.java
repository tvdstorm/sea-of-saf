import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import java.io.*;
import java.util.*;

public class SAFTest {
    public static void printTree(CommonTree t, int indent) {
        if ( t != null ) {
            StringBuffer sb = new StringBuffer(indent);
            for ( int i = 0; i < indent; i++ )
                sb = sb.append("   ");
            for ( int i = 0; i < t.getChildCount(); i++ ) {
                System.out.println(sb.toString() + t.getChild(i).toString());
                printTree((CommonTree)t.getChild(i), indent+1);
            }
        }
    }


    public static void main(String[] args) throws Exception {
        String src = "chicken {" + 
                     "kickReach  = 9" + 
                     "punchReach = 10" + 
                     "kickPower  = 1" + 
                     "punchPower = 10" + 
                     "far [run_towards choose (kick_low punch_high)]" + 
                     "near and much_stronger[choose(run_away stand) kick_low]" + 
                     "near or far [crouch punch_low]" + 
                     "}";
        SAFLexer lexer = new SAFLexer(new ANTLRStringStream(src));
        SAFParser parser = new SAFParser(new CommonTokenStream(lexer));
        CommonTree tree = (CommonTree)(parser.fighter().getTree());
        //DOTTreeGenerator gen = new DOTTreeGenerator();
        //StringTemplate st = gen.toDOT(tree);
        //System.out.println(st);
        printTree(tree, 4);
    }
    
    
}
