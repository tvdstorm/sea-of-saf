tree grammar FDLInterpreter;

options {
  language = Java;
  tokenVocab = FDL;
  ASTLabelType = CommonTree;
}

@header{
    package saf.fdl;
    
    import saf.Fighter;
}

@members {
    
    public void applyProperties(Fighter fighter){
        //TODO
    }
    
}

saf:                name attributes;

name:               TEXT                    {};
attributes:         (characteristic | behaviour_rule)*;

characteristic:     property value;
behaviour_rule:     condition move attack;

property:           TEXT                    {};
value:              NUMBER                  {};
condition:          TEXT                    {};
move:               TEXT                    {}
                  | CHOOSE t1=TEXT t2=TEXT  {};
attack:             TEXT                    {}
                  | CHOOSE t1=TEXT t2=TEXT  {};
