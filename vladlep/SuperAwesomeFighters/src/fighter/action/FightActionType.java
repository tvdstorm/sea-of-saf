package fighter.action;

import fighter.algorithm.FighterState;

public enum FightActionType implements ActionType {
	block_low {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			// TODO Auto-generated method stub

		}
	},
	block_high {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			// TODO Auto-generated method stub

		}
	},
	punch_low {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			// TODO Auto-generated method stub

		}
	},
	punch_high {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			// TODO Auto-generated method stub

		}
	},
	kick_low {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			// TODO Auto-generated method stub

		}
	},
	kick_high {
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			// TODO Auto-generated method stub

		}
	},
	stand{
		@Override
		public void doAction(FighterState fighterState,
				FighterState oponentState) {
			// TODO Auto-generated method stub
			
		}
		
	}
	;

}
