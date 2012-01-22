grammar SAF;

options {
  language = Java;
  output = AST;
}

@header {
  package nl.tamasja.uva.saf;
}

@lexer::header {
  package nl.tamasja.uva.saf;
}

// Ignore whitespaces, tabs, eol, etc by removing it from the default channel.
WS : (' ' | '\\t' | '\n' | '\r' | '\f' | '\t')+ {$channel = HIDDEN;};

bot :
  ident '{'
  (statistic|personality)*
  '}'
;


statistic : strength '=' fighter_stat;
personality : condition '[' move attack ']';


condition : ('stronger'|'weaker'|'much_stronger'|'much_weaker'|'even'|'near'|'far'|'always');
move      : ('jump'|'crouch'|'stand'|'run_towards'|'run_away'|'walk_towards'|'walk_away');
attack    : ('punch_low'|'punch_high'|'kick_low'|'kick_high'|'block_low'|'block_high');
strength  : ('punchReach'|'kickReach'|'kickPower'|'punchPower');


ident : IDENT;
//expression: INTEGER;
fighter_stat : FIGHTER_STAT;



IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;

FIGHTER_STAT : ('1'..'9'|'10');
/*
STRING : ('a'..'z' | 'A'..'Z')+;
INTEGER : '0'..'9'+;
IDENT : STRING(STRING|INTEGER)+;
*/

/*
chicken
{
  kickReach = 9
  punchReach = 1
  kickPower = 2
  punchPower = 2
  far [run_towards kick_low]
  near [run_away kick_low]
  near [crouch punch_low]
}
*/