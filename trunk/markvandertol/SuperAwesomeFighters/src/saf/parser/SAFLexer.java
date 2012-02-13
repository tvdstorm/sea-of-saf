// $ANTLR 3.4 C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g 2012-02-13 14:05:43

package saf.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int ANDCONDITION=4;
    public static final int ASSIGNMENT=5;
    public static final int ATTACKS=6;
    public static final int CONDITION=7;
    public static final int DIGIT=8;
    public static final int FIGHTER=9;
    public static final int IDENTIFIER=10;
    public static final int MOVES=11;
    public static final int ORCONDITION=12;
    public static final int RCONDITION=13;
    public static final int RULE=14;
    public static final int WS=15;

    	private List<String> errorList;
    	
    	public void setErrorList(List<String> errorList) {
    		this.errorList = errorList;
    	}
    	
    	@Override
    	public void emitErrorMessage(String msg) {
    		errorList.add("Lexer error: " + msg);
    	}


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
    public String getGrammarFileName() { return "C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:18:7: ( '(' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:18:9: '('
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:19:7: ( ')' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:19:9: ')'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:20:7: ( '=' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:20:9: '='
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:21:7: ( '[' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:21:9: '['
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:22:7: ( ']' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:22:9: ']'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:23:7: ( 'and' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:23:9: 'and'
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:24:7: ( 'or' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:24:9: 'or'
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:25:7: ( '{' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:25:9: '{'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:26:7: ( '}' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:26:9: '}'
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
    // $ANTLR end "T__24"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:82:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:82:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:82:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:
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

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:83:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )+ )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:83:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )+
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:83:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:84:7: ( ( '0' .. '9' )+ )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:84:9: ( '0' .. '9' )+
            {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:84:9: ( '0' .. '9' )+
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
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:
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
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | WS | IDENTIFIER | DIGIT )
        int alt4=12;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt4=1;
            }
            break;
        case ')':
            {
            alt4=2;
            }
            break;
        case '=':
            {
            alt4=3;
            }
            break;
        case '[':
            {
            alt4=4;
            }
            break;
        case ']':
            {
            alt4=5;
            }
            break;
        case 'a':
            {
            int LA4_6 = input.LA(2);

            if ( (LA4_6=='n') ) {
                int LA4_13 = input.LA(3);

                if ( (LA4_13=='d') ) {
                    int LA4_15 = input.LA(4);

                    if ( (LA4_15=='-'||(LA4_15 >= '0' && LA4_15 <= '9')||(LA4_15 >= 'A' && LA4_15 <= 'Z')||LA4_15=='_'||(LA4_15 >= 'a' && LA4_15 <= 'z')) ) {
                        alt4=11;
                    }
                    else {
                        alt4=6;
                    }
                }
                else {
                    alt4=11;
                }
            }
            else if ( (LA4_6=='-'||(LA4_6 >= '0' && LA4_6 <= '9')||(LA4_6 >= 'A' && LA4_6 <= 'Z')||LA4_6=='_'||(LA4_6 >= 'a' && LA4_6 <= 'm')||(LA4_6 >= 'o' && LA4_6 <= 'z')) ) {
                alt4=11;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 6, input);

                throw nvae;

            }
            }
            break;
        case 'o':
            {
            int LA4_7 = input.LA(2);

            if ( (LA4_7=='r') ) {
                int LA4_14 = input.LA(3);

                if ( (LA4_14=='-'||(LA4_14 >= '0' && LA4_14 <= '9')||(LA4_14 >= 'A' && LA4_14 <= 'Z')||LA4_14=='_'||(LA4_14 >= 'a' && LA4_14 <= 'z')) ) {
                    alt4=11;
                }
                else {
                    alt4=7;
                }
            }
            else if ( (LA4_7=='-'||(LA4_7 >= '0' && LA4_7 <= '9')||(LA4_7 >= 'A' && LA4_7 <= 'Z')||LA4_7=='_'||(LA4_7 >= 'a' && LA4_7 <= 'q')||(LA4_7 >= 's' && LA4_7 <= 'z')) ) {
                alt4=11;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 7, input);

                throw nvae;

            }
            }
            break;
        case '{':
            {
            alt4=8;
            }
            break;
        case '}':
            {
            alt4=9;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt4=10;
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
        case 'c':
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
            alt4=11;
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
            alt4=12;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:10: T__16
                {
                mT__16(); 


                }
                break;
            case 2 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:16: T__17
                {
                mT__17(); 


                }
                break;
            case 3 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:22: T__18
                {
                mT__18(); 


                }
                break;
            case 4 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:28: T__19
                {
                mT__19(); 


                }
                break;
            case 5 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:34: T__20
                {
                mT__20(); 


                }
                break;
            case 6 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:40: T__21
                {
                mT__21(); 


                }
                break;
            case 7 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:46: T__22
                {
                mT__22(); 


                }
                break;
            case 8 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:52: T__23
                {
                mT__23(); 


                }
                break;
            case 9 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:58: T__24
                {
                mT__24(); 


                }
                break;
            case 10 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:64: WS
                {
                mWS(); 


                }
                break;
            case 11 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:67: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 12 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:78: DIGIT
                {
                mDIGIT(); 


                }
                break;

        }

    }


 

}