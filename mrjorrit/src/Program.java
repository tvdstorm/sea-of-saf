import javax.swing.JOptionPane;

import saf.Checker.Check;
import saf.presentation.ArenaGUI;
import saf.structure.*;

public class Program {

	public static void main(String[] args) throws Exception {
		FighterDialogChooser chooser = new FighterDialogChooser();
		
		Fighter lhsf = chooser.ChooseFighterFromDialog("Left hand side fighter");
		Fighter rhsf = chooser.ChooseFighterFromDialog("Right hand side fighter");
		
		Check checker = new Check();
		
		lhsf.check(checker);
		rhsf.check(checker);
		
		if(checker.hasErrors())
		{
			//No-can-do!
			JOptionPane.showMessageDialog(null, "There were errors, please review the error output");
			return;
		}
			
		ArenaGUI arenaPresen = new ArenaGUI (lhsf, rhsf);
		arenaPresen.Fight();
	}
}
