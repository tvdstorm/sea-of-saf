// $ANTLR 3.4 C:\\Antlr\\SAF\\SAF.g 2012-01-22 01:25:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int ACTION=4;
    public static final int CONDITION=5;
    public static final int CURLYCLOSE=6;
    public static final int CURLYOPEN=7;
    public static final int INT=8;
    public static final int IS=9;
    public static final int MOVEMENT=10;
    public static final int NAME=11;
    public static final int NEWLINE=12;
    public static final int PARENTHESESCLOSE=13;
    public static final int PARENTHESESOPEN=14;
    public static final int PROPERTY=15;
    public static final int SQUARECLOSE=16;
    public static final int SQUAREOPEN=17;
    public static final int WS=18;

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
    public String getGrammarFileName() { return "C:\\Antlr\\SAF\\SAF.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:7:7: ( 'and' )
            // C:\\Antlr\\SAF\\SAF.g:7:9: 'and'
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:8:7: ( 'choose' )
            // C:\\Antlr\\SAF\\SAF.g:8:9: 'choose'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:9:7: ( 'or' )
            // C:\\Antlr\\SAF\\SAF.g:9:9: 'or'
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
    // $ANTLR end "T__21"

    // $ANTLR start "CONDITION"
    public final void mCONDITION() throws RecognitionException {
        try {
            int _type = CONDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:5:12: ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt1=1;
                }
                break;
            case 'w':
                {
                alt1=2;
                }
                break;
            case 'm':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='u') ) {
                    int LA1_8 = input.LA(3);

                    if ( (LA1_8=='c') ) {
                        int LA1_9 = input.LA(4);

                        if ( (LA1_9=='h') ) {
                            int LA1_10 = input.LA(5);

                            if ( (LA1_10=='_') ) {
                                int LA1_11 = input.LA(6);

                                if ( (LA1_11=='s') ) {
                                    alt1=3;
                                }
                                else if ( (LA1_11=='w') ) {
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
                                    new NoViableAltException("", 1, 10, input);

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
                            new NoViableAltException("", 1, 8, input);

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
            case 'e':
                {
                alt1=5;
                }
                break;
            case 'n':
                {
                alt1=6;
                }
                break;
            case 'f':
                {
                alt1=7;
                }
                break;
            case 'a':
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:5:14: 'stronger'
                    {
                    match("stronger"); 



                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:5:25: 'weaker'
                    {
                    match("weaker"); 



                    }
                    break;
                case 3 :
                    // C:\\Antlr\\SAF\\SAF.g:5:35: 'much_stronger'
                    {
                    match("much_stronger"); 



                    }
                    break;
                case 4 :
                    // C:\\Antlr\\SAF\\SAF.g:5:52: 'much_weaker'
                    {
                    match("much_weaker"); 



                    }
                    break;
                case 5 :
                    // C:\\Antlr\\SAF\\SAF.g:5:67: 'even'
                    {
                    match("even"); 



                    }
                    break;
                case 6 :
                    // C:\\Antlr\\SAF\\SAF.g:5:75: 'near'
                    {
                    match("near"); 



                    }
                    break;
                case 7 :
                    // C:\\Antlr\\SAF\\SAF.g:5:82: 'far'
                    {
                    match("far"); 



                    }
                    break;
                case 8 :
                    // C:\\Antlr\\SAF\\SAF.g:5:89: 'always'
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
    // $ANTLR end "CONDITION"

    // $ANTLR start "MOVEMENT"
    public final void mMOVEMENT() throws RecognitionException {
        try {
            int _type = MOVEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:6:12: ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 'j':
                {
                alt2=1;
                }
                break;
            case 'c':
                {
                alt2=2;
                }
                break;
            case 's':
                {
                alt2=3;
                }
                break;
            case 'r':
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4=='u') ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6=='n') ) {
                        int LA2_8 = input.LA(4);

                        if ( (LA2_8=='_') ) {
                            int LA2_10 = input.LA(5);

                            if ( (LA2_10=='t') ) {
                                alt2=4;
                            }
                            else if ( (LA2_10=='a') ) {
                                alt2=5;
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
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }
                }
                break;
            case 'w':
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5=='a') ) {
                    int LA2_7 = input.LA(3);

                    if ( (LA2_7=='l') ) {
                        int LA2_9 = input.LA(4);

                        if ( (LA2_9=='k') ) {
                            int LA2_11 = input.LA(5);

                            if ( (LA2_11=='_') ) {
                                int LA2_14 = input.LA(6);

                                if ( (LA2_14=='t') ) {
                                    alt2=6;
                                }
                                else if ( (LA2_14=='a') ) {
                                    alt2=7;
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
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:6:14: 'jump'
                    {
                    match("jump"); 



                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:6:22: 'crouch'
                    {
                    match("crouch"); 



                    }
                    break;
                case 3 :
                    // C:\\Antlr\\SAF\\SAF.g:6:32: 'stand'
                    {
                    match("stand"); 



                    }
                    break;
                case 4 :
                    // C:\\Antlr\\SAF\\SAF.g:6:41: 'run_towards'
                    {
                    match("run_towards"); 



                    }
                    break;
                case 5 :
                    // C:\\Antlr\\SAF\\SAF.g:6:56: 'run_away'
                    {
                    match("run_away"); 



                    }
                    break;
                case 6 :
                    // C:\\Antlr\\SAF\\SAF.g:6:68: 'walk_towards'
                    {
                    match("walk_towards"); 



                    }
                    break;
                case 7 :
                    // C:\\Antlr\\SAF\\SAF.g:6:84: 'walk_away'
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
    // $ANTLR end "MOVEMENT"

    // $ANTLR start "ACTION"
    public final void mACTION() throws RecognitionException {
        try {
            int _type = ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:7:12: ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 'p':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='u') ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4=='n') ) {
                        int LA3_7 = input.LA(4);

                        if ( (LA3_7=='c') ) {
                            int LA3_10 = input.LA(5);

                            if ( (LA3_10=='h') ) {
                                int LA3_13 = input.LA(6);

                                if ( (LA3_13=='_') ) {
                                    int LA3_16 = input.LA(7);

                                    if ( (LA3_16=='l') ) {
                                        alt3=1;
                                    }
                                    else if ( (LA3_16=='h') ) {
                                        alt3=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 16, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 13, input);

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
                                new NoViableAltException("", 3, 7, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

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
            case 'k':
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='i') ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5=='c') ) {
                        int LA3_8 = input.LA(4);

                        if ( (LA3_8=='k') ) {
                            int LA3_11 = input.LA(5);

                            if ( (LA3_11=='_') ) {
                                int LA3_14 = input.LA(6);

                                if ( (LA3_14=='l') ) {
                                    alt3=3;
                                }
                                else if ( (LA3_14=='h') ) {
                                    alt3=4;
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
                                new NoViableAltException("", 3, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

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
            case 'b':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='l') ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6=='o') ) {
                        int LA3_9 = input.LA(4);

                        if ( (LA3_9=='c') ) {
                            int LA3_12 = input.LA(5);

                            if ( (LA3_12=='k') ) {
                                int LA3_15 = input.LA(6);

                                if ( (LA3_15=='_') ) {
                                    int LA3_19 = input.LA(7);

                                    if ( (LA3_19=='l') ) {
                                        alt3=5;
                                    }
                                    else if ( (LA3_19=='h') ) {
                                        alt3=6;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 19, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 15, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 12, input);

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
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

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
                    // C:\\Antlr\\SAF\\SAF.g:7:14: 'punch_low'
                    {
                    match("punch_low"); 



                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:7:27: 'punch_high'
                    {
                    match("punch_high"); 



                    }
                    break;
                case 3 :
                    // C:\\Antlr\\SAF\\SAF.g:7:41: 'kick_low'
                    {
                    match("kick_low"); 



                    }
                    break;
                case 4 :
                    // C:\\Antlr\\SAF\\SAF.g:7:53: 'kick_high'
                    {
                    match("kick_high"); 



                    }
                    break;
                case 5 :
                    // C:\\Antlr\\SAF\\SAF.g:7:66: 'block_low'
                    {
                    match("block_low"); 



                    }
                    break;
                case 6 :
                    // C:\\Antlr\\SAF\\SAF.g:7:79: 'block_high'
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
    // $ANTLR end "ACTION"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:8:8: ( '1' .. '9' | '10' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='1') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='0') ) {
                    alt4=2;
                }
                else {
                    alt4=1;
                }
            }
            else if ( ((LA4_0 >= '2' && LA4_0 <= '9')) ) {
                alt4=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:8:10: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:8:21: '10'
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
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:9:7: ( ( ' ' | '\\t' )+ )
            // C:\\Antlr\\SAF\\SAF.g:9:9: ( ' ' | '\\t' )+
            {
            // C:\\Antlr\\SAF\\SAF.g:9:9: ( ' ' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:10:10: ( ( ( WS )* '\\n' | ( WS )* '\\r' )+ )
            // C:\\Antlr\\SAF\\SAF.g:10:12: ( ( WS )* '\\n' | ( WS )* '\\r' )+
            {
            // C:\\Antlr\\SAF\\SAF.g:10:12: ( ( WS )* '\\n' | ( WS )* '\\r' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:10:13: ( WS )* '\\n'
            	    {
            	    // C:\\Antlr\\SAF\\SAF.g:10:13: ( WS )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0=='\t'||LA6_0==' ') ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // C:\\Antlr\\SAF\\SAF.g:10:13: WS
            	    	    {
            	    	    mWS(); 


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    match('\n'); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Antlr\\SAF\\SAF.g:10:23: ( WS )* '\\r'
            	    {
            	    // C:\\Antlr\\SAF\\SAF.g:10:23: ( WS )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0=='\t'||LA7_0==' ') ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // C:\\Antlr\\SAF\\SAF.g:10:23: WS
            	    	    {
            	    	    mWS(); 


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    match('\r'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "PROPERTY"
    public final void mPROPERTY() throws RecognitionException {
        try {
            int _type = PROPERTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:11:10: ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='p') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='u') ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3=='n') ) {
                        int LA9_5 = input.LA(4);

                        if ( (LA9_5=='c') ) {
                            int LA9_7 = input.LA(5);

                            if ( (LA9_7=='h') ) {
                                int LA9_9 = input.LA(6);

                                if ( (LA9_9=='R') ) {
                                    alt9=1;
                                }
                                else if ( (LA9_9=='P') ) {
                                    alt9=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 9, 9, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 7, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0=='k') ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2=='i') ) {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4=='c') ) {
                        int LA9_6 = input.LA(4);

                        if ( (LA9_6=='k') ) {
                            int LA9_8 = input.LA(5);

                            if ( (LA9_8=='R') ) {
                                alt9=2;
                            }
                            else if ( (LA9_8=='P') ) {
                                alt9=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:11:12: 'punchReach'
                    {
                    match("punchReach"); 



                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:11:25: 'kickReach'
                    {
                    match("kickReach"); 



                    }
                    break;
                case 3 :
                    // C:\\Antlr\\SAF\\SAF.g:11:37: 'kickPower'
                    {
                    match("kickPower"); 



                    }
                    break;
                case 4 :
                    // C:\\Antlr\\SAF\\SAF.g:11:49: 'punchPower'
                    {
                    match("punchPower"); 



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
    // $ANTLR end "PROPERTY"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:12:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Antlr\\SAF\\SAF.g:12:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Antlr\\SAF\\SAF.g:12:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:
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
            	    break loop10;
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
    // $ANTLR end "NAME"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:13:5: ( ( ( WS )* '=' ( WS )* ) )
            // C:\\Antlr\\SAF\\SAF.g:13:7: ( ( WS )* '=' ( WS )* )
            {
            // C:\\Antlr\\SAF\\SAF.g:13:7: ( ( WS )* '=' ( WS )* )
            // C:\\Antlr\\SAF\\SAF.g:13:8: ( WS )* '=' ( WS )*
            {
            // C:\\Antlr\\SAF\\SAF.g:13:8: ( WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\t'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:13:8: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match('='); 

            // C:\\Antlr\\SAF\\SAF.g:13:14: ( WS )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\t'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:13:14: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "SQUAREOPEN"
    public final void mSQUAREOPEN() throws RecognitionException {
        try {
            int _type = SQUAREOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:14:12: ( ( ( WS )* '[' ( WS )* ) )
            // C:\\Antlr\\SAF\\SAF.g:14:14: ( ( WS )* '[' ( WS )* )
            {
            // C:\\Antlr\\SAF\\SAF.g:14:14: ( ( WS )* '[' ( WS )* )
            // C:\\Antlr\\SAF\\SAF.g:14:15: ( WS )* '[' ( WS )*
            {
            // C:\\Antlr\\SAF\\SAF.g:14:15: ( WS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\t'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:14:15: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match('['); 

            // C:\\Antlr\\SAF\\SAF.g:14:21: ( WS )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\t'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:14:21: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQUAREOPEN"

    // $ANTLR start "SQUARECLOSE"
    public final void mSQUARECLOSE() throws RecognitionException {
        try {
            int _type = SQUARECLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:15:13: ( ( ( WS )* ']' ( WS )* ) )
            // C:\\Antlr\\SAF\\SAF.g:15:15: ( ( WS )* ']' ( WS )* )
            {
            // C:\\Antlr\\SAF\\SAF.g:15:15: ( ( WS )* ']' ( WS )* )
            // C:\\Antlr\\SAF\\SAF.g:15:16: ( WS )* ']' ( WS )*
            {
            // C:\\Antlr\\SAF\\SAF.g:15:16: ( WS )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\t'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:15:16: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            match(']'); 

            // C:\\Antlr\\SAF\\SAF.g:15:22: ( WS )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\t'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:15:22: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQUARECLOSE"

    // $ANTLR start "CURLYOPEN"
    public final void mCURLYOPEN() throws RecognitionException {
        try {
            int _type = CURLYOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:16:11: ( ( ( WS )* '{' ( WS )* ) )
            // C:\\Antlr\\SAF\\SAF.g:16:13: ( ( WS )* '{' ( WS )* )
            {
            // C:\\Antlr\\SAF\\SAF.g:16:13: ( ( WS )* '{' ( WS )* )
            // C:\\Antlr\\SAF\\SAF.g:16:14: ( WS )* '{' ( WS )*
            {
            // C:\\Antlr\\SAF\\SAF.g:16:14: ( WS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\t'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:16:14: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match('{'); 

            // C:\\Antlr\\SAF\\SAF.g:16:20: ( WS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\t'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:16:20: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CURLYOPEN"

    // $ANTLR start "CURLYCLOSE"
    public final void mCURLYCLOSE() throws RecognitionException {
        try {
            int _type = CURLYCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:17:12: ( ( ( WS )* '}' ( WS )* ) )
            // C:\\Antlr\\SAF\\SAF.g:17:14: ( ( WS )* '}' ( WS )* )
            {
            // C:\\Antlr\\SAF\\SAF.g:17:14: ( ( WS )* '}' ( WS )* )
            // C:\\Antlr\\SAF\\SAF.g:17:15: ( WS )* '}' ( WS )*
            {
            // C:\\Antlr\\SAF\\SAF.g:17:15: ( WS )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\t'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:17:15: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match('}'); 

            // C:\\Antlr\\SAF\\SAF.g:17:21: ( WS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\t'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:17:21: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CURLYCLOSE"

    // $ANTLR start "PARENTHESESOPEN"
    public final void mPARENTHESESOPEN() throws RecognitionException {
        try {
            int _type = PARENTHESESOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:18:17: ( ( ( WS )* '(' ( WS )* ) )
            // C:\\Antlr\\SAF\\SAF.g:18:19: ( ( WS )* '(' ( WS )* )
            {
            // C:\\Antlr\\SAF\\SAF.g:18:19: ( ( WS )* '(' ( WS )* )
            // C:\\Antlr\\SAF\\SAF.g:18:20: ( WS )* '(' ( WS )*
            {
            // C:\\Antlr\\SAF\\SAF.g:18:20: ( WS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\t'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:18:20: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match('('); 

            // C:\\Antlr\\SAF\\SAF.g:18:26: ( WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\t'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:18:26: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARENTHESESOPEN"

    // $ANTLR start "PARENTHESESCLOSE"
    public final void mPARENTHESESCLOSE() throws RecognitionException {
        try {
            int _type = PARENTHESESCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:19:17: ( ( ( WS )* ')' ( WS )* ) )
            // C:\\Antlr\\SAF\\SAF.g:19:19: ( ( WS )* ')' ( WS )* )
            {
            // C:\\Antlr\\SAF\\SAF.g:19:19: ( ( WS )* ')' ( WS )* )
            // C:\\Antlr\\SAF\\SAF.g:19:20: ( WS )* ')' ( WS )*
            {
            // C:\\Antlr\\SAF\\SAF.g:19:20: ( WS )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='\t'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:19:20: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            match(')'); 

            // C:\\Antlr\\SAF\\SAF.g:19:26: ( WS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='\t'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:19:26: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARENTHESESCLOSE"

    public void mTokens() throws RecognitionException {
        // C:\\Antlr\\SAF\\SAF.g:1:8: ( T__19 | T__20 | T__21 | CONDITION | MOVEMENT | ACTION | INT | WS | NEWLINE | PROPERTY | NAME | IS | SQUAREOPEN | SQUARECLOSE | CURLYOPEN | CURLYCLOSE | PARENTHESESOPEN | PARENTHESESCLOSE )
        int alt25=18;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // C:\\Antlr\\SAF\\SAF.g:1:10: T__19
                {
                mT__19(); 


                }
                break;
            case 2 :
                // C:\\Antlr\\SAF\\SAF.g:1:16: T__20
                {
                mT__20(); 


                }
                break;
            case 3 :
                // C:\\Antlr\\SAF\\SAF.g:1:22: T__21
                {
                mT__21(); 


                }
                break;
            case 4 :
                // C:\\Antlr\\SAF\\SAF.g:1:28: CONDITION
                {
                mCONDITION(); 


                }
                break;
            case 5 :
                // C:\\Antlr\\SAF\\SAF.g:1:38: MOVEMENT
                {
                mMOVEMENT(); 


                }
                break;
            case 6 :
                // C:\\Antlr\\SAF\\SAF.g:1:47: ACTION
                {
                mACTION(); 


                }
                break;
            case 7 :
                // C:\\Antlr\\SAF\\SAF.g:1:54: INT
                {
                mINT(); 


                }
                break;
            case 8 :
                // C:\\Antlr\\SAF\\SAF.g:1:58: WS
                {
                mWS(); 


                }
                break;
            case 9 :
                // C:\\Antlr\\SAF\\SAF.g:1:61: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 10 :
                // C:\\Antlr\\SAF\\SAF.g:1:69: PROPERTY
                {
                mPROPERTY(); 


                }
                break;
            case 11 :
                // C:\\Antlr\\SAF\\SAF.g:1:78: NAME
                {
                mNAME(); 


                }
                break;
            case 12 :
                // C:\\Antlr\\SAF\\SAF.g:1:83: IS
                {
                mIS(); 


                }
                break;
            case 13 :
                // C:\\Antlr\\SAF\\SAF.g:1:86: SQUAREOPEN
                {
                mSQUAREOPEN(); 


                }
                break;
            case 14 :
                // C:\\Antlr\\SAF\\SAF.g:1:97: SQUARECLOSE
                {
                mSQUARECLOSE(); 


                }
                break;
            case 15 :
                // C:\\Antlr\\SAF\\SAF.g:1:109: CURLYOPEN
                {
                mCURLYOPEN(); 


                }
                break;
            case 16 :
                // C:\\Antlr\\SAF\\SAF.g:1:119: CURLYCLOSE
                {
                mCURLYCLOSE(); 


                }
                break;
            case 17 :
                // C:\\Antlr\\SAF\\SAF.g:1:130: PARENTHESESOPEN
                {
                mPARENTHESESOPEN(); 


                }
                break;
            case 18 :
                // C:\\Antlr\\SAF\\SAF.g:1:146: PARENTHESESCLOSE
                {
                mPARENTHESESCLOSE(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA8_eotS =
        "\1\1\4\uffff";
    static final String DFA8_eofS =
        "\5\uffff";
    static final String DFA8_minS =
        "\1\11\1\uffff\1\11\2\uffff";
    static final String DFA8_maxS =
        "\1\40\1\uffff\1\40\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\3\2\uffff\1\4\22\uffff\1\2",
            "",
            "\1\2\1\3\2\uffff\1\4\22\uffff\1\2",
            "",
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
            return "()+ loopback of 10:12: ( ( WS )* '\\n' | ( WS )* '\\r' )+";
        }
    }
    static final String DFA25_eotS =
        "\1\uffff\16\22\1\uffff\1\53\11\uffff\4\22\1\60\14\22\1\uffff\1\76"+
        "\3\22\1\uffff\7\22\1\111\5\22\1\uffff\10\22\2\111\1\uffff\1\127"+
        "\10\22\1\127\3\22\1\uffff\7\22\1\111\1\162\1\127\1\22\1\111\16\22"+
        "\1\uffff\21\22\1\111\5\22\1\127\4\22\1\u009e\6\22\1\127\3\22\1\u009e"+
        "\3\22\1\uffff\1\u009e\2\u00ab\1\u009e\5\22\1\u009e\2\u00ab\1\uffff"+
        "\1\u009e\2\22\1\111\2\127\1\22\1\111";
    static final String DFA25_eofS =
        "\u00b4\uffff";
    static final String DFA25_minS =
        "\1\11\1\154\1\150\1\162\1\164\1\141\1\165\1\166\1\145\1\141\3\165"+
        "\1\151\1\154\1\uffff\1\11\11\uffff\1\144\1\167\2\157\1\60\2\141"+
        "\1\154\1\143\1\145\1\141\1\162\1\155\2\156\1\143\1\157\1\uffff\1"+
        "\60\1\141\1\157\1\165\1\uffff\1\157\1\156\2\153\1\150\1\156\1\162"+
        "\1\60\1\160\1\137\1\143\1\153\1\143\1\uffff\1\171\1\163\1\143\1"+
        "\156\1\144\1\145\2\137\2\60\1\uffff\1\60\1\141\1\150\1\120\1\153"+
        "\1\163\1\145\1\150\1\147\1\60\1\162\1\141\1\163\1\uffff\1\157\1"+
        "\167\1\120\1\150\1\145\1\157\1\137\3\60\1\145\1\60\1\157\1\167\1"+
        "\164\1\145\1\167\1\141\1\150\1\145\2\157\1\151\1\141\1\167\1\150"+
        "\1\uffff\1\162\1\167\1\141\1\162\2\141\1\171\1\157\1\151\1\141\2"+
        "\167\1\147\1\143\1\145\1\157\1\151\1\60\1\141\1\171\1\157\1\153"+
        "\1\162\1\60\1\167\1\147\1\143\1\145\1\60\2\150\1\162\1\167\1\147"+
        "\1\162\1\60\1\156\1\145\1\144\1\60\2\150\1\162\1\uffff\4\60\1\150"+
        "\1\144\1\147\1\162\1\163\3\60\1\uffff\1\60\1\163\1\145\3\60\1\162"+
        "\1\60";
    static final String DFA25_maxS =
        "\1\175\1\156\2\162\1\164\1\145\1\165\1\166\1\145\1\141\3\165\1\151"+
        "\1\154\1\uffff\1\175\11\uffff\1\144\1\167\2\157\1\172\1\162\1\141"+
        "\1\154\1\143\1\145\1\141\1\162\1\155\2\156\1\143\1\157\1\uffff\1"+
        "\172\1\141\1\157\1\165\1\uffff\1\157\1\156\2\153\1\150\1\156\1\162"+
        "\1\172\1\160\1\137\1\143\1\153\1\143\1\uffff\1\171\1\163\1\143\1"+
        "\156\1\144\1\145\2\137\2\172\1\uffff\1\172\1\164\1\150\1\137\1\153"+
        "\1\163\1\145\1\150\1\147\1\172\1\162\1\164\1\167\1\uffff\1\157\1"+
        "\167\1\137\1\154\1\145\1\157\1\137\3\172\1\145\1\172\1\157\1\167"+
        "\1\164\1\145\1\167\1\141\1\154\1\145\2\157\1\151\1\141\1\167\1\154"+
        "\1\uffff\1\162\1\167\1\141\1\162\2\141\1\171\1\157\1\151\1\141\2"+
        "\167\1\147\1\143\1\145\1\157\1\151\1\172\1\141\1\171\1\157\1\153"+
        "\1\162\1\172\1\167\1\147\1\143\1\145\1\172\2\150\1\162\1\167\1\147"+
        "\1\162\1\172\1\156\1\145\1\144\1\172\2\150\1\162\1\uffff\4\172\1"+
        "\150\1\144\1\147\1\162\1\163\3\172\1\uffff\1\172\1\163\1\145\3\172"+
        "\1\162\1\172";
    static final String DFA25_acceptS =
        "\17\uffff\1\7\1\uffff\1\11\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1"+
        "\22\21\uffff\1\10\4\uffff\1\3\15\uffff\1\1\12\uffff\1\4\15\uffff"+
        "\1\5\32\uffff\1\2\53\uffff\1\6\14\uffff\1\12\10\uffff";
    static final String DFA25_specialS =
        "\u00b4\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\20\1\21\2\uffff\1\21\22\uffff\1\20\7\uffff\1\30\1\31\7\uffff"+
            "\11\17\3\uffff\1\23\3\uffff\32\22\1\24\1\uffff\1\25\1\uffff"+
            "\1\22\1\uffff\1\1\1\16\1\2\1\22\1\7\1\11\3\22\1\12\1\15\1\22"+
            "\1\6\1\10\1\3\1\14\1\22\1\13\1\4\3\22\1\5\3\22\1\26\1\uffff"+
            "\1\27",
            "\1\33\1\uffff\1\32",
            "\1\34\11\uffff\1\35",
            "\1\36",
            "\1\37",
            "\1\41\3\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "\1\20\1\21\2\uffff\1\21\22\uffff\1\20\7\uffff\1\30\1\31\23"+
            "\uffff\1\23\35\uffff\1\24\1\uffff\1\25\35\uffff\1\26\1\uffff"+
            "\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\62\20\uffff\1\61",
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
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\131\22\uffff\1\130",
            "\1\132",
            "\1\135\1\uffff\1\134\14\uffff\1\133",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\143",
            "\1\145\22\uffff\1\144",
            "\1\146\3\uffff\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\154\1\uffff\1\153\14\uffff\1\152",
            "\1\156\3\uffff\1\155",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\163",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\173\3\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0083\3\uffff\1\u0082",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
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
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\u00b1",
            "\1\u00b2",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\u00b3",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | CONDITION | MOVEMENT | ACTION | INT | WS | NEWLINE | PROPERTY | NAME | IS | SQUAREOPEN | SQUARECLOSE | CURLYOPEN | CURLYCLOSE | PARENTHESESOPEN | PARENTHESESCLOSE );";
        }
    }
 

}