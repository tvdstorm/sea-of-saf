// $ANTLR 3.4 /Users/job/Programming/svn-sc/saf/SAF.g 2012-02-10 00:26:11
package saf; 

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
    public String getGrammarFileName() { return "/Users/job/Programming/svn-sc/saf/SAF.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/saf/SAF.g:9:6: ( 'lol' )
            // /Users/job/Programming/svn-sc/saf/SAF.g:9:8: 'lol'
            {
            match("lol"); 



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
            // /Users/job/Programming/svn-sc/saf/SAF.g:10:6: ( '{' )
            // /Users/job/Programming/svn-sc/saf/SAF.g:10:8: '{'
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/saf/SAF.g:11:6: ( '}' )
            // /Users/job/Programming/svn-sc/saf/SAF.g:11:8: '}'
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
    // $ANTLR end "T__9"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/saf/SAF.g:44:8: ( ( '0' .. '9' )+ )
            // /Users/job/Programming/svn-sc/saf/SAF.g:44:10: ( '0' .. '9' )+
            {
            // /Users/job/Programming/svn-sc/saf/SAF.g:44:10: ( '0' .. '9' )+
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
            	    // /Users/job/Programming/svn-sc/saf/SAF.g:
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
            // /Users/job/Programming/svn-sc/saf/SAF.g:45:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/job/Programming/svn-sc/saf/SAF.g:45:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/job/Programming/svn-sc/saf/SAF.g:45:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/job/Programming/svn-sc/saf/SAF.g:
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
            // /Users/job/Programming/svn-sc/saf/SAF.g:46:8: ( ( ' ' | '\\t' | '\\r' | '\\n' )* )
            // /Users/job/Programming/svn-sc/saf/SAF.g:46:12: ( ' ' | '\\t' | '\\r' | '\\n' )*
            {
            // /Users/job/Programming/svn-sc/saf/SAF.g:46:12: ( ' ' | '\\t' | '\\r' | '\\n' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/job/Programming/svn-sc/saf/SAF.g:
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
        // /Users/job/Programming/svn-sc/saf/SAF.g:1:8: ( T__7 | T__8 | T__9 | INT | ID | WS )
        int alt4=6;
        switch ( input.LA(1) ) {
        case 'l':
            {
            int LA4_1 = input.LA(2);

            if ( (LA4_1=='o') ) {
                int LA4_7 = input.LA(3);

                if ( (LA4_7=='l') ) {
                    int LA4_8 = input.LA(4);

                    if ( ((LA4_8 >= '0' && LA4_8 <= '9')||(LA4_8 >= 'A' && LA4_8 <= 'Z')||LA4_8=='_'||(LA4_8 >= 'a' && LA4_8 <= 'z')) ) {
                        alt4=5;
                    }
                    else {
                        alt4=1;
                    }
                }
                else {
                    alt4=5;
                }
            }
            else {
                alt4=5;
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
            alt4=4;
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
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
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
            alt4=5;
            }
            break;
        default:
            alt4=6;
        }

        switch (alt4) {
            case 1 :
                // /Users/job/Programming/svn-sc/saf/SAF.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // /Users/job/Programming/svn-sc/saf/SAF.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // /Users/job/Programming/svn-sc/saf/SAF.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // /Users/job/Programming/svn-sc/saf/SAF.g:1:25: INT
                {
                mINT(); 


                }
                break;
            case 5 :
                // /Users/job/Programming/svn-sc/saf/SAF.g:1:29: ID
                {
                mID(); 


                }
                break;
            case 6 :
                // /Users/job/Programming/svn-sc/saf/SAF.g:1:32: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}