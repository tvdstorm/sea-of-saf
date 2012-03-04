// $ANTLR 3.4 syntax/SAF.g 2012-03-03 13:50:06
package saf.syntax; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int ID=4;
    public static final int INT=5;
    public static final int WS=6;

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
    public String getGrammarFileName() { return "syntax/SAF.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // syntax/SAF.g:9:6: ( '(' )
            // syntax/SAF.g:9:8: '('
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
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // syntax/SAF.g:10:6: ( ')' )
            // syntax/SAF.g:10:8: ')'
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // syntax/SAF.g:11:6: ( '=' )
            // syntax/SAF.g:11:8: '='
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // syntax/SAF.g:12:7: ( '[' )
            // syntax/SAF.g:12:9: '['
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // syntax/SAF.g:13:7: ( ']' )
            // syntax/SAF.g:13:9: ']'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // syntax/SAF.g:14:7: ( 'and' )
            // syntax/SAF.g:14:9: 'and'
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // syntax/SAF.g:15:7: ( 'choose' )
            // syntax/SAF.g:15:9: 'choose'
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
            // syntax/SAF.g:16:7: ( 'or' )
            // syntax/SAF.g:16:9: 'or'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // syntax/SAF.g:17:7: ( '{' )
            // syntax/SAF.g:17:9: '{'
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
            // syntax/SAF.g:18:7: ( '}' )
            // syntax/SAF.g:18:9: '}'
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
            // syntax/SAF.g:68:13: ( ( '0' .. '9' )+ )
            // syntax/SAF.g:68:21: ( '0' .. '9' )+
            {
            // syntax/SAF.g:68:21: ( '0' .. '9' )+
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
            	    // syntax/SAF.g:
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // syntax/SAF.g:67:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // syntax/SAF.g:67:21: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // syntax/SAF.g:67:45: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // syntax/SAF.g:
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
            	    break loop2;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // syntax/SAF.g:68:13: ( ( ' ' | '\\t' | '\\r' | '\\n' )* )
            // syntax/SAF.g:68:21: ( ' ' | '\\t' | '\\r' | '\\n' )*
            {
            // syntax/SAF.g:68:21: ( ' ' | '\\t' | '\\r' | '\\n' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // syntax/SAF.g:
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
        // syntax/SAF.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | INT | ID | WS )
        int alt4=13;
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
                int LA4_14 = input.LA(3);

                if ( (LA4_14=='d') ) {
                    int LA4_17 = input.LA(4);

                    if ( ((LA4_17 >= '0' && LA4_17 <= '9')||(LA4_17 >= 'A' && LA4_17 <= 'Z')||LA4_17=='_'||(LA4_17 >= 'a' && LA4_17 <= 'z')) ) {
                        alt4=12;
                    }
                    else {
                        alt4=6;
                    }
                }
                else {
                    alt4=12;
                }
            }
            else {
                alt4=12;
            }
            }
            break;
        case 'c':
            {
            int LA4_7 = input.LA(2);

            if ( (LA4_7=='h') ) {
                int LA4_15 = input.LA(3);

                if ( (LA4_15=='o') ) {
                    int LA4_18 = input.LA(4);

                    if ( (LA4_18=='o') ) {
                        int LA4_21 = input.LA(5);

                        if ( (LA4_21=='s') ) {
                            int LA4_22 = input.LA(6);

                            if ( (LA4_22=='e') ) {
                                int LA4_23 = input.LA(7);

                                if ( ((LA4_23 >= '0' && LA4_23 <= '9')||(LA4_23 >= 'A' && LA4_23 <= 'Z')||LA4_23=='_'||(LA4_23 >= 'a' && LA4_23 <= 'z')) ) {
                                    alt4=12;
                                }
                                else {
                                    alt4=7;
                                }
                            }
                            else {
                                alt4=12;
                            }
                        }
                        else {
                            alt4=12;
                        }
                    }
                    else {
                        alt4=12;
                    }
                }
                else {
                    alt4=12;
                }
            }
            else {
                alt4=12;
            }
            }
            break;
        case 'o':
            {
            int LA4_8 = input.LA(2);

            if ( (LA4_8=='r') ) {
                int LA4_16 = input.LA(3);

                if ( ((LA4_16 >= '0' && LA4_16 <= '9')||(LA4_16 >= 'A' && LA4_16 <= 'Z')||LA4_16=='_'||(LA4_16 >= 'a' && LA4_16 <= 'z')) ) {
                    alt4=12;
                }
                else {
                    alt4=8;
                }
            }
            else {
                alt4=12;
            }
            }
            break;
        case '{':
            {
            alt4=9;
            }
            break;
        case '}':
            {
            alt4=10;
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
            alt4=11;
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
            alt4=12;
            }
            break;
        default:
            alt4=13;
        }

        switch (alt4) {
            case 1 :
                // syntax/SAF.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // syntax/SAF.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // syntax/SAF.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // syntax/SAF.g:1:25: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // syntax/SAF.g:1:31: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // syntax/SAF.g:1:37: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // syntax/SAF.g:1:43: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // syntax/SAF.g:1:49: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // syntax/SAF.g:1:55: T__15
                {
                mT__15(); 


                }
                break;
            case 10 :
                // syntax/SAF.g:1:61: T__16
                {
                mT__16(); 


                }
                break;
            case 11 :
                // syntax/SAF.g:1:67: INT
                {
                mINT(); 


                }
                break;
            case 12 :
                // syntax/SAF.g:1:71: ID
                {
                mID(); 


                }
                break;
            case 13 :
                // syntax/SAF.g:1:74: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}