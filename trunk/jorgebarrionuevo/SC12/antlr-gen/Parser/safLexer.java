// $ANTLR 3.4 D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g 2012-02-23 10:48:59

  package Parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class safLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int BEHAVIOUR=5;
    public static final int BETWEEN=6;
    public static final int CHARACTERISTIC=7;
    public static final int DIGIT=8;
    public static final int ID=9;
    public static final int L_BRACKET=10;
    public static final int L_CURLY=11;
    public static final int L_PAR=12;
    public static final int OR=13;
    public static final int PROGRAM=14;
    public static final int R_BRACKET=15;
    public static final int R_CURLY=16;
    public static final int R_PAR=17;
    public static final int WS=18;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public safLexer() {} 
    public safLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public safLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g"; }

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:42:4: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:42:6: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:42:16: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "L_BRACKET"
    public final void mL_BRACKET() throws RecognitionException {
        try {
            int _type = L_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:44:11: ( '[' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:44:13: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_BRACKET"

    // $ANTLR start "R_BRACKET"
    public final void mR_BRACKET() throws RecognitionException {
        try {
            int _type = R_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:45:11: ( ']' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:45:13: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R_BRACKET"

    // $ANTLR start "L_CURLY"
    public final void mL_CURLY() throws RecognitionException {
        try {
            int _type = L_CURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:46:9: ( '{' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:46:11: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_CURLY"

    // $ANTLR start "R_CURLY"
    public final void mR_CURLY() throws RecognitionException {
        try {
            int _type = R_CURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:47:9: ( '}' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:47:11: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R_CURLY"

    // $ANTLR start "L_PAR"
    public final void mL_PAR() throws RecognitionException {
        try {
            int _type = L_PAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:48:7: ( '(' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:48:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_PAR"

    // $ANTLR start "R_PAR"
    public final void mR_PAR() throws RecognitionException {
        try {
            int _type = R_PAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:49:7: ( ')' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:49:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R_PAR"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:50:7: ( '0' .. '9' | '10' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='1') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='0') ) {
                    alt2=2;
                }
                else {
                    alt2=1;
                }
            }
            else if ( (LA2_0=='0'||(LA2_0 >= '2' && LA2_0 <= '9')) ) {
                alt2=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:50:9: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:50:20: '10'
                    {
                    match("10"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:51:5: ( 'and' | 'AND' | '&&' | ',' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt3=1;
                }
                break;
            case 'A':
                {
                alt3=2;
                }
                break;
            case '&':
                {
                alt3=3;
                }
                break;
            case ',':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:51:7: 'and'
                    {
                    match("and"); 



                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:51:13: 'AND'
                    {
                    match("AND"); 



                    }
                    break;
                case 3 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:51:21: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 4 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:51:28: ','
                    {
                    match(','); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:52:4: ( 'or' | 'OR' | '||' | '|' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 'o':
                {
                alt4=1;
                }
                break;
            case 'O':
                {
                alt4=2;
                }
                break;
            case '|':
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3=='|') ) {
                    alt4=3;
                }
                else {
                    alt4=4;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:52:6: 'or'
                    {
                    match("or"); 



                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:52:12: 'OR'
                    {
                    match("OR"); 



                    }
                    break;
                case 3 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:52:19: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 4 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:52:26: '|'
                    {
                    match('|'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "EOF"
    public final void mEOF() throws RecognitionException {
        try {
            int _type = EOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:53:4: ( '<EOF>' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:53:6: '<EOF>'
            {
            match("<EOF>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EOF"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:54:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:54:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:54:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:8: ( ID | L_BRACKET | R_BRACKET | L_CURLY | R_CURLY | L_PAR | R_PAR | DIGIT | AND | OR | EOF | WS )
        int alt6=12;
        switch ( input.LA(1) ) {
        case 'A':
            {
            int LA6_1 = input.LA(2);

            if ( (LA6_1=='N') ) {
                int LA6_15 = input.LA(3);

                if ( (LA6_15=='D') ) {
                    alt6=1;
                }
                else {
                    alt6=1;
                }
            }
            else {
                alt6=1;
            }
            }
            break;
        case '[':
            {
            alt6=2;
            }
            break;
        case ']':
            {
            alt6=3;
            }
            break;
        case '{':
            {
            alt6=4;
            }
            break;
        case '}':
            {
            alt6=5;
            }
            break;
        case '(':
            {
            alt6=6;
            }
            break;
        case ')':
            {
            alt6=7;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt6=8;
            }
            break;
        case '&':
        case ',':
        case 'a':
            {
            alt6=9;
            }
            break;
        case 'O':
            {
            int LA6_10 = input.LA(2);

            if ( (LA6_10=='R') ) {
                alt6=1;
            }
            else {
                alt6=1;
            }
            }
            break;
        case 'o':
        case '|':
            {
            alt6=10;
            }
            break;
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt6=1;
            }
            break;
        case '<':
            {
            alt6=11;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt6=12;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;

        }

        switch (alt6) {
            case 1 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:10: ID
                {
                mID(); 


                }
                break;
            case 2 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:13: L_BRACKET
                {
                mL_BRACKET(); 


                }
                break;
            case 3 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:23: R_BRACKET
                {
                mR_BRACKET(); 


                }
                break;
            case 4 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:33: L_CURLY
                {
                mL_CURLY(); 


                }
                break;
            case 5 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:41: R_CURLY
                {
                mR_CURLY(); 


                }
                break;
            case 6 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:49: L_PAR
                {
                mL_PAR(); 


                }
                break;
            case 7 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:55: R_PAR
                {
                mR_PAR(); 


                }
                break;
            case 8 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:61: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 9 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:67: AND
                {
                mAND(); 


                }
                break;
            case 10 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:71: OR
                {
                mOR(); 


                }
                break;
            case 11 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:74: EOF
                {
                match(EOF); 


                }
                break;
            case 12 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:78: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}