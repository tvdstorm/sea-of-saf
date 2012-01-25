// $ANTLR 3.4 C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g 2012-01-25 12:32:33

	package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int ACTION=4;
    public static final int AND_OPERATOR=5;
    public static final int BEHAVIOUR=6;
    public static final int CHARACTERISTIC=7;
    public static final int CHOOSE=8;
    public static final int CONDITION=9;
    public static final int DIGIT=10;
    public static final int FIGHTER=11;
    public static final int IDENTIFIER=12;
    public static final int LETTER=13;
    public static final int MULTILINE_COMMENT=14;
    public static final int NAME=15;
    public static final int NUMBER=16;
    public static final int OR_OPERATOR=17;
    public static final int PERSONALITY=18;
    public static final int SINGLELINE_COMMENT=19;
    public static final int VALUE=20;
    public static final int WHITESPACE=21;

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
    public String getGrammarFileName() { return "C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:11:7: ( '(' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:11:9: '('
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:12:7: ( ')' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:12:9: ')'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:13:7: ( '=' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:13:9: '='
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:14:7: ( '[' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:14:9: '['
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:15:7: ( ']' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:15:9: ']'
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:16:7: ( 'and' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:16:9: 'and'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:17:7: ( 'choose' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:17:9: 'choose'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:18:7: ( 'or' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:18:9: 'or'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:19:7: ( '{' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:19:9: '{'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:20:7: ( '}' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:20:9: '}'
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
    // $ANTLR end "T__31"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:76:18: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:77:17: ( '0' .. '9' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:79:14: ( LETTER ( LETTER | '_' | '-' )+ LETTER )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:79:16: LETTER ( LETTER | '_' | '-' )+ LETTER
            {
            mLETTER(); 


            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:79:23: ( LETTER | '_' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='-'||(LA1_1 >= 'A' && LA1_1 <= 'Z')||LA1_1=='_'||(LA1_1 >= 'a' && LA1_1 <= 'z')) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0=='-'||LA1_0=='_') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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


            mLETTER(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:80:11: ( ( DIGIT )+ )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:80:13: ( DIGIT )+
            {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:80:13: ( DIGIT )+
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
            	    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:
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
    // $ANTLR end "NUMBER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:81:14: ( ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+ )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:81:16: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
            {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:81:16: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
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
            	    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:
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
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "SINGLELINE_COMMENT"
    public final void mSINGLELINE_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLELINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:82:20: ( '//' ( . )* ( '\\n' | '\\r' ) )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:82:22: '//' ( . )* ( '\\n' | '\\r' )
            {
            match("//"); 



            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:82:27: ( . )*
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
            	    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:82:27: .
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
    // $ANTLR end "SINGLELINE_COMMENT"

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:83:19: ( '/*' ( . )* '*/' )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:83:21: '/*' ( . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:83:26: ( . )*
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
            	    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:83:26: .
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
    // $ANTLR end "MULTILINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | IDENTIFIER | NUMBER | WHITESPACE | SINGLELINE_COMMENT | MULTILINE_COMMENT )
        int alt6=15;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt6=1;
            }
            break;
        case ')':
            {
            alt6=2;
            }
            break;
        case '=':
            {
            alt6=3;
            }
            break;
        case '[':
            {
            alt6=4;
            }
            break;
        case ']':
            {
            alt6=5;
            }
            break;
        case 'a':
            {
            int LA6_6 = input.LA(2);

            if ( (LA6_6=='n') ) {
                int LA6_15 = input.LA(3);

                if ( (LA6_15=='d') ) {
                    int LA6_20 = input.LA(4);

                    if ( (LA6_20=='-'||(LA6_20 >= 'A' && LA6_20 <= 'Z')||LA6_20=='_'||(LA6_20 >= 'a' && LA6_20 <= 'z')) ) {
                        alt6=11;
                    }
                    else {
                        alt6=6;
                    }
                }
                else if ( (LA6_15=='-'||(LA6_15 >= 'A' && LA6_15 <= 'Z')||LA6_15=='_'||(LA6_15 >= 'a' && LA6_15 <= 'c')||(LA6_15 >= 'e' && LA6_15 <= 'z')) ) {
                    alt6=11;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 15, input);

                    throw nvae;

                }
            }
            else if ( (LA6_6=='-'||(LA6_6 >= 'A' && LA6_6 <= 'Z')||LA6_6=='_'||(LA6_6 >= 'a' && LA6_6 <= 'm')||(LA6_6 >= 'o' && LA6_6 <= 'z')) ) {
                alt6=11;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 6, input);

                throw nvae;

            }
            }
            break;
        case 'c':
            {
            int LA6_7 = input.LA(2);

            if ( (LA6_7=='h') ) {
                int LA6_16 = input.LA(3);

                if ( (LA6_16=='o') ) {
                    int LA6_21 = input.LA(4);

                    if ( (LA6_21=='o') ) {
                        int LA6_24 = input.LA(5);

                        if ( (LA6_24=='s') ) {
                            int LA6_25 = input.LA(6);

                            if ( (LA6_25=='e') ) {
                                int LA6_26 = input.LA(7);

                                if ( (LA6_26=='-'||(LA6_26 >= 'A' && LA6_26 <= 'Z')||LA6_26=='_'||(LA6_26 >= 'a' && LA6_26 <= 'z')) ) {
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
                    else {
                        alt6=11;
                    }
                }
                else if ( (LA6_16=='-'||(LA6_16 >= 'A' && LA6_16 <= 'Z')||LA6_16=='_'||(LA6_16 >= 'a' && LA6_16 <= 'n')||(LA6_16 >= 'p' && LA6_16 <= 'z')) ) {
                    alt6=11;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 16, input);

                    throw nvae;

                }
            }
            else if ( (LA6_7=='-'||(LA6_7 >= 'A' && LA6_7 <= 'Z')||LA6_7=='_'||(LA6_7 >= 'a' && LA6_7 <= 'g')||(LA6_7 >= 'i' && LA6_7 <= 'z')) ) {
                alt6=11;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 7, input);

                throw nvae;

            }
            }
            break;
        case 'o':
            {
            int LA6_8 = input.LA(2);

            if ( (LA6_8=='r') ) {
                int LA6_17 = input.LA(3);

                if ( (LA6_17=='-'||(LA6_17 >= 'A' && LA6_17 <= 'Z')||LA6_17=='_'||(LA6_17 >= 'a' && LA6_17 <= 'z')) ) {
                    alt6=11;
                }
                else {
                    alt6=8;
                }
            }
            else if ( (LA6_8=='-'||(LA6_8 >= 'A' && LA6_8 <= 'Z')||LA6_8=='_'||(LA6_8 >= 'a' && LA6_8 <= 'q')||(LA6_8 >= 's' && LA6_8 <= 'z')) ) {
                alt6=11;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 8, input);

                throw nvae;

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
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt6=13;
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
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;

        }

        switch (alt6) {
            case 1 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:10: T__22
                {
                mT__22(); 


                }
                break;
            case 2 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:16: T__23
                {
                mT__23(); 


                }
                break;
            case 3 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:22: T__24
                {
                mT__24(); 


                }
                break;
            case 4 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:28: T__25
                {
                mT__25(); 


                }
                break;
            case 5 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:34: T__26
                {
                mT__26(); 


                }
                break;
            case 6 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:40: T__27
                {
                mT__27(); 


                }
                break;
            case 7 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:46: T__28
                {
                mT__28(); 


                }
                break;
            case 8 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:52: T__29
                {
                mT__29(); 


                }
                break;
            case 9 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:58: T__30
                {
                mT__30(); 


                }
                break;
            case 10 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:64: T__31
                {
                mT__31(); 


                }
                break;
            case 11 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:70: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 12 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:81: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 13 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:88: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 14 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:99: SINGLELINE_COMMENT
                {
                mSINGLELINE_COMMENT(); 


                }
                break;
            case 15 :
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:1:118: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 


                }
                break;

        }

    }


 

}