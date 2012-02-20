grammar SAF;


options {
  language = Java;
  output = AST;
}


@header {
  package nl.tamasja.uva.saf.grammar;
  import nl.tamasja.uva.saf.tree.ast.*;
  import java.util.ArrayList;
}

@lexer::header {
  package nl.tamasja.uva.saf.grammar;
  
}

// Ignore whitespaces, tabs, eol, etc by removing it from the default channel.
WS : (' ' | '\\t' | '\n' | '\r' | '\f' | '\t')+ {$channel = HIDDEN;};



parse returns [Fighter fighter]:
  fighter EOF {$fighter = $fighter.fighter;}
;

fighter returns [Fighter fighter]: 
  ident 
  '{'
   properties {$fighter = new Fighter($ident.text,$properties.properties);}
  '}'
;

properties returns [ArrayList<IProperty> properties]
@init
    {
      $properties = new ArrayList<IProperty>();
    }
:
  (strength {$properties.add($strength.strength);}
  |
  behaviour {$properties.add($behaviour.behaviour);} )*
;


strength returns [Strength strength] :
  ident '=' FIGHTER_STRENGTH {$strength = new Strength($ident.text,Integer.parseInt($FIGHTER_STRENGTH.text)); }
;

behaviour returns [Behaviour behaviour]:
  condition '[' moveAction=action fightAction=action ']' {$behaviour = new Behaviour($condition.condition,$moveAction.action,$fightAction.action);}
;

action returns [IAction action]: 
  ident {$action = new ActionAtom($ident.text);}
  | choice {$action = new ChooseAction($choice.actionList);}
;

choice returns [ArrayList<IAction> actionList]
@init
    {
      $actionList = new ArrayList<IAction>();
    }
:
  'choose(' (ident {$actionList.add( new ActionAtom($ident.text) );} )+ ')'
;


parse2:
  condition EOF!
;



condition returns [ICondition condition]:
  orCondition {$condition = $orCondition.condition;}
;

orCondition returns [ICondition condition]:
  lc=andCondition {$condition=$lc.condition;} ('or' rc=andCondition {$condition = new OrCondition($condition,$rc.condition); } )*
;

andCondition returns [ICondition condition]:
  lc=atom {$condition=$lc.condition;} ('and' rc=atom {$condition=new AndCondition($condition,$rc.condition);} )*
;

atom returns [ICondition condition]:
  ident {$condition = new ConditionAtom($ident.text);} | '('! condition ')'! {$condition = $condition.condition;}
;

ident: IDENTIFIER;

IDENTIFIER : ('a'..'z' | 'A'..'Z')('_' | 'a'..'z' | 'A'..'Z' | '0'..'9')*;
FIGHTER_STRENGTH : ('0'..'9')+;