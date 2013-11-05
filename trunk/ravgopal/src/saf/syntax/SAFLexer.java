// $ANTLR 3.4 /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g 2013-05-21 19:29:50

  package saf.syntax;


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
    public static final int AND=4;
    public static final int CHOOSE=5;
    public static final int INT=6;
    public static final int OR=7;
    public static final int STRING=8;
    public static final int WHITESPACE=9;

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
    public String getGrammarFileName() { return "/Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:11:5: ( 'and' )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:11:7: 'and'
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

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:12:8: ( 'choose' )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:12:10: 'choose'
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

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:13:4: ( 'or' )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:13:6: 'or'
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

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:14:7: ( '(' )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:14:9: '('
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
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:15:7: ( ')' )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:15:9: ')'
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
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:16:7: ( '=' )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:16:9: '='
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
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:17:7: ( '[' )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:17:9: '['
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
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:18:7: ( ']' )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:18:9: ']'
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
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:19:7: ( '{' )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:19:9: '{'
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
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:20:7: ( '}' )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:20:9: '}'
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:78:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:78:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:78:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:
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
    // $ANTLR end "STRING"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:82:3: ( ( '0' .. '9' )+ )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:82:5: ( '0' .. '9' )+
            {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:82:5: ( '0' .. '9' )+
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
            	    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:86:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:86:5: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:8: ( AND | CHOOSE | OR | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | STRING | INT | WHITESPACE )
        int alt3=13;
        switch ( input.LA(1) ) {
        case 'a':
            {
            int LA3_1 = input.LA(2);

            if ( (LA3_1=='n') ) {
                int LA3_14 = input.LA(3);

                if ( (LA3_14=='d') ) {
                    int LA3_17 = input.LA(4);

                    if ( ((LA3_17 >= '0' && LA3_17 <= '9')||(LA3_17 >= 'A' && LA3_17 <= 'Z')||LA3_17=='_'||(LA3_17 >= 'a' && LA3_17 <= 'z')) ) {
                        alt3=11;
                    }
                    else {
                        alt3=1;
                    }
                }
                else {
                    alt3=11;
                }
            }
            else {
                alt3=11;
            }
            }
            break;
        case 'c':
            {
            int LA3_2 = input.LA(2);

            if ( (LA3_2=='h') ) {
                int LA3_15 = input.LA(3);

                if ( (LA3_15=='o') ) {
                    int LA3_18 = input.LA(4);

                    if ( (LA3_18=='o') ) {
                        int LA3_21 = input.LA(5);

                        if ( (LA3_21=='s') ) {
                            int LA3_22 = input.LA(6);

                            if ( (LA3_22=='e') ) {
                                int LA3_23 = input.LA(7);

                                if ( ((LA3_23 >= '0' && LA3_23 <= '9')||(LA3_23 >= 'A' && LA3_23 <= 'Z')||LA3_23=='_'||(LA3_23 >= 'a' && LA3_23 <= 'z')) ) {
                                    alt3=11;
                                }
                                else {
                                    alt3=2;
                                }
                            }
                            else {
                                alt3=11;
                            }
                        }
                        else {
                            alt3=11;
                        }
                    }
                    else {
                        alt3=11;
                    }
                }
                else {
                    alt3=11;
                }
            }
            else {
                alt3=11;
            }
            }
            break;
        case 'o':
            {
            int LA3_3 = input.LA(2);

            if ( (LA3_3=='r') ) {
                int LA3_16 = input.LA(3);

                if ( ((LA3_16 >= '0' && LA3_16 <= '9')||(LA3_16 >= 'A' && LA3_16 <= 'Z')||LA3_16=='_'||(LA3_16 >= 'a' && LA3_16 <= 'z')) ) {
                    alt3=11;
                }
                else {
                    alt3=3;
                }
            }
            else {
                alt3=11;
            }
            }
            break;
        case '(':
            {
            alt3=4;
            }
            break;
        case ')':
            {
            alt3=5;
            }
            break;
        case '=':
            {
            alt3=6;
            }
            break;
        case '[':
            {
            alt3=7;
            }
            break;
        case ']':
            {
            alt3=8;
            }
            break;
        case '{':
            {
            alt3=9;
            }
            break;
        case '}':
            {
            alt3=10;
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
            alt3=11;
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
            alt3=12;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=13;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:10: AND
                {
                mAND(); 


                }
                break;
            case 2 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:14: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 3 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:21: OR
                {
                mOR(); 


                }
                break;
            case 4 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:24: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:30: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:36: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:42: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:48: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:54: T__15
                {
                mT__15(); 


                }
                break;
            case 10 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:60: T__16
                {
                mT__16(); 


                }
                break;
            case 11 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:66: STRING
                {
                mSTRING(); 


                }
                break;
            case 12 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:73: INT
                {
                mINT(); 


                }
                break;
            case 13 :
                // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:1:77: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


 

}