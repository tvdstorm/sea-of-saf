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
import nl.uva.saf.fdl.types.FightActionType;
import nl.uva.saf.fdl.types.MoveActionType;

public class FightSimulator implements IFightSimulator {
	private List<FighterBot> contestants;
	private volatile boolean disposed = false;
	private boolean fightInProgress = false;

	private final ActionSelector actionSelector;
	private final IConditionSemantics conditionSemantics;
	private final IActionExecutor actionExecutor;

	private Dimension playFieldSize;

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
		if (contestants.size() == 2) {
			throw new PlayfieldFullException();
		}

		bot.setSpawnPosition(new Vector2d(new Vector2d(50 + (contestants.size() * (playFieldSize.width - 100)),
				playFieldSize.height / 2)));
		contestants.add(bot);
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

	@Override
	public List<FighterBot> getContestants() {
		return Collections.unmodifiableList(contestants);
	}

	@Override
	public Dimension getPlayFieldSize() {
		return playFieldSize;
	}

	@Override
	public boolean isDisposed() {
		return disposed;
	}

	@Override
	public boolean isRunning() {
		return fightInProgress;
	}

	private void selectActions(FighterBot contestant, HashMap<ConditionType, Boolean> truthTable) {
		actionSelector.selectActions(contestant.getFighterNode(), truthTable);

		if (actionSelector.getFightAction() == FightActionType.unknown
				|| actionSelector.getMoveAction() == MoveActionType.unknown) {
			stop();
		}

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
			for (FighterBot contestant : contestants) {
				HashMap<ConditionType, Boolean> truthTable = conditionSemantics.getConditionStates(contestant,
						contestants);

				if (contestant.getNextTurn() == 0) {
					selectActions(contestant, truthTable);
					actionExecutor.executeFighterActions(contestant, contestants, truthTable);
					contestant.setNextTurn(actionExecutor.getTurnCost());
					
					//TODO: Prevent fighters from leaving the playfield
				} else {
					contestant.setNextTurn(contestant.getNextTurn() - 1);
				}
			}
		}
	}
}
