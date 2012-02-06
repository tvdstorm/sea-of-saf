package game;

import javax.swing.UIManager;

import elements.Bots;

public class FightStart {

	public FightStart(Bots fightOpponents) {
		setNativeLookAndFeel();
		FightEngine fightEngine = new FightEngine(fightOpponents);
		
		FightView fightView = new FightView(fightEngine);
	}
	
	 public static void setNativeLookAndFeel() {
		    try {
		      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } catch(Exception e) {
		      System.out.println("Error setting native LAF: " + e);
		    }
		  }
}
