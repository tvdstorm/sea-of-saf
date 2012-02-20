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

    CHOOSE          = 'choose' ;

    PAREN_OPEN      = '(' ;
    PAREN_CLOSE     = ')' ;
}

@parser::header {
    package saf.parser;

    import saf.data.Fighter;
    import saf.data.Attribute;
    import saf.data.Behaviour;
    import saf.data.Tactic;
    import saf.data.Logic;
    import saf.data.LogicAnd;
    import saf.data.LogicOr;
    import saf.data.Condition;
    import saf.data.Action;
    import saf.data.Move;
    import saf.data.Attack;

    import saf.syntax.*;
    import saf.syntax.SyntaxCheck;
}

@lexer::header { 
    package saf.parser; 
}

@parser::members {
    private SyntaxCheck syntaxCheck;

    public SyntaxCheck getSyntaxCheck() { return syntaxCheck; }
}

/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/


parse
    : {
        List<Attribute> attributes = new ArrayList<Attribute>();
        List<Tactic> tactics = new ArrayList<Tactic>();
    }
    name=STRING super_awesome_fighter[attributes, tactics]
    { 
        String fighterName = $name.text;
        Behaviour behaviour = new Behaviour(tactics);
        saf.data.Fighter fighter = new Fighter(fighterName, attributes, 
                                               behaviour);

        syntaxCheck = new saf.syntax.Fighter(fighter);
        syntaxCheck.setParseErrors(getNumberOfSyntaxErrors());
    }
    ;

super_awesome_fighter [List<Attribute> a, List<Tactic> t]
    : CURLY_OPEN attribute[$a]* tactic[$t]* CURLY_CLOSE EOF
    ;

attribute [List<Attribute> l]
    : (name=STRING EQUAL value=LEVEL)
    {
        $l.add(new Attribute($name.text, Integer.parseInt($value.text)));
    }
    ;

tactic [List<Tactic> l]
    : logic SQUARE_OPEN move attack SQUARE_CLOSE
    {
        Action action = new Action($move.m, $attack.a);
        $l.add(new Tactic($logic.l, action));
    }
    ;

logic returns [Logic l]
    : PAREN_OPEN 
        operand1=logic (operator_=AND|operator_=OR) operand2=logic 
    PAREN_CLOSE
    {
        if ($operator_.text.equals("and"))
        {
            $l = new LogicAnd($operand1.l, $operand2.l);
        } else
        {
            $l = new LogicOr($operand1.l, $operand2.l);
        }
    }
    | condition=STRING
    {
        $l = new Condition($condition.text);
    }
    ;

move returns [Move m]
    : choose_construct
    {
        $m = new Move($choose_construct.c);
    }
    ;

attack returns [Attack a]
    : choose_construct
    {
        $a = new Attack($choose_construct.c);
    }
    ;

choose_construct returns [List<String> c]
    : {
        $c = new ArrayList<String>();
    }
    CHOOSE PAREN_OPEN choose_name[$c]+ PAREN_CLOSE
    | name=STRING
    {
        $c = new ArrayList<String>();
        $c.add($name.text);
    }
    ;

choose_name [List<String> l]
    : name=STRING
    {
        $l.add($name.text);
    }
    ;
 

/*--------------------------------------------------------------------------
 * LEXER RULES
 *--------------------------------------------------------------------------*/

LEVEL   
    : ('0'..'9')+
    ;

STRING  
    : ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')+ 
    ;

WHITESPACE 
    : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } 
    ;


