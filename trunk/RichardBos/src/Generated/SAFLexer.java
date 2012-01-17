// $ANTLR 3.4 C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g 2012-01-17 12:08:59

  package Generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int CHOOSE=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int NEWLINE=7;
    public static final int WS=8;

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

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:6:6: ( '(' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:6:8: '('
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:78:7: ( 'choose' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:78:9: 'choose'
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
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:80:7: ( ( '\\r' )? '\\n' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:80:8: ( '\\r' )? '\\n'
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:80:8: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:80:8: '\\r'
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
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:81:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:81:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:81:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:82:7: ( ( '0' .. '9' )+ )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:82:11: ( '0' .. '9' )+
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:82:11: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:83:7: ( ( ' ' | '\\t' )+ )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:83:11: ( ' ' | '\\t' )+
            {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:83:11: ( ' ' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
        // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | CHOOSE | NEWLINE | ID | INT | WS )
        int alt5=14;
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
        case 'a':
            {
            int LA5_6 = input.LA(2);

            if ( (LA5_6=='n') ) {
                int LA5_15 = input.LA(3);

                if ( (LA5_15=='d') ) {
                    int LA5_18 = input.LA(4);

                    if ( ((LA5_18 >= 'A' && LA5_18 <= 'Z')||LA5_18=='_'||(LA5_18 >= 'a' && LA5_18 <= 'z')) ) {
                        alt5=12;
                    }
                    else {
                        alt5=6;
                    }
                }
                else {
                    alt5=12;
                }
            }
            else {
                alt5=12;
            }
            }
            break;
        case 'o':
            {
            int LA5_7 = input.LA(2);

            if ( (LA5_7=='r') ) {
                int LA5_16 = input.LA(3);

                if ( ((LA5_16 >= 'A' && LA5_16 <= 'Z')||LA5_16=='_'||(LA5_16 >= 'a' && LA5_16 <= 'z')) ) {
                    alt5=12;
                }
                else {
                    alt5=7;
                }
            }
            else {
                alt5=12;
            }
            }
            break;
        case '{':
            {
            alt5=8;
            }
            break;
        case '}':
            {
            alt5=9;
            }
            break;
        case 'c':
            {
            int LA5_10 = input.LA(2);

            if ( (LA5_10=='h') ) {
                int LA5_17 = input.LA(3);

                if ( (LA5_17=='o') ) {
                    int LA5_20 = input.LA(4);

                    if ( (LA5_20=='o') ) {
                        int LA5_22 = input.LA(5);

                        if ( (LA5_22=='s') ) {
                            int LA5_23 = input.LA(6);

                            if ( (LA5_23=='e') ) {
                                int LA5_24 = input.LA(7);

                                if ( ((LA5_24 >= 'A' && LA5_24 <= 'Z')||LA5_24=='_'||(LA5_24 >= 'a' && LA5_24 <= 'z')) ) {
                                    alt5=12;
                                }
                                else {
                                    alt5=10;
                                }
                            }
                            else {
                                alt5=12;
                            }
                        }
                        else {
                            alt5=12;
                        }
                    }
                    else {
                        alt5=12;
                    }
                }
                else {
                    alt5=12;
                }
            }
            else {
                alt5=12;
            }
            }
            break;
        case '\n':
        case '\r':
            {
            alt5=11;
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
            alt5=12;
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
            alt5=13;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:63: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 11 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:70: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 12 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:78: ID
                {
                mID(); 


                }
                break;
            case 13 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:81: INT
                {
                mINT(); 


                }
                break;
            case 14 :
                // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:1:85: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}