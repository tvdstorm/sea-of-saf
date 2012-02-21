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
			if (Math.abs(newPosistionX - oponentState.getPositionX()) > BattleConstants.minimDistance) {
				fighterState.setPositionX(newPosistionX);
			}
		}

	},
	walk_away {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {

			fighterState.setRemainingTime(BattleConstants.defaulWalkTime);

			int newPosistionX;
			newPosistionX = fighterState.computeNewPositionX(-1);
			if (Math.abs(newPosistionX - oponentState.getPositionX()) > BattleConstants.minimDistance) {
				fighterState.setPositionX(newPosistionX);
			}
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
			if (Math.abs(newPosistionX - oponentState.getPositionX()) > BattleConstants.minimDistance) {
				fighterState.setPositionX(newPosistionX);
			} else {
				fighterState.setRemainingTime(1);
			}
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
			if (Math.abs(newPosistionX - oponentState.getPositionX()) > BattleConstants.minimDistance)
				fighterState.setPositionX(newPosistionX);
			else
				fighterState.setRemainingTime(1);
		}
	},

	jump {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {

			fighterState.setRemainingTime(BattleConstants.defaulWalkTime);
			fighterState.setPositionY(BattleConstants.jumpPosY);

		}
	},
	crouch {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			fighterState.setRemainingTime(BattleConstants.defaulCrouchTime);
			fighterState.setPositionY(BattleConstants.crouchPosY);
		}
	},
	stand {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			fighterState.setRemainingTime(BattleConstants.defaulStandTime);
		}

	}
}
