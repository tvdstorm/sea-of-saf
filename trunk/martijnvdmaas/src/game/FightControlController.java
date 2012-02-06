package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FightControlController implements ActionListener {

	private FightEngine fightEngine;

	public FightControlController(FightEngine fightEngine) {
		this.fightEngine = fightEngine;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "(Re) Start":
			fightEngine.reStart();
			break;
		case "Next step": 
			fightEngine.doStep();
		default:
			break;
		}
	}

}
