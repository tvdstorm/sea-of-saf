// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g 2012-02-21 16:21:56

  package com.mike.SAF;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SAFgrammarLexer extends Lexer {
    public static final int T__20=20;
    public static final int ATTRIBUTE=5;
    public static final int CONDITION=9;
    public static final int AND=10;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int NAME=4;
    public static final int WS=12;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int FIGHT=8;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int MOVE=7;
    public static final int T__13=13;
    public static final int OR=11;
    public static final int DIGIT=6;

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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:13:7: ( '=' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:13:9: '='
            {
            match('='); 

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
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:14:7: ( '[' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:14:9: '['
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
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:15:7: ( ']' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:15:9: ']'
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
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:16:7: ( 'choose' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:16:9: 'choose'
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
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:17:7: ( '(' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:17:9: '('
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
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:18:7: ( ')' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:18:9: ')'
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

    // $ANTLR start "ATTRIBUTE"
    public final void mATTRIBUTE() throws RecognitionException {
        try {
            int _type = ATTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:110:10: ( ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' ) )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:111:2: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:111:2: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:111:3: 'punchReach'
                    {
                    match("punchReach"); 


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:111:18: 'punchPower'
                    {
                    match("punchPower"); 


                    }
                    break;
                case 3 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:111:33: 'kickReach'
                    {
                    match("kickReach"); 


                    }
                    break;
                case 4 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:111:47: 'kickPower'
                    {
                    match("kickPower"); 


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
    // $ANTLR end "ATTRIBUTE"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:113:5: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:114:2: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:114:2: ( 'A' .. 'Z' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:114:3: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:114:12: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
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
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:116:5: ( ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' ) )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:117:2: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:117:2: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:117:3: 'walk_towards'
                    {
                    match("walk_towards"); 


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:117:20: 'walk_away'
                    {
                    match("walk_away"); 


                    }
                    break;
                case 3 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:117:34: 'run_towards'
                    {
                    match("run_towards"); 


                    }
                    break;
                case 4 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:117:50: 'run_away'
                    {
                    match("run_away"); 


                    }
                    break;
                case 5 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:117:63: 'jump'
                    {
                    match("jump"); 


                    }
                    break;
                case 6 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:117:72: 'crouch'
                    {
                    match("crouch"); 


                    }
                    break;
                case 7 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:117:83: 'stand'
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
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:119:6: ( ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' ) )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:120:2: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:120:2: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:120:3: 'block_low'
                    {
                    match("block_low"); 


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:120:17: 'block_high'
                    {
                    match("block_high"); 


                    }
                    break;
                case 3 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:120:32: 'punch_low'
                    {
                    match("punch_low"); 


                    }
                    break;
                case 4 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:120:46: 'punch_high'
                    {
                    match("punch_high"); 


                    }
                    break;
                case 5 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:120:61: 'kick_low'
                    {
                    match("kick_low"); 


                    }
                    break;
                case 6 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:120:74: 'kick_high'
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
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:122:7: ( ( '0' .. '9' )+ )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:123:3: ( '0' .. '9' )+
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:123:3: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:123:3: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:126:2: ( ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' ) )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:127:2: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:127:2: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            int alt6=8;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:127:3: 'always'
                    {
                    match("always"); 


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:127:14: 'near'
                    {
                    match("near"); 


                    }
                    break;
                case 3 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:127:23: 'far'
                    {
                    match("far"); 


                    }
                    break;
                case 4 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:127:31: 'much_stronger'
                    {
                    match("much_stronger"); 


                    }
                    break;
                case 5 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:127:49: 'stronger'
                    {
                    match("stronger"); 


                    }
                    break;
                case 6 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:127:62: 'even'
                    {
                    match("even"); 


                    }
                    break;
                case 7 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:127:71: 'weaker'
                    {
                    match("weaker"); 


                    }
                    break;
                case 8 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:127:82: 'much_weaker'
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

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:130:4: ( 'and' | 'AND' | '&&' | ',' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt7=1;
                }
                break;
            case 'A':
                {
                alt7=2;
                }
                break;
            case '&':
                {
                alt7=3;
                }
                break;
            case ',':
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:131:2: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:131:10: 'AND'
                    {
                    match("AND"); 


                    }
                    break;
                case 3 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:131:18: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 4 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:131:25: ','
                    {
                    match(','); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:133:3: ( 'or' | 'OR' | '||' | '|' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 'o':
                {
                alt8=1;
                }
                break;
            case 'O':
                {
                alt8=2;
                }
                break;
            case '|':
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3=='|') ) {
                    alt8=3;
                }
                else {
                    alt8=4;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:134:2: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:134:9: 'OR'
                    {
                    match("OR"); 


                    }
                    break;
                case 3 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:134:16: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 4 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:134:23: '|'
                    {
                    match('|'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:139:4: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:139:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
            {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:139:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
        // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | ATTRIBUTE | NAME | MOVE | FIGHT | DIGIT | CONDITION | AND | OR | WS )
        int alt10=17;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:58: ATTRIBUTE
                {
                mATTRIBUTE(); 

                }
                break;
            case 10 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:68: NAME
                {
                mNAME(); 

                }
                break;
            case 11 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:73: MOVE
                {
                mMOVE(); 

                }
                break;
            case 12 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:78: FIGHT
                {
                mFIGHT(); 

                }
                break;
            case 13 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:84: DIGIT
                {
                mDIGIT(); 

                }
                break;
            case 14 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:90: CONDITION
                {
                mCONDITION(); 

                }
                break;
            case 15 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:100: AND
                {
                mAND(); 

                }
                break;
            case 16 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:104: OR
                {
                mOR(); 

                }
                break;
            case 17 :
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:1:107: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA1_eotS =
        "\16\uffff";
    static final String DFA1_eofS =
        "\16\uffff";
    static final String DFA1_minS =
        "\1\153\1\165\1\151\1\156\2\143\1\153\1\150\2\120\4\uffff";
    static final String DFA1_maxS =
        "\1\160\1\165\1\151\1\156\2\143\1\153\1\150\2\122\4\uffff";
    static final String DFA1_acceptS =
        "\12\uffff\1\3\1\4\1\1\1\2";
    static final String DFA1_specialS =
        "\16\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\4\uffff\1\1",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\13\1\uffff\1\12",
            "\1\15\1\uffff\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "111:2: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )";
        }
    }
    static final String DFA3_eotS =
        "\21\uffff";
    static final String DFA3_eofS =
        "\21\uffff";
    static final String DFA3_minS =
        "\1\143\1\141\1\165\3\uffff\1\154\1\156\1\153\2\137\2\141\4\uffff";
    static final String DFA3_maxS =
        "\1\167\1\141\1\165\3\uffff\1\154\1\156\1\153\2\137\2\164\4\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\5\1\6\1\7\7\uffff\1\3\1\4\1\1\1\2";
    static final String DFA3_specialS =
        "\21\uffff}>";
    static final String[] DFA3_transitionS = {
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
            return "117:2: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )";
        }
    }
    static final String DFA4_eotS =
        "\30\uffff";
    static final String DFA4_eofS =
        "\30\uffff";
    static final String DFA4_minS =
        "\1\142\1\154\1\165\1\151\1\157\1\156\3\143\2\153\1\150\3\137\3\150"+
        "\6\uffff";
    static final String DFA4_maxS =
        "\1\160\1\154\1\165\1\151\1\157\1\156\3\143\2\153\1\150\3\137\3\154"+
        "\6\uffff";
    static final String DFA4_acceptS =
        "\22\uffff\1\5\1\6\1\1\1\2\1\3\1\4";
    static final String DFA4_specialS =
        "\30\uffff}>";
    static final String[] DFA4_transitionS = {
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
            return "120:2: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )";
        }
    }
    static final String DFA6_eotS =
        "\16\uffff";
    static final String DFA6_eofS =
        "\16\uffff";
    static final String DFA6_minS =
        "\1\141\3\uffff\1\165\3\uffff\1\143\1\150\1\137\1\163\2\uffff";
    static final String DFA6_maxS =
        "\1\167\3\uffff\1\165\3\uffff\1\143\1\150\1\137\1\167\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\4\uffff\1\4\1\10";
    static final String DFA6_specialS =
        "\16\uffff}>";
    static final String[] DFA6_transitionS = {
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
            return "127:2: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )";
        }
    }
    static final String DFA10_eotS =
        "\13\uffff\1\26\7\uffff\1\26\7\uffff\1\26\11\uffff";
    static final String DFA10_eofS =
        "\45\uffff";
    static final String DFA10_minS =
        "\1\11\5\uffff\1\150\2\uffff\1\165\1\151\1\116\1\141\1\uffff\1\164"+
        "\2\uffff\1\154\1\uffff\1\122\5\uffff\1\156\1\143\1\104\1\141\1\uffff"+
        "\1\143\1\153\1\uffff\1\150\2\120\1\uffff";
    static final String DFA10_maxS =
        "\1\175\5\uffff\1\162\2\uffff\1\165\1\151\1\116\1\145\1\uffff\1\164"+
        "\2\uffff\1\156\1\uffff\1\122\5\uffff\1\156\1\143\1\104\1\162\1\uffff"+
        "\1\143\1\153\1\uffff\1\150\2\137\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\4\uffff\1\13\1\uffff"+
        "\1\14\1\15\1\uffff\1\16\1\uffff\1\17\1\20\1\12\1\21\1\6\4\uffff"+
        "\1\12\2\uffff\1\12\3\uffff\1\11";
    static final String DFA10_specialS =
        "\45\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\5\uffff\1\24\1\uffff\1\7\1"+
            "\10\2\uffff\1\24\3\uffff\12\20\3\uffff\1\3\3\uffff\1\13\15\26"+
            "\1\23\13\26\1\4\1\uffff\1\5\3\uffff\1\21\1\17\1\6\1\uffff\2"+
            "\22\3\uffff\1\15\1\12\1\uffff\2\22\1\25\1\11\1\uffff\1\15\1"+
            "\16\3\uffff\1\14\3\uffff\1\1\1\25\1\2",
            "",
            "",
            "",
            "",
            "",
            "\1\30\11\uffff\1\15",
            "",
            "",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\15\3\uffff\1\22",
            "",
            "\1\34",
            "",
            "",
            "\1\22\1\uffff\1\24",
            "",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\15\20\uffff\1\22",
            "",
            "\1\41",
            "\1\42",
            "",
            "\1\43",
            "\1\44\1\uffff\1\44\14\uffff\1\17",
            "\1\44\1\uffff\1\44\14\uffff\1\17",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | ATTRIBUTE | NAME | MOVE | FIGHT | DIGIT | CONDITION | AND | OR | WS );";
        }
    }
 

}