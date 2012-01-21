grammar SAF;

options {
  language = Java;
}

@header {
  package nl.uva.lap.saf;
}

@lexer::header {
  package nl.uva.lap.saf;
}

fighter : IDENT '{' statement* '}'; 

statement : personalityStatement | behaviourStatement;

personalityStatement : personality '=' INTEGER;
personality : 'kickPower' | 'punchPower' | 'kickReach' | 'punchReach';

behaviourStatement : condition '[' actionStatement ']';
condition : 'far' | 'near' | 'stronger' | 'much_stronger' | 'weaker' | 'much_weaker' | 'always';

//possible todo: split in movement action and action-action. 
actionStatement : (action | ('choose' '(' action+ ')'))+; //note that choose is not recursive
action : 'kick_low' | 'kick_high' | 'punch_low' | 'punch_high' | 
	'run_away' | 'run_towards' | 'walk_away' | 'walk_towards' | 
	'stand' | 'crouch' |
	'block_low' | 'block_high'
	;

INTEGER : (('1' '0'?) | '2'..'9');
IDENT : ('0'..'9')*('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*; //ident has to have atleast one character

//ignore all whitespace and comments:
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT : '//' .* ('\n'|'\r') {$channel = HIDDEN;};
MULTICOMMENT : '/*' .* '*/' {$channel = HIDDEN;};