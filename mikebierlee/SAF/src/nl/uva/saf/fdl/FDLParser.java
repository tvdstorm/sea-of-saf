// $ANTLR 3.4 C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g 2012-01-22 18:06:05

  package nl.uva.saf.fdl;
  import nl.uva.saf.fdl.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALWAYS", "AND", "ASSIGN", "CHOOSE", "CONDITIONTYPE", "FIGHTACTION", "IDENT", "INTEGER", "MOVEACTION", "OR", "WS", "'('", "')'", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int ALWAYS=4;
    public static final int AND=5;
    public static final int ASSIGN=6;
    public static final int CHOOSE=7;
    public static final int CONDITIONTYPE=8;
    public static final int FIGHTACTION=9;
    public static final int IDENT=10;
    public static final int INTEGER=11;
    public static final int MOVEACTION=12;
    public static final int OR=13;
    public static final int WS=14;

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



    // $ANTLR start "personality"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:73:1: personality returns [Characteristic result] : IDENT ASSIGN INTEGER ;
    public final Characteristic personality() throws RecognitionException {
        Characteristic result = null;


        Token IDENT1=null;
        Token INTEGER2=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:74:3: ( IDENT ASSIGN INTEGER )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:74:5: IDENT ASSIGN INTEGER
            {
            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_personality556); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_personality558); 

            INTEGER2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_personality560); 

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
    // $ANTLR end "personality"



    // $ANTLR start "conditionAnd"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:77:1: conditionAnd returns [ConditionAnd result] : op1= CONDITIONTYPE ( AND oprest= CONDITIONTYPE )* ;
    public final ConditionAnd conditionAnd() throws RecognitionException {
        ConditionAnd result = null;


        Token op1=null;
        Token oprest=null;


            result = new ConditionAnd(new ArrayList<String>());
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:81:3: (op1= CONDITIONTYPE ( AND oprest= CONDITIONTYPE )* )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:81:5: op1= CONDITIONTYPE ( AND oprest= CONDITIONTYPE )*
            {
            op1=(Token)match(input,CONDITIONTYPE,FOLLOW_CONDITIONTYPE_in_conditionAnd608); 

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:81:23: ( AND oprest= CONDITIONTYPE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==AND) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:81:24: AND oprest= CONDITIONTYPE
            	    {
            	    match(input,AND,FOLLOW_AND_in_conditionAnd611); 

            	    oprest=(Token)match(input,CONDITIONTYPE,FOLLOW_CONDITIONTYPE_in_conditionAnd615); 

            	    result.addOperand((oprest!=null?oprest.getText():null));

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            result.addOperand((op1!=null?op1.getText():null));

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:84:1: conditionOr returns [ConditionOr result] : op1= conditionAnd ( OR oprest= conditionAnd )* ;
    public final ConditionOr conditionOr() throws RecognitionException {
        ConditionOr result = null;


        ConditionAnd op1 =null;

        ConditionAnd oprest =null;



            result = new ConditionOr(new ArrayList<ITreeNode>());
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:88:3: (op1= conditionAnd ( OR oprest= conditionAnd )* )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:88:5: op1= conditionAnd ( OR oprest= conditionAnd )*
            {
            pushFollow(FOLLOW_conditionAnd_in_conditionOr648);
            op1=conditionAnd();

            state._fsp--;


            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:88:22: ( OR oprest= conditionAnd )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==OR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:88:23: OR oprest= conditionAnd
            	    {
            	    match(input,OR,FOLLOW_OR_in_conditionOr651); 

            	    pushFollow(FOLLOW_conditionAnd_in_conditionOr655);
            	    oprest=conditionAnd();

            	    state._fsp--;


            	    result.addOperand(oprest);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            result.addOperand(op1);

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:91:1: moveChoice returns [MoveChoice result] : ( CHOOSE '(' ( MOVEACTION )+ ')' | MOVEACTION );
    public final MoveChoice moveChoice() throws RecognitionException {
        MoveChoice result = null;


        Token MOVEACTION3=null;
        Token MOVEACTION4=null;


            result = new MoveChoice(new ArrayList<ITreeNode>());
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:95:3: ( CHOOSE '(' ( MOVEACTION )+ ')' | MOVEACTION )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CHOOSE) ) {
                alt4=1;
            }
            else if ( (LA4_0==MOVEACTION) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:95:5: CHOOSE '(' ( MOVEACTION )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_moveChoice686); 

                    match(input,15,FOLLOW_15_in_moveChoice688); 

                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:95:16: ( MOVEACTION )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==MOVEACTION) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:95:17: MOVEACTION
                    	    {
                    	    MOVEACTION3=(Token)match(input,MOVEACTION,FOLLOW_MOVEACTION_in_moveChoice691); 

                    	    result.addAction(new MoveAction((MOVEACTION3!=null?MOVEACTION3.getText():null)));

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


                    match(input,16,FOLLOW_16_in_moveChoice697); 

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:96:5: MOVEACTION
                    {
                    MOVEACTION4=(Token)match(input,MOVEACTION,FOLLOW_MOVEACTION_in_moveChoice703); 

                    result.addAction(new MoveAction((MOVEACTION4!=null?MOVEACTION4.getText():null)));

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:99:1: fightChoice returns [FightChoice result] : ( CHOOSE '(' ( FIGHTACTION )+ ')' | FIGHTACTION );
    public final FightChoice fightChoice() throws RecognitionException {
        FightChoice result = null;


        Token FIGHTACTION5=null;
        Token FIGHTACTION6=null;


            result = new FightChoice(new ArrayList<ITreeNode>());
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:103:3: ( CHOOSE '(' ( FIGHTACTION )+ ')' | FIGHTACTION )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CHOOSE) ) {
                alt6=1;
            }
            else if ( (LA6_0==FIGHTACTION) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:103:5: CHOOSE '(' ( FIGHTACTION )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_fightChoice732); 

                    match(input,15,FOLLOW_15_in_fightChoice734); 

                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:103:16: ( FIGHTACTION )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==FIGHTACTION) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:103:17: FIGHTACTION
                    	    {
                    	    FIGHTACTION5=(Token)match(input,FIGHTACTION,FOLLOW_FIGHTACTION_in_fightChoice737); 

                    	    result.addAction(new FightAction((FIGHTACTION5!=null?FIGHTACTION5.getText():null)));

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


                    match(input,16,FOLLOW_16_in_fightChoice743); 

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:104:5: FIGHTACTION
                    {
                    FIGHTACTION6=(Token)match(input,FIGHTACTION,FOLLOW_FIGHTACTION_in_fightChoice749); 

                    result.addAction(new FightAction((FIGHTACTION6!=null?FIGHTACTION6.getText():null)));

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:107:1: rule returns [Rule result] : moveChoice fightChoice ;
    public final Rule rule() throws RecognitionException {
        Rule result = null;


        MoveChoice moveChoice7 =null;

        FightChoice fightChoice8 =null;


        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:108:3: ( moveChoice fightChoice )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:108:5: moveChoice fightChoice
            {
            pushFollow(FOLLOW_moveChoice_in_rule769);
            moveChoice7=moveChoice();

            state._fsp--;


            pushFollow(FOLLOW_fightChoice_in_rule771);
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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:111:1: behaviour returns [Behaviour result] : ( conditionOr '[' rule ']' | ALWAYS '[' rule ']' );
    public final Behaviour behaviour() throws RecognitionException {
        Behaviour result = null;


        ConditionOr conditionOr9 =null;

        Rule rule10 =null;

        Rule rule11 =null;


        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:112:3: ( conditionOr '[' rule ']' | ALWAYS '[' rule ']' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CONDITIONTYPE) ) {
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
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:112:5: conditionOr '[' rule ']'
                    {
                    pushFollow(FOLLOW_conditionOr_in_behaviour791);
                    conditionOr9=conditionOr();

                    state._fsp--;


                    match(input,17,FOLLOW_17_in_behaviour793); 

                    pushFollow(FOLLOW_rule_in_behaviour795);
                    rule10=rule();

                    state._fsp--;


                    match(input,18,FOLLOW_18_in_behaviour797); 

                    result = new Behaviour(conditionOr9, rule10);

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:113:5: ALWAYS '[' rule ']'
                    {
                    match(input,ALWAYS,FOLLOW_ALWAYS_in_behaviour805); 

                    match(input,17,FOLLOW_17_in_behaviour807); 

                    pushFollow(FOLLOW_rule_in_behaviour809);
                    rule11=rule();

                    state._fsp--;


                    match(input,18,FOLLOW_18_in_behaviour811); 

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:116:1: fighterAttribute returns [FighterAttribute result] : ( personality | behaviour );
    public final FighterAttribute fighterAttribute() throws RecognitionException {
        FighterAttribute result = null;


        Characteristic personality12 =null;

        Behaviour behaviour13 =null;


        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:117:3: ( personality | behaviour )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT) ) {
                alt8=1;
            }
            else if ( (LA8_0==ALWAYS||LA8_0==CONDITIONTYPE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:117:5: personality
                    {
                    pushFollow(FOLLOW_personality_in_fighterAttribute848);
                    personality12=personality();

                    state._fsp--;


                    result = personality12;

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:118:5: behaviour
                    {
                    pushFollow(FOLLOW_behaviour_in_fighterAttribute858);
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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:121:1: fighter returns [Fighter result] : IDENT '{' ( fighterAttribute )* '}' ;
    public final Fighter fighter() throws RecognitionException {
        Fighter result = null;


        Token IDENT15=null;
        FighterAttribute fighterAttribute14 =null;



            result = new Fighter("",new ArrayList<ITreeNode>());
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:125:3: ( IDENT '{' ( fighterAttribute )* '}' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:125:5: IDENT '{' ( fighterAttribute )* '}'
            {
            IDENT15=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter889); 

            match(input,19,FOLLOW_19_in_fighter891); 

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:125:15: ( fighterAttribute )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ALWAYS||LA9_0==CONDITIONTYPE||LA9_0==IDENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:125:16: fighterAttribute
            	    {
            	    pushFollow(FOLLOW_fighterAttribute_in_fighter894);
            	    fighterAttribute14=fighterAttribute();

            	    state._fsp--;


            	    result.addAttribute(fighterAttribute14);

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input,20,FOLLOW_20_in_fighter900); 

            result.setName((IDENT15!=null?IDENT15.getText():null));

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:128:1: parse returns [ITreeNode tree] : fighter EOF ;
    public final ITreeNode parse() throws RecognitionException {
        ITreeNode tree = null;


        Fighter fighter16 =null;


        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:129:3: ( fighter EOF )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:129:5: fighter EOF
            {
            pushFollow(FOLLOW_fighter_in_parse921);
            fighter16=fighter();

            state._fsp--;


            match(input,EOF,FOLLOW_EOF_in_parse923); 

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


 

    public static final BitSet FOLLOW_IDENT_in_personality556 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_personality558 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INTEGER_in_personality560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITIONTYPE_in_conditionAnd608 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_conditionAnd611 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CONDITIONTYPE_in_conditionAnd615 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_conditionAnd_in_conditionOr648 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_OR_in_conditionOr651 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_conditionAnd_in_conditionOr655 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_CHOOSE_in_moveChoice686 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_moveChoice688 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_MOVEACTION_in_moveChoice691 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_moveChoice697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEACTION_in_moveChoice703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_fightChoice732 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_fightChoice734 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_FIGHTACTION_in_fightChoice737 = new BitSet(new long[]{0x0000000000010200L});
    public static final BitSet FOLLOW_16_in_fightChoice743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGHTACTION_in_fightChoice749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveChoice_in_rule769 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_fightChoice_in_rule771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionOr_in_behaviour791 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_behaviour793 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_rule_in_behaviour795 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_behaviour797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALWAYS_in_behaviour805 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_behaviour807 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_rule_in_behaviour809 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_behaviour811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personality_in_fighterAttribute848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_fighterAttribute858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fighter889 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_fighter891 = new BitSet(new long[]{0x0000000000100510L});
    public static final BitSet FOLLOW_fighterAttribute_in_fighter894 = new BitSet(new long[]{0x0000000000100510L});
    public static final BitSet FOLLOW_20_in_fighter900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fighter_in_parse921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse923 = new BitSet(new long[]{0x0000000000000002L});

}