grammar SAF;
options { 
output=AST; ASTLabelType=CommonTree;

}

@header {
  package Generated;
  import SAF.Structure.*;
}
@lexer::header
{
  package Generated;
}
@members {
/** Map variable name to Integer object holding value */
Bots bots = new Bots();
}

bots returns [Bots bots] :
  b=bot*                  { $bots.ChildBots.add(b.bot); };
bot returns [Bot bot]:
  n=name NEWLINE*         { $bot.name = n.name; }
    '{' NEWLINE*  
      ( b=behavior        { $bot.Behavior.add(b.rule); }
      | c=characteristic  { $bot.Characteristics.add(c.character); }
      )+
    '}' NEWLINE*;
    
name returns [String name]:
  ID sn=subname*          { $name = $ID.text + $sn.name; };
subname returns [String name]:
  ( ID                    { $name = $ID.text; }
  | INT                   { $name = $INT.text; }
  ) ;
  
characteristic returns [Characteristic character]:
  WS* ID+ WS* '=' WS* INT NEWLINE
                          { $character.Name = $ID.text;
                            $character.Value = Integer.parseInt($INT.text);};

behavior returns [BehaviorRule rule]:
  WS* c=condition '['     { $rule.condition = $c.condition; }
  (ID+ 
  | choose) WS 
  (ID+ 
  | choose
  ) ']' NEWLINE;

condition returns [Condition condition]:
   ID                      { $condition.condition = new StringCondition($ID.text);}
   (c=conditionRule        { $c.choiceCondition.condition = $condition.condition;
                             $condition.condition = $c.choiceCondition.condition;} 
   )*;
   
//conditionRule returns [ChoiceCondition choiceCondition]:
//   ( WS+ 'and' WS+ id1=ID+ { $choiceCondition = new ChoiceCondition(ChoiceCondition.ConditionType.OR, new StringCondition($id1.text));} 
//   | WS+ 'or' WS+ id2=ID+  { $choiceCondition = new ChoiceCondition(ChoiceCondition.ConditionType.AND, new StringCondition($id2.text));}
//   );

conditionRule returns [ChoiceCondition choiceCondition]:
  ( 
    conditionTerm conditionRest* 
  );
conditionRest returns [Condition condition]:
    WS+ 'or' WS+ ct=conditionTerm { $choiceCondition = new ChoiceCondition(ChoiceCondition.ConditionType.AND, $ct.condition));};

conditionTerm:
  ( ID conditionTermRest* );
conditionTermRest:
    WS+ 'and' WS+ id1=ID+ { $choiceCondition = new ChoiceCondition(ChoiceCondition.ConditionType.OR, new StringCondition($id1.text)); };
  
choose:
  CHOOSE  '(' ID+  (chooseEnd)+ ')';
chooseEnd:
  WS ID+;

CHOOSE: 'choose';
NEWLINE
      :'\r'? '\n' ;
ID    :   ('a'..'z'|'A'..'Z'|'_')+ ;
INT   :   '0'..'9'+ ;
WS    :   (' '|'\t')+ {skip();} ;