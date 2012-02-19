// $ANTLR 3.4 C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g 2012-02-19 07:16:01

  package saf;
  import saf.evaluators.*;
  import saf.models.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "DIGIT", "IDENT", "LEFT_BRACK", "LEFT_CURLY", "LEFT_PAREN", "LETTER", "OR", "RIGHT_BRACK", "RIGHT_CURLY", "RIGHT_PAREN", "WS", "'='", "'choose'"
    };

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


        Fighter fighter;
        List<Characteristic> personality = new ArrayList<Characteristic>();
        List<Rule> behaviour = new ArrayList<Rule>();



    // $ANTLR start "fighter"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:23:1: fighter returns [Fighter fighter] : IDENT LEFT_CURLY personality behaviour RIGHT_CURLY ;
    public final Fighter fighter() throws RecognitionException {
        Fighter fighter = null;


        Token IDENT1=null;

        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:24:2: ( IDENT LEFT_CURLY personality behaviour RIGHT_CURLY )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:24:4: IDENT LEFT_CURLY personality behaviour RIGHT_CURLY
            {
            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter53); 

            match(input,LEFT_CURLY,FOLLOW_LEFT_CURLY_in_fighter55); 

            pushFollow(FOLLOW_personality_in_fighter60);
            personality();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_in_fighter65);
            behaviour();

            state._fsp--;


            match(input,RIGHT_CURLY,FOLLOW_RIGHT_CURLY_in_fighter69); 

             
            	        String fightername = (IDENT1!=null?IDENT1.getText():null);
            	        Personality personality = new Personality(this.personality);
            	        Behaviour behaviour = new Behaviour(this.behaviour);
            	        
            	        fighter = new Fighter(fightername, personality, behaviour);
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return fighter;
    }
    // $ANTLR end "fighter"



    // $ANTLR start "personality"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:37:1: personality : ( characteristic )* ;
    public final void personality() throws RecognitionException {
        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:38:2: ( ( characteristic )* )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:38:4: ( characteristic )*
            {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:38:4: ( characteristic )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==16) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:38:4: characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_personality84);
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
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:41:1: characteristic : IDENT '=' DIGIT ;
    public final void characteristic() throws RecognitionException {
        Token IDENT2=null;
        Token DIGIT3=null;

        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:42:2: ( IDENT '=' DIGIT )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:42:4: IDENT '=' DIGIT
            {
            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_characteristic97); 

            match(input,16,FOLLOW_16_in_characteristic99); 

            DIGIT3=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_characteristic101); 


            	        Characteristic characteristic = new Characteristic((IDENT2!=null?IDENT2.getText():null), Integer.parseInt((DIGIT3!=null?DIGIT3.getText():null)));
            	        this.personality.add(characteristic);
            	    

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
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:49:1: behaviour : ( rule )+ ;
    public final void behaviour() throws RecognitionException {
        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:50:2: ( ( rule )+ )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:50:4: ( rule )+
            {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:50:4: ( rule )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT||LA2_0==LEFT_PAREN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:50:4: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_behaviour116);
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
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:53:1: rule : condition LEFT_BRACK a1= actions a2= actions RIGHT_BRACK ;
    public final void rule() throws RecognitionException {
        List<String> a1 =null;

        List<String> a2 =null;

        Condition condition4 =null;


        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:54:2: ( condition LEFT_BRACK a1= actions a2= actions RIGHT_BRACK )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:54:4: condition LEFT_BRACK a1= actions a2= actions RIGHT_BRACK
            {
            pushFollow(FOLLOW_condition_in_rule129);
            condition4=condition();

            state._fsp--;


            match(input,LEFT_BRACK,FOLLOW_LEFT_BRACK_in_rule131); 

            pushFollow(FOLLOW_actions_in_rule135);
            a1=actions();

            state._fsp--;


            pushFollow(FOLLOW_actions_in_rule139);
            a2=actions();

            state._fsp--;


            match(input,RIGHT_BRACK,FOLLOW_RIGHT_BRACK_in_rule141); 


            	        Rule rule = new Rule(condition4,
            	        					new Move(a1), 
            	                            new Attack(a2));
            	        this.behaviour.add(rule);
            	    

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



    // $ANTLR start "actions"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:63:1: actions returns [List<String> actions] : ( 'choose' LEFT_PAREN i1= action[$actions] (i2= action[$actions] )+ RIGHT_PAREN |a= IDENT );
    public final List<String> actions() throws RecognitionException {
        List<String> actions = null;


        Token a=null;

        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:64:2: ( 'choose' LEFT_PAREN i1= action[$actions] (i2= action[$actions] )+ RIGHT_PAREN |a= IDENT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
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
                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:64:4: 'choose' LEFT_PAREN i1= action[$actions] (i2= action[$actions] )+ RIGHT_PAREN
                    {

                    			actions = new ArrayList<String>();
                    		

                    match(input,17,FOLLOW_17_in_actions165); 

                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_actions167); 

                    pushFollow(FOLLOW_action_in_actions171);
                    action(actions);

                    state._fsp--;


                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:67:45: (i2= action[$actions] )+
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
                    	    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:67:45: i2= action[$actions]
                    	    {
                    	    pushFollow(FOLLOW_action_in_actions176);
                    	    action(actions);

                    	    state._fsp--;


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


                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_actions180); 

                    }
                    break;
                case 2 :
                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:68:4: a= IDENT
                    {
                    a=(Token)match(input,IDENT,FOLLOW_IDENT_in_actions187); 


                    			actions = new ArrayList<String>();
                    			actions.add((a!=null?a.getText():null));
                    		

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
        return actions;
    }
    // $ANTLR end "actions"



    // $ANTLR start "action"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:75:1: action[List<String> actions] : a= IDENT ;
    public final void action(List<String> actions) throws RecognitionException {
        Token a=null;

        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:76:2: (a= IDENT )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:76:4: a= IDENT
            {
            a=(Token)match(input,IDENT,FOLLOW_IDENT_in_action206); 


            			actions.add((a!=null?a.getText():null));
            		

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



    // $ANTLR start "condition"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:82:1: condition returns [Condition condition] : ( '(' c1= condition (op= AND |op= OR ) c2= condition ')' | IDENT );
    public final Condition condition() throws RecognitionException {
        Condition condition = null;


        Token op=null;
        Token IDENT5=null;
        Condition c1 =null;

        Condition c2 =null;


        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:83:5: ( '(' c1= condition (op= AND |op= OR ) c2= condition ')' | IDENT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LEFT_PAREN) ) {
                alt6=1;
            }
            else if ( (LA6_0==IDENT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:83:7: '(' c1= condition (op= AND |op= OR ) c2= condition ')'
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_condition228); 

                    pushFollow(FOLLOW_condition_in_condition232);
                    c1=condition();

                    state._fsp--;


                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:83:24: (op= AND |op= OR )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==AND) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==OR) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:83:25: op= AND
                            {
                            op=(Token)match(input,AND,FOLLOW_AND_in_condition237); 

                            }
                            break;
                        case 2 :
                            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:83:34: op= OR
                            {
                            op=(Token)match(input,OR,FOLLOW_OR_in_condition243); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_condition_in_condition248);
                    c2=condition();

                    state._fsp--;


                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_condition250); 


                    	        if ((op!=null?op.getText():null).equals("and"))
                    	        {
                    	            condition = new ConditionAnd(c1, c2);
                    	        } 
                    	        else
                    	        {
                    	            condition = new ConditionOr(c1, c2);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:94:7: IDENT
                    {
                    IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition265); 

                     condition = new ConditionSingle((IDENT5!=null?IDENT5.getText():null)); 

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
        return condition;
    }
    // $ANTLR end "condition"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighter53 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LEFT_CURLY_in_fighter55 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_personality_in_fighter60 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_behaviour_in_fighter65 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_CURLY_in_fighter69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_personality84 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENT_in_characteristic97 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_characteristic99 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DIGIT_in_characteristic101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_behaviour116 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_condition_in_rule129 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACK_in_rule131 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_actions_in_rule135 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_actions_in_rule139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_BRACK_in_rule141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_actions165 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_actions167 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_action_in_actions171 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_action_in_actions176 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_actions180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_actions187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_condition228 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_condition_in_condition232 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_AND_in_condition237 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_OR_in_condition243 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_condition_in_condition248 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_condition250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition265 = new BitSet(new long[]{0x0000000000000002L});

}