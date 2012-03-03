// $ANTLR 3.4 D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g 2012-03-03 19:38:10

  package Parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class safLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int BEHAVIOUR=5;
    public static final int BETWEEN=6;
    public static final int CHARACTERISTIC=7;
    public static final int CHOOSE=8;
    public static final int CONDITION_TYPE=9;
    public static final int DIGIT=10;
    public static final int EQ=11;
    public static final int FIGHT_ACTION=12;
    public static final int ID=13;
    public static final int L_BRACKET=14;
    public static final int L_CURLY=15;
    public static final int L_PAR=16;
    public static final int MOVE_ACTION=17;
    public static final int OR=18;
    public static final int PROGRAM=19;
    public static final int R_BRACKET=20;
    public static final int R_CURLY=21;
    public static final int R_PAR=22;
    public static final int WS=23;

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
    public String getGrammarFileName() { return "D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g"; }

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:125:4: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:125:6: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:125:16: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:
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
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:126:15: ( ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' ) )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:126:17: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )
            {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:126:17: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )
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
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:126:18: 'punchReach'
                    {
                    match("punchReach"); 



                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:126:33: 'punchPower'
                    {
                    match("punchPower"); 



                    }
                    break;
                case 3 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:126:48: 'kickReach'
                    {
                    match("kickReach"); 



                    }
                    break;
                case 4 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:126:62: 'kickPower'
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

    // $ANTLR start "MOVE_ACTION"
    public final void mMOVE_ACTION() throws RecognitionException {
        try {
            int _type = MOVE_ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:127:12: ( ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' ) )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:127:14: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:127:14: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 'w':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='a') ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6=='l') ) {
                        int LA3_8 = input.LA(4);

                        if ( (LA3_8=='k') ) {
                            int LA3_10 = input.LA(5);

                            if ( (LA3_10=='_') ) {
                                int LA3_12 = input.LA(6);

                                if ( (LA3_12=='t') ) {
                                    alt3=1;
                                }
                                else if ( (LA3_12=='a') ) {
                                    alt3=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 12, input);

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
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'r':
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='u') ) {
                    int LA3_7 = input.LA(3);

                    if ( (LA3_7=='n') ) {
                        int LA3_9 = input.LA(4);

                        if ( (LA3_9=='_') ) {
                            int LA3_11 = input.LA(5);

                            if ( (LA3_11=='t') ) {
                                alt3=3;
                            }
                            else if ( (LA3_11=='a') ) {
                                alt3=4;
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
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'j':
                {
                alt3=5;
                }
                break;
            case 'c':
                {
                alt3=6;
                }
                break;
            case 's':
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
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:127:15: 'walk_towards'
                    {
                    match("walk_towards"); 



                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:127:32: 'walk_away'
                    {
                    match("walk_away"); 



                    }
                    break;
                case 3 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:127:46: 'run_towards'
                    {
                    match("run_towards"); 



                    }
                    break;
                case 4 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:127:62: 'run_away'
                    {
                    match("run_away"); 



                    }
                    break;
                case 5 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:127:75: 'jump'
                    {
                    match("jump"); 



                    }
                    break;
                case 6 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:127:84: 'crouch'
                    {
                    match("crouch"); 



                    }
                    break;
                case 7 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:127:95: 'stand'
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
    // $ANTLR end "MOVE_ACTION"

    // $ANTLR start "FIGHT_ACTION"
    public final void mFIGHT_ACTION() throws RecognitionException {
        try {
            int _type = FIGHT_ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:128:13: ( ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' ) )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:128:15: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:128:15: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 'b':
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='l') ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4=='o') ) {
                        int LA4_7 = input.LA(4);

                        if ( (LA4_7=='c') ) {
                            int LA4_10 = input.LA(5);

                            if ( (LA4_10=='k') ) {
                                int LA4_13 = input.LA(6);

                                if ( (LA4_13=='_') ) {
                                    int LA4_16 = input.LA(7);

                                    if ( (LA4_16=='l') ) {
                                        alt4=1;
                                    }
                                    else if ( (LA4_16=='h') ) {
                                        alt4=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 4, 16, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 13, input);

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
                                new NoViableAltException("", 4, 7, input);

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
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'p':
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='u') ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5=='n') ) {
                        int LA4_8 = input.LA(4);

                        if ( (LA4_8=='c') ) {
                            int LA4_11 = input.LA(5);

                            if ( (LA4_11=='h') ) {
                                int LA4_14 = input.LA(6);

                                if ( (LA4_14=='_') ) {
                                    int LA4_17 = input.LA(7);

                                    if ( (LA4_17=='l') ) {
                                        alt4=3;
                                    }
                                    else if ( (LA4_17=='h') ) {
                                        alt4=4;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 4, 17, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 14, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 11, input);

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
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'k':
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3=='i') ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6=='c') ) {
                        int LA4_9 = input.LA(4);

                        if ( (LA4_9=='k') ) {
                            int LA4_12 = input.LA(5);

                            if ( (LA4_12=='_') ) {
                                int LA4_15 = input.LA(6);

                                if ( (LA4_15=='l') ) {
                                    alt4=5;
                                }
                                else if ( (LA4_15=='h') ) {
                                    alt4=6;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 15, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 12, input);

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
                            new NoViableAltException("", 4, 6, input);

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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:128:16: 'block_low'
                    {
                    match("block_low"); 



                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:128:30: 'block_high'
                    {
                    match("block_high"); 



                    }
                    break;
                case 3 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:128:45: 'punch_low'
                    {
                    match("punch_low"); 



                    }
                    break;
                case 4 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:128:59: 'punch_high'
                    {
                    match("punch_high"); 



                    }
                    break;
                case 5 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:128:74: 'kick_low'
                    {
                    match("kick_low"); 



                    }
                    break;
                case 6 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:128:87: 'kick_high'
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

    // $ANTLR start "CONDITION_TYPE"
    public final void mCONDITION_TYPE() throws RecognitionException {
        try {
            int _type = CONDITION_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:129:16: ( ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' ) )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:129:18: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:129:18: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt5=1;
                }
                break;
            case 'n':
                {
                alt5=2;
                }
                break;
            case 'f':
                {
                alt5=3;
                }
                break;
            case 'm':
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4=='u') ) {
                    int LA5_8 = input.LA(3);

                    if ( (LA5_8=='c') ) {
                        int LA5_9 = input.LA(4);

                        if ( (LA5_9=='h') ) {
                            int LA5_10 = input.LA(5);

                            if ( (LA5_10=='_') ) {
                                int LA5_11 = input.LA(6);

                                if ( (LA5_11=='s') ) {
                                    alt5=4;
                                }
                                else if ( (LA5_11=='w') ) {
                                    alt5=8;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 11, input);

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
                                new NoViableAltException("", 5, 9, input);

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
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;

                }
                }
                break;
            case 's':
                {
                alt5=5;
                }
                break;
            case 'e':
                {
                alt5=6;
                }
                break;
            case 'w':
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:129:19: 'always'
                    {
                    match("always"); 



                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:129:30: 'near'
                    {
                    match("near"); 



                    }
                    break;
                case 3 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:129:39: 'far'
                    {
                    match("far"); 



                    }
                    break;
                case 4 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:129:47: 'much_stronger'
                    {
                    match("much_stronger"); 



                    }
                    break;
                case 5 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:129:65: 'stronger'
                    {
                    match("stronger"); 



                    }
                    break;
                case 6 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:129:78: 'even'
                    {
                    match("even"); 



                    }
                    break;
                case 7 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:129:87: 'weaker'
                    {
                    match("weaker"); 



                    }
                    break;
                case 8 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:129:98: 'much_weaker'
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

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:130:7: ( 'choose' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:130:9: 'choose'
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
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:131:11: ( '[' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:131:13: '['
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
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:132:11: ( ']' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:132:13: ']'
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
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:133:9: ( '{' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:133:11: '{'
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
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:134:9: ( '}' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:134:11: '}'
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
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:135:7: ( '(' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:135:9: '('
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
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:136:7: ( ')' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:136:9: ')'
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:137:7: ( '0' .. '9' | '10' )
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
            else if ( (LA6_0=='0'||(LA6_0 >= '2' && LA6_0 <= '9')) ) {
                alt6=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:137:9: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:137:20: '10'
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

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:138:5: ( 'and' | 'AND' | '&&' | ',' )
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
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:138:7: 'and'
                    {
                    match("and"); 



                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:138:13: 'AND'
                    {
                    match("AND"); 



                    }
                    break;
                case 3 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:138:21: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 4 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:138:28: ','
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
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:139:4: ( 'or' | 'OR' | '||' | '|' )
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
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:139:6: 'or'
                    {
                    match("or"); 



                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:139:12: 'OR'
                    {
                    match("OR"); 



                    }
                    break;
                case 3 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:139:19: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 4 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:139:26: '|'
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
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:140:3: ( '=' )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:140:5: '='
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
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:141:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:141:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:141:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
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
            	    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:
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
        // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:8: ( ID | CHARACTERISTIC | MOVE_ACTION | FIGHT_ACTION | CONDITION_TYPE | CHOOSE | L_BRACKET | R_BRACKET | L_CURLY | R_CURLY | L_PAR | R_PAR | DIGIT | AND | OR | EQ | WS )
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
                                alt10=4;
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
                            alt10=4;
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
        case 'w':
            {
            int LA10_4 = input.LA(2);

            if ( (LA10_4=='a') ) {
                alt10=3;
            }
            else if ( (LA10_4=='e') ) {
                alt10=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 4, input);

                throw nvae;

            }
            }
            break;
        case 'j':
        case 'r':
            {
            alt10=3;
            }
            break;
        case 'c':
            {
            int LA10_6 = input.LA(2);

            if ( (LA10_6=='r') ) {
                alt10=3;
            }
            else if ( (LA10_6=='h') ) {
                alt10=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 6, input);

                throw nvae;

            }
            }
            break;
        case 's':
            {
            int LA10_7 = input.LA(2);

            if ( (LA10_7=='t') ) {
                int LA10_28 = input.LA(3);

                if ( (LA10_28=='a') ) {
                    alt10=3;
                }
                else if ( (LA10_28=='r') ) {
                    alt10=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 28, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 7, input);

                throw nvae;

            }
            }
            break;
        case 'b':
            {
            alt10=4;
            }
            break;
        case 'a':
            {
            int LA10_9 = input.LA(2);

            if ( (LA10_9=='l') ) {
                alt10=5;
            }
            else if ( (LA10_9=='n') ) {
                alt10=14;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 9, input);

                throw nvae;

            }
            }
            break;
        case 'e':
        case 'f':
        case 'm':
        case 'n':
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
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt10=13;
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
            NoViableAltException nvae =
                new NoViableAltException("", 10, 0, input);

            throw nvae;

        }

        switch (alt10) {
            case 1 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:10: ID
                {
                mID(); 


                }
                break;
            case 2 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:13: CHARACTERISTIC
                {
                mCHARACTERISTIC(); 


                }
                break;
            case 3 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:28: MOVE_ACTION
                {
                mMOVE_ACTION(); 


                }
                break;
            case 4 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:40: FIGHT_ACTION
                {
                mFIGHT_ACTION(); 


                }
                break;
            case 5 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:53: CONDITION_TYPE
                {
                mCONDITION_TYPE(); 


                }
                break;
            case 6 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:68: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 7 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:75: L_BRACKET
                {
                mL_BRACKET(); 


                }
                break;
            case 8 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:85: R_BRACKET
                {
                mR_BRACKET(); 


                }
                break;
            case 9 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:95: L_CURLY
                {
                mL_CURLY(); 


                }
                break;
            case 10 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:103: R_CURLY
                {
                mR_CURLY(); 


                }
                break;
            case 11 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:111: L_PAR
                {
                mL_PAR(); 


                }
                break;
            case 12 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:117: R_PAR
                {
                mR_PAR(); 


                }
                break;
            case 13 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:123: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 14 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:129: AND
                {
                mAND(); 


                }
                break;
            case 15 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:133: OR
                {
                mOR(); 


                }
                break;
            case 16 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:136: EQ
                {
                mEQ(); 


                }
                break;
            case 17 :
                // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:1:139: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}