// $ANTLR 3.4 C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g 2012-01-16 11:54:36

  package Generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int CHARACTERISTIC=4;
    public static final int CHOOSE=5;
    public static final int ConditionType=6;
    public static final int FightActionType=7;
    public static final int ID=8;
    public static final int INT=9;
    public static final int MoveActionType=10;
    public static final int NEWLINE=11;
    public static final int WS=12;

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
    public String getGrammarFileName() { return "C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:6:7: ( '(' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:6:9: '('
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:7:7: ( ')' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:7:9: ')'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:8:7: ( '=' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:8:9: '='
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:9:7: ( '[' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:9:9: '['
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:10:7: ( ']' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:10:9: ']'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:11:7: ( 'and' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:11:9: 'and'
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:12:7: ( 'or' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:12:9: 'or'
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:13:7: ( '{' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:13:9: '{'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:14:7: ( '}' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:14:9: '}'
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
    // $ANTLR end "T__21"

    // $ANTLR start "CHARACTERISTIC"
    public final void mCHARACTERISTIC() throws RecognitionException {
        try {
            int _type = CHARACTERISTIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:41:7: ( ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' ) )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:41:9: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:41:9: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='p') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='u') ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3=='n') ) {
                        int LA1_5 = input.LA(4);

                        if ( (LA1_5=='c') ) {
                            int LA1_7 = input.LA(5);

                            if ( (LA1_7=='h') ) {
                                int LA1_9 = input.LA(6);

                                if ( (LA1_9=='R') ) {
                                    alt1=1;
                                }
                                else if ( (LA1_9=='P') ) {
                                    alt1=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 9, input);

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
            else if ( (LA1_0=='k') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='i') ) {
                    int LA1_4 = input.LA(3);

                    if ( (LA1_4=='c') ) {
                        int LA1_6 = input.LA(4);

                        if ( (LA1_6=='k') ) {
                            int LA1_8 = input.LA(5);

                            if ( (LA1_8=='R') ) {
                                alt1=3;
                            }
                            else if ( (LA1_8=='P') ) {
                                alt1=4;
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
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:41:10: 'punchReach'
                    {
                    match("punchReach"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:42:10: 'punchPower'
                    {
                    match("punchPower"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:43:10: 'kickReach'
                    {
                    match("kickReach"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:44:10: 'kickPower'
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

    // $ANTLR start "MoveActionType"
    public final void mMoveActionType() throws RecognitionException {
        try {
            int _type = MoveActionType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:7: ( ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' ) )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:9: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:9: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
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
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:11: 'walk_towards'
                    {
                    match("walk_towards"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:48:11: 'walk_away'
                    {
                    match("walk_away"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:49:11: 'run_towards'
                    {
                    match("run_towards"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:50:11: 'run_away'
                    {
                    match("run_away"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:51:11: 'jump'
                    {
                    match("jump"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:52:11: 'crouch'
                    {
                    match("crouch"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:53:11: 'stand'
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
    // $ANTLR end "MoveActionType"

    // $ANTLR start "FightActionType"
    public final void mFightActionType() throws RecognitionException {
        try {
            int _type = FightActionType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:56:7: ( ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' ) )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:56:9: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:56:9: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 'b':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='l') ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4=='o') ) {
                        int LA3_7 = input.LA(4);

                        if ( (LA3_7=='c') ) {
                            int LA3_10 = input.LA(5);

                            if ( (LA3_10=='k') ) {
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
            case 'p':
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='u') ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5=='n') ) {
                        int LA3_8 = input.LA(4);

                        if ( (LA3_8=='c') ) {
                            int LA3_11 = input.LA(5);

                            if ( (LA3_11=='h') ) {
                                int LA3_14 = input.LA(6);

                                if ( (LA3_14=='_') ) {
                                    int LA3_17 = input.LA(7);

                                    if ( (LA3_17=='l') ) {
                                        alt3=3;
                                    }
                                    else if ( (LA3_17=='h') ) {
                                        alt3=4;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 17, input);

                                        throw nvae;

                                    }
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
            case 'k':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='i') ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6=='c') ) {
                        int LA3_9 = input.LA(4);

                        if ( (LA3_9=='k') ) {
                            int LA3_12 = input.LA(5);

                            if ( (LA3_12=='_') ) {
                                int LA3_15 = input.LA(6);

                                if ( (LA3_15=='l') ) {
                                    alt3=5;
                                }
                                else if ( (LA3_15=='h') ) {
                                    alt3=6;
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
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:56:11: 'block_low'
                    {
                    match("block_low"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:57:11: 'block_high'
                    {
                    match("block_high"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:58:11: 'punch_low'
                    {
                    match("punch_low"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:59:11: 'punch_high'
                    {
                    match("punch_high"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:60:11: 'kick_low'
                    {
                    match("kick_low"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:61:11: 'kick_high'
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
    // $ANTLR end "FightActionType"

    // $ANTLR start "ConditionType"
    public final void mConditionType() throws RecognitionException {
        try {
            int _type = ConditionType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:64:7: ( ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' ) )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:64:9: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:64:9: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt4=1;
                }
                break;
            case 'n':
                {
                alt4=2;
                }
                break;
            case 'f':
                {
                alt4=3;
                }
                break;
            case 'm':
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4=='u') ) {
                    int LA4_8 = input.LA(3);

                    if ( (LA4_8=='c') ) {
                        int LA4_9 = input.LA(4);

                        if ( (LA4_9=='h') ) {
                            int LA4_10 = input.LA(5);

                            if ( (LA4_10=='_') ) {
                                int LA4_11 = input.LA(6);

                                if ( (LA4_11=='s') ) {
                                    alt4=4;
                                }
                                else if ( (LA4_11=='w') ) {
                                    alt4=8;
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
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;

                }
                }
                break;
            case 's':
                {
                alt4=5;
                }
                break;
            case 'e':
                {
                alt4=6;
                }
                break;
            case 'w':
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:64:11: 'always'
                    {
                    match("always"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:65:11: 'near'
                    {
                    match("near"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:66:11: 'far'
                    {
                    match("far"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:67:11: 'much_stronger'
                    {
                    match("much_stronger"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:68:11: 'stronger'
                    {
                    match("stronger"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:69:11: 'even'
                    {
                    match("even"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:70:11: 'weaker'
                    {
                    match("weaker"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:71:11: 'much_weaker'
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
    // $ANTLR end "ConditionType"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:73:7: ( 'choose' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:73:9: 'choose'
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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:75:7: ( ( '\\r' )? '\\n' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:75:8: ( '\\r' )? '\\n'
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:75:8: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:75:8: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:7: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:77:7: ( ( '0' .. '9' )+ )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:77:11: ( '0' .. '9' )+
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:77:11: ( '0' .. '9' )+
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
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:
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
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:78:7: ( ( ' ' | '\\t' )+ )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:78:11: ( ' ' | '\\t' )+
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:78:11: ( ' ' | '\\t' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\t'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | CHARACTERISTIC | MoveActionType | FightActionType | ConditionType | CHOOSE | NEWLINE | ID | INT | WS )
        int alt9=18;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:10: T__13
                {
                mT__13(); 


                }
                break;
            case 2 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:16: T__14
                {
                mT__14(); 


                }
                break;
            case 3 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:22: T__15
                {
                mT__15(); 


                }
                break;
            case 4 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:28: T__16
                {
                mT__16(); 


                }
                break;
            case 5 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:34: T__17
                {
                mT__17(); 


                }
                break;
            case 6 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:40: T__18
                {
                mT__18(); 


                }
                break;
            case 7 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:46: T__19
                {
                mT__19(); 


                }
                break;
            case 8 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:52: T__20
                {
                mT__20(); 


                }
                break;
            case 9 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:58: T__21
                {
                mT__21(); 


                }
                break;
            case 10 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:64: CHARACTERISTIC
                {
                mCHARACTERISTIC(); 


                }
                break;
            case 11 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:79: MoveActionType
                {
                mMoveActionType(); 


                }
                break;
            case 12 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:94: FightActionType
                {
                mFightActionType(); 


                }
                break;
            case 13 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:110: ConditionType
                {
                mConditionType(); 


                }
                break;
            case 14 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:124: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 15 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:131: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 16 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:139: ID
                {
                mID(); 


                }
                break;
            case 17 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:142: INT
                {
                mINT(); 


                }
                break;
            case 18 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:146: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\6\uffff\2\27\2\uffff\14\27\4\uffff\2\27\1\55\16\27\1\75\1\27\1"+
        "\uffff\14\27\1\113\2\27\1\uffff\5\27\1\uffff\1\103\5\27\1\113\1"+
        "\uffff\1\27\1\113\4\27\1\uffff\3\27\1\103\2\27\1\113\4\27\1\113"+
        "\1\103\1\146\5\27\1\uffff\5\27\1\113\2\27\4\163\1\uffff";
    static final String DFA9_eofS =
        "\164\uffff";
    static final String DFA9_minS =
        "\1\11\5\uffff\1\154\1\162\2\uffff\1\165\1\151\1\141\2\165\1\150"+
        "\1\164\1\154\1\145\1\141\1\165\1\166\4\uffff\1\144\1\167\1\101\1"+
        "\156\1\143\1\154\1\141\1\156\1\155\2\157\1\141\1\157\1\141\1\162"+
        "\1\143\1\145\1\101\1\141\1\uffff\1\143\3\153\1\137\1\160\1\165\1"+
        "\157\1\156\1\157\1\143\1\162\1\101\1\150\1\156\1\uffff\1\171\1\150"+
        "\1\120\1\137\1\145\1\uffff\1\101\1\143\1\163\1\144\1\156\1\153\1"+
        "\101\1\uffff\1\137\1\101\1\163\1\120\1\145\1\157\1\uffff\1\162\1"+
        "\150\1\145\1\101\1\147\1\137\1\101\1\145\1\157\1\141\1\167\3\101"+
        "\1\145\1\141\1\167\1\143\1\145\1\uffff\1\162\1\143\1\145\1\150\1"+
        "\162\1\101\1\150\1\162\4\101\1\uffff";
    static final String DFA9_maxS =
        "\1\175\5\uffff\1\156\1\162\2\uffff\1\165\1\151\1\145\2\165\1\162"+
        "\1\164\1\154\1\145\1\141\1\165\1\166\4\uffff\1\144\1\167\1\172\1"+
        "\156\1\143\1\154\1\141\1\156\1\155\2\157\1\162\1\157\1\141\1\162"+
        "\1\143\1\145\1\172\1\141\1\uffff\1\143\3\153\1\137\1\160\1\165\1"+
        "\157\1\156\1\157\1\143\1\162\1\172\1\150\1\156\1\uffff\1\171\1\150"+
        "\2\137\1\145\1\uffff\1\172\1\143\1\163\1\144\1\156\1\153\1\172\1"+
        "\uffff\1\137\1\172\1\163\1\137\1\145\1\157\1\uffff\1\162\1\150\1"+
        "\145\1\172\1\147\1\137\1\172\1\145\1\157\1\141\1\167\3\172\1\145"+
        "\1\141\1\167\1\143\1\145\1\uffff\1\162\1\143\1\145\1\150\1\162\1"+
        "\172\1\150\1\162\4\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\10\1\11\14\uffff\1\17\1\20"+
        "\1\21\1\22\23\uffff\1\7\17\uffff\1\6\5\uffff\1\13\7\uffff\1\15\6"+
        "\uffff\1\14\23\uffff\1\16\14\uffff\1\12";
    static final String DFA9_specialS =
        "\164\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\31\1\26\2\uffff\1\26\22\uffff\1\31\7\uffff\1\1\1\2\6\uffff"+
            "\12\30\3\uffff\1\3\3\uffff\32\27\1\4\1\uffff\1\5\3\uffff\1\6"+
            "\1\21\1\17\1\27\1\25\1\23\3\27\1\16\1\13\1\27\1\24\1\22\1\7"+
            "\1\12\1\27\1\15\1\20\3\27\1\14\3\27\1\10\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\33\1\uffff\1\32",
            "\1\34",
            "",
            "",
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
            "",
            "",
            "\1\53",
            "\1\54",
            "\32\27\6\uffff\32\27",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\20\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\32\27\6\uffff\32\27",
            "\1\76",
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
            "\32\27\6\uffff\32\27",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\121\1\uffff\1\120\14\uffff\1\122",
            "\1\103",
            "\1\123",
            "",
            "\32\27\6\uffff\32\27",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\32\27\6\uffff\32\27",
            "",
            "\1\113",
            "\32\27\6\uffff\32\27",
            "\1\131",
            "\1\133\1\uffff\1\132\14\uffff\1\122",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\32\27\6\uffff\32\27",
            "\1\141",
            "\1\122",
            "\32\27\6\uffff\32\27",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\32\27\6\uffff\32\27",
            "\1\161",
            "\1\162",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | CHARACTERISTIC | MoveActionType | FightActionType | ConditionType | CHOOSE | NEWLINE | ID | INT | WS );";
        }
    }
 

}