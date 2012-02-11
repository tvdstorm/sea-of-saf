package saf;

import java.util.Random;

import javax.swing.UIManager;

import saf.game.GameMain;

public class Main {
	public static void main(String args[]) {

		try {
			setApplicationLookAndFeel();
		} catch (Exception e) {
			System.out.println("Unable to set look and feel.");
			e.printStackTrace();
		}

		GameMain.start();
	}

	private static void setApplicationLookAndFeel() throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	}
}