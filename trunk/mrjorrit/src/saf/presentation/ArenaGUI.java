package saf.presentation;
import saf.simulation.Arena;
import saf.simulation.Subject;
import saf.structure.*;

public class ArenaGUI extends Arena {
	
	public ArenaGUI(Fighter leftFighter, Fighter rightFighter) {
		super(leftFighter, rightFighter);
	}

	private View view;

	@Override
	public void update(Subject changedSubject) {
		// TODO Auto-generated method stub
		
	}

}
