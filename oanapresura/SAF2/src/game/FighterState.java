package game;

import constants.CorrectValues;
import ast.*;

public class FighterState extends Fighter{

		
		private final int DEFAULT = 5;
		private final int HEALTH = 10;
		private int health;
		public BehaviourItem currentAction;	

		public int position;
		public String currentPic;
		

		
		public FighterState(Bot bot, int position){
			
			super(bot);			
			this.health = HEALTH;
			this.position = position;
			
		}
		
		public int getPosition() {
			return position;
		}

		public void setPosition(int position) {
			this.position = position;
		}

		public String getCurrentPic() {
			return currentPic;
		}

		public void setCurrentPic(String currentPic) {
			this.currentPic = currentPic;
			//System.out.println("[Fighter] Changed pic: " + currentPic);
		}

		public BehaviourItem getCurrentAction() {
			return currentAction;
		}


		public void setCurrentAction(BehaviourItem currentAction) {
			this.currentAction = currentAction;
		}	
	 
}
