package fighter.action;

import fighter.algorithm.BattleConstants;
import fighter.algorithm.FighterState;

public enum MoveActionType implements ActionType {

	walk_towards {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {

			fighterState.setRemainingTime(BattleConstants.defaulWalkTime);

			int newPosistionX;
			newPosistionX = fighterState.computeNewPositionX(1);
			if (newPosistionX != oponentState.getPositionX())
				fighterState.setPositionX(newPosistionX);
		}

	},
	walk_away {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {

			fighterState.setRemainingTime(BattleConstants.defaulWalkTime);

			int newPosistionX;
			newPosistionX = fighterState.computeNewPositionX(-1);
			if (newPosistionX != oponentState.getPositionX())
				fighterState.setPositionX(newPosistionX);
		}

	},
	run_towards {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {

			if (fighterState.getRemainingTime() == 0) {
				int remainingTime;
				remainingTime = (int) (fighterState
						.calculateFigterDistance(oponentState)
						/ fighterState.getSpeed() / BattleConstants.stepSize);
				fighterState.setRemainingTime(remainingTime);
			}

			int newPosistionX;
			newPosistionX = fighterState.computeNewPositionX(1);
			if (newPosistionX != oponentState.getPositionX())
				fighterState.setPositionX(newPosistionX);
		}

	},
	run_away {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {

			if (fighterState.getRemainingTime() == 0) {
				int remainingTime;
				remainingTime = (int) (fighterState
						.calculateFigterDistance(oponentState)
						/ fighterState.getSpeed() / BattleConstants.stepSize);
				fighterState.setRemainingTime(remainingTime);
			}

			int newPosistionX;
			newPosistionX = fighterState.computeNewPositionX(-1);
			if (newPosistionX != oponentState.getPositionX())
				fighterState.setPositionX(newPosistionX);
		}
	},

	jump {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			// TODO Auto-generated method stub

		}
	},
	crouch {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {

		}
	},
	stand {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			fighterState.setRemainingTime(BattleConstants.defaulWalkTime);
		}

	}
}
