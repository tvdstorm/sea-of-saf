// $ANTLR 3.4 C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g 2012-01-31 13:27:02

  package saf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "IDENT", "LEFT_BRACK", "LEFT_CURLY", "LEFT_PAREN", "LETTER", "RIGHT_BRACK", "RIGHT_CURLY", "RIGHT_PAREN", "WS", "'='", "'choose'"
    };

    public static final int EOF=-1;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int DIGIT=4;
    public static final int IDENT=5;
    public static final int LEFT_BRACK=6;
    public static final int LEFT_CURLY=7;
    public static final int LEFT_PAREN=8;
    public static final int LETTER=9;
    public static final int RIGHT_BRACK=10;
    public static final int RIGHT_CURLY=11;
    public static final int RIGHT_PAREN=12;
    public static final int WS=13;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SAFParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SAFParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SAFParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g"; }



    // $ANTLR start "program"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:15:1: program : IDENT LEFT_CURLY personality behaviour RIGHT_CURLY ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:16:2: ( IDENT LEFT_CURLY personality behaviour RIGHT_CURLY )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:16:4: IDENT LEFT_CURLY personality behaviour RIGHT_CURLY
            {
            match(input,IDENT,FOLLOW_IDENT_in_program40); 

            match(input,LEFT_CURLY,FOLLOW_LEFT_CURLY_in_program42); 

            pushFollow(FOLLOW_personality_in_program47);
            personality();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_in_program52);
            behaviour();

            state._fsp--;


            match(input,RIGHT_CURLY,FOLLOW_RIGHT_CURLY_in_program56); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "personality"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:22:1: personality : ( characteristic )* ;
    public final void personality() throws RecognitionException {
        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:23:2: ( ( characteristic )* )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:23:4: ( characteristic )*
            {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:23:4: ( characteristic )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==14) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:23:4: characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_personality67);
            	    characteristic();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "personality"



    // $ANTLR start "characteristic"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:26:1: characteristic : IDENT '=' DIGIT ;
    public final void characteristic() throws RecognitionException {
        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:27:2: ( IDENT '=' DIGIT )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:27:4: IDENT '=' DIGIT
            {
            match(input,IDENT,FOLLOW_IDENT_in_characteristic80); 

            match(input,14,FOLLOW_14_in_characteristic82); 

            match(input,DIGIT,FOLLOW_DIGIT_in_characteristic84); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "characteristic"



    // $ANTLR start "behaviour"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:30:1: behaviour : ( rule )+ ;
    public final void behaviour() throws RecognitionException {
        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:31:2: ( ( rule )+ )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:31:4: ( rule )+
            {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:31:4: ( rule )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:31:4: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_behaviour95);
            	    rule();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "behaviour"



    // $ANTLR start "rule"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:34:1: rule : IDENT LEFT_BRACK action action RIGHT_BRACK ;
    public final void rule() throws RecognitionException {
        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:35:2: ( IDENT LEFT_BRACK action action RIGHT_BRACK )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:35:4: IDENT LEFT_BRACK action action RIGHT_BRACK
            {
            match(input,IDENT,FOLLOW_IDENT_in_rule108); 

            match(input,LEFT_BRACK,FOLLOW_LEFT_BRACK_in_rule110); 

            pushFollow(FOLLOW_action_in_rule112);
            action();

            state._fsp--;


            pushFollow(FOLLOW_action_in_rule114);
            action();

            state._fsp--;


            match(input,RIGHT_BRACK,FOLLOW_RIGHT_BRACK_in_rule116); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "rule"



    // $ANTLR start "action"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:38:1: action : ( 'choose' LEFT_PAREN IDENT ( IDENT )+ RIGHT_PAREN | IDENT );
    public final void action() throws RecognitionException {
        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:39:2: ( 'choose' LEFT_PAREN IDENT ( IDENT )+ RIGHT_PAREN | IDENT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==IDENT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:39:4: 'choose' LEFT_PAREN IDENT ( IDENT )+ RIGHT_PAREN
                    {
                    match(input,15,FOLLOW_15_in_action128); 

                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_action130); 

                    match(input,IDENT,FOLLOW_IDENT_in_action132); 

                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:39:30: ( IDENT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==IDENT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:39:30: IDENT
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_action134); 

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


                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_action137); 

                    }
                    break;
                case 2 :
                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:40:4: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_action142); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "action"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_program40 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_CURLY_in_program42 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_personality_in_program47 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_behaviour_in_program52 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_CURLY_in_program56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_personality67 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENT_in_characteristic80 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_characteristic82 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DIGIT_in_characteristic84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_behaviour95 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENT_in_rule108 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LEFT_BRACK_in_rule110 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_action_in_rule112 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_action_in_rule114 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_BRACK_in_rule116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_action128 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_action130 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action134 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_action137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action142 = new BitSet(new long[]{0x0000000000000002L});

}