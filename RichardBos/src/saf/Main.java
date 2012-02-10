package saf;

import javax.swing.UIManager;

import saf.game.GameMain;
import saf.game.gui.component.GameArena;

public class Main {
	public static void main(String args[]) {
		
		try {
			setApplicationLookAndFeel();
		} catch (Exception e) {
			System.out.println("Unable to set look and feel.");
			e.printStackTrace();
		}
		
		
//		GameArena gameArena = new GameArena();
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		frame.setSize(800,800);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().add(gameArena);
//		
//		gameArena.createNewBot("left");

		GameMain.start();
    }
	
	
	private static void setApplicationLookAndFeel() throws Exception
	{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	}
}