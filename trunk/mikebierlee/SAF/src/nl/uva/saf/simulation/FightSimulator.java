package nl.uva.saf.simulation;

public class FightSimulator implements IFightSimulator {
	private FighterBot blueContestant, redContestant;
	private boolean running = false;
	private volatile boolean disposed = false;

	@Override
	public void update() {
		if (disposed) {
			return;
		}
		
		// TODO Auto-generated method stub
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
	public void clearContestants() {
		blueContestant = null;
		redContestant = null;
	}

	@Override
	public boolean isFightInProgress() {
		return running;
	}

	@Override
	public boolean isDisposed() {
		return disposed;
	}

	@Override
	public void dispose() {
		disposed = true;		
	}
}
