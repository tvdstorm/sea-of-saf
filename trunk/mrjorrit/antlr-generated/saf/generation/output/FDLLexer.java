// $ANTLR 3.4 /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g 2012-01-23 19:29:07

  package saf.generation.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ATTRIBUTE=4;
    public static final int BEHAVIOUR=5;
    public static final int CHOOSE=6;
    public static final int CONDITIONTYPE=7;
    public static final int DIGIT=8;
    public static final int EQUALS=9;
    public static final int FIGHTACTIONTYPE=10;
    public static final int IDENT=11;
    public static final int LEFT_BRACKET=12;
    public static final int LEFT_CURLY=13;
    public static final int LEFT_PAREN=14;
    public static final int MOVEACTIONTYPE=15;
    public static final int ONEDIGIT=16;
    public static final int PERSONALITY=17;
    public static final int RIGHT_BRACKET=18;
    public static final int RIGHT_CURLY=19;
    public static final int RIGHT_PAREN=20;
    public static final int WS=21;

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
    public String getGrammarFileName() { return "/Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g"; }

    // $ANTLR start "PERSONALITY"
    public final void mPERSONALITY() throws RecognitionException {
        try {
            int _type = PERSONALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:61:13: ( 'Personality' )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:61:15: 'Personality'
            {
            match("Personality"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERSONALITY"

    // $ANTLR start "BEHAVIOUR"
    public final void mBEHAVIOUR() throws RecognitionException {
        try {
            int _type = BEHAVIOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:62:11: ( 'Behaviour' )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:62:13: 'Behaviour'
            {
            match("Behaviour"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEHAVIOUR"

    // $ANTLR start "FIGHTACTIONTYPE"
    public final void mFIGHTACTIONTYPE() throws RecognitionException {
        try {
            int _type = FIGHTACTIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:63:17: ( ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' ) )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:63:19: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:63:19: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 'b':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='l') ) {
                    int LA1_4 = input.LA(3);

                    if ( (LA1_4=='o') ) {
                        int LA1_7 = input.LA(4);

                        if ( (LA1_7=='c') ) {
                            int LA1_10 = input.LA(5);

                            if ( (LA1_10=='k') ) {
                                int LA1_13 = input.LA(6);

                                if ( (LA1_13=='_') ) {
                                    int LA1_16 = input.LA(7);

                                    if ( (LA1_16=='l') ) {
                                        alt1=1;
                                    }
                                    else if ( (LA1_16=='h') ) {
                                        alt1=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 1, 16, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 13, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 7, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'p':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='u') ) {
                    int LA1_5 = input.LA(3);

                    if ( (LA1_5=='n') ) {
                        int LA1_8 = input.LA(4);

                        if ( (LA1_8=='c') ) {
                            int LA1_11 = input.LA(5);

                            if ( (LA1_11=='h') ) {
                                int LA1_14 = input.LA(6);

                                if ( (LA1_14=='_') ) {
                                    int LA1_17 = input.LA(7);

                                    if ( (LA1_17=='l') ) {
                                        alt1=3;
                                    }
                                    else if ( (LA1_17=='h') ) {
                                        alt1=4;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 1, 17, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 14, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 11, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'k':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='i') ) {
                    int LA1_6 = input.LA(3);

                    if ( (LA1_6=='c') ) {
                        int LA1_9 = input.LA(4);

                        if ( (LA1_9=='k') ) {
                            int LA1_12 = input.LA(5);

                            if ( (LA1_12=='_') ) {
                                int LA1_15 = input.LA(6);

                                if ( (LA1_15=='l') ) {
                                    alt1=5;
                                }
                                else if ( (LA1_15=='h') ) {
                                    alt1=6;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 15, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 12, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:63:20: 'block_low'
                    {
                    match("block_low"); 



                    }
                    break;
                case 2 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:63:34: 'block_high'
                    {
                    match("block_high"); 



                    }
                    break;
                case 3 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:63:49: 'punch_low'
                    {
                    match("punch_low"); 



                    }
                    break;
                case 4 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:63:63: 'punch_high'
                    {
                    match("punch_high"); 



                    }
                    break;
                case 5 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:63:78: 'kick_low'
                    {
                    match("kick_low"); 



                    }
                    break;
                case 6 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:63:91: 'kick_high'
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FIGHTACTIONTYPE"

    // $ANTLR start "MOVEACTIONTYPE"
    public final void mMOVEACTIONTYPE() throws RecognitionException {
        try {
            int _type = MOVEACTIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:64:16: ( ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' ) )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:64:18: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:64:18: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 'w':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='a') ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6=='l') ) {
                        int LA2_8 = input.LA(4);

                        if ( (LA2_8=='k') ) {
                            int LA2_10 = input.LA(5);

                            if ( (LA2_10=='_') ) {
                                int LA2_12 = input.LA(6);

                                if ( (LA2_12=='t') ) {
                                    alt2=1;
                                }
                                else if ( (LA2_12=='a') ) {
                                    alt2=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 12, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'r':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='u') ) {
                    int LA2_7 = input.LA(3);

                    if ( (LA2_7=='n') ) {
                        int LA2_9 = input.LA(4);

                        if ( (LA2_9=='_') ) {
                            int LA2_11 = input.LA(5);

                            if ( (LA2_11=='t') ) {
                                alt2=3;
                            }
                            else if ( (LA2_11=='a') ) {
                                alt2=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 11, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'j':
                {
                alt2=5;
                }
                break;
            case 'c':
                {
                alt2=6;
                }
                break;
            case 's':
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:64:19: 'walk_towards'
                    {
                    match("walk_towards"); 



                    }
                    break;
                case 2 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:64:36: 'walk_away'
                    {
                    match("walk_away"); 



                    }
                    break;
                case 3 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:64:50: 'run_towards'
                    {
                    match("run_towards"); 



                    }
                    break;
                case 4 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:64:66: 'run_away'
                    {
                    match("run_away"); 



                    }
                    break;
                case 5 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:64:79: 'jump'
                    {
                    match("jump"); 



                    }
                    break;
                case 6 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:64:88: 'crouch'
                    {
                    match("crouch"); 



                    }
                    break;
                case 7 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:64:99: 'stand'
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOVEACTIONTYPE"

    // $ANTLR start "CONDITIONTYPE"
    public final void mCONDITIONTYPE() throws RecognitionException {
        try {
            int _type = CONDITIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:65:15: ( ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' ) )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:65:17: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:65:17: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt3=1;
                }
                break;
            case 'n':
                {
                alt3=2;
                }
                break;
            case 'f':
                {
                alt3=3;
                }
                break;
            case 'm':
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4=='u') ) {
                    int LA3_8 = input.LA(3);

                    if ( (LA3_8=='c') ) {
                        int LA3_9 = input.LA(4);

                        if ( (LA3_9=='h') ) {
                            int LA3_10 = input.LA(5);

                            if ( (LA3_10=='_') ) {
                                int LA3_11 = input.LA(6);

                                if ( (LA3_11=='s') ) {
                                    alt3=4;
                                }
                                else if ( (LA3_11=='w') ) {
                                    alt3=8;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 11, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 8, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;

                }
                }
                break;
            case 's':
                {
                alt3=5;
                }
                break;
            case 'e':
                {
                alt3=6;
                }
                break;
            case 'w':
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:65:18: 'always'
                    {
                    match("always"); 



                    }
                    break;
                case 2 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:65:29: 'near'
                    {
                    match("near"); 



                    }
                    break;
                case 3 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:65:38: 'far'
                    {
                    match("far"); 



                    }
                    break;
                case 4 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:65:46: 'much_stronger'
                    {
                    match("much_stronger"); 



                    }
                    break;
                case 5 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:65:64: 'stronger'
                    {
                    match("stronger"); 



                    }
                    break;
                case 6 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:65:77: 'even'
                    {
                    match("even"); 



                    }
                    break;
                case 7 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:65:86: 'weaker'
                    {
                    match("weaker"); 



                    }
                    break;
                case 8 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:65:97: 'much_weaker'
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONDITIONTYPE"

    // $ANTLR start "ATTRIBUTE"
    public final void mATTRIBUTE() throws RecognitionException {
        try {
            int _type = ATTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:66:11: ( ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' ) )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:66:13: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )
            {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:66:13: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='p') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='u') ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3=='n') ) {
                        int LA4_5 = input.LA(4);

                        if ( (LA4_5=='c') ) {
                            int LA4_7 = input.LA(5);

                            if ( (LA4_7=='h') ) {
                                int LA4_9 = input.LA(6);

                                if ( (LA4_9=='R') ) {
                                    alt4=1;
                                }
                                else if ( (LA4_9=='P') ) {
                                    alt4=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 9, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 7, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0=='k') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='i') ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4=='c') ) {
                        int LA4_6 = input.LA(4);

                        if ( (LA4_6=='k') ) {
                            int LA4_8 = input.LA(5);

                            if ( (LA4_8=='R') ) {
                                alt4=3;
                            }
                            else if ( (LA4_8=='P') ) {
                                alt4=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:66:14: 'punchReach'
                    {
                    match("punchReach"); 



                    }
                    break;
                case 2 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:66:29: 'punchPower'
                    {
                    match("punchPower"); 



                    }
                    break;
                case 3 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:66:44: 'kickReach'
                    {
                    match("kickReach"); 



                    }
                    break;
                case 4 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:66:58: 'kickPower'
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ATTRIBUTE"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:67:8: ( 'choose' )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:67:10: 'choose'
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

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:68:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:68:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:68:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:
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
            	    break loop5;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:69:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:69:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:69:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||(LA6_0 >= '\f' && LA6_0 <= '\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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

    // $ANTLR start "ONEDIGIT"
    public final void mONEDIGIT() throws RecognitionException {
        try {
            int _type = ONEDIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:70:10: ( '0' .. '9' )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ONEDIGIT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:71:7: ( ( '0' .. '9' )+ )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:71:9: ( '0' .. '9' )+
            {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:71:9: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:72:8: ( '=' )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:72:10: '='
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
    // $ANTLR end "EQUALS"

    // $ANTLR start "LEFT_CURLY"
    public final void mLEFT_CURLY() throws RecognitionException {
        try {
            int _type = LEFT_CURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:73:12: ( '{' )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:73:14: '{'
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
    // $ANTLR end "LEFT_CURLY"

    // $ANTLR start "RIGHT_CURLY"
    public final void mRIGHT_CURLY() throws RecognitionException {
        try {
            int _type = RIGHT_CURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:74:13: ( '}' )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:74:15: '}'
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
    // $ANTLR end "RIGHT_CURLY"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:75:12: ( '(' )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:75:14: '('
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
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:76:13: ( ')' )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:76:15: ')'
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
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "LEFT_BRACKET"
    public final void mLEFT_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:77:14: ( '[' )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:77:16: '['
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
    // $ANTLR end "LEFT_BRACKET"

    // $ANTLR start "RIGHT_BRACKET"
    public final void mRIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:78:15: ( ']' )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:78:17: ']'
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
    // $ANTLR end "RIGHT_BRACKET"

    public void mTokens() throws RecognitionException {
        // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:8: ( PERSONALITY | BEHAVIOUR | FIGHTACTIONTYPE | MOVEACTIONTYPE | CONDITIONTYPE | ATTRIBUTE | CHOOSE | IDENT | WS | ONEDIGIT | DIGIT | EQUALS | LEFT_CURLY | RIGHT_CURLY | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET )
        int alt8=18;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:10: PERSONALITY
                {
                mPERSONALITY(); 


                }
                break;
            case 2 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:22: BEHAVIOUR
                {
                mBEHAVIOUR(); 


                }
                break;
            case 3 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:32: FIGHTACTIONTYPE
                {
                mFIGHTACTIONTYPE(); 


                }
                break;
            case 4 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:48: MOVEACTIONTYPE
                {
                mMOVEACTIONTYPE(); 


                }
                break;
            case 5 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:63: CONDITIONTYPE
                {
                mCONDITIONTYPE(); 


                }
                break;
            case 6 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:77: ATTRIBUTE
                {
                mATTRIBUTE(); 


                }
                break;
            case 7 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:87: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 8 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:94: IDENT
                {
                mIDENT(); 


                }
                break;
            case 9 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:100: WS
                {
                mWS(); 


                }
                break;
            case 10 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:103: ONEDIGIT
                {
                mONEDIGIT(); 


                }
                break;
            case 11 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:112: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 12 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:118: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 13 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:125: LEFT_CURLY
                {
                mLEFT_CURLY(); 


                }
                break;
            case 14 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:136: RIGHT_CURLY
                {
                mRIGHT_CURLY(); 


                }
                break;
            case 15 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:148: LEFT_PAREN
                {
                mLEFT_PAREN(); 


                }
                break;
            case 16 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:159: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 


                }
                break;
            case 17 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:171: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 


                }
                break;
            case 18 :
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:1:184: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\17\20\2\uffff\1\53\7\uffff\21\20\2\uffff\17\20\1\116\11"+
        "\20\1\uffff\1\106\5\20\1\116\1\uffff\1\20\1\116\4\20\1\uffff\5\20"+
        "\1\106\10\20\1\116\1\106\1\157\1\20\1\116\6\20\1\uffff\7\20\1\116"+
        "\1\20\1\177\2\20\2\u0082\1\20\1\uffff\2\u0082\1\uffff\1\u0084\1"+
        "\uffff";
    static final String DFA8_eofS =
        "\u0085\uffff";
    static final String DFA8_minS =
        "\1\11\2\145\1\154\1\165\1\151\1\141\2\165\1\150\1\164\1\154\1\145"+
        "\1\141\1\165\1\166\2\uffff\1\60\7\uffff\1\162\1\150\1\157\1\156"+
        "\1\143\1\154\1\141\1\156\1\155\2\157\1\141\1\167\1\141\1\162\1\143"+
        "\1\145\2\uffff\1\163\1\141\2\143\3\153\1\137\1\160\1\165\1\157\1"+
        "\156\1\157\1\141\1\162\1\60\1\150\1\156\1\157\1\166\1\153\1\150"+
        "\1\120\1\137\1\145\1\uffff\1\60\1\143\1\163\1\144\1\156\1\171\1"+
        "\60\1\uffff\1\137\1\60\1\156\1\151\1\137\1\120\1\uffff\1\145\1\157"+
        "\1\162\1\150\1\145\1\60\1\147\1\163\1\141\1\157\1\145\1\157\1\141"+
        "\1\167\3\60\1\145\1\60\1\154\1\165\1\141\1\167\1\143\1\145\1\uffff"+
        "\1\162\1\151\1\162\1\143\1\145\1\150\1\162\1\60\1\164\1\60\1\150"+
        "\1\162\2\60\1\171\1\uffff\2\60\1\uffff\1\60\1\uffff";
    static final String DFA8_maxS =
        "\1\175\2\145\1\154\1\165\1\151\1\145\2\165\1\162\1\164\1\154\1\145"+
        "\1\141\1\165\1\166\2\uffff\1\71\7\uffff\1\162\1\150\1\157\1\156"+
        "\1\143\1\154\1\141\1\156\1\155\2\157\1\162\1\167\1\141\1\162\1\143"+
        "\1\145\2\uffff\1\163\1\141\2\143\3\153\1\137\1\160\1\165\1\157\1"+
        "\156\1\157\1\141\1\162\1\172\1\150\1\156\1\157\1\166\1\153\1\150"+
        "\2\137\1\145\1\uffff\1\172\1\143\1\163\1\144\1\156\1\171\1\172\1"+
        "\uffff\1\137\1\172\1\156\1\151\2\137\1\uffff\1\145\1\157\1\162\1"+
        "\150\1\145\1\172\1\147\1\163\1\141\1\157\1\145\1\157\1\141\1\167"+
        "\3\172\1\145\1\172\1\154\1\165\1\141\1\167\1\143\1\145\1\uffff\1"+
        "\162\1\151\1\162\1\143\1\145\1\150\1\162\1\172\1\164\1\172\1\150"+
        "\1\162\2\172\1\171\1\uffff\2\172\1\uffff\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\20\uffff\1\10\1\11\1\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\21"+
        "\uffff\1\12\1\13\31\uffff\1\4\7\uffff\1\5\6\uffff\1\3\31\uffff\1"+
        "\7\17\uffff\1\2\2\uffff\1\6\1\uffff\1\1";
    static final String DFA8_specialS =
        "\u0085\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\21\1\uffff\2\21\22\uffff\1\21\7\uffff\1\26\1\27\6\uffff\12"+
            "\22\3\uffff\1\23\3\uffff\1\20\1\2\15\20\1\1\12\20\1\30\1\uffff"+
            "\1\31\3\uffff\1\13\1\3\1\11\1\20\1\17\1\15\3\20\1\10\1\5\1\20"+
            "\1\16\1\14\1\20\1\4\1\20\1\7\1\12\3\20\1\6\3\20\1\24\1\uffff"+
            "\1\25",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37\3\uffff\1\40",
            "\1\41",
            "\1\42",
            "\1\44\11\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "\12\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
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
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
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
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\127\1\uffff\1\126\14\uffff\1\125",
            "\1\106",
            "\1\130",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "\1\116",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\136",
            "\1\137",
            "\1\125",
            "\1\141\1\uffff\1\140\14\uffff\1\125",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\160",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\176",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\u0080",
            "\1\u0081",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\1\u0083",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PERSONALITY | BEHAVIOUR | FIGHTACTIONTYPE | MOVEACTIONTYPE | CONDITIONTYPE | ATTRIBUTE | CHOOSE | IDENT | WS | ONEDIGIT | DIGIT | EQUALS | LEFT_CURLY | RIGHT_CURLY | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET );";
        }
    }
 

}