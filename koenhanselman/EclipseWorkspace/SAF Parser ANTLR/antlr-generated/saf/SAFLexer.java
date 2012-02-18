// $ANTLR 3.4 C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g 2012-02-17 02:38:24

  package saf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int AND=4;
    public static final int DIGIT=5;
    public static final int IDENT=6;
    public static final int LEFT_BRACK=7;
    public static final int LEFT_CURLY=8;
    public static final int LEFT_PAREN=9;
    public static final int LETTER=10;
    public static final int OR=11;
    public static final int RIGHT_BRACK=12;
    public static final int RIGHT_CURLY=13;
    public static final int RIGHT_PAREN=14;
    public static final int WS=15;

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
    public String getGrammarFileName() { return "C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:11:7: ( '=' )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:11:9: '='
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:12:7: ( 'choose' )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:12:9: 'choose'
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
    // $ANTLR end "T__17"

    // $ANTLR start "LEFT_CURLY"
    public final void mLEFT_CURLY() throws RecognitionException {
        try {
            int _type = LEFT_CURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:85:12: ( '{' )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:85:14: '{'
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
    // $ANTLR end "LEFT_CURLY"

    // $ANTLR start "RIGHT_CURLY"
    public final void mRIGHT_CURLY() throws RecognitionException {
        try {
            int _type = RIGHT_CURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:86:13: ( '}' )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:86:15: '}'
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
    // $ANTLR end "RIGHT_CURLY"

    // $ANTLR start "LEFT_BRACK"
    public final void mLEFT_BRACK() throws RecognitionException {
        try {
            int _type = LEFT_BRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:87:12: ( '[' )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:87:14: '['
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
    // $ANTLR end "LEFT_BRACK"

    // $ANTLR start "RIGHT_BRACK"
    public final void mRIGHT_BRACK() throws RecognitionException {
        try {
            int _type = RIGHT_BRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:88:13: ( ']' )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:88:15: ']'
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
    // $ANTLR end "RIGHT_BRACK"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:89:12: ( '(' )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:89:14: '('
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
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:90:13: ( ')' )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:90:15: ')'
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
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:92:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:93:7: ( '0' .. '9' )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:95:5: ( 'and' )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:95:7: 'and'
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
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:96:4: ( 'or' )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:96:6: 'or'
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

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:98:7: ( LETTER ( LETTER | DIGIT | '_' )* )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:98:9: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 


            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:98:16: ( LETTER | DIGIT | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:99:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:99:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:99:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
        // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:8: ( T__16 | T__17 | LEFT_CURLY | RIGHT_CURLY | LEFT_BRACK | RIGHT_BRACK | LEFT_PAREN | RIGHT_PAREN | LETTER | DIGIT | AND | OR | IDENT | WS )
        int alt3=14;
        switch ( input.LA(1) ) {
        case '=':
            {
            alt3=1;
            }
            break;
        case 'c':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA3_14 = input.LA(3);

                if ( (LA3_14=='o') ) {
                    int LA3_19 = input.LA(4);

                    if ( (LA3_19=='o') ) {
                        int LA3_22 = input.LA(5);

                        if ( (LA3_22=='s') ) {
                            int LA3_24 = input.LA(6);

                            if ( (LA3_24=='e') ) {
                                int LA3_25 = input.LA(7);

                                if ( ((LA3_25 >= '0' && LA3_25 <= '9')||(LA3_25 >= 'A' && LA3_25 <= 'Z')||LA3_25=='_'||(LA3_25 >= 'a' && LA3_25 <= 'z')) ) {
                                    alt3=13;
                                }
                                else {
                                    alt3=2;
                                }
                            }
                            else {
                                alt3=13;
                            }
                        }
                        else {
                            alt3=13;
                        }
                    }
                    else {
                        alt3=13;
                    }
                }
                else {
                    alt3=13;
                }
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
                alt3=13;
                }
                break;
            default:
                alt3=9;
            }

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
        case '[':
            {
            alt3=5;
            }
            break;
        case ']':
            {
            alt3=6;
            }
            break;
        case '(':
            {
            alt3=7;
            }
            break;
        case ')':
            {
            alt3=8;
            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA3_17 = input.LA(3);

                if ( (LA3_17=='d') ) {
                    int LA3_20 = input.LA(4);

                    if ( ((LA3_20 >= '0' && LA3_20 <= '9')||(LA3_20 >= 'A' && LA3_20 <= 'Z')||LA3_20=='_'||(LA3_20 >= 'a' && LA3_20 <= 'z')) ) {
                        alt3=13;
                    }
                    else {
                        alt3=11;
                    }
                }
                else {
                    alt3=13;
                }
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
                alt3=13;
                }
                break;
            default:
                alt3=9;
            }

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
        case 'o':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA3_18 = input.LA(3);

                if ( ((LA3_18 >= '0' && LA3_18 <= '9')||(LA3_18 >= 'A' && LA3_18 <= 'Z')||LA3_18=='_'||(LA3_18 >= 'a' && LA3_18 <= 'z')) ) {
                    alt3=13;
                }
                else {
                    alt3=12;
                }
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
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt3=13;
                }
                break;
            default:
                alt3=9;
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
            int LA3_12 = input.LA(2);

            if ( ((LA3_12 >= '0' && LA3_12 <= '9')||(LA3_12 >= 'A' && LA3_12 <= 'Z')||LA3_12=='_'||(LA3_12 >= 'a' && LA3_12 <= 'z')) ) {
                alt3=13;
            }
            else {
                alt3=9;
            }
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt3=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:10: T__16
                {
                mT__16(); 


                }
                break;
            case 2 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:16: T__17
                {
                mT__17(); 


                }
                break;
            case 3 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:22: LEFT_CURLY
                {
                mLEFT_CURLY(); 


                }
                break;
            case 4 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:33: RIGHT_CURLY
                {
                mRIGHT_CURLY(); 


                }
                break;
            case 5 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:45: LEFT_BRACK
                {
                mLEFT_BRACK(); 


                }
                break;
            case 6 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:56: RIGHT_BRACK
                {
                mRIGHT_BRACK(); 


                }
                break;
            case 7 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:68: LEFT_PAREN
                {
                mLEFT_PAREN(); 


                }
                break;
            case 8 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:79: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 


                }
                break;
            case 9 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:91: LETTER
                {
                mLETTER(); 


                }
                break;
            case 10 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:98: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 11 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:104: AND
                {
                mAND(); 


                }
                break;
            case 12 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:108: OR
                {
                mOR(); 


                }
                break;
            case 13 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:111: IDENT
                {
                mIDENT(); 


                }
                break;
            case 14 :
                // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:1:117: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}