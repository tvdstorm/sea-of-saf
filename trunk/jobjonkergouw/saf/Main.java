package saf;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import syntax.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Test");
        String src = "true && (false || true && (true || false))";
        SAFLexer = new SAFLexer(new ANTLRStringStream(src));
//         ASTDemoParser parser = new ASTDemoParser(new CommonTokenStream(lexer));
//         CommonTree tree = (CommonTree)parser.parse().getTree();
//         DOTTreeGenerator gen = new DOTTreeGenerator();
//         StringTemplate st = gen.toDOT(tree);
//         System.out.println(st);

        
        
    }
}