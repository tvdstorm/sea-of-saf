package main;

import java.io.*;

import org.antlr.runtime.*;

import lexer.*;
import saf.*;
import checker.*;
import graphics.*;
import config.*;

public class Fight {	
    public static void main(String[] args) throws Exception {
    	Saf s1 = createFighter(settings.PLAYER1_FILE);
    	Saf s2 = createFighter(settings.PLAYER2_FILE);
    	
    	if (s1 != null && s2 != null)
    		doGraphics(s1, s2);
    }
    
    public static Saf createFighter(String file) {
    	Saf s = loadFighter(file);
    	if (s != null)
    		s.accept(new SafVisitorCheck());
    	return s;
    }
    
    private static void doGraphics(Saf s1, Saf s2) {
    	GraphicsFrame gFrame = new GraphicsFrame(settings.SCREEN_TITLE);
    	Sprite fighter_sprite = new Sprite();
        gFrame.setPanel(new GraphicsPanel(fighter_sprite, s1, s2));
    }
    
    private static Saf loadFighter(String file) {
    	try {
    		ANTLRFileStream fs;
			fs = new ANTLRFileStream(file);
			
			safLexer lex = new safLexer(fs);
	    	
	    	TokenRewriteStream tokens = new TokenRewriteStream(lex);
	    	safParser grammar = new safParser(tokens);
	    	
	    	return grammar.saf();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (RecognitionException e) {
			e.printStackTrace();
			System.exit(1);
		}
    	return null;  
    }
}
