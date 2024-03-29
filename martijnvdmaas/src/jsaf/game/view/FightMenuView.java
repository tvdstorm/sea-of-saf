package jsaf.game.view;


import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import jsaf.game.controller.FightMenuViewController;

public class FightMenuView extends JMenuBar {
	
	public FightMenuView(FightMenuViewController menuController) {
		JMenu menu = new JMenu("Menu");
		menu.setMnemonic(KeyEvent.VK_M);
		add(menu);

		JMenuItem importMenuItem = new JMenuItem("Import players");
		importMenuItem.addActionListener(menuController);
		menu.add(importMenuItem);
		
		JMenuItem quitMenuItem = new JMenuItem("Quit");
		quitMenuItem.addActionListener(menuController);
		menu.add(quitMenuItem);
	}
}
