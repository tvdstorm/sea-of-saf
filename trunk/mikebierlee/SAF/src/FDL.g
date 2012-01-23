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
            
IDENT  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;  
 
characteristic returns [Characteristic result]
  : IDENT ASSIGN INTEGER {result = new Characteristic($IDENT.text, $INTEGER.text);}
  ;
                    
conditionAnd returns [ConditionAnd result]
  @init {
    ArrayList<String> operands = new ArrayList<String>();
  }
  : op1=IDENT {operands.add($op1.text);} (AND oprest=IDENT {operands.add($oprest.text);})* {result = new ConditionAnd(operands);}
  ;

conditionOr returns [ConditionOr result] 
  @init {
    ArrayList<ConditionAnd> operands = new ArrayList<ConditionAnd>();
  }
  : op1=conditionAnd {operands.add($op1.result);} (OR oprest=conditionAnd {operands.add($oprest.result);})* {result = new ConditionOr(operands);}
  ; 

moveChoice returns [MoveChoice result]
  @init {
    ArrayList<Action> actions = new ArrayList<Action>();
  }
  : CHOOSE '(' (IDENT {actions.add(new MoveAction($IDENT.text));})+ ')' {result = new MoveChoice(actions);}
  | IDENT {actions.add(new MoveAction($IDENT.text));} {result = new MoveChoice(actions);}
  ; 
  
fightChoice returns [FightChoice result]
  @init {
    ArrayList<Action> actions = new ArrayList<Action>();
  }
  : CHOOSE '(' (IDENT {actions.add(new FightAction($IDENT.text));})+ ')' {result = new FightChoice(actions);}
  | IDENT {actions.add(new FightAction($IDENT.text));} {result = new FightChoice(actions);}
  ;

rule returns [Rule result] 
  : moveChoice fightChoice {result = new Rule($moveChoice.result, $fightChoice.result);}
  ;

behaviour returns [Behaviour result] 
  : conditionOr '[' rule ']' {result = new Behaviour($conditionOr.result, $rule.result);}
  | ALWAYS '[' rule ']' {result = new Behaviour(new ConditionAlways(), $rule.result);}
  ;
                  
fighterAttribute returns [FighterAttribute result]
  : characteristic   {result = $characteristic.result;}
  | behaviour     {result = $behaviour.result;}
  ;

fighter returns [Fighter result] 
  @init {
    ArrayList<FighterAttribute> attributes = new ArrayList<FighterAttribute>();
  }
  : IDENT '{' (fighterAttribute {attributes.add($fighterAttribute.result);})* '}'   {result = new Fighter($IDENT.text, attributes);}
  ;

parse returns [ITreeNode tree]
  : fighter EOF   {tree = $fighter.result;}
  ;