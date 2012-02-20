package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.SpecificationMapper.Attack;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Move;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Strength;

public class ActionOptions {
    public static enum Height {
        LOW,
        HIGH
    };
    
    public static enum Type {
        KICK,
        PUNCH,
        BLOCK
    };
    
    
    public Attack MapAttack(Type type, Height height) {
    	if(type == Type.KICK) {
    		return height == Height.HIGH ? Attack.KICK_HIGH : Attack.KICK_LOW;
    	} else if(type == Type.PUNCH) {
    		return height == Height.HIGH ? Attack.PUNCH_HIGH : Attack.PUNCH_LOW;
    	} else if(type == Type.BLOCK) {
    		return height == Height.HIGH ? Attack.BLOCK_HIGH : Attack.BLOCK_LOW;
    	}
    	return null;
    }
    
    public Move MapMove(Height height) {
    	if(height == Height.LOW) {
    		return Move.CROUCH;
    	} else if(height == Height.HIGH) {
    		return Move.JUMP;
    	}
    	
    	return Move.STAND;
    }
    
    
    public Strength getRangeStat(Type type) {
    	if(type == Type.KICK) {
    		return Strength.KICK_REACH;
    	} else if(type == Type.PUNCH) {
    		return Strength.PUNCH_REACH;
    	}
    	
    	return null;
    }
    
    public Strength getPowerStat(Type type) {
    	if(type == Type.KICK) {
    		return Strength.KICK_POWER;
    	} else if(type == Type.PUNCH) {
    		return Strength.PUNCH_POWER;
    	}
    	
    	return null;
    }    
}