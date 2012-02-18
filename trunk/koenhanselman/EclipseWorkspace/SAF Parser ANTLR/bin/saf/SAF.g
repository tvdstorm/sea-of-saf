grammar SAF;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommenTree;
}

@header {
  package saf;
  import saf.evaluators.*;
  import saf.objecttypes.*;
}

@lexer::header {
  package saf;
}

@parser::members {
    Fighter fighter;
    List<Characteristic> personality = new ArrayList<Characteristic>();
    List<Rule> behaviour = new ArrayList<Rule>();
}

fighter
	:	IDENT LEFT_CURLY
			personality
			behaviour
		RIGHT_CURLY
		{ 
	        String fightername = $IDENT.text;
	        Personality personality = new Personality(personality);
	        Behaviour behaviour = new Behaviour(behaviour);
	        
	        Fighter fighter = new Fighter(fightername, personality, behaviour);
        }
	;

personality
	:	characteristic*
	;
	
characteristic
	:	IDENT '=' DIGIT
		{
	        Characteristic characteristic = new Characteristic($IDENT.text, Integer.parseInt($DIGIT.text));
	        personality.add(characteristic);
	    }
	;

behaviour
	:	rule+
	;
	
rule
	:	condition LEFT_BRACK a1=action a2=action RIGHT_BRACK
		{
	        Rule rule = new Rule($condition.condition,
	        					new Move($a1.text), 
	                            new Attack($a2.text));
	        behaviour.add(rule);
	    }
	;
	
action
	:	'choose' LEFT_PAREN i1=IDENT i2=IDENT+ RIGHT_PAREN
	|	IDENT
	;
	
condition returns [Condition condition]
    :	'(' c1=condition (op=AND | op=OR) c2=condition ')'
	    {
	        if ($op.text.equals("and"))
	        {
	            $condition = new ConditionAnd($l1.condition, $l2.condition);
	        } 
	        else
	        {
	            $condition = new ConditionOr($l1.condition, $l2.condition);
	        }
	    }
    | IDENT { $condition = new Condition($IDENT.text); }
    ;
	
LEFT_CURLY : '{';
RIGHT_CURLY : '}';
LEFT_BRACK : '[';
RIGHT_BRACK : ']';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';

LETTER : ('a'..'z' | 'A'..'Z');
DIGIT : '0'..'9';

AND : 'and';
OR : 'or';

IDENT : LETTER (LETTER | DIGIT | '_')*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ { $channel = HIDDEN; };
