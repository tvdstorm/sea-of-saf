grammar SAF;

/*
or_statement returns [Node n]    
    :   a=and_statement {$n = $a.n;}
       (OR o=and_statement {$n = new Or($n, $o.n);})*
    ;
    
and_statement returns [Node n]
    :   r=rule  {$n = $r.n;}
       (AND o=rule {$n = new And($n, $o.n);})*
    ;


---- new

statement returns [Node n]
    :   o=or_statement {$n = $o.n;}
    ;
    
or_statement returns [Node n]    
    :   a=and_statement {$n = $a.n;}
       (OR o=or_statement {$n = new Or($n, $o.n);})*
    ;
    
and_statement returns [Node n]
    :   r=rule  {$n = $r.n;}
       (AND o=statement {$n = new And($n, $o.n);})*
    ;

rule returns [Node n]
    :   c=condition a=action {$n = new Rule($c.n,$a.n);}
    ;



*/

options {
  language = Java;
  output = AST;
}


@header {
  package nl.tamasja.uva.saf.tree.ast;
  import nl.tamasja.uva.saf.tree.ast.*;
  import java.util.ArrayList;
}

@lexer::header {
  package nl.tamasja.uva.saf.tree.ast;
}

// Ignore whitespaces, tabs, eol, etc by removing it from the default channel.
WS : (' ' | '\\t' | '\n' | '\r' | '\f' | '\t')+ {$channel = HIDDEN;};


// TODO: remove
/*
parse returns [FighterBot fighterBot]:
  bot EOF {$fighterBot = $bot.fighterBot;}
;


bot returns [FighterBot fighterBot]:
  ident '{'
  properties personalities {$fighterBot = new FighterBot($ident.text,$properties.fighterProperties,$personalities.fighterPersonalities);}
  '}'
;


properties returns [FighterProperties fighterProperties]
@init
    {
      $fighterProperties = new FighterProperties();
    }
    : (property {$fighterProperties.Add($property.fighterProperty);})+;

property returns [FighterProperty fighterProperty] : strength '=' fighter_stat { $fighterProperty = new FighterProperty($strength.text,Integer.parseInt($fighter_stat.text)); };


personalities returns [FighterPersonalities fighterPersonalities]
@init
    {
      $fighterPersonalities = new FighterPersonalities();
    }
    : (personality {$fighterPersonalities.Add($personality.fighterPersonality);})+; 
       
personality returns [FighterPersonality fighterPersonality] : condition '[' move attack ']' {$fighterPersonality = new FighterPersonality($condition.text,$move.text,$attack.text);};


condition : ('stronger'|'weaker'|'much_stronger'|'much_weaker'|'even'|'near'|'far'|'always');
move      : ('jump'|'crouch'|'stand'|'run_towards'|'run_away'|'walk_towards'|'walk_away');
attack    : ('punch_low'|'punch_high'|'kick_low'|'kick_high'|'block_low'|'block_high');
strength  : ('punchReach'|'kickReach'|'kickPower'|'punchPower');
*/

/*
fighter : 
  identifier '{' properties '}'
;

properties :
  (strength|personality)*
;

strength :
  STRING '=' FIGHTER_STRENGTH
;


personality :
 // IDENTIFIER '[' IDENTIFIER IDENTIFIER ']'
  'FUCK'
;


//identifier : CHAR(CHAR|DIGIT)*;
fighter_strength : FIGHTER_STRENGTH;
//string : CHAR+;

string : STRING;
STRING : ('a'..'z' | 'A'..'Z')+;
*/
//expression: INTEGER;
//fighter_stat : FIGHTER_STAT;

//wtf:WTF;


//WTF : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;

//FIGHTER_STAT : ('1'..'9'|'10');

//identifier: IDENTIFIER;
//IDENTIFIER : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
//IDENTIFIER : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;


/*
fig returns [Fighter fighterBot]:
  ident '{'
  properties personalities {$fighterBot = new FighterBot($ident.text,$properties.fighterProperties,$personalities.fighterPersonalities);}
  '}'
;
*/

parse returns [Fighter fighter]:
  fighter EOF {$fighter = $fighter.fighter;}
