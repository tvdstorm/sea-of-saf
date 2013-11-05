grammar SAF;

options {
  language = Java;
}

tokens {
  AND = 'and'; 
  OR = 'or';
  CHOOSE = 'choose';
}

@header {
  package saf.syntax;
  
  import java.util.List;
  import saf.ast.fighter.*;
  import saf.ast.action.*;
  import saf.ast.condition.*;
}

@lexer::header {
  package saf.syntax;
}

fighter returns [Fighter fighter]
  : STRING '{' personality behaviour '}' 
  { $fighter = new Fighter($STRING.text, $personality.personality, $behaviour.behaviour); }
  ;

personality returns [Personality personality]
  @init { List<Characteristic> characteristics = new ArrayList<Characteristic>(); }
  : ( STRING '=' INT { characteristics.add(new Characteristic($STRING.text, $INT.int)); } )* 
  { $personality = new Personality(characteristics); }
  ;

behaviour returns [Behaviour behaviour]
  @init { List<Rule> rules = new ArrayList<Rule>(); }
  : ( condition '[' (moveAction fightAction) ']' 
      { rules.add(new Rule($condition.cond, $moveAction.moveActions, $fightAction.fightActions)); } )* 
  { $behaviour = new Behaviour(rules); }
  ;

condition returns [Condition cond]
  : ( andCond { $cond = $andCond.cond; } )
  ;

andCond returns [Condition cond]
  : cond1 = orCond  { $cond = $cond1.cond; }
  ( AND cond2 = orCond { $cond = new And(cond, $cond2.cond); })*
  ;

orCond returns [Condition cond]
  : cond1 = atomCond { $cond = $cond1.cond; }
  ( OR cond2 = atomCond { $cond = new Or(cond, $cond2.cond); })*
  ;

atomCond returns [Condition cond]
  : (STRING { $cond = new Atom($STRING.text); })
  | ( '(' condition ')' { $cond = $condition.cond; } )
  ;

moveAction returns [MoveAction moveActions]
  @init { List<String> moves = new ArrayList<String>(); }
  : ( move = STRING { moves.add($move.text); }
  | CHOOSE '(' (moveChoice = STRING { moves.add($moveChoice.text); })+ ')') 
  { $moveActions = new MoveAction(moves); }
  ;

fightAction returns [FightAction fightActions]
  @init { List<String> fights = new ArrayList<String>(); }
  : ( fight = STRING { fights.add($fight.text); } 
  | CHOOSE '(' (fightChoice = STRING { fights.add($fightChoice.text); })+ ')')
  { $fightActions = new FightAction(fights); }
  ;

STRING
  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
  ;

INT
  : '0'..'9'+
  ;

WHITESPACE
  : ( ' '
    | '\t'
    | '\r'
    | '\n'
    ) {$channel=HIDDEN;}
  ;
