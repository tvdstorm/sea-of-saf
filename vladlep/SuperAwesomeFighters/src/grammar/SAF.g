grammar SAF;

options {
  language = Java;
}

@header {
package reader.antlr;
  import fighter.*;
}

@lexer::header {
package reader.antlr;
}

fighter returns [Bot bot]
  :
  IDENT '{' personality behaviour 
                                  {
                                   bot = new Bot($IDENT.getText(), $personality.personality, $behaviour.behaviour);                  
                                  }
  '}'
  ;

personality returns [Personality personality]
  :
  
   {
    personality = new Personality();
    Caracteristic caracteristic = new Caracteristic();
    personality.addCaracteristic(caracteristic);
   }
  (STRENGTHS '=' TWODIGITS 
                           {
                            if ($STRENGTHS.getText().equals("punchReach")) {
                                              	caracteristic.setPunchReach(Integer.parseInt($TWODIGITS.text));
                            }
                            if ($STRENGTHS.text.equals("punchPower")) {
                            	caracteristic.setPunchPower(Integer.parseInt($TWODIGITS.text));
                            }
                            if ($STRENGTHS.text.equals("kickReach")) {
                            	caracteristic.setKickReach(Integer.parseInt($TWODIGITS.text));
                            }
                            if ($STRENGTHS.text.equals( "kickPower")) {
                            	caracteristic.setKickPower(Integer.parseInt($TWODIGITS.text));
                            }
                            ;
                           })*
  ;

behaviour returns [Behaviour behaviour]
  :
  {
  behaviour = new Behaviour();
  }
  (
    (
      (CONDITIONS
      | (CONDITIONS 'and' CONDITIONS)
      | (CONDITIONS 'or' CONDITIONS))*
    )
    '['
    (
      MOVES
      | ('choose(' MOVES MOVES ')')
    )
    (
      ATTACKS
      | 'choose(' ATTACKS ATTACKS ')'
    )
    ']'
  )*
  'always' '[' MOVES ATTACKS ']'
  ;

CONDITIONS: ('stronger' | 'weaker'|' much_stronger'|'much_weaker' | 'even' | 'near' | 'far' | 'always');
MOVES: ('jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away');
ATTACKS : ('punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high');
STRENGTHS : ('punchReach' | 'kickReach' | 'kickPower' | 'punchPower');

IDENT : ('A'..'Z'|'a'..'z')('0'..'9'|'A'..'Z'|'a'..'z')*;

TWODIGITS
  :
  '0'..'9' ('0'..'9')?
  ;

//parse comments and whitespaces to a hidden channel

WHITESPACE : ( '\t' | ' ' | '\r' | '\n' )+    { $channel = HIDDEN; } ;

COMMENTS
    :   ('/*' (options {greedy=false;} : .)* '*/' || '//'.* ('\n'|'\r') ){$channel=HIDDEN;}
    ;
