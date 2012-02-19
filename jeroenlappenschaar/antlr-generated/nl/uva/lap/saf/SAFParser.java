// $ANTLR 3.4 D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g 2012-02-19 15:30:59

  package nl.uva.lap.saf;
  import nl.uva.lap.saf.ast.action.Action;
  import nl.uva.lap.saf.ast.action.Choose;
  import nl.uva.lap.saf.ast.Ident;
  import nl.uva.lap.saf.ast.action.SimpleAction;
  import nl.uva.lap.saf.ast.fighter.Behaviour;
  import nl.uva.lap.saf.ast.fighter.Fighter;
  import nl.uva.lap.saf.ast.fighter.Personality;
  import nl.uva.lap.saf.ast.condition.Condition;
  import nl.uva.lap.saf.ast.condition.SimpleCondition;
  import nl.uva.lap.saf.ast.condition.And;
  import nl.uva.lap.saf.ast.condition.Or;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "IDENT", "INTEGER", "MULTICOMMENT", "WS", "'('", "')'", "'='", "'['", "']'", "'and'", "'choose'", "'or'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int COMMENT=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int MULTICOMMENT=7;
    public static final int WS=8;

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
    public String getGrammarFileName() { return "D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g"; }


    	Fighter fighter;
    	List<Personality> personalities = new ArrayList<Personality>();
    	List<Behaviour> behaviours = new ArrayList<Behaviour>();



    // $ANTLR start "fighter"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:37:1: fighter returns [Fighter fighter] : name= IDENT '{' ( statement )* '}' ;
    public final Fighter fighter() throws RecognitionException {
        Fighter fighter = null;


        Token name=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:37:34: (name= IDENT '{' ( statement )* '}' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:37:36: name= IDENT '{' ( statement )* '}'
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter57); 

            match(input,17,FOLLOW_17_in_fighter59); 

            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:37:51: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT||LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:37:51: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_fighter61);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,18,FOLLOW_18_in_fighter64); 

            fighter = new Fighter((name!=null?name.getText():null), personalities, behaviours);

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



    // $ANTLR start "statement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:40:1: statement : ( personalityStatement | behaviourStatement );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:40:10: ( personalityStatement | behaviourStatement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==11) ) {
                    alt2=1;
                }
                else if ( (LA2_1==12||LA2_1==14||LA2_1==16) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==9) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:40:12: personalityStatement
                    {
                    pushFollow(FOLLOW_personalityStatement_in_statement75);
                    personalityStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:40:35: behaviourStatement
                    {
                    pushFollow(FOLLOW_behaviourStatement_in_statement79);
                    behaviourStatement();

                    state._fsp--;


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
    // $ANTLR end "statement"



    // $ANTLR start "personalityStatement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:42:1: personalityStatement : personality= IDENT '=' value= INTEGER ;
    public final void personalityStatement() throws RecognitionException {
        Token personality=null;
        Token value=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:42:21: (personality= IDENT '=' value= INTEGER )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:42:23: personality= IDENT '=' value= INTEGER
            {
            personality=(Token)match(input,IDENT,FOLLOW_IDENT_in_personalityStatement88); 

            match(input,11,FOLLOW_11_in_personalityStatement90); 

            value=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_personalityStatement94); 

            personalities.add(new Personality((personality!=null?personality.getText():null), (value!=null?value.getText():null)));

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
    // $ANTLR end "personalityStatement"



    // $ANTLR start "behaviourStatement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:45:1: behaviourStatement : cond= conditions '[' action1= actionStatement (action2= actionStatement )? ']' ;
    public final void behaviourStatement() throws RecognitionException {
        Condition cond =null;

        Action action1 =null;

        Action action2 =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:45:20: (cond= conditions '[' action1= actionStatement (action2= actionStatement )? ']' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:45:22: cond= conditions '[' action1= actionStatement (action2= actionStatement )? ']'
            {
            pushFollow(FOLLOW_conditions_in_behaviourStatement108);
            cond=conditions();

            state._fsp--;


            match(input,12,FOLLOW_12_in_behaviourStatement110); 

            pushFollow(FOLLOW_actionStatement_in_behaviourStatement114);
            action1=actionStatement();

            state._fsp--;


            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:45:73: (action2= actionStatement )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT||LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:45:73: action2= actionStatement
                    {
                    pushFollow(FOLLOW_actionStatement_in_behaviourStatement118);
                    action2=actionStatement();

                    state._fsp--;


                    }
                    break;

            }


            match(input,13,FOLLOW_13_in_behaviourStatement121); 


            		if(action2 == null)
            			behaviours.add(new Behaviour(cond, action1));
            		else
            			behaviours.add(new Behaviour(cond, action1, action2));
            	

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
    // $ANTLR end "behaviourStatement"



    // $ANTLR start "simpleCondition"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:53:1: simpleCondition returns [Condition simple] : cond= IDENT ;
    public final Condition simpleCondition() throws RecognitionException {
        Condition simple = null;


        Token cond=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:53:44: (cond= IDENT )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:53:46: cond= IDENT
            {
            cond=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleCondition138); 

            simple =new SimpleCondition((cond!=null?cond.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return simple;
    }
    // $ANTLR end "simpleCondition"



    // $ANTLR start "bracketConnectorCondition"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:54:1: bracketConnectorCondition returns [Condition mixed] : (s1= simpleCondition |s2= bracketCondition );
    public final Condition bracketConnectorCondition() throws RecognitionException {
        Condition mixed = null;


        Condition s1 =null;

        Condition s2 =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:54:52: (s1= simpleCondition |s2= bracketCondition )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENT) ) {
                alt4=1;
            }
            else if ( (LA4_0==9) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:54:54: s1= simpleCondition
                    {
                    pushFollow(FOLLOW_simpleCondition_in_bracketConnectorCondition152);
                    s1=simpleCondition();

                    state._fsp--;


                    mixed=s1;

                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:54:86: s2= bracketCondition
                    {
                    pushFollow(FOLLOW_bracketCondition_in_bracketConnectorCondition159);
                    s2=bracketCondition();

                    state._fsp--;


                    mixed=s2;

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
        return mixed;
    }
    // $ANTLR end "bracketConnectorCondition"



    // $ANTLR start "bracketCondition"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:55:1: bracketCondition returns [Condition bracket] : '(' cond= conditions ')' ;
    public final Condition bracketCondition() throws RecognitionException {
        Condition bracket = null;


        Condition cond =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:55:46: ( '(' cond= conditions ')' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:55:48: '(' cond= conditions ')'
            {
            match(input,9,FOLLOW_9_in_bracketCondition172); 

            pushFollow(FOLLOW_conditions_in_bracketCondition176);
            cond=conditions();

            state._fsp--;


            match(input,10,FOLLOW_10_in_bracketCondition178); 

            bracket=cond;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return bracket;
    }
    // $ANTLR end "bracketCondition"



    // $ANTLR start "andCondition"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:56:1: andCondition returns [Condition and] : lhs= simpleCondition 'and' rhs= bracketConnectorCondition ;
    public final Condition andCondition() throws RecognitionException {
        Condition and = null;


        Condition lhs =null;

        Condition rhs =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:56:37: (lhs= simpleCondition 'and' rhs= bracketConnectorCondition )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:56:39: lhs= simpleCondition 'and' rhs= bracketConnectorCondition
            {
            pushFollow(FOLLOW_simpleCondition_in_andCondition192);
            lhs=simpleCondition();

            state._fsp--;


            match(input,14,FOLLOW_14_in_andCondition194); 

            pushFollow(FOLLOW_bracketConnectorCondition_in_andCondition198);
            rhs=bracketConnectorCondition();

            state._fsp--;


            and = new And(lhs, rhs);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return and;
    }
    // $ANTLR end "andCondition"



    // $ANTLR start "orCondition"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:57:1: orCondition returns [Condition or] : lhs= simpleCondition 'or' rhs= bracketConnectorCondition ;
    public final Condition orCondition() throws RecognitionException {
        Condition or = null;


        Condition lhs =null;

        Condition rhs =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:57:35: (lhs= simpleCondition 'or' rhs= bracketConnectorCondition )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:57:37: lhs= simpleCondition 'or' rhs= bracketConnectorCondition
            {
            pushFollow(FOLLOW_simpleCondition_in_orCondition212);
            lhs=simpleCondition();

            state._fsp--;


            match(input,16,FOLLOW_16_in_orCondition214); 

            pushFollow(FOLLOW_bracketConnectorCondition_in_orCondition218);
            rhs=bracketConnectorCondition();

            state._fsp--;


            or = new Or(lhs, rhs);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return or;
    }
    // $ANTLR end "orCondition"



    // $ANTLR start "conditions"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:58:1: conditions returns [Condition cond] : ( simpleCondition | bracketCondition ( conditions )? | andCondition | orCondition );
    public final Condition conditions() throws RecognitionException {
        Condition cond = null;


        Condition simpleCondition1 =null;

        Condition bracketCondition2 =null;

        Condition andCondition3 =null;

        Condition orCondition4 =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:59:2: ( simpleCondition | bracketCondition ( conditions )? | andCondition | orCondition )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                switch ( input.LA(2) ) {
                case 10:
                case 12:
                    {
                    alt6=1;
                    }
                    break;
                case 14:
                    {
                    alt6=3;
                    }
                    break;
                case 16:
                    {
                    alt6=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA6_0==9) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:59:4: simpleCondition
                    {
                    pushFollow(FOLLOW_simpleCondition_in_conditions232);
                    simpleCondition1=simpleCondition();

                    state._fsp--;


                    cond=simpleCondition1;

                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:60:4: bracketCondition ( conditions )?
                    {
                    pushFollow(FOLLOW_bracketCondition_in_conditions239);
                    bracketCondition2=bracketCondition();

                    state._fsp--;


                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:60:21: ( conditions )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==IDENT||LA5_0==9) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:60:21: conditions
                            {
                            pushFollow(FOLLOW_conditions_in_conditions241);
                            conditions();

                            state._fsp--;


                            }
                            break;

                    }


                    cond=bracketCondition2;

                    }
                    break;
                case 3 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:61:4: andCondition
                    {
                    pushFollow(FOLLOW_andCondition_in_conditions249);
                    andCondition3=andCondition();

                    state._fsp--;


                    cond=andCondition3;

                    }
                    break;
                case 4 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:62:4: orCondition
                    {
                    pushFollow(FOLLOW_orCondition_in_conditions256);
                    orCondition4=orCondition();

                    state._fsp--;


                    cond=orCondition4;

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
        return cond;
    }
    // $ANTLR end "conditions"



    // $ANTLR start "simpleAction"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:65:1: simpleAction returns [Action simple] : action= IDENT ;
    public final Action simpleAction() throws RecognitionException {
        Action simple = null;


        Token action=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:65:37: (action= IDENT )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:65:39: action= IDENT
            {
            action=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleAction272); 

            simple = new SimpleAction((action!=null?action.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return simple;
    }
    // $ANTLR end "simpleAction"



    // $ANTLR start "chooseAction"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:67:1: chooseAction returns [Action choose] : 'choose' '(' (simple= simpleAction )+ ')' ;
    public final Action chooseAction() throws RecognitionException {
        Action choose = null;


        Action simple =null;


        List actions = new ArrayList<Action>();
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:69:2: ( 'choose' '(' (simple= simpleAction )+ ')' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:69:4: 'choose' '(' (simple= simpleAction )+ ')'
            {
            match(input,15,FOLLOW_15_in_chooseAction294); 

            match(input,9,FOLLOW_9_in_chooseAction296); 

            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:69:17: (simple= simpleAction )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDENT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:69:18: simple= simpleAction
            	    {
            	    pushFollow(FOLLOW_simpleAction_in_chooseAction301);
            	    simple=simpleAction();

            	    state._fsp--;


            	    actions.add(simple);

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


            match(input,10,FOLLOW_10_in_chooseAction306); 

            choose = new Choose(actions);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return choose;
    }
    // $ANTLR end "chooseAction"



    // $ANTLR start "actionStatement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:73:1: actionStatement returns [Action action] : (simple= simpleAction |choose= chooseAction );
    public final Action actionStatement() throws RecognitionException {
        Action action = null;


        Action simple =null;

        Action choose =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:74:2: (simple= simpleAction |choose= chooseAction )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:74:4: simple= simpleAction
                    {
                    pushFollow(FOLLOW_simpleAction_in_actionStatement326);
                    simple=simpleAction();

                    state._fsp--;


                    action=simple;

                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:75:4: choose= chooseAction
                    {
                    pushFollow(FOLLOW_chooseAction_in_actionStatement336);
                    choose=chooseAction();

                    state._fsp--;


                    action=choose;

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
        return action;
    }
    // $ANTLR end "actionStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighter57 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_fighter59 = new BitSet(new long[]{0x0000000000040220L});
    public static final BitSet FOLLOW_statement_in_fighter61 = new BitSet(new long[]{0x0000000000040220L});
    public static final BitSet FOLLOW_18_in_fighter64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personalityStatement_in_statement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviourStatement_in_statement79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_personalityStatement88 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_personalityStatement90 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INTEGER_in_personalityStatement94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditions_in_behaviourStatement108 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviourStatement110 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_actionStatement_in_behaviourStatement114 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_actionStatement_in_behaviourStatement118 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_behaviourStatement121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleCondition138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleCondition_in_bracketConnectorCondition152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketCondition_in_bracketConnectorCondition159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_bracketCondition172 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_conditions_in_bracketCondition176 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_bracketCondition178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleCondition_in_andCondition192 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_andCondition194 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_bracketConnectorCondition_in_andCondition198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleCondition_in_orCondition212 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_orCondition214 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_bracketConnectorCondition_in_orCondition218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleCondition_in_conditions232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketCondition_in_conditions239 = new BitSet(new long[]{0x0000000000000222L});
    public static final BitSet FOLLOW_conditions_in_conditions241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_conditions249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_conditions256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleAction272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_chooseAction294 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_chooseAction296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_simpleAction_in_chooseAction301 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_10_in_chooseAction306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleAction_in_actionStatement326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chooseAction_in_actionStatement336 = new BitSet(new long[]{0x0000000000000002L});

}