grammar SAF;
options { 
  language = Java;
  output = AST;
  ASTLabelType=CommonTree;
}

@header { 
  package saf.parser; 
  import saf.structure.*;
}
@lexer::header 
{
  package saf.parser;
}

bots returns [Bots bots] :              {     $bots = new Bots();
                                        }
  (b=bot                                {     $bots.getBots().add(b.bot); 
                                        }
  )*;
bot returns [Bot bot]:
  n=name                                {     $bot = new Bot(n.name); 
                                        }
    '{' 
      ( b=behavior                      {     $bot.getBehaviors().add(b.behavior); 
                                        }
      | c=characteristic                {     $bot.getCharacteristics().add(c.character); 
                                        }
      )+
    '}';
    
name returns [String name]:
  ID                                    {     $name = $ID.text;
                                        }
  (sn=subname                           {     $name += $sn.name;
                                        }
  )*;
subname returns [String name]:
  ( ID                                  {     $name = $ID.text; 
                                        }
  | INT                                 {     $name = $INT.text; 
                                        }
  );

characteristic returns [Characteristic character]:
  ID+ '=' INT                           {     $character = new Characteristic($ID.text,Integer.parseInt($INT.text));
                                        };

behavior returns [Behavior behavior]:
  c=condition  '['                      {     $behavior = new Behavior($c.condition);
                                        }
                                        
  ( id1 = ID                            {     $behavior.addMoveAction(new Action($id1.text));
                                        }
  | CHOOSE  '(' 
                (
                  c1 = ID               {     $behavior.addMoveAction(new Action($c1.text));
                                        }
                )*
            ')'
  )
  
  ( id2 = ID                            {     $behavior.addFightAction(new Action($id2.text));
                                        }
  | CHOOSE  '(' 
                (
                  c2  = ID              {     $behavior.addFightAction(new Action($c2.text));
                                        }
                 )*
            ')'
  )
  ']';

condition returns [Condition condition]:
   cr1=conditionRule                    {     $condition = $cr1.condition;
                                        }
   ( OR cr2=conditionRule               {     $condition = new ConditionOr($cr1.condition, $cr2.condition);
                                        }
   )*;
   
conditionRule returns [Condition condition]:
   v1=var                               {     $condition = $v1.condition;
                                        }
   ( AND v2=var                         {     $condition = new ConditionAnd($v1.condition, $v2.condition);   
							                          }
   )*;
   
var returns [Condition condition]:
   ID                                   {     $condition = new ConditionSimple($ID.text);   
                                        }
   | '(' c=condition ')'                {     $condition = $c.condition;    
                                        };
  
  


OR        : ('or' | 'OR');
AND       : ('and' | 'AND' | '&&');
CHOOSE    : 'choose';
ID        : (CHAR | '_')+;
INT       : DIGIT+;
WS        : (' ' | '\t' | '\u000C' | '\r' | '\n') 
                                        {     $channel = HIDDEN;
                                        };
fragment DIGIT      :   '0'..'9';
fragment CHAR       :   ('a'..'z' | 'A'..'Z');