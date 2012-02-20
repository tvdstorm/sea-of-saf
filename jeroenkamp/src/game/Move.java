package game;

import common.ActionPair;
import common.ActionType;
import common.MoveType;


public class Move {
	private static void hit(Fighter f, ActionType type,int power, Fighter opponent){
		opponent.setHealth(Math.max( opponent.getHealth()-power,0));
	}
	private static void miss(Fighter f, ActionType type, Fighter opponent){
		//the fighter misses, if you want to do something with it
	}
	private static void block(Fighter f, ActionType type, Fighter opponent){
		//when the action was blocked, you could decide to reduce a little bit of health
		//but for now it doesn't cost him any health
	}
	private static int getPositionChange(MoveType type){
		switch(type){
			case run_away: return -2;
			case walk_away: return -1;
			case walk_towards: return 1;
			case run_towards: return 2;
			default: return 0;
		}
	}
	private static void makeMove(Fighter f,MoveType move, Fighter opponent){
		f.setMoveState(move);
		int poschange=getPositionChange(move);
		if(f.getPosition()<opponent.getPosition()){
			f.setPosition(f.getPosition()+poschange);
		}
		else{
			f.setPosition(f.getPosition()-poschange);
		}
	}
	
	public static void doAction(Fighter f, ActionPair p , Fighter opponent){
		makeMove(f, p.getAction1(), opponent);
		doFightAction(f, p.getAction2() , opponent);
		
	}
	
	private static void doFightAction(Fighter f,ActionType action,Fighter opponent){
		f.setActionState(action);

		if(action == ActionType.kick_high){
			hitHigh(f, action, f.getKickReach(), f.getKickPower(), opponent);
		}
		else if(action == ActionType.kick_low){
			hitLow(f, action, f.getKickReach(), f.getKickPower(), opponent);
		}
		if(action == ActionType.punch_high){
			hitHigh(f, action, f.getPunchReach(), f.getPunchPower(), opponent);
		}
		else if(action == ActionType.punch_low){
			hitLow(f, action, f.getPunchReach(), f.getPunchPower(), opponent);
		}
	}
	
	
	private static void hitHigh(Fighter f, ActionType action, int reach,int power, Fighter opponent){
		if(Math.abs(f.getPosition()-opponent.getPosition())>reach){
			miss(f,action,opponent);
		}
		else if(opponent.getMoveState()==MoveType.crouch){
			miss(f,action,opponent);
		}
		else if(opponent.GetActionState()==ActionType.block_high){
			block(f,action, opponent);
		}
		else{
			hit(f,action,power,opponent);
		}
	}
	private static void hitLow(Fighter f, ActionType action, int reach,int power, Fighter opponent){
		if(Math.abs(f.getPosition()-opponent.getPosition())>reach){
			miss(f,action,opponent);
		}
		else if(opponent.getMoveState()==MoveType.jump){
			miss(f,action,opponent);
		}
		else if(opponent.GetActionState()==ActionType.block_low){
			block(f,action, opponent);
		}
		else{
			hit(f,action,power,opponent);
		}
	}
}
