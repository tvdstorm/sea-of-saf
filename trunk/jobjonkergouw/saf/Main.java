package saf;

//import org.antlr.RecognitionException;

import org.antlr.runtime.*;

import saf.syntax.*;
import saf.ast.nodes.*;
import saf.ast.Validator;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

import org.antlr.runtime.RecognitionException;

public class Main {
    private static String printRecognitionException(RecognitionException e) {
        return "Syntax error at: " + e.line + ":" + e.charPositionInLine + " for char " + (char)e.c;
    }
       
    private static Fighter getFighterTree(String source) throws RecognitionException {
        SAFLexer lexer = new SAFLexer(new ANTLRStringStream(source));
        SAFParser parser = new SAFParser(new CommonTokenStream(lexer));
        Fighter fighterTree = parser.fighter();   
        return fighterTree;
    }

    private static String readStringFromFile(String filePath) throws IOException{
        byte[] buffer = new byte[(int) new File(filePath).length()];
        BufferedInputStream f = new BufferedInputStream(new FileInputStream(filePath));
        f.read(buffer);
        f.close();
        return new String(buffer);
    }

    public static void main(String[] args) {
        String src = null;
        try {
            src = readStringFromFile("saf/tests/bad_everything.saf");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            java.lang.System.exit(1);
            //src = "testnaam { slaan = 5 trappen = 12 close and far [ choose(run walk_away stand) ] }";
        }
        
        Fighter fighterTree = null;
        try {
            fighterTree = getFighterTree(src);
        } catch (RecognitionException e) {
            System.out.println( printRecognitionException(e) );
            java.lang.System.exit(1);
        }
        System.out.println(fighterTree.printTree());
        
        Validator val = new Validator();
        val.visit(fighterTree);
        if ( val.isValid() ) {
        
        } else {
            System.out.println(val.messagesAsString());
        }
     }   
}