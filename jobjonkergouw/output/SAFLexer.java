// $ANTLR 3.4 /Users/job/Programming/svn-sc/SAFlexer.g 2012-01-22 23:58:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFlexer extends Lexer {
    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int ATTACK=5;
    public static final int CONDITION=6;
    public static final int ID=7;
    public static final int LEFT_BRACE=8;
    public static final int LEFT_BRACKET=9;
    public static final int MOVE=10;
    public static final int NEWLINE=11;
    public static final int NUMBER=12;
    public static final int RIGHT_BRACE=13;
    public static final int RIGHT_BRACKET=14;
    public static final int STRENGTH=15;
    public static final int WHITESPACE=16;

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
            // /Users/job/Programming/svn-sc/SAFlexer.g:3:13: ( '{' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:3:15: '{'
            {
            match('{'); if (state.failed) return ;

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
            // /Users/job/Programming/svn-sc/SAFlexer.g:4:14: ( '}' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:4:16: '}'
            {
            match('}'); if (state.failed) return ;

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
            // /Users/job/Programming/svn-sc/SAFlexer.g:5:14: ( '[' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:5:16: '['
            {
            match('['); if (state.failed) return ;

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
            // /Users/job/Programming/svn-sc/SAFlexer.g:6:15: ( ']' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:6:17: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_BRACKET"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:7:10: ( '=' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:7:12: '='
            {
            match('='); if (state.failed) return ;

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
            // /Users/job/Programming/svn-sc/SAFlexer.g:9:12: ( 'kickPower' | 'punchPower' | 'kickReach' | 'punchReach' )
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
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 7, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
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
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 11, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:9:14: 'kickPower'
                    {
                    match("kickPower"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:9:28: 'punchPower'
                    {
                    match("punchPower"); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:9:43: 'kickReach'
                    {
                    match("kickReach"); if (state.failed) return ;



                    }
                    break;
                case 4 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:9:57: 'punchReach'
                    {
                    match("punchReach"); if (state.failed) return ;



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

    // $ANTLR start "ATTACK"
    public final void mATTACK() throws RecognitionException {
        try {
            int _type = ATTACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:10:11: ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' )
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
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 16, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 13, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 7, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
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
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 14, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 11, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
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
                                        if (state.backtracking>0) {state.failed=true; return ;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 19, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 15, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 12, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:10:13: 'punch_low'
                    {
                    match("punch_low"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:10:27: 'punch_high'
                    {
                    match("punch_high"); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:10:42: 'kick_low'
                    {
                    match("kick_low"); if (state.failed) return ;



                    }
                    break;
                case 4 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:10:55: 'kick_high'
                    {
                    match("kick_high"); if (state.failed) return ;



                    }
                    break;
                case 5 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:10:69: 'block_low'
                    {
                    match("block_low"); if (state.failed) return ;



                    }
                    break;
                case 6 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:10:83: 'block_high'
                    {
                    match("block_high"); if (state.failed) return ;



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
    // $ANTLR end "ATTACK"

    // $ANTLR start "MOVE"
    public final void mMOVE() throws RecognitionException {
        try {
            int _type = MOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:11:9: ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' )
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
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
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
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 14, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 11, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 7, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:11:11: 'jump'
                    {
                    match("jump"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:11:20: 'crouch'
                    {
                    match("crouch"); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:11:31: 'stand'
                    {
                    match("stand"); if (state.failed) return ;



                    }
                    break;
                case 4 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:11:41: 'run_towards'
                    {
                    match("run_towards"); if (state.failed) return ;



                    }
                    break;
                case 5 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:11:57: 'run_away'
                    {
                    match("run_away"); if (state.failed) return ;



                    }
                    break;
                case 6 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:11:70: 'walk_towards'
                    {
                    match("walk_towards"); if (state.failed) return ;



                    }
                    break;
                case 7 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:11:87: 'walk_away'
                    {
                    match("walk_away"); if (state.failed) return ;



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
    // $ANTLR end "MOVE"

    // $ANTLR start "CONDITION"
    public final void mCONDITION() throws RecognitionException {
        try {
            int _type = CONDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:12:13: ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' )
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
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 11, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 8, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:12:15: 'stronger'
                    {
                    match("stronger"); if (state.failed) return ;



                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:12:28: 'weaker'
                    {
                    match("weaker"); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:12:39: 'much_stronger'
                    {
                    match("much_stronger"); if (state.failed) return ;



                    }
                    break;
                case 4 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:12:57: 'much_weaker'
                    {
                    match("much_weaker"); if (state.failed) return ;



                    }
                    break;
                case 5 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:12:73: 'even'
                    {
                    match("even"); if (state.failed) return ;



                    }
                    break;
                case 6 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:12:82: 'near'
                    {
                    match("near"); if (state.failed) return ;



                    }
                    break;
                case 7 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:12:91: 'far'
                    {
                    match("far"); if (state.failed) return ;



                    }
                    break;
                case 8 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:12:99: 'always'
                    {
                    match("always"); if (state.failed) return ;



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
    // $ANTLR end "CONDITION"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:14:10: ( ( '1' )=> '1' | '2' .. '9' | '10' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='1') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='0') ) {
                    alt5=3;
                }
                else {
                    alt5=1;
                }
            }
            else if ( ((LA5_0 >= '2' && LA5_0 <= '9')) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:14:12: ( '1' )=> '1'
                    {
                    match('1'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:14:27: '2' .. '9'
                    {
                    matchRange('2','9'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:14:38: '10'
                    {
                    match("10"); if (state.failed) return ;



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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:15:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/job/Programming/svn-sc/SAFlexer.g:15:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/job/Programming/svn-sc/SAFlexer.g:15:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/job/Programming/svn-sc/SAFlexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
            // /Users/job/Programming/svn-sc/SAFlexer.g:17:14: ( ( ' ' | '\\t' ) )
            // /Users/job/Programming/svn-sc/SAFlexer.g:17:16: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( state.backtracking==0 ) { _channel = HIDDEN; }

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
            // /Users/job/Programming/svn-sc/SAFlexer.g:18:11: ( ( '\\r' )? '\\n' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:18:13: ( '\\r' )? '\\n'
            {
            // /Users/job/Programming/svn-sc/SAFlexer.g:18:13: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:18:13: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;

            }


            match('\n'); if (state.failed) return ;

            if ( state.backtracking==0 ) { _channel = HIDDEN; }

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
        // /Users/job/Programming/svn-sc/SAFlexer.g:1:8: ( LEFT_BRACE | RIGHT_BRACE | LEFT_BRACKET | RIGHT_BRACKET | ASSIGN | STRENGTH | ATTACK | MOVE | CONDITION | NUMBER | ID | WHITESPACE | NEWLINE )
        int alt8=13;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:10: LEFT_BRACE
                {
                mLEFT_BRACE(); if (state.failed) return ;


                }
                break;
            case 2 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:21: RIGHT_BRACE
                {
                mRIGHT_BRACE(); if (state.failed) return ;


                }
                break;
            case 3 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:33: LEFT_BRACKET
                {
                mLEFT_BRACKET(); if (state.failed) return ;


                }
                break;
            case 4 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:46: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); if (state.failed) return ;


                }
                break;
            case 5 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:60: ASSIGN
                {
                mASSIGN(); if (state.failed) return ;


                }
                break;
            case 6 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:67: STRENGTH
                {
                mSTRENGTH(); if (state.failed) return ;


                }
                break;
            case 7 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:76: ATTACK
                {
                mATTACK(); if (state.failed) return ;


                }
                break;
            case 8 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:83: MOVE
                {
                mMOVE(); if (state.failed) return ;


                }
                break;
            case 9 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:88: CONDITION
                {
                mCONDITION(); if (state.failed) return ;


                }
                break;
            case 10 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:98: NUMBER
                {
                mNUMBER(); if (state.failed) return ;


                }
                break;
            case 11 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:105: ID
                {
                mID(); if (state.failed) return ;


                }
                break;
            case 12 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:108: WHITESPACE
                {
                mWHITESPACE(); if (state.failed) return ;


                }
                break;
            case 13 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:119: NEWLINE
                {
                mNEWLINE(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_SAFlexer
    public final void synpred1_SAFlexer_fragment() throws RecognitionException {
        // /Users/job/Programming/svn-sc/SAFlexer.g:14:12: ( '1' )
        // /Users/job/Programming/svn-sc/SAFlexer.g:14:13: '1'
        {
        match('1'); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_SAFlexer

    public final boolean synpred1_SAFlexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_SAFlexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\6\uffff\15\24\4\uffff\33\24\1\101\4\24\1\110\7\24\2\101\1\uffff"+
        "\6\24\1\uffff\1\24\1\110\17\24\1\110\5\24\1\101\2\24\1\101\23\24"+
        "\1\u0088\7\24\1\101\1\24\1\110\4\24\2\u0095\1\uffff\1\u0088\2\24"+
        "\1\u0088\1\24\1\u0088\3\24\1\110\2\24\1\uffff\2\u0095\2\u0088\4"+
        "\24\1\110\2\24\1\101\1\110\1\24\1\101";
    static final String DFA8_eofS =
        "\u00a5\uffff";
    static final String DFA8_minS =
        "\1\11\5\uffff\1\151\1\165\1\154\1\165\1\162\1\164\1\165\1\141\1"+
        "\165\1\166\1\145\1\141\1\154\4\uffff\1\143\1\156\1\157\1\155\1\157"+
        "\1\141\1\156\1\154\1\141\1\143\1\145\1\141\1\162\1\167\1\153\2\143"+
        "\1\160\1\165\1\156\1\157\1\137\2\153\1\150\1\156\1\162\1\60\1\141"+
        "\1\120\1\150\1\153\1\60\1\143\1\144\1\156\1\141\1\137\1\145\1\137"+
        "\2\60\1\uffff\1\171\1\157\1\145\1\150\1\120\1\137\1\uffff\1\150"+
        "\1\60\1\147\1\157\1\167\1\141\1\162\2\163\1\167\1\141\1\157\1\151"+
        "\1\157\1\145\2\150\1\60\1\145\1\167\1\141\1\157\1\167\1\60\1\164"+
        "\1\145\1\60\1\145\1\143\1\167\1\147\1\167\1\141\1\157\1\151\1\157"+
        "\1\151\1\162\1\141\1\171\1\167\1\141\1\162\1\141\1\162\1\150\1\60"+
        "\1\150\1\145\1\143\1\167\1\147\1\167\1\147\1\60\1\162\1\60\1\141"+
        "\1\171\1\157\1\153\2\60\1\uffff\1\60\1\162\1\150\1\60\1\150\1\60"+
        "\1\150\1\144\1\162\1\60\1\156\1\145\1\uffff\4\60\1\163\1\144\1\147"+
        "\1\162\1\60\1\163\1\145\2\60\1\162\1\60";
    static final String DFA8_maxS =
        "\1\175\5\uffff\1\151\1\165\1\154\1\165\1\162\1\164\1\165\1\145\1"+
        "\165\1\166\1\145\1\141\1\154\4\uffff\1\143\1\156\1\157\1\155\1\157"+
        "\1\162\1\156\1\154\1\141\1\143\1\145\1\141\1\162\1\167\1\153\2\143"+
        "\1\160\1\165\1\156\1\157\1\137\2\153\1\150\1\156\1\162\1\172\1\141"+
        "\1\137\1\150\1\153\1\172\1\143\1\144\1\156\1\164\1\137\1\145\1\137"+
        "\2\172\1\uffff\1\171\1\157\1\145\1\154\2\137\1\uffff\1\150\1\172"+
        "\1\147\1\157\1\167\1\164\1\162\1\167\1\163\1\167\1\141\1\157\1\151"+
        "\1\157\1\145\2\154\1\172\1\145\1\167\1\141\1\157\1\167\1\172\1\164"+
        "\1\145\1\172\1\145\1\143\1\167\1\147\1\167\1\141\1\157\1\151\1\157"+
        "\1\151\1\162\1\141\1\171\1\167\1\141\1\162\1\141\1\162\1\150\1\172"+
        "\1\150\1\145\1\143\1\167\1\147\1\167\1\147\1\172\1\162\1\172\1\141"+
        "\1\171\1\157\1\153\2\172\1\uffff\1\172\1\162\1\150\1\172\1\150\1"+
        "\172\1\150\1\144\1\162\1\172\1\156\1\145\1\uffff\4\172\1\163\1\144"+
        "\1\147\1\162\1\172\1\163\1\145\2\172\1\162\1\172";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\15\uffff\1\12\1\13\1\14\1\15\52\uffff"+
        "\1\11\6\uffff\1\10\77\uffff\1\7\14\uffff\1\6\17\uffff";
    static final String DFA8_specialS =
        "\u00a5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\25\1\26\2\uffff\1\26\22\uffff\1\25\20\uffff\11\23\3\uffff"+
            "\1\5\3\uffff\32\24\1\3\1\uffff\1\4\1\uffff\1\24\1\uffff\1\22"+
            "\1\10\1\12\1\24\1\17\1\21\3\24\1\11\1\6\1\24\1\16\1\20\1\24"+
            "\1\7\1\24\1\14\1\13\3\24\1\15\3\24\1\1\1\uffff\1\2",
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
            "\1\36\3\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\20\uffff\1\53",
            "\1\54",
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
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\102",
            "\1\103\1\uffff\1\104\14\uffff\1\105",
            "\1\106",
            "\1\107",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\22\uffff\1\114",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\125\3\uffff\1\124",
            "\1\126\1\uffff\1\127\14\uffff\1\130",
            "\1\131",
            "",
            "\1\132",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\137\22\uffff\1\136",
            "\1\140",
            "\1\141\3\uffff\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\153\3\uffff\1\152",
            "\1\155\3\uffff\1\154",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\163",
            "\1\164",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u0090",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u0096",
            "\1\u0097",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u0098",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u009c",
            "\1\u009d",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u00a2",
            "\1\u00a3",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u00a4",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24"
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
            return "1:1: Tokens : ( LEFT_BRACE | RIGHT_BRACE | LEFT_BRACKET | RIGHT_BRACKET | ASSIGN | STRENGTH | ATTACK | MOVE | CONDITION | NUMBER | ID | WHITESPACE | NEWLINE );";
        }
    }
 

}