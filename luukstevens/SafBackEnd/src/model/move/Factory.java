package model.move;

public class Factory {
	public static Move create(String name) {

			if(name.equals("jump")) 		return new Jump();
			if(name.equals("crouch")) 		return new Crouch();
			if(name.equals("stand")) 		return new Stand();
			if(name.equals("run_towards")) 	return new RunTowards();
			if(name.equals("run_away")) 	return new RunAway();
			if(name.equals("walk_towards")) return new WalkTowards();
			if(name.equals("walk_away")) 	return new WalkAway();
			
			return new Stand();
	}
}
