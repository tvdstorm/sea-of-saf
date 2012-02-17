tree grammar FDLChecker; //Treewalker that checks Fighter Description Language

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
//  For they are intimately part of the checker, and are only used by the checker
//
//  Putting them in a seperate class will make a subroutine-class, and allows outside access:
//  which is bad abstraction and may increase coupling. The grammar should be interleaved with 
//  as little Java as possible, but the checks itself should be as close to it as possible.
//
//  (Eclipse's missing features can be mitigated by saving more often, and checking the generated java file)
@members {
    
    private DescribableFighter fighter;
    private List<InvalidAttributeMessage> failMsgs;
    private boolean alwaysConditionExists;
    private CommonTree name, lastAspect;
    
    /** Returns a message for every attribute in the AST that the given fighter considers invalid */
    public List<InvalidAttributeMessage> check(DescribableFighter fighter) throws RecognitionException {
        this.fighter = fighter;
        this.failMsgs = new LinkedList<InvalidAttributeMessage>();
        this.alwaysConditionExists = false;
        this.name = null;
        this.lastAspect = null;
        
        fighter(); //start checking at root
        
        if(!alwaysConditionExists){
            failMsgs.add(new InvalidAttributeMessage(name,"Please add an "+fighter.getAlwaysCondition()+"-rule."));
        }
        
        return failMsgs;
    }
    
   	private int toInt(String number){
        try{
            return Integer.parseInt(number);
        }catch (NumberFormatException nfe){
            assert false: "The parser should only provide numbers";
            System.err.println(number + " is not a number!");
            return Integer.MIN_VALUE;
        }
    }
    
    private void checkName(CommonTree node){
        if(!fighter.isValidName(node.getText())){
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validNames()));
        }
        name = node;
    }
    
    private void checkAspect(CommonTree node){
        if(!fighter.isValidAspect(node.getText())){
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validProperties()));
        }
        lastAspect = node;
    }
    
    private void checkValue(CommonTree node){
        if(!fighter.isValidPropertyValue(lastAspect.getText(), toInt(node.getText()))){
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validProperties()));
        }
    }
    
    private void checkCondition(CommonTree node){
        if(!fighter.isValidCondition(node.getText())){
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validBehaviour()));
        }else if(node.getText().equals(fighter.getAlwaysCondition())){
            alwaysConditionExists = true;
        }
    }
    
    private void checkMove(CommonTree node){
        if(!fighter.isValidMove(node.getText())){
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validBehaviour()));
        }
    }
    
    private void checkAttack(CommonTree node){
        if(!fighter.isValidAttack(node.getText())){
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validBehaviour()));
        }
    }
}

@rulecatch {
    catch (RecognitionException e) { 
        throw e; //Forward exceptions for custom error handling
    } 
}


fighter:            name attributes;

name:               IDENTIFIER                              {checkName($IDENTIFIER);};
attributes:         (property | behaviour)*;

property:           aspect value;
behaviour:          condition move attack;

aspect:             IDENTIFIER                              {checkAspect($IDENTIFIER);};
value:              NUMBER                                  {checkValue($NUMBER);};
condition:          andCondition (OR andCondition)*;
move:               IDENTIFIER                              {checkMove($IDENTIFIER);}
                  | CHOOSE i1=IDENTIFIER i2=IDENTIFIER      {checkMove($i1); checkMove($i2);};
attack:             IDENTIFIER                              {checkAttack($IDENTIFIER);}
                  | CHOOSE i1=IDENTIFIER i2=IDENTIFIER      {checkAttack($i1); checkAttack($i2);};
                  
andCondition:       atomicCondition (AND atomicCondition)*;
atomicCondition:    L_PAREN condition R_PAREN | IDENTIFIER  {checkCondition($IDENTIFIER);};
