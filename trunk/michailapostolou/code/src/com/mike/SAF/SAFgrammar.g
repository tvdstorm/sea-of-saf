grammar SAFgrammar;

options {
  language = Java;
   output=AST;
}

tokens{
	BEHAVIOUR;
	CHARACTERISTIC;
	BETWEEN;
	PROGRAM;
}

@header {
  package com.mike.SAF;
  import com.mike.SAF.Board;
  import com.mike.SAF.Behavior;
  import com.mike.SAF.Bot;
  import com.mike.SAF.Game;
  import java.lang.Integer;
  import java.util.ArrayList;
}




@lexer::header {
  package com.mike.SAF;
}


program returns [Game g] @init{$g = new Game();}
	:
		b1=bot{$g.loadBrain($b1.bot);} b2=bot*{$g.loadBrain($b2.bot);}  | b3=bot{$g.loadBrain($b3.bot);$g.start();}  EOF 
	;
	
bot returns[Bot bot] @init{ $bot = new Bot();}
	:
	    NAME{$bot.setBotName($NAME.getText());} '{' (personality{$bot.addAttribute($personality.a);} | b = behavior{$bot.addBehavior($b.behaviors);})* '}'
	;


	
personality returns[Attribute a]:
	ATTRIBUTE '=' DIGIT {$a = new Attribute($ATTRIBUTE.getText(),Integer.parseInt($DIGIT.getText()));}
	;
	
behavior returns[ArrayList<Behavior> behaviors,boolean mCb,boolean fCb,boolean m1b,boolean f1b] @init{$mCb = false; $fCb = false;$f1b = false;$m1b = false;}
	:
		bList = or_condition '[' ( v1=MOVE{$m1b = true;} | v2=movechoice{$mCb = true;} )^ (v3=FIGHT{$f1b = true;} | v4=fightchoice{$fCb = true;} )^ ']' 
		{
			for(int i=0; i<$bList.behaviorList.size(); i++)
			{
				Behavior behav = (Behavior)$bList.behaviorList.get(i);
				if($m1b)	
					behav.addMove($v1.getText());
				if($mCb)
					behav.addMove($v2.mv);
				if($f1b)
					behav.addFight_move($v3.getText());
				if($fCb)
					behav.addFight_move($v4.f);
			}
			$behaviors = $bList.behaviorList;
		}
	;
	
condition returns [Behavior behavior] @init{$behavior = new Behavior();}
	:
		( c1=CONDITION{$behavior.addCondition($c1.getText());} ) (AND c2=CONDITION {$behavior.addCondition($c2.getText());} )* 
	;
	
or_condition returns[ArrayList<Behavior> behaviorList] @init{ $behaviorList = new ArrayList<Behavior>();}
	:
	 cs1=condition {$behaviorList.add($cs1.behavior);}
//	 	{Behavior $beh = new Behavior(); $beh.addCondition($cs1.getText()); $behaviorList.add($beh);} 
	( OR cs2=condition {$behaviorList.add($cs2.behavior);}
//		{Behavior $beh = new Behavior(); $beh.addCondition($cs2.getText()); $behaviorList.add($beh);}
		 )*
	;
	
movechoice returns[ArrayList<String> mv] @init{$mv = new ArrayList<String>();}
	:
	'choose'^ '(' ( m1 = MOVE{System.out.println($m1.getText()); $mv.add($m1.getText()); } ) (m2 = MOVE{$mv.add($m2.getText());}) ')';
	
fightchoice returns[ArrayList<String> f] @init{$f = new ArrayList<String>();}:
	'choose'^ '(' (f1=FIGHT{ $f.add($f1.getText()); } ) (f2=FIGHT{ $f.add($f2.getText()); })+  ')';

ATTRIBUTE:
	('punchReach' | 'punchPower' | 'kickReach' | 'kickPower');
	
NAME:
	('A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
	
MOVE:
	('walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand');
		
FIGHT:
	('block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high');
	
DIGIT	:
  '0'..'9';  
	
CONDITION :
	('always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker')
	;

AND:
	'and' | 'AND' | '&&' | ',';
	
OR:
	'or' | 'OR' | '||' | '|'
;

//IDENT : ('a'..'z')*('A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9');

WS : (' ' | '\n' | '\t' | '\r') + {$channel = HIDDEN;};