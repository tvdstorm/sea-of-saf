tree grammar FDLInterpreter;

options {
    language = Java;
    tokenVocab = FDL;
    ASTLabelType = CommonTree;
}

@header{
    package saf.fdl;
    
    import java.util.LinkedList;
    
    import saf.Fighter;
}

@members {

    private Fighter fighter = null;    
    private String lastProperty = null;
    private String lastCondition = null;
    private String lastMove = null;
    private String lastMoveAlternative = null;
    
    public void applyAttributes(Fighter fighter){
        this.fighter = fighter;
        try {
              fighter(); //start interpreting
        } catch (RecognitionException e) {
              assert false;
              e.printStackTrace();
        }
    }
    
    private void setName(String name){
        fighter.setName(name);
    }
    
    private void setCharacteristic(String property, String valueText){
        int value = -1;
        try{
            value = Integer.parseInt(valueText);
        }catch (NumberFormatException nfe){
            assert false;           //this should already have occurred in the checker
            nfe.printStackTrace();
            System.exit(1);
        }
        
        fighter.setCharacteristic(property,value);
    }
    
    private void setBehaviour(String condition, String move1, String move2, String attack1, String attack2){
        List<String> moves   = new LinkedList<String>();
        List<String> attacks = new LinkedList<String>();
        moves.add(move1);   attacks.add(attack1);
        moves.add(move2);   attacks.add(attack2);  //move2 & attack2 might be null
        
        //awkward indentation for better readability
             if(move2 == null && attack2 == null) fighter.setBehaviour(condition, move1, attack1);
        else if(move2 == null && attack2 != null) fighter.setBehaviour(condition, move1, attacks);
        else if(move2 != null && attack2 == null) fighter.setBehaviour(condition, moves, attack1);
        else if(move2 != null && attack2 != null) fighter.setBehaviour(condition, moves, attacks);
    }
    
}

fighter:            name attributes;

name:               TEXT                        {setName($TEXT.text);};
attributes:         (characteristic | behaviour_rule)*;

characteristic:     property value;
behaviour_rule:     condition move attack;

property:           TEXT                        {lastProperty=$TEXT.text;};
value:              NUMBER                      {setCharacteristic(lastProperty,$NUMBER.text);};
condition:          TEXT                        {lastCondition=$TEXT.text;};
move:               TEXT                        {lastMove=$TEXT.text;   lastMoveAlternative=null;}
                  | CHOOSE t1=TEXT t2=TEXT      {lastMove=$t1.text;     lastMoveAlternative=$t2.text;};
attack:             TEXT                        {setBehaviour(lastCondition,lastMove,lastMoveAlternative,$TEXT.text,null);}
                  | CHOOSE t1=TEXT t2=TEXT      {setBehaviour(lastCondition,lastMove,lastMoveAlternative,$t1.text,$t1.text);};
