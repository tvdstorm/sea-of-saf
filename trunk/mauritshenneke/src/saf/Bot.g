grammar Bot;

options {
  language = Java;
}

@header {
  package saf;
  import saf.evaluators.*;
  import java.util.ArrayList;
}

@lexer::header {
  package saf;
  import saf.evaluators.*;
  import java.util.ArrayList;
}

create returns [Bot bot]
    @init{ $bot = new Bot(); }
    : IDENT {$bot.setName($IDENT.text);} '{' ( c = characteristic { $bot.addCharacteristic(c); } | b=behaviour {$bot.addBehaviour(b);})* '}'
    ;

attribute
    : characteristic
    | behaviour
    ;

characteristic returns [Characteristic c]
    : IDENT '=' i=INTEGER {c = new Characteristic($IDENT.text, Integer.parseInt($i.text));}
    ;

behaviour returns [Behaviour b]
    : IDENT '[' mats = behaviour_action_types fats = behaviour_action_types']' {b = new Behaviour($IDENT.text, mats, fats);}
    ;

behaviour_action_types returns [ArrayList<BehaviourActionType> result]
    @init {	$result = new ArrayList<BehaviourActionType>();	}
    : IDENT {$result.add(new BehaviourActionType($IDENT.text));}
    | 'choose' '(' bat1=IDENT {$result.add(new BehaviourActionType($bat1.text));} (bat2=IDENT {$result.add(new BehaviourActionType($bat2.text));})+ ')' 
    ;

IDENT   : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INTEGER : '0'..'9'+ ;
WS  : ( ' ' | '\t' | '\f' | '\r' | '\n') { $channel = HIDDEN; };