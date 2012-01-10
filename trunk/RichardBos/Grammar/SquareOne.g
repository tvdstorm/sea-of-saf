grammar SquareOne;

options {
  language = Java;
}

tokens {
  PLUS   = '+' ;
  MINUS  = '-' ;
  MULT   = '*' ;
  DIV    = '/' ;
}
 
@members {
    public static void main(String[] args) throws Exception {
        SquareOneLexer lex = new SquareOneLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SquareOneParser parser = new SquareOneParser(tokens);
        
        try {
            parser.expr();
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
    }
}
// parser rules (lower case)

expr    : term ((PLUS | MINUS) term)*;
term    : factor ((MULT | DIV) factor)*;
factor  : NUMBER;


// LEXER RULES (CAPITALS)

NUMBER      : (DIGIT)+ ;
WHITESPACE  : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; };
fragment DIGIT : '0'..'9';