tree grammar FDLChecker;

options {
    language = Java;
    tokenVocab = FDL;
    ASTLabelType = CommonTree;
}

@header{
    package saf.fdl;
    
	import java.util.Arrays;
	import java.util.Set;
	import java.util.HashSet;
	import java.security.InvalidParameterException;
}

@members {
    
    //TODO when SuperAwesomeFighter is implemented: share the following checks?
    private Set<String> characteristics = new HashSet<String>(Arrays.asList(
            "punchReach","punchPower","kickReach","kickPower"));
    private static final int lowerBound = 1;  //inclusive
    private static final int upperBound = 10; //inclusive
    private static final Set<String> conditions = new HashSet<String>(Arrays.asList(
    "always","near","far","much_stronger","stronger","even","weaker","much_weaker"));    
    private static final Set<String> moves = new HashSet<String>(Arrays.asList(
    "walk_towards","walk_away","run_towards","run_away","jump","crouch","stand"));
    private static final Set<String> attacks = new HashSet<String>(Arrays.asList(
    "block_low","block_high","punch_low","punch_high","kick_low","kick_high"));
    
    // InvalidParameterException is used instead of RecognitionException, 
    //      since ANTLR catches the former.
    private void checkCharacteristic(String characteristic) throws InvalidParameterException {
        if(!characteristics.contains(characteristic))
            throw new InvalidParameterException(characteristic+" is invalid! "+
                                                  "Valid characteristics: "+characteristics);
    }
    
    private void checkCharacteristicRange(String valueText) throws InvalidParameterException {
        int value = -1;
        try{
            value = Integer.parseInt(valueText);
        }catch (NumberFormatException nfe){
            assert false; //the parser should only provide numbers
            throw new InvalidParameterException(valueText + " is not a number!");
        }
        
        if(value < lowerBound || value > upperBound)
            throw new InvalidParameterException(value+" is invalid! Valid values:"+lowerBound+"-"+upperBound);
    }
    
    private void checkCondition(String condition) throws InvalidParameterException {
        if(!conditions.contains(condition))
            throw new InvalidParameterException(condition+" is invalid! Valid conditions: "+conditions);
    }
    
    private void checkMove(String move)  throws InvalidParameterException {
        if(!moves.contains(move))
            throw new InvalidParameterException(move+" is invalid! Valid moves: "+moves);
    }
    
    private void checkAttack(String attack) throws InvalidParameterException {
        if(!attacks.contains(attack))
            throw new InvalidParameterException(attack+" is invalid! Valid moves: "+attacks);
    }
    
}

fighter:            name attributes;

name:               TEXT;
attributes:         (characteristic | behaviour_rule)*;

characteristic:     property value;
behaviour_rule:     condition move attack;

property:           TEXT                    {checkCharacteristic($TEXT.text);};
value:              NUMBER                  {checkCharacteristicRange($NUMBER.text);};
condition:          TEXT                    {checkCondition($TEXT.text);};
move:               TEXT                    {checkMove($TEXT.text);}
                  | CHOOSE t1=TEXT t2=TEXT  {checkMove($t1.text); checkMove($t2.text);};
attack:             TEXT                    {checkAttack($TEXT.text);}
                  | CHOOSE t1=TEXT t2=TEXT  {checkAttack($t1.text); checkAttack($t2.text);};
