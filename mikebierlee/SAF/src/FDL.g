/* Copyright (c) 2012 Mike Bierlee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

grammar FDL;

options {
  language = Java;
}

@header {
  package nl.uva.saf.fdl;
  import nl.uva.saf.fdl.ast.*;
}

@lexer::header {
  package nl.uva.saf.fdl;
  import nl.uva.saf.fdl.ast.*;
}

WS : (' ' | '\t' | '\r' | '\n' | '\f')+ {$channel=HIDDEN;};
INTEGER : ('0'..'9')+;
CHOOSE : 'choose';
AND : 'and';
OR : 'or';
ASSIGN : '=';
ALWAYS : 'always';

CONDITIONTYPE : 'near'
              | 'far'
              | 'much_stronger'
              | 'stronger'
              | 'even'
              | 'weaker'
              | 'much_weaker'
              ;
              
MOVEACTION : 'walk_towards'
           | 'walk_away'
           | 'run_towards'
           | 'run_away'
           | 'jump'
           | 'crouch'
           | 'stand'
           ;
           
FIGHTACTION : 'block_low'
            | 'block_high'
            | 'punch_low'
            | 'punch_high'
            | 'kick_low'
            | 'kick_high'
            ;        
            
IDENT  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;  
 
personality returns [Characteristic result]
  : IDENT ASSIGN INTEGER {result = new Characteristic($IDENT.text, $INTEGER.text);}
  ;
                    
conditionAnd returns [ConditionAnd result]
  @init {
    result = new ConditionAnd(new ArrayList<String>());
  }
  : op1=CONDITIONTYPE (AND oprest=CONDITIONTYPE {result.addOperand($oprest.text);})* {result.addOperand($op1.text);}
  ;

conditionOr returns [ConditionOr result] 
  @init {
    result = new ConditionOr(new ArrayList<ConditionAnd>());
  }
  : op1=conditionAnd (OR oprest=conditionAnd {result.addOperand($oprest.result);})* {result.addOperand($op1.result);}
  ; 

moveChoice returns [MoveChoice result]
  @init {
    result = new MoveChoice(new ArrayList<Action>());
  }
  : CHOOSE '(' (MOVEACTION {result.addAction(new MoveAction($MOVEACTION.text));})+ ')'
  | MOVEACTION {result.addAction(new MoveAction($MOVEACTION.text));}
  ; 
  
fightChoice returns [FightChoice result]
  @init {
    result = new FightChoice(new ArrayList<Action>());
  }
  : CHOOSE '(' (FIGHTACTION {result.addAction(new FightAction($FIGHTACTION.text));})+ ')'
  | FIGHTACTION {result.addAction(new FightAction($FIGHTACTION.text));}
  ;

rule returns [Rule result] 
  : moveChoice fightChoice {result = new Rule($moveChoice.result, $fightChoice.result);}
  ;

behaviour returns [Behaviour result] 
  : conditionOr '[' rule ']' {result = new Behaviour($conditionOr.result, $rule.result);}
  | ALWAYS '[' rule ']' {result = new Behaviour(new ConditionAlways(), $rule.result);}
  ;
                  
fighterAttribute returns [FighterAttribute result]
  : personality   {result = $personality.result;}
  | behaviour     {result = $behaviour.result;}
  ;

fighter returns [Fighter result] 
  @init {
    result = new Fighter("",new ArrayList<FighterAttribute>());
  }
  : IDENT '{' (fighterAttribute {result.addAttribute($fighterAttribute.result);})* '}'   {result.setName($IDENT.text);}
  ;

parse returns [ITreeNode tree]
  : fighter EOF   {tree = $fighter.result;}
  ;