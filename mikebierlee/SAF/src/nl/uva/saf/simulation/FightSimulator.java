package nl.uva.saf.simulation;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import nl.uva.saf.fdl.types.MoveActionType;

public class FightSimulator implements IFightSimulator {
	private FighterBot blueContestant, redContestant;
	private boolean fightInProgress = false;
	private volatile boolean disposed = false;

	private Dimension playFieldSize;

	public FightSimulator() {
		playFieldSize = new Dimension(200, 100);
	}

	@Override
	public void update() {
		if (disposed) {
			return;
		}

		Vector2d bluePosition = blueContestant.getPosition();
		Vector2d redPosition = redContestant.getPosition();

		bluePosition.add(new Vector2d(0.5, 0));
		redPosition.substract(new Vector2d(0.5, 0));

		blueContestant.deductHealth(2);
		redContestant.deductHealth(1);
		
		blueContestant.setMoveAction(MoveActionType.jump);
		redContestant.setMoveAction(MoveActionType.crouch);
	}

	@Override
	public void addContestant(FighterBot bot) throws PlayfieldFullException {
		if (blueContestant == null) {
			blueContestant = bot;
		} else if (redContestant == null) {
			redContestant = bot;
		} else {
			throw new PlayfieldFullException();
		}
	}

	@Override
	public List<FighterBot> getContestants() {
		ArrayList<FighterBot> fighters = new ArrayList<FighterBot>(2);
		fighters.add(blueContestant);
		fighters.add(redContestant);
		return fighters;
	}

	@Override
	public void clearContestants() throws FightInProgressException {
		if (fightInProgress) {
			throw new FightInProgressException();
		}

		blueContestant = null;
		redContestant = null;
	}

	@Override
	public boolean isRunning() {
		return fightInProgress;
	}

	@Override
	public boolean isDisposed() {
		return disposed;
	}

	@Override
	public void dispose() {
		disposed = true;
	}

	@Override
	public void start() {
		blueContestant.setPosition(new Vector2d(50, playFieldSize.height / 2));
		redContestant.setPosition(new Vector2d(playFieldSize.width - 50,
				playFieldSize.height / 2));

		blueContestant.resetHealth();
		redContestant.resetHealth();

		fightInProgress = true;
	}

	@Override
	public void stop() {
		fightInProgress = false;
	}

	@Override
	public Dimension getPlayFieldSize() {
		return playFieldSize;
	}

	@Override
	public void setPlayFieldSize(Dimension playFieldSize) {
		this.playFieldSize = playFieldSize;
	}
}
