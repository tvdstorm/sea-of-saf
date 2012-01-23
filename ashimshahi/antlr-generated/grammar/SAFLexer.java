// $ANTLR 3.4 C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g 2012-01-23 17:30:38

  package grammar; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int DIGIT=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int LETTER=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SAFLexer() {} 
    public SAFLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SAFLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:6:6: ( '(' )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:6:8: '('
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:7:7: ( ')' )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:7:9: ')'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:8:7: ( '=' )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:8:9: '='
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:9:7: ( '[' )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:9:9: '['
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:10:7: ( ']' )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:10:9: ']'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:11:7: ( '{' )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:11:9: '{'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:12:7: ( '}' )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:12:9: '}'
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
    // $ANTLR end "T__15"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:44:2: ( '0' .. '9' )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:47:9: ( ( DIGIT )+ )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:47:11: ( DIGIT )+
            {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:47:11: ( DIGIT )+
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
            	    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:
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
    // $ANTLR end "INTEGER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:50:2: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:54:2: ( LETTER ( LETTER | '_' )+ )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:54:4: LETTER ( LETTER | '_' )+
            {
            mLETTER(); 


            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:54:11: ( LETTER | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:57:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:57:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:57:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
        // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | INTEGER | IDENT | WS )
        int alt4=10;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt4=1;
            }
            break;
        case ')':
            {
            alt4=2;
            }
            break;
        case '=':
            {
            alt4=3;
            }
            break;
        case '[':
            {
            alt4=4;
            }
            break;
        case ']':
            {
            alt4=5;
            }
            break;
        case '{':
            {
            alt4=6;
            }
            break;
        case '}':
            {
            alt4=7;
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
            alt4=8;
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
        case 'a':
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
            alt4=9;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt4=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:1:51: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 9 :
                // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:1:59: IDENT
                {
                mIDENT(); 


                }
                break;
            case 10 :
                // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:1:65: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}