// $ANTLR 3.4 D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g 2012-02-20 14:41:15

  package nl.uva.lap.saf;
  import nl.uva.lap.saf.ast.action.Action;
  import nl.uva.lap.saf.ast.action.Choose;
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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:36:1: fighter returns [Fighter fighter] : name= IDENT '{' ( statement )* '}' ;
    public final Fighter fighter() throws RecognitionException {
        Fighter fighter = null;


        Token name=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:36:34: (name= IDENT '{' ( statement )* '}' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:36:36: name= IDENT '{' ( statement )* '}'
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter57); 

            match(input,17,FOLLOW_17_in_fighter59); 

            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:36:51: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT||LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:36:51: statement
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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:39:1: statement : ( personalityStatement | behaviourStatement );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:39:10: ( personalityStatement | behaviourStatement )
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
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:39:12: personalityStatement
                    {
                    pushFollow(FOLLOW_personalityStatement_in_statement75);
                    personalityStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:39:35: behaviourStatement
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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:41:1: personalityStatement : personality= IDENT '=' value= INTEGER ;
    public final void personalityStatement() throws RecognitionException {
        Token personality=null;
        Token value=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:41:21: (personality= IDENT '=' value= INTEGER )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:41:23: personality= IDENT '=' value= INTEGER
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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:44:1: behaviourStatement : cond= conditions '[' action1= actionStatement (action2= actionStatement )? ']' ;
    public final void behaviourStatement() throws RecognitionException {
        Condition cond =null;

        Action action1 =null;

        Action action2 =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:44:20: (cond= conditions '[' action1= actionStatement (action2= actionStatement )? ']' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:44:22: cond= conditions '[' action1= actionStatement (action2= actionStatement )? ']'
            {
            pushFollow(FOLLOW_conditions_in_behaviourStatement108);
            cond=conditions();

            state._fsp--;


            match(input,12,FOLLOW_12_in_behaviourStatement110); 

            pushFollow(FOLLOW_actionStatement_in_behaviourStatement114);
            action1=actionStatement();

            state._fsp--;


            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:44:73: (action2= actionStatement )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT||LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:44:73: action2= actionStatement
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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:52:1: simpleCondition returns [Condition simple] : cond= IDENT ;
    public final Condition simpleCondition() throws RecognitionException {
        Condition simple = null;


        Token cond=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:52:44: (cond= IDENT )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:52:46: cond= IDENT
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



    // $ANTLR start "connectCondition"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:53:1: connectCondition returns [Condition connect] : ( '(' lhs= conditions ')' op= ( 'and' | 'or' ) rhs= conditions |lhs= simpleCondition op= ( 'and' | 'or' ) '(' rhs= conditions ')' |lhs= simpleCondition op= ( 'and' | 'or' ) rhs= simpleCondition ) ;
    public final Condition connectCondition() throws RecognitionException {
        Condition connect = null;


        Token op=null;
        Condition lhs =null;

        Condition rhs =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:53:45: ( ( '(' lhs= conditions ')' op= ( 'and' | 'or' ) rhs= conditions |lhs= simpleCondition op= ( 'and' | 'or' ) '(' rhs= conditions ')' |lhs= simpleCondition op= ( 'and' | 'or' ) rhs= simpleCondition ) )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:53:47: ( '(' lhs= conditions ')' op= ( 'and' | 'or' ) rhs= conditions |lhs= simpleCondition op= ( 'and' | 'or' ) '(' rhs= conditions ')' |lhs= simpleCondition op= ( 'and' | 'or' ) rhs= simpleCondition )
            {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:53:47: ( '(' lhs= conditions ')' op= ( 'and' | 'or' ) rhs= conditions |lhs= simpleCondition op= ( 'and' | 'or' ) '(' rhs= conditions ')' |lhs= simpleCondition op= ( 'and' | 'or' ) rhs= simpleCondition )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==9) ) {
                alt4=1;
            }
            else if ( (LA4_0==IDENT) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==14||LA4_2==16) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==9) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==IDENT) ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

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
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:54:3: '(' lhs= conditions ')' op= ( 'and' | 'or' ) rhs= conditions
                    {
                    match(input,9,FOLLOW_9_in_connectCondition154); 

                    pushFollow(FOLLOW_conditions_in_connectCondition158);
                    lhs=conditions();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_connectCondition160); 

                    op=(Token)input.LT(1);

                    if ( input.LA(1)==14||input.LA(1)==16 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_conditions_in_connectCondition172);
                    rhs=conditions();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:55:5: lhs= simpleCondition op= ( 'and' | 'or' ) '(' rhs= conditions ')'
                    {
                    pushFollow(FOLLOW_simpleCondition_in_connectCondition180);
                    lhs=simpleCondition();

                    state._fsp--;


                    op=(Token)input.LT(1);

                    if ( input.LA(1)==14||input.LA(1)==16 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,9,FOLLOW_9_in_connectCondition190); 

                    pushFollow(FOLLOW_conditions_in_connectCondition194);
                    rhs=conditions();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_connectCondition196); 

                    }
                    break;
                case 3 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:56:5: lhs= simpleCondition op= ( 'and' | 'or' ) rhs= simpleCondition
                    {
                    pushFollow(FOLLOW_simpleCondition_in_connectCondition204);
                    lhs=simpleCondition();

                    state._fsp--;


                    op=(Token)input.LT(1);

                    if ( input.LA(1)==14||input.LA(1)==16 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_simpleCondition_in_connectCondition216);
                    rhs=simpleCondition();

                    state._fsp--;


                    }
                    break;

            }


            	
            		if((op!=null?op.getText():null).equals("and"))
            			connect = new And(lhs, rhs);
            		else
            			connect = new Or(lhs, rhs);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return connect;
    }
    // $ANTLR end "connectCondition"



    // $ANTLR start "conditions"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:64:1: conditions returns [Condition cond] : ( simpleCondition | connectCondition );
    public final Condition conditions() throws RecognitionException {
        Condition cond = null;


        Condition simpleCondition1 =null;

        Condition connectCondition2 =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:65:2: ( simpleCondition | connectCondition )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==10||LA5_1==12) ) {
                    alt5=1;
                }
                else if ( (LA5_1==14||LA5_1==16) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA5_0==9) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:65:4: simpleCondition
                    {
                    pushFollow(FOLLOW_simpleCondition_in_conditions233);
                    simpleCondition1=simpleCondition();

                    state._fsp--;


                    cond=simpleCondition1;

                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:66:4: connectCondition
                    {
                    pushFollow(FOLLOW_connectCondition_in_conditions240);
                    connectCondition2=connectCondition();

                    state._fsp--;


                    cond=connectCondition2;

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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:68:1: simpleAction returns [Action simple] : action= IDENT ;
    public final Action simpleAction() throws RecognitionException {
        Action simple = null;


        Token action=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:68:37: (action= IDENT )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:68:39: action= IDENT
            {
            action=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleAction255); 

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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:70:1: chooseAction returns [Action choose] : 'choose' '(' (simple= simpleAction )+ ')' ;
    public final Action chooseAction() throws RecognitionException {
        Action choose = null;


        Action simple =null;


        List actions = new ArrayList<Action>();
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:72:2: ( 'choose' '(' (simple= simpleAction )+ ')' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:72:4: 'choose' '(' (simple= simpleAction )+ ')'
            {
            match(input,15,FOLLOW_15_in_chooseAction277); 

            match(input,9,FOLLOW_9_in_chooseAction279); 

            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:72:17: (simple= simpleAction )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:72:18: simple= simpleAction
            	    {
            	    pushFollow(FOLLOW_simpleAction_in_chooseAction284);
            	    simple=simpleAction();

            	    state._fsp--;


            	    actions.add(simple);

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


            match(input,10,FOLLOW_10_in_chooseAction289); 

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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:76:1: actionStatement returns [Action action] : (simple= simpleAction |choose= chooseAction );
    public final Action actionStatement() throws RecognitionException {
        Action action = null;


        Action simple =null;

        Action choose =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:77:2: (simple= simpleAction |choose= chooseAction )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:77:4: simple= simpleAction
                    {
                    pushFollow(FOLLOW_simpleAction_in_actionStatement309);
                    simple=simpleAction();

                    state._fsp--;


                    action=simple;

                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:78:4: choose= chooseAction
                    {
                    pushFollow(FOLLOW_chooseAction_in_actionStatement319);
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
    public static final BitSet FOLLOW_9_in_connectCondition154 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_conditions_in_connectCondition158 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_connectCondition160 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_set_in_connectCondition164 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_conditions_in_connectCondition172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleCondition_in_connectCondition180 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_set_in_connectCondition184 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_connectCondition190 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_conditions_in_connectCondition194 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_connectCondition196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleCondition_in_connectCondition204 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_set_in_connectCondition208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_simpleCondition_in_connectCondition216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleCondition_in_conditions233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connectCondition_in_conditions240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleAction255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_chooseAction277 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_chooseAction279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_simpleAction_in_chooseAction284 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_10_in_chooseAction289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleAction_in_actionStatement309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chooseAction_in_actionStatement319 = new BitSet(new long[]{0x0000000000000002L});

}