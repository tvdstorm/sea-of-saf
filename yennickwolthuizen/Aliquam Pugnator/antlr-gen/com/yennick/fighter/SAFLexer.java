// $ANTLR 3.4 /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g 2012-02-17 17:18:00

  package com.yennick.fighter;


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
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int CHOOSE=4;
    public static final int COMMENT=5;
    public static final int IDENT=6;
    public static final int MULTI_COMMENT=7;
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
    public String getGrammarFileName() { return "/Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g"; }

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:11:8: ( 'choose' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:11:10: 'choose'
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

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:12:7: ( '(' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:12:9: '('
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:13:7: ( ')' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:13:9: ')'
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:14:7: ( '=' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:14:9: '='
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:15:7: ( '[' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:15:9: '['
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:16:7: ( ']' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:16:9: ']'
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:17:7: ( 'and' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:17:9: 'and'
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:18:7: ( 'or' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:18:9: 'or'
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:19:7: ( '{' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:19:9: '{'
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:20:7: ( '}' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:20:9: '}'
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

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:68:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:68:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:68:29: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:69:7: ( ( '0' .. '9' )+ )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:69:9: ( '0' .. '9' )+
            {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:69:9: ( '0' .. '9' )+
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
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:71:12: ( ( '\\t' | ' ' | '\\r' | '\\n' )* )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:71:14: ( '\\t' | ' ' | '\\r' | '\\n' )*
            {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:71:14: ( '\\t' | ' ' | '\\r' | '\\n' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:73:9: ( '//' ( . )* ( '\\n' | '\\r' ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:73:11: '//' ( . )* ( '\\n' | '\\r' )
            {
            match("//"); 



            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:73:16: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                    alt4=2;
                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:73:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "MULTI_COMMENT"
    public final void mMULTI_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:74:15: ( '/*' ( . )* '*/' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:74:17: '/*' ( . )* '*/'
            {
            match("/*"); 



            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:74:22: ( . )*
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
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:74:22: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match("*/"); 



             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTI_COMMENT"

    public void mTokens() throws RecognitionException {
        // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:8: ( CHOOSE | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | IDENT | VALUE | WHITESPACE | COMMENT | MULTI_COMMENT )
        int alt6=15;
        switch ( input.LA(1) ) {
        case 'c':
            {
            int LA6_1 = input.LA(2);

            if ( (LA6_1=='h') ) {
                int LA6_15 = input.LA(3);

                if ( (LA6_15=='o') ) {
                    int LA6_20 = input.LA(4);

                    if ( (LA6_20=='o') ) {
                        int LA6_23 = input.LA(5);

                        if ( (LA6_23=='s') ) {
                            int LA6_25 = input.LA(6);

                            if ( (LA6_25=='e') ) {
                                int LA6_26 = input.LA(7);

                                if ( ((LA6_26 >= 'A' && LA6_26 <= 'Z')||LA6_26=='_'||(LA6_26 >= 'a' && LA6_26 <= 'z')) ) {
                                    alt6=11;
                                }
                                else {
                                    alt6=1;
                                }
                            }
                            else {
                                alt6=11;
                            }
                        }
                        else {
                            alt6=11;
                        }
                    }
                    else {
                        alt6=11;
                    }
                }
                else {
                    alt6=11;
                }
            }
            else {
                alt6=11;
            }
            }
            break;
        case '(':
            {
            alt6=2;
            }
            break;
        case ')':
            {
            alt6=3;
            }
            break;
        case '=':
            {
            alt6=4;
            }
            break;
        case '[':
            {
            alt6=5;
            }
            break;
        case ']':
            {
            alt6=6;
            }
            break;
        case 'a':
            {
            int LA6_7 = input.LA(2);

            if ( (LA6_7=='n') ) {
                int LA6_16 = input.LA(3);

                if ( (LA6_16=='d') ) {
                    int LA6_21 = input.LA(4);

                    if ( ((LA6_21 >= 'A' && LA6_21 <= 'Z')||LA6_21=='_'||(LA6_21 >= 'a' && LA6_21 <= 'z')) ) {
                        alt6=11;
                    }
                    else {
                        alt6=7;
                    }
                }
                else {
                    alt6=11;
                }
            }
            else {
                alt6=11;
            }
            }
            break;
        case 'o':
            {
            int LA6_8 = input.LA(2);

            if ( (LA6_8=='r') ) {
                int LA6_17 = input.LA(3);

                if ( ((LA6_17 >= 'A' && LA6_17 <= 'Z')||LA6_17=='_'||(LA6_17 >= 'a' && LA6_17 <= 'z')) ) {
                    alt6=11;
                }
                else {
                    alt6=8;
                }
            }
            else {
                alt6=11;
            }
            }
            break;
        case '{':
            {
            alt6=9;
            }
            break;
        case '}':
            {
            alt6=10;
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
            alt6=11;
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
            alt6=12;
            }
            break;
        case '/':
            {
            int LA6_14 = input.LA(2);

            if ( (LA6_14=='/') ) {
                alt6=14;
            }
            else if ( (LA6_14=='*') ) {
                alt6=15;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 14, input);

                throw nvae;

            }
            }
            break;
        default:
            alt6=13;
        }

        switch (alt6) {
            case 1 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:10: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 2 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:17: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:23: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:29: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:35: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:41: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:47: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:53: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:59: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:65: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:71: IDENT
                {
                mIDENT(); 


                }
                break;
            case 12 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:77: VALUE
                {
                mVALUE(); 


                }
                break;
            case 13 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:83: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 14 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:94: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 15 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:1:102: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 


                }
                break;

        }

    }


 

}