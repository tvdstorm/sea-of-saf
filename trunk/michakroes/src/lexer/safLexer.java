// $ANTLR 3.4 /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g 2012-02-18 12:32:06

  package lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class safLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int CHOOSE=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int WS=7;

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
    public String getGrammarFileName() { return "/Users/michakroes/Documents/workspace/saf/src/lexer/saf.g"; }

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:11:8: ( 'choose' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:11:10: 'choose'
            {
            match("choose"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHOOSE"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:12:6: ( '(' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:12:8: '('
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:13:6: ( ')' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:13:8: ')'
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:14:7: ( '=' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:14:9: '='
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:15:7: ( '[' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:15:9: '['
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:16:7: ( ']' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:16:9: ']'
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:17:7: ( '{' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:17:9: '{'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:18:7: ( '}' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:18:9: '}'
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
    // $ANTLR end "T__14"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:25:5: ( ( '0' .. '9' )+ )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:25:7: ( '0' .. '9' )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:25:7: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:
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
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:26:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:26:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:26:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:
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
            	    break loop2;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:27:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:27:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

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
        // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:8: ( CHOOSE | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | INT | ID | WS )
        int alt3=11;
        switch ( input.LA(1) ) {
        case 'c':
            {
            int LA3_1 = input.LA(2);

            if ( (LA3_1=='h') ) {
                int LA3_12 = input.LA(3);

                if ( (LA3_12=='o') ) {
                    int LA3_13 = input.LA(4);

                    if ( (LA3_13=='o') ) {
                        int LA3_14 = input.LA(5);

                        if ( (LA3_14=='s') ) {
                            int LA3_15 = input.LA(6);

                            if ( (LA3_15=='e') ) {
                                int LA3_16 = input.LA(7);

                                if ( ((LA3_16 >= '0' && LA3_16 <= '9')||(LA3_16 >= 'A' && LA3_16 <= 'Z')||LA3_16=='_'||(LA3_16 >= 'a' && LA3_16 <= 'z')) ) {
                                    alt3=10;
                                }
                                else {
                                    alt3=1;
                                }
                            }
                            else {
                                alt3=10;
                            }
                        }
                        else {
                            alt3=10;
                        }
                    }
                    else {
                        alt3=10;
                    }
                }
                else {
                    alt3=10;
                }
            }
            else {
                alt3=10;
            }
            }
            break;
        case '(':
            {
            alt3=2;
            }
            break;
        case ')':
            {
            alt3=3;
            }
            break;
        case '=':
            {
            alt3=4;
            }
            break;
        case '[':
            {
            alt3=5;
            }
            break;
        case ']':
            {
            alt3=6;
            }
            break;
        case '{':
            {
            alt3=7;
            }
            break;
        case '}':
            {
            alt3=8;
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
            alt3=9;
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
        case 'a':
        case 'b':
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
        case 'o':
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
            alt3=10;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=11;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:10: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 2 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:17: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:22: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:27: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:33: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:39: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:45: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:51: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:57: INT
                {
                mINT(); 


                }
                break;
            case 10 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:61: ID
                {
                mID(); 


                }
                break;
            case 11 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:64: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}