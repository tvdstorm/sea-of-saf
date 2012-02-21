package fighter.action;

import fighter.algorithm.FighterState;

public enum FightActionType implements ActionType {
	block_low {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {

		}
	},
	block_high {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
		}
	},
	punch_low {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {

			int punchReach = fighterState.getMyFigter().getPersonality()
					.getPunchReach();
			if (fighterState.calculateFigterDistance(oponentState) < punchReach) {

				if (oponentState.getSelectedFightAction().equals(
						FightActionType.block_low)
						&& fighterState.getPower() > oponentState.getPower()) {
					int damage = 0;
					damage = (int) (fighterState.getPower() - oponentState
							.getPower());
					int newHeath;
					newHeath = oponentState.getHealth() - damage;
					oponentState.setHealth(newHeath);
				}
			}

		}
	},
	punch_high {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			int punchReach = fighterState.getMyFigter().getPersonality()
					.getPunchReach();
			if (fighterState.calculateFigterDistance(oponentState) < punchReach) {

				if (oponentState.getSelectedFightAction().equals(
						FightActionType.block_high)
						&& fighterState.getPower() > oponentState.getPower()) {
					int damage = 0;
					damage = (int) (fighterState.getPower() - oponentState
							.getPower());
					int newHeath;
					newHeath = oponentState.getHealth() - damage;
					oponentState.setHealth(newHeath);
				}
			}
		}
	},
	kick_low {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			int kickReach = fighterState.getMyFigter().getPersonality()
					.getKickReach();
			if (fighterState.calculateFigterDistance(oponentState) < kickReach) {

				if (oponentState.getSelectedFightAction().equals(
						FightActionType.block_low)
						&& fighterState.getPower() > oponentState.getPower()) {
					int damage = 0;
					damage = (int) (fighterState.getPower() - oponentState
							.getPower());
					int newHeath;
					newHeath = oponentState.getHealth() - damage;
					oponentState.setHealth(newHeath);
				}
			}
		}
	},
	kick_high {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			int kickReach = fighterState.getMyFigter().getPersonality()
					.getKickReach();
			if (fighterState.calculateFigterDistance(oponentState) < kickReach) {

				if (oponentState.getSelectedFightAction().equals(
						FightActionType.block_high)
						&& fighterState.getPower() > oponentState.getPower()) {
					int damage = 0;
					damage = (int) (fighterState.getPower() - oponentState
							.getPower());
					int newHeath;
					newHeath = oponentState.getHealth() - damage;
					oponentState.setHealth(newHeath);
				}

			}

		}
	},
	stand {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {

		}

	};

}
