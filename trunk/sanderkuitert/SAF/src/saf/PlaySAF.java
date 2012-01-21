package saf;

import java.io.ByteArrayInputStream;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import saf.arena.*;
import saf.fighter.*;


public class PlaySAF {
	
	public static void main(String[] args) throws Exception{
		System.out.println("-=[Started]=-");//DEBUG
		
        String arg1 = args.length>0 ? args[0] : null;
        String arg2 = args.length>1 ? args[1] : null;
        
        CommonTree ast1 = readFDL(arg1);
        CommonTree ast2 = readFDL(arg2);
        
        SuperAwesomeFighter f1 = createFighter(ast1);
        SuperAwesomeFighter f2 = createFighter(ast2);
        
        Arena arena = new Arena(f1,f2);        
        arena.run();
        
        System.out.println("-=[Finished]=-");//DEBUG
	}

	private static CommonTree readFDL(String file) throws Exception{
		
		//Input
//		CharStream input = null;
//      if (file != null)
//          input = new ANTLRFileStream(file);
//      else{
//          try{
//          	input = new ANTLRInputStream(System.in);
//          }catch (IOException ioe){
//          	//probably because the stream is closed;
//          	//		anyway, we'll use what we got so far
//          }
//      }
		
		//Hardcoded Fighters
		String chickenFDL =
			"chicken" +
			"{" +
			"  kickReach  = 9" +
			"  punchReach = 1" +
			"  kickPower  = 2" +
			"  punchPower = 2" +
			"  far [run_towards kick_low]" +
			"  near [run_away kick_low]" +
			"  near [crouch punch_low]" +
			"} ";
		String jackieChanFDL =
			"JackieChan" +
			"{ " +
			"  kickPower = 7" +
			"  punchPower = 5" +
			"  kickReach = 3" +
			"  punchReach = 9" +
			"  far[run_towards punch_high]" +
			"  near[choose(stand crouch) kick_high]" +
			"  much_stronger[walk_towards punch_low]" +
			"  weaker[run_away choose(block_high block_low)]" +
			"  always[walk_towards block_high]" +
			"} ";
		String hardCodedFDL = file!=null && file.equals("chicken")? chickenFDL : jackieChanFDL;
		CharStream input = new ANTLRInputStream(
								new ByteArrayInputStream(hardCodedFDL.getBytes()));

        //Lexer
        FDLLexer lexer = new FDLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //Parser
        FDLParser parser = new FDLParser(tokens);
        CommonTree ast = (CommonTree) parser.saf().getTree();

        //Checker
		FDLChecker checker = new FDLChecker(new CommonTreeNodeStream(ast));
		checker.saf();
		
		ast.toString();//DEBUG
		
        return ast;
	}
	
	private static SuperAwesomeFighter createFighter(CommonTree ast) {
		SuperAwesomeFighter fighter = new SuperAwesomeFighter();
		
		//TODO process properties from ast
		System.out.println("AST:\t"+ast.toStringTree());//DEBUG
		
		return fighter;
	}
}
