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
Bots bots = new Bots();
} 

bots returns [Bots bots] :
  b=bot*                      { $bots.AddBot(b.bot); };
bot returns [Bot bot]:
  n=name NEWLINE*             { $bot = new Bot(n.name); }
    '{' NEWLINE*  
      ( b=behavior            { $bot.Behavior.add(b.behavior); }
      | c=characteristic      { $bot.Characteristics.add(c.character); }
      )+
    '}' NEWLINE*;
    
name returns [String name]:
  ID sn=subname*              { $name = $ID.text + $sn.name; };
subname returns [String name]:
  ( ID                        { $name = $ID.text; }
  | INT                       { $name = $INT.text; }
  ) ;
  
characteristic returns [Characteristic character]:
  WS* ID+ WS* '=' WS* INT NEWLINE
                              { $character = new Characteristic($ID.text);
                                $character.value = Integer.parseInt($INT.text);};

behavior returns [BehaviorRule behavior]:
  WS* c=condition '['         { $behavior = new BehaviorRule();
                                $behavior.condition = $c.condition; }
  ( id1 = ID+                 { $behavior.moveAction = new Action($id1.text);}
  | c1  = choose) WS          { $behavior.moveAction = $c1.action;}
  ( id2 = ID+                 { $behavior.fightAction = new Action($id2.text);}
  | c2  = choose              { $behavior.moveAction = $c2.action;}
  ) ']' NEWLINE;

choose returns [Action action]:
  CHOOSE  '(' ID+             { $action = new Action();
                                $action.values.add($ID.text); }  
  (
    chooseEnd                 { $action = new Action();
                                $action.values.add($chooseEnd.value); }
  )+')'
  ;
chooseEnd returns [String value]:
  WS ID                       {$value = $ID.text;};

condition returns [Condition condition]:
   cr1=conditionRule          { $condition.condition = $cr1.condition;}
   ( OR WS cr2=conditionRule  {ChoiceCondition cc = new ChoiceCondition(ChoiceCondition.ConditionType.OR, $cr2.condition);
                               cc.condition = $cr1.condition;
                               $condition.condition =cc;} 
   )*;
   
conditionRule returns [Condition condition]:
   v1=var                     {$condition = new Condition($v1._condition);}
   ( AND WS v2=var)*          {ChoiceCondition cc = new ChoiceCondition(ChoiceCondition.ConditionType.AND,$v2._condition);
                               cc.condition = $v1._condition;
                               $condition = new Condition(cc);};
   
var returns [Condition _condition]: 
   ID WS*                             {$_condition = new Condition(new StringCondition($ID.text));}
   | '(' WS* c=condition WS* ')' WS*  {$_condition = new Condition($c.condition);};
  
  


OR    : 'or';
AND   : 'and';
CHOOSE: 'choose';
NEWLINE
      : '\r'? '\n' ;
ID    : ('a'..'z'|'A'..'Z'|'_')+ ;
INT   : '0'..'9'+ ;
WS    : (' '|'\t')+ {skip();} ;