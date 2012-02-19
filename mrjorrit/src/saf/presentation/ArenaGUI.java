package saf.presentation;
import saf.structure.*;

public class ArenaGUI extends Observer {
	private Fighter leftFighter;
	private Fighter rightFighter;
	
	private View view;
	
	public ArenaGUI(Fighter leftFighter, Fighter rightFighter)
	{
		this.leftFighter = leftFighter;
		this.rightFighter = rightFighter;
		this.view = new View();
		
		leftFighter.attach(this);
		rightFighter.attach(this);
	}

	@Override
	public void update(Subject changedSubject) {
		// TODO Auto-generated method stub
		// get all the states for
	}
	
}
