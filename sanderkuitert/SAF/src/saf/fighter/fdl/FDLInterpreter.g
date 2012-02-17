tree grammar FDLInterpreter; //Treewalker that interprets Fighter Description Language, adding atributes

options {
    language = Java;
    tokenVocab = FDL;
    ASTLabelType = CommonTree;
}

@header{
    package saf.fighter.fdl;
    
    import java.util.LinkedList;
    
}

//MAINTENANCE NOTE: keep these methods here in @members (don't extract them)
//  For they are intimately part of the interpreter, and are only used by the interpreter
//
//  Putting them in a seperate class will make a subroutine-class, and allows outside access:
//  which is bad abstraction and may increase coupling. The grammar should be interleaved with 
//  as little Java as possible, but the applying methods should be as close to it as possible.
//
//  (Eclipse's missing features can be mitigated by saving more often, and checking the generated java file)
@members {
    
    private DescribableFighter fighter = null;
    private String lastAspect = null;
    private List<String> lastConditions = null;
    private String lastMove = null;
    private String lastMoveAlternative = null;
    
    /** Add attributes to given fighter */
    public void applyAttributes(DescribableFighter fighter) throws RecognitionException {
        this.fighter = fighter;
        this.lastConditions = new LinkedList<String>();
        
        fighter(); //start interpreting at root
    }
    
    private void setName(String name){
        fighter.setName(name);
    }
    
    private void addProperty(String aspect, String valueText){
        int value;
        try{
            value = Integer.parseInt(valueText);
        }catch (NumberFormatException nfe){
            assert false: "The parser should only provide numbers";
            return;
        }
        
        fighter.addProperty(aspect,value);
    }
    
    private void addBehaviour(List<String> conditions, String move1, String move2, String attack1, String attack2){
          List<String> moves   = new LinkedList<String>();
          List<String> attacks = new LinkedList<String>();
                    
          moves.add(move1);
          if(move2!=null){ moves.add(move2); }

          attacks.add(attack1);
          if(attack2!=null){ attacks.add(attack2); }
            
          fighter.addBehaviour(conditions, moves, attacks);
    }
    
}

@rulecatch {
    catch (RecognitionException e) { 
        throw e; //Forward exceptions for custom error handling
    } 
}


fighter:            name attributes;

name:               IDENTIFIER                          {setName($IDENTIFIER.text);};
attributes:         (property | behaviour)*;

property:           aspect value;
behaviour:          condition move attack               {lastConditions = new LinkedList<String>();};

aspect:             IDENTIFIER                          {lastAspect=$IDENTIFIER.text;};
value:              NUMBER                              {addProperty(lastAspect,$NUMBER.text);};
condition:          andCondition (OR andCondition)*;
move:               i1=IDENTIFIER                       {lastMove=$i1.text;   lastMoveAlternative=null;}
                  | CHOOSE i1=IDENTIFIER i2=IDENTIFIER  {lastMove=$i1.text;   lastMoveAlternative=$i2.text;};
attack:             i1=IDENTIFIER                       {addBehaviour(lastConditions,lastMove,lastMoveAlternative,$i1.text,null);}
                  | CHOOSE i1=IDENTIFIER i2=IDENTIFIER  {addBehaviour(lastConditions,lastMove,lastMoveAlternative,$i1.text,$i2.text);};
                  
andCondition:       atomicCondition (AND atomicCondition)*;
atomicCondition:    L_PAREN condition R_PAREN 
                  | IDENTIFIER                          {lastConditions.add($IDENTIFIER.text);};
