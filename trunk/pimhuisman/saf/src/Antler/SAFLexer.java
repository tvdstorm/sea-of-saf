// $ANTLR 3.4 C:\\Users\\Pim\\Desktop\\SAF.g 2012-01-19 18:02:14

package Antler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
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
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int Number=4;
    public static final int String=5;
    public static final int Whitespace=6;

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
    public String getGrammarFileName() { return "C:\\Users\\Pim\\Desktop\\SAF.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:6:6: ( '(' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:6:8: '('
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
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:7:6: ( ')' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:7:8: ')'
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:8:6: ( '=' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:8:8: '='
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:9:7: ( '[' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:9:9: '['
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:10:7: ( ']' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:10:9: ']'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:11:7: ( 'always' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:11:9: 'always'
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:12:7: ( 'block_high' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:12:9: 'block_high'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:13:7: ( 'block_low' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:13:9: 'block_low'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:14:7: ( 'choose' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:14:9: 'choose'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:15:7: ( 'crouch' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:15:9: 'crouch'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:16:7: ( 'even' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:16:9: 'even'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:17:7: ( 'far' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:17:9: 'far'
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:18:7: ( 'jump' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:18:9: 'jump'
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:19:7: ( 'kickPower' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:19:9: 'kickPower'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:20:7: ( 'kickReach' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:20:9: 'kickReach'
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:21:7: ( 'kick_high' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:21:9: 'kick_high'
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:22:7: ( 'kick_low' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:22:9: 'kick_low'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:23:7: ( 'much_stronger' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:23:9: 'much_stronger'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:24:7: ( 'much_weaker' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:24:9: 'much_weaker'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:25:7: ( 'near' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:25:9: 'near'
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:26:7: ( 'punchPower' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:26:9: 'punchPower'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:27:7: ( 'punchReach' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:27:9: 'punchReach'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:28:7: ( 'punch_high' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:28:9: 'punch_high'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:29:7: ( 'punch_low' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:29:9: 'punch_low'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:30:7: ( 'run_away' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:30:9: 'run_away'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:31:7: ( 'run_towards' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:31:9: 'run_towards'
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:32:7: ( 'stand' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:32:9: 'stand'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:33:7: ( 'stronger' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:33:9: 'stronger'
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:34:7: ( 'walk_away' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:34:9: 'walk_away'
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:35:7: ( 'walk_towards' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:35:9: 'walk_towards'
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:36:7: ( 'weaker' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:36:9: 'weaker'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:37:7: ( '{' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:37:9: '{'
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:38:7: ( '}' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:38:9: '}'
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
    // $ANTLR end "T__39"

    // $ANTLR start "Whitespace"
    public final void mWhitespace() throws RecognitionException {
        try {
            int _type = Whitespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:43:12: ( ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+ )
            // C:\\Users\\Pim\\Desktop\\SAF.g:43:14: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
            {
            // C:\\Users\\Pim\\Desktop\\SAF.g:43:14: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Pim\\Desktop\\SAF.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Whitespace"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:44:9: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // C:\\Users\\Pim\\Desktop\\SAF.g:44:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // C:\\Users\\Pim\\Desktop\\SAF.g:44:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Pim\\Desktop\\SAF.g:
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
    // $ANTLR end "String"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Desktop\\SAF.g:45:9: ( ( '0' .. '9' )+ )
            // C:\\Users\\Pim\\Desktop\\SAF.g:45:11: ( '0' .. '9' )+
            {
            // C:\\Users\\Pim\\Desktop\\SAF.g:45:11: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Pim\\Desktop\\SAF.g:
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
    // $ANTLR end "Number"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Pim\\Desktop\\SAF.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | Whitespace | String | Number )
        int alt4=36;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:25: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:31: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:37: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:43: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:49: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:55: T__15
                {
                mT__15(); 


                }
                break;
            case 10 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:61: T__16
                {
                mT__16(); 


                }
                break;
            case 11 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:67: T__17
                {
                mT__17(); 


                }
                break;
            case 12 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:73: T__18
                {
                mT__18(); 


                }
                break;
            case 13 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:79: T__19
                {
                mT__19(); 


                }
                break;
            case 14 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:85: T__20
                {
                mT__20(); 


                }
                break;
            case 15 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:91: T__21
                {
                mT__21(); 


                }
                break;
            case 16 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:97: T__22
                {
                mT__22(); 


                }
                break;
            case 17 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:103: T__23
                {
                mT__23(); 


                }
                break;
            case 18 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:109: T__24
                {
                mT__24(); 


                }
                break;
            case 19 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:115: T__25
                {
                mT__25(); 


                }
                break;
            case 20 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:121: T__26
                {
                mT__26(); 


                }
                break;
            case 21 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:127: T__27
                {
                mT__27(); 


                }
                break;
            case 22 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:133: T__28
                {
                mT__28(); 


                }
                break;
            case 23 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:139: T__29
                {
                mT__29(); 


                }
                break;
            case 24 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:145: T__30
                {
                mT__30(); 


                }
                break;
            case 25 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:151: T__31
                {
                mT__31(); 


                }
                break;
            case 26 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:157: T__32
                {
                mT__32(); 


                }
                break;
            case 27 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:163: T__33
                {
                mT__33(); 


                }
                break;
            case 28 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:169: T__34
                {
                mT__34(); 


                }
                break;
            case 29 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:175: T__35
                {
                mT__35(); 


                }
                break;
            case 30 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:181: T__36
                {
                mT__36(); 


                }
                break;
            case 31 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:187: T__37
                {
                mT__37(); 


                }
                break;
            case 32 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:193: T__38
                {
                mT__38(); 


                }
                break;
            case 33 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:199: T__39
                {
                mT__39(); 


                }
                break;
            case 34 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:205: Whitespace
                {
                mWhitespace(); 


                }
                break;
            case 35 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:216: String
                {
                mString(); 


                }
                break;
            case 36 :
                // C:\\Users\\Pim\\Desktop\\SAF.g:1:223: Number
                {
                mNumber(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\6\uffff\15\26\5\uffff\24\26\1\74\16\26\1\113\1\uffff\1\114\2\26"+
        "\1\121\1\26\1\uffff\10\26\2\uffff\2\26\3\uffff\1\26\2\uffff\1\146"+
        "\1\26\1\uffff\1\26\1\153\1\uffff\1\156\1\157\2\26\4\uffff\2\26\2"+
        "\uffff\1\26\2\uffff\1\167\5\uffff\4\26\2\uffff\1\26\1\uffff\4\26"+
        "\1\u0081\1\u0082\1\u0083\2\26\3\uffff\1\u0086\1\u0087\2\uffff";
    static final String DFA4_eofS =
        "\u0088\uffff";
    static final String DFA4_minS =
        "\1\11\5\uffff\2\154\1\150\1\166\1\141\1\165\1\151\1\165\1\145\2"+
        "\165\1\164\1\141\5\uffff\1\167\3\157\1\145\1\162\1\155\2\143\1\141"+
        "\2\156\1\141\1\154\2\141\1\143\1\157\1\165\1\156\1\101\1\160\1\153"+
        "\1\150\1\162\1\143\1\137\1\156\1\157\2\153\1\171\1\153\1\163\1\143"+
        "\1\101\1\uffff\1\101\1\120\1\137\1\101\1\150\1\141\1\144\1\156\1"+
        "\137\1\145\1\163\1\137\1\145\1\150\2\uffff\1\157\1\145\1\150\1\163"+
        "\1\uffff\1\120\2\uffff\1\101\1\147\1\141\1\162\1\101\1\150\2\101"+
        "\1\167\1\141\4\uffff\1\157\1\145\1\150\1\uffff\1\145\2\uffff\1\101"+
        "\5\uffff\1\145\1\143\1\167\1\141\2\uffff\1\162\1\uffff\1\162\1\150"+
        "\1\145\1\143\3\101\1\162\1\150\3\uffff\2\101\2\uffff";
    static final String DFA4_maxS =
        "\1\175\5\uffff\2\154\1\162\1\166\1\141\1\165\1\151\1\165\1\145\2"+
        "\165\1\164\1\145\5\uffff\1\167\3\157\1\145\1\162\1\155\2\143\1\141"+
        "\2\156\1\162\1\154\2\141\1\143\1\157\1\165\1\156\1\172\1\160\1\153"+
        "\1\150\1\162\1\143\1\137\1\156\1\157\2\153\1\171\1\153\1\163\1\143"+
        "\1\172\1\uffff\1\172\2\137\1\172\1\150\1\164\1\144\1\156\1\137\1"+
        "\145\1\163\1\137\1\145\1\150\2\uffff\1\157\1\145\1\154\1\167\1\uffff"+
        "\1\137\2\uffff\1\172\1\147\1\164\1\162\1\172\1\154\2\172\1\167\1"+
        "\141\4\uffff\1\157\1\145\1\154\1\uffff\1\145\2\uffff\1\172\5\uffff"+
        "\1\145\1\143\1\167\1\141\2\uffff\1\162\1\uffff\1\162\1\150\1\145"+
        "\1\143\3\172\1\162\1\150\3\uffff\2\172\2\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\15\uffff\1\40\1\41\1\42\1\43\1\44\44"+
        "\uffff\1\14\16\uffff\1\13\1\15\4\uffff\1\24\1\uffff\1\31\1\32\12"+
        "\uffff\1\20\1\21\1\22\1\23\3\uffff\1\33\1\uffff\1\35\1\36\1\uffff"+
        "\1\6\1\7\1\10\1\11\1\12\4\uffff\1\27\1\30\1\uffff\1\37\11\uffff"+
        "\1\34\1\16\1\17\2\uffff\1\25\1\26";
    static final String DFA4_specialS =
        "\u0088\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\25\1\uffff\2\25\22\uffff\1\25\7\uffff\1\1\1\2\6\uffff\12"+
            "\27\3\uffff\1\3\3\uffff\32\26\1\4\1\uffff\1\5\3\uffff\1\6\1"+
            "\7\1\10\1\26\1\11\1\12\3\26\1\13\1\14\1\26\1\15\1\16\1\26\1"+
            "\17\1\26\1\20\1\21\3\26\1\22\3\26\1\23\1\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "\1\30",
            "\1\31",
            "\1\32\11\uffff\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45\3\uffff\1\46",
            "",
            "",
            "",
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
            "\1\62",
            "\1\63\20\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\32\26\6\uffff\32\26",
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
            "\1\110",
            "\1\111",
            "\1\112",
            "\32\26\6\uffff\32\26",
            "",
            "\32\26\6\uffff\32\26",
            "\1\115\1\uffff\1\116\14\uffff\1\117",
            "\1\120",
            "\32\26\6\uffff\32\26",
            "\1\122",
            "\1\123\22\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137\3\uffff\1\140",
            "\1\141\3\uffff\1\142",
            "",
            "\1\143\1\uffff\1\144\14\uffff\1\145",
            "",
            "",
            "\32\26\6\uffff\32\26",
            "\1\147",
            "\1\150\22\uffff\1\151",
            "\1\152",
            "\32\26\6\uffff\32\26",
            "\1\154\3\uffff\1\155",
            "\32\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164\3\uffff\1\165",
            "",
            "\1\166",
            "",
            "",
            "\32\26\6\uffff\32\26",
            "",
            "",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\32\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
            "\1\u0084",
            "\1\u0085",
            "",
            "",
            "",
            "\32\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
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
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | Whitespace | String | Number );";
        }
    }
 

}