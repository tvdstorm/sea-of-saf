// $ANTLR 3.4 D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g 2012-01-30 18:02:45

package grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class graLexer extends Lexer {
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
    public static final int T__18=18;
    public static final int COMMENT=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int NEWLINE=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public graLexer() {} 
    public graLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public graLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:11:6: ( '(' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:11:8: '('
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
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:12:7: ( ')' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:12:9: ')'
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
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:13:7: ( '=' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:13:9: '='
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
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:14:7: ( '[' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:14:9: '['
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
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:15:7: ( ']' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:15:9: ']'
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
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:16:7: ( 'and' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:16:9: 'and'
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
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:17:7: ( 'choose' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:17:9: 'choose'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:18:7: ( 'or' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:18:9: 'or'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:19:7: ( '{' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:19:9: '{'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:20:7: ( '}' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:20:9: '}'
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
    // $ANTLR end "T__18"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:58:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:58:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:58:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:
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
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:61:7: ( '1' .. '9' | '10' )
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
                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:61:9: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:61:18: '10'
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:65:7: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:65:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:65:18: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:
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


                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:65:32: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:65:32: '\\r'
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
                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:66:13: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:66:18: ( options {greedy=false; } : . )*
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
                    	    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:66:46: .
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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:70:7: ( ( '\\r' | '\\n' ) )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:70:9: ( '\\r' | '\\n' )
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
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
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:75:7: ( ( ' ' | NEWLINE | '\\t' )+ )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:76:7: ( ' ' | NEWLINE | '\\t' )+
            {
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:76:7: ( ' ' | NEWLINE | '\\t' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt7=1;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt7=2;
                    }
                    break;
                case '\t':
                    {
                    alt7=3;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:76:9: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:77:9: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;
            	case 3 :
            	    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:78:9: '\\t'
            	    {
            	    match('\t'); 

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
        // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | ID | INT | COMMENT | NEWLINE | WS )
        int alt8=15;
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
        case 'a':
            {
            int LA8_6 = input.LA(2);

            if ( (LA8_6=='n') ) {
                int LA8_16 = input.LA(3);

                if ( (LA8_16=='d') ) {
                    int LA8_20 = input.LA(4);

                    if ( ((LA8_20 >= '0' && LA8_20 <= '9')||(LA8_20 >= 'A' && LA8_20 <= 'Z')||LA8_20=='_'||(LA8_20 >= 'a' && LA8_20 <= 'z')) ) {
                        alt8=11;
                    }
                    else {
                        alt8=6;
                    }
                }
                else {
                    alt8=11;
                }
            }
            else {
                alt8=11;
            }
            }
            break;
        case 'c':
            {
            int LA8_7 = input.LA(2);

            if ( (LA8_7=='h') ) {
                int LA8_17 = input.LA(3);

                if ( (LA8_17=='o') ) {
                    int LA8_21 = input.LA(4);

                    if ( (LA8_21=='o') ) {
                        int LA8_24 = input.LA(5);

                        if ( (LA8_24=='s') ) {
                            int LA8_25 = input.LA(6);

                            if ( (LA8_25=='e') ) {
                                int LA8_26 = input.LA(7);

                                if ( ((LA8_26 >= '0' && LA8_26 <= '9')||(LA8_26 >= 'A' && LA8_26 <= 'Z')||LA8_26=='_'||(LA8_26 >= 'a' && LA8_26 <= 'z')) ) {
                                    alt8=11;
                                }
                                else {
                                    alt8=7;
                                }
                            }
                            else {
                                alt8=11;
                            }
                        }
                        else {
                            alt8=11;
                        }
                    }
                    else {
                        alt8=11;
                    }
                }
                else {
                    alt8=11;
                }
            }
            else {
                alt8=11;
            }
            }
            break;
        case 'o':
            {
            int LA8_8 = input.LA(2);

            if ( (LA8_8=='r') ) {
                int LA8_18 = input.LA(3);

                if ( ((LA8_18 >= '0' && LA8_18 <= '9')||(LA8_18 >= 'A' && LA8_18 <= 'Z')||LA8_18=='_'||(LA8_18 >= 'a' && LA8_18 <= 'z')) ) {
                    alt8=11;
                }
                else {
                    alt8=8;
                }
            }
            else {
                alt8=11;
            }
            }
            break;
        case '{':
            {
            alt8=9;
            }
            break;
        case '}':
            {
            alt8=10;
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
            alt8=11;
            }
            break;
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
            alt8=12;
            }
            break;
        case '/':
            {
            alt8=13;
            }
            break;
        case '\n':
        case '\r':
            {
            int LA8_14 = input.LA(2);

            if ( ((LA8_14 >= '\t' && LA8_14 <= '\n')||LA8_14=='\r'||LA8_14==' ') ) {
                alt8=15;
            }
            else {
                alt8=14;
            }
            }
            break;
        case '\t':
        case ' ':
            {
            alt8=15;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 8, 0, input);

            throw nvae;

        }

        switch (alt8) {
            case 1 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:69: ID
                {
                mID(); 


                }
                break;
            case 12 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:72: INT
                {
                mINT(); 


                }
                break;
            case 13 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:76: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 14 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:84: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 15 :
                // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:1:92: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}