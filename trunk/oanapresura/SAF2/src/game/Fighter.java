package game;

import ast.*;
import java.lang.Math;


public class Fighter{

		private int health;
		private int weight;		
		private int height;
		private int speed;
		private Behaviour b;
		private Personality p;
		private Bot bot;

		public Fighter(Bot b)
		{
			this.bot = b;
			this.b = b.getBehavior();
			this.p = b.getPersonality();
			weight = (p.getStrengthValue("punchPower") + p.getStrengthValue("kickPower")) / 2;
			height = (p.getStrengthValue("punchReach") + p.getStrengthValue("kickReach")) / 2;
			speed = (int) Math.abs(0.5*(height-weight));
			health = 10;			
		}
		
		public int getHealth()
		{
			return health;
		}

		public void looseHealth(int hit)
		{
			health = health - hit;
		}
		
		public int getWeight() {
			return weight;
		}

		public int getHeight() {
			return height;
		}

		public int getSpeed() {
			return speed;
		}

	 
}
