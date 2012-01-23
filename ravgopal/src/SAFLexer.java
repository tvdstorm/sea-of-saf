// $ANTLR 3.4 /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g 2012-01-23 15:05:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int ACTION=4;
    public static final int AND=5;
    public static final int BEHAVIOUR=6;
    public static final int CHARACTERISTIC=7;
    public static final int CHOICE=8;
    public static final int CHOICE_END=9;
    public static final int CHOICE_START=10;
    public static final int CHOOSE=11;
    public static final int CONDITION=12;
    public static final int EQLS=13;
    public static final int FIGHTER_END=14;
    public static final int FIGHTER_START=15;
    public static final int INT=16;
    public static final int NAME=17;
    public static final int OR=18;
    public static final int PERSONALITY=19;
    public static final int RULE_END=20;
    public static final int RULE_START=21;
    public static final int STRING=22;
    public static final int WHITESPACE=23;

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
    public String getGrammarFileName() { return "/Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:2:5: ( 'and' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:2:7: 'and'
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

    // $ANTLR start "CHOICE_END"
    public final void mCHOICE_END() throws RecognitionException {
        try {
            int _type = CHOICE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:3:12: ( ')' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:3:14: ')'
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
    // $ANTLR end "CHOICE_END"

    // $ANTLR start "CHOICE_START"
    public final void mCHOICE_START() throws RecognitionException {
        try {
            int _type = CHOICE_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:4:14: ( '(' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:4:16: '('
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
    // $ANTLR end "CHOICE_START"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:5:8: ( 'choose' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:5:10: 'choose'
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

    // $ANTLR start "EQLS"
    public final void mEQLS() throws RecognitionException {
        try {
            int _type = EQLS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:6:6: ( '=' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:6:8: '='
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
    // $ANTLR end "EQLS"

    // $ANTLR start "FIGHTER_END"
    public final void mFIGHTER_END() throws RecognitionException {
        try {
            int _type = FIGHTER_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:7:13: ( '}' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:7:15: '}'
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
    // $ANTLR end "FIGHTER_END"

    // $ANTLR start "FIGHTER_START"
    public final void mFIGHTER_START() throws RecognitionException {
        try {
            int _type = FIGHTER_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:8:15: ( '{' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:8:17: '{'
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
    // $ANTLR end "FIGHTER_START"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:9:4: ( 'or' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:9:6: 'or'
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

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            int _type = RULE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:10:10: ( ']' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:10:12: ']'
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
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_START"
    public final void mRULE_START() throws RecognitionException {
        try {
            int _type = RULE_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:11:12: ( '[' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:11:14: '['
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
    // $ANTLR end "RULE_START"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:12:7: ( 'always' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:12:9: 'always'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:13:7: ( 'block_high' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:13:9: 'block_high'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:14:7: ( 'block_low' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:14:9: 'block_low'
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:15:7: ( 'crouch' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:15:9: 'crouch'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:16:7: ( 'even' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:16:9: 'even'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:17:7: ( 'far' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:17:9: 'far'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:18:7: ( 'jump' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:18:9: 'jump'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:19:7: ( 'kickPower' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:19:9: 'kickPower'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:20:7: ( 'kickReach' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:20:9: 'kickReach'
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:21:7: ( 'kick_high' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:21:9: 'kick_high'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:22:7: ( 'kick_low' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:22:9: 'kick_low'
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:23:7: ( 'much_stronger' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:23:9: 'much_stronger'
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:24:7: ( 'much_weaker' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:24:9: 'much_weaker'
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:25:7: ( 'near' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:25:9: 'near'
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:26:7: ( 'punchPower' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:26:9: 'punchPower'
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:27:7: ( 'punchReach' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:27:9: 'punchReach'
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:28:7: ( 'punch_high' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:28:9: 'punch_high'
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:29:7: ( 'punch_low' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:29:9: 'punch_low'
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:30:7: ( 'run_away' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:30:9: 'run_away'
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:31:7: ( 'run_towards' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:31:9: 'run_towards'
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:32:7: ( 'stand' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:32:9: 'stand'
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:33:7: ( 'stronger' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:33:9: 'stronger'
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:34:7: ( 'walk_away' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:34:9: 'walk_away'
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:35:7: ( 'walk_towards' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:35:9: 'walk_towards'
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:36:7: ( 'weaker' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:36:9: 'weaker'
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
    // $ANTLR end "T__48"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:104:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:104:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:104:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:
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
    // $ANTLR end "STRING"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:108:3: ( ( '0' .. '9' )+ )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:108:5: ( '0' .. '9' )+
            {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:108:5: ( '0' .. '9' )+
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
            	    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:112:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:112:5: ( ' ' | '\\t' | '\\r' | '\\n' )
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
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:8: ( AND | CHOICE_END | CHOICE_START | CHOOSE | EQLS | FIGHTER_END | FIGHTER_START | OR | RULE_END | RULE_START | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | STRING | INT | WHITESPACE )
        int alt3=38;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:10: AND
                {
                mAND(); 


                }
                break;
            case 2 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:14: CHOICE_END
                {
                mCHOICE_END(); 


                }
                break;
            case 3 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:25: CHOICE_START
                {
                mCHOICE_START(); 


                }
                break;
            case 4 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:38: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 5 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:45: EQLS
                {
                mEQLS(); 


                }
                break;
            case 6 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:50: FIGHTER_END
                {
                mFIGHTER_END(); 


                }
                break;
            case 7 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:62: FIGHTER_START
                {
                mFIGHTER_START(); 


                }
                break;
            case 8 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:76: OR
                {
                mOR(); 


                }
                break;
            case 9 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:79: RULE_END
                {
                mRULE_END(); 


                }
                break;
            case 10 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:88: RULE_START
                {
                mRULE_START(); 


                }
                break;
            case 11 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 12 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 13 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 14 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 15 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:123: T__28
                {
                mT__28(); 


                }
                break;
            case 16 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:129: T__29
                {
                mT__29(); 


                }
                break;
            case 17 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:135: T__30
                {
                mT__30(); 


                }
                break;
            case 18 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:141: T__31
                {
                mT__31(); 


                }
                break;
            case 19 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:147: T__32
                {
                mT__32(); 


                }
                break;
            case 20 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:153: T__33
                {
                mT__33(); 


                }
                break;
            case 21 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:159: T__34
                {
                mT__34(); 


                }
                break;
            case 22 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:165: T__35
                {
                mT__35(); 


                }
                break;
            case 23 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:171: T__36
                {
                mT__36(); 


                }
                break;
            case 24 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:177: T__37
                {
                mT__37(); 


                }
                break;
            case 25 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:183: T__38
                {
                mT__38(); 


                }
                break;
            case 26 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:189: T__39
                {
                mT__39(); 


                }
                break;
            case 27 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:195: T__40
                {
                mT__40(); 


                }
                break;
            case 28 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:201: T__41
                {
                mT__41(); 


                }
                break;
            case 29 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:207: T__42
                {
                mT__42(); 


                }
                break;
            case 30 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:213: T__43
                {
                mT__43(); 


                }
                break;
            case 31 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:219: T__44
                {
                mT__44(); 


                }
                break;
            case 32 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:225: T__45
                {
                mT__45(); 


                }
                break;
            case 33 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:231: T__46
                {
                mT__46(); 


                }
                break;
            case 34 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:237: T__47
                {
                mT__47(); 


                }
                break;
            case 35 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:243: T__48
                {
                mT__48(); 


                }
                break;
            case 36 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:249: STRING
                {
                mSTRING(); 


                }
                break;
            case 37 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:256: INT
                {
                mINT(); 


                }
                break;
            case 38 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:260: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\1\uffff\1\26\2\uffff\1\26\3\uffff\1\26\2\uffff\13\26\3\uffff\4"+
        "\26\1\56\14\26\1\74\3\26\1\uffff\2\26\1\102\12\26\1\uffff\4\26\1"+
        "\121\1\uffff\1\122\2\26\1\127\12\26\2\uffff\4\26\1\uffff\3\26\1"+
        "\156\3\26\1\163\1\164\1\165\14\26\1\uffff\3\26\1\u0087\3\uffff\21"+
        "\26\1\uffff\5\26\1\u009e\6\26\1\u00a5\1\26\1\u00a7\3\26\1\u00ab"+
        "\1\u00ac\1\u00ad\1\u00ae\1\uffff\5\26\1\u00b4\1\uffff\1\26\1\uffff"+
        "\1\u00b6\1\26\1\u00b8\4\uffff\2\26\1\u00bb\1\u00bc\1\u00bd\1\uffff"+
        "\1\26\1\uffff\1\26\1\uffff\1\26\1\u00c1\3\uffff\1\u00c2\2\26\2\uffff"+
        "\1\u00c5\1\u00c6\2\uffff";
    static final String DFA3_eofS =
        "\u00c7\uffff";
    static final String DFA3_minS =
        "\1\11\1\154\2\uffff\1\150\3\uffff\1\162\2\uffff\1\154\1\166\1\141"+
        "\1\165\1\151\1\165\1\145\2\165\1\164\1\141\3\uffff\1\144\1\167\2"+
        "\157\1\60\1\157\1\145\1\162\1\155\2\143\1\141\2\156\1\141\1\154"+
        "\1\141\1\60\1\141\1\157\1\165\1\uffff\1\143\1\156\1\60\1\160\1\153"+
        "\1\150\1\162\1\143\1\137\1\156\1\157\2\153\1\uffff\1\171\1\163\1"+
        "\143\1\153\1\60\1\uffff\1\60\1\120\1\137\1\60\1\150\1\141\1\144"+
        "\1\156\1\137\1\145\1\163\1\145\1\150\1\137\2\uffff\1\157\1\145\1"+
        "\150\1\163\1\uffff\1\120\1\167\1\157\1\60\1\147\1\141\1\162\3\60"+
        "\1\150\1\167\1\141\1\151\1\157\1\164\1\145\1\157\1\145\1\150\1\141"+
        "\1\167\1\uffff\1\145\1\167\1\157\1\60\3\uffff\1\151\1\157\1\145"+
        "\1\143\1\147\1\167\1\162\1\141\1\167\1\141\1\151\1\157\1\171\1\141"+
        "\1\162\1\141\1\167\1\uffff\1\147\1\167\1\162\2\150\1\60\1\157\1"+
        "\153\1\145\1\143\1\147\1\167\1\60\1\162\1\60\1\171\1\141\1\150\4"+
        "\60\1\uffff\1\156\1\145\1\162\2\150\1\60\1\uffff\1\144\1\uffff\1"+
        "\60\1\162\1\60\4\uffff\1\147\1\162\3\60\1\uffff\1\163\1\uffff\1"+
        "\144\1\uffff\1\145\1\60\3\uffff\1\60\1\163\1\162\2\uffff\2\60\2"+
        "\uffff";
    static final String DFA3_maxS =
        "\1\175\1\156\2\uffff\1\162\3\uffff\1\162\2\uffff\1\154\1\166\1\141"+
        "\1\165\1\151\1\165\1\145\2\165\1\164\1\145\3\uffff\1\144\1\167\2"+
        "\157\1\172\1\157\1\145\1\162\1\155\2\143\1\141\2\156\1\162\1\154"+
        "\1\141\1\172\1\141\1\157\1\165\1\uffff\1\143\1\156\1\172\1\160\1"+
        "\153\1\150\1\162\1\143\1\137\1\156\1\157\2\153\1\uffff\1\171\1\163"+
        "\1\143\1\153\1\172\1\uffff\1\172\2\137\1\172\1\150\1\164\1\144\1"+
        "\156\1\137\1\145\1\163\1\145\1\150\1\137\2\uffff\1\157\1\145\1\154"+
        "\1\167\1\uffff\1\137\1\167\1\157\1\172\1\147\1\164\1\162\3\172\1"+
        "\154\1\167\1\141\1\151\1\157\1\164\1\145\1\157\1\145\1\154\1\141"+
        "\1\167\1\uffff\1\145\1\167\1\157\1\172\3\uffff\1\151\1\157\1\145"+
        "\1\143\1\147\1\167\1\162\1\141\1\167\1\141\1\151\1\157\1\171\1\141"+
        "\1\162\1\141\1\167\1\uffff\1\147\1\167\1\162\2\150\1\172\1\157\1"+
        "\153\1\145\1\143\1\147\1\167\1\172\1\162\1\172\1\171\1\141\1\150"+
        "\4\172\1\uffff\1\156\1\145\1\162\2\150\1\172\1\uffff\1\144\1\uffff"+
        "\1\172\1\162\1\172\4\uffff\1\147\1\162\3\172\1\uffff\1\163\1\uffff"+
        "\1\144\1\uffff\1\145\1\172\3\uffff\1\172\1\163\1\162\2\uffff\2\172"+
        "\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\7\1\uffff\1\11\1\12\13\uffff"+
        "\1\44\1\45\1\46\25\uffff\1\10\15\uffff\1\1\5\uffff\1\20\16\uffff"+
        "\1\17\1\21\4\uffff\1\30\26\uffff\1\37\4\uffff\1\13\1\4\1\16\21\uffff"+
        "\1\43\26\uffff\1\25\6\uffff\1\35\1\uffff\1\40\3\uffff\1\15\1\22"+
        "\1\23\1\24\5\uffff\1\34\1\uffff\1\41\1\uffff\1\14\2\uffff\1\31\1"+
        "\32\1\33\3\uffff\1\27\1\36\2\uffff\1\42\1\26";
    static final String DFA3_specialS =
        "\u00c7\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\7\uffff\1\3\1\2\6\uffff\12"+
            "\27\3\uffff\1\5\3\uffff\32\26\1\12\1\uffff\1\11\1\uffff\1\26"+
            "\1\uffff\1\1\1\13\1\4\1\26\1\14\1\15\3\26\1\16\1\17\1\26\1\20"+
            "\1\21\1\10\1\22\1\26\1\23\1\24\3\26\1\25\3\26\1\7\1\uffff\1"+
            "\6",
            "\1\32\1\uffff\1\31",
            "",
            "",
            "\1\33\11\uffff\1\34",
            "",
            "",
            "",
            "\1\35",
            "",
            "",
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
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70\20\uffff\1\71",
            "\1\72",
            "\1\73",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\123\1\uffff\1\124\14\uffff\1\125",
            "\1\126",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
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
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\157",
            "\1\160\22\uffff\1\161",
            "\1\162",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\166\3\uffff\1\167",
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
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
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
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00a6",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00b5",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00b7",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00be",
            "",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
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
            return "1:1: Tokens : ( AND | CHOICE_END | CHOICE_START | CHOOSE | EQLS | FIGHTER_END | FIGHTER_START | OR | RULE_END | RULE_START | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | STRING | INT | WHITESPACE );";
        }
    }
 

}