// $ANTLR 3.4 D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g 2012-07-16 10:33:11

  package Parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class safLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int CHARACTERISTIC=5;
    public static final int CHOOSE=6;
    public static final int CONDITION_TYPE=7;
    public static final int EQ=8;
    public static final int FIGHT_ACTION=9;
    public static final int ID=10;
    public static final int L_BRACKET=11;
    public static final int L_CURLY=12;
    public static final int L_PAR=13;
    public static final int MOVE_ACTION=14;
    public static final int NUMBER=15;
    public static final int OR=16;
    public static final int R_BRACKET=17;
    public static final int R_CURLY=18;
    public static final int R_PAR=19;
    public static final int WS=20;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public safLexer() {} 
    public safLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public safLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g"; }

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:143:4: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:143:6: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:143:16: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:
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
    // $ANTLR end "ID"

    // $ANTLR start "CHARACTERISTIC"
    public final void mCHARACTERISTIC() throws RecognitionException {
        try {
            int _type = CHARACTERISTIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:144:15: ( ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' ) )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:144:17: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )
            {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:144:17: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='p') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='u') ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3=='n') ) {
                        int LA2_5 = input.LA(4);

                        if ( (LA2_5=='c') ) {
                            int LA2_7 = input.LA(5);

                            if ( (LA2_7=='h') ) {
                                int LA2_9 = input.LA(6);

                                if ( (LA2_9=='R') ) {
                                    alt2=1;
                                }
                                else if ( (LA2_9=='P') ) {
                                    alt2=2;
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
                                new NoViableAltException("", 2, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0=='k') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='i') ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4=='c') ) {
                        int LA2_6 = input.LA(4);

                        if ( (LA2_6=='k') ) {
                            int LA2_8 = input.LA(5);

                            if ( (LA2_8=='R') ) {
                                alt2=3;
                            }
                            else if ( (LA2_8=='P') ) {
                                alt2=4;
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
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:144:18: 'punchReach'
                    {
                    match("punchReach"); 



                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:144:33: 'punchPower'
                    {
                    match("punchPower"); 



                    }
                    break;
                case 3 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:144:48: 'kickReach'
                    {
                    match("kickReach"); 



                    }
                    break;
                case 4 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:144:62: 'kickPower'
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
    // $ANTLR end "CHARACTERISTIC"

    // $ANTLR start "CONDITION_TYPE"
    public final void mCONDITION_TYPE() throws RecognitionException {
        try {
            int _type = CONDITION_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:145:16: ( ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' ) )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:145:18: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:145:18: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
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
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:145:19: 'always'
                    {
                    match("always"); 



                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:145:30: 'near'
                    {
                    match("near"); 



                    }
                    break;
                case 3 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:145:39: 'far'
                    {
                    match("far"); 



                    }
                    break;
                case 4 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:145:47: 'much_stronger'
                    {
                    match("much_stronger"); 



                    }
                    break;
                case 5 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:145:65: 'stronger'
                    {
                    match("stronger"); 



                    }
                    break;
                case 6 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:145:78: 'even'
                    {
                    match("even"); 



                    }
                    break;
                case 7 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:145:87: 'weaker'
                    {
                    match("weaker"); 



                    }
                    break;
                case 8 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:145:98: 'much_weaker'
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
    // $ANTLR end "CONDITION_TYPE"

    // $ANTLR start "MOVE_ACTION"
    public final void mMOVE_ACTION() throws RecognitionException {
        try {
            int _type = MOVE_ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:146:12: ( ( 'jump' | 'crouch' | 'stand' | 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' ) )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:146:14: ( 'jump' | 'crouch' | 'stand' | 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' )
            {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:146:14: ( 'jump' | 'crouch' | 'stand' | 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 'j':
                {
                alt4=1;
                }
                break;
            case 'c':
                {
                alt4=2;
                }
                break;
            case 's':
                {
                alt4=3;
                }
                break;
            case 'w':
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4=='a') ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6=='l') ) {
                        int LA4_8 = input.LA(4);

                        if ( (LA4_8=='k') ) {
                            int LA4_10 = input.LA(5);

                            if ( (LA4_10=='_') ) {
                                int LA4_12 = input.LA(6);

                                if ( (LA4_12=='t') ) {
                                    alt4=4;
                                }
                                else if ( (LA4_12=='a') ) {
                                    alt4=5;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 12, input);

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
                break;
            case 'r':
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5=='u') ) {
                    int LA4_7 = input.LA(3);

                    if ( (LA4_7=='n') ) {
                        int LA4_9 = input.LA(4);

                        if ( (LA4_9=='_') ) {
                            int LA4_11 = input.LA(5);

                            if ( (LA4_11=='t') ) {
                                alt4=6;
                            }
                            else if ( (LA4_11=='a') ) {
                                alt4=7;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 11, input);

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
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:146:15: 'jump'
                    {
                    match("jump"); 



                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:146:24: 'crouch'
                    {
                    match("crouch"); 



                    }
                    break;
                case 3 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:146:35: 'stand'
                    {
                    match("stand"); 



                    }
                    break;
                case 4 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:146:43: 'walk_towards'
                    {
                    match("walk_towards"); 



                    }
                    break;
                case 5 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:146:60: 'walk_away'
                    {
                    match("walk_away"); 



                    }
                    break;
                case 6 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:146:74: 'run_towards'
                    {
                    match("run_towards"); 



                    }
                    break;
                case 7 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:146:90: 'run_away'
                    {
                    match("run_away"); 



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
    // $ANTLR end "MOVE_ACTION"

    // $ANTLR start "FIGHT_ACTION"
    public final void mFIGHT_ACTION() throws RecognitionException {
        try {
            int _type = FIGHT_ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:147:13: ( ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' ) )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:147:15: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:147:15: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 'b':
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='l') ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4=='o') ) {
                        int LA5_7 = input.LA(4);

                        if ( (LA5_7=='c') ) {
                            int LA5_10 = input.LA(5);

                            if ( (LA5_10=='k') ) {
                                int LA5_13 = input.LA(6);

                                if ( (LA5_13=='_') ) {
                                    int LA5_16 = input.LA(7);

                                    if ( (LA5_16=='l') ) {
                                        alt5=1;
                                    }
                                    else if ( (LA5_16=='h') ) {
                                        alt5=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 16, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 13, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 7, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'p':
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='u') ) {
                    int LA5_5 = input.LA(3);

                    if ( (LA5_5=='n') ) {
                        int LA5_8 = input.LA(4);

                        if ( (LA5_8=='c') ) {
                            int LA5_11 = input.LA(5);

                            if ( (LA5_11=='h') ) {
                                int LA5_14 = input.LA(6);

                                if ( (LA5_14=='_') ) {
                                    int LA5_17 = input.LA(7);

                                    if ( (LA5_17=='l') ) {
                                        alt5=3;
                                    }
                                    else if ( (LA5_17=='h') ) {
                                        alt5=4;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 17, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 14, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 11, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'k':
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3=='i') ) {
                    int LA5_6 = input.LA(3);

                    if ( (LA5_6=='c') ) {
                        int LA5_9 = input.LA(4);

                        if ( (LA5_9=='k') ) {
                            int LA5_12 = input.LA(5);

                            if ( (LA5_12=='_') ) {
                                int LA5_15 = input.LA(6);

                                if ( (LA5_15=='l') ) {
                                    alt5=5;
                                }
                                else if ( (LA5_15=='h') ) {
                                    alt5=6;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 15, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 12, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:147:16: 'block_low'
                    {
                    match("block_low"); 



                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:147:30: 'block_high'
                    {
                    match("block_high"); 



                    }
                    break;
                case 3 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:147:45: 'punch_low'
                    {
                    match("punch_low"); 



                    }
                    break;
                case 4 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:147:59: 'punch_high'
                    {
                    match("punch_high"); 



                    }
                    break;
                case 5 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:147:74: 'kick_low'
                    {
                    match("kick_low"); 



                    }
                    break;
                case 6 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:147:87: 'kick_high'
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
    // $ANTLR end "FIGHT_ACTION"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:148:7: ( 'choose' )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:148:9: 'choose'
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

    // $ANTLR start "L_BRACKET"
    public final void mL_BRACKET() throws RecognitionException {
        try {
            int _type = L_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:149:11: ( '[' )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:149:13: '['
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
    // $ANTLR end "L_BRACKET"

    // $ANTLR start "R_BRACKET"
    public final void mR_BRACKET() throws RecognitionException {
        try {
            int _type = R_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:150:11: ( ']' )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:150:13: ']'
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
    // $ANTLR end "R_BRACKET"

    // $ANTLR start "L_CURLY"
    public final void mL_CURLY() throws RecognitionException {
        try {
            int _type = L_CURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:151:9: ( '{' )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:151:11: '{'
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
    // $ANTLR end "L_CURLY"

    // $ANTLR start "R_CURLY"
    public final void mR_CURLY() throws RecognitionException {
        try {
            int _type = R_CURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:152:9: ( '}' )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:152:11: '}'
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
    // $ANTLR end "R_CURLY"

    // $ANTLR start "L_PAR"
    public final void mL_PAR() throws RecognitionException {
        try {
            int _type = L_PAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:153:7: ( '(' )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:153:9: '('
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
    // $ANTLR end "L_PAR"

    // $ANTLR start "R_PAR"
    public final void mR_PAR() throws RecognitionException {
        try {
            int _type = R_PAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:154:7: ( ')' )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:154:9: ')'
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
    // $ANTLR end "R_PAR"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:155:8: ( ( '0' .. '9' )* )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:155:10: ( '0' .. '9' )*
            {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:155:10: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:
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
    // $ANTLR end "NUMBER"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:156:5: ( 'and' | 'AND' | '&&' | ',' )
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
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:156:7: 'and'
                    {
                    match("and"); 



                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:156:13: 'AND'
                    {
                    match("AND"); 



                    }
                    break;
                case 3 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:156:21: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 4 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:156:28: ','
                    {
                    match(','); 

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
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:157:4: ( 'or' | 'OR' | '||' | '|' )
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
                    alt8=4;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:157:6: 'or'
                    {
                    match("or"); 



                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:157:12: 'OR'
                    {
                    match("OR"); 



                    }
                    break;
                case 3 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:157:19: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 4 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:157:26: '|'
                    {
                    match('|'); 

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
    // $ANTLR end "OR"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:158:3: ( '=' )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:158:5: '='
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:159:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:159:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:159:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||(LA9_0 >= '\f' && LA9_0 <= '\r')||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:
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
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:8: ( ID | CHARACTERISTIC | CONDITION_TYPE | MOVE_ACTION | FIGHT_ACTION | CHOOSE | L_BRACKET | R_BRACKET | L_CURLY | R_CURLY | L_PAR | R_PAR | NUMBER | AND | OR | EQ | WS )
        int alt10=17;
        switch ( input.LA(1) ) {
        case 'A':
            {
            int LA10_1 = input.LA(2);

            if ( (LA10_1=='N') ) {
                int LA10_24 = input.LA(3);

                if ( (LA10_24=='D') ) {
                    alt10=1;
                }
                else {
                    alt10=1;
                }
            }
            else {
                alt10=1;
            }
            }
            break;
        case 'p':
            {
            int LA10_2 = input.LA(2);

            if ( (LA10_2=='u') ) {
                int LA10_25 = input.LA(3);

                if ( (LA10_25=='n') ) {
                    int LA10_31 = input.LA(4);

                    if ( (LA10_31=='c') ) {
                        int LA10_33 = input.LA(5);

                        if ( (LA10_33=='h') ) {
                            int LA10_35 = input.LA(6);

                            if ( (LA10_35=='P'||LA10_35=='R') ) {
                                alt10=2;
                            }
                            else if ( (LA10_35=='_') ) {
                                alt10=5;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 35, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 33, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 31, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 25, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 2, input);

                throw nvae;

            }
            }
            break;
        case 'k':
            {
            int LA10_3 = input.LA(2);

            if ( (LA10_3=='i') ) {
                int LA10_26 = input.LA(3);

                if ( (LA10_26=='c') ) {
                    int LA10_32 = input.LA(4);

                    if ( (LA10_32=='k') ) {
                        int LA10_34 = input.LA(5);

                        if ( (LA10_34=='P'||LA10_34=='R') ) {
                            alt10=2;
                        }
                        else if ( (LA10_34=='_') ) {
                            alt10=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 34, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 32, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 26, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 3, input);

                throw nvae;

            }
            }
            break;
        case 'a':
            {
            int LA10_4 = input.LA(2);

            if ( (LA10_4=='l') ) {
                alt10=3;
            }
            else if ( (LA10_4=='n') ) {
                alt10=14;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 4, input);

                throw nvae;

            }
            }
            break;
        case 'e':
        case 'f':
        case 'm':
        case 'n':
            {
            alt10=3;
            }
            break;
        case 's':
            {
            int LA10_6 = input.LA(2);

            if ( (LA10_6=='t') ) {
                int LA10_27 = input.LA(3);

                if ( (LA10_27=='r') ) {
                    alt10=3;
                }
                else if ( (LA10_27=='a') ) {
                    alt10=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 27, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 6, input);

                throw nvae;

            }
            }
            break;
        case 'w':
            {
            int LA10_7 = input.LA(2);

            if ( (LA10_7=='e') ) {
                alt10=3;
            }
            else if ( (LA10_7=='a') ) {
                alt10=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 7, input);

                throw nvae;

            }
            }
            break;
        case 'j':
        case 'r':
            {
            alt10=4;
            }
            break;
        case 'c':
            {
            int LA10_9 = input.LA(2);

            if ( (LA10_9=='r') ) {
                alt10=4;
            }
            else if ( (LA10_9=='h') ) {
                alt10=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 9, input);

                throw nvae;

            }
            }
            break;
        case 'b':
            {
            alt10=5;
            }
            break;
        case '[':
            {
            alt10=7;
            }
            break;
        case ']':
            {
            alt10=8;
            }
            break;
        case '{':
            {
            alt10=9;
            }
            break;
        case '}':
            {
            alt10=10;
            }
            break;
        case '(':
            {
            alt10=11;
            }
            break;
        case ')':
            {
            alt10=12;
            }
            break;
        case 'O':
            {
            int LA10_18 = input.LA(2);

            if ( (LA10_18=='R') ) {
                alt10=1;
            }
            else {
                alt10=1;
            }
            }
            break;
        case '&':
        case ',':
            {
            alt10=14;
            }
            break;
        case 'o':
        case '|':
            {
            alt10=15;
            }
            break;
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt10=1;
            }
            break;
        case '=':
            {
            alt10=16;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt10=17;
            }
            break;
        default:
            alt10=13;
        }

        switch (alt10) {
            case 1 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:10: ID
                {
                mID(); 


                }
                break;
            case 2 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:13: CHARACTERISTIC
                {
                mCHARACTERISTIC(); 


                }
                break;
            case 3 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:28: CONDITION_TYPE
                {
                mCONDITION_TYPE(); 


                }
                break;
            case 4 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:43: MOVE_ACTION
                {
                mMOVE_ACTION(); 


                }
                break;
            case 5 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:55: FIGHT_ACTION
                {
                mFIGHT_ACTION(); 


                }
                break;
            case 6 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:68: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 7 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:75: L_BRACKET
                {
                mL_BRACKET(); 


                }
                break;
            case 8 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:85: R_BRACKET
                {
                mR_BRACKET(); 


                }
                break;
            case 9 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:95: L_CURLY
                {
                mL_CURLY(); 


                }
                break;
            case 10 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:103: R_CURLY
                {
                mR_CURLY(); 


                }
                break;
            case 11 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:111: L_PAR
                {
                mL_PAR(); 


                }
                break;
            case 12 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:117: R_PAR
                {
                mR_PAR(); 


                }
                break;
            case 13 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:123: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 14 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:130: AND
                {
                mAND(); 


                }
                break;
            case 15 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:134: OR
                {
                mOR(); 


                }
                break;
            case 16 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:137: EQ
                {
                mEQ(); 


                }
                break;
            case 17 :
                // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:1:140: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}