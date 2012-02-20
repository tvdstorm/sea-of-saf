package fighter.action;

import fighter.algorithm.FighterState;

public interface ActionType {

	void doAction(FighterState fighterState, FighterState oponentState);
}
