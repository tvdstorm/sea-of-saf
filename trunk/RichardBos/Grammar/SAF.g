grammar SAF;
options { 
  language = Java;
  output = AST;
  ASTLabelType=CommonTree;
}

@header {
  package Generated;
  import SAF.Structure.*;
}
@lexer::header
{
  package Generated;
}

bots returns [Bots bots] :              {     $bots = new Bots();
                                        }
  (b=bot                                {     $bots.getBots().add(b.bot); 
                                        }
  )*;
bot returns [Bot bot]:
  n=name NEWLINE*                       {     $bot = new Bot(n.name); 
                                        }
    '{' NEWLINE*  
      ( b=behavior                      {     $bot.getBehaviors().add(b.behavior); 
                                        }
      | c=characteristic                {     $bot.getCharacteristics().add(c.character); 
                                        }
      )+
    '}' NEWLINE*;
    
name returns [String name]:
  ID                                    {     $name = $ID.text;
                                        }
  (sn=subname*                          {     $name += $sn.name;
                                        }
  );
subname returns [String name]:
  ( ID                                  {     $name = $ID.text; 
                                        }
  | INT                                 {     $name = $INT.text; 
                                        }
  );

characteristic returns [Characteristic character]:
  WS* ID+ WS* '=' WS* INT NEWLINE       {     $character = new Characteristic($ID.text);
                                              $character.setValue(Integer.parseInt($INT.text));
                                        };

behavior returns [Behavior behavior]:
  WS* c=condition '['                   {     $behavior = new Behavior();
                                              $behavior.setCondition($c.condition); 
                                        }
  ( id1 = ID                            {     $behavior.setMoveAction(new Action($id1.text));
                                        }
  | c1  = choose                        {     $behavior.setMoveAction($c1.action);
                                        }
  ) WS
  ( id2 = ID                            {     $behavior.setFightAction(new Action($id2.text));
                                        }
  | c2  = choose                        {     $behavior.setFightAction($c2.action);
                                        }
  )
  ']' NEWLINE;

choose returns [Action action]:
  CHOOSE  '('                           {     $action = new Action();
                                        }
  (
    choosePart                          {     $action.getValues().add($choosePart.value); 
                                        }
  )+
  ')';
  
choosePart returns [String value]:
  WS* ID                                {     $value = $ID.text;
                                        };

condition returns [Condition condition]:
   cr1=conditionRule                    {     $condition = $cr1.condition;
                                        }
   ( OR WS cr2=conditionRule            {     ChoiceCondition cc = new ChoiceCondition(ChoiceCondition.ConditionType.OR);
                                              cc.setCondition($cr1.condition);
                                              cc.setSecondCondition($cr2.condition);
                                              $condition = cc;
                                        }
   )*;
   
conditionRule returns [Condition condition]:
   v1=var                               {     $condition = $v1._condition;
                                        }
   ( AND WS v2=var                      {     ChoiceCondition cc = new ChoiceCondition(ChoiceCondition.ConditionType.AND);
                                              cc.setCondition($v1._condition);
                                              cc.setSecondCondition($v2._condition);
							                                $condition = cc;    
							                          }
   )*;
   
var returns [Condition _condition]:
   ID WS*                               {     $_condition = new StringCondition($ID.text);   
                                        }
   | '(' WS* c=condition WS* ')' WS*    {     $_condition = $c.condition;    
                                        };
  
  


OR        : ('or' | 'OR');
AND       : ('and' | 'AND' | '&&');
CHOOSE    : 'choose';
NEWLINE   : '\r'? '\n' ;
ID        : (CHAR | '_')+;
INT       : DIGIT+;
WS        : WHITESPACE+                 {     skip();
                                        };

fragment DIGIT      :   '0'..'9';
fragment CHAR       :   ('a'..'z' | 'A'..'Z');
fragment WHITESPACE :   (' ' | '\t' | '\u000C');