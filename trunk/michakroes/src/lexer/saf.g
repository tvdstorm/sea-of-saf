grammar saf;

options {
    language = Java;
}

tokens {
  CHOOSE = 'choose';
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
  { $saf = new Saf($ID.text, $personality.p, $behaviour.b); }
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
  : ID '[' walkAction fightAction ']'
  { $br = new BehaviourRule(new Condition($ID.text), $walkAction.wa, $fightAction.fa); }
;  
walkAction returns[WalkAction wa]
  @init { List<String> walks = new ArrayList<String>(); }
  : (
      w1 = ID { walks.add($w1.text); } | 
      CHOOSE '(' (w2 = ID { walks.add($w2.text); } )+ ')' 
    )
  { $wa = new WalkAction(walks); }
; 
fightAction returns[FightAction fa]
  @init { List<String> fights = new ArrayList<String>(); }
  : (
      f1 = ID { fights.add($f1.text); } | 
      CHOOSE '(' (f2 = ID { fights.add($f2.text); } )+ ')' 
    ) 
  { $fa = new FightAction(fights); }
; 
