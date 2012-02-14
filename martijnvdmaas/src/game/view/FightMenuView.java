package game.view;

import game.controller.FightMenuViewController;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FightMenuView extends JMenuBar {

	private JMenu menu;
	private JMenuItem importMenuItem;
	private JMenuItem quitMenuItem;
	private FightMenuViewController menuController;
	
	public FightMenuView(FightMenuViewController menuController) {
		this.menuController = menuController;
		
		menu = new JMenu("Menu");
		menu.setMnemonic(KeyEvent.VK_M);
		add(menu);

		importMenuItem = new JMenuItem("Import players");
		importMenuItem.addActionListener(menuController);
		menu.add(importMenuItem);
		
		quitMenuItem = new JMenuItem("Quit");
		quitMenuItem.addActionListener(menuController);
		menu.add(quitMenuItem);
	}
}
