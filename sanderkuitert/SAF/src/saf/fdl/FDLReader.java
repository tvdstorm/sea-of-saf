package saf.fdl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import saf.GameInput;
import saf.Fighter;
import saf.SuperAwesomeFighter;


public class FDLReader implements GameInput {
	
	public List<Fighter> obtainFighters() {
		List<Fighter> fighters = new LinkedList<Fighter>();
		
		//TODO choose FDL sources 
		//			use ANTLRFileStream(file)? or ANTLRInputStream(System.in)?
		
//        for(File source : sources){
        	try {
				fighters.add(readFDL(hardCodedFDL(true)));
			} catch (RecognitionException e) {
				// TODO FDL syntax error
				e.printStackTrace();
			} catch (IOException e) {
				// TODO input error
				e.printStackTrace();
			}
//        }
        
        return fighters;
	}

	private Fighter readFDL(CharStream input) throws RecognitionException{

        //Lexer
        FDLLexer lexer = new FDLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //Parser
        FDLParser parser = new FDLParser(tokens);
        CommonTree ast = (CommonTree) parser.saf().getTree();
//		System.out.println("AST:\t"+ast.toStringTree()); //DEBUG

        //Checker
		FDLChecker checker = new FDLChecker(new CommonTreeNodeStream(ast));
		checker.saf();
		
		//Interpreter
		FDLInterpreter interpreter = new FDLInterpreter(new CommonTreeNodeStream(ast));
		SuperAwesomeFighter fighter = new SuperAwesomeFighter(); // default properties
		interpreter.applyProperties(fighter);
		
        return fighter;
	}
	
	//Hardcoded FDL 	TODO move to tests
	//	advanced <=> 'chicken' and !advanced <=> JackieChan
	private CharStream hardCodedFDL(boolean advanced) throws IOException{
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
		String hardCodedFDL = advanced ? jackieChanFDL : chickenFDL;
	
		return new ANTLRInputStream(new ByteArrayInputStream(hardCodedFDL.getBytes()));
	}
}
