grammar SAF;

options {
    output = 'AST';
}



tokens {
    AND     = 'and';
    OR      = 'or';
    EQUALS  = '=';
    LPAREN  = '(';
    RPAREN  = ')';
    LCURLY  = '{';
    RCURLY  = '}';
    LSQUARE = '[';
    RSQUARE = ']';
    CHOOSE  = 'choose';
}

@header {
package saf.parser;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

import saf.syntax.*;
}

@lexer::header { package saf.parser; }

@parser::members {
    private Fighter fighter;

    public static Fighter parseFromString(String input)
        throws RecognitionException
    {
        return buildAST(new ANTLRStringStream(input));
    }

    public static Fighter parseFromFile(String filepath)
        throws RecognitionException, java.io.IOException
    {
        return buildAST(new ANTLRFileStream(filepath));
    }

    private static Fighter buildAST(CharStream stream)
        throws RecognitionException
    {
        SAFLexer lexer = new SAFLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SAFParser parser = new SAFParser(tokens);
        parser.parse();
        return parser.fighter;
    }

    private Evaluable buildOrs(Stack<Evaluable> evaluables)
    {
        Evaluable top = evaluables.pop();
        if (!evaluables.empty())
        {
            return new Or(top, buildOrs(evaluables));
        }
        else
        {
            return top;
        }
    }

    private Evaluable buildAnds(Stack<Evaluable> evaluables)
    {
        Evaluable top = evaluables.pop();
        if (!evaluables.empty())
        {
            return new And(top, buildAnds(evaluables));
        }
        else
        {
            return top;
        }
    }
}

parse : fighter ;

fighter
    :   STRING LCURLY personality behaviour RCURLY
        {
            this.fighter = new Fighter($STRING.text,
                                       $personality.characteristics,
                                       $behaviour.actions);
        }
    ;

personality returns [List<Characteristic> characteristics]
@init
{
    $characteristics  = new ArrayList<Characteristic>();
}
    :   (STRING EQUALS DIGIT {
            Characteristic c = new Characteristic($STRING.text,
                                                  Integer.parseInt($DIGIT.text));
            $characteristics.add(c);
        })*
    ;

behaviour returns [List<Action> actions]
@init
{
    $actions = new ArrayList<Action>();
}
    :   (condition LSQUARE move=response fight=response RSQUARE {
            Action c = new Action($condition.expression,
                                  $move.construct,
                                  $fight.construct);
            $actions.add(c);
        })*
    ;

condition returns [Evaluable expression]
@init
{
    Stack<Evaluable> ors = new Stack<Evaluable>();
}
    :   left=andExpression {
            ors.push($left.expression);
        } (OR right=andExpression {
            ors.push($right.expression);
        })*
        { $expression = buildOrs(ors); }
    ;

andExpression returns [Evaluable expression]
@init
{
    Stack<Evaluable> states = new Stack<Evaluable>();
}
    :   left=STRING {
            states.push(new State($left.text));
        } (AND right=STRING {
            states.push(new State($right.text));
        })*
        { $expression = buildAnds(states); }
    ;

response returns [Response construct]
    :   CHOOSE LPAREN a=STRING b=STRING RPAREN
        {
            $construct = new Choose(Arrays.asList(new Simple($a.text),
                                                  new Simple($b.text)));
        }
    |   STRING
        {
            $construct = new Simple($STRING.text);
        }
    ;


WS
    :   ( ' ' | '\r' | '\n' | '\t' )+
        { $channel = HIDDEN; }
    ;

STRING
    :   ( 'a'..'z' | 'A'..'Z' | '_' )+
    ;

DIGIT
    :   ('0'..'9')+
    ;
