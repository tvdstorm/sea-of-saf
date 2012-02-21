package com.mike.SAF;

import game.Game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.runtime.ANTLRFileStream;
import com.mike.SAF.Attribute;


public class SAFcompiler {

	/**
	 * @param args
	 * @throws RecognitionException 
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws RecognitionException, IOException, InterruptedException {
		String fileName = args[0];		
		String outputDotFN = fileName.substring(0,fileName.length()-4)+".dot";
		ANTLRFileStream charStream = new ANTLRFileStream(fileName);
//		CharStream charStream = new ANTLRStringStream("JackieChan{\nkickPower = 7\npunchPower = 5\nkickReach = 3\npunchReach = 9\nfar[run_towards punch_high]\nnear[choose(stand crouch) kick_high]\nmuch_stronger[walk_towards punch_low]\nweaker[run_away choose(block_high block_low)]\nalways[walk_towards block_high]}");
		SAFgrammarLexer lexer = new SAFgrammarLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFgrammarParser parser = new SAFgrammarParser(tokenStream);
		SAFgrammarParser.program_return result = parser.program();
		Game game = result.g;
		if(parser.compileSuccesful())
			game.start();
		else
			parser.printErrors();
		Tree botTrees = (Tree) result.getTree();
//		
//		Vector<Bot> bots = new Vector<Bot>();
//		
//		for(int j=0; j<botTrees.getChildCount(); j++)		//GET BOT TREES
//		{
//			Tree t = botTrees.getChild(j);
//			String botName = t.getText();		//GET BOTNAME
//			String[] botCharacter = new String[t.getChildCount()];
//			Vector<Tree> personalityTrees = new Vector<Tree>();	//VECTOR OF PERSONALITY TREES
//			Vector<Behavior> behaviors = new Vector<Behavior>();
//			System.out.println(t.getChildCount());
//			for(int i=0; i< t.getChildCount(); i++){
//				botCharacter[i] = t.getChild(i).getText();
//				if(botCharacter[i].equals("CHARACTERISTIC")){
//						personalityTrees.add(t.getChild(i));	//ADD TO PERSONALITY TREE
//				}
//				else if (botCharacter[i].equals("BEHAVIOUR"))	//ADD TO BEHAVIOR TREE
//				{
//					Behavior b = new Behavior(t.getChild(i));
//					b.checkConsistency();
//					behaviors.add(b);
//				}
//			}
//			Attribute personality = new Attribute(personalityTrees);	//CREATE PERSONALITY OBJECT
//			if(personality.checkConcistency()){
//				personality.loadValues();
//				System.out.println("Personality composed correctly");
//				bots.add(new Bot(botName, personality, behaviors));
//			}
//			else
//				System.out.println("Error in Personality attributes");
//		}
		DOTTreeGenerator gen = new DOTTreeGenerator();
        System.out.println("    Producing AST dot (graphviz) file");
		StringTemplate st = gen.toDOT(botTrees, new CommonTreeAdaptor());
		FileWriter outputStream = new FileWriter(outputDotFN);
        outputStream.write(st.toString());
        outputStream.close();
//        String[] cmd = {"/usr/bin/dot","-Tpng","-o",outputName,source};
//        Process pr = Runtime.getRuntime().exec(cmd);
		System.out.println("done!");
		
	}
	
	
}