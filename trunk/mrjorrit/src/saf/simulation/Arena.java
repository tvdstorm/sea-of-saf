package saf.simulation;

import saf.structure.*;

public abstract class Arena extends Observer {

	private FighterState leftFighterState;
	private FighterState rightFighterState;
	private Engine engine;

	public Arena(Fighter leftFighter, Fighter rightFighter) {
		this.leftFighterState = new FighterState(leftFighter,
				StartingPosition.left);
		this.leftFighterState.attach(this);

		rightFighterState = new FighterState(rightFighter,
				StartingPosition.right);
		rightFighterState.attach(this);

		this.engine = new Engine(this);
	}

	public void Fight() {
		engine.start();
	}

	public FighterState getRightFighterState() {
		return rightFighterState;
	}

	public FighterState getLeftFighterState() {
		return leftFighterState;
	}
}
