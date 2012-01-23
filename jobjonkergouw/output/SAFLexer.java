// $ANTLR 3.4 /Users/job/Programming/svn-sc/SAFlexer.g 2012-01-23 09:54:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFlexer extends Lexer {
    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int ATTACK_TYPE=5;
    public static final int CHOOSE=6;
    public static final int CONDITION_TYPE=7;
    public static final int DIGIT=8;
    public static final int ID=9;
    public static final int LEFT_BRACE=10;
    public static final int LEFT_BRACKET=11;
    public static final int LEFT_PAREN=12;
    public static final int LOGICAL_OPERATOR=13;
    public static final int MOVE_TYPE=14;
    public static final int NEWLINE=15;
    public static final int RIGHT_BRACE=16;
    public static final int RIGHT_BRACKET=17;
    public static final int RIGHT_PAREN=18;
    public static final int STRENGTH=19;
    public static final int WHITESPACE=20;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SAFlexer() {} 
    public SAFlexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SAFlexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/job/Programming/svn-sc/SAFlexer.g"; }

    // $ANTLR start "LEFT_BRACE"
    public final void mLEFT_BRACE() throws RecognitionException {
        try {
            int _type = LEFT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:4:13: ( '{' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:4:15: '{'
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
    // $ANTLR end "LEFT_BRACE"

    // $ANTLR start "RIGHT_BRACE"
    public final void mRIGHT_BRACE() throws RecognitionException {
        try {
            int _type = RIGHT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:5:14: ( '}' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:5:16: '}'
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
    // $ANTLR end "RIGHT_BRACE"

    // $ANTLR start "LEFT_BRACKET"
    public final void mLEFT_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:6:14: ( '[' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:6:16: '['
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
            // /Users/job/Programming/svn-sc/SAFlexer.g:7:15: ( ']' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:7:17: ']'
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

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:8:13: ( '(' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:8:15: '('
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
            // /Users/job/Programming/svn-sc/SAFlexer.g:9:14: ( ')' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:9:16: ')'
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

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:10:10: ( '=' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:10:12: '='
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
    // $ANTLR end "ASSIGN"

    // $ANTLR start "STRENGTH"
    public final void mSTRENGTH() throws RecognitionException {
        try {
            int _type = STRENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:13:12: ( 'kickPower' | 'punchPower' | 'kickReach' | 'punchReach' )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='k') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='i') ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3=='c') ) {
                        int LA1_5 = input.LA(4);

                        if ( (LA1_5=='k') ) {
                            int LA1_7 = input.LA(5);

                            if ( (LA1_7=='P') ) {
                                alt1=1;
                            }
                            else if ( (LA1_7=='R') ) {
                                alt1=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 7, input);

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
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0=='p') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='u') ) {
                    int LA1_4 = input.LA(3);

                    if ( (LA1_4=='n') ) {
                        int LA1_6 = input.LA(4);

                        if ( (LA1_6=='c') ) {
                            int LA1_8 = input.LA(5);

                            if ( (LA1_8=='h') ) {
                                int LA1_11 = input.LA(6);

                                if ( (LA1_11=='P') ) {
                                    alt1=2;
                                }
                                else if ( (LA1_11=='R') ) {
                                    alt1=4;
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
                                new NoViableAltException("", 1, 6, input);

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
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:13:14: 'kickPower'
                    {
                    match("kickPower"); 



                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:13:28: 'punchPower'
                    {
                    match("punchPower"); 



                    }
                    break;
                case 3 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:13:43: 'kickReach'
                    {
                    match("kickReach"); 



                    }
                    break;
                case 4 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:13:57: 'punchReach'
                    {
                    match("punchReach"); 



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
    // $ANTLR end "STRENGTH"

    // $ANTLR start "ATTACK_TYPE"
    public final void mATTACK_TYPE() throws RecognitionException {
        try {
            int _type = ATTACK_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:14:15: ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 'p':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='u') ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4=='n') ) {
                        int LA2_7 = input.LA(4);

                        if ( (LA2_7=='c') ) {
                            int LA2_10 = input.LA(5);

                            if ( (LA2_10=='h') ) {
                                int LA2_13 = input.LA(6);

                                if ( (LA2_13=='_') ) {
                                    int LA2_16 = input.LA(7);

                                    if ( (LA2_16=='l') ) {
                                        alt2=1;
                                    }
                                    else if ( (LA2_16=='h') ) {
                                        alt2=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 16, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 13, input);

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
                                new NoViableAltException("", 2, 7, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

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
            case 'k':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='i') ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5=='c') ) {
                        int LA2_8 = input.LA(4);

                        if ( (LA2_8=='k') ) {
                            int LA2_11 = input.LA(5);

                            if ( (LA2_11=='_') ) {
                                int LA2_14 = input.LA(6);

                                if ( (LA2_14=='l') ) {
                                    alt2=3;
                                }
                                else if ( (LA2_14=='h') ) {
                                    alt2=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 14, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 11, input);

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
                            new NoViableAltException("", 2, 5, input);

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
            case 'b':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='l') ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6=='o') ) {
                        int LA2_9 = input.LA(4);

                        if ( (LA2_9=='c') ) {
                            int LA2_12 = input.LA(5);

                            if ( (LA2_12=='k') ) {
                                int LA2_15 = input.LA(6);

                                if ( (LA2_15=='_') ) {
                                    int LA2_19 = input.LA(7);

                                    if ( (LA2_19=='l') ) {
                                        alt2=5;
                                    }
                                    else if ( (LA2_19=='h') ) {
                                        alt2=6;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 19, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 15, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 12, input);

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
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:14:17: 'punch_low'
                    {
                    match("punch_low"); 



                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:14:31: 'punch_high'
                    {
                    match("punch_high"); 



                    }
                    break;
                case 3 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:14:46: 'kick_low'
                    {
                    match("kick_low"); 



                    }
                    break;
                case 4 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:14:59: 'kick_high'
                    {
                    match("kick_high"); 



                    }
                    break;
                case 5 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:14:73: 'block_low'
                    {
                    match("block_low"); 



                    }
                    break;
                case 6 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:14:87: 'block_high'
                    {
                    match("block_high"); 



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
    // $ANTLR end "ATTACK_TYPE"

    // $ANTLR start "MOVE_TYPE"
    public final void mMOVE_TYPE() throws RecognitionException {
        try {
            int _type = MOVE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:15:13: ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 'j':
                {
                alt3=1;
                }
                break;
            case 'c':
                {
                alt3=2;
                }
                break;
            case 's':
                {
                alt3=3;
                }
                break;
            case 'r':
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4=='u') ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6=='n') ) {
                        int LA3_8 = input.LA(4);

                        if ( (LA3_8=='_') ) {
                            int LA3_10 = input.LA(5);

                            if ( (LA3_10=='t') ) {
                                alt3=4;
                            }
                            else if ( (LA3_10=='a') ) {
                                alt3=5;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 10, input);

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
                            new NoViableAltException("", 3, 6, input);

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
            case 'w':
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5=='a') ) {
                    int LA3_7 = input.LA(3);

                    if ( (LA3_7=='l') ) {
                        int LA3_9 = input.LA(4);

                        if ( (LA3_9=='k') ) {
                            int LA3_11 = input.LA(5);

                            if ( (LA3_11=='_') ) {
                                int LA3_14 = input.LA(6);

                                if ( (LA3_14=='t') ) {
                                    alt3=6;
                                }
                                else if ( (LA3_14=='a') ) {
                                    alt3=7;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 14, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 11, input);

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
                            new NoViableAltException("", 3, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:15:15: 'jump'
                    {
                    match("jump"); 



                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:15:24: 'crouch'
                    {
                    match("crouch"); 



                    }
                    break;
                case 3 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:15:35: 'stand'
                    {
                    match("stand"); 



                    }
                    break;
                case 4 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:15:45: 'run_towards'
                    {
                    match("run_towards"); 



                    }
                    break;
                case 5 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:15:61: 'run_away'
                    {
                    match("run_away"); 



                    }
                    break;
                case 6 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:15:74: 'walk_towards'
                    {
                    match("walk_towards"); 



                    }
                    break;
                case 7 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:15:91: 'walk_away'
                    {
                    match("walk_away"); 



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
    // $ANTLR end "MOVE_TYPE"

    // $ANTLR start "CONDITION_TYPE"
    public final void mCONDITION_TYPE() throws RecognitionException {
        try {
            int _type = CONDITION_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:16:17: ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt4=1;
                }
                break;
            case 'w':
                {
                alt4=2;
                }
                break;
            case 'm':
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3=='u') ) {
                    int LA4_8 = input.LA(3);

                    if ( (LA4_8=='c') ) {
                        int LA4_9 = input.LA(4);

                        if ( (LA4_9=='h') ) {
                            int LA4_10 = input.LA(5);

                            if ( (LA4_10=='_') ) {
                                int LA4_11 = input.LA(6);

                                if ( (LA4_11=='s') ) {
                                    alt4=3;
                                }
                                else if ( (LA4_11=='w') ) {
                                    alt4=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 11, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 8, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'e':
                {
                alt4=5;
                }
                break;
            case 'n':
                {
                alt4=6;
                }
                break;
            case 'f':
                {
                alt4=7;
                }
                break;
            case 'a':
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:16:19: 'stronger'
                    {
                    match("stronger"); 



                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:16:32: 'weaker'
                    {
                    match("weaker"); 



                    }
                    break;
                case 3 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:16:43: 'much_stronger'
                    {
                    match("much_stronger"); 



                    }
                    break;
                case 4 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:16:61: 'much_weaker'
                    {
                    match("much_weaker"); 



                    }
                    break;
                case 5 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:16:77: 'even'
                    {
                    match("even"); 



                    }
                    break;
                case 6 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:16:86: 'near'
                    {
                    match("near"); 



                    }
                    break;
                case 7 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:16:95: 'far'
                    {
                    match("far"); 



                    }
                    break;
                case 8 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:16:103: 'always'
                    {
                    match("always"); 



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
    // $ANTLR end "CONDITION_TYPE"

    // $ANTLR start "LOGICAL_OPERATOR"
    public final void mLOGICAL_OPERATOR() throws RecognitionException {
        try {
            int _type = LOGICAL_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:17:18: ( 'or' | 'and' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='o') ) {
                alt5=1;
            }
            else if ( (LA5_0=='a') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:17:20: 'or'
                    {
                    match("or"); 



                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:17:27: 'and'
                    {
                    match("and"); 



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
    // $ANTLR end "LOGICAL_OPERATOR"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:18:11: ( 'choose' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:18:13: 'choose'
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:21:9: ( '1' .. '9' | '10' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='1') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='0') ) {
                    alt6=2;
                }
                else {
                    alt6=1;
                }
            }
            else if ( ((LA6_0 >= '2' && LA6_0 <= '9')) ) {
                alt6=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:21:11: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:21:22: '10'
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
    // $ANTLR end "DIGIT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:22:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/job/Programming/svn-sc/SAFlexer.g:22:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/job/Programming/svn-sc/SAFlexer.g:22:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/job/Programming/svn-sc/SAFlexer.g:
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
            	    break loop7;
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:24:14: ( ( ' ' | '\\t' ) )
            // /Users/job/Programming/svn-sc/SAFlexer.g:24:16: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:25:11: ( ( ( '\\r' )? '\\n' )+ )
            // /Users/job/Programming/svn-sc/SAFlexer.g:25:13: ( ( '\\r' )? '\\n' )+
            {
            // /Users/job/Programming/svn-sc/SAFlexer.g:25:13: ( ( '\\r' )? '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/job/Programming/svn-sc/SAFlexer.g:25:14: ( '\\r' )? '\\n'
            	    {
            	    // /Users/job/Programming/svn-sc/SAFlexer.g:25:14: ( '\\r' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0=='\r') ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // /Users/job/Programming/svn-sc/SAFlexer.g:25:14: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }


            	    match('\n'); 

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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /Users/job/Programming/svn-sc/SAFlexer.g:1:8: ( LEFT_BRACE | RIGHT_BRACE | LEFT_BRACKET | RIGHT_BRACKET | LEFT_PAREN | RIGHT_PAREN | ASSIGN | STRENGTH | ATTACK_TYPE | MOVE_TYPE | CONDITION_TYPE | LOGICAL_OPERATOR | CHOOSE | DIGIT | ID | WHITESPACE | NEWLINE )
        int alt10=17;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:10: LEFT_BRACE
                {
                mLEFT_BRACE(); 


                }
                break;
            case 2 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:21: RIGHT_BRACE
                {
                mRIGHT_BRACE(); 


                }
                break;
            case 3 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:33: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 


                }
                break;
            case 4 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:46: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 


                }
                break;
            case 5 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:60: LEFT_PAREN
                {
                mLEFT_PAREN(); 


                }
                break;
            case 6 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:71: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 


                }
                break;
            case 7 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:83: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 8 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:90: STRENGTH
                {
                mSTRENGTH(); 


                }
                break;
            case 9 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:99: ATTACK_TYPE
                {
                mATTACK_TYPE(); 


                }
                break;
            case 10 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:111: MOVE_TYPE
                {
                mMOVE_TYPE(); 


                }
                break;
            case 11 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:121: CONDITION_TYPE
                {
                mCONDITION_TYPE(); 


                }
                break;
            case 12 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:136: LOGICAL_OPERATOR
                {
                mLOGICAL_OPERATOR(); 


                }
                break;
            case 13 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:153: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 14 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:160: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 15 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:166: ID
                {
                mID(); 


                }
                break;
            case 16 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:169: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 17 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:180: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\10\uffff\16\27\4\uffff\20\27\1\74\16\27\1\113\1\27\1\74\1\uffff"+
        "\3\27\1\122\10\27\2\113\1\uffff\6\27\1\uffff\2\27\1\122\17\27\1"+
        "\122\1\172\5\27\1\113\2\27\1\113\12\27\1\uffff\11\27\1\u0095\7\27"+
        "\1\113\1\27\1\122\4\27\2\u00a2\1\uffff\1\u0095\2\27\1\u0095\1\27"+
        "\1\u0095\3\27\1\122\2\27\1\uffff\2\u00a2\2\u0095\4\27\1\122\2\27"+
        "\1\113\1\122\1\27\1\113";
    static final String DFA10_eofS =
        "\u00b2\uffff";
    static final String DFA10_minS =
        "\1\11\7\uffff\1\151\1\165\1\154\1\165\1\150\1\164\1\165\1\141\1"+
        "\165\1\166\1\145\1\141\1\154\1\162\4\uffff\1\143\1\156\1\157\1\155"+
        "\2\157\1\141\1\156\1\154\1\141\1\143\1\145\1\141\1\162\1\167\1\144"+
        "\1\60\1\153\2\143\1\160\1\165\1\157\1\156\1\157\1\137\2\153\1\150"+
        "\1\156\1\162\1\60\1\141\1\60\1\uffff\1\120\1\150\1\153\1\60\1\143"+
        "\1\163\1\144\1\156\1\141\1\137\1\145\1\137\2\60\1\uffff\1\171\1"+
        "\157\1\145\1\150\1\120\1\137\1\uffff\1\150\1\145\1\60\1\147\1\157"+
        "\1\167\1\141\1\162\2\163\1\167\1\141\1\157\1\151\1\157\1\145\2\150"+
        "\2\60\1\145\1\167\1\141\1\157\1\167\1\60\1\164\1\145\1\60\1\145"+
        "\1\143\1\167\1\147\1\167\1\141\1\157\1\151\1\157\1\151\1\uffff\1"+
        "\162\1\141\1\171\1\167\1\141\1\162\1\141\1\162\1\150\1\60\1\150"+
        "\1\145\1\143\1\167\1\147\1\167\1\147\1\60\1\162\1\60\1\141\1\171"+
        "\1\157\1\153\2\60\1\uffff\1\60\1\162\1\150\1\60\1\150\1\60\1\150"+
        "\1\144\1\162\1\60\1\156\1\145\1\uffff\4\60\1\163\1\144\1\147\1\162"+
        "\1\60\1\163\1\145\2\60\1\162\1\60";
    static final String DFA10_maxS =
        "\1\175\7\uffff\1\151\1\165\1\154\1\165\1\162\1\164\1\165\1\145\1"+
        "\165\1\166\1\145\1\141\1\156\1\162\4\uffff\1\143\1\156\1\157\1\155"+
        "\2\157\1\162\1\156\1\154\1\141\1\143\1\145\1\141\1\162\1\167\1\144"+
        "\1\172\1\153\2\143\1\160\1\165\1\157\1\156\1\157\1\137\2\153\1\150"+
        "\1\156\1\162\1\172\1\141\1\172\1\uffff\1\137\1\150\1\153\1\172\1"+
        "\143\1\163\1\144\1\156\1\164\1\137\1\145\1\137\2\172\1\uffff\1\171"+
        "\1\157\1\145\1\154\2\137\1\uffff\1\150\1\145\1\172\1\147\1\157\1"+
        "\167\1\164\1\162\1\167\1\163\1\167\1\141\1\157\1\151\1\157\1\145"+
        "\2\154\2\172\1\145\1\167\1\141\1\157\1\167\1\172\1\164\1\145\1\172"+
        "\1\145\1\143\1\167\1\147\1\167\1\141\1\157\1\151\1\157\1\151\1\uffff"+
        "\1\162\1\141\1\171\1\167\1\141\1\162\1\141\1\162\1\150\1\172\1\150"+
        "\1\145\1\143\1\167\1\147\1\167\1\147\1\172\1\162\1\172\1\141\1\171"+
        "\1\157\1\153\2\172\1\uffff\1\172\1\162\1\150\1\172\1\150\1\172\1"+
        "\150\1\144\1\162\1\172\1\156\1\145\1\uffff\4\172\1\163\1\144\1\147"+
        "\1\162\1\172\1\163\1\145\2\172\1\162\1\172";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\16\uffff\1\16\1\17\1\20\1\21"+
        "\42\uffff\1\14\16\uffff\1\13\6\uffff\1\12\47\uffff\1\15\32\uffff"+
        "\1\11\14\uffff\1\10\17\uffff";
    static final String DFA10_specialS =
        "\u00b2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\30\1\31\2\uffff\1\31\22\uffff\1\30\7\uffff\1\5\1\6\7\uffff"+
            "\11\26\3\uffff\1\7\3\uffff\32\27\1\3\1\uffff\1\4\1\uffff\1\27"+
            "\1\uffff\1\24\1\12\1\14\1\27\1\21\1\23\3\27\1\13\1\10\1\27\1"+
            "\20\1\22\1\25\1\11\1\27\1\16\1\15\3\27\1\17\3\27\1\1\1\uffff"+
            "\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\11\uffff\1\36",
            "\1\40",
            "\1\41",
            "\1\42\3\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50\1\uffff\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61\20\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
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
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\114",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\115\1\uffff\1\116\14\uffff\1\117",
            "\1\120",
            "\1\121",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\130\22\uffff\1\127",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\140\3\uffff\1\137",
            "\1\141\1\uffff\1\142\14\uffff\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\153\22\uffff\1\152",
            "\1\154",
            "\1\155\3\uffff\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\167\3\uffff\1\166",
            "\1\171\3\uffff\1\170",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0080",
            "\1\u0081",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
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
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u009d",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a3",
            "\1\u00a4",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a5",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00af",
            "\1\u00b0",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00b1",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27"
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
            return "1:1: Tokens : ( LEFT_BRACE | RIGHT_BRACE | LEFT_BRACKET | RIGHT_BRACKET | LEFT_PAREN | RIGHT_PAREN | ASSIGN | STRENGTH | ATTACK_TYPE | MOVE_TYPE | CONDITION_TYPE | LOGICAL_OPERATOR | CHOOSE | DIGIT | ID | WHITESPACE | NEWLINE );";
        }
    }
 

}