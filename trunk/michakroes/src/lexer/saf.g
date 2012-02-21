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
  { $s = new Strength($ID.text, $INT.int); }
;

behaviour returns[Behaviour b]
  @init { ArrayList<BehaviourRule> behaviourRules = new ArrayList<BehaviourRule>(); }
  : (behaviourrule { behaviourRules.add($behaviourrule.br); })+ 
  { $b = new Behaviour(behaviourRules); }
; 

behaviourrule returns[BehaviourRule br]
  : conditions '[' walkAction fightAction ']' 
    { $br = new BehaviourRule($conditions.c, $walkAction.wa, $fightAction.fa); } 
;  

conditions returns [Condition c]
  : atom { $c = $atom.atom;}
  | connective { $c = $connective.c; };
  
atom returns [Condition atom] 
  : ID 
  { $atom = new ConditionAction($ID.text); }
;

connective returns[Condition c] : (
    '(' lhs = conditions ')' op = ('and' | 'or') rhs = conditions
    | lhs = atom op = ('and' | 'or') '(' rhs = conditions ')'
    | lhs = atom op = ('and' | 'or') rhs = atom)
  { 
    if($op.text.equals("and"))
      c = new ConditionAnd(lhs, rhs);
    else
      c = new ConditionOr(lhs, rhs);
  };

walkAction returns[WalkAction wa]
  @init { List<String> walks = new ArrayList<String>(); }
  : (
      w1 = ID { walks.add($w1.text); } 
      | 
      CHOOSE '(' (w2 = ID { walks.add($w2.text); } )+ ')' 
    )
  { $wa = new WalkAction(walks); }
; 

fightAction returns[FightAction fa]
  @init { List<String> fights = new ArrayList<String>(); }
  : (
      f1 = ID { fights.add($f1.text); } 
      | 
      CHOOSE '(' (f2 = ID { fights.add($f2.text); } )+ ')' 
    ) 
  { $fa = new FightAction(fights); }
; 
