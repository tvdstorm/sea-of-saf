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
  output = AST;
  ASTLabelType = CommonTree;
}

@header {
  package nl.uva.saf.fdl;
}

@lexer::header {
  package nl.uva.saf.fdl;
}

WS : (' ' | '\t' | '\r' | '\n' | '\f')+ {$channel=HIDDEN;};

INTEGER : ('0'..'9')+;

IDENT  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

characteristic : 'kickPower'
               | 'kickReach'
               | 'punchPower'
               | 'punchReach'
               ;
                
conditionType : 'always'
              | 'near'
              | 'far'
              | 'much_stronger'
              | 'stronger'
              | 'even'
              | 'weaker'
              | 'much_weaker'
              ;
              
moveAction : 'walk_towards'
           | 'walk_away'
           | 'run_towards'
           | 'run_away'
           | 'jump'
           | 'crouch'
           | 'stand'
           ;
           
fightAction : 'block_low'
            | 'block_high'
            | 'punch_low'
            | 'punch_high'
            | 'kick_low'
            | 'kick_high'
            ;          

fighterName : IDENT;
 
personality : characteristic '='! INTEGER;

conditionExpression : conditionType 'and'! conditionExpression
                    | conditionType 'or'! conditionExpression
                    | conditionType
                    ;

moveChoice : 'choose'! '('! moveAction+ ')'!;
fightChoice : 'choose'! '('! fightAction+ ')'!;
moveRule : moveAction | moveChoice;
fightRule : fightAction | fightChoice;
rules : moveRule fightRule;

behaviour : conditionExpression '['! rules ']'!;
                  
fighterAttribute : personality | behaviour;

fighter : fighterName '{'! fighterAttribute* '}'!;