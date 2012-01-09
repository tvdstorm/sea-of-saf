// $ANTLR 3.4 SuperAwesomeFighters.g 2012-01-09 16:59:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SuperAwesomeFightersLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int CURLY_CLOSE=5;
    public static final int CURLY_OPEN=6;
    public static final int EQUAL=7;
    public static final int LEVEL=8;
    public static final int OR=9;
    public static final int SQUARE_CLOSE=10;
    public static final int SQUARE_OPEN=11;
    public static final int STRING=12;
    public static final int WHITESPACE=13;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SuperAwesomeFightersLexer() {} 
    public SuperAwesomeFightersLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SuperAwesomeFightersLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "SuperAwesomeFighters.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SuperAwesomeFighters.g:2:5: ( 'and' )
            // SuperAwesomeFighters.g:2:7: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "CURLY_CLOSE"
    public final void mCURLY_CLOSE() throws RecognitionException {
        try {
            int _type = CURLY_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SuperAwesomeFighters.g:3:13: ( '}' )
            // SuperAwesomeFighters.g:3:15: '}'
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
    // $ANTLR end "CURLY_CLOSE"

    // $ANTLR start "CURLY_OPEN"
    public final void mCURLY_OPEN() throws RecognitionException {
        try {
            int _type = CURLY_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SuperAwesomeFighters.g:4:12: ( '{' )
            // SuperAwesomeFighters.g:4:14: '{'
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
    // $ANTLR end "CURLY_OPEN"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SuperAwesomeFighters.g:5:7: ( '=' )
            // SuperAwesomeFighters.g:5:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SuperAwesomeFighters.g:6:4: ( 'or' )
            // SuperAwesomeFighters.g:6:6: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "SQUARE_CLOSE"
    public final void mSQUARE_CLOSE() throws RecognitionException {
        try {
            int _type = SQUARE_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SuperAwesomeFighters.g:7:14: ( ']' )
            // SuperAwesomeFighters.g:7:16: ']'
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
    // $ANTLR end "SQUARE_CLOSE"

    // $ANTLR start "SQUARE_OPEN"
    public final void mSQUARE_OPEN() throws RecognitionException {
        try {
            int _type = SQUARE_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SuperAwesomeFighters.g:8:13: ( '[' )
            // SuperAwesomeFighters.g:8:15: '['
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
    // $ANTLR end "SQUARE_OPEN"

    // $ANTLR start "LEVEL"
    public final void mLEVEL() throws RecognitionException {
        try {
            int _type = LEVEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SuperAwesomeFighters.g:58:5: ( '0' .. '9' )
            // SuperAwesomeFighters.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEVEL"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SuperAwesomeFighters.g:62:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
            // SuperAwesomeFighters.g:62:7: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            {
            // SuperAwesomeFighters.g:62:7: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // SuperAwesomeFighters.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SuperAwesomeFighters.g:66:5: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // SuperAwesomeFighters.g:66:7: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // SuperAwesomeFighters.g:66:7: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // SuperAwesomeFighters.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // SuperAwesomeFighters.g:1:8: ( AND | CURLY_CLOSE | CURLY_OPEN | EQUAL | OR | SQUARE_CLOSE | SQUARE_OPEN | LEVEL | STRING | WHITESPACE )
        int alt3=10;
        switch ( input.LA(1) ) {
        case 'a':
            {
            int LA3_1 = input.LA(2);

            if ( (LA3_1=='n') ) {
                int LA3_11 = input.LA(3);

                if ( (LA3_11=='d') ) {
                    int LA3_14 = input.LA(4);

                    if ( ((LA3_14 >= '0' && LA3_14 <= '9')||(LA3_14 >= 'A' && LA3_14 <= 'Z')||LA3_14=='_'||(LA3_14 >= 'a' && LA3_14 <= 'z')) ) {
                        alt3=9;
                    }
                    else {
                        alt3=1;
                    }
                }
                else {
                    alt3=9;
                }
            }
            else {
                alt3=9;
            }
            }
            break;
        case '}':
            {
            alt3=2;
            }
            break;
        case '{':
            {
            alt3=3;
            }
            break;
        case '=':
            {
            alt3=4;
            }
            break;
        case 'o':
            {
            int LA3_5 = input.LA(2);

            if ( (LA3_5=='r') ) {
                int LA3_12 = input.LA(3);

                if ( ((LA3_12 >= '0' && LA3_12 <= '9')||(LA3_12 >= 'A' && LA3_12 <= 'Z')||LA3_12=='_'||(LA3_12 >= 'a' && LA3_12 <= 'z')) ) {
                    alt3=9;
                }
                else {
                    alt3=5;
                }
            }
            else {
                alt3=9;
            }
            }
            break;
        case ']':
            {
            alt3=6;
            }
            break;
        case '[':
            {
            alt3=7;
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
            int LA3_8 = input.LA(2);

            if ( ((LA3_8 >= '0' && LA3_8 <= '9')||(LA3_8 >= 'A' && LA3_8 <= 'Z')||LA3_8=='_'||(LA3_8 >= 'a' && LA3_8 <= 'z')) ) {
                alt3=9;
            }
            else {
                alt3=8;
            }
            }
            break;
        case 'A':
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
        case 'O':
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
        case '_':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=9;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt3=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // SuperAwesomeFighters.g:1:10: AND
                {
                mAND(); 


                }
                break;
            case 2 :
                // SuperAwesomeFighters.g:1:14: CURLY_CLOSE
                {
                mCURLY_CLOSE(); 


                }
                break;
            case 3 :
                // SuperAwesomeFighters.g:1:26: CURLY_OPEN
                {
                mCURLY_OPEN(); 


                }
                break;
            case 4 :
                // SuperAwesomeFighters.g:1:37: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 5 :
                // SuperAwesomeFighters.g:1:43: OR
                {
                mOR(); 


                }
                break;
            case 6 :
                // SuperAwesomeFighters.g:1:46: SQUARE_CLOSE
                {
                mSQUARE_CLOSE(); 


                }
                break;
            case 7 :
                // SuperAwesomeFighters.g:1:59: SQUARE_OPEN
                {
                mSQUARE_OPEN(); 


                }
                break;
            case 8 :
                // SuperAwesomeFighters.g:1:71: LEVEL
                {
                mLEVEL(); 


                }
                break;
            case 9 :
                // SuperAwesomeFighters.g:1:77: STRING
                {
                mSTRING(); 


                }
                break;
            case 10 :
                // SuperAwesomeFighters.g:1:84: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


 

}