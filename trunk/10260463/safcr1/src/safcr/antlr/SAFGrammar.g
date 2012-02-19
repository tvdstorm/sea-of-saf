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
        (b=bot {$n.addNode($b.n);})* EOF 
    ;

bot returns [Node n]
    :   i=ID
        '{'
        p=personality
        b=behaviour 
        '}'
        {$n = new Bot($i.text, $p.n, $b.n);}
    ;
    
personality returns [Node n]
    :   {$n = new Personality();}
        (c=characteristic {$n.addNode($c.n);})* 
        {$n.addNode(null);}
    ;

characteristic returns [Node n]
    :   i=ID '=' t=INT {$n = new Characteristic($i.text,Integer.parseInt($t.text));}
    ;
    
behaviour returns [Node n]
    :   {$n = new Behaviour();}
        (s=statement {$n.addNode($s.n);})*
    ;
    
statement returns [Node n]
    :   o=or_statement {$n = $o.n;}
    ;
    
or_statement returns [Node n]    
    :   a=and_statement {$n = $a.n;}
       (OR o=or_statement {$n = new Or($n, $o.n);})*
    ;
    
and_statement returns [Node n]
    :   r=rule  {$n = $r.n;}
       (AND o=statement {$n = new And($n, $o.n);})*
    ;

rule returns [Node n]
    :   c=condition a=action {$n = new Rule($c.n,$a.n);}
    ;

action returns [Node n]
    :   '[' 
        a1=action_type {$n = new Action($a1.n);}
        (a2=action_type {$n.addNode(a2);})? 
        ']'
    ;
    		
condition returns [Node n]
    :   i=ID {$n = new Condition($i.text);}
    ;

action_type returns [Node n]
    :   i=ID {$n = new ActionType($i.text);}
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