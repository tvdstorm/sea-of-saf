// $ANTLR 3.4 C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g 2012-01-21 22:52:48

  package nl.uva.saf.fdl;
  import nl.uva.saf.fdl.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int ALWAYS=4;
    public static final int AND=5;
    public static final int ASSIGN=6;
    public static final int CHOOSE=7;
    public static final int CONDITIONTYPE=8;
    public static final int FIGHTACTION=9;
    public static final int IDENT=10;
    public static final int MOVEACTION=11;
    public static final int OR=12;
    public static final int VALUE=13;
    public static final int WS=14;

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

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:12:7: ( '(' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:12:9: '('
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:13:7: ( ')' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:13:9: ')'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:16:7: ( '{' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:16:9: '{'
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:17:7: ( '}' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:17:9: '}'
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
    // $ANTLR end "T__20"

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

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:38:7: ( ( '1' .. '9' ) | '10' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='1') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='0') ) {
                    alt2=2;
                }
                else {
                    alt2=1;
                }
            }
            else if ( ((LA2_0 >= '2' && LA2_0 <= '9')) ) {
                alt2=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:38:9: ( '1' .. '9' )
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:38:22: '10'
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
    // $ANTLR end "VALUE"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:8: ( 'choose' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:10: 'choose'
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

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:5: ( 'and' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:7: 'and'
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

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:41:4: ( 'or' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:41:6: 'or'
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

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:42:8: ( '=' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:42:10: '='
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

    // $ANTLR start "ALWAYS"
    public final void mALWAYS() throws RecognitionException {
        try {
            int _type = ALWAYS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:43:8: ( 'always' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:43:10: 'always'
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

    // $ANTLR start "CONDITIONTYPE"
    public final void mCONDITIONTYPE() throws RecognitionException {
        try {
            int _type = CONDITIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:45:15: ( 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt3=1;
                }
                break;
            case 'f':
                {
                alt3=2;
                }
                break;
            case 'm':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='u') ) {
                    int LA3_7 = input.LA(3);

                    if ( (LA3_7=='c') ) {
                        int LA3_8 = input.LA(4);

                        if ( (LA3_8=='h') ) {
                            int LA3_9 = input.LA(5);

                            if ( (LA3_9=='_') ) {
                                int LA3_10 = input.LA(6);

                                if ( (LA3_10=='s') ) {
                                    alt3=3;
                                }
                                else if ( (LA3_10=='w') ) {
                                    alt3=7;
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
                            new NoViableAltException("", 3, 7, input);

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
            case 's':
                {
                alt3=4;
                }
                break;
            case 'e':
                {
                alt3=5;
                }
                break;
            case 'w':
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:45:17: 'near'
                    {
                    match("near"); 



                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:46:17: 'far'
                    {
                    match("far"); 



                    }
                    break;
                case 3 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:47:17: 'much_stronger'
                    {
                    match("much_stronger"); 



                    }
                    break;
                case 4 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:48:17: 'stronger'
                    {
                    match("stronger"); 



                    }
                    break;
                case 5 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:49:17: 'even'
                    {
                    match("even"); 



                    }
                    break;
                case 6 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:50:17: 'weaker'
                    {
                    match("weaker"); 



                    }
                    break;
                case 7 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:51:17: 'much_weaker'
                    {
                    match("much_weaker"); 



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
    // $ANTLR end "CONDITIONTYPE"

    // $ANTLR start "MOVEACTION"
    public final void mMOVEACTION() throws RecognitionException {
        try {
            int _type = MOVEACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:54:12: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 'w':
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='a') ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6=='l') ) {
                        int LA4_8 = input.LA(4);

                        if ( (LA4_8=='k') ) {
                            int LA4_10 = input.LA(5);

                            if ( (LA4_10=='_') ) {
                                int LA4_12 = input.LA(6);

                                if ( (LA4_12=='t') ) {
                                    alt4=1;
                                }
                                else if ( (LA4_12=='a') ) {
                                    alt4=2;
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
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'r':
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='u') ) {
                    int LA4_7 = input.LA(3);

                    if ( (LA4_7=='n') ) {
                        int LA4_9 = input.LA(4);

                        if ( (LA4_9=='_') ) {
                            int LA4_11 = input.LA(5);

                            if ( (LA4_11=='t') ) {
                                alt4=3;
                            }
                            else if ( (LA4_11=='a') ) {
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
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'j':
                {
                alt4=5;
                }
                break;
            case 'c':
                {
                alt4=6;
                }
                break;
            case 's':
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
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:54:14: 'walk_towards'
                    {
                    match("walk_towards"); 



                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:55:14: 'walk_away'
                    {
                    match("walk_away"); 



                    }
                    break;
                case 3 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:56:14: 'run_towards'
                    {
                    match("run_towards"); 



                    }
                    break;
                case 4 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:57:14: 'run_away'
                    {
                    match("run_away"); 



                    }
                    break;
                case 5 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:58:14: 'jump'
                    {
                    match("jump"); 



                    }
                    break;
                case 6 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:59:14: 'crouch'
                    {
                    match("crouch"); 



                    }
                    break;
                case 7 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:60:14: 'stand'
                    {
                    match("stand"); 



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
    // $ANTLR end "MOVEACTION"

    // $ANTLR start "FIGHTACTION"
    public final void mFIGHTACTION() throws RecognitionException {
        try {
            int _type = FIGHTACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:63:13: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
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
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:63:15: 'block_low'
                    {
                    match("block_low"); 



                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:64:15: 'block_high'
                    {
                    match("block_high"); 



                    }
                    break;
                case 3 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:65:15: 'punch_low'
                    {
                    match("punch_low"); 



                    }
                    break;
                case 4 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:66:15: 'punch_high'
                    {
                    match("punch_high"); 



                    }
                    break;
                case 5 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:67:15: 'kick_low'
                    {
                    match("kick_low"); 



                    }
                    break;
                case 6 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:68:15: 'kick_high'
                    {
                    match("kick_high"); 



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
    // $ANTLR end "FIGHTACTION"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:71:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:71:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:71:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
    // $ANTLR end "IDENT"

    public void mTokens() throws RecognitionException {
        // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | WS | VALUE | CHOOSE | AND | OR | ASSIGN | ALWAYS | CONDITIONTYPE | MOVEACTION | FIGHTACTION | IDENT )
        int alt7=17;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:10: T__15
                {
                mT__15(); 


                }
                break;
            case 2 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:16: T__16
                {
                mT__16(); 


                }
                break;
            case 3 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:22: T__17
                {
                mT__17(); 


                }
                break;
            case 4 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:28: T__18
                {
                mT__18(); 


                }
                break;
            case 5 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:34: T__19
                {
                mT__19(); 


                }
                break;
            case 6 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:40: T__20
                {
                mT__20(); 


                }
                break;
            case 7 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:46: WS
                {
                mWS(); 


                }
                break;
            case 8 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:49: VALUE
                {
                mVALUE(); 


                }
                break;
            case 9 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:55: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 10 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:62: AND
                {
                mAND(); 


                }
                break;
            case 11 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:66: OR
                {
                mOR(); 


                }
                break;
            case 12 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:69: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 13 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:76: ALWAYS
                {
                mALWAYS(); 


                }
                break;
            case 14 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:83: CONDITIONTYPE
                {
                mCONDITIONTYPE(); 


                }
                break;
            case 15 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:97: MOVEACTION
                {
                mMOVEACTION(); 


                }
                break;
            case 16 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:108: FIGHTACTION
                {
                mFIGHTACTION(); 


                }
                break;
            case 17 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:120: IDENT
                {
                mIDENT(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\11\uffff\3\30\1\uffff\13\30\1\uffff\4\30\1\56\16\30\1\76\1\30\1"+
        "\uffff\1\30\1\101\15\30\1\uffff\1\30\1\101\1\uffff\3\30\1\101\3"+
        "\30\1\127\10\30\1\127\4\30\1\uffff\3\30\1\152\1\127\1\153\3\30\1"+
        "\101\10\30\2\uffff\17\30\1\101\3\30\1\127\4\30\1\u008f\4\30\1\127"+
        "\1\30\1\u008f\1\30\1\u008f\1\30\1\uffff\1\u008f\4\30\2\u008f\1\30"+
        "\1\101\1\30\1\127\1\30\1\127\1\101";
    static final String DFA7_eofS =
        "\u009e\uffff";
    static final String DFA7_minS =
        "\1\11\10\uffff\1\150\1\154\1\162\1\uffff\1\145\1\141\1\165\1\164"+
        "\1\166\1\141\2\165\1\154\1\165\1\151\1\uffff\2\157\1\144\1\167\1"+
        "\60\1\141\1\162\1\143\1\141\1\145\1\141\1\154\1\156\1\155\1\157"+
        "\1\156\1\143\1\157\1\165\1\60\1\141\1\uffff\1\162\1\60\1\150\1\157"+
        "\2\156\2\153\1\137\1\160\2\143\1\153\1\163\1\143\1\uffff\1\171\1"+
        "\60\1\uffff\1\137\1\156\1\144\1\60\1\145\1\137\1\141\1\60\1\153"+
        "\1\150\1\137\1\145\1\150\2\163\1\147\1\60\1\162\1\141\1\157\1\167"+
        "\1\uffff\2\137\1\150\3\60\1\164\2\145\1\60\1\157\2\167\1\141\2\150"+
        "\1\157\1\151\2\uffff\1\162\1\141\1\162\1\167\2\141\1\171\1\157\1"+
        "\151\1\157\1\151\1\167\1\147\1\157\1\153\1\60\1\141\1\171\1\162"+
        "\1\60\1\167\1\147\1\167\1\147\1\60\1\150\1\156\1\145\1\162\1\60"+
        "\1\144\1\60\1\150\1\60\1\150\1\uffff\1\60\1\147\1\162\1\144\1\163"+
        "\2\60\1\145\1\60\1\163\1\60\1\162\2\60";
    static final String DFA7_maxS =
        "\1\175\10\uffff\1\162\1\156\1\162\1\uffff\1\145\1\141\1\165\1\164"+
        "\1\166\1\145\2\165\1\154\1\165\1\151\1\uffff\2\157\1\144\1\167\1"+
        "\172\1\141\1\162\1\143\1\162\1\145\1\141\1\154\1\156\1\155\1\157"+
        "\1\156\1\143\1\157\1\165\1\172\1\141\1\uffff\1\162\1\172\1\150\1"+
        "\157\2\156\2\153\1\137\1\160\2\143\1\153\1\163\1\143\1\uffff\1\171"+
        "\1\172\1\uffff\1\137\1\156\1\144\1\172\1\145\1\137\1\164\1\172\1"+
        "\153\1\150\1\137\1\145\1\150\1\163\1\167\1\147\1\172\1\162\1\164"+
        "\1\157\1\167\1\uffff\2\137\1\154\3\172\1\164\2\145\1\172\1\157\2"+
        "\167\1\141\2\154\1\157\1\151\2\uffff\1\162\1\141\1\162\1\167\2\141"+
        "\1\171\1\157\1\151\1\157\1\151\1\167\1\147\1\157\1\153\1\172\1\141"+
        "\1\171\1\162\1\172\1\167\1\147\1\167\1\147\1\172\1\150\1\156\1\145"+
        "\1\162\1\172\1\144\1\172\1\150\1\172\1\150\1\uffff\1\172\1\147\1"+
        "\162\1\144\1\163\2\172\1\145\1\172\1\163\1\172\1\162\2\172";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\14\13\uffff"+
        "\1\21\25\uffff\1\13\17\uffff\1\12\2\uffff\1\16\25\uffff\1\17\22"+
        "\uffff\1\11\1\15\43\uffff\1\20\16\uffff";
    static final String DFA7_specialS =
        "\u009e\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\7\1\uffff\2\7\22\uffff\1\7\7\uffff\1\1\1\2\7\uffff\11\10"+
            "\3\uffff\1\14\3\uffff\32\30\1\3\1\uffff\1\4\1\uffff\1\30\1\uffff"+
            "\1\12\1\25\1\11\1\30\1\21\1\16\3\30\1\24\1\27\1\30\1\17\1\15"+
            "\1\13\1\26\1\30\1\23\1\20\3\30\1\22\3\30\1\5\1\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\11\uffff\1\32",
            "\1\34\1\uffff\1\33",
            "\1\35",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\44\3\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\63\20\uffff\1\62",
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
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\77",
            "",
            "\1\100",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
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
            "\1\116",
            "",
            "\1\117",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\123",
            "\1\124",
            "\1\126\22\uffff\1\125",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136\3\uffff\1\137",
            "\1\140",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\141",
            "\1\143\22\uffff\1\142",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\151\3\uffff\1\150",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\164\3\uffff\1\163",
            "\1\166\3\uffff\1\165",
            "\1\167",
            "\1\170",
            "",
            "",
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
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0094",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0095",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0096",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u009b",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u009c",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u009d",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | WS | VALUE | CHOOSE | AND | OR | ASSIGN | ALWAYS | CONDITIONTYPE | MOVEACTION | FIGHTACTION | IDENT );";
        }
    }
 

}