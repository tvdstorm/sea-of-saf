package main;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import game.controller.FightController;
import game.controller.MainController;
import graphic.ArenaFrame;
import graphic.GameGraphicController;

import java.io.*;
import java.util.ArrayList;
import Parser.*;
import model.*;
import util.*;
import alert.*;

	public class Main  {
	    public static void main(String[] args) throws Exception {
	    	
//	    			InputStream inputStream = new FileInputStream("D:/SAF/workspace/SC12/data/jackie.saf");
//	    			ANTLRInputStream input = new ANTLRInputStream(inputStream);
//	    	        safLexer lexer = new safLexer(input);
//	    	        CommonTokenStream tokens = new CommonTokenStream(lexer);
//	    	        safParser parser = new safParser(tokens);
//	    	        safParser.fighter_return result = parser.fighter();
//	    	        Tree t = (Tree)result.getTree();
//	    	        for(int i=0; i < t.getChildCount(); i++){
//	    	        	System.out.println("Tree child " + i + " : " + t.getChild(i).toString());
//	    	        }
//	    	        final Fighter f = result.fighter;
	    			
	    			FighterCompiler fc = new FighterCompiler();
	    			
	    			FileInputStream fighterLeftFile = new FileInputStream("D:/Dropbox/Dropbox/Software Construction/workspace/SC12/data/heman.saf");
	    			FileInputStream fighterRightFile = new FileInputStream("D:/Dropbox/Dropbox/Software Construction/workspace/SC12/data/skeletor.saf");
	    			
	    			final Fighter fighterLeft = fc.compileFighter(fighterLeftFile);
	    			final Fighter fighterRight = fc.compileFighter(fighterRightFile);
	    	
	    	        VisitorController vc = new VisitorController();
	    	        VisitorController vc1 = new VisitorController();
	    	        
	    	        ArrayList<Alert> alert = vc.checker(fighterLeft);
	    	        ArrayList<Alert> alert1 = vc1.checker(fighterRight);
	    	        
	    	        for (int i=0; i < alert.size();i++){
	    	        	System.out.println("Alert found: "+alert.get(i).getAlert());
	    	        }
	    	        
	    	        for (int i=0; i < alert1.size();i++){
	    	        	System.out.println("Alert found: "+ alert1.get(i).getAlert());
	    	        }
	    	        
	    	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	    	            public void run() {
	    	            	//MainController mc = new MainController(fighterLeft, fighterRight);
	    	            	FightController mc = new FightController(fighterLeft, fighterRight);
	    	            	try {
								mc.startFight();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	    	            }
	    	        });
	    	          	        
	    }
}
