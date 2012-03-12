package saf.bot;


/**
 * Contains state types of a fighter bot
 **/
public class EnumTypes {

    public enum MoveType { 
        JUMP ("jump"), 
        CROUCH ("crouch"), 
        STAND ("stand"), 
        RUN_TOWARDS ("run_towards"), 
        RUN_AWAY ("run_away"), 
        WALK_TOWARDS ("walk_towards"), 
        WALK_AWAY ("walk_away"),
        EMPTY ("empty");
        
        private final String stringVersion;
        
        MoveType (String stringVersion) {
        	this.stringVersion = stringVersion;
        }
        
        public String toString() {
        	return stringVersion;
        }
        
        public static boolean containsString(String s) {
        	for (MoveType moveType : MoveType.values()) {
        		if ( moveType.toString().equals(s) ) {
        			return true;
        		}
        	}
        	return false;
        }
        
        public static MoveType stringToMoveType(String s) {
        	for (MoveType moveType : MoveType.values()) {
        		if ( moveType.toString().equals(s) ) {
        			return moveType;
        		}
        	}
        	return MoveType.EMPTY;
        }
        
//        public static MoveType stringToMoveType(String s) {
//            if ( s.equals("jump") ) {
//                return MoveType.JUMP;
//            } else if ( s.equals("crouch") ) {
//                return MoveType.CROUCH;
//            } else if ( s.equals("stand") ) {
//                return MoveType.STAND;
//            } else if ( s.equals("run_towards") ) {
//                return MoveType.RUN_TOWARDS;
//            } else if ( s.equals("run_away") ) {
//                return MoveType.RUN_AWAY;
//            } else if ( s.equals("walk_towards") ) {
//                return MoveType.WALK_TOWARDS;
//            } else if ( s.equals("walk_away") ) {
//                return MoveType.WALK_AWAY;
//            }
//            return MoveType.EMPTY; 
//        }
    }

    public enum AttackType { 
        PUNCH_LOW ("punch_low"), 
        PUNCH_HIGH ("punch_high"), 
        KICK_LOW ("kick_low"), 
        KICK_HIGH ("kick_high"), 
        BLOCK_LOW ("block_low"), 
        BLOCK_HIGH ("block_high"), 
        IDLE ("idle"), 
        EMPTY ("empty"); 
 
        private final String stringVersion;
        
        AttackType (String stringVersion) {
        	this.stringVersion = stringVersion;
        }
        
        public String toString() {
        	return stringVersion;
        }
        
        public static boolean containsString(String s) {
        	for (AttackType attackType : AttackType.values()) {
        		if ( attackType.toString().equals(s) ) {
        			return true;
        		}
        	}
        	return false;
        }
        
        public static AttackType stringToAttackType(String s) {
        	for (AttackType attackType : AttackType.values()) {
        		if ( attackType.toString().equals(s) ) {
        			return attackType;
        		}
        	}
        	return AttackType.EMPTY;
        }
        
//        public static AttackType stringToAttackType(String s) {
//            if ( s.equals("punch_low") ) {
//                return AttackType.PUNCH_LOW;
//            } else if ( s.equals("punch_high") ) {
//                return AttackType.PUNCH_HIGH;
//            } else if ( s.equals("kick_low") ) {
//                return AttackType.KICK_LOW;
//            } else if ( s.equals("kick_high") ) {
//                return AttackType.KICK_HIGH;
//            } else if ( s.equals("block_low") ) {
//                return AttackType.BLOCK_LOW;
//            } else if ( s.equals("block_high") ) {
//                return AttackType.BLOCK_HIGH;
//            }
//            return AttackType.EMPTY; 
//        }
    }
    
    public enum ConditionType {  
        MUCH_STRONGER ("much_stronger"), 
        STRONGER ("stronger"),  
        EVEN ("even"), 
        WEAKER ("weaker"),
        MUCH_WEAKER ("much_weaker"),
        NEAR ("near"), 
        FAR ("far"), 
        ALWAYS ("always"), 
        EMPTY ("empty");
  
        private final String stringVersion;
        
        ConditionType (String stringVersion) {
        	this.stringVersion = stringVersion;
        }
        
        public String toString() {
        	return stringVersion;
        }
        
        public static boolean containsString(String s) {
        	for (ConditionType conditionType : ConditionType.values()) {
        		if ( conditionType.toString().equals(s) ) {
        			return true;
        		}
        	}
        	return false;
        }
        
        public static ConditionType stringToConditionType(String s) {
        	for (ConditionType conditionType : ConditionType.values()) {
        		if ( conditionType.toString().equals(s) ) {
        			return conditionType;
        		}
        	}
        	return ConditionType.EMPTY;
        }        
        
//        public static ConditionType stringToConditionType(String s) {
//            if ( s.equals("much_stronger") ) {
//                return ConditionType.MUCH_STRONGER;
//            } else if ( s.equals("stronger") ) {
//                return ConditionType.STRONGER;
//            } else if ( s.equals("even") ) {
//                return ConditionType.EVEN;
//            } else if ( s.equals("weaker") ) {
//                return ConditionType.WEAKER;
//            } else if ( s.equals("much_weaker") ) {
//                return ConditionType.MUCH_WEAKER;
//            } else if ( s.equals("near") ) {
//                return ConditionType.NEAR;
//            } else if ( s.equals("far") ) {
//                return ConditionType.FAR;
//            } else if ( s.equals("always") ) {
//                return ConditionType.ALWAYS;
//            }
//            return ConditionType.EMPTY; 
//        }
    }
    
    public enum LogicalOperatorType { 
        NONE ("none"), 
        OR ("or"), 
        AND ("and");
        
        private final String stringVersion;
        
        LogicalOperatorType (String stringVersion) {
        	this.stringVersion = stringVersion;
        }
        
        public String toString() {
        	return stringVersion;
        }
        
        public static boolean containsString(String s) {
        	for (LogicalOperatorType logicalOperatorType : LogicalOperatorType.values() ) {
        		if ( logicalOperatorType.toString().equals(s) ) {
        			return true;
        		}
        	}
        	return false;
        }
        
        public static LogicalOperatorType stringToOperatorType(String s) {
        	for (LogicalOperatorType logicalOperatorType : LogicalOperatorType.values() ) {
        		if ( logicalOperatorType.toString().equals(s) ) {
        			return logicalOperatorType;
        		}
        	}
        	return LogicalOperatorType.NONE;
        }          
    }
    
    public enum Orientation {
        LEFT,
        RIGHT
    }
}
