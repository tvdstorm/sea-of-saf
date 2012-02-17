tree grammar FDLInterpreter; //Treewalker that interprets Fighter Description Language, adding atributes

options {
    language = Java;
    tokenVocab = FDL;
    ASTLabelType = CommonTree;
}

@header{
    package saf.fighter.fdl;
    
    import java.util.Arrays;
    import java.util.LinkedList;
}

@members {
    
    private final static String OR_ENCODING = "or";
    private final static String AND_ENCODING = "and";
    
    private DescribableFighter fighter = null;
    private String lastAspect = null;
    private List<String> conditions = null;
    private List<String> lastMoves = null;

    
    /** Add attributes to given fighter */
    public void applyAttributes(DescribableFighter fighter) throws RecognitionException {
        this.fighter = fighter;
        this.conditions = new LinkedList<String>();
        
        fighter(); //start interpreting at root
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
    
}

@rulecatch {
    catch (RecognitionException e) { 
        throw e; //Forward exceptions for custom error handling
    } 
}


fighter:            name attributes;

name:               IDENTIFIER                          {fighter.setName($IDENTIFIER.text);};
attributes:         (property | behaviour)*;

property:           aspect value;
behaviour:          condition move attack               {conditions.clear();};

aspect:             IDENTIFIER                          {lastAspect=$IDENTIFIER.text;};
value:              NUMBER                              {fighter.addProperty(lastAspect,toInt($NUMBER.text));};
condition:          andCondition (OR andCondition)*     { if($OR!=null){conditions.add($OR.text);} };
move:               i1=IDENTIFIER                       {lastMoves = Arrays.asList($i1.text);}
                  | CHOOSE i1=IDENTIFIER i2=IDENTIFIER  {lastMoves = Arrays.asList($i1.text,$i2.text);};
attack:             i1=IDENTIFIER                       {fighter.addBehaviour(conditions,lastMoves,Arrays.asList($i1.text));}
                  | CHOOSE i1=IDENTIFIER i2=IDENTIFIER  {fighter.addBehaviour(conditions,lastMoves,Arrays.asList($i1.text,$i2.text));};
                  
andCondition:       atomicCondition (AND atomicCondition)*  { if($AND!=null){conditions.add($AND.text);} };
atomicCondition:    L_PAREN condition R_PAREN 
                  | IDENTIFIER                          {conditions.add($IDENTIFIER.text);};
