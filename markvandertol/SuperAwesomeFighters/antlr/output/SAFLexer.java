// $ANTLR 3.4 C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g 2012-01-24 15:31:50

package saf.parser;
import java.util.List;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int ACTION=4;
    public static final int ASSIGNMENT=5;
    public static final int CONDITION=6;
    public static final int DIGIT=7;
    public static final int IDENTIFIER=8;
    public static final int NEWLINE=9;
    public static final int PROGRAM=10;
    public static final int WS=11;

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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:19:7: ( '(' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:19:9: '('
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:20:7: ( ')' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:20:9: ')'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:21:7: ( '=' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:21:9: '='
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:22:7: ( '[' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:22:9: '['
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:23:7: ( ']' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:23:9: ']'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:24:7: ( 'and' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:24:9: 'and'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:25:7: ( 'or' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:25:9: 'or'
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:26:7: ( '{' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:26:9: '{'
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
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:27:7: ( '}' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:27:9: '}'
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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:74:9: ( ( '\\r' )? '\\n' )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:74:11: ( '\\r' )? '\\n'
            {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:74:11: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:74:11: '\\r'
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:75:5: ( ( ' ' | '\\t' )+ )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:75:7: ( ' ' | '\\t' )+
            {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:75:7: ( ' ' | '\\t' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:
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
    // $ANTLR end "WS"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:76:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )+ )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:76:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )+
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:76:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:77:7: ( ( '0' .. '9' )+ )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:77:9: ( '0' .. '9' )+
            {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:77:9: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | NEWLINE | WS | IDENTIFIER | DIGIT )
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
        case 'a':
            {
            int LA5_6 = input.LA(2);

            if ( (LA5_6=='n') ) {
                int LA5_14 = input.LA(3);

                if ( (LA5_14=='d') ) {
                    int LA5_16 = input.LA(4);

                    if ( (LA5_16=='-'||(LA5_16 >= '0' && LA5_16 <= '9')||(LA5_16 >= 'A' && LA5_16 <= 'Z')||LA5_16=='_'||(LA5_16 >= 'a' && LA5_16 <= 'z')) ) {
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
            else if ( (LA5_6=='-'||(LA5_6 >= '0' && LA5_6 <= '9')||(LA5_6 >= 'A' && LA5_6 <= 'Z')||LA5_6=='_'||(LA5_6 >= 'a' && LA5_6 <= 'm')||(LA5_6 >= 'o' && LA5_6 <= 'z')) ) {
                alt5=12;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 6, input);

                throw nvae;

            }
            }
            break;
        case 'o':
            {
            int LA5_7 = input.LA(2);

            if ( (LA5_7=='r') ) {
                int LA5_15 = input.LA(3);

                if ( (LA5_15=='-'||(LA5_15 >= '0' && LA5_15 <= '9')||(LA5_15 >= 'A' && LA5_15 <= 'Z')||LA5_15=='_'||(LA5_15 >= 'a' && LA5_15 <= 'z')) ) {
                    alt5=12;
                }
                else {
                    alt5=7;
                }
            }
            else if ( (LA5_7=='-'||(LA5_7 >= '0' && LA5_7 <= '9')||(LA5_7 >= 'A' && LA5_7 <= 'Z')||LA5_7=='_'||(LA5_7 >= 'a' && LA5_7 <= 'q')||(LA5_7 >= 's' && LA5_7 <= 'z')) ) {
                alt5=12;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 7, input);

                throw nvae;

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
        case '\n':
        case '\r':
            {
            alt5=10;
            }
            break;
        case '\t':
        case ' ':
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
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:40: T__17
                {
                mT__17(); 


                }
                break;
            case 7 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:46: T__18
                {
                mT__18(); 


                }
                break;
            case 8 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:52: T__19
                {
                mT__19(); 


                }
                break;
            case 9 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:58: T__20
                {
                mT__20(); 


                }
                break;
            case 10 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:64: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 11 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:72: WS
                {
                mWS(); 


                }
                break;
            case 12 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:75: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 13 :
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:1:86: DIGIT
                {
                mDIGIT(); 


                }
                break;

        }

    }


 

}