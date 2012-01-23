// $ANTLR 3.4 D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g 2012-01-23 01:05:53

package reader.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int ATTACKS=4;
    public static final int COMMENTS=5;
    public static final int CONDITIONS=6;
    public static final int IDENT=7;
    public static final int MOVES=8;
    public static final int STRENGTHS=9;
    public static final int TWODIGITS=10;
    public static final int WHITESPACE=11;

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
    public String getGrammarFileName() { return "D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:11:7: ( ')' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:11:9: ')'
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:12:7: ( '=' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:12:9: '='
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:13:7: ( '[' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:13:9: '['
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:14:7: ( ']' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:14:9: ']'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:15:7: ( 'always' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:15:9: 'always'
            {
            match("always"); 



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
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:7: ( 'and' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:9: 'and'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:17:7: ( 'choose(' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:17:9: 'choose('
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:18:7: ( 'or' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:18:9: 'or'
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:19:7: ( '{' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:19:9: '{'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:20:7: ( '}' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:20:9: '}'
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
    // $ANTLR end "T__21"

    // $ANTLR start "CONDITIONS"
    public final void mCONDITIONS() throws RecognitionException {
        try {
            int _type = CONDITIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:77:3: ( ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' ) )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:78:3: ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' )
            {
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:78:3: ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt1=1;
                }
                break;
            case 'w':
                {
                alt1=2;
                }
                break;
            case 'm':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='u') ) {
                    int LA1_8 = input.LA(3);

                    if ( (LA1_8=='c') ) {
                        int LA1_9 = input.LA(4);

                        if ( (LA1_9=='h') ) {
                            int LA1_10 = input.LA(5);

                            if ( (LA1_10=='_') ) {
                                int LA1_11 = input.LA(6);

                                if ( (LA1_11=='s') ) {
                                    alt1=3;
                                }
                                else if ( (LA1_11=='w') ) {
                                    alt1=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 11, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 8, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'e':
                {
                alt1=5;
                }
                break;
            case 'n':
                {
                alt1=6;
                }
                break;
            case 'f':
                {
                alt1=7;
                }
                break;
            case 'a':
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:79:5: 'stronger'
                    {
                    match("stronger"); 



                    }
                    break;
                case 2 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:80:7: 'weaker'
                    {
                    match("weaker"); 



                    }
                    break;
                case 3 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:81:7: 'much_stronger'
                    {
                    match("much_stronger"); 



                    }
                    break;
                case 4 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:82:7: 'much_weaker'
                    {
                    match("much_weaker"); 



                    }
                    break;
                case 5 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:83:7: 'even'
                    {
                    match("even"); 



                    }
                    break;
                case 6 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:84:7: 'near'
                    {
                    match("near"); 



                    }
                    break;
                case 7 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:85:7: 'far'
                    {
                    match("far"); 



                    }
                    break;
                case 8 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:86:7: 'always'
                    {
                    match("always"); 



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
    // $ANTLR end "CONDITIONS"

    // $ANTLR start "MOVES"
    public final void mMOVES() throws RecognitionException {
        try {
            int _type = MOVES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:91:3: ( ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' ) )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:92:3: ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' )
            {
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:92:3: ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 'j':
                {
                alt2=1;
                }
                break;
            case 'c':
                {
                alt2=2;
                }
                break;
            case 's':
                {
                alt2=3;
                }
                break;
            case 'r':
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4=='u') ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6=='n') ) {
                        int LA2_8 = input.LA(4);

                        if ( (LA2_8=='_') ) {
                            int LA2_10 = input.LA(5);

                            if ( (LA2_10=='t') ) {
                                alt2=4;
                            }
                            else if ( (LA2_10=='a') ) {
                                alt2=5;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }
                }
                break;
            case 'w':
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5=='a') ) {
                    int LA2_7 = input.LA(3);

                    if ( (LA2_7=='l') ) {
                        int LA2_9 = input.LA(4);

                        if ( (LA2_9=='k') ) {
                            int LA2_11 = input.LA(5);

                            if ( (LA2_11=='_') ) {
                                int LA2_14 = input.LA(6);

                                if ( (LA2_14=='t') ) {
                                    alt2=6;
                                }
                                else if ( (LA2_14=='a') ) {
                                    alt2=7;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 14, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 11, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:93:5: 'jump'
                    {
                    match("jump"); 



                    }
                    break;
                case 2 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:94:7: 'crouch'
                    {
                    match("crouch"); 



                    }
                    break;
                case 3 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:95:7: 'stand'
                    {
                    match("stand"); 



                    }
                    break;
                case 4 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:96:7: 'run_towards'
                    {
                    match("run_towards"); 



                    }
                    break;
                case 5 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:97:7: 'run_away'
                    {
                    match("run_away"); 



                    }
                    break;
                case 6 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:98:7: 'walk_towards'
                    {
                    match("walk_towards"); 



                    }
                    break;
                case 7 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:99:7: 'walk_away'
                    {
                    match("walk_away"); 



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
    // $ANTLR end "MOVES"

    // $ANTLR start "ATTACKS"
    public final void mATTACKS() throws RecognitionException {
        try {
            int _type = ATTACKS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:104:3: ( ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' ) )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:105:3: ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' )
            {
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:105:3: ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 'p':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='u') ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4=='n') ) {
                        int LA3_7 = input.LA(4);

                        if ( (LA3_7=='c') ) {
                            int LA3_10 = input.LA(5);

                            if ( (LA3_10=='h') ) {
                                int LA3_13 = input.LA(6);

                                if ( (LA3_13=='_') ) {
                                    int LA3_16 = input.LA(7);

                                    if ( (LA3_16=='l') ) {
                                        alt3=1;
                                    }
                                    else if ( (LA3_16=='h') ) {
                                        alt3=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 16, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 13, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 7, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'k':
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='i') ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5=='c') ) {
                        int LA3_8 = input.LA(4);

                        if ( (LA3_8=='k') ) {
                            int LA3_11 = input.LA(5);

                            if ( (LA3_11=='_') ) {
                                int LA3_14 = input.LA(6);

                                if ( (LA3_14=='l') ) {
                                    alt3=3;
                                }
                                else if ( (LA3_14=='h') ) {
                                    alt3=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 14, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 11, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'b':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='l') ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6=='o') ) {
                        int LA3_9 = input.LA(4);

                        if ( (LA3_9=='c') ) {
                            int LA3_12 = input.LA(5);

                            if ( (LA3_12=='k') ) {
                                int LA3_15 = input.LA(6);

                                if ( (LA3_15=='_') ) {
                                    int LA3_19 = input.LA(7);

                                    if ( (LA3_19=='l') ) {
                                        alt3=5;
                                    }
                                    else if ( (LA3_19=='h') ) {
                                        alt3=6;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 19, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 15, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 12, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:106:5: 'punch_low'
                    {
                    match("punch_low"); 



                    }
                    break;
                case 2 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:107:7: 'punch_high'
                    {
                    match("punch_high"); 



                    }
                    break;
                case 3 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:108:7: 'kick_low'
                    {
                    match("kick_low"); 



                    }
                    break;
                case 4 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:109:7: 'kick_high'
                    {
                    match("kick_high"); 



                    }
                    break;
                case 5 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:110:7: 'block_low'
                    {
                    match("block_low"); 



                    }
                    break;
                case 6 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:111:7: 'block_high'
                    {
                    match("block_high"); 



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
    // $ANTLR end "ATTACKS"

    // $ANTLR start "STRENGTHS"
    public final void mSTRENGTHS() throws RecognitionException {
        try {
            int _type = STRENGTHS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:116:3: ( ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' ) )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:117:3: ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' )
            {
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:117:3: ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='p') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='u') ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3=='n') ) {
                        int LA4_5 = input.LA(4);

                        if ( (LA4_5=='c') ) {
                            int LA4_7 = input.LA(5);

                            if ( (LA4_7=='h') ) {
                                int LA4_9 = input.LA(6);

                                if ( (LA4_9=='R') ) {
                                    alt4=1;
                                }
                                else if ( (LA4_9=='P') ) {
                                    alt4=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 9, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 7, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0=='k') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='i') ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4=='c') ) {
                        int LA4_6 = input.LA(4);

                        if ( (LA4_6=='k') ) {
                            int LA4_8 = input.LA(5);

                            if ( (LA4_8=='R') ) {
                                alt4=2;
                            }
                            else if ( (LA4_8=='P') ) {
                                alt4=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:118:5: 'punchReach'
                    {
                    match("punchReach"); 



                    }
                    break;
                case 2 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:119:7: 'kickReach'
                    {
                    match("kickReach"); 



                    }
                    break;
                case 3 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:120:7: 'kickPower'
                    {
                    match("kickPower"); 



                    }
                    break;
                case 4 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:121:7: 'punchPower'
                    {
                    match("punchPower"); 



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
    // $ANTLR end "STRENGTHS"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:126:3: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )* )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:127:3: ( 'A' .. 'Z' | 'a' .. 'z' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:131:3: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop5;
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

    // $ANTLR start "TWODIGITS"
    public final void mTWODIGITS() throws RecognitionException {
        try {
            int _type = TWODIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:139:3: ( '0' .. '9' ( '0' .. '9' )? )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:140:3: '0' .. '9' ( '0' .. '9' )?
            {
            matchRange('0','9'); 

            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:140:12: ( '0' .. '9' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:
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

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TWODIGITS"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:146:3: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:147:3: ( '\\t' | ' ' | '\\r' | '\\n' )+
            {
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:147:3: ( '\\t' | ' ' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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

    // $ANTLR start "COMMENTS"
    public final void mCOMMENTS() throws RecognitionException {
        try {
            int _type = COMMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:160:3: ( ( '/*' ( options {greedy=false; } : . )* '*/' || '//' ( . )* ( '\\n' | '\\r' ) ) )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:161:3: ( '/*' ( options {greedy=false; } : . )* '*/' || '//' ( . )* ( '\\n' | '\\r' ) )
            {
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:161:3: ( '/*' ( options {greedy=false; } : . )* '*/' || '//' ( . )* ( '\\n' | '\\r' ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='/') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='*') ) {
                    alt10=1;
                }
                else if ( (LA10_1=='/') ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:162:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:162:10: ( options {greedy=false; } : . )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='*') ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1=='/') ) {
                                alt8=2;
                            }
                            else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:162:36: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    match("*/"); 



                    }
                    break;
                case 2 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:164:5: 
                    {
                    }
                    break;
                case 3 :
                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:164:7: '//' ( . )* ( '\\n' | '\\r' )
                    {
                    match("//"); 



                    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:164:12: ( . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                            alt9=2;
                        }
                        else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:164:12: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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


                    }
                    break;

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
    // $ANTLR end "COMMENTS"

    public void mTokens() throws RecognitionException {
        // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | CONDITIONS | MOVES | ATTACKS | STRENGTHS | IDENT | TWODIGITS | WHITESPACE | COMMENTS )
        int alt11=18;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:40: T__17
                {
                mT__17(); 


                }
                break;
            case 7 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:46: T__18
                {
                mT__18(); 


                }
                break;
            case 8 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:52: T__19
                {
                mT__19(); 


                }
                break;
            case 9 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:58: T__20
                {
                mT__20(); 


                }
                break;
            case 10 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:64: T__21
                {
                mT__21(); 


                }
                break;
            case 11 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:70: CONDITIONS
                {
                mCONDITIONS(); 


                }
                break;
            case 12 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:81: MOVES
                {
                mMOVES(); 


                }
                break;
            case 13 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:87: ATTACKS
                {
                mATTACKS(); 


                }
                break;
            case 14 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:95: STRENGTHS
                {
                mSTRENGTHS(); 


                }
                break;
            case 15 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:105: IDENT
                {
                mIDENT(); 


                }
                break;
            case 16 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:111: TWODIGITS
                {
                mTWODIGITS(); 


                }
                break;
            case 17 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:121: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 18 :
                // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:1:132: COMMENTS
                {
                mCOMMENTS(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\30\4\uffff\3\25\2\uffff\13\25\4\uffff\4\25\1\56\15\25\1\75\2"+
        "\25\1\uffff\7\25\1\107\6\25\1\uffff\7\25\2\107\1\uffff\1\111\1\uffff"+
        "\7\25\1\111\2\25\1\uffff\3\25\1\141\1\25\1\111\1\25\1\107\4\25\2"+
        "\uffff\5\25\1\107\6\25\4\163\1\uffff";
    static final String DFA11_eofS =
        "\164\uffff";
    static final String DFA11_minS =
        "\1\11\4\uffff\1\154\1\150\1\162\2\uffff\1\164\1\141\1\165\1\166"+
        "\1\145\1\141\3\165\1\151\1\154\4\uffff\1\167\1\144\2\157\1\60\2"+
        "\141\1\154\1\143\1\145\1\141\1\162\1\155\2\156\1\143\1\157\1\141"+
        "\1\60\1\157\1\165\1\uffff\1\157\1\156\2\153\1\150\1\156\1\162\1"+
        "\60\1\160\1\137\1\143\1\153\1\143\1\171\1\uffff\1\163\1\143\1\156"+
        "\1\144\1\145\2\137\2\60\1\uffff\1\60\1\uffff\1\150\1\120\1\153\1"+
        "\163\1\145\1\150\1\147\1\60\1\162\1\120\1\uffff\1\145\1\157\1\137"+
        "\1\60\1\50\1\60\1\145\1\60\1\145\1\157\1\141\1\167\2\uffff\1\162"+
        "\1\141\1\167\1\143\1\145\1\60\1\143\1\145\1\150\1\162\1\150\1\162"+
        "\4\60\1\uffff";
    static final String DFA11_maxS =
        "\1\175\4\uffff\1\156\2\162\2\uffff\1\164\1\145\1\165\1\166\1\145"+
        "\1\141\3\165\1\151\1\154\4\uffff\1\167\1\144\2\157\1\172\1\162\1"+
        "\141\1\154\1\143\1\145\1\141\1\162\1\155\2\156\1\143\1\157\1\141"+
        "\1\172\1\157\1\165\1\uffff\1\157\1\156\2\153\1\150\1\156\1\162\1"+
        "\172\1\160\1\137\1\143\1\153\1\143\1\171\1\uffff\1\163\1\143\1\156"+
        "\1\144\1\145\2\137\2\172\1\uffff\1\172\1\uffff\1\150\1\137\1\153"+
        "\1\163\1\145\1\150\1\147\1\172\1\162\1\137\1\uffff\1\145\1\157\1"+
        "\137\1\172\1\50\1\172\1\145\1\172\1\145\1\157\1\141\1\167\2\uffff"+
        "\1\162\1\141\1\167\1\143\1\145\1\172\1\143\1\145\1\150\1\162\1\150"+
        "\1\162\4\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\11\1\12\13\uffff\1\17\1\20\1"+
        "\21\1\22\25\uffff\1\10\16\uffff\1\6\11\uffff\1\13\1\uffff\1\14\12"+
        "\uffff\1\15\14\uffff\1\5\1\7\20\uffff\1\16";
    static final String DFA11_specialS =
        "\164\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\10\uffff\1\1\6\uffff\12\26"+
            "\3\uffff\1\2\3\uffff\32\25\1\3\1\uffff\1\4\3\uffff\1\5\1\24"+
            "\1\6\1\25\1\15\1\17\3\25\1\20\1\23\1\25\1\14\1\16\1\7\1\22\1"+
            "\25\1\21\1\12\3\25\1\13\3\25\1\10\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\31\1\uffff\1\32",
            "\1\33\11\uffff\1\34",
            "\1\35",
            "",
            "",
            "\1\36",
            "\1\40\3\uffff\1\37",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\60\20\uffff\1\57",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\111",
            "\1\107",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "",
            "\1\123",
            "\1\126\1\uffff\1\125\14\uffff\1\124",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\134",
            "\1\136\1\uffff\1\135\14\uffff\1\124",
            "",
            "\1\137",
            "\1\140",
            "\1\124",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\142",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\143",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            "\12\25\7\uffff\32\25\6\uffff\32\25",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | CONDITIONS | MOVES | ATTACKS | STRENGTHS | IDENT | TWODIGITS | WHITESPACE | COMMENTS );";
        }
    }
 

}