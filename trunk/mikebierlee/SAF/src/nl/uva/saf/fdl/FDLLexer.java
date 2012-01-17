// $ANTLR 3.4 C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g 2012-01-17 18:57:23

  package nl.uva.saf.fdl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLLexer extends Lexer {
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int IDENT=4;
    public static final int INTEGER=5;
    public static final int WS=6;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public FDLLexer() {} 
    public FDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:11:6: ( '(' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:11:8: '('
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:12:6: ( ')' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:12:8: ')'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:13:6: ( '=' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:13:8: '='
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:14:7: ( '[' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:14:9: '['
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:15:7: ( ']' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:15:9: ']'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:16:7: ( 'always' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:16:9: 'always'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:17:7: ( 'and' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:17:9: 'and'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:18:7: ( 'block_high' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:18:9: 'block_high'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:19:7: ( 'block_low' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:19:9: 'block_low'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:20:7: ( 'choose' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:20:9: 'choose'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:21:7: ( 'crouch' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:21:9: 'crouch'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:22:7: ( 'even' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:22:9: 'even'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:23:7: ( 'far' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:23:9: 'far'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:24:7: ( 'jump' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:24:9: 'jump'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:25:7: ( 'kickPower' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:25:9: 'kickPower'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:26:7: ( 'kickReach' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:26:9: 'kickReach'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:27:7: ( 'kick_high' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:27:9: 'kick_high'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:28:7: ( 'kick_low' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:28:9: 'kick_low'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:29:7: ( 'much_stronger' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:29:9: 'much_stronger'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:30:7: ( 'much_weaker' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:30:9: 'much_weaker'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:31:7: ( 'near' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:31:9: 'near'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:32:7: ( 'or' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:32:9: 'or'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:33:7: ( 'punchPower' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:33:9: 'punchPower'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:34:7: ( 'punchReach' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:34:9: 'punchReach'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:35:7: ( 'punch_high' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:35:9: 'punch_high'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:36:7: ( 'punch_low' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:36:9: 'punch_low'
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:37:7: ( 'run_away' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:37:9: 'run_away'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:38:7: ( 'run_towards' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:38:9: 'run_towards'
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:7: ( 'stand' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:9: 'stand'
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:7: ( 'stronger' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:9: 'stronger'
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:41:7: ( 'walk_away' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:41:9: 'walk_away'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:42:7: ( 'walk_towards' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:42:9: 'walk_towards'
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:43:7: ( 'weaker' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:43:9: 'weaker'
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:44:7: ( '{' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:44:9: '{'
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:45:7: ( '}' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:45:9: '}'
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
    // $ANTLR end "T__41"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:37:4: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:37:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:37:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
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
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
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

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:9: ( ( '0' .. '9' )+ )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:11: ( '0' .. '9' )+
            {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:11: ( '0' .. '9' )+
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
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
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
    // $ANTLR end "INTEGER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:41:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:41:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:41:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
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
    // $ANTLR end "IDENT"

    public void mTokens() throws RecognitionException {
        // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | WS | INTEGER | IDENT )
        int alt4=38;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:25: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:31: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:37: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:43: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:49: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:55: T__15
                {
                mT__15(); 


                }
                break;
            case 10 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:61: T__16
                {
                mT__16(); 


                }
                break;
            case 11 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:67: T__17
                {
                mT__17(); 


                }
                break;
            case 12 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:73: T__18
                {
                mT__18(); 


                }
                break;
            case 13 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:79: T__19
                {
                mT__19(); 


                }
                break;
            case 14 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:85: T__20
                {
                mT__20(); 


                }
                break;
            case 15 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:91: T__21
                {
                mT__21(); 


                }
                break;
            case 16 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:97: T__22
                {
                mT__22(); 


                }
                break;
            case 17 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:103: T__23
                {
                mT__23(); 


                }
                break;
            case 18 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:109: T__24
                {
                mT__24(); 


                }
                break;
            case 19 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:115: T__25
                {
                mT__25(); 


                }
                break;
            case 20 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:121: T__26
                {
                mT__26(); 


                }
                break;
            case 21 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:127: T__27
                {
                mT__27(); 


                }
                break;
            case 22 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:133: T__28
                {
                mT__28(); 


                }
                break;
            case 23 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:139: T__29
                {
                mT__29(); 


                }
                break;
            case 24 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:145: T__30
                {
                mT__30(); 


                }
                break;
            case 25 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:151: T__31
                {
                mT__31(); 


                }
                break;
            case 26 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:157: T__32
                {
                mT__32(); 


                }
                break;
            case 27 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:163: T__33
                {
                mT__33(); 


                }
                break;
            case 28 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:169: T__34
                {
                mT__34(); 


                }
                break;
            case 29 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:175: T__35
                {
                mT__35(); 


                }
                break;
            case 30 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:181: T__36
                {
                mT__36(); 


                }
                break;
            case 31 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:187: T__37
                {
                mT__37(); 


                }
                break;
            case 32 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:193: T__38
                {
                mT__38(); 


                }
                break;
            case 33 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:199: T__39
                {
                mT__39(); 


                }
                break;
            case 34 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:205: T__40
                {
                mT__40(); 


                }
                break;
            case 35 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:211: T__41
                {
                mT__41(); 


                }
                break;
            case 36 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:217: WS
                {
                mWS(); 


                }
                break;
            case 37 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:220: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 38 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:228: IDENT
                {
                mIDENT(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\6\uffff\16\30\5\uffff\13\30\1\65\6\30\1\75\4\30\1\102\4\30\1\uffff"+
        "\7\30\1\uffff\3\30\1\121\1\uffff\1\122\2\30\1\127\12\30\2\uffff"+
        "\4\30\1\uffff\3\30\1\156\3\30\1\163\1\30\1\166\1\167\13\30\1\uffff"+
        "\3\30\1\u0087\1\uffff\2\30\2\uffff\17\30\1\uffff\5\30\1\u009e\6"+
        "\30\1\u00a5\1\30\1\u00a7\3\30\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1"+
        "\uffff\5\30\1\u00b4\1\uffff\1\30\1\uffff\1\u00b6\1\30\1\u00b8\4"+
        "\uffff\2\30\1\u00bb\1\u00bc\1\u00bd\1\uffff\1\30\1\uffff\1\30\1"+
        "\uffff\1\30\1\u00c1\3\uffff\1\u00c2\2\30\2\uffff\1\u00c5\1\u00c6"+
        "\2\uffff";
    static final String DFA4_eofS =
        "\u00c7\uffff";
    static final String DFA4_minS =
        "\1\11\5\uffff\2\154\1\150\1\166\1\141\1\165\1\151\1\165\1\145\1"+
        "\162\2\165\1\164\1\141\5\uffff\1\167\1\144\3\157\1\145\1\162\1\155"+
        "\2\143\1\141\1\60\2\156\1\141\1\154\2\141\1\60\1\143\1\157\1\165"+
        "\1\156\1\60\1\160\1\153\1\150\1\162\1\uffff\1\143\1\137\1\156\1"+
        "\157\2\153\1\171\1\uffff\1\153\1\163\1\143\1\60\1\uffff\1\60\1\120"+
        "\1\137\1\60\1\150\1\141\1\144\1\156\1\137\1\145\1\163\1\137\1\145"+
        "\1\150\2\uffff\1\157\1\145\1\150\1\163\1\uffff\1\120\1\167\1\157"+
        "\1\60\1\147\1\141\1\162\1\60\1\150\2\60\1\167\1\141\1\151\1\157"+
        "\1\164\1\145\1\157\1\145\1\150\1\141\1\167\1\uffff\1\145\1\167\1"+
        "\157\1\60\1\uffff\1\151\1\157\2\uffff\1\145\1\143\1\147\1\167\1"+
        "\162\1\141\1\167\1\141\1\151\1\157\1\171\1\141\1\162\1\141\1\167"+
        "\1\uffff\1\147\1\167\1\162\2\150\1\60\1\157\1\153\1\145\1\143\1"+
        "\147\1\167\1\60\1\162\1\60\1\171\1\141\1\150\4\60\1\uffff\1\156"+
        "\1\145\1\162\2\150\1\60\1\uffff\1\144\1\uffff\1\60\1\162\1\60\4"+
        "\uffff\1\147\1\162\3\60\1\uffff\1\163\1\uffff\1\144\1\uffff\1\145"+
        "\1\60\3\uffff\1\60\1\163\1\162\2\uffff\2\60\2\uffff";
    static final String DFA4_maxS =
        "\1\175\5\uffff\1\156\1\154\1\162\1\166\1\141\1\165\1\151\1\165\1"+
        "\145\1\162\2\165\1\164\1\145\5\uffff\1\167\1\144\3\157\1\145\1\162"+
        "\1\155\2\143\1\141\1\172\2\156\1\162\1\154\2\141\1\172\1\143\1\157"+
        "\1\165\1\156\1\172\1\160\1\153\1\150\1\162\1\uffff\1\143\1\137\1"+
        "\156\1\157\2\153\1\171\1\uffff\1\153\1\163\1\143\1\172\1\uffff\1"+
        "\172\2\137\1\172\1\150\1\164\1\144\1\156\1\137\1\145\1\163\1\137"+
        "\1\145\1\150\2\uffff\1\157\1\145\1\154\1\167\1\uffff\1\137\1\167"+
        "\1\157\1\172\1\147\1\164\1\162\1\172\1\154\2\172\1\167\1\141\1\151"+
        "\1\157\1\164\1\145\1\157\1\145\1\154\1\141\1\167\1\uffff\1\145\1"+
        "\167\1\157\1\172\1\uffff\1\151\1\157\2\uffff\1\145\1\143\1\147\1"+
        "\167\1\162\1\141\1\167\1\141\1\151\1\157\1\171\1\141\1\162\1\141"+
        "\1\167\1\uffff\1\147\1\167\1\162\2\150\1\172\1\157\1\153\1\145\1"+
        "\143\1\147\1\167\1\172\1\162\1\172\1\171\1\141\1\150\4\172\1\uffff"+
        "\1\156\1\145\1\162\2\150\1\172\1\uffff\1\144\1\uffff\1\172\1\162"+
        "\1\172\4\uffff\1\147\1\162\3\172\1\uffff\1\163\1\uffff\1\144\1\uffff"+
        "\1\145\1\172\3\uffff\1\172\1\163\1\162\2\uffff\2\172\2\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\16\uffff\1\42\1\43\1\44\1\45\1\46\34"+
        "\uffff\1\26\7\uffff\1\7\4\uffff\1\15\16\uffff\1\14\1\16\4\uffff"+
        "\1\25\26\uffff\1\35\4\uffff\1\6\2\uffff\1\12\1\13\17\uffff\1\41"+
        "\26\uffff\1\22\6\uffff\1\33\1\uffff\1\36\3\uffff\1\11\1\17\1\20"+
        "\1\21\5\uffff\1\32\1\uffff\1\37\1\uffff\1\10\2\uffff\1\27\1\30\1"+
        "\31\3\uffff\1\24\1\34\2\uffff\1\40\1\23";
    static final String DFA4_specialS =
        "\u00c7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\26\1\uffff\2\26\22\uffff\1\26\7\uffff\1\1\1\2\6\uffff\12"+
            "\27\3\uffff\1\3\3\uffff\32\30\1\4\1\uffff\1\5\1\uffff\1\30\1"+
            "\uffff\1\6\1\7\1\10\1\30\1\11\1\12\3\30\1\13\1\14\1\30\1\15"+
            "\1\16\1\17\1\20\1\30\1\21\1\22\3\30\1\23\3\30\1\24\1\uffff\1"+
            "\25",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\uffff\1\32",
            "\1\33",
            "\1\34\11\uffff\1\35",
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
            "\1\50\3\uffff\1\51",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\66",
            "\1\67",
            "\1\70\20\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\123\1\uffff\1\124\14\uffff\1\125",
            "\1\126",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\130",
            "\1\131\22\uffff\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145\3\uffff\1\146",
            "\1\147\3\uffff\1\150",
            "",
            "\1\151\1\uffff\1\152\14\uffff\1\153",
            "\1\154",
            "\1\155",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\157",
            "\1\160\22\uffff\1\161",
            "\1\162",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\164\3\uffff\1\165",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080\3\uffff\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u0088",
            "\1\u0089",
            "",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00a6",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u00b5",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00b7",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u00be",
            "",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
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
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | WS | INTEGER | IDENT );";
        }
    }
 

}