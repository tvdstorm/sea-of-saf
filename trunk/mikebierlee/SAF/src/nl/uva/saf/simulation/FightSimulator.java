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
import java.util.Random;

import nl.uva.saf.fdl.ActionSelector;
import nl.uva.saf.fdl.types.ConditionType;
import nl.uva.saf.fdl.types.FightActionType;
import nl.uva.saf.fdl.types.MoveActionType;

public class FightSimulator implements IFightSimulator {
	private boolean fightInProgress = false;
	private volatile boolean disposed = false;
	private List<FighterBot> contestants;

	private Dimension playFieldSize;

	public FightSimulator() {
		playFieldSize = new Dimension(200, 100);
		contestants = new ArrayList<FighterBot>(2);
	}

	@Override
	public void update() {
		if (disposed) {
			return;
		}

		if (fightInProgress) {
			for (FighterBot contestant : contestants) {
				//Vector2d position = contestant.getPosition();

				HashMap<ConditionType, Boolean> truthTable = new HashMap<ConditionType, Boolean>();

				if (contestant.getNextTurn() == 0) {
					ActionSelector selector = new ActionSelector(contestant.getFighterNode(), new Random());
					selector.selectActions(truthTable);

					if (selector.getFightAction() == FightActionType.unknown
							|| selector.getMoveAction() == MoveActionType.unknown) {
						stop();
						return;
					}

					contestant.setMoveAction(selector.getMoveAction());
					contestant.setFightAction(selector.getFightAction());
				} else {
					contestant.setNextTurn(contestant.getNextTurn() - 1);
				}
			}
		}
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
	public List<FighterBot> getContestants() {
		return Collections.unmodifiableList(contestants);
	}

	@Override
	public void clearContestants() throws FightInProgressException {
		if (fightInProgress) {
			throw new FightInProgressException();
		}

		contestants.clear();
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
		for (FighterBot contestant : contestants) {
			contestant.setPosition(contestant.getSpawnPosition());
			contestant.resetHealth();
		}

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
