package nl.uva.saf.simulation;

public interface IFightSimulator {
	public void update();
	public void addContestant(FighterBot bot) throws PlayfieldFullException;
	public void clearContestants();
	public void dispose();
	public boolean isFightInProgress();
	public boolean isDisposed();
}
