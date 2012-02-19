grammar SAF;

options {
  language = Java;
}

@header {
package reader.antlr;
  import fighter.*;
  import fighter.action.*;
  import fighter.condition.*;
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
   }
  (STRENGTHS '=' INTEGER 
                           {
                            if ($STRENGTHS.getText().equals("punchReach")) {
                                              	personality.setPunchReach(Integer.parseInt($INTEGER.text));
                            }
                            if ($STRENGTHS.text.equals("punchPower")) {
                            	personality.setPunchPower(Integer.parseInt($INTEGER.text));
                            }
                            if ($STRENGTHS.text.equals("kickReach")) {
                            	personality.setKickReach(Integer.parseInt($INTEGER.text));
                            }
                            if ($STRENGTHS.text.equals( "kickPower")) {
                            	personality.setKickPower(Integer.parseInt($INTEGER.text));
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
  {Rule rule;}
   cond   '['    moveGen = move   attackGen = atack   ']'
  {
  	rule = new Rule($cond.condition, $moveGen.moveActions, $attackGen.fightActions); 
  	behaviour.add(rule);
  }
  )*
  'always' '[' moveAlw =  move attackAlw=atack ']'
  {
  Rule rule;
  rule = new Rule($cond.condition, $moveAlw.moveActions, $attackAlw.fightActions); 
  behaviour.add(rule);
  }
  ;
  
move returns [Actions<MoveActionType> moveActions ]: 
 	{    moveActions = new Actions<MoveActionType>();
 	}
    (
      (
      	move1 = MOVES
      	{
      	moveActions.add(MoveActionType.valueOf($move1.text));
      	}
      )
      | 
      ('choose(' (
	      move2 = MOVES
	      {
	      moveActions.add(MoveActionType.valueOf($move2.text));
	      }
	      )+ ')'
      )
    )
	;
atack returns [ Actions<FightActionType> fightActions] : 
  	{ 
     fightActions = new Actions<FightActionType>();
    }   
    (
     (
     	attack1=  ATTACKS 
     	{
     	fightActions.add(FightActionType.valueOf($attack1.text));
     	}
     )
      | 'choose(' (
      	attack2 = ATTACKS
	      {
	      fightActions.add(FightActionType.valueOf($attack2.text));
	      }
      )+ ')'
    )
	;  
cond returns [ ICondition condition]
	:	
	 (
    //maybe + instead of *
    //factorizez pt a merge and multiplu.
      (orCond {condition = $orCond.condition;}
      )
    )
	;
condSimple returns [ ICondition condition]
	:
	
	(CONDITIONS 
		{condition = new SimpleCondition($CONDITIONS.text);} 
	 )
	| ('(' cond')' {condition = $cond.condition;})
	;
andCond returns  [ ICondition condition]
	:
	cond1 = condSimple { condition = $cond1.condition;}
	('and' cond2 = condSimple { condition = new AndCondition(condition, $cond2.condition); 
	})*
	;
orCond returns  [ ICondition condition]
	:
	cond1 = andCond { condition = $cond1.condition;}
	('or' cond2 = andCond
	{ condition = new OrCondition(condition, $cond2.condition);
	}
	)*
	;
CONDITIONS: ('stronger' | 'weaker'|'much_stronger'|'much_weaker' | 'even' | 'near' | 'far' | 'always');
MOVES: ('jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away');
ATTACKS : ('punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high');
STRENGTHS : ('punchReach' | 'kickReach' | 'kickPower' | 'punchPower');

IDENT : ('A'..'Z'|'a'..'z')('0'..'9'|'A'..'Z'|'a'..'z')*;

// errror handling -> better for integer
INTEGER
  : ('0'..'9')+
  ;

//parse comments and whitespaces to a hidden channel

WHITESPACE : ( '\t' | ' ' | '\r' | '\n' )+    { $channel = HIDDEN; } ;

COMMENTS
    :   ('/*' (options {greedy=false;} : .)* '*/' || '//'.* ('\n'|'\r') ){$channel=HIDDEN;}
    ;
