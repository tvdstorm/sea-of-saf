// $ANTLR 3.4 C:\\Sea-Of-Saf\\safgrammar.g 2012-01-22 19:40:45

package cb.saf.parser;

import cb.saf.parser.*;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SafgrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__7=7;
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
    public static final int FighterName=4;
    public static final int IgnoreSpacesTabsNewlines=5;
    public static final int StrengthValues=6;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SafgrammarLexer() {} 
    public SafgrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SafgrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Sea-Of-Saf\\safgrammar.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:11:6: ( '=' )
            // C:\\Sea-Of-Saf\\safgrammar.g:11:8: '='
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
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:12:6: ( '[' )
            // C:\\Sea-Of-Saf\\safgrammar.g:12:8: '['
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:13:6: ( ']' )
            // C:\\Sea-Of-Saf\\safgrammar.g:13:8: ']'
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:14:7: ( 'always' )
            // C:\\Sea-Of-Saf\\safgrammar.g:14:9: 'always'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:15:7: ( 'block_high' )
            // C:\\Sea-Of-Saf\\safgrammar.g:15:9: 'block_high'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:16:7: ( 'block_low' )
            // C:\\Sea-Of-Saf\\safgrammar.g:16:9: 'block_low'
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:17:7: ( 'crouch' )
            // C:\\Sea-Of-Saf\\safgrammar.g:17:9: 'crouch'
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
            // C:\\Sea-Of-Saf\\safgrammar.g:18:7: ( 'even' )
            // C:\\Sea-Of-Saf\\safgrammar.g:18:9: 'even'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:19:7: ( 'far' )
            // C:\\Sea-Of-Saf\\safgrammar.g:19:9: 'far'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:20:7: ( 'jump' )
            // C:\\Sea-Of-Saf\\safgrammar.g:20:9: 'jump'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:21:7: ( 'kickPower' )
            // C:\\Sea-Of-Saf\\safgrammar.g:21:9: 'kickPower'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:22:7: ( 'kickReach' )
            // C:\\Sea-Of-Saf\\safgrammar.g:22:9: 'kickReach'
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:23:7: ( 'kick_high' )
            // C:\\Sea-Of-Saf\\safgrammar.g:23:9: 'kick_high'
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:24:7: ( 'kick_low' )
            // C:\\Sea-Of-Saf\\safgrammar.g:24:9: 'kick_low'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:25:7: ( 'much_stronger' )
            // C:\\Sea-Of-Saf\\safgrammar.g:25:9: 'much_stronger'
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:26:7: ( 'much_weaker' )
            // C:\\Sea-Of-Saf\\safgrammar.g:26:9: 'much_weaker'
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:27:7: ( 'near' )
            // C:\\Sea-Of-Saf\\safgrammar.g:27:9: 'near'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:28:7: ( 'punchPower' )
            // C:\\Sea-Of-Saf\\safgrammar.g:28:9: 'punchPower'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:29:7: ( 'punchReach' )
            // C:\\Sea-Of-Saf\\safgrammar.g:29:9: 'punchReach'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:30:7: ( 'punch_high' )
            // C:\\Sea-Of-Saf\\safgrammar.g:30:9: 'punch_high'
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:31:7: ( 'punch_low' )
            // C:\\Sea-Of-Saf\\safgrammar.g:31:9: 'punch_low'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:32:7: ( 'run_away' )
            // C:\\Sea-Of-Saf\\safgrammar.g:32:9: 'run_away'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:33:7: ( 'run_towards' )
            // C:\\Sea-Of-Saf\\safgrammar.g:33:9: 'run_towards'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:34:7: ( 'stand' )
            // C:\\Sea-Of-Saf\\safgrammar.g:34:9: 'stand'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:35:7: ( 'stronger' )
            // C:\\Sea-Of-Saf\\safgrammar.g:35:9: 'stronger'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:36:7: ( 'walk_away' )
            // C:\\Sea-Of-Saf\\safgrammar.g:36:9: 'walk_away'
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:37:7: ( 'walk_towards' )
            // C:\\Sea-Of-Saf\\safgrammar.g:37:9: 'walk_towards'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:38:7: ( 'weaker' )
            // C:\\Sea-Of-Saf\\safgrammar.g:38:9: 'weaker'
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:39:7: ( '{' )
            // C:\\Sea-Of-Saf\\safgrammar.g:39:9: '{'
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:40:7: ( '}' )
            // C:\\Sea-Of-Saf\\safgrammar.g:40:9: '}'
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
    // $ANTLR end "T__36"

    // $ANTLR start "StrengthValues"
    public final void mStrengthValues() throws RecognitionException {
        try {
            int _type = StrengthValues;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:67:2: ( ( '1' .. '9' | '10' ) )
            // C:\\Sea-Of-Saf\\safgrammar.g:67:4: ( '1' .. '9' | '10' )
            {
            // C:\\Sea-Of-Saf\\safgrammar.g:67:4: ( '1' .. '9' | '10' )
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
            else if ( ((LA1_0 >= '2' && LA1_0 <= '9')) ) {
                alt1=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Sea-Of-Saf\\safgrammar.g:67:5: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // C:\\Sea-Of-Saf\\safgrammar.g:67:14: '10'
                    {
                    match("10"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StrengthValues"

    // $ANTLR start "FighterName"
    public final void mFighterName() throws RecognitionException {
        try {
            int _type = FighterName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:69:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // C:\\Sea-Of-Saf\\safgrammar.g:69:4: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Sea-Of-Saf\\safgrammar.g:69:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Sea-Of-Saf\\safgrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "FighterName"

    // $ANTLR start "IgnoreSpacesTabsNewlines"
    public final void mIgnoreSpacesTabsNewlines() throws RecognitionException {
        try {
            int _type = IgnoreSpacesTabsNewlines;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Sea-Of-Saf\\safgrammar.g:71:2: ( ( '\\n' | '\\r' | '\\t' | ' ' )+ )
            // C:\\Sea-Of-Saf\\safgrammar.g:71:4: ( '\\n' | '\\r' | '\\t' | ' ' )+
            {
            // C:\\Sea-Of-Saf\\safgrammar.g:71:4: ( '\\n' | '\\r' | '\\t' | ' ' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Sea-Of-Saf\\safgrammar.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
    // $ANTLR end "IgnoreSpacesTabsNewlines"

    public void mTokens() throws RecognitionException {
        // C:\\Sea-Of-Saf\\safgrammar.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | StrengthValues | FighterName | IgnoreSpacesTabsNewlines )
        int alt4=33;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:25: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:31: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:37: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:43: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:49: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:55: T__15
                {
                mT__15(); 


                }
                break;
            case 10 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:61: T__16
                {
                mT__16(); 


                }
                break;
            case 11 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:67: T__17
                {
                mT__17(); 


                }
                break;
            case 12 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:73: T__18
                {
                mT__18(); 


                }
                break;
            case 13 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:79: T__19
                {
                mT__19(); 


                }
                break;
            case 14 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:85: T__20
                {
                mT__20(); 


                }
                break;
            case 15 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:91: T__21
                {
                mT__21(); 


                }
                break;
            case 16 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:97: T__22
                {
                mT__22(); 


                }
                break;
            case 17 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:103: T__23
                {
                mT__23(); 


                }
                break;
            case 18 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:109: T__24
                {
                mT__24(); 


                }
                break;
            case 19 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:115: T__25
                {
                mT__25(); 


                }
                break;
            case 20 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:121: T__26
                {
                mT__26(); 


                }
                break;
            case 21 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:127: T__27
                {
                mT__27(); 


                }
                break;
            case 22 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:133: T__28
                {
                mT__28(); 


                }
                break;
            case 23 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:139: T__29
                {
                mT__29(); 


                }
                break;
            case 24 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:145: T__30
                {
                mT__30(); 


                }
                break;
            case 25 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:151: T__31
                {
                mT__31(); 


                }
                break;
            case 26 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:157: T__32
                {
                mT__32(); 


                }
                break;
            case 27 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:163: T__33
                {
                mT__33(); 


                }
                break;
            case 28 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:169: T__34
                {
                mT__34(); 


                }
                break;
            case 29 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:175: T__35
                {
                mT__35(); 


                }
                break;
            case 30 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:181: T__36
                {
                mT__36(); 


                }
                break;
            case 31 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:187: StrengthValues
                {
                mStrengthValues(); 


                }
                break;
            case 32 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:202: FighterName
                {
                mFighterName(); 


                }
                break;
            case 33 :
                // C:\\Sea-Of-Saf\\safgrammar.g:1:214: IgnoreSpacesTabsNewlines
                {
                mIgnoreSpacesTabsNewlines(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\4\uffff\15\24\5\uffff\22\24\1\67\15\24\1\105\1\uffff\1\106\2\24"+
        "\1\113\1\24\1\uffff\7\24\2\uffff\2\24\3\uffff\1\24\2\uffff\1\137"+
        "\1\24\1\uffff\1\24\1\144\1\uffff\1\147\2\24\4\uffff\2\24\2\uffff"+
        "\1\24\2\uffff\1\157\4\uffff\4\24\2\uffff\1\24\1\uffff\4\24\1\171"+
        "\1\172\1\173\2\24\3\uffff\1\176\1\177\2\uffff";
    static final String DFA4_eofS =
        "\u0080\uffff";
    static final String DFA4_minS =
        "\1\11\3\uffff\2\154\1\162\1\166\1\141\1\165\1\151\1\165\1\145\2"+
        "\165\1\164\1\141\5\uffff\1\167\2\157\1\145\1\162\1\155\2\143\1\141"+
        "\2\156\1\141\1\154\2\141\1\143\1\165\1\156\1\60\1\160\1\153\1\150"+
        "\1\162\1\143\1\137\1\156\1\157\2\153\1\171\1\153\1\143\1\60\1\uffff"+
        "\1\60\1\120\1\137\1\60\1\150\1\141\1\144\1\156\1\137\1\145\1\163"+
        "\1\137\1\150\2\uffff\1\157\1\145\1\150\1\163\1\uffff\1\120\2\uffff"+
        "\1\60\1\147\1\141\1\162\1\60\1\150\1\60\1\167\1\141\4\uffff\1\157"+
        "\1\145\1\150\1\uffff\1\145\2\uffff\1\60\4\uffff\1\145\1\143\1\167"+
        "\1\141\2\uffff\1\162\1\uffff\1\162\1\150\1\145\1\143\3\60\1\162"+
        "\1\150\3\uffff\2\60\2\uffff";
    static final String DFA4_maxS =
        "\1\175\3\uffff\2\154\1\162\1\166\1\141\1\165\1\151\1\165\1\145\2"+
        "\165\1\164\1\145\5\uffff\1\167\2\157\1\145\1\162\1\155\2\143\1\141"+
        "\2\156\1\162\1\154\2\141\1\143\1\165\1\156\1\172\1\160\1\153\1\150"+
        "\1\162\1\143\1\137\1\156\1\157\2\153\1\171\1\153\1\143\1\172\1\uffff"+
        "\1\172\2\137\1\172\1\150\1\164\1\144\1\156\1\137\1\145\1\163\1\137"+
        "\1\150\2\uffff\1\157\1\145\1\154\1\167\1\uffff\1\137\2\uffff\1\172"+
        "\1\147\1\164\1\162\1\172\1\154\1\172\1\167\1\141\4\uffff\1\157\1"+
        "\145\1\154\1\uffff\1\145\2\uffff\1\172\4\uffff\1\145\1\143\1\167"+
        "\1\141\2\uffff\1\162\1\uffff\1\162\1\150\1\145\1\143\3\172\1\162"+
        "\1\150\3\uffff\2\172\2\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\15\uffff\1\35\1\36\1\37\1\40\1\41\41\uffff"+
        "\1\11\15\uffff\1\10\1\12\4\uffff\1\21\1\uffff\1\26\1\27\11\uffff"+
        "\1\15\1\16\1\17\1\20\3\uffff\1\30\1\uffff\1\32\1\33\1\uffff\1\4"+
        "\1\5\1\6\1\7\4\uffff\1\24\1\25\1\uffff\1\34\11\uffff\1\31\1\13\1"+
        "\14\2\uffff\1\22\1\23";
    static final String DFA4_specialS =
        "\u0080\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\20\uffff\11\23\3\uffff\1\1"+
            "\3\uffff\32\24\1\2\1\uffff\1\3\3\uffff\1\4\1\5\1\6\1\24\1\7"+
            "\1\10\3\24\1\11\1\12\1\24\1\13\1\14\1\24\1\15\1\24\1\16\1\17"+
            "\3\24\1\20\3\24\1\21\1\uffff\1\22",
            "",
            "",
            "",
            "\1\26",
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
            "\1\42\3\uffff\1\43",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57\20\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\70",
            "\1\71",
            "\1\72",
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
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\107\1\uffff\1\110\14\uffff\1\111",
            "\1\112",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\114",
            "\1\115\22\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130\3\uffff\1\131",
            "\1\132\3\uffff\1\133",
            "",
            "\1\134\1\uffff\1\135\14\uffff\1\136",
            "",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\140",
            "\1\141\22\uffff\1\142",
            "\1\143",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\145\3\uffff\1\146",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\150",
            "\1\151",
            "",
            "",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154\3\uffff\1\155",
            "",
            "\1\156",
            "",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\174",
            "\1\175",
            "",
            "",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
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
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | StrengthValues | FighterName | IgnoreSpacesTabsNewlines );";
        }
    }
 

}