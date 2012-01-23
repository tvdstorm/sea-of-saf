// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g 2012-01-23 12:14:31

  package com.mike.SAF;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SAFgrammarLexer extends Lexer {
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int CONDITION=9;
    public static final int EOF=-1;
    public static final int BEHAVIOUR=4;
    public static final int T__19=19;
    public static final int NAME=8;
    public static final int WS=13;
    public static final int T__16=16;
    public static final int FIGHT=11;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int MOVE=10;
    public static final int CHARACTERISTIC=5;
    public static final int PROGRAM=7;
    public static final int DIGIT=12;
    public static final int BETWEEN=6;

    // delegates
    // delegators

    public SAFgrammarLexer() {;} 
    public SAFgrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SAFgrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:11:7: ( '{' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:12:7: ( '}' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:12:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:13:7: ( '[' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:14:7: ( ']' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:15:7: ( 'choose' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:15:9: 'choose'
            {
            match("choose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:16:7: ( '(' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:17:7: ( ')' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:18:7: ( 'punchReach' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:18:9: 'punchReach'
            {
            match("punchReach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:19:7: ( 'punchPower' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:19:9: 'punchPower'
            {
            match("punchPower"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:20:7: ( 'kickReach' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:20:9: 'kickReach'
            {
            match("kickReach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:21:7: ( 'kickPower' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:21:9: 'kickPower'
            {
            match("kickPower"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:22:7: ( '=' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:39:5: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:40:2: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:40:2: ( 'A' .. 'Z' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:40:3: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:40:12: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "MOVE"
    public final void mMOVE() throws RecognitionException {
        try {
            int _type = MOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:60:5: ( ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' ) )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:61:2: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:61:2: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:61:3: 'walk_towards'
                    {
                    match("walk_towards"); 


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:61:20: 'walk_away'
                    {
                    match("walk_away"); 


                    }
                    break;
                case 3 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:61:34: 'run_towards'
                    {
                    match("run_towards"); 


                    }
                    break;
                case 4 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:61:50: 'run_away'
                    {
                    match("run_away"); 


                    }
                    break;
                case 5 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:61:63: 'jump'
                    {
                    match("jump"); 


                    }
                    break;
                case 6 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:61:72: 'crouch'
                    {
                    match("crouch"); 


                    }
                    break;
                case 7 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:61:83: 'stand'
                    {
                    match("stand"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOVE"

    // $ANTLR start "FIGHT"
    public final void mFIGHT() throws RecognitionException {
        try {
            int _type = FIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:63:6: ( ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' ) )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:64:2: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:64:2: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:64:3: 'block_low'
                    {
                    match("block_low"); 


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:64:17: 'block_high'
                    {
                    match("block_high"); 


                    }
                    break;
                case 3 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:64:32: 'punch_low'
                    {
                    match("punch_low"); 


                    }
                    break;
                case 4 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:64:46: 'punch_high'
                    {
                    match("punch_high"); 


                    }
                    break;
                case 5 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:64:61: 'kick_low'
                    {
                    match("kick_low"); 


                    }
                    break;
                case 6 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:64:74: 'kick_high'
                    {
                    match("kick_high"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIGHT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:66:7: ( '0' .. '9' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:67:3: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "CONDITION"
    public final void mCONDITION() throws RecognitionException {
        try {
            int _type = CONDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:72:10: ( ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' ) )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:73:2: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:73:2: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:73:3: 'always'
                    {
                    match("always"); 


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:73:14: 'near'
                    {
                    match("near"); 


                    }
                    break;
                case 3 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:73:23: 'far'
                    {
                    match("far"); 


                    }
                    break;
                case 4 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:73:31: 'much_stronger'
                    {
                    match("much_stronger"); 


                    }
                    break;
                case 5 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:73:49: 'stronger'
                    {
                    match("stronger"); 


                    }
                    break;
                case 6 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:73:62: 'even'
                    {
                    match("even"); 


                    }
                    break;
                case 7 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:73:71: 'weaker'
                    {
                    match("weaker"); 


                    }
                    break;
                case 8 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:73:82: 'much_weaker'
                    {
                    match("much_weaker"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONDITION"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:77:4: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:77:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:77:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | NAME | MOVE | FIGHT | DIGIT | CONDITION | WS )
        int alt6=18;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:82: NAME
                {
                mNAME(); 

                }
                break;
            case 14 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:87: MOVE
                {
                mMOVE(); 

                }
                break;
            case 15 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:92: FIGHT
                {
                mFIGHT(); 

                }
                break;
            case 16 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:98: DIGIT
                {
                mDIGIT(); 

                }
                break;
            case 17 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:104: CONDITION
                {
                mCONDITION(); 

                }
                break;
            case 18 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:114: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA2_eotS =
        "\21\uffff";
    static final String DFA2_eofS =
        "\21\uffff";
    static final String DFA2_minS =
        "\1\143\1\141\1\165\3\uffff\1\154\1\156\1\153\2\137\2\141\4\uffff";
    static final String DFA2_maxS =
        "\1\167\1\141\1\165\3\uffff\1\154\1\156\1\153\2\137\2\164\4\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\5\1\6\1\7\7\uffff\1\3\1\4\1\1\1\2";
    static final String DFA2_specialS =
        "\21\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\6\uffff\1\3\7\uffff\1\2\1\5\3\uffff\1\1",
            "\1\6",
            "\1\7",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\16\22\uffff\1\15",
            "\1\20\22\uffff\1\17",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "61:2: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )";
        }
    }
    static final String DFA3_eotS =
        "\30\uffff";
    static final String DFA3_eofS =
        "\30\uffff";
    static final String DFA3_minS =
        "\1\142\1\154\1\165\1\151\1\157\1\156\3\143\2\153\1\150\3\137\3\150"+
        "\6\uffff";
    static final String DFA3_maxS =
        "\1\160\1\154\1\165\1\151\1\157\1\156\3\143\2\153\1\150\3\137\3\154"+
        "\6\uffff";
    static final String DFA3_acceptS =
        "\22\uffff\1\5\1\6\1\1\1\2\1\3\1\4";
    static final String DFA3_specialS =
        "\30\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\10\uffff\1\3\4\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\23\3\uffff\1\22",
            "\1\25\3\uffff\1\24",
            "\1\27\3\uffff\1\26",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "64:2: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )";
        }
    }
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\1\141\3\uffff\1\165\3\uffff\1\143\1\150\1\137\1\163\2\uffff";
    static final String DFA4_maxS =
        "\1\167\3\uffff\1\165\3\uffff\1\143\1\150\1\137\1\167\2\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\4\uffff\1\4\1\10";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\3\uffff\1\6\1\3\6\uffff\1\4\1\2\4\uffff\1\5\3\uffff\1\7",
            "",
            "",
            "",
            "\1\10",
            "",
            "",
            "",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14\3\uffff\1\15",
            "",
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
            return "73:2: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )";
        }
    }
    static final String DFA6_eotS =
        "\40\uffff";
    static final String DFA6_eofS =
        "\40\uffff";
    static final String DFA6_minS =
        "\1\11\4\uffff\1\150\2\uffff\1\165\1\151\2\uffff\1\141\1\uffff\1"+
        "\164\5\uffff\1\156\1\143\1\141\1\143\1\153\1\150\2\120\4\uffff";
    static final String DFA6_maxS =
        "\1\175\4\uffff\1\162\2\uffff\1\165\1\151\2\uffff\1\145\1\uffff\1"+
        "\164\5\uffff\1\156\1\143\1\162\1\143\1\153\1\150\2\137\4\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\2\uffff\1\14\1\15\1\uffff"+
        "\1\16\1\uffff\1\17\1\20\1\21\1\22\1\5\10\uffff\1\12\1\13\1\10\1"+
        "\11";
    static final String DFA6_specialS =
        "\40\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\22\2\uffff\1\22\22\uffff\1\22\7\uffff\1\6\1\7\6\uffff\12"+
            "\20\3\uffff\1\12\3\uffff\32\13\1\3\1\uffff\1\4\3\uffff\1\21"+
            "\1\17\1\5\1\uffff\2\21\3\uffff\1\15\1\11\1\uffff\2\21\1\uffff"+
            "\1\10\1\uffff\1\15\1\16\3\uffff\1\14\3\uffff\1\1\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\23\11\uffff\1\15",
            "",
            "",
            "\1\24",
            "\1\25",
            "",
            "",
            "\1\15\3\uffff\1\21",
            "",
            "\1\26",
            "",
            "",
            "",
            "",
            "",
            "\1\27",
            "\1\30",
            "\1\15\20\uffff\1\21",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\35\1\uffff\1\34\14\uffff\1\17",
            "\1\37\1\uffff\1\36\14\uffff\1\17",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | NAME | MOVE | FIGHT | DIGIT | CONDITION | WS );";
        }
    }
 

}