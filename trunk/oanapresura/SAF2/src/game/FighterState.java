package game;

import ast.*;

public class FighterState extends Fighter{

		
		private int position;
		private int direction;		
		
		public FighterState(Bot bot, int position){
			
			super(bot);			
			this.position = position;
			
		}
		
		
}
