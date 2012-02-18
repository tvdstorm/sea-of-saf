// $ANTLR 3.4 D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g 2012-02-17 04:14:57

  package nl.uva.lap.saf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int COMMENT=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int MULTICOMMENT=7;
    public static final int WS=8;

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
    public String getGrammarFileName() { return "D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:11:6: ( '=' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:11:8: '='
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
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:12:7: ( '{' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:12:9: '{'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:13:7: ( '}' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:13:9: '}'
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
    // $ANTLR end "T__11"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:64:9: ( ( ( '1' ( '0' )? ) | '2' .. '9' ) )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:64:11: ( ( '1' ( '0' )? ) | '2' .. '9' )
            {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:64:11: ( ( '1' ( '0' )? ) | '2' .. '9' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='1') ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= '2' && LA2_0 <= '9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:64:12: ( '1' ( '0' )? )
                    {
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:64:12: ( '1' ( '0' )? )
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:64:13: '1' ( '0' )?
                    {
                    match('1'); 

                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:64:17: ( '0' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='0') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:64:17: '0'
                            {
                            match('0'); 

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:64:25: '2' .. '9'
                    {
                    matchRange('2','9'); 

                    }
                    break;

            }


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
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:65:7: ( ( '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )* )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:65:9: ( '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )*
            {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:65:9: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
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
            	    break loop3;
                }
            } while (true);


            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:65:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
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
            	    break loop4;
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
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:68:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:68:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:68:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:69:9: ( '//' ( . )* ( '\\n' | '\\r' ) )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:69:11: '//' ( . )* ( '\\n' | '\\r' )
            {
            match("//"); 



            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:69:16: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                    alt6=2;
                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:69:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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

    // $ANTLR start "MULTICOMMENT"
    public final void mMULTICOMMENT() throws RecognitionException {
        try {
            int _type = MULTICOMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:70:14: ( '/*' ( . )* '*/' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:70:16: '/*' ( . )* '*/'
            {
            match("/*"); 



            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:70:21: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:70:21: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "MULTICOMMENT"

    public void mTokens() throws RecognitionException {
        // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:1:8: ( T__9 | T__10 | T__11 | INTEGER | IDENT | WS | COMMENT | MULTICOMMENT )
        int alt8=8;
        switch ( input.LA(1) ) {
        case '=':
            {
            alt8=1;
            }
            break;
        case '{':
            {
            alt8=2;
            }
            break;
        case '}':
            {
            alt8=3;
            }
            break;
        case '1':
            {
            switch ( input.LA(2) ) {
            case '0':
                {
                int LA8_9 = input.LA(3);

                if ( ((LA8_9 >= '0' && LA8_9 <= '9')||(LA8_9 >= 'A' && LA8_9 <= 'Z')||(LA8_9 >= 'a' && LA8_9 <= 'z')) ) {
                    alt8=5;
                }
                else {
                    alt8=4;
                }
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
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
                alt8=5;
                }
                break;
            default:
                alt8=4;
            }

            }
            break;
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            int LA8_5 = input.LA(2);

            if ( ((LA8_5 >= '0' && LA8_5 <= '9')||(LA8_5 >= 'A' && LA8_5 <= 'Z')||(LA8_5 >= 'a' && LA8_5 <= 'z')) ) {
                alt8=5;
            }
            else {
                alt8=4;
            }
            }
            break;
        case '0':
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
            alt8=5;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt8=6;
            }
            break;
        case '/':
            {
            int LA8_8 = input.LA(2);

            if ( (LA8_8=='/') ) {
                alt8=7;
            }
            else if ( (LA8_8=='*') ) {
                alt8=8;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 8, input);

                throw nvae;

            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 8, 0, input);

            throw nvae;

        }

        switch (alt8) {
            case 1 :
                // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:1:27: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 5 :
                // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:1:35: IDENT
                {
                mIDENT(); 


                }
                break;
            case 6 :
                // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:1:41: WS
                {
                mWS(); 


                }
                break;
            case 7 :
                // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:1:44: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 8 :
                // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:1:52: MULTICOMMENT
                {
                mMULTICOMMENT(); 


                }
                break;

        }

    }


 

}