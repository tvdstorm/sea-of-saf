package jsaf.game;


import javax.swing.UIManager;

import jsaf.astelements.Bots;
import jsaf.game.view.FightView;


public class FightStart {
	
	FightEngine fightEngine;

	public FightStart(Bots fightOpponents) {
		setNativeLookAndFeel();
		fightEngine = new FightEngine(fightOpponents);

		new FightView(fightEngine);
	}
	
	public FightEngine getFightEngine() {
		return fightEngine;
	}

	public static void setNativeLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Error setting native LAF: " + e);
		}
	}
}
