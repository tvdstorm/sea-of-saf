grammar SAF;

options {
  language = Java;
  output = AST;
}

@header {
  package nl.tamasja.uva.saf;
  import nl.tamasja.uva.saf.bot.*;
}

@lexer::header {
  package nl.tamasja.uva.saf;
}

// Ignore whitespaces, tabs, eol, etc by removing it from the default channel.
WS : (' ' | '\\t' | '\n' | '\r' | '\f' | '\t')+ {$channel = HIDDEN;};


parse returns [FighterBot fighterBot]:
  bot EOF {$fighterBot = $bot.fighterBot;}
;

bot returns [FighterBot fighterBot]:
  ident '{'
  properties personalities {$fighterBot = new FighterBot($ident.text,$properties.fighterProperties,$personalities.fighterPersonalities);}
  '}'
;


properties returns [FighterProperties fighterProperties]
@init
    {
      $fighterProperties = new FighterProperties();
    }
    : (property {$fighterProperties.Add($property.fighterProperty);})+;

property returns [FighterProperty fighterProperty] : strength '=' fighter_stat { $fighterProperty = new FighterProperty($strength.text,Integer.parseInt($fighter_stat.text)); };


personalities returns [FighterPersonalities fighterPersonalities]
@init
    {
      $fighterPersonalities = new FighterPersonalities();
    }
    : (personality {$fighterPersonalities.Add($personality.fighterPersonality);})+; 
       
personality returns [FighterPersonality fighterPersonality] : condition '[' move attack ']' {$fighterPersonality = new FighterPersonality($condition.text,$move.text,$attack.text);};


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