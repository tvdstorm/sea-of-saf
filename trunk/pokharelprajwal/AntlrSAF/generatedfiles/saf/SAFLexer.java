// $ANTLR 3.4 D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g 2012-02-08 00:45:37

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
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int IDENT=4;
    public static final int INTEGER=5;
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
    public String getGrammarFileName() { return "D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:6:6: ( '(' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:6:8: '('
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
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:7:6: ( ')' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:7:8: ')'
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
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:8:6: ( '=' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:8:8: '='
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
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:9:7: ( '[' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:9:9: '['
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
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:10:7: ( ']' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:10:9: ']'
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
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:11:7: ( 'and' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:11:9: 'and'
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
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:12:7: ( 'choose(' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:12:9: 'choose('
            {
            match("choose("); 



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
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:13:7: ( 'or' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:13:9: 'or'
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
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:14:7: ( '{' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:14:9: '{'
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
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:15:7: ( '}' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:15:9: '}'
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

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:66:9: ( ( '0' .. '9' )+ )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:66:11: ( '0' .. '9' )+
            {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:66:11: ( '0' .. '9' )+
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
            	    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:
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
    // $ANTLR end "INTEGER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:67:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:67:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:67:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:
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
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:68:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:68:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:68:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | INTEGER | IDENT | WS )
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

                                if ( (LA4_23=='(') ) {
                                    alt4=7;
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
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt4=13;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:25: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:31: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:37: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:43: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:49: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:55: T__15
                {
                mT__15(); 


                }
                break;
            case 10 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:61: T__16
                {
                mT__16(); 


                }
                break;
            case 11 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:67: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 12 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:75: IDENT
                {
                mIDENT(); 


                }
                break;
            case 13 :
                // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:1:81: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}