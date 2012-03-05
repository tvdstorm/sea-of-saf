package game;

import java.util.List;

import objects.Behavior;
import objects.Fighter;

public abstract class BaseFighter {
	
	 public void addCurrentBehavior(Behavior b){ }
	 public int getLocationY(){return 0;}
	 public int getLocationX(){return 0;}
	 public void setLocation(int x,int y){}
	 public Behavior getBehavior(){return this.getBehavior();}
	 public Fighter getFighter(){return null;}
	 public List<String> getCurrentConditions() {return null;}
	 public void addCurrentConditions(){}
	 public void addCurrentBehavior(){}
	 public List<Behavior> getCurrentBehavior() {return this.getCurrentBehavior();}
	 public Behavior chooseRandomBehavior() {return null;}
	 public boolean isLeft(){return false;}
	 public void updateLocation(BaseFighter f){}
	 public void updateLife(BaseFighter f){}
}

