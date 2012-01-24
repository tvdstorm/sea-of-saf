import java.io.*;
import org.antlr.runtime.*;

import ast.*;
import parser.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		FDLLexer lex = new FDLLexer(new ANTLRFileStream(System.getProperty("user.dir") + "/data/test.fdl", "UTF8"));
	    CommonTokenStream tokens = new CommonTokenStream(lex);
	
        FDLParser g = new FDLParser(tokens);
    	Saf saf = g.saf();
    	System.out.println("Created saf: " + saf.getName());
    	
    	System.out.print("Valid: ");
    	System.out.println(saf.validate());
    	System.out.println("");
    	System.out.println("Strengths:");
    	
    	for (Strength s : saf.getStrengths()) {
    		System.out.println("  " + s.toString());
		}
    	
	}
	

}
