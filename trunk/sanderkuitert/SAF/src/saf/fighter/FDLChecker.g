tree grammar FDLChecker;

options {
  language = Java;
  tokenVocab = FDL;
  ASTLabelType = CommonTree;
}

@header{
    package saf.fighter;
}

// Propagate exceptions upwards (by rethrowing them); replaces ANTLR's exception handling
//@rulecatch { 
//    catch (RecognitionException e) { 
//        throw e; 
//    } 
//}

@members {
    
    //TODO Make own subclass of RecognitionException (include valid options)
    
    
    //TODO Generalize; use following code:
    // public static final Set<String> properties = new HashSet<String>(Arrays.asList(
    //                                   {"punchReach","punchPower","kickReach","kickPower"}));
    // properties.contains(prop);
    //TODO Move constants to PlaySAF?
    private void checkProperty(String prop){
        if(!(       prop.equals("punchReach")
                ||  prop.equals("punchPower")
                ||  prop.equals("kickReach")
                ||  prop.equals("kickPower")        )){
                
//            throw new Exception
            System.err.println(prop+"is an invalid characteristic!");            
        }
    }
    private void checkValue(String text){
        int val = -1;
        try{
            val = Integer.parseInt(text);
        }catch (NumberFormatException nfe){
            assert false; //Parser should only provide numbers
//            throw new Exception(text+" is not a number!");
        }
        
        if(val < 1 || val > 10){
//            throw new Exception
            System.err.println(val+" is an invalid value! Valid: 1-10");
        }
    }
    private void checkCondition(String cond){
        if(!(       cond.equals("always")
                ||  cond.equals("near")
                ||  cond.equals("far")
                ||  cond.equals("much_stronger")
                ||  cond.equals("stronger")
                ||  cond.equals("even")
                ||  cond.equals("weaker")
                ||  cond.equals("much_weaker")      )){
                
//            throw new Exception
            System.err.println(cond+" is an invalid condition!"); 
        }
    }
    private void checkMove(String move){
        if(!(       move.equals("walk_towards")
                ||  move.equals("walk_away")
                ||  move.equals("run_towards")
                ||  move.equals("run_away")
                ||  move.equals("jump")
                ||  move.equals("crouch")
                ||  move.equals("stand")            )){
                
//            throw new Exception
            System.err.println(move+" is an invalid move!"); 
        }
    }
    private void checkAttack(String att){
        if(!(       att.equals("block_low")
                ||  att.equals("block_high")
                ||  att.equals("punch_low")
                ||  att.equals("punch_high")
                ||  att.equals("kick_low")
                ||  att.equals("kick_high")         )){
                
//            throw new Exception
            System.err.println(att+" is an invalid attack!"); 
        }
    }
}


saf:                name attributes;

name:               TEXT;
attributes:         L_CURLY_BRACKET (characteristic | behaviour_rule)* R_CURLY_BRACKET;

characteristic:     property IS value;      //{throw new RecognitionException();};//DEBUG
behaviour_rule:     condition L_BRACKET move attack R_BRACKET; 

property:           TEXT                    {checkProperty($TEXT.text);};
value:              NUMBER                  {checkValue($NUMBER.text);};
condition:          TEXT                    {checkCondition($TEXT.text);};
move:               TEXT                    {checkMove($TEXT.text);}
                  | CHOOSE L_PAREN t1=TEXT t2=TEXT R_PAREN 
                                            {checkMove($t1.text); checkMove($t2.text);};
attack:             TEXT                    {checkAttack($TEXT.text);}
                  | CHOOSE L_PAREN t1=TEXT t2=TEXT R_PAREN 
                                            {checkAttack($t1.text); checkAttack($t2.text);};
