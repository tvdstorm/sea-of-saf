// $ANTLR 3.4 D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g 2012-01-20 18:54:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class saf1Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int Characteristic=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int NEWLINE=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public saf1Lexer() {} 
    public saf1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public saf1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:2:6: ( '(' )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:2:8: '('
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:3:7: ( ')' )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:3:9: ')'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:4:7: ( '*' )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:4:9: '*'
            {
            match('*'); 

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
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:5:7: ( '+' )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:5:9: '+'
            {
            match('+'); 

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
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:6:7: ( '-' )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:6:9: '-'
            {
            match('-'); 

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
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:7:7: ( '=' )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:7:9: '='
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
    // $ANTLR end "T__14"

    // $ANTLR start "Characteristic"
    public final void mCharacteristic() throws RecognitionException {
        try {
            int _type = Characteristic;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken value=null;

            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:28:15: ( 'punchReach' '=' value= INT ( '\\r' )? '\\n' | 'punchPower' '=' value= INT ( '\\r' )? '\\n' | 'kickReach' '=' value= INT ( '\\r' )? '\\n' | 'kickPower' '=' value= INT ( '\\r' )? '\\n' )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='p') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='u') ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3=='n') ) {
                        int LA5_5 = input.LA(4);

                        if ( (LA5_5=='c') ) {
                            int LA5_7 = input.LA(5);

                            if ( (LA5_7=='h') ) {
                                int LA5_9 = input.LA(6);

                                if ( (LA5_9=='R') ) {
                                    alt5=1;
                                }
                                else if ( (LA5_9=='P') ) {
                                    alt5=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 9, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 7, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA5_0=='k') ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='i') ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4=='c') ) {
                        int LA5_6 = input.LA(4);

                        if ( (LA5_6=='k') ) {
                            int LA5_8 = input.LA(5);

                            if ( (LA5_8=='R') ) {
                                alt5=3;
                            }
                            else if ( (LA5_8=='P') ) {
                                alt5=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:29:3: 'punchReach' '=' value= INT ( '\\r' )? '\\n'
                    {
                    match("punchReach"); 



                    match('='); 

                    int valueStart69 = getCharIndex();
                    int valueStartLine69 = getLine();
                    int valueStartCharPos69 = getCharPositionInLine();
                    mINT(); 
                    value = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, valueStart69, getCharIndex()-1);
                    value.setLine(valueStartLine69);
                    value.setCharPositionInLine(valueStartCharPos69);


                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:29:30: ( '\\r' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='\r') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:29:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }
                    break;
                case 2 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:30:4: 'punchPower' '=' value= INT ( '\\r' )? '\\n'
                    {
                    match("punchPower"); 



                    match('='); 

                    int valueStart85 = getCharIndex();
                    int valueStartLine85 = getLine();
                    int valueStartCharPos85 = getCharPositionInLine();
                    mINT(); 
                    value = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, valueStart85, getCharIndex()-1);
                    value.setLine(valueStartLine85);
                    value.setCharPositionInLine(valueStartCharPos85);


                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:30:31: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:30:31: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }
                    break;
                case 3 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:31:4: 'kickReach' '=' value= INT ( '\\r' )? '\\n'
                    {
                    match("kickReach"); 



                    match('='); 

                    int valueStart101 = getCharIndex();
                    int valueStartLine101 = getLine();
                    int valueStartCharPos101 = getCharPositionInLine();
                    mINT(); 
                    value = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, valueStart101, getCharIndex()-1);
                    value.setLine(valueStartLine101);
                    value.setCharPositionInLine(valueStartCharPos101);


                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:31:30: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:31:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }
                    break;
                case 4 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:32:4: 'kickPower' '=' value= INT ( '\\r' )? '\\n'
                    {
                    match("kickPower"); 



                    match('='); 

                    int valueStart117 = getCharIndex();
                    int valueStartLine117 = getLine();
                    int valueStartCharPos117 = getCharPositionInLine();
                    mINT(); 
                    value = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, valueStart117, getCharIndex()-1);
                    value.setLine(valueStartLine117);
                    value.setCharPositionInLine(valueStartCharPos117);


                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:32:30: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:32:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Characteristic"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:36:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:36:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:36:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:
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
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:37:5: ( ( '0' .. '9' )+ )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:37:9: ( '0' .. '9' )+
            {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:37:9: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:38:8: ( ( '\\r' )? '\\n' )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:38:9: ( '\\r' )? '\\n'
            {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:38:9: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:38:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:39:5: ( ( ' ' | '\\t' )+ )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:39:9: ( ' ' | '\\t' )+
            {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:39:9: ( ' ' | '\\t' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\t'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            skip();

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
        // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | Characteristic | ID | INT | NEWLINE | WS )
        int alt10=11;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt10=1;
            }
            break;
        case ')':
            {
            alt10=2;
            }
            break;
        case '*':
            {
            alt10=3;
            }
            break;
        case '+':
            {
            alt10=4;
            }
            break;
        case '-':
            {
            alt10=5;
            }
            break;
        case '=':
            {
            alt10=6;
            }
            break;
        case 'p':
            {
            int LA10_7 = input.LA(2);

            if ( (LA10_7=='u') ) {
                int LA10_13 = input.LA(3);

                if ( (LA10_13=='n') ) {
                    int LA10_15 = input.LA(4);

                    if ( (LA10_15=='c') ) {
                        int LA10_17 = input.LA(5);

                        if ( (LA10_17=='h') ) {
                            switch ( input.LA(6) ) {
                            case 'R':
                                {
                                int LA10_22 = input.LA(7);

                                if ( (LA10_22=='e') ) {
                                    int LA10_26 = input.LA(8);

                                    if ( (LA10_26=='a') ) {
                                        int LA10_30 = input.LA(9);

                                        if ( (LA10_30=='c') ) {
                                            int LA10_34 = input.LA(10);

                                            if ( (LA10_34=='h') ) {
                                                int LA10_38 = input.LA(11);

                                                if ( (LA10_38=='=') ) {
                                                    alt10=7;
                                                }
                                                else {
                                                    alt10=8;
                                                }
                                            }
                                            else {
                                                alt10=8;
                                            }
                                        }
                                        else {
                                            alt10=8;
                                        }
                                    }
                                    else {
                                        alt10=8;
                                    }
                                }
                                else {
                                    alt10=8;
                                }
                                }
                                break;
                            case 'P':
                                {
                                int LA10_23 = input.LA(7);

                                if ( (LA10_23=='o') ) {
                                    int LA10_27 = input.LA(8);

                                    if ( (LA10_27=='w') ) {
                                        int LA10_31 = input.LA(9);

                                        if ( (LA10_31=='e') ) {
                                            int LA10_35 = input.LA(10);

                                            if ( (LA10_35=='r') ) {
                                                int LA10_39 = input.LA(11);

                                                if ( (LA10_39=='=') ) {
                                                    alt10=7;
                                                }
                                                else {
                                                    alt10=8;
                                                }
                                            }
                                            else {
                                                alt10=8;
                                            }
                                        }
                                        else {
                                            alt10=8;
                                        }
                                    }
                                    else {
                                        alt10=8;
                                    }
                                }
                                else {
                                    alt10=8;
                                }
                                }
                                break;
                            default:
                                alt10=8;
                            }

                        }
                        else {
                            alt10=8;
                        }
                    }
                    else {
                        alt10=8;
                    }
                }
                else {
                    alt10=8;
                }
            }
            else {
                alt10=8;
            }
            }
            break;
        case 'k':
            {
            int LA10_8 = input.LA(2);

            if ( (LA10_8=='i') ) {
                int LA10_14 = input.LA(3);

                if ( (LA10_14=='c') ) {
                    int LA10_16 = input.LA(4);

                    if ( (LA10_16=='k') ) {
                        switch ( input.LA(5) ) {
                        case 'R':
                            {
                            int LA10_20 = input.LA(6);

                            if ( (LA10_20=='e') ) {
                                int LA10_24 = input.LA(7);

                                if ( (LA10_24=='a') ) {
                                    int LA10_28 = input.LA(8);

                                    if ( (LA10_28=='c') ) {
                                        int LA10_32 = input.LA(9);

                                        if ( (LA10_32=='h') ) {
                                            int LA10_36 = input.LA(10);

                                            if ( (LA10_36=='=') ) {
                                                alt10=7;
                                            }
                                            else {
                                                alt10=8;
                                            }
                                        }
                                        else {
                                            alt10=8;
                                        }
                                    }
                                    else {
                                        alt10=8;
                                    }
                                }
                                else {
                                    alt10=8;
                                }
                            }
                            else {
                                alt10=8;
                            }
                            }
                            break;
                        case 'P':
                            {
                            int LA10_21 = input.LA(6);

                            if ( (LA10_21=='o') ) {
                                int LA10_25 = input.LA(7);

                                if ( (LA10_25=='w') ) {
                                    int LA10_29 = input.LA(8);

                                    if ( (LA10_29=='e') ) {
                                        int LA10_33 = input.LA(9);

                                        if ( (LA10_33=='r') ) {
                                            int LA10_37 = input.LA(10);

                                            if ( (LA10_37=='=') ) {
                                                alt10=7;
                                            }
                                            else {
                                                alt10=8;
                                            }
                                        }
                                        else {
                                            alt10=8;
                                        }
                                    }
                                    else {
                                        alt10=8;
                                    }
                                }
                                else {
                                    alt10=8;
                                }
                            }
                            else {
                                alt10=8;
                            }
                            }
                            break;
                        default:
                            alt10=8;
                        }

                    }
                    else {
                        alt10=8;
                    }
                }
                else {
                    alt10=8;
                }
            }
            else {
                alt10=8;
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
        case 'l':
        case 'm':
        case 'n':
        case 'o':
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
            alt10=8;
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
            alt10=9;
            }
            break;
        case '\n':
        case '\r':
            {
            alt10=10;
            }
            break;
        case '\t':
        case ' ':
            {
            alt10=11;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 10, 0, input);

            throw nvae;

        }

        switch (alt10) {
            case 1 :
                // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:45: Characteristic
                {
                mCharacteristic(); 


                }
                break;
            case 8 :
                // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:60: ID
                {
                mID(); 


                }
                break;
            case 9 :
                // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:63: INT
                {
                mINT(); 


                }
                break;
            case 10 :
                // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:67: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 11 :
                // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:1:75: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}