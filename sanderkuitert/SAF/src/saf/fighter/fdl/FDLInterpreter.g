tree grammar FDLInterpreter;

options {
    language = Java;
    tokenVocab = FDL;
    ASTLabelType = CommonTree;
}

@header{
    package saf.fighter.fdl;
    
    import java.util.LinkedList;
    
}

@members {

    private DescribableFighter fighter = null;
    private String lastProperty = null;
    private String lastCondition = null;
    private String lastMove = null;
    private String lastMoveAlternative = null;
    
    public void applyAttributes(DescribableFighter fighter) throws RecognitionException {
        this.fighter = fighter;

        fighter(); //start interpreting
    }
    
    private void setName(String name){
        fighter.setName(name);
    }
    
    private void addCharacteristic(String property, String valueText){
        int value;
        try{
            value = Integer.parseInt(valueText);
        }catch (NumberFormatException nfe){
            assert false: "NumberFormatException should already have occurred in the checker";
            return;
        }
        
        fighter.addCharacteristic(property,value);
    }
    
    private void addBehaviour(String condition, String move1, String move2, String attack1, String attack2){

          List<String> moves   = new LinkedList<String>();
          moves.add(move1);
          if(move2!=null){ moves.add(move2); }
          
          List<String> attacks = new LinkedList<String>();
          attacks.add(attack1);
          if(attack2!=null){ attacks.add(attack2); }
            
          fighter.addBehaviour(condition, moves, attacks);
    }
    
}

fighter:            name attributes;

name:               TEXT                        {setName($TEXT.text);};
attributes:         (characteristic | behaviour_rule)*;

characteristic:     property value;
behaviour_rule:     condition move attack;

property:           TEXT                        {lastProperty=$TEXT.text;};
value:              NUMBER                      {addCharacteristic(lastProperty,$NUMBER.text);};
condition:          TEXT                        {lastCondition=$TEXT.text;};
move:               TEXT                        {lastMove=$TEXT.text;   lastMoveAlternative=null;}
                  | CHOOSE t1=TEXT t2=TEXT      {lastMove=$t1.text;     lastMoveAlternative=$t2.text;};
attack:             TEXT                        {addBehaviour(lastCondition,lastMove,lastMoveAlternative,$TEXT.text,null);}
                  | CHOOSE t1=TEXT t2=TEXT      {addBehaviour(lastCondition,lastMove,lastMoveAlternative,$t1.text,$t1.text);};
