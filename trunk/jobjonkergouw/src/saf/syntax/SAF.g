grammar SAF;

options {
    language = Java;
   // backtrack = true;
}

@header {
    package saf.syntax;
    import saf.ast.nodes.*;
    import saf.bot.GameBot;
    import java.lang.String;
    
}

@lexer::header {package saf.syntax; }

/********************* Parser rules ************************/

fighter returns [GameBot fighter]
    :   name=ID                 { $fighter = new GameBot($name.text); }
        '{' 
            (   strength        { $fighter.addStrength($strength.s); }
                | rule          { $fighter.addRule($rule.r); }
            )*
        '}'  
    ;
    
strength returns [Strength s]
    : ID '=' INT                { $s = new Strength($ID.text, $INT.int); }
    ;
   
rule returns [Rule r]
    :                      		            { $r = new Rule();}
    condition				                { $r.setCondition($condition.c); }      
    '[' 
        (m0=ID                              { $r.addMove(new Move($m0.text)); }
        | 'choose' '(' m1=ID m2=ID ')'      { $r.addMove(new Move($m1.text));
                                              $r.addMove(new Move($m2.text)); }
        )
        (a0=ID                              { $r.addAttack(new Attack($a0.text)); }
        | 'choose' '(' a1=ID a2=ID ')'      { $r.addAttack(new Attack($a1.text));
                                              $r.addAttack(new Attack($a2.text)); }
        )
    ']'
    ;


condition returns [Condition c]
   	: ID					
	( 
		  'and' c1=conditionTail    { $c = new ConditionOperator("and");
		                              $c.addCondition(new ConditionName($ID.text));
		                              $c.addCondition($c1.c);}
		| 'or' c2=conditionTail		{ $c = new ConditionOperator("or");
		                              $c.addCondition(new ConditionName($ID.text));
		                              $c.addCondition($c2.c);}
		|						    { $c = new ConditionName($ID.text); }   
 	)
 	;

conditionTail returns [Condition c]
    : condition                     { $c = $condition.c; }
    ;
        
move returns [Move m]
	: ID								{ $m = new Move($ID.text); }
	;
	
attack returns [Attack a]
	: ID								{ $a = new Attack($ID.text); }
	;	

/********************* Lexer rules ************************/

INT         :       '0'..'9'+;
ID          :       ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
WS          :       ( ' '| '\t' | '\r' | '\n')* {$channel=HIDDEN;};