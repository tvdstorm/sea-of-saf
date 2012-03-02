grammar SAF;

options {
    language = Java;
}

@header {
    package saf.syntax;
    import saf.ast.*;
    import java.lang.String;
    
}

@lexer::header {package saf.syntax; }

/********************* Parser rules ************************/

fighter returns [Fighter fighter]
    :   name=ID                 { $fighter = new Fighter($name.text); }
        '{' 
            (   strength        { $fighter.addChild($strength.s); }
                | rule          { $fighter.addChild($rule.r); }
            )*
        '}'  
    ;
    
strength returns [Strength s]
    : ID '=' INT                { $s = new Strength($ID.text, $INT.int); }
    ;
   
rule returns [Rule r]
    :                           { $r = new Rule();}
      ( 
            ( c1=condition 'and' c2=condition)  { And and = new And(); $r.addChild(and); and.addChild($c1.c); and.addChild($c2.c); }
          | ( c1=condition 'or' c2=condition )  { Or or = new Or(); $r.addChild(or); or.addChild($c1.c); or.addChild($c2.c); }
          |   c1=condition                      { $r.addChild($c1.c); }
      )  
    '[' move attack ']'                                { $r.addChild($move.m); $r.addChild($attack.a); }
    ;
    
condition returns [Condition c]
    : ID                        { $c = new Condition($ID.text); }
    ;

move returns [Move m]
    : 'choose' '(' 
                    m1=ID       { $m = new Move($m1.text); }
                   ( 
                        m2=ID   { $m.addAction($m2.text); }     
                   )*     
               ')'   
    | m1=ID                     { $m = new Move($m1.text); }
    ;
    
attack returns [Attack a]
    : 'choose' '(' 
                    a1=ID       { $a = new Attack($a1.text); }
                   ( 
                        a2=ID   { $a.addAction($a2.text); }     
                   )*     
               ')'   
    |a1=ID                     { $a = new Attack($a1.text); }
    ;
/********************* Lexer rules ************************/

INT         :       '0'..'9'+;
ID          :       ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
WS          :       ( ' '| '\t' | '\r' | '\n')* {$channel=HIDDEN;};