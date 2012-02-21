package saf.presentation;
import java.awt.Dimension;

import javax.swing.JFrame;

import saf.simulation.Arena;
import saf.simulation.FighterState;
import saf.simulation.Subject;
import saf.structure.*;

public class ArenaGUI extends Arena {
	
	private View view;
	
	public ArenaGUI(Fighter leftFighter, Fighter rightFighter) 
	{
		super(leftFighter, rightFighter);
		view = new View();
		JFrame frame = new JFrame();
		frame.add(view);
		frame.setVisible(true);
		frame.setSize(new Dimension(1000, 700));
        frame.setResizable(false);
	}

	@Override
	public void update(Subject changedSubject) {
		
		FighterState fighterState = (FighterState) changedSubject;
		view.updateFighterPresentation(fighterState);
		view.updateUI();
	}
	

}
