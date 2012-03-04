package saf.game;


/**
 * This class contains all properties of a fighter bot
 **/
public class EnumTypes {

    public enum MoveType { 
        JUMP, 
        CROUCH, 
        STAND, 
        RUN_TOWARDS, 
        RUN_AWAY, 
        WALK_TOWARDS, 
        WALK_AWAY, 
        EMPTY;
         
        public static MoveType stringToMoveType(String s) {
            if ( s.equals("jump") ) {
                return MoveType.JUMP;
            } else if ( s.equals("crouch") ) {
                return MoveType.CROUCH;
            } else if ( s.equals("stand") ) {
                return MoveType.STAND;
            } else if ( s.equals("run_towards") ) {
                return MoveType.RUN_TOWARDS;
            } else if ( s.equals("run_away") ) {
                return MoveType.RUN_AWAY;
            } else if ( s.equals("walk_towards") ) {
                return MoveType.WALK_TOWARDS;
            } else if ( s.equals("walk_away") ) {
                return MoveType.WALK_AWAY;
            }
            return MoveType.EMPTY; 
        }
    }

    public enum AttackType { 
        PUNCH_LOW, 
        PUNCH_HIGH, 
        KICK_LOW, 
        KICK_HIGH, 
        BLOCK_LOW, 
        BLOCK_HIGH, 
        IDLE, 
        EMPTY; 
         
        public static AttackType stringToAttackType(String s) {
            if ( s.equals("punch_low") ) {
                return AttackType.PUNCH_LOW;
            } else if ( s.equals("punch_high") ) {
                return AttackType.PUNCH_HIGH;
            } else if ( s.equals("kick_low") ) {
                return AttackType.KICK_LOW;
            } else if ( s.equals("kick_high") ) {
                return AttackType.KICK_HIGH;
            } else if ( s.equals("block_low") ) {
                return AttackType.BLOCK_LOW;
            } else if ( s.equals("block_high") ) {
                return AttackType.BLOCK_HIGH;
            }
            return AttackType.EMPTY; 
        }
    }
    
    public enum ConditionType {  
        MUCH_STRONGER, 
        STRONGER,  
        EVEN, 
        WEAKER,
        MUCH_WEAKER,
        NEAR, 
        FAR, 
        ALWAYS, 
        EMPTY;
        
        public static ConditionType stringToConditionType(String s) {
            if ( s.equals("much_stronger") ) {
                return ConditionType.MUCH_STRONGER;
            } else if ( s.equals("stronger") ) {
                return ConditionType.STRONGER;
            } else if ( s.equals("even") ) {
                return ConditionType.EVEN;
            } else if ( s.equals("weaker") ) {
                return ConditionType.WEAKER;
            } else if ( s.equals("much_weaker") ) {
                return ConditionType.MUCH_WEAKER;
            } else if ( s.equals("near") ) {
                return ConditionType.NEAR;
            } else if ( s.equals("far") ) {
                return ConditionType.FAR;
            } else if ( s.equals("always") ) {
                return ConditionType.ALWAYS;
            }
            return ConditionType.EMPTY; 
        }
    }
    
    public enum LogicalOperatorType { 
        NONE, 
        OR, 
        AND  
    }
    
    public enum Orientation {
        LEFT,
        RIGHT
    }

}
