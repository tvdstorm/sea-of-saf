// $ANTLR 3.4 C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g 2013-07-31 12:44:56

  package com.yennick.parser;
  import com.yennick.fighter.bot.*;


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
    public static final int IDENT=5;
    public static final int LEFTCURLY=6;
    public static final int RIGHTCURLY=7;
    public static final int VALUE=8;
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
    public String getGrammarFileName() { return "C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g"; }

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:12:8: ( 'choose' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:12:10: 'choose'
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

    // $ANTLR start "LEFTCURLY"
    public final void mLEFTCURLY() throws RecognitionException {
        try {
            int _type = LEFTCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:13:11: ( '{' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:13:13: '{'
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
    // $ANTLR end "LEFTCURLY"

    // $ANTLR start "RIGHTCURLY"
    public final void mRIGHTCURLY() throws RecognitionException {
        try {
            int _type = RIGHTCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:14:12: ( '}' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:14:14: '}'
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
    // $ANTLR end "RIGHTCURLY"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:15:7: ( '(' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:15:9: '('
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
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:16:7: ( ')' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:16:9: ')'
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
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:17:7: ( '=' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:17:9: '='
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
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:18:7: ( '[' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:18:9: '['
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
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:19:7: ( ']' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:19:9: ']'
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
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:20:7: ( 'and' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:20:9: 'and'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:21:7: ( 'or' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:21:9: 'or'
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

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:75:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:75:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:75:29: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:
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
    // $ANTLR end "IDENT"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:76:7: ( ( '0' .. '9' )+ )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:76:9: ( '0' .. '9' )+
            {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:76:9: ( '0' .. '9' )+
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
            	    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:
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
    // $ANTLR end "VALUE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:78:12: ( ( '\\t' | ' ' | '\\r' | '\\n' )* )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:78:14: ( '\\t' | ' ' | '\\r' | '\\n' )*
            {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:78:14: ( '\\t' | ' ' | '\\r' | '\\n' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:
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
            	    break loop3;
                }
            } while (true);


             _channel = HIDDEN; 

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
        // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:8: ( CHOOSE | LEFTCURLY | RIGHTCURLY | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | IDENT | VALUE | WHITESPACE )
        int alt4=13;
        switch ( input.LA(1) ) {
        case 'c':
            {
            int LA4_1 = input.LA(2);

            if ( (LA4_1=='h') ) {
                int LA4_14 = input.LA(3);

                if ( (LA4_14=='o') ) {
                    int LA4_17 = input.LA(4);

                    if ( (LA4_17=='o') ) {
                        int LA4_20 = input.LA(5);

                        if ( (LA4_20=='s') ) {
                            int LA4_22 = input.LA(6);

                            if ( (LA4_22=='e') ) {
                                int LA4_23 = input.LA(7);

                                if ( ((LA4_23 >= 'A' && LA4_23 <= 'Z')||LA4_23=='_'||(LA4_23 >= 'a' && LA4_23 <= 'z')) ) {
                                    alt4=11;
                                }
                                else {
                                    alt4=1;
                                }
                            }
                            else {
                                alt4=11;
                            }
                        }
                        else {
                            alt4=11;
                        }
                    }
                    else {
                        alt4=11;
                    }
                }
                else {
                    alt4=11;
                }
            }
            else {
                alt4=11;
            }
            }
            break;
        case '{':
            {
            alt4=2;
            }
            break;
        case '}':
            {
            alt4=3;
            }
            break;
        case '(':
            {
            alt4=4;
            }
            break;
        case ')':
            {
            alt4=5;
            }
            break;
        case '=':
            {
            alt4=6;
            }
            break;
        case '[':
            {
            alt4=7;
            }
            break;
        case ']':
            {
            alt4=8;
            }
            break;
        case 'a':
            {
            int LA4_9 = input.LA(2);

            if ( (LA4_9=='n') ) {
                int LA4_15 = input.LA(3);

                if ( (LA4_15=='d') ) {
                    int LA4_18 = input.LA(4);

                    if ( ((LA4_18 >= 'A' && LA4_18 <= 'Z')||LA4_18=='_'||(LA4_18 >= 'a' && LA4_18 <= 'z')) ) {
                        alt4=11;
                    }
                    else {
                        alt4=9;
                    }
                }
                else {
                    alt4=11;
                }
            }
            else {
                alt4=11;
            }
            }
            break;
        case 'o':
            {
            int LA4_10 = input.LA(2);

            if ( (LA4_10=='r') ) {
                int LA4_16 = input.LA(3);

                if ( ((LA4_16 >= 'A' && LA4_16 <= 'Z')||LA4_16=='_'||(LA4_16 >= 'a' && LA4_16 <= 'z')) ) {
                    alt4=11;
                }
                else {
                    alt4=10;
                }
            }
            else {
                alt4=11;
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
            alt4=13;
        }

        switch (alt4) {
            case 1 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:10: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 2 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:17: LEFTCURLY
                {
                mLEFTCURLY(); 


                }
                break;
            case 3 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:27: RIGHTCURLY
                {
                mRIGHTCURLY(); 


                }
                break;
            case 4 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:38: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:44: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:50: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:56: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:62: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:68: T__15
                {
                mT__15(); 


                }
                break;
            case 10 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:74: T__16
                {
                mT__16(); 


                }
                break;
            case 11 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:80: IDENT
                {
                mIDENT(); 


                }
                break;
            case 12 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:86: VALUE
                {
                mVALUE(); 


                }
                break;
            case 13 :
                // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:1:92: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


 

}