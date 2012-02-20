package saf.presentation;
import saf.simulation.Arena;
import saf.simulation.FighterState;
import saf.simulation.Subject;
import saf.structure.*;

public class ArenaGUI extends Arena {
	
	public ArenaGUI(Fighter leftFighter, Fighter rightFighter) {
		super(leftFighter, rightFighter);
	}

	private View view;

	@Override
	public void update(Subject changedSubject) {
		
		FighterState fighterState = (FighterState) changedSubject;
		
		System.out.println("Fighter: " + fighterState.getFighter().getName());
		System.out.println("X: " + fighterState.getFighterX());
		System.out.println("Y: " + fighterState.getFighterY());
		System.out.println("CurrentMoveAction: " + fighterState.getCurrentMoveActionType().toString());
		System.out.println("CurrentFightAction: " + fighterState.getCurrentFightActionType().toString());
		System.out.println("FightActionPerform: " + fighterState.isActionPerform());
		System.out.println("Health: " + fighterState.getHealth());
		
	}

}
