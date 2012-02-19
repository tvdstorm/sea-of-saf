package game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import parser.FDLLexer;
import parser.FDLParser;
import ast.Saf;


public class Main extends JFrame {
	private Saf p1, p2;
	
	public Main() {

		p1 = loadSaf("/data/all-wrong.saf");
		p2 = loadSaf("/data/chicken.fdl");

		List<String> messages = new ArrayList<String>();
		List<String> p1messages = p1.validate(messages);
		messages = new ArrayList<String>();
		List<String> p2messages = p2.validate(messages);
		
		for (String message : p1messages) {
			System.out.println(message);
		}
		
		for (String message : p2messages) {
			System.out.println(message);
		}
		
		if (!p1messages.isEmpty() || !p2messages.isEmpty()) {
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
