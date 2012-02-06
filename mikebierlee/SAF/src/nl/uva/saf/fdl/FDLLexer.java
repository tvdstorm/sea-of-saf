// $ANTLR 3.4 C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g 2012-02-06 15:24:47

  package nl.uva.saf.fdl;
  import nl.uva.saf.fdl.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int ALWAYS=4;
    public static final int AND=5;
    public static final int ASSIGN=6;
    public static final int CHOOSE=7;
    public static final int IDENT=8;
    public static final int INTEGER=9;
    public static final int OR=10;
    public static final int WS=11;

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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:35:4: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:35:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:35:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
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

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:36:9: ( ( '0' .. '9' )+ )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:36:11: ( '0' .. '9' )+
            {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:36:11: ( '0' .. '9' )+
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
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
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
    // $ANTLR end "INTEGER"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:37:8: ( 'choose' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:37:10: 'choose'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:38:5: ( 'and' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:38:7: 'and'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:4: ( 'or' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:6: 'or'
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:8: ( '=' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:10: '='
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
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:41:8: ( 'always' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:41:10: 'always'
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

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:43:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:43:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:43:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
        // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | WS | INTEGER | CHOOSE | AND | OR | ASSIGN | ALWAYS | IDENT )
        int alt4=14;
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
        case '[':
            {
            alt4=3;
            }
            break;
        case ']':
            {
            alt4=4;
            }
            break;
        case '{':
            {
            alt4=5;
            }
            break;
        case '}':
            {
            alt4=6;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt4=7;
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
            alt4=8;
            }
            break;
        case 'c':
            {
            int LA4_9 = input.LA(2);

            if ( (LA4_9=='h') ) {
                int LA4_14 = input.LA(3);

                if ( (LA4_14=='o') ) {
                    int LA4_18 = input.LA(4);

                    if ( (LA4_18=='o') ) {
                        int LA4_22 = input.LA(5);

                        if ( (LA4_22=='s') ) {
                            int LA4_25 = input.LA(6);

                            if ( (LA4_25=='e') ) {
                                int LA4_27 = input.LA(7);

                                if ( ((LA4_27 >= '0' && LA4_27 <= '9')||(LA4_27 >= 'A' && LA4_27 <= 'Z')||LA4_27=='_'||(LA4_27 >= 'a' && LA4_27 <= 'z')) ) {
                                    alt4=14;
                                }
                                else {
                                    alt4=9;
                                }
                            }
                            else {
                                alt4=14;
                            }
                        }
                        else {
                            alt4=14;
                        }
                    }
                    else {
                        alt4=14;
                    }
                }
                else {
                    alt4=14;
                }
            }
            else {
                alt4=14;
            }
            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA4_15 = input.LA(3);

                if ( (LA4_15=='d') ) {
                    int LA4_19 = input.LA(4);

                    if ( ((LA4_19 >= '0' && LA4_19 <= '9')||(LA4_19 >= 'A' && LA4_19 <= 'Z')||LA4_19=='_'||(LA4_19 >= 'a' && LA4_19 <= 'z')) ) {
                        alt4=14;
                    }
                    else {
                        alt4=10;
                    }
                }
                else {
                    alt4=14;
                }
                }
                break;
            case 'l':
                {
                int LA4_16 = input.LA(3);

                if ( (LA4_16=='w') ) {
                    int LA4_20 = input.LA(4);

                    if ( (LA4_20=='a') ) {
                        int LA4_24 = input.LA(5);

                        if ( (LA4_24=='y') ) {
                            int LA4_26 = input.LA(6);

                            if ( (LA4_26=='s') ) {
                                int LA4_28 = input.LA(7);

                                if ( ((LA4_28 >= '0' && LA4_28 <= '9')||(LA4_28 >= 'A' && LA4_28 <= 'Z')||LA4_28=='_'||(LA4_28 >= 'a' && LA4_28 <= 'z')) ) {
                                    alt4=14;
                                }
                                else {
                                    alt4=13;
                                }
                            }
                            else {
                                alt4=14;
                            }
                        }
                        else {
                            alt4=14;
                        }
                    }
                    else {
                        alt4=14;
                    }
                }
                else {
                    alt4=14;
                }
                }
                break;
            default:
                alt4=14;
            }

            }
            break;
        case 'o':
            {
            int LA4_11 = input.LA(2);

            if ( (LA4_11=='r') ) {
                int LA4_17 = input.LA(3);

                if ( ((LA4_17 >= '0' && LA4_17 <= '9')||(LA4_17 >= 'A' && LA4_17 <= 'Z')||LA4_17=='_'||(LA4_17 >= 'a' && LA4_17 <= 'z')) ) {
                    alt4=14;
                }
                else {
                    alt4=11;
                }
            }
            else {
                alt4=14;
            }
            }
            break;
        case '=':
            {
            alt4=12;
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
            alt4=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:40: T__17
                {
                mT__17(); 


                }
                break;
            case 7 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:46: WS
                {
                mWS(); 


                }
                break;
            case 8 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:49: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 9 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:57: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 10 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:64: AND
                {
                mAND(); 


                }
                break;
            case 11 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:68: OR
                {
                mOR(); 


                }
                break;
            case 12 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:71: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 13 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:78: ALWAYS
                {
                mALWAYS(); 


                }
                break;
            case 14 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:85: IDENT
                {
                mIDENT(); 


                }
                break;

        }

    }


 

}