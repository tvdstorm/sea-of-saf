grammar saf;

options {
    language = Java;
}

@header { 
  package lexer;
  
  import java.util.List;
  import saf.*;
}

@lexer::header {
  package lexer;
}

/*--------------------------------------------------------------------------
 * LEXER RULES
 *--------------------------------------------------------------------------*/
CHOOSE  : ('choose')*;
INT : '0'..'9'+;
ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ; 
 
/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/
saf returns[Saf saf]
  : ID '{' personality behaviour '}' EOF 
  { $saf = new Saf($ID.text, $personality.p); }
  ;
personality returns[Personality p]
  @init { List<Strength> strengths = new ArrayList<Strength>(); }
  : (strength { strengths.add($strength.s); })+ 
  { $p = new Personality(strengths); }
  ; 
strength returns[Strength s]
  : ID '=' INT
  { $s = new Strength($ID.text, $INT.text); }
  ;
behaviour returns[Behaviour b]
  @init { List<BehaviourRule> behaviourRules = new ArrayList<BehaviourRule>(); }
  : (behaviourrule { behaviourRules.add($behaviourrule.br); })+ 
  { $b = new Behaviour(behaviourRules); }
  ; 
behaviourrule returns[BehaviourRule br]
  : ID '[' moveAction fightAction ']'
  { $br = new BehaviourRule(); }
  ;
moveAction
  : ID 
  | CHOOSE '(' (ID)+ ')';
fightAction
  : ID 
  | CHOOSE '(' (ID)+ ')';
 
