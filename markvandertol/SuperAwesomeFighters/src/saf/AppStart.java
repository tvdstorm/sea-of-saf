package saf;

import saf.gui.MainView;

public class AppStart {

	public static void main(String[] args) {
		Arena arena = new Arena();
		new MainView(arena);

	}

}
