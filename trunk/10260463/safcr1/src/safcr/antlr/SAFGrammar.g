grammar SAFGrammar;

options {
  language = Java;
}

tokens{
	  CHOOSE = 'choose';
}

@header {
package safcr.antlr;
import safcr.ast.*;
}

@lexer::header {
package safcr.antlr;
}

saf returns [Node n]
    :   {$n = new Saf();}
        (bot {$n.addNode($bot.n);})* EOF 
    ;

bot returns [Node n]
    :   i1=ID
        '{'
        personality
        behaviour 
        '}'
        {$n = new Bot($i1.text, $personality.n, $behaviour.n);}
    ;
    
personality returns [Node n]
    :   {$n = new Personality();}
        (characteristic {$n.addNode($characteristic.n);})* 
    ;

characteristic returns [Node n]
    :   i1=ID '=' i2=INT {$n = new Characteristic($i1.text,Integer.parseInt($i2.text));}
    ;
    
behaviour returns [Node n]
    :   {$n = new Behaviour();}
        (expression {$n.addNode($expression.n);})*
    ;
    
expression returns [Node n]
    :   and_expr {$n = $and_expr.n;}
    ;
    
and_expr returns [Node n]
    :   i1=or_expr {$n = $i1.n;}
        (AND i2=and_expr {$n = new And($n, $i2.n);})*
    ;
    
or_expr returns [Node n]
    :   rule  {$n = $rule.n;}
        (OR expression {$n = new Or($n, $expression.n);})*
    ;

rule returns [Node n]
    :   condition action {$n = new Rule($condition.n,$action.n);}
    ;

action returns [Node n]
    :   '[' 
        a1=action_type {$n = new Action($a1.n);}
        (a2=action_type {$n.addNode(a2);})? 
        ']'
    ;
    		
condition returns [Node n]
    :   ID {$n = new Condition($ID.text);}
    ;

action_type returns [Node n]
    :   ID {$n = new ActionType($ID.text);}
    |   (CHOOSE '(' i1=ID  i2=ID ')') {$n = new MultiActionType($i1.text,$i2.text);}
    ;

// General tokens
AND: ('and' | 'AND' | '&&') ;
OR: ('or' | 'OR' | '||') ;

fragment LETTER : ('a'..'z' |'A'..'Z' ) ;
fragment UNDERSCORE : '_';
fragment DIGIT  : '0'..'9' ;

ID  : LETTER (LETTER | UNDERSCORE | DIGIT)* ;
INT : DIGIT+ ;

WS  : (' ' |'\t' |'\n' |'\r' |'\f' )+ {$channel = HIDDEN;} ;
COMMENT : '//' .* ('\n' | '\r') {$channel = HIDDEN;} ;
MULTILINE_COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;