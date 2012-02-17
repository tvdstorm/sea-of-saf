package nl.uva.saf.simulation;

import java.awt.Dimension;
import java.util.List;

public interface IFightSimulator {
	public void update();

	public void addContestant(FighterBot bot) throws PlayfieldFullException;

	public void clearContestants() throws FightInProgressException;

	public void dispose();

	public boolean isDisposed();

	public void start();

	public void stop();

	public boolean isRunning();

	public List<FighterBot> getContestants();

	Dimension getPlayFieldSize();

	void setPlayFieldSize(Dimension playFieldSize);
}
