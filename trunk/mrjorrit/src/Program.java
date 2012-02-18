
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

import org.antlr.runtime.*;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import saf.game.Arena;
import saf.generation.output.*;
import saf.structure.*;

public class Program {

	public static void main(String[] args) throws Exception {
		FighterDialogChooser chooser = new FighterDialogChooser();
		
		Fighter lhsf = chooser.ChooseFighterFromDialog("Left hand side fighter");
		Fighter rhsf = chooser.ChooseFighterFromDialog("Right hand side fighter");
		
		
		if(lhsf.hasErrors() || rhsf.hasErrors())
		{
			//No-can-do!
			JOptionPane.showMessageDialog(null, "There were errors, please review the error output");
			return;
		}
			
		new Arena(lhsf, rhsf);
		System.out.println("ok!");
	}
		
//		public static void writeDot(CommonTree tree)
//		{
//			DOTTreeGenerator gen = new DOTTreeGenerator();
//			StringTemplate st = gen.toDOT(tree);
//	
//			try {
//				// Create file
//				FileWriter fstream = new FileWriter("output/AST.dot");
//				BufferedWriter out = new BufferedWriter(fstream);
//				out.write(st.toString());
//				// Close the output stream
//				out.close();
//	
//			} catch (Exception e) {// Catch exception if any
//				System.err.println("Error: " + e.getMessage());
//			}
//		}
}
