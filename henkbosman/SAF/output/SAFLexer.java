// $ANTLR 3.4 C:\\Antlr\\SAF\\SAF.g 2012-02-02 21:30:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int CHOOSE=4;
    public static final int INT=5;
    public static final int NAME=6;
    public static final int NEWLINE=7;
    public static final int OPERATOR=8;
    public static final int WS=9;

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

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:7:7: ( '(' )
            // C:\\Antlr\\SAF\\SAF.g:7:9: '('
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:8:7: ( ')' )
            // C:\\Antlr\\SAF\\SAF.g:8:9: ')'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:9:7: ( '=' )
            // C:\\Antlr\\SAF\\SAF.g:9:9: '='
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:10:7: ( '[' )
            // C:\\Antlr\\SAF\\SAF.g:10:9: '['
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:11:7: ( ']' )
            // C:\\Antlr\\SAF\\SAF.g:11:9: ']'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:12:7: ( '{' )
            // C:\\Antlr\\SAF\\SAF.g:12:9: '{'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:13:7: ( '}' )
            // C:\\Antlr\\SAF\\SAF.g:13:9: '}'
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
    // $ANTLR end "T__16"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:6:8: ( ( '0' .. '9' )+ )
            // C:\\Antlr\\SAF\\SAF.g:6:10: ( '0' .. '9' )+
            {
            // C:\\Antlr\\SAF\\SAF.g:6:10: ( '0' .. '9' )+
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
            	    // C:\\Antlr\\SAF\\SAF.g:
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
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:7:7: ( ( ' ' | '\\t' ) )
            // C:\\Antlr\\SAF\\SAF.g:7:9: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
    // $ANTLR end "WS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:8:10: ( ( '\\n' | '\\r' )+ )
            // C:\\Antlr\\SAF\\SAF.g:8:12: ( '\\n' | '\\r' )+
            {
            // C:\\Antlr\\SAF\\SAF.g:8:12: ( '\\n' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n'||LA2_0=='\r') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
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
    // $ANTLR end "NEWLINE"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:9:10: ( ( 'and' | 'or' ) )
            // C:\\Antlr\\SAF\\SAF.g:9:12: ( 'and' | 'or' )
            {
            // C:\\Antlr\\SAF\\SAF.g:9:12: ( 'and' | 'or' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='a') ) {
                alt3=1;
            }
            else if ( (LA3_0=='o') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:9:13: 'and'
                    {
                    match("and"); 



                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:9:21: 'or'
                    {
                    match("or"); 



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
    // $ANTLR end "OPERATOR"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:10:9: ( ( 'choose' ) )
            // C:\\Antlr\\SAF\\SAF.g:10:11: ( 'choose' )
            {
            // C:\\Antlr\\SAF\\SAF.g:10:11: ( 'choose' )
            // C:\\Antlr\\SAF\\SAF.g:10:12: 'choose'
            {
            match("choose"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHOOSE"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Antlr\\SAF\\SAF.g:11:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Antlr\\SAF\\SAF.g:11:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Antlr\\SAF\\SAF.g:11:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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

    public void mTokens() throws RecognitionException {
        // C:\\Antlr\\SAF\\SAF.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | INT | WS | NEWLINE | OPERATOR | CHOOSE | NAME )
        int alt5=13;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt5=1;
            }
            break;
        case ')':
            {
            alt5=2;
            }
            break;
        case '=':
            {
            alt5=3;
            }
            break;
        case '[':
            {
            alt5=4;
            }
            break;
        case ']':
            {
            alt5=5;
            }
            break;
        case '{':
            {
            alt5=6;
            }
            break;
        case '}':
            {
            alt5=7;
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
            alt5=8;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=9;
            }
            break;
        case '\n':
        case '\r':
            {
            alt5=10;
            }
            break;
        case 'a':
            {
            int LA5_11 = input.LA(2);

            if ( (LA5_11=='n') ) {
                int LA5_15 = input.LA(3);

                if ( (LA5_15=='d') ) {
                    int LA5_18 = input.LA(4);

                    if ( ((LA5_18 >= '0' && LA5_18 <= '9')||(LA5_18 >= 'A' && LA5_18 <= 'Z')||LA5_18=='_'||(LA5_18 >= 'a' && LA5_18 <= 'z')) ) {
                        alt5=13;
                    }
                    else {
                        alt5=11;
                    }
                }
                else {
                    alt5=13;
                }
            }
            else {
                alt5=13;
            }
            }
            break;
        case 'o':
            {
            int LA5_12 = input.LA(2);

            if ( (LA5_12=='r') ) {
                int LA5_16 = input.LA(3);

                if ( ((LA5_16 >= '0' && LA5_16 <= '9')||(LA5_16 >= 'A' && LA5_16 <= 'Z')||LA5_16=='_'||(LA5_16 >= 'a' && LA5_16 <= 'z')) ) {
                    alt5=13;
                }
                else {
                    alt5=11;
                }
            }
            else {
                alt5=13;
            }
            }
            break;
        case 'c':
            {
            int LA5_13 = input.LA(2);

            if ( (LA5_13=='h') ) {
                int LA5_17 = input.LA(3);

                if ( (LA5_17=='o') ) {
                    int LA5_20 = input.LA(4);

                    if ( (LA5_20=='o') ) {
                        int LA5_21 = input.LA(5);

                        if ( (LA5_21=='s') ) {
                            int LA5_22 = input.LA(6);

                            if ( (LA5_22=='e') ) {
                                int LA5_23 = input.LA(7);

                                if ( ((LA5_23 >= '0' && LA5_23 <= '9')||(LA5_23 >= 'A' && LA5_23 <= 'Z')||LA5_23=='_'||(LA5_23 >= 'a' && LA5_23 <= 'z')) ) {
                                    alt5=13;
                                }
                                else {
                                    alt5=12;
                                }
                            }
                            else {
                                alt5=13;
                            }
                        }
                        else {
                            alt5=13;
                        }
                    }
                    else {
                        alt5=13;
                    }
                }
                else {
                    alt5=13;
                }
            }
            else {
                alt5=13;
            }
            }
            break;
        case 'A':
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
        case 'O':
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
        case '_':
        case 'b':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=13;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // C:\\Antlr\\SAF\\SAF.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // C:\\Antlr\\SAF\\SAF.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // C:\\Antlr\\SAF\\SAF.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // C:\\Antlr\\SAF\\SAF.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // C:\\Antlr\\SAF\\SAF.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // C:\\Antlr\\SAF\\SAF.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // C:\\Antlr\\SAF\\SAF.g:1:46: T__16
                {
                mT__16(); 


                }
                break;
            case 8 :
                // C:\\Antlr\\SAF\\SAF.g:1:52: INT
                {
                mINT(); 


                }
                break;
            case 9 :
                // C:\\Antlr\\SAF\\SAF.g:1:56: WS
                {
                mWS(); 


                }
                break;
            case 10 :
                // C:\\Antlr\\SAF\\SAF.g:1:59: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 11 :
                // C:\\Antlr\\SAF\\SAF.g:1:67: OPERATOR
                {
                mOPERATOR(); 


                }
                break;
            case 12 :
                // C:\\Antlr\\SAF\\SAF.g:1:76: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 13 :
                // C:\\Antlr\\SAF\\SAF.g:1:83: NAME
                {
                mNAME(); 


                }
                break;

        }

    }


 

}