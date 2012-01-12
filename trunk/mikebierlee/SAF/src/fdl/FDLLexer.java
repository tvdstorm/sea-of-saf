// $ANTLR 3.4 C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g 2012-01-12 18:46:08

  package fdl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int LEFT_PARENTHESIS=7;
    public static final int RIGHT_PARENTHESIS=8;
    public static final int WHITESPACE=9;

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

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:22:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:22:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:22:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:24:13: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:24:17: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    // $ANTLR start "LEFT_PARENTHESIS"
    public final void mLEFT_PARENTHESIS() throws RecognitionException {
        try {
            int _type = LEFT_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:31:19: ( '{' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:31:21: '{'
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
    // $ANTLR end "LEFT_PARENTHESIS"

    // $ANTLR start "RIGHT_PARENTHESIS"
    public final void mRIGHT_PARENTHESIS() throws RecognitionException {
        try {
            int _type = RIGHT_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:32:20: ( '}' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:32:22: '}'
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
    // $ANTLR end "RIGHT_PARENTHESIS"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:34:8: ( '=' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:34:10: '='
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

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:35:9: ( ( '0' .. '9' )+ )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:35:11: ( '0' .. '9' )+
            {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:35:11: ( '0' .. '9' )+
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

    public void mTokens() throws RecognitionException {
        // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:8: ( IDENT | WHITESPACE | LEFT_PARENTHESIS | RIGHT_PARENTHESIS | ASSIGN | INTEGER )
        int alt3=6;
        switch ( input.LA(1) ) {
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
            alt3=1;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=2;
            }
            break;
        case '{':
            {
            alt3=3;
            }
            break;
        case '}':
            {
            alt3=4;
            }
            break;
        case '=':
            {
            alt3=5;
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
            alt3=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:10: IDENT
                {
                mIDENT(); 


                }
                break;
            case 2 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:16: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 3 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:27: LEFT_PARENTHESIS
                {
                mLEFT_PARENTHESIS(); 


                }
                break;
            case 4 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:44: RIGHT_PARENTHESIS
                {
                mRIGHT_PARENTHESIS(); 


                }
                break;
            case 5 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:62: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 6 :
                // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:1:69: INTEGER
                {
                mINTEGER(); 


                }
                break;

        }

    }


 

}