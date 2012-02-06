// $ANTLR 3.4 C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g 2012-02-06 15:24:46

  package nl.uva.saf.fdl;
  import nl.uva.saf.fdl.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALWAYS", "AND", "ASSIGN", "CHOOSE", "IDENT", "INTEGER", "OR", "WS", "'('", "')'", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int ALWAYS=4;
    public static final int AND=5;
    public static final int ASSIGN=6;
    public static final int CHOOSE=7;
    public static final int IDENT=8;
    public static final int INTEGER=9;
    public static final int OR=10;
    public static final int WS=11;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FDLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FDLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return FDLParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g"; }



    // $ANTLR start "characteristic"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:45:1: characteristic returns [Characteristic result] : IDENT ASSIGN INTEGER ;
    public final Characteristic characteristic() throws RecognitionException {
        Characteristic result = null;


        Token IDENT1=null;
        Token INTEGER2=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:46:3: ( IDENT ASSIGN INTEGER )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:46:5: IDENT ASSIGN INTEGER
            {
            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_characteristic183); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_characteristic185); 

            INTEGER2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_characteristic187); 

            result = new Characteristic((IDENT1!=null?IDENT1.getText():null), (INTEGER2!=null?INTEGER2.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "characteristic"



    // $ANTLR start "conditionAnd"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:49:1: conditionAnd returns [ConditionAnd result] : op1= IDENT ( AND oprest= IDENT )* ;
    public final ConditionAnd conditionAnd() throws RecognitionException {
        ConditionAnd result = null;


        Token op1=null;
        Token oprest=null;


            ArrayList<String> operands = new ArrayList<String>();
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:53:3: (op1= IDENT ( AND oprest= IDENT )* )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:53:5: op1= IDENT ( AND oprest= IDENT )*
            {
            op1=(Token)match(input,IDENT,FOLLOW_IDENT_in_conditionAnd235); 

            operands.add((op1!=null?op1.getText():null));

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:53:42: ( AND oprest= IDENT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==AND) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:53:43: AND oprest= IDENT
            	    {
            	    match(input,AND,FOLLOW_AND_in_conditionAnd240); 

            	    oprest=(Token)match(input,IDENT,FOLLOW_IDENT_in_conditionAnd244); 

            	    operands.add((oprest!=null?oprest.getText():null));

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            result = new ConditionAnd(operands);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "conditionAnd"



    // $ANTLR start "conditionOr"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:56:1: conditionOr returns [ConditionOr result] : op1= conditionAnd ( OR oprest= conditionAnd )* ;
    public final ConditionOr conditionOr() throws RecognitionException {
        ConditionOr result = null;


        ConditionAnd op1 =null;

        ConditionAnd oprest =null;



            ArrayList<ConditionAnd> operands = new ArrayList<ConditionAnd>();
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:60:3: (op1= conditionAnd ( OR oprest= conditionAnd )* )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:60:5: op1= conditionAnd ( OR oprest= conditionAnd )*
            {
            pushFollow(FOLLOW_conditionAnd_in_conditionOr277);
            op1=conditionAnd();

            state._fsp--;


            operands.add(op1);

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:60:51: ( OR oprest= conditionAnd )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==OR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:60:52: OR oprest= conditionAnd
            	    {
            	    match(input,OR,FOLLOW_OR_in_conditionOr282); 

            	    pushFollow(FOLLOW_conditionAnd_in_conditionOr286);
            	    oprest=conditionAnd();

            	    state._fsp--;


            	    operands.add(oprest);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            result = new ConditionOr(operands);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "conditionOr"



    // $ANTLR start "moveChoice"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:63:1: moveChoice returns [MoveChoice result] : ( CHOOSE '(' ( IDENT )+ ')' | IDENT );
    public final MoveChoice moveChoice() throws RecognitionException {
        MoveChoice result = null;


        Token IDENT3=null;
        Token IDENT4=null;


            ArrayList<Action> actions = new ArrayList<Action>();
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:67:3: ( CHOOSE '(' ( IDENT )+ ')' | IDENT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CHOOSE) ) {
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
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:67:5: CHOOSE '(' ( IDENT )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_moveChoice317); 

                    match(input,12,FOLLOW_12_in_moveChoice319); 

                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:67:16: ( IDENT )+
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
                    	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:67:17: IDENT
                    	    {
                    	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_moveChoice322); 

                    	    actions.add(new MoveAction((IDENT3!=null?IDENT3.getText():null)));

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


                    match(input,13,FOLLOW_13_in_moveChoice328); 

                    result = new MoveChoice(actions);

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:68:5: IDENT
                    {
                    IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_moveChoice336); 

                    actions.add(new MoveAction((IDENT4!=null?IDENT4.getText():null)));

                    result = new MoveChoice(actions);

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
        return result;
    }
    // $ANTLR end "moveChoice"



    // $ANTLR start "fightChoice"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:71:1: fightChoice returns [FightChoice result] : ( CHOOSE '(' ( IDENT )+ ')' | IDENT );
    public final FightChoice fightChoice() throws RecognitionException {
        FightChoice result = null;


        Token IDENT5=null;
        Token IDENT6=null;


            ArrayList<Action> actions = new ArrayList<Action>();
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:75:3: ( CHOOSE '(' ( IDENT )+ ')' | IDENT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CHOOSE) ) {
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
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:75:5: CHOOSE '(' ( IDENT )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_fightChoice367); 

                    match(input,12,FOLLOW_12_in_fightChoice369); 

                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:75:16: ( IDENT )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==IDENT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:75:17: IDENT
                    	    {
                    	    IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_fightChoice372); 

                    	    actions.add(new FightAction((IDENT5!=null?IDENT5.getText():null)));

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


                    match(input,13,FOLLOW_13_in_fightChoice378); 

                    result = new FightChoice(actions);

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:76:5: IDENT
                    {
                    IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_fightChoice386); 

                    actions.add(new FightAction((IDENT6!=null?IDENT6.getText():null)));

                    result = new FightChoice(actions);

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
        return result;
    }
    // $ANTLR end "fightChoice"



    // $ANTLR start "rule"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:79:1: rule returns [Rule result] : moveChoice fightChoice ;
    public final Rule rule() throws RecognitionException {
        Rule result = null;


        MoveChoice moveChoice7 =null;

        FightChoice fightChoice8 =null;


        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:80:3: ( moveChoice fightChoice )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:80:5: moveChoice fightChoice
            {
            pushFollow(FOLLOW_moveChoice_in_rule408);
            moveChoice7=moveChoice();

            state._fsp--;


            pushFollow(FOLLOW_fightChoice_in_rule410);
            fightChoice8=fightChoice();

            state._fsp--;


            result = new Rule(moveChoice7, fightChoice8);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "rule"



    // $ANTLR start "behaviour"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:1: behaviour returns [Behaviour result] : ( conditionOr '[' rule ']' | ALWAYS '[' rule ']' );
    public final Behaviour behaviour() throws RecognitionException {
        Behaviour result = null;


        ConditionOr conditionOr9 =null;

        Rule rule10 =null;

        Rule rule11 =null;


        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:84:3: ( conditionOr '[' rule ']' | ALWAYS '[' rule ']' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            else if ( (LA7_0==ALWAYS) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:84:5: conditionOr '[' rule ']'
                    {
                    pushFollow(FOLLOW_conditionOr_in_behaviour430);
                    conditionOr9=conditionOr();

                    state._fsp--;


                    match(input,14,FOLLOW_14_in_behaviour432); 

                    pushFollow(FOLLOW_rule_in_behaviour434);
                    rule10=rule();

                    state._fsp--;


                    match(input,15,FOLLOW_15_in_behaviour436); 

                    result = new Behaviour(conditionOr9, rule10);

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:85:5: ALWAYS '[' rule ']'
                    {
                    match(input,ALWAYS,FOLLOW_ALWAYS_in_behaviour444); 

                    match(input,14,FOLLOW_14_in_behaviour446); 

                    pushFollow(FOLLOW_rule_in_behaviour448);
                    rule11=rule();

                    state._fsp--;


                    match(input,15,FOLLOW_15_in_behaviour450); 

                    result = new Behaviour(new ConditionAlways(), rule11);

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
        return result;
    }
    // $ANTLR end "behaviour"



    // $ANTLR start "fighterAttribute"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:88:1: fighterAttribute returns [FighterAttribute result] : ( characteristic | behaviour );
    public final FighterAttribute fighterAttribute() throws RecognitionException {
        FighterAttribute result = null;


        Characteristic characteristic12 =null;

        Behaviour behaviour13 =null;


        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:89:3: ( characteristic | behaviour )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==ASSIGN) ) {
                    alt8=1;
                }
                else if ( (LA8_1==AND||LA8_1==OR||LA8_1==14) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA8_0==ALWAYS) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:89:5: characteristic
                    {
                    pushFollow(FOLLOW_characteristic_in_fighterAttribute487);
                    characteristic12=characteristic();

                    state._fsp--;


                    result = characteristic12;

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:90:5: behaviour
                    {
                    pushFollow(FOLLOW_behaviour_in_fighterAttribute497);
                    behaviour13=behaviour();

                    state._fsp--;


                    result = behaviour13;

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
        return result;
    }
    // $ANTLR end "fighterAttribute"



    // $ANTLR start "fighter"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:93:1: fighter returns [Fighter result] : IDENT '{' ( fighterAttribute )* '}' ;
    public final Fighter fighter() throws RecognitionException {
        Fighter result = null;


        Token IDENT15=null;
        FighterAttribute fighterAttribute14 =null;



            ArrayList<FighterAttribute> attributes = new ArrayList<FighterAttribute>();
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:97:3: ( IDENT '{' ( fighterAttribute )* '}' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:97:5: IDENT '{' ( fighterAttribute )* '}'
            {
            IDENT15=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter528); 

            match(input,16,FOLLOW_16_in_fighter530); 

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:97:15: ( fighterAttribute )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ALWAYS||LA9_0==IDENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:97:16: fighterAttribute
            	    {
            	    pushFollow(FOLLOW_fighterAttribute_in_fighter533);
            	    fighterAttribute14=fighterAttribute();

            	    state._fsp--;


            	    attributes.add(fighterAttribute14);

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_fighter539); 

            result = new Fighter((IDENT15!=null?IDENT15.getText():null), attributes);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "fighter"



    // $ANTLR start "parse"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:100:1: parse returns [ITreeNode tree] : fighter EOF ;
    public final ITreeNode parse() throws RecognitionException {
        ITreeNode tree = null;


        Fighter fighter16 =null;


        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:101:3: ( fighter EOF )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:101:5: fighter EOF
            {
            pushFollow(FOLLOW_fighter_in_parse560);
            fighter16=fighter();

            state._fsp--;


            match(input,EOF,FOLLOW_EOF_in_parse562); 

            tree = fighter16;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return tree;
    }
    // $ANTLR end "parse"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_characteristic183 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_characteristic185 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INTEGER_in_characteristic187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_conditionAnd235 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_conditionAnd240 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENT_in_conditionAnd244 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_conditionAnd_in_conditionOr277 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_OR_in_conditionOr282 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_conditionAnd_in_conditionOr286 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_CHOOSE_in_moveChoice317 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_moveChoice319 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENT_in_moveChoice322 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_13_in_moveChoice328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_moveChoice336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_fightChoice367 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_fightChoice369 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENT_in_fightChoice372 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_13_in_fightChoice378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fightChoice386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveChoice_in_rule408 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_fightChoice_in_rule410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionOr_in_behaviour430 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_behaviour432 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rule_in_behaviour434 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_behaviour436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALWAYS_in_behaviour444 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_behaviour446 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rule_in_behaviour448 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_behaviour450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_fighterAttribute487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_fighterAttribute497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fighter528 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fighter530 = new BitSet(new long[]{0x0000000000020110L});
    public static final BitSet FOLLOW_fighterAttribute_in_fighter533 = new BitSet(new long[]{0x0000000000020110L});
    public static final BitSet FOLLOW_17_in_fighter539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fighter_in_parse560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse562 = new BitSet(new long[]{0x0000000000000002L});

}