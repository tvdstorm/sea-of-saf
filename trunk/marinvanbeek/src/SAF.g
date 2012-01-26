grammar SAF;

options {
    output = 'AST' ;
}

tokens {
    CURLY_OPEN      = '{' ;
    CURLY_CLOSE     = '}' ;

    EQUAL           = '=' ;

    SQUARE_OPEN     = '[' ;
    SQUARE_CLOSE    = ']' ;

    AND             = 'and' ;
    OR              = 'or' ;

    /* Imaginary nodes, used for tree topology. */
    SAF;
    ATTRIBUTES;
    ATTRIBUTE;
    MOVE;
    ATTACK;
    BEHAVIOUR;
    TACTIC;
    COMPOSED_CONDITION;
    CONDITION;
    LOGIC_AND;
    LOGIC_OR;
}

@header {
}

@parser::members {
    Fighter fighter;
    List<Attribute> attributes = new ArrayList<Attribute>();
    List<Tactic> tactics = new ArrayList<Tactic>();
}

/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/


parse
    : {
    }
      name=STRING super_awesome_fighter
    { 
        Behaviour behaviour = new Behaviour(tactics);
        String fighterName = $name.text;
        fighter = new Fighter(fighterName, attributes, behaviour);
    }
    ;

super_awesome_fighter 
    : CURLY_OPEN attribute* tactic+ CURLY_CLOSE EOF
    ;

attribute
    : (name=STRING EQUAL value=LEVEL)
    {
        attributes.add(new Attribute($name.text, 
                                     Integer.parseInt($value.text)));
    }
    ;

//tactic
//    : condition=STRING SQUARE_OPEN move=STRING attack=STRING SQUARE_CLOSE
//    {
//        Logic logCond = new Condition($condition.text);
//        Action action = new Action(new Move($move.text), 
//                                   new Attack($attack.text));
//
//        tactics.add(new Tactic(logCond, action));
//    }
//    ;

tactic
    :
        logic SQUARE_OPEN move=STRING attack=STRING SQUARE_CLOSE
    {
        Action action = new Action(new Move($move.text), 
                                   new Attack($attack.text));

        tactics.add(new Tactic($logic.operand, action));
    }
    ;

logic returns [Logic operand]
    :
    '(' o1=logic (op=AND|op=OR) o2=logic ')'
    {
        if ($op.text.equals("and"))
        {
            $operand = new LogicAnd($o1.operand, $o2.operand);
        } else
        {
            $operand = new LogicOr($o1.operand, $o2.operand);
        }
    }
    | condition=STRING
    {
        $operand = new Condition($condition.text);
    }
    ;
 

/*--------------------------------------------------------------------------
 * LEXER RULES
 *--------------------------------------------------------------------------*/

LEVEL   
    : ('1'..'9')+
    ;

STRING  
    : ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')+ 
    ;

WHITESPACE 
    : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } 
    ;