;

fighter returns [Fighter fighter]: 
  ident 
  '{'
   properties {$fighter = new Fighter($ident.text,$properties.properties);}
  '}'
;

properties returns [ArrayList<Property> properties]
@init
    {
      $properties = new ArrayList<Property>();
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

action returns [Action action]: 
  ident {$action = new ActionAtom($ident.text);}
  | choice {$action = new ChooseAction($choice.actionList);}
;

choice returns [ArrayList<Action> actionList]
@init
    {
      $actionList = new ArrayList<Action>();
    }
:
  'choose(' (ident {$actionList.add( new ActionAtom($ident.text) );} )+ ')'
;


parse2:
  condition EOF!
;

/*
condition returns [Condition condition]:
atom {$condition = $atom.condition;}
|or {$condition = $or.condition;}
|and {$condition = $and.condition;}
;

or returns [Condition condition]:
  l=atom 'or' r=atom {$condition = new OrCondition($l.condition,$r.condition);}
;

and returns [Condition condition]:
  l=atom 'and' r=atom {$condition = new AndCondition($l.condition,$r.condition);}
;

atom returns [Condition condition] :
 ident {$condition = new ConditionAtom($ident.text);} 
;

*/
/*
condition returns [Condition condition]:
  logic_or
;

logic_or returns [Condition condition]:
  logic_and ('or' logic_and)*
;

logic_and returns [Condition condition]:
  atom ('and' logic_and)
;

atom:
  ident
;
*/
 //| '('! condition ')'! 

/*
statement returns [Node n]
    :   o=or_statement {$n = $o.n;}
    ;
    
or_statement returns [Node n]    
    :   a=and_statement {$n = $a.n;}
       ('or' o=or_statement {$n = new Or($n, $o.n);})*
    ;
    
and_statement returns [Node n]
    :   rule  {$n = $rule.n;}
       ('and' statement {$n = new And($n, $statement.n);})*
    ;

rule returns [Node n]
    :   c=condition a=action {$n = new Rule($c.n,$a.n);}
    ;

*/
/*
*/


condition returns [Condition condition]:
  orCondition {$condition = $orCondition.condition;}
;

orCondition returns [Condition condition]:
  lc=andCondition {$condition=$lc.condition;} ('or' rc=andCondition {$condition = new OrCondition($condition,$rc.condition); } )*
;

andCondition returns [Condition condition]:
  lc=atom {$condition=$lc.condition;} ('and' rc=atom {$condition=new AndCondition($condition,$rc.condition);} )*
;

atom returns [Condition condition]:
  ident {$condition = new ConditionAtom($ident.text);} | '('! condition ')'! {$condition = $condition.condition;}
;

// | '('! condition ')'! 

/*
condition returns [Condition condition] :
  andCondition
;

andCondition :
  orCondition ('and' orCondition)?
;

orCondition :
atom ('or' atom)?
;

atom returns [Condition condition] :
 ident {$condition = new ConditionAtom($ident.text);} 
 | '('! condition ')'! {$condition = $condition.condition} 
;
*/
/*

near and near or far and near and near

orCondition :
  ident 'or' ident | orCondition
;
*/



//IDENTIFIER :CHAR(CHAR|DIGIT)*;

ident: IDENTIFIER;

//|(UNDERSCORE(CHAR|DIGIT))
IDENTIFIER : ('a'..'z' | 'A'..'Z')('_' | 'a'..'z' | 'A'..'Z' | '0'..'9')*;
FIGHTER_STRENGTH : ('0'..'9')+;

//charz: CHAR;

//fragment DIGIT:'0'..'9';
//fragment CHAR:('a'..'z'|'A'..'Z');
//fragment UNDERSCORE : '_';
/*
STRING : ('a'..'z' | 'A'..'Z')+;
INTEGER : '0'..'9'+;
IDENT : STRING(STRING|INTEGER)+;
*/

/*
chicken
{
  kickReach = 9
  punchReach = 1
  kickPower = 2
  punchPower = 2
  far [run_towards kick_low]
  near [run_away kick_low]
  near [crouch punch_low]
}
*/