package game.controller;

import game.view.FightView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import main.Main;

public class FightMenuViewController implements ActionListener {

	private FightView fightView;

	public FightMenuViewController(FightView fightView) {
		this.fightView = fightView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Import players":
			JFileChooser fileopen = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"SAF Files", "saf");
			fileopen.setFileFilter(filter);

			int ret = fileopen.showDialog(null, "Open file");

			if (ret == JFileChooser.APPROVE_OPTION) {
				fightView.setVisible(false);
				File file = fileopen.getSelectedFile();
				new Main();
				Main.startGame(file.toString(), true);
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
