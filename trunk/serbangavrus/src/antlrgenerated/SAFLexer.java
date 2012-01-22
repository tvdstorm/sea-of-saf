// $ANTLR 3.4 D:\\Master\\Software Construction\\ANTLR\\SAF.g 2012-01-22 19:55:51

	package antlrgenerated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int BEHAVIOUR=4;
    public static final int CURLY_END=5;
    public static final int CURLY_START=6;
    public static final int NAME=7;
    public static final int NUMBER=8;
    public static final int PERSONALITY=9;
    public static final int WHITESPACE=10;

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
    public String getGrammarFileName() { return "D:\\Master\\Software Construction\\ANTLR\\SAF.g"; }

    // $ANTLR start "CURLY_END"
    public final void mCURLY_END() throws RecognitionException {
        try {
            int _type = CURLY_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:11:11: ( '}' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:11:13: '}'
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
    // $ANTLR end "CURLY_END"

    // $ANTLR start "CURLY_START"
    public final void mCURLY_START() throws RecognitionException {
        try {
            int _type = CURLY_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:12:13: ( '{' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:12:15: '{'
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
    // $ANTLR end "CURLY_START"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:13:7: ( '=' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:13:9: '='
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:14:7: ( '[' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:14:9: '['
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:15:7: ( ']' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:15:9: ']'
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:16:7: ( 'always' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:16:9: 'always'
            {
            match("always"); 



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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:17:7: ( 'block_high' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:17:9: 'block_high'
            {
            match("block_high"); 



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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:18:7: ( 'block_low' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:18:9: 'block_low'
            {
            match("block_low"); 



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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:19:7: ( 'crouch' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:19:9: 'crouch'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:20:7: ( 'even' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:20:9: 'even'
            {
            match("even"); 



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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:21:7: ( 'far' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:21:9: 'far'
            {
            match("far"); 



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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:22:7: ( 'jump' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:22:9: 'jump'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:23:7: ( 'kickPower' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:23:9: 'kickPower'
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:24:7: ( 'kickReach' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:24:9: 'kickReach'
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:25:7: ( 'kick_high' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:25:9: 'kick_high'
            {
            match("kick_high"); 



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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:26:7: ( 'kick_low' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:26:9: 'kick_low'
            {
            match("kick_low"); 



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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:27:7: ( 'much_stronger' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:27:9: 'much_stronger'
            {
            match("much_stronger"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:28:7: ( 'much_weaker' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:28:9: 'much_weaker'
            {
            match("much_weaker"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:29:7: ( 'near' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:29:9: 'near'
            {
            match("near"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:30:7: ( 'punchPower' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:30:9: 'punchPower'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:31:7: ( 'punchReach' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:31:9: 'punchReach'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:7: ( 'punch_high' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:9: 'punch_high'
            {
            match("punch_high"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:33:7: ( 'punch_low' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:33:9: 'punch_low'
            {
            match("punch_low"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:34:7: ( 'run_away' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:34:9: 'run_away'
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:35:7: ( 'run_towards' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:35:9: 'run_towards'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:36:7: ( 'stand' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:36:9: 'stand'
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:37:7: ( 'stronger' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:37:9: 'stronger'
            {
            match("stronger"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:38:7: ( 'walk_away' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:38:9: 'walk_away'
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:39:7: ( 'walk_towards' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:39:9: 'walk_towards'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:40:7: ( 'weaker' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:40:9: 'weaker'
            {
            match("weaker"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:105:2: ( '0' .. '9' | '10' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='1') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='0') ) {
                    alt1=2;
                }
                else {
                    alt1=1;
                }
            }
            else if ( (LA1_0=='0'||(LA1_0 >= '2' && LA1_0 <= '9')) ) {
                alt1=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:105:4: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:106:4: '10'
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
    // $ANTLR end "NUMBER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:110:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:110:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:110:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
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

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:115:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+ )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:115:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+
            {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:115:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    public void mTokens() throws RecognitionException {
        // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:8: ( CURLY_END | CURLY_START | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | NUMBER | WHITESPACE | NAME )
        int alt4=33;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:10: CURLY_END
                {
                mCURLY_END(); 


                }
                break;
            case 2 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:20: CURLY_START
                {
                mCURLY_START(); 


                }
                break;
            case 3 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:32: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:38: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:44: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:50: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:56: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:62: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:68: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:74: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:80: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:86: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:92: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:98: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:104: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:110: T__24
                {
                mT__24(); 


                }
                break;
            case 17 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:116: T__25
                {
                mT__25(); 


                }
                break;
            case 18 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:122: T__26
                {
                mT__26(); 


                }
                break;
            case 19 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:128: T__27
                {
                mT__27(); 


                }
                break;
            case 20 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:134: T__28
                {
                mT__28(); 


                }
                break;
            case 21 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:140: T__29
                {
                mT__29(); 


                }
                break;
            case 22 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:146: T__30
                {
                mT__30(); 


                }
                break;
            case 23 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:152: T__31
                {
                mT__31(); 


                }
                break;
            case 24 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:158: T__32
                {
                mT__32(); 


                }
                break;
            case 25 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:164: T__33
                {
                mT__33(); 


                }
                break;
            case 26 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:170: T__34
                {
                mT__34(); 


                }
                break;
            case 27 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:176: T__35
                {
                mT__35(); 


                }
                break;
            case 28 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:182: T__36
                {
                mT__36(); 


                }
                break;
            case 29 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:188: T__37
                {
                mT__37(); 


                }
                break;
            case 30 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:194: T__38
                {
                mT__38(); 


                }
                break;
            case 31 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:200: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 32 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:207: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 33 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:218: NAME
                {
                mNAME(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\6\uffff\15\26\2\46\2\uffff\16\26\1\46\1\uffff\4\26\1\72\15\26\1"+
        "\110\1\uffff\1\111\2\26\1\116\11\26\2\uffff\4\26\1\uffff\3\26\1"+
        "\144\3\26\1\151\1\26\1\154\13\26\1\uffff\3\26\1\174\1\uffff\2\26"+
        "\1\uffff\17\26\1\uffff\5\26\1\u0093\6\26\1\u009a\1\26\1\u009c\3"+
        "\26\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\uffff\5\26\1\u00a9\1\uffff"+
        "\1\26\1\uffff\1\u00ab\1\26\1\u00ad\4\uffff\2\26\1\u00b0\1\u00b1"+
        "\1\u00b2\1\uffff\1\26\1\uffff\1\26\1\uffff\1\26\1\u00b6\3\uffff"+
        "\1\u00b7\2\26\2\uffff\1\u00ba\1\u00bb\2\uffff";
    static final String DFA4_eofS =
        "\u00bc\uffff";
    static final String DFA4_minS =
        "\1\11\5\uffff\2\154\1\162\1\166\1\141\1\165\1\151\1\165\1\145\2"+
        "\165\1\164\1\141\2\55\2\uffff\1\167\2\157\1\145\1\162\1\155\2\143"+
        "\1\141\2\156\1\141\1\154\1\141\1\55\1\uffff\1\141\1\143\1\165\1"+
        "\156\1\55\1\160\1\153\1\150\1\162\1\143\1\137\1\156\1\157\2\153"+
        "\1\171\1\153\1\143\1\55\1\uffff\1\55\1\120\1\137\1\55\1\150\1\141"+
        "\1\144\1\156\1\137\1\145\1\163\1\137\1\150\2\uffff\1\157\1\145\1"+
        "\150\1\163\1\uffff\1\120\1\167\1\157\1\55\1\147\1\141\1\162\1\55"+
        "\1\150\1\55\1\167\1\141\1\151\1\157\1\164\1\145\1\157\1\145\1\150"+
        "\1\141\1\167\1\uffff\1\145\1\167\1\157\1\55\1\uffff\1\151\1\157"+
        "\1\uffff\1\145\1\143\1\147\1\167\1\162\1\141\1\167\1\141\1\151\1"+
        "\157\1\171\1\141\1\162\1\141\1\167\1\uffff\1\147\1\167\1\162\2\150"+
        "\1\55\1\157\1\153\1\145\1\143\1\147\1\167\1\55\1\162\1\55\1\171"+
        "\1\141\1\150\4\55\1\uffff\1\156\1\145\1\162\2\150\1\55\1\uffff\1"+
        "\144\1\uffff\1\55\1\162\1\55\4\uffff\1\147\1\162\3\55\1\uffff\1"+
        "\163\1\uffff\1\144\1\uffff\1\145\1\55\3\uffff\1\55\1\163\1\162\2"+
        "\uffff\2\55\2\uffff";
    static final String DFA4_maxS =
        "\1\175\5\uffff\2\154\1\162\1\166\1\141\1\165\1\151\1\165\1\145\2"+
        "\165\1\164\1\145\2\172\2\uffff\1\167\2\157\1\145\1\162\1\155\2\143"+
        "\1\141\2\156\1\162\1\154\1\141\1\172\1\uffff\1\141\1\143\1\165\1"+
        "\156\1\172\1\160\1\153\1\150\1\162\1\143\1\137\1\156\1\157\2\153"+
        "\1\171\1\153\1\143\1\172\1\uffff\1\172\2\137\1\172\1\150\1\164\1"+
        "\144\1\156\1\137\1\145\1\163\1\137\1\150\2\uffff\1\157\1\145\1\154"+
        "\1\167\1\uffff\1\137\1\167\1\157\1\172\1\147\1\164\1\162\1\172\1"+
        "\154\1\172\1\167\1\141\1\151\1\157\1\164\1\145\1\157\1\145\1\154"+
        "\1\141\1\167\1\uffff\1\145\1\167\1\157\1\172\1\uffff\1\151\1\157"+
        "\1\uffff\1\145\1\143\1\147\1\167\1\162\1\141\1\167\1\141\1\151\1"+
        "\157\1\171\1\141\1\162\1\141\1\167\1\uffff\1\147\1\167\1\162\2\150"+
        "\1\172\1\157\1\153\1\145\1\143\1\147\1\167\1\172\1\162\1\172\1\171"+
        "\1\141\1\150\4\172\1\uffff\1\156\1\145\1\162\2\150\1\172\1\uffff"+
        "\1\144\1\uffff\1\172\1\162\1\172\4\uffff\1\147\1\162\3\172\1\uffff"+
        "\1\163\1\uffff\1\144\1\uffff\1\145\1\172\3\uffff\1\172\1\163\1\162"+
        "\2\uffff\2\172\2\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\17\uffff\1\40\1\41\17\uffff\1\37\23"+
        "\uffff\1\13\15\uffff\1\12\1\14\4\uffff\1\23\25\uffff\1\32\4\uffff"+
        "\1\6\2\uffff\1\11\17\uffff\1\36\26\uffff\1\20\6\uffff\1\30\1\uffff"+
        "\1\33\3\uffff\1\10\1\15\1\16\1\17\5\uffff\1\27\1\uffff\1\34\1\uffff"+
        "\1\7\2\uffff\1\24\1\25\1\26\3\uffff\1\22\1\31\2\uffff\1\35\1\21";
    static final String DFA4_specialS =
        "\u00bc\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\25\1\uffff\2\25\22\uffff\1\25\14\uffff\1\26\2\uffff\1\24"+
            "\1\23\10\24\3\uffff\1\3\3\uffff\32\26\1\4\1\uffff\1\5\1\uffff"+
            "\1\26\1\uffff\1\6\1\7\1\10\1\26\1\11\1\12\3\26\1\13\1\14\1\26"+
            "\1\15\1\16\1\26\1\17\1\26\1\20\1\21\3\26\1\22\3\26\1\2\1\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43\3\uffff\1\44",
            "\1\26\2\uffff\1\45\11\26\7\uffff\32\26\4\uffff\1\26\1\uffff"+
            "\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62\20\uffff\1\63",
            "\1\64",
            "\1\65",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\112\1\uffff\1\113\14\uffff\1\114",
            "\1\115",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\117",
            "\1\120\22\uffff\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "\1\131",
            "\1\132",
            "\1\133\3\uffff\1\134",
            "\1\135\3\uffff\1\136",
            "",
            "\1\137\1\uffff\1\140\14\uffff\1\141",
            "\1\142",
            "\1\143",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\145",
            "\1\146\22\uffff\1\147",
            "\1\150",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\152\3\uffff\1\153",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165\3\uffff\1\166",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u009b",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00aa",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00ac",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
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
            return "1:1: Tokens : ( CURLY_END | CURLY_START | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | NUMBER | WHITESPACE | NAME );";
        }
    }
 

}