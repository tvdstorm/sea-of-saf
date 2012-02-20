package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.SpecificationMapper.Attack;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Move;
import nl.tamasja.uva.saf.fighter.actions.ActionBlockHigh;
import nl.tamasja.uva.saf.fighter.actions.ActionBlockLow;
import nl.tamasja.uva.saf.fighter.actions.ActionCrouch;
import nl.tamasja.uva.saf.fighter.actions.ActionJump;
import nl.tamasja.uva.saf.fighter.actions.ActionKickHigh;
import nl.tamasja.uva.saf.fighter.actions.ActionKickLow;
import nl.tamasja.uva.saf.fighter.actions.ActionPunchHigh;
import nl.tamasja.uva.saf.fighter.actions.ActionPunchLow;
import nl.tamasja.uva.saf.fighter.actions.ActionRunAway;
import nl.tamasja.uva.saf.fighter.actions.ActionRunTowards;
import nl.tamasja.uva.saf.fighter.actions.ActionStand;
import nl.tamasja.uva.saf.fighter.actions.ActionWalkAway;
import nl.tamasja.uva.saf.fighter.actions.ActionWalkTowards;


public class ActionMapper {
	
	public IAction Map(Attack attack) {
		switch(attack) {
			case PUNCH_LOW: return new ActionPunchLow();
			case PUNCH_HIGH: return new ActionPunchHigh();
			
			case KICK_LOW: return new ActionKickLow();
			case KICK_HIGH: return new ActionKickHigh();
			
			case BLOCK_LOW: return new ActionBlockLow();
			case BLOCK_HIGH: return new ActionBlockHigh();
			
			default: return null;
		}
	}
	
	public IAction Map(Move move) {
		switch(move) {
			case JUMP: return new ActionJump();
			case CROUCH: return new ActionCrouch();
			case STAND: return new ActionStand();
			
			case RUN_TOWARDS: return new ActionRunTowards();
			case RUN_AWAY: return new ActionRunAway();
			
			case WALK_TOWARDS: return new ActionWalkTowards();
			case WALK_AWAY: return new ActionWalkAway();
			
			default: return null;
		
		}
	}
}
/*
 * 	public static enum Move {
		JUMP,
		CROUCH,
		STAND,
		RUN_TOWARDS,
		RUN_AWAY,
		,
		WALK_AWAY
	}
	
	public static enum Attack {
		PUNCH_LOW,
		PUNCH_HIGH,
		KICK_LOW,
		KICK_HIGH,
		BLOCK_LOW,
		BLOCK_HIGH
	}
 */