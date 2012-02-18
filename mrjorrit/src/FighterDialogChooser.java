import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import saf.generation.output.*;
import saf.structure.*;

public class FighterDialogChooser {
	
	private String selectedFighter;
	private String choosenFighter;
	private String[] fighterFiles;
	
	private void setFighterFiles()
	{
		File dir = new File("input");
		fighterFiles = dir.list(setAndGetFileNameFilter());
	}
	
	private FilenameFilter setAndGetFileNameFilter()
	{
		FilenameFilter filter = new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		    	if(choosenFighter == null || choosenFighter.isEmpty())
		    		return name.endsWith(".fdl");
		    	return name.endsWith(".fdl") && !name.contains(choosenFighter);
		    }
		};
		
		return filter;
	}
	
	public Fighter ChooseFighterFromDialog(String fighterPosition) throws IOException, RecognitionException
	{
		setFighterFiles();
		drawDialog(fighterPosition);
		choosenFighter = selectedFighter;
		return createFighter();
	}
	
	private void drawDialog(String fighterPosition)
	{
		while (selectedFighter == null || selectedFighter.isEmpty())
		{
			selectedFighter = (String)JOptionPane.showInputDialog(
		            null,
		            "Choose a fighter..",
		            fighterPosition,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            fighterFiles,
		            1);
		}
	}
	
	private Fighter createFighter() throws IOException, RecognitionException
	{
		FDLLexer lexer = new FDLLexer(new ANTLRFileStream("input/" + selectedFighter));
		selectedFighter = "";
		FDLParser parser = new FDLParser(new CommonTokenStream(lexer));
		FDLParser.fighter_return r = parser.fighter();
		CommonTree tree = (CommonTree)r.getTree();		
		FighterWalker walker = new FighterWalker(new CommonTreeNodeStream(tree));
		return walker.fighter();
	}
}
