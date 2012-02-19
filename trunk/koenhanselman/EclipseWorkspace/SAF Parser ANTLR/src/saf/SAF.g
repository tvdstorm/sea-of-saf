grammar SAF;

options {
  language = Java;
}

@header {
  package saf;
  import saf.evaluators.*;
  import saf.models.*;
}

@lexer::header {
  package saf;
}

@parser::members {
    Fighter fighter;
    List<Characteristic> personality = new ArrayList<Characteristic>();
    List<Rule> behaviour = new ArrayList<Rule>();
}

fighter returns [Fighter fighter]
	:	IDENT LEFT_CURLY
			personality
			behaviour
		RIGHT_CURLY
		{ 
	        String fightername = $IDENT.text;
	        Personality personality = new Personality(this.personality);
	        Behaviour behaviour = new Behaviour(this.behaviour);
	        
	        $fighter = new Fighter(fightername, personality, behaviour);
        }
	;

personality
	:	characteristic*
	;
	
characteristic
	:	IDENT '=' DIGIT
		{
	        Characteristic characteristic = new Characteristic($IDENT.text, Integer.parseInt($DIGIT.text));
	        this.personality.add(characteristic);
	    }
	;

behaviour
	:	rule+
	;
	
rule
	:	condition LEFT_BRACK a1=actions a2=actions RIGHT_BRACK
		{
	        Rule rule = new Rule($condition.condition,
	        					new Move($a1.actions), 
	                            new Attack($a2.actions));
	        this.behaviour.add(rule);
	    }
	;
	
actions returns [List<String> actions]
	:	{
			$actions = new ArrayList<String>();
		}
		'choose' LEFT_PAREN i1=action[$actions] i2=action[$actions]+ RIGHT_PAREN
	|	a=IDENT
		{
			$actions = new ArrayList<String>();
			$actions.add($a.text);
		}
	;

action [List<String> actions]
	:	a=IDENT
		{
			$actions.add($a.text);
		}
	;

condition returns [Condition condition]
    :	'(' c1=condition (op=AND | op=OR) c2=condition ')'
	    {
	        if ($op.text.equals("and"))
	        {
	            $condition = new ConditionAnd($c1.condition, $c2.condition);
	        } 
	        else
	        {
	            $condition = new ConditionOr($c1.condition, $c2.condition);
	        }
	    }
    | IDENT { $condition = new ConditionSingle($IDENT.text); }
    ;
	
LEFT_CURLY : '{';
RIGHT_CURLY : '}';
LEFT_BRACK : '[';
RIGHT_BRACK : ']';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';

LETTER : ('a'..'z' | 'A'..'Z');
DIGIT : '0'..'9' | '10';

AND : 'and';
OR : 'or';

IDENT : LETTER (LETTER | DIGIT | '_')*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ { $channel = HIDDEN; };
