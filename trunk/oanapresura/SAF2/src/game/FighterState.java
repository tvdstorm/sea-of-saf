package game;

import ast.*;

public class FighterState extends Fighter{

		
		private final int DEFAULT = 5;
		private final int HEALTH = 10;
		private int health;
		public BehaviourItem currentMove;	
		public int position;
		public String currentPic;
		
		public FighterState(Bot bot, int position){
			
			super(bot);			
			this.health = HEALTH;
			this.position = position;
			
		}
		
		public String getCurrentPic() {
			return currentPic;
		}

		public void setCurrentPic(String currentPic) {
			this.currentPic = currentPic;
		}

		public BehaviourItem getCurrentMove() {
			return currentMove;
		}


		public void setCurrentMove(BehaviourItem currentMove) {
			this.currentMove = currentMove;
		}	
	 
}
