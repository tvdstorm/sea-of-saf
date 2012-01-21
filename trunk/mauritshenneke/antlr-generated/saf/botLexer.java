// $ANTLR 3.4 /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g 2012-01-21 13:10:02

  package saf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class botLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int IDENT=4;
    public static final int INTEGER=5;
    public static final int WS=6;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public botLexer() {} 
    public botLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public botLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:11:6: ( '(' )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:11:8: '('
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
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:12:6: ( ')' )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:12:8: ')'
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
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:13:6: ( '=' )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:13:8: '='
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
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:14:7: ( '[' )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:14:9: '['
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
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:15:7: ( ']' )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:15:9: ']'
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
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:16:7: ( 'choose' )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:16:9: 'choose'
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:17:7: ( '{' )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:17:9: '{'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:18:7: ( '}' )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:18:9: '}'
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
    // $ANTLR end "T__14"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:28:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:28:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:28:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:
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
    // $ANTLR end "IDENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:29:9: ( ( '0' .. '9' )+ )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:29:11: ( '0' .. '9' )+
            {
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:29:11: ( '0' .. '9' )+
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
            	    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:30:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' ) )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:30:7: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | IDENT | INTEGER | WS )
        int alt3=11;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt3=1;
            }
            break;
        case ')':
            {
            alt3=2;
            }
            break;
        case '=':
            {
            alt3=3;
            }
            break;
        case '[':
            {
            alt3=4;
            }
            break;
        case ']':
            {
            alt3=5;
            }
            break;
        case 'c':
            {
            int LA3_6 = input.LA(2);

            if ( (LA3_6=='h') ) {
                int LA3_12 = input.LA(3);

                if ( (LA3_12=='o') ) {
                    int LA3_13 = input.LA(4);

                    if ( (LA3_13=='o') ) {
                        int LA3_14 = input.LA(5);

                        if ( (LA3_14=='s') ) {
                            int LA3_15 = input.LA(6);

                            if ( (LA3_15=='e') ) {
                                int LA3_16 = input.LA(7);

                                if ( ((LA3_16 >= '0' && LA3_16 <= '9')||(LA3_16 >= 'A' && LA3_16 <= 'Z')||LA3_16=='_'||(LA3_16 >= 'a' && LA3_16 <= 'z')) ) {
                                    alt3=9;
                                }
                                else {
                                    alt3=6;
                                }
                            }
                            else {
                                alt3=9;
                            }
                        }
                        else {
                            alt3=9;
                        }
                    }
                    else {
                        alt3=9;
                    }
                }
                else {
                    alt3=9;
                }
            }
            else {
                alt3=9;
            }
            }
            break;
        case '{':
            {
            alt3=7;
            }
            break;
        case '}':
            {
            alt3=8;
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
            alt3=9;
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
            alt3=10;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt3=11;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:25: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:31: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:37: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:43: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:49: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:55: IDENT
                {
                mIDENT(); 


                }
                break;
            case 10 :
                // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:61: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 11 :
                // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:1:69: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}