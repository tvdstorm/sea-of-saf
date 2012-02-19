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
	
	public static Saf loadSafFromFile(String file) {
		FDLLexer lex;
		try {
			lex = new FDLLexer(new ANTLRFileStream(file, "UTF8"));
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
	
	public static void main(String[] args) {
		Saf p1 = null, p2 = null;
		int stepTime = 20;
		
		if (args.length > 0) {
			p1 = loadSafFromFile(args[0]);
		} else {
			p1 = loadSafFromFile("data/chicken.fdl");
		}

		if (args.length > 1) {
			p2 = loadSafFromFile(args[1]);
		} else {
			p2 = loadSafFromFile("data/chicken.fdl");
		}

		if (args.length > 2) {
			stepTime = Integer.parseInt(args[2]);
		}
		
	    new Main(p1, p2, stepTime);
	}

	public Main(Saf p1, Saf p2, int stepTime) {
		List<String> messages = new ArrayList<String>();
		p1.validate(messages);
		p2.validate(messages);
		
		for (String message : messages) {
			System.out.println(message);
		}
		
		if (!messages.isEmpty()) {
			return;
		}
		
		add(new GamePanel(p1, p2, stepTime));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 200);
        setLocationRelativeTo(null);
        setTitle("Saf");
        setResizable(false);
        setVisible(true);
	}

}
