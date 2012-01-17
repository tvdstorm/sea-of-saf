// $ANTLR 3.4 C:\\Users\\Chris\\school\\SAFplayer\\FDL.g 2012-01-17 14:44:26

 package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ALWAYS=4;
    public static final int AND=5;
    public static final int BLOCK_HIGH=6;
    public static final int BLOCK_LOW=7;
    public static final int CHOOSE=8;
    public static final int CROUCH=9;
    public static final int DIGIT=10;
    public static final int EQ=11;
    public static final int EVEN=12;
    public static final int FAR=13;
    public static final int JUMP=14;
    public static final int KICKPOWER=15;
    public static final int KICKREACH=16;
    public static final int KICK_HIGH=17;
    public static final int KICK_LOW=18;
    public static final int LDELIM=19;
    public static final int LPARAM=20;
    public static final int LSQUARE=21;
    public static final int MUCH_STRONGER=22;
    public static final int MUCH_WEAKER=23;
    public static final int NAME=24;
    public static final int NEAR=25;
    public static final int NUMBER=26;
    public static final int OR=27;
    public static final int PUCHPOWER=28;
    public static final int PUCHREACH=29;
    public static final int PUNCH_HIGH=30;
    public static final int PUNCH_LOW=31;
    public static final int RDELIM=32;
    public static final int RPARAM=33;
    public static final int RSQUARE=34;
    public static final int RUN_AWAY=35;
    public static final int RUN_TOWARDS=36;
    public static final int STAND=37;
    public static final int STRONGER=38;
    public static final int WALK_AWAY=39;
    public static final int WALK_TOWARDS=40;
    public static final int WEAKER=41;
    public static final int WHITESPACE=42;

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
    public String getGrammarFileName() { return "C:\\Users\\Chris\\school\\SAFplayer\\FDL.g"; }

    // $ANTLR start "ALWAYS"
    public final void mALWAYS() throws RecognitionException {
        try {
            int _type = ALWAYS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:6:8: ( 'always' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:6:10: 'always'
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
    // $ANTLR end "ALWAYS"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:7:5: ( 'and' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:7:7: 'and'
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

    // $ANTLR start "BLOCK_HIGH"
    public final void mBLOCK_HIGH() throws RecognitionException {
        try {
            int _type = BLOCK_HIGH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:8:12: ( 'block_high' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:8:14: 'block_high'
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
    // $ANTLR end "BLOCK_HIGH"

    // $ANTLR start "BLOCK_LOW"
    public final void mBLOCK_LOW() throws RecognitionException {
        try {
            int _type = BLOCK_LOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:9:11: ( 'block_low' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:9:13: 'block_low'
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
    // $ANTLR end "BLOCK_LOW"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:10:8: ( 'choose' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:10:10: 'choose'
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

    // $ANTLR start "CROUCH"
    public final void mCROUCH() throws RecognitionException {
        try {
            int _type = CROUCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:11:8: ( 'crouch' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:11:10: 'crouch'
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
    // $ANTLR end "CROUCH"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:12:4: ( '=' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:12:6: '='
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
    // $ANTLR end "EQ"

    // $ANTLR start "EVEN"
    public final void mEVEN() throws RecognitionException {
        try {
            int _type = EVEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:13:6: ( 'even' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:13:8: 'even'
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
    // $ANTLR end "EVEN"

    // $ANTLR start "FAR"
    public final void mFAR() throws RecognitionException {
        try {
            int _type = FAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:14:5: ( 'far' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:14:7: 'far'
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
    // $ANTLR end "FAR"

    // $ANTLR start "JUMP"
    public final void mJUMP() throws RecognitionException {
        try {
            int _type = JUMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:15:6: ( 'jump' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:15:8: 'jump'
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
    // $ANTLR end "JUMP"

    // $ANTLR start "KICKPOWER"
    public final void mKICKPOWER() throws RecognitionException {
        try {
            int _type = KICKPOWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:16:11: ( 'kickPower' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:16:13: 'kickPower'
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
    // $ANTLR end "KICKPOWER"

    // $ANTLR start "KICKREACH"
    public final void mKICKREACH() throws RecognitionException {
        try {
            int _type = KICKREACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:17:11: ( 'kickReach' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:17:13: 'kickReach'
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
    // $ANTLR end "KICKREACH"

    // $ANTLR start "KICK_HIGH"
    public final void mKICK_HIGH() throws RecognitionException {
        try {
            int _type = KICK_HIGH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:18:11: ( 'kick_high' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:18:13: 'kick_high'
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
    // $ANTLR end "KICK_HIGH"

    // $ANTLR start "KICK_LOW"
    public final void mKICK_LOW() throws RecognitionException {
        try {
            int _type = KICK_LOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:19:10: ( 'kick_low' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:19:12: 'kick_low'
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
    // $ANTLR end "KICK_LOW"

    // $ANTLR start "LDELIM"
    public final void mLDELIM() throws RecognitionException {
        try {
            int _type = LDELIM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:20:8: ( '{' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:20:10: '{'
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
    // $ANTLR end "LDELIM"

    // $ANTLR start "LPARAM"
    public final void mLPARAM() throws RecognitionException {
        try {
            int _type = LPARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:21:8: ( '(' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:21:10: '('
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
    // $ANTLR end "LPARAM"

    // $ANTLR start "LSQUARE"
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:22:9: ( '[' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:22:11: '['
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
    // $ANTLR end "LSQUARE"

    // $ANTLR start "MUCH_STRONGER"
    public final void mMUCH_STRONGER() throws RecognitionException {
        try {
            int _type = MUCH_STRONGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:23:15: ( 'much_stronger' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:23:17: 'much_stronger'
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
    // $ANTLR end "MUCH_STRONGER"

    // $ANTLR start "MUCH_WEAKER"
    public final void mMUCH_WEAKER() throws RecognitionException {
        try {
            int _type = MUCH_WEAKER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:24:13: ( 'much_weaker' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:24:15: 'much_weaker'
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
    // $ANTLR end "MUCH_WEAKER"

    // $ANTLR start "NEAR"
    public final void mNEAR() throws RecognitionException {
        try {
            int _type = NEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:25:6: ( 'near' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:25:8: 'near'
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
    // $ANTLR end "NEAR"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:26:4: ( 'or' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:26:6: 'or'
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

    // $ANTLR start "PUCHPOWER"
    public final void mPUCHPOWER() throws RecognitionException {
        try {
            int _type = PUCHPOWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:27:11: ( 'punchPower' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:27:13: 'punchPower'
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
    // $ANTLR end "PUCHPOWER"

    // $ANTLR start "PUCHREACH"
    public final void mPUCHREACH() throws RecognitionException {
        try {
            int _type = PUCHREACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:28:11: ( 'punchReach' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:28:13: 'punchReach'
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
    // $ANTLR end "PUCHREACH"

    // $ANTLR start "PUNCH_HIGH"
    public final void mPUNCH_HIGH() throws RecognitionException {
        try {
            int _type = PUNCH_HIGH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:29:12: ( 'punch_high' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:29:14: 'punch_high'
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
    // $ANTLR end "PUNCH_HIGH"

    // $ANTLR start "PUNCH_LOW"
    public final void mPUNCH_LOW() throws RecognitionException {
        try {
            int _type = PUNCH_LOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:30:11: ( 'punch_low' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:30:13: 'punch_low'
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
    // $ANTLR end "PUNCH_LOW"

    // $ANTLR start "RDELIM"
    public final void mRDELIM() throws RecognitionException {
        try {
            int _type = RDELIM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:31:8: ( '}' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:31:10: '}'
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
    // $ANTLR end "RDELIM"

    // $ANTLR start "RPARAM"
    public final void mRPARAM() throws RecognitionException {
        try {
            int _type = RPARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:32:8: ( ')' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:32:10: ')'
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
    // $ANTLR end "RPARAM"

    // $ANTLR start "RSQUARE"
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:33:9: ( ']' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:33:11: ']'
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
    // $ANTLR end "RSQUARE"

    // $ANTLR start "RUN_AWAY"
    public final void mRUN_AWAY() throws RecognitionException {
        try {
            int _type = RUN_AWAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:34:10: ( 'run_away' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:34:12: 'run_away'
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
    // $ANTLR end "RUN_AWAY"

    // $ANTLR start "RUN_TOWARDS"
    public final void mRUN_TOWARDS() throws RecognitionException {
        try {
            int _type = RUN_TOWARDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:35:13: ( 'run_towards' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:35:15: 'run_towards'
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
    // $ANTLR end "RUN_TOWARDS"

    // $ANTLR start "STAND"
    public final void mSTAND() throws RecognitionException {
        try {
            int _type = STAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:36:7: ( 'stand' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:36:9: 'stand'
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
    // $ANTLR end "STAND"

    // $ANTLR start "STRONGER"
    public final void mSTRONGER() throws RecognitionException {
        try {
            int _type = STRONGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:37:10: ( 'stronger' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:37:12: 'stronger'
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
    // $ANTLR end "STRONGER"

    // $ANTLR start "WALK_AWAY"
    public final void mWALK_AWAY() throws RecognitionException {
        try {
            int _type = WALK_AWAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:38:11: ( 'walk_away' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:38:13: 'walk_away'
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
    // $ANTLR end "WALK_AWAY"

    // $ANTLR start "WALK_TOWARDS"
    public final void mWALK_TOWARDS() throws RecognitionException {
        try {
            int _type = WALK_TOWARDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:39:14: ( 'walk_towards' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:39:16: 'walk_towards'
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
    // $ANTLR end "WALK_TOWARDS"

    // $ANTLR start "WEAKER"
    public final void mWEAKER() throws RecognitionException {
        try {
            int _type = WEAKER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:40:8: ( 'weaker' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:40:10: 'weaker'
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
    // $ANTLR end "WEAKER"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:117:8: ( ( DIGIT )+ )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:117:10: ( DIGIT )+
            {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:117:10: ( DIGIT )+
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
            	    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:
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
    // $ANTLR end "NUMBER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:119:12: ( ( '\\t' | ' ' | '\\u000C' | '\\r' | '\\n' )+ )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:119:14: ( '\\t' | ' ' | '\\u000C' | '\\r' | '\\n' )+
            {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:119:14: ( '\\t' | ' ' | '\\u000C' | '\\r' | '\\n' )+
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
            	    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:
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
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:120:6: ( ( 'a' .. 'z' )+ )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:120:8: ( 'a' .. 'z' )+
            {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:120:8: ( 'a' .. 'z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:
            	    {
            	    if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:121:16: ( '0' .. '9' )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:
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

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:8: ( ALWAYS | AND | BLOCK_HIGH | BLOCK_LOW | CHOOSE | CROUCH | EQ | EVEN | FAR | JUMP | KICKPOWER | KICKREACH | KICK_HIGH | KICK_LOW | LDELIM | LPARAM | LSQUARE | MUCH_STRONGER | MUCH_WEAKER | NEAR | OR | PUCHPOWER | PUCHREACH | PUNCH_HIGH | PUNCH_LOW | RDELIM | RPARAM | RSQUARE | RUN_AWAY | RUN_TOWARDS | STAND | STRONGER | WALK_AWAY | WALK_TOWARDS | WEAKER | NUMBER | WHITESPACE | NAME )
        int alt4=38;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:10: ALWAYS
                {
                mALWAYS(); 


                }
                break;
            case 2 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:17: AND
                {
                mAND(); 


                }
                break;
            case 3 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:21: BLOCK_HIGH
                {
                mBLOCK_HIGH(); 


                }
                break;
            case 4 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:32: BLOCK_LOW
                {
                mBLOCK_LOW(); 


                }
                break;
            case 5 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:42: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 6 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:49: CROUCH
                {
                mCROUCH(); 


                }
                break;
            case 7 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:56: EQ
                {
                mEQ(); 


                }
                break;
            case 8 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:59: EVEN
                {
                mEVEN(); 


                }
                break;
            case 9 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:64: FAR
                {
                mFAR(); 


                }
                break;
            case 10 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:68: JUMP
                {
                mJUMP(); 


                }
                break;
            case 11 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:73: KICKPOWER
                {
                mKICKPOWER(); 


                }
                break;
            case 12 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:83: KICKREACH
                {
                mKICKREACH(); 


                }
                break;
            case 13 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:93: KICK_HIGH
                {
                mKICK_HIGH(); 


                }
                break;
            case 14 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:103: KICK_LOW
                {
                mKICK_LOW(); 


                }
                break;
            case 15 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:112: LDELIM
                {
                mLDELIM(); 


                }
                break;
            case 16 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:119: LPARAM
                {
                mLPARAM(); 


                }
                break;
            case 17 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:126: LSQUARE
                {
                mLSQUARE(); 


                }
                break;
            case 18 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:134: MUCH_STRONGER
                {
                mMUCH_STRONGER(); 


                }
                break;
            case 19 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:148: MUCH_WEAKER
                {
                mMUCH_WEAKER(); 


                }
                break;
            case 20 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:160: NEAR
                {
                mNEAR(); 


                }
                break;
            case 21 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:165: OR
                {
                mOR(); 


                }
                break;
            case 22 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:168: PUCHPOWER
                {
                mPUCHPOWER(); 


                }
                break;
            case 23 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:178: PUCHREACH
                {
                mPUCHREACH(); 


                }
                break;
            case 24 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:188: PUNCH_HIGH
                {
                mPUNCH_HIGH(); 


                }
                break;
            case 25 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:199: PUNCH_LOW
                {
                mPUNCH_LOW(); 


                }
                break;
            case 26 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:209: RDELIM
                {
                mRDELIM(); 


                }
                break;
            case 27 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:216: RPARAM
                {
                mRPARAM(); 


                }
                break;
            case 28 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:223: RSQUARE
                {
                mRSQUARE(); 


                }
                break;
            case 29 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:231: RUN_AWAY
                {
                mRUN_AWAY(); 


                }
                break;
            case 30 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:240: RUN_TOWARDS
                {
                mRUN_TOWARDS(); 


                }
                break;
            case 31 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:252: STAND
                {
                mSTAND(); 


                }
                break;
            case 32 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:258: STRONGER
                {
                mSTRONGER(); 


                }
                break;
            case 33 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:267: WALK_AWAY
                {
                mWALK_AWAY(); 


                }
                break;
            case 34 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:277: WALK_TOWARDS
                {
                mWALK_TOWARDS(); 


                }
                break;
            case 35 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:290: WEAKER
                {
                mWEAKER(); 


                }
                break;
            case 36 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:297: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 37 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:304: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 38 :
                // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:1:315: NAME
                {
                mNAME(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\3\30\1\uffff\4\30\3\uffff\4\30\3\uffff\3\30\3\uffff\13"+
        "\30\1\65\6\30\1\75\4\30\1\102\4\30\1\uffff\7\30\1\uffff\3\30\1\121"+
        "\1\uffff\1\122\2\30\1\127\1\30\1\uffff\10\30\7\uffff\1\30\2\uffff"+
        "\1\152\1\30\1\uffff\1\30\1\157\1\uffff\1\162\1\163\10\uffff\1\30"+
        "\2\uffff\1\167\7\uffff\1\30\1\uffff\1\171\1\uffff";
    static final String DFA4_eofS =
        "\172\uffff";
    static final String DFA4_minS =
        "\1\11\2\154\1\150\1\uffff\1\166\1\141\1\165\1\151\3\uffff\1\165"+
        "\1\145\1\162\1\165\3\uffff\1\165\1\164\1\141\3\uffff\1\167\1\144"+
        "\3\157\1\145\1\162\1\155\2\143\2\141\2\156\1\141\1\154\3\141\1\143"+
        "\1\157\1\165\1\156\1\141\1\160\1\153\1\150\1\162\1\uffff\1\143\1"+
        "\137\1\156\1\157\2\153\1\171\1\uffff\1\153\1\163\1\143\1\141\1\uffff"+
        "\1\141\1\120\1\137\1\141\1\150\1\141\1\144\1\156\1\137\1\145\1\163"+
        "\1\137\1\145\1\150\4\uffff\1\150\1\163\1\uffff\1\120\2\uffff\1\141"+
        "\1\147\1\141\1\162\1\141\1\150\2\141\6\uffff\1\150\1\uffff\1\145"+
        "\2\uffff\1\141\7\uffff\1\162\1\uffff\1\141\1\uffff";
    static final String DFA4_maxS =
        "\1\175\1\156\1\154\1\162\1\uffff\1\166\1\141\1\165\1\151\3\uffff"+
        "\1\165\1\145\1\162\1\165\3\uffff\1\165\1\164\1\145\3\uffff\1\167"+
        "\1\144\3\157\1\145\1\162\1\155\2\143\1\141\1\172\2\156\1\162\1\154"+
        "\2\141\1\172\1\143\1\157\1\165\1\156\1\172\1\160\1\153\1\150\1\162"+
        "\1\uffff\1\143\1\137\1\156\1\157\2\153\1\171\1\uffff\1\153\1\163"+
        "\1\143\1\172\1\uffff\1\172\2\137\1\172\1\150\1\164\1\144\1\156\1"+
        "\137\1\145\1\163\1\137\1\145\1\150\4\uffff\1\154\1\167\1\uffff\1"+
        "\137\2\uffff\1\172\1\147\1\164\1\162\1\172\1\154\2\172\6\uffff\1"+
        "\154\1\uffff\1\145\2\uffff\1\172\7\uffff\1\162\1\uffff\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\7\4\uffff\1\17\1\20\1\21\4\uffff\1\32\1\33\1\34\3\uffff"+
        "\1\44\1\45\1\46\34\uffff\1\25\7\uffff\1\2\4\uffff\1\11\16\uffff"+
        "\1\10\1\12\1\13\1\14\2\uffff\1\24\1\uffff\1\35\1\36\10\uffff\1\15"+
        "\1\16\1\22\1\23\1\26\1\27\1\uffff\1\37\1\uffff\1\41\1\42\1\uffff"+
        "\1\1\1\3\1\4\1\5\1\6\1\30\1\31\1\uffff\1\43\1\uffff\1\40";
    static final String DFA4_specialS =
        "\172\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\27\1\uffff\2\27\22\uffff\1\27\7\uffff\1\12\1\21\6\uffff\12"+
            "\26\3\uffff\1\4\35\uffff\1\13\1\uffff\1\22\3\uffff\1\1\1\2\1"+
            "\3\1\30\1\5\1\6\3\30\1\7\1\10\1\30\1\14\1\15\1\16\1\17\1\30"+
            "\1\23\1\24\3\30\1\25\3\30\1\11\1\uffff\1\20",
            "\1\31\1\uffff\1\32",
            "\1\33",
            "\1\34\11\uffff\1\35",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\50\3\uffff\1\51",
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
            "\32\30",
            "\1\66",
            "\1\67",
            "\1\70\20\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\32\30",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\32\30",
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
            "\32\30",
            "",
            "\32\30",
            "\1\123\1\uffff\1\124\14\uffff\1\125",
            "\1\126",
            "\32\30",
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
            "",
            "",
            "\1\143\3\uffff\1\144",
            "\1\145\3\uffff\1\146",
            "",
            "\1\147\1\uffff\1\150\14\uffff\1\151",
            "",
            "",
            "\32\30",
            "\1\153",
            "\1\154\22\uffff\1\155",
            "\1\156",
            "\32\30",
            "\1\160\3\uffff\1\161",
            "\32\30",
            "\32\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\164\3\uffff\1\165",
            "",
            "\1\166",
            "",
            "",
            "\32\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\170",
            "",
            "\32\30",
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
            return "1:1: Tokens : ( ALWAYS | AND | BLOCK_HIGH | BLOCK_LOW | CHOOSE | CROUCH | EQ | EVEN | FAR | JUMP | KICKPOWER | KICKREACH | KICK_HIGH | KICK_LOW | LDELIM | LPARAM | LSQUARE | MUCH_STRONGER | MUCH_WEAKER | NEAR | OR | PUCHPOWER | PUCHREACH | PUNCH_HIGH | PUNCH_LOW | RDELIM | RPARAM | RSQUARE | RUN_AWAY | RUN_TOWARDS | STAND | STRONGER | WALK_AWAY | WALK_TOWARDS | WEAKER | NUMBER | WHITESPACE | NAME );";
        }
    }
 

}