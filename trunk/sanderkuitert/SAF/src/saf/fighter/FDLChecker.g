tree grammar FDLChecker;

options {
  language = Java;
  tokenVocab = FDL;
  ASTLabelType = CommonTree;
}

@header{
    package saf.fighter;
}

//TODO decide whether to throw errors or return false booleans (when check fails)
//move enum matches to function in "@members {}"
saf:                name attributes;

name:               TEXT;
attributes:         L_CURLY_BRACKET (characteristic | behaviour_rule)* R_CURLY_BRACKET;

characteristic:     property value;
behaviour_rule:     condition move attack;

property:           TEXT;   //TODO check matching of known characteristics {isProperty();}
value:              NUMBER; //TODO check >=1 and <=10
condition:          TEXT;   //TODO check matching of known conditions
move:               TEXT | CHOOSE TEXT TEXT;  //TODO check matching of known moves
attack:             TEXT | CHOOSE TEXT TEXT;  //TODO check matching of known attacks
