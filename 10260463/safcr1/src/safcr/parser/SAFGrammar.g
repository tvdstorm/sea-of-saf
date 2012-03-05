grammar SAFGrammar;

options {
  language = Java;
}

tokens{
	  CHOOSE = 'choose';
}

@header {
package safcr.parser;
import safcr.ast.*;
}

@lexer::header {
package safcr.parser;
}

saf returns [Saf s]
    :   {$s = new Saf();}
        (b=bot {$s.addBot($b.bot);})* EOF 
    ;

bot returns [Bot bot]
    :   i=ID
        '{'
        p=personality
        b=behaviour 
        '}'
        {$bot = new Bot($i.text, $p.p, $b.b);}
    ;
    
personality returns [Personality p]
    :   {$p = new Personality();}
        (c=characteristic {$p.addCharacteristic($c.c);})* 
    ;

characteristic returns [Characteristic c]
    :   i=ID '=' t=INT {$c = new Characteristic($i.text,Integer.parseInt($t.text));}
    ;
    
behaviour returns [Behaviour b]
    :   {$b = new Behaviour();}
        (r=rule {$b.addRule($r.r);})*
    ;

rule returns [Rule r]
    :   c=statement a=action {$r = new Rule($c.n,$a.a);}
    ;

action returns [Action a]
    :   '[' 
        a1=action_type {$a = new Action($a1.n);}
        (a2=action_type {$a.addActionType2(a2);})? 
        ']'
    ;
    
action_type returns [Node n]
    :   
    i=ID {$n = new ActionType($i.text);}
    |   (CHOOSE '(' i1=ID  i2=ID ')') {$n = new MultiActionType($i1.text,$i2.text);}
    ;
    
statement returns [Node n]
    :   o=or_statement {$n = $o.n;}
    ;
    
or_statement returns [Node n]    
    :   a1=and_statement {$n = $a1.n;}
       (OR a2=and_statement {$n = new Or($n, $a2.n);})*
    ;
    
and_statement returns [Node n]
    :   c1=condition  {$n = $c1.n;}
       (AND c2=condition {$n = new And($n, $c2.n);})*
    ;
    		
condition returns [Node n]
    :   i=ID {$n = new Condition($i.text);}
    |   '(' s=statement ')'{$n = $s.n;}
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