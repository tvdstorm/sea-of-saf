grammar SAF;

options {
  language = Java;
}
@header {
  package reader.antlr;
}

@lexer::header{
package reader.antlr;
} 
fighter 
	: IDENT '{'
	(STRENGTHS '='TWODIGITS)* 
	( (CONDITIONS | ( CONDITIONS 'and' CONDITIONS) | ( CONDITIONS 'or' CONDITIONS))
	'[' (MOVES | ( 'choose(' MOVES MOVES')') ) 
	(ATTACKS | 'choose('ATTACKS ATTACKS ')')']' )*
	'always' '[' MOVES ATTACKS ']'
	'}';


CONDITIONS: ('stronger' | 'weaker'|' much_stronger'|'much_weaker' | 'even' | 'near' | 'far' | 'always');
MOVES: ('jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away');
ATTACKS : ('punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high');
STRENGTHS : ('punchReach' | 'kickReach' | 'kickPower' | 'punchPower');


IDENT : ('A'..'Z'|'a'..'z')('0'..'9'|'A'..'Z'|'a'..'z')*;
TWODIGITS : '0'..'9'('0'..'9')?;
 
//parse comments and whitespaces to a hidden channel 
WHITESPACE : ( '\t' | ' ' | '\r' | '\n' )+    { $channel = HIDDEN; } ;
COMMENTS
    :   ('/*' (options {greedy=false;} : .)* '*/' || '//'.* ('\n'|'\r') ){$channel=HIDDEN;}
    ;