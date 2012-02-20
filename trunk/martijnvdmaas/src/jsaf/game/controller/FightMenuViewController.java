package jsaf.game.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import jsaf.game.view.FightView;
import jsaf.main.Main;


public class FightMenuViewController implements ActionListener {

	private FightView fightView;

	public FightMenuViewController(FightView fightView) {
		this.fightView = fightView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Import players":
			JFileChooser fileOpener = new JFileChooser();
			FileNameExtensionFilter safFileFilter = new FileNameExtensionFilter(
					"SAF Files", "saf");
			fileOpener.setFileFilter(safFileFilter);

			int selectedChooserOption = fileOpener.showDialog(null, "Open file");

			if (selectedChooserOption == JFileChooser.APPROVE_OPTION) {
				fightView.setVisible(false);
				File file = fileOpener.getSelectedFile();
				new Main();
				Main.startGame(file.toString());
			}
			break;
		case "Quit":
			System.exit(0);
			break;
		default:
			break;
		}
	}

}
