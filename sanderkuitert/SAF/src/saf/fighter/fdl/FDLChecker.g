tree grammar FDLChecker;

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
    
    private DescribableFighter fighter;
    private List<InvalidAttributeMessage> failMsgs;
    
    public List<InvalidAttributeMessage> check(DescribableFighter fighter)
                                                            throws RecognitionException {
        this.fighter = fighter;
        this.failMsgs = new LinkedList<InvalidAttributeMessage>();
        
        fighter(); //start checking
        
        return failMsgs;
    }
    
    private void checkName(CommonTree node){
        if(!fighter.isValidName(node.getText()))
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validNames()));
    }
    
    private void checkProperty(CommonTree node){
        if(!fighter.isValidProperty(node.getText()))
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validCharacteristics()));
    }
    
    private void checkPropertyRange(CommonTree node){
        if(!fighter.isValidPropertyValue(parseNumber(node.getText())))
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validCharacteristics()));
    }
    
    private void checkCondition(CommonTree node){
        if(!fighter.isValidCondition(node.getText()))
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validBehaviour()));
    }
    
    private void checkMove(CommonTree node){
        if(!fighter.isValidMove(node.getText()))
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validBehaviour()));
    }
    
    private void checkAttack(CommonTree node){
        if(!fighter.isValidAttack(node.getText()))
            failMsgs.add(new InvalidAttributeMessage(node, fighter.validBehaviour()));
    }
    
    private int parseNumber(String number){
        try{
            return Integer.parseInt(number);
        }catch (NumberFormatException nfe){
            assert false: "The parser should only provide numbers";
            System.err.println(number + " is not a number!");
            return Integer.MIN_VALUE;
        }
    }
}

fighter:            name attributes;

//TODO name: change TEXT into property?
name:               TEXT                   {checkName($TEXT);};
attributes:         (characteristic | behaviour_rule)*;

characteristic:     property value;
behaviour_rule:     condition move attack;

property:           TEXT                    {checkProperty($TEXT);};
value:              NUMBER                  {checkPropertyRange($NUMBER);};
condition:          TEXT                    {checkCondition($TEXT);};
move:               TEXT                    {checkMove($TEXT);}
                  | CHOOSE t1=TEXT t2=TEXT  {checkMove($t1); checkMove($t2);};
attack:             TEXT                    {checkAttack($TEXT);}
                  | CHOOSE t1=TEXT t2=TEXT  {checkAttack($t1); checkAttack($t2);};
