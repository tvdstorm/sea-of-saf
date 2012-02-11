// $ANTLR 3.4 /Users/michakroes/Documents/workspace/saf/src/saf/saf.g 2012-02-11 18:49:14

  package saf;


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
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    public String getGrammarFileName() { return "/Users/michakroes/Documents/workspace/saf/src/saf/saf.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:11:6: ( '(' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:11:8: '('
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
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:12:6: ( ')' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:12:8: ')'
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
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:13:7: ( '=' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:13:9: '='
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
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:14:7: ( '[' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:14:9: '['
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
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:15:7: ( ']' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:15:9: ']'
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
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:16:7: ( 'crouch' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:16:9: 'crouch'
            {
            match("crouch"); 



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
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:17:7: ( 'jump' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:17:9: 'jump'
            {
            match("jump"); 



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
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:18:7: ( 'kickPower' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:18:9: 'kickPower'
            {
            match("kickPower"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:19:7: ( 'kickReach' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:19:9: 'kickReach'
            {
            match("kickReach"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:20:7: ( 'punchPower' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:20:9: 'punchPower'
            {
            match("punchPower"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:21:7: ( 'punchReach' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:21:9: 'punchReach'
            {
            match("punchReach"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:22:7: ( 'run_away' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:22:9: 'run_away'
            {
            match("run_away"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:23:7: ( 'run_towards' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:23:9: 'run_towards'
            {
            match("run_towards"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:24:7: ( 'stand' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:24:9: 'stand'
            {
            match("stand"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:25:7: ( 'walk_away' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:25:9: 'walk_away'
            {
            match("walk_away"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:26:7: ( 'walk_towards' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:26:9: 'walk_towards'
            {
            match("walk_towards"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:27:7: ( '{' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:27:9: '{'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:28:7: ( '}' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:28:9: '}'
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
    // $ANTLR end "T__25"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:16:9: ( ( 'choose' )* )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:16:11: ( 'choose' )*
            {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:16:11: ( 'choose' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='c') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:16:12: 'choose'
            	    {
            	    match("choose"); 



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
    // $ANTLR end "CHOOSE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:17:5: ( ( '0' .. '9' )+ )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:17:7: ( '0' .. '9' )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:17:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:
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
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:18:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:18:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:18:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:
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
            	    break loop3;
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
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:19:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:19:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | CHOOSE | INT | ID | WS )
        int alt4=22;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:38: T__13
                {
                mT__13(); 


                }
                break;
            case 7 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:44: T__14
                {
                mT__14(); 


                }
                break;
            case 8 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:50: T__15
                {
                mT__15(); 


                }
                break;
            case 9 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:56: T__16
                {
                mT__16(); 


                }
                break;
            case 10 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:62: T__17
                {
                mT__17(); 


                }
                break;
            case 11 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:68: T__18
                {
                mT__18(); 


                }
                break;
            case 12 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:74: T__19
                {
                mT__19(); 


                }
                break;
            case 13 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:80: T__20
                {
                mT__20(); 


                }
                break;
            case 14 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:86: T__21
                {
                mT__21(); 


                }
                break;
            case 15 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:92: T__22
                {
                mT__22(); 


                }
                break;
            case 16 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:98: T__23
                {
                mT__23(); 


                }
                break;
            case 17 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:104: T__24
                {
                mT__24(); 


                }
                break;
            case 18 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:110: T__25
                {
                mT__25(); 


                }
                break;
            case 19 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:116: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 20 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:123: INT
                {
                mINT(); 


                }
                break;
            case 21 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:127: ID
                {
                mID(); 


                }
                break;
            case 22 :
                // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:1:130: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\17\5\uffff\7\21\6\uffff\22\21\1\55\7\21\1\uffff\5\21\1\75\1\21"+
        "\1\100\1\17\6\21\1\uffff\2\21\1\uffff\15\21\1\126\3\21\1\132\1\133"+
        "\2\21\1\uffff\1\21\1\137\1\21\2\uffff\1\141\1\142\1\21\1\uffff\1"+
        "\21\2\uffff\1\145\1\21\1\uffff\1\147\1\uffff";
    static final String DFA4_eofS =
        "\150\uffff";
    static final String DFA4_minS =
        "\1\11\5\uffff\1\150\1\165\1\151\2\165\1\164\1\141\6\uffff\2\157"+
        "\1\155\1\143\2\156\1\141\1\154\1\165\1\157\1\160\1\153\1\143\1\137"+
        "\1\156\1\153\1\143\1\163\1\60\1\120\1\150\1\141\1\144\1\137\1\150"+
        "\1\145\1\uffff\1\157\1\145\1\120\1\167\1\157\1\60\1\141\2\60\1\167"+
        "\1\141\1\157\1\145\1\141\1\167\1\uffff\1\167\1\157\1\uffff\1\150"+
        "\1\145\1\143\1\167\1\141\1\171\2\141\1\167\1\162\1\150\1\145\1\143"+
        "\1\60\1\162\1\171\1\141\2\60\1\162\1\150\1\uffff\1\144\1\60\1\162"+
        "\2\uffff\2\60\1\163\1\uffff\1\144\2\uffff\1\60\1\163\1\uffff\1\60"+
        "\1\uffff";
    static final String DFA4_maxS =
        "\1\175\5\uffff\1\162\1\165\1\151\2\165\1\164\1\141\6\uffff\2\157"+
        "\1\155\1\143\2\156\1\141\1\154\1\165\1\157\1\160\1\153\1\143\1\137"+
        "\1\156\1\153\1\143\1\163\1\172\1\122\1\150\1\164\1\144\1\137\1\150"+
        "\1\145\1\uffff\1\157\1\145\1\122\1\167\1\157\1\172\1\164\2\172\1"+
        "\167\1\141\1\157\1\145\1\141\1\167\1\uffff\1\167\1\157\1\uffff\1"+
        "\150\1\145\1\143\1\167\1\141\1\171\2\141\1\167\1\162\1\150\1\145"+
        "\1\143\1\172\1\162\1\171\1\141\2\172\1\162\1\150\1\uffff\1\144\1"+
        "\172\1\162\2\uffff\2\172\1\163\1\uffff\1\144\2\uffff\1\172\1\163"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\7\uffff\1\21\1\22\1\23\1\24\1\25\1"+
        "\26\32\uffff\1\7\17\uffff\1\16\2\uffff\1\6\25\uffff\1\14\3\uffff"+
        "\1\10\1\11\3\uffff\1\17\1\uffff\1\12\1\13\2\uffff\1\15\1\uffff\1"+
        "\20";
    static final String DFA4_specialS =
        "\150\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\22\2\uffff\1\22\22\uffff\1\22\7\uffff\1\1\1\2\6\uffff\12"+
            "\20\3\uffff\1\3\3\uffff\32\21\1\4\1\uffff\1\5\1\uffff\1\21\1"+
            "\uffff\2\21\1\6\6\21\1\7\1\10\4\21\1\11\1\21\1\12\1\13\3\21"+
            "\1\14\3\21\1\15\1\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "\1\24\11\uffff\1\23",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\56\1\uffff\1\57",
            "\1\60",
            "\1\61\22\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "\1\67",
            "\1\70",
            "\1\71\1\uffff\1\72",
            "\1\73",
            "\1\74",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\76\22\uffff\1\77",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\2\21\1\101\27\21",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "\1\110",
            "\1\111",
            "",
            "\1\24",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\140",
            "",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\143",
            "",
            "\1\144",
            "",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\146",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | CHOOSE | INT | ID | WS );";
        }
    }
 

}