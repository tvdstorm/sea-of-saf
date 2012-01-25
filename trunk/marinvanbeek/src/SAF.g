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
}

/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/


    { 
        String name;
        List<Attribute> attributes = new ArrayList<Attribute>();
        Behaviour behaviour;

        fighter = new Fighter(name, attributes, behaviour);
    }

    {
        attributes.add(new Attribute());
    }

    {
        List<Tactic> tactics = new ArrayList<Tactic>();

        behaviour = new Behaviour(tactics);
    }

    {
        Logic condition;
        Action action;

        tactics.add(new Tactic(condition, action));
    }

    {
        //blah

        new Logic();
    }

    {
        Move move;
        Attack attack;

        new Action(move, attack);
    }

    {
        new Move();
    }

    {
        new Attack();
    }




parse
    : name=STRING super_awesome_fighter
    ;

super_awesome_fighter 
    : CURLY_OPEN attribute* behaviour CURLY_CLOSE EOF -> 
            ^(ATTRIBUTES<SafTreeAttributes>["_Attributes"] attribute*)
            ^(BEHAVIOUR<SafTreeBehaviour>["_Behaviour"] behaviour)
    ;

attribute
    : (name=STRING EQUAL value=LEVEL) -> 
            ATTRIBUTE<SafTreeAttribute>[$name.text, $value.text]
    {
        attributes.add();
    }
    ;

behaviour
    : tactic+ -> ^(TACTIC<SafTreeTactic>["_Tactic"] tactic)+
    {
        List<Tactic> tactics = new ArrayList<Tactic>;

        behaviour = new Behaviour(tactics);
    }
    ;

tactic
    : composed_condition SQUARE_OPEN move=STRING attack=STRING SQUARE_CLOSE ->
            ^(COMPOSED_CONDITION<SafTreeComposedCondition>["_Condition"] composed_condition)
            ^(MOVE<SafTreeMove>[$move.text])
            ^(ATTACK<SafTreeAttack>[$attack.text])
    {
        tactics.add();
    }
    ;

composed_condition
    : (condition (logic^ condition)*)
    ;

//condition returns [List<SafTreeCondition> condList = new ArrayList<SafTreeCondition>()]
condition returns [int blah = 0]
    : name=STRING -> CONDITION {blah += 1}
//    : name=STRING -> CONDITION<SafTreeCondition>[$name.text]
    ;

logic
    : (var=AND|var=OR) -> LOGIC<SafTreeLogic>[$var.text]
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


