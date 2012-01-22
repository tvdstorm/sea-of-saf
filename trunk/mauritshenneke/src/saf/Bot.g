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

@members {
  private ArrayList<Characteristic> characteristics = new ArrayList<Characteristic>();
  private ArrayList<Behaviour> behaviours= new ArrayList<Behaviour>();
}

create returns [Bot value]
    : IDENT '{' a=(attribute*) '}' {$value = new Bot($IDENT.text,characteristics, behaviours);}
    ;

attribute
    : characteristic
    | behaviour
    ;

characteristic
    : IDENT '=' i=INTEGER {characteristics.add(new Characteristic($IDENT.text, Integer.parseInt($i.text)));}
    ;

behaviour
    : IDENT '[' mats = behaviour_action_types fats = behaviour_action_types']' {behaviours.add(new Behaviour($IDENT.text, $mats.result, $fats.result));}
    ;

behaviour_action_types returns [ArrayList<BehaviourActionType> result]
    @init {	$result = new ArrayList<BehaviourActionType>();	}
    : IDENT {$result.add(new BehaviourActionType($IDENT.text));}
    | 'choose' '(' bat1=IDENT {$result.add(new BehaviourActionType($bat1.text));} (bat2=IDENT {$result.add(new BehaviourActionType($bat2.text));})+ ')' 
    ;

IDENT   : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INTEGER : '0'..'9'+ ;
WS  : ( ' ' | '\t' | '\f' | '\r' | '\n') { $channel = HIDDEN; };