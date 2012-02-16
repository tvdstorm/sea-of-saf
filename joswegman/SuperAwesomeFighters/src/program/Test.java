package program;
import java.io.IOException;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.*;

import grammar.SafLexer;
import grammar.SafParser;
import grammar.Evaluators.*;
import java.awt.*;
import java.applet.Applet;

public class Test extends Applet {
    
	private Image img;
    
	public void init() {
		img = null;
	}
	
	public void loadImage()
	   {
	      try
	      { 
	         img = getImage(getDocumentBase(), "image1.gif");
	      }
	      catch(Exception e) { }
	   }
	   public void paint(Graphics g)
	   {
	      if (img == null)
	         loadImage();
	      g.drawImage(img, 0, 0, this);
	   }
	   
	public static void main(String[] args) throws RecognitionException, IOException {
		
		
		//Image img = getImage(getCodeBAse(),filename);
		
		
		ANTLRFileStream fileStream = new ANTLRFileStream ("/home/jos/workspace/SuperAwesomeFighters/src/program/Sample.saf");
		SafLexer lexer = new SafLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SafParser parser = new SafParser(tokenStream);
		Bot b = parser.bot();
		b.accept(new BotChecker());
		
		ANTLRFileStream fileStream1 = new ANTLRFileStream("/home/jos/workspace/SuperAwesomeFighters/src/program/Test.saf");
		SafLexer lexer1 = new SafLexer(fileStream1);
		TokenStream tokenStream1 = new CommonTokenStream(lexer1);
		SafParser parser1 = new SafParser(tokenStream1);
		Bot b1 = parser1.bot();
		b1.accept(new BotChecker());
		b1.toString();
		
	}

}
