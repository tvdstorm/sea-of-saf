package saf;

//import org.antlr.RecognitionException;

import org.antlr.runtime.*;

import saf.syntax.*;
import saf.ast.nodes.*;
import saf.ast.*;
import saf.game.*;


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
    
    
    private static Bot getBotFromFile(String filePath) {
        String source = null;
        try {
            source = readStringFromFile(filePath);
        } catch (IOException e) {
        	ErrorHandler.exitWithException(e);
        }
        
        Fighter fighterTree = null;
        try {
            fighterTree = getFighterTree(source);
        } catch (RecognitionException e) {
        	ErrorHandler.exitWithException(e);
        }
        //System.out.println(fighterTree.printTree());
              
        Validator val = new Validator();
        if ( val.isValid(fighterTree) ) {
            BotCompiler compiler = new BotCompiler();
            Bot bot = compiler.compileBot(fighterTree);
            return bot;
        } else {
            ErrorHandler.exitWithString( val.messagesAsString());
            return null;		// never happens
        }        
    }

    public static void main(String[] args) {

        Bot bot1 = getBotFromFile("src/saf/tests/geneticFighter.saf");
        Bot bot2 = getBotFromFile("src/saf/tests/jackieChan.saf");
        
        
        
        System.out.println( bot1.botSummaryAsString() );
        System.out.println( bot2.botSummaryAsString() );
        
        Game game = new Game(bot1, bot2);
        game.runGUI();  

     }   
}