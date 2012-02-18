package game;

import java.io.IOException;

import javax.swing.JFrame;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import parser.FDLLexer;
import parser.FDLParser;
import ast.Saf;


public class Main extends JFrame {
	public Main() {
		final Saf p1 = loadSaf("/data/test.fdl");
		final Saf p2 = loadSaf("/data/chicken.fdl");

		if (!p1.validate() || !p2.validate()) {
			System.out.println("Goodbye.");
			return;
		}
			
		
		add(new GamePanel(p1, p2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 400);
        setLocationRelativeTo(null);
        setTitle("Saf");
        setResizable(false);
        setVisible(true);

	}

	public static void main(String[] args) {
	    new Main();
	}
    
	private static Saf loadSaf(String file) {
		FDLLexer lex;
		try {
			lex = new FDLLexer(new ANTLRFileStream(System.getProperty("user.dir") + file, "UTF8"));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	    CommonTokenStream tokens = new CommonTokenStream(lex);
	
	    FDLParser g = new FDLParser(tokens);
		try {
			return g.saf();
		} catch (RecognitionException e) {
			e.printStackTrace();
			return null;
		}
	}

}