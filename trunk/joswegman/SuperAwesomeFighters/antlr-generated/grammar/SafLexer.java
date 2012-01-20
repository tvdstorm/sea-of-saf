// $ANTLR 3.4 /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g 2012-01-20 21:59:03

  package grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SafLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int COMMENT=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int WS=7;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SafLexer() {} 
    public SafLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SafLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:11:6: ( '(' )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:11:8: '('
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:12:6: ( ')' )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:12:8: ')'
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:13:7: ( '=' )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:13:9: '='
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:14:7: ( '[' )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:14:9: '['
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:15:7: ( ']' )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:15:9: ']'
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:16:7: ( 'choose' )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:16:9: 'choose'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:17:7: ( '{' )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:17:9: '{'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:18:7: ( '}' )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:18:9: '}'
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
    // $ANTLR end "T__15"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:47:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:47:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:47:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:50:7: ( ( '0' .. '9' )+ )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:50:9: ( '0' .. '9' )+
            {
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:50:9: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:
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
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:54:7: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:54:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:54:18: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
                    	    break loop3;
                        }
                    } while (true);


                    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:54:32: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:54:32: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:55:13: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:55:18: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:55:46: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

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
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:58:7: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:58:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:58:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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

    public void mTokens() throws RecognitionException {
        // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | ID | INT | COMMENT | WS )
        int alt8=12;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt8=1;
            }
            break;
        case ')':
            {
            alt8=2;
            }
            break;
        case '=':
            {
            alt8=3;
            }
            break;
        case '[':
            {
            alt8=4;
            }
            break;
        case ']':
            {
            alt8=5;
            }
            break;
        case 'c':
            {
            int LA8_6 = input.LA(2);

            if ( (LA8_6=='h') ) {
                int LA8_13 = input.LA(3);

                if ( (LA8_13=='o') ) {
                    int LA8_14 = input.LA(4);

                    if ( (LA8_14=='o') ) {
                        int LA8_15 = input.LA(5);

                        if ( (LA8_15=='s') ) {
                            int LA8_16 = input.LA(6);

                            if ( (LA8_16=='e') ) {
                                int LA8_17 = input.LA(7);

                                if ( ((LA8_17 >= '0' && LA8_17 <= '9')||(LA8_17 >= 'A' && LA8_17 <= 'Z')||LA8_17=='_'||(LA8_17 >= 'a' && LA8_17 <= 'z')) ) {
                                    alt8=9;
                                }
                                else {
                                    alt8=6;
                                }
                            }
                            else {
                                alt8=9;
                            }
                        }
                        else {
                            alt8=9;
                        }
                    }
                    else {
                        alt8=9;
                    }
                }
                else {
                    alt8=9;
                }
            }
            else {
                alt8=9;
            }
            }
            break;
        case '{':
            {
            alt8=7;
            }
            break;
        case '}':
            {
            alt8=8;
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
        case 'a':
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
        case 'o':
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
            alt8=9;
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
            alt8=10;
            }
            break;
        case '/':
            {
            alt8=11;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt8=12;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 8, 0, input);

            throw nvae;

        }

        switch (alt8) {
            case 1 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:38: T__13
                {
                mT__13(); 


                }
                break;
            case 7 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:44: T__14
                {
                mT__14(); 


                }
                break;
            case 8 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:50: T__15
                {
                mT__15(); 


                }
                break;
            case 9 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:56: ID
                {
                mID(); 


                }
                break;
            case 10 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:59: INT
                {
                mINT(); 


                }
                break;
            case 11 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:63: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 12 :
                // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:1:71: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}