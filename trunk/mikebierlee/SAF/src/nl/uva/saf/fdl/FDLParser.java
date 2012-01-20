// $ANTLR 3.4 C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g 2012-01-20 15:00:17

  package nl.uva.saf.fdl;
  import nl.uva.saf.fdl.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "CHOOSE", "CONDITIONTYPE", "FIGHTACTION", "IDENT", "MOVEACTION", "OR", "VALUE", "WS", "'('", "')'", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int AND=4;
    public static final int ASSIGN=5;
    public static final int CHOOSE=6;
    public static final int CONDITIONTYPE=7;
    public static final int FIGHTACTION=8;
    public static final int IDENT=9;
    public static final int MOVEACTION=10;
    public static final int OR=11;
    public static final int VALUE=12;
    public static final int WS=13;

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:73:1: personality returns [Characteristic result] : IDENT ASSIGN VALUE ;
    public final Characteristic personality() throws RecognitionException {
        Characteristic result = null;


        Token IDENT1=null;
        Token VALUE2=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:74:3: ( IDENT ASSIGN VALUE )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:74:5: IDENT ASSIGN VALUE
            {
            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_personality570); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_personality572); 

            VALUE2=(Token)match(input,VALUE,FOLLOW_VALUE_in_personality574); 

            result = new Characteristic((IDENT1!=null?IDENT1.getText():null), (VALUE2!=null?VALUE2.getText():null));

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:76:1: conditionAnd returns [ConditionAnd result] : op1= CONDITIONTYPE ( AND oprest= CONDITIONTYPE )* ;
    public final ConditionAnd conditionAnd() throws RecognitionException {
        ConditionAnd result = null;


        Token op1=null;
        Token oprest=null;


            result = new ConditionAnd(new ArrayList<String>());
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:80:3: (op1= CONDITIONTYPE ( AND oprest= CONDITIONTYPE )* )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:80:5: op1= CONDITIONTYPE ( AND oprest= CONDITIONTYPE )*
            {
            op1=(Token)match(input,CONDITIONTYPE,FOLLOW_CONDITIONTYPE_in_conditionAnd619); 

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:80:23: ( AND oprest= CONDITIONTYPE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==AND) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:80:24: AND oprest= CONDITIONTYPE
            	    {
            	    match(input,AND,FOLLOW_AND_in_conditionAnd622); 

            	    oprest=(Token)match(input,CONDITIONTYPE,FOLLOW_CONDITIONTYPE_in_conditionAnd626); 

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:1: conditionOr returns [ConditionOr result] : op1= conditionAnd ( OR oprest= conditionAnd )* ;
    public final ConditionOr conditionOr() throws RecognitionException {
        ConditionOr result = null;


        ConditionAnd op1 =null;

        ConditionAnd oprest =null;



            result = new ConditionOr(new ArrayList<ITreeNode>());
          
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:87:3: (op1= conditionAnd ( OR oprest= conditionAnd )* )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:87:5: op1= conditionAnd ( OR oprest= conditionAnd )*
            {
            pushFollow(FOLLOW_conditionAnd_in_conditionOr659);
            op1=conditionAnd();

            state._fsp--;


            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:87:22: ( OR oprest= conditionAnd )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==OR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:87:23: OR oprest= conditionAnd
            	    {
            	    match(input,OR,FOLLOW_OR_in_conditionOr662); 

            	    pushFollow(FOLLOW_conditionAnd_in_conditionOr666);
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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:90:1: moveChoice : CHOOSE '(' ( MOVEACTION )+ ')' ;
    public final void moveChoice() throws RecognitionException {
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:90:12: ( CHOOSE '(' ( MOVEACTION )+ ')' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:90:14: CHOOSE '(' ( MOVEACTION )+ ')'
            {
            match(input,CHOOSE,FOLLOW_CHOOSE_in_moveChoice684); 

            match(input,14,FOLLOW_14_in_moveChoice686); 

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:90:25: ( MOVEACTION )+
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
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:90:25: MOVEACTION
            	    {
            	    match(input,MOVEACTION,FOLLOW_MOVEACTION_in_moveChoice688); 

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


            match(input,15,FOLLOW_15_in_moveChoice691); 

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
    // $ANTLR end "moveChoice"



    // $ANTLR start "fightChoice"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:91:1: fightChoice : CHOOSE '(' ( FIGHTACTION )+ ')' ;
    public final void fightChoice() throws RecognitionException {
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:91:13: ( CHOOSE '(' ( FIGHTACTION )+ ')' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:91:15: CHOOSE '(' ( FIGHTACTION )+ ')'
            {
            match(input,CHOOSE,FOLLOW_CHOOSE_in_fightChoice698); 

            match(input,14,FOLLOW_14_in_fightChoice700); 

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:91:26: ( FIGHTACTION )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==FIGHTACTION) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:91:26: FIGHTACTION
            	    {
            	    match(input,FIGHTACTION,FOLLOW_FIGHTACTION_in_fightChoice702); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            match(input,15,FOLLOW_15_in_fightChoice705); 

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
    // $ANTLR end "fightChoice"



    // $ANTLR start "moveRule"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:92:1: moveRule : ( MOVEACTION | moveChoice );
    public final void moveRule() throws RecognitionException {
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:92:10: ( MOVEACTION | moveChoice )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==MOVEACTION) ) {
                alt5=1;
            }
            else if ( (LA5_0==CHOOSE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:92:12: MOVEACTION
                    {
                    match(input,MOVEACTION,FOLLOW_MOVEACTION_in_moveRule712); 

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:92:25: moveChoice
                    {
                    pushFollow(FOLLOW_moveChoice_in_moveRule716);
                    moveChoice();

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
    // $ANTLR end "moveRule"



    // $ANTLR start "fightRule"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:93:1: fightRule : ( FIGHTACTION | fightChoice );
    public final void fightRule() throws RecognitionException {
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:93:11: ( FIGHTACTION | fightChoice )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==FIGHTACTION) ) {
                alt6=1;
            }
            else if ( (LA6_0==CHOOSE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:93:13: FIGHTACTION
                    {
                    match(input,FIGHTACTION,FOLLOW_FIGHTACTION_in_fightRule723); 

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:93:27: fightChoice
                    {
                    pushFollow(FOLLOW_fightChoice_in_fightRule727);
                    fightChoice();

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
    // $ANTLR end "fightRule"



    // $ANTLR start "rules"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:94:1: rules : moveRule fightRule ;
    public final void rules() throws RecognitionException {
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:94:7: ( moveRule fightRule )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:94:9: moveRule fightRule
            {
            pushFollow(FOLLOW_moveRule_in_rules734);
            moveRule();

            state._fsp--;


            pushFollow(FOLLOW_fightRule_in_rules736);
            fightRule();

            state._fsp--;


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
    // $ANTLR end "rules"



    // $ANTLR start "behaviour"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:96:1: behaviour returns [Behaviour result] : conditionOr '[' rules ']' ;
    public final Behaviour behaviour() throws RecognitionException {
        Behaviour result = null;


        ConditionOr conditionOr3 =null;


        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:97:3: ( conditionOr '[' rules ']' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:97:5: conditionOr '[' rules ']'
            {
            pushFollow(FOLLOW_conditionOr_in_behaviour751);
            conditionOr3=conditionOr();

            state._fsp--;


            match(input,16,FOLLOW_16_in_behaviour753); 

            pushFollow(FOLLOW_rules_in_behaviour755);
            rules();

            state._fsp--;


            match(input,17,FOLLOW_17_in_behaviour757); 

            result = new Behaviour(conditionOr3);

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:100:1: fighterAttribute returns [FighterAttribute result] : ( personality | behaviour );
    public final FighterAttribute fighterAttribute() throws RecognitionException {
        FighterAttribute result = null;


        Characteristic personality4 =null;

        Behaviour behaviour5 =null;


        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:101:3: ( personality | behaviour )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            else if ( (LA7_0==CONDITIONTYPE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:101:5: personality
                    {
                    pushFollow(FOLLOW_personality_in_fighterAttribute794);
                    personality4=personality();

                    state._fsp--;


                    result = personality4;

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:102:5: behaviour
                    {
                    pushFollow(FOLLOW_behaviour_in_fighterAttribute804);
                    behaviour5=behaviour();

                    state._fsp--;


                    result = behaviour5;

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:105:1: fighter returns [Fighter result] : IDENT '{' ( fighterAttribute )* '}' ;
    public final Fighter fighter() throws RecognitionException {
        Fighter result = null;


        Token IDENT7=null;
        FighterAttribute fighterAttribute6 =null;



        	  result = new Fighter("",new ArrayList<ITreeNode>());
        	
        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:109:3: ( IDENT '{' ( fighterAttribute )* '}' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:109:5: IDENT '{' ( fighterAttribute )* '}'
            {
            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter834); 

            match(input,18,FOLLOW_18_in_fighter836); 

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:109:15: ( fighterAttribute )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CONDITIONTYPE||LA8_0==IDENT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:109:16: fighterAttribute
            	    {
            	    pushFollow(FOLLOW_fighterAttribute_in_fighter839);
            	    fighterAttribute6=fighterAttribute();

            	    state._fsp--;


            	    result.addAttribute(fighterAttribute6);

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,19,FOLLOW_19_in_fighter845); 

            result.setName((IDENT7!=null?IDENT7.getText():null));

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
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:112:1: parse returns [ITreeNode tree] : fighter EOF ;
    public final ITreeNode parse() throws RecognitionException {
        ITreeNode tree = null;


        Fighter fighter8 =null;


        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:113:3: ( fighter EOF )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:113:5: fighter EOF
            {
            pushFollow(FOLLOW_fighter_in_parse866);
            fighter8=fighter();

            state._fsp--;


            match(input,EOF,FOLLOW_EOF_in_parse868); 

            tree = fighter8;

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


 

    public static final BitSet FOLLOW_IDENT_in_personality570 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_personality572 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_VALUE_in_personality574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITIONTYPE_in_conditionAnd619 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_conditionAnd622 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CONDITIONTYPE_in_conditionAnd626 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_conditionAnd_in_conditionOr659 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_OR_in_conditionOr662 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_conditionAnd_in_conditionOr666 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_CHOOSE_in_moveChoice684 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_moveChoice686 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_MOVEACTION_in_moveChoice688 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_15_in_moveChoice691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_fightChoice698 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_fightChoice700 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FIGHTACTION_in_fightChoice702 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_15_in_fightChoice705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEACTION_in_moveRule712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveChoice_in_moveRule716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGHTACTION_in_fightRule723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fightChoice_in_fightRule727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveRule_in_rules734 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_fightRule_in_rules736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionOr_in_behaviour751 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_behaviour753 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_rules_in_behaviour755 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_behaviour757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personality_in_fighterAttribute794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_fighterAttribute804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fighter834 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_fighter836 = new BitSet(new long[]{0x0000000000080280L});
    public static final BitSet FOLLOW_fighterAttribute_in_fighter839 = new BitSet(new long[]{0x0000000000080280L});
    public static final BitSet FOLLOW_19_in_fighter845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fighter_in_parse866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse868 = new BitSet(new long[]{0x0000000000000002L});

}