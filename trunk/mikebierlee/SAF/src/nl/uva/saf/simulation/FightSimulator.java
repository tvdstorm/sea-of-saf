/* Copyright (c) 2012 Mike Bierlee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package nl.uva.saf.simulation;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import nl.uva.saf.fdl.ActionSelector;
import nl.uva.saf.fdl.types.ConditionType;

public class FightSimulator implements IFightSimulator {
	private final IActionExecutor actionExecutor;
	private final ActionSelector actionSelector;
	private final IConditionSemantics conditionSemantics;

	private volatile List<FighterBot> contestants;
	private volatile boolean disposed = false;
	private List<IFightEndEventListener> fightEndEventListeners = new ArrayList<IFightEndEventListener>();

	private volatile boolean fightInProgress = false;

	private Dimension playFieldSize;

	private volatile FighterBot winner;

	public FightSimulator() {
		this(new SimulationParameters());
	}

	public FightSimulator(SimulationParameters parameters) {
		actionSelector = parameters.getActionSelector();
		conditionSemantics = parameters.getConditionSemantics();
		actionExecutor = parameters.getActionExecutor();

		playFieldSize = new Dimension(200, 100);
		contestants = new ArrayList<FighterBot>(2);
	}

	@Override
	public void addContestant(FighterBot bot) throws PlayfieldFullException {
		if (bot != null) {
			if (contestants.size() == 2) {
				throw new PlayfieldFullException();
			}

			bot.setSpawnPosition(new Vector2d(new Vector2d(50 + (contestants.size() * (playFieldSize.width - 100)),
					playFieldSize.height / 2)));
			contestants.add(bot);
		}
	}

	@Override
	public synchronized void addEventListener(IFightEndEventListener listener) {
		fightEndEventListeners.add(listener);
	}

	@Override
	public void clearContestants() throws FightInProgressException {
		if (fightInProgress) {
			throw new FightInProgressException();
		}

		contestants.clear();
	}

	@Override
	public void dispose() {
		disposed = true;
	}

	private synchronized void fireEndFightEvent() {
		if (fightEndEventListeners.size() > 0) {
			FightEndEvent event = new FightEndEvent(this);
			event.setWinner(winner);

			for (IFightEndEventListener listener : fightEndEventListeners) {
				listener.fightEnd(event);
			}
		}
	}

	@Override
	public List<FighterBot> getContestants() {
		return Collections.unmodifiableList(contestants);
	}

	@Override
	public Dimension getPlayFieldSize() {
		return playFieldSize;
	}

	@Override
	public FighterBot getWinner() {
		return winner;
	}

	@Override
	public boolean isDisposed() {
		return disposed;
	}

	@Override
	public boolean isRunning() {
		return fightInProgress;
	}

	@Override
	public void join() {
		while (isRunning())
			;
	}

	@Override
	public synchronized void removeEventListener(IFightEndEventListener listener) {
		fightEndEventListeners.remove(listener);
	}

	private void selectActions(FighterBot contestant, HashMap<ConditionType, Boolean> truthTable) {
		actionSelector.selectActions(contestant.getFighterNode(), truthTable);
		contestant.setMoveAction(actionSelector.getMoveAction());
		contestant.setFightAction(actionSelector.getFightAction());
	}

	@Override
	public void setPlayFieldSize(Dimension playFieldSize) {
		this.playFieldSize = playFieldSize;
	}

	@Override
	public void start() {
		for (FighterBot contestant : contestants) {
			contestant.setPosition(new Vector2d(contestant.getSpawnPosition()));
			contestant.resetHealth();
			contestant.setNextTurn(0);
		}

		winner = null;
		fightInProgress = true;
	}

	@Override
	public void stop() {
		fightInProgress = false;
	}

	@Override
	public void update() {
		if (disposed) {
			return;
		}

		if (fightInProgress) {
			List<FighterBot> losers = new ArrayList<FighterBot>();

			for (FighterBot contestant : contestants) {
				HashMap<ConditionType, Boolean> truthTable = conditionSemantics.getConditionStates(contestant,
						contestants);

				if (contestant.getNextTurn() == 0) {
					selectActions(contestant, truthTable);
					actionExecutor.executeFighterActions(contestant, contestants, truthTable);
					contestant.setNextTurn(actionExecutor.getTurnCost());

					contestant.containInDimension(playFieldSize);

					if (contestant.getHealth() == 0) {
						losers.add(contestant);
					}
				} else {
					contestant.setNextTurn(contestant.getNextTurn() - 1);
				}
			}

			if (losers.size() > 0) {
				ArrayList<FighterBot> winners = new ArrayList<FighterBot>(contestants);
				winners.removeAll(losers);
				if (winners.size() == 1) {
					winner = winners.get(0);
				}

				fireEndFightEvent();
				stop();
			}
		}
	}
}
