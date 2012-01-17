// $ANTLR 3.4 C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g 2012-01-17 19:07:57

  package nl.uva.saf.fdl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "'('", "')'", "'='", "'['", "']'", "'always'", "'and'", "'block_high'", "'block_low'", "'choose'", "'crouch'", "'even'", "'far'", "'jump'", "'kickPower'", "'kickReach'", "'kick_high'", "'kick_low'", "'much_stronger'", "'much_weaker'", "'near'", "'or'", "'punchPower'", "'punchReach'", "'punch_high'", "'punch_low'", "'run_away'", "'run_towards'", "'stand'", "'stronger'", "'walk_away'", "'walk_towards'", "'weaker'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
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
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
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
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int IDENT=4;
    public static final int INTEGER=5;
    public static final int WS=6;

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

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return FDLParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g"; }


    public static class characteristic_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:41:1: characteristic : ( 'kickPower' | 'kickReach' | 'punchPower' | 'punchReach' );
    public final FDLParser.characteristic_return characteristic() throws RecognitionException {
        FDLParser.characteristic_return retval = new FDLParser.characteristic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set1=null;

        CommonTree set1_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:41:16: ( 'kickPower' | 'kickReach' | 'punchPower' | 'punchReach' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set1=(Token)input.LT(1);

            if ( (input.LA(1) >= 21 && input.LA(1) <= 22)||(input.LA(1) >= 29 && input.LA(1) <= 30) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set1)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "characteristic"


    public static class conditionType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionType"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:47:1: conditionType : ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' );
    public final FDLParser.conditionType_return conditionType() throws RecognitionException {
        FDLParser.conditionType_return retval = new FDLParser.conditionType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set2=null;

        CommonTree set2_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:47:15: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set2=(Token)input.LT(1);

            if ( input.LA(1)==12||(input.LA(1) >= 18 && input.LA(1) <= 19)||(input.LA(1) >= 25 && input.LA(1) <= 27)||input.LA(1)==36||input.LA(1)==39 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set2)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionType"


    public static class moveAction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moveAction"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:57:1: moveAction : ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' );
    public final FDLParser.moveAction_return moveAction() throws RecognitionException {
        FDLParser.moveAction_return retval = new FDLParser.moveAction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:57:12: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set3=(Token)input.LT(1);

            if ( input.LA(1)==17||input.LA(1)==20||(input.LA(1) >= 33 && input.LA(1) <= 35)||(input.LA(1) >= 37 && input.LA(1) <= 38) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set3)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "moveAction"


    public static class fightAction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fightAction"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:66:1: fightAction : ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' );
    public final FDLParser.fightAction_return fightAction() throws RecognitionException {
        FDLParser.fightAction_return retval = new FDLParser.fightAction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set4=null;

        CommonTree set4_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:66:13: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set4=(Token)input.LT(1);

            if ( (input.LA(1) >= 14 && input.LA(1) <= 15)||(input.LA(1) >= 23 && input.LA(1) <= 24)||(input.LA(1) >= 31 && input.LA(1) <= 32) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set4)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fightAction"


    public static class fighterName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighterName"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:74:1: fighterName : IDENT ;
    public final FDLParser.fighterName_return fighterName() throws RecognitionException {
        FDLParser.fighterName_return retval = new FDLParser.fighterName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT5=null;

        CommonTree IDENT5_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:74:13: ( IDENT )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:74:15: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighterName630); 
            IDENT5_tree = 
            (CommonTree)adaptor.create(IDENT5)
            ;
            adaptor.addChild(root_0, IDENT5_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fighterName"


    public static class personality_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:76:1: personality : characteristic '=' ! INTEGER ;
    public final FDLParser.personality_return personality() throws RecognitionException {
        FDLParser.personality_return retval = new FDLParser.personality_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal7=null;
        Token INTEGER8=null;
        FDLParser.characteristic_return characteristic6 =null;


        CommonTree char_literal7_tree=null;
        CommonTree INTEGER8_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:76:13: ( characteristic '=' ! INTEGER )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:76:15: characteristic '=' ! INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_characteristic_in_personality639);
            characteristic6=characteristic();

            state._fsp--;

            adaptor.addChild(root_0, characteristic6.getTree());

            char_literal7=(Token)match(input,9,FOLLOW_9_in_personality641); 

            INTEGER8=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_personality644); 
            INTEGER8_tree = 
            (CommonTree)adaptor.create(INTEGER8)
            ;
            adaptor.addChild(root_0, INTEGER8_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "personality"


    public static class conditionExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionExpression"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:78:1: conditionExpression : ( conditionType 'and' ! conditionExpression | conditionType 'or' ! conditionExpression | conditionType );
    public final FDLParser.conditionExpression_return conditionExpression() throws RecognitionException {
        FDLParser.conditionExpression_return retval = new FDLParser.conditionExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal10=null;
        Token string_literal13=null;
        FDLParser.conditionType_return conditionType9 =null;

        FDLParser.conditionExpression_return conditionExpression11 =null;

        FDLParser.conditionType_return conditionType12 =null;

        FDLParser.conditionExpression_return conditionExpression14 =null;

        FDLParser.conditionType_return conditionType15 =null;


        CommonTree string_literal10_tree=null;
        CommonTree string_literal13_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:78:21: ( conditionType 'and' ! conditionExpression | conditionType 'or' ! conditionExpression | conditionType )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12||(LA1_0 >= 18 && LA1_0 <= 19)||(LA1_0 >= 25 && LA1_0 <= 27)||LA1_0==36||LA1_0==39) ) {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    alt1=1;
                    }
                    break;
                case 28:
                    {
                    alt1=2;
                    }
                    break;
                case 10:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:78:23: conditionType 'and' ! conditionExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_conditionExpression652);
                    conditionType9=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionType9.getTree());

                    string_literal10=(Token)match(input,13,FOLLOW_13_in_conditionExpression654); 

                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression657);
                    conditionExpression11=conditionExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionExpression11.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:79:23: conditionType 'or' ! conditionExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_conditionExpression681);
                    conditionType12=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionType12.getTree());

                    string_literal13=(Token)match(input,28,FOLLOW_28_in_conditionExpression683); 

                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression686);
                    conditionExpression14=conditionExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionExpression14.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:80:23: conditionType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_conditionExpression710);
                    conditionType15=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionType15.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionExpression"


    public static class moveChoice_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moveChoice"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:1: moveChoice : 'choose' ! '(' ! ( moveAction )+ ')' !;
    public final FDLParser.moveChoice_return moveChoice() throws RecognitionException {
        FDLParser.moveChoice_return retval = new FDLParser.moveChoice_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        FDLParser.moveAction_return moveAction18 =null;


        CommonTree string_literal16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal19_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:12: ( 'choose' ! '(' ! ( moveAction )+ ')' !)
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:14: 'choose' ! '(' ! ( moveAction )+ ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal16=(Token)match(input,16,FOLLOW_16_in_moveChoice739); 

            char_literal17=(Token)match(input,7,FOLLOW_7_in_moveChoice742); 

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:29: ( moveAction )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==20||(LA2_0 >= 33 && LA2_0 <= 35)||(LA2_0 >= 37 && LA2_0 <= 38)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:29: moveAction
            	    {
            	    pushFollow(FOLLOW_moveAction_in_moveChoice745);
            	    moveAction18=moveAction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, moveAction18.getTree());

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


            char_literal19=(Token)match(input,8,FOLLOW_8_in_moveChoice748); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "moveChoice"


    public static class fightChoice_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fightChoice"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:84:1: fightChoice : 'choose' ! '(' ! ( fightAction )+ ')' !;
    public final FDLParser.fightChoice_return fightChoice() throws RecognitionException {
        FDLParser.fightChoice_return retval = new FDLParser.fightChoice_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal20=null;
        Token char_literal21=null;
        Token char_literal23=null;
        FDLParser.fightAction_return fightAction22 =null;


        CommonTree string_literal20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree char_literal23_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:84:13: ( 'choose' ! '(' ! ( fightAction )+ ')' !)
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:84:15: 'choose' ! '(' ! ( fightAction )+ ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal20=(Token)match(input,16,FOLLOW_16_in_fightChoice756); 

            char_literal21=(Token)match(input,7,FOLLOW_7_in_fightChoice759); 

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:84:30: ( fightAction )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= 14 && LA3_0 <= 15)||(LA3_0 >= 23 && LA3_0 <= 24)||(LA3_0 >= 31 && LA3_0 <= 32)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:84:30: fightAction
            	    {
            	    pushFollow(FOLLOW_fightAction_in_fightChoice762);
            	    fightAction22=fightAction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fightAction22.getTree());

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


            char_literal23=(Token)match(input,8,FOLLOW_8_in_fightChoice765); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fightChoice"


    public static class moveRule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moveRule"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:85:1: moveRule : ( moveAction | moveChoice );
    public final FDLParser.moveRule_return moveRule() throws RecognitionException {
        FDLParser.moveRule_return retval = new FDLParser.moveRule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        FDLParser.moveAction_return moveAction24 =null;

        FDLParser.moveChoice_return moveChoice25 =null;



        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:85:10: ( moveAction | moveChoice )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17||LA4_0==20||(LA4_0 >= 33 && LA4_0 <= 35)||(LA4_0 >= 37 && LA4_0 <= 38)) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:85:12: moveAction
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_moveAction_in_moveRule773);
                    moveAction24=moveAction();

                    state._fsp--;

                    adaptor.addChild(root_0, moveAction24.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:85:25: moveChoice
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_moveChoice_in_moveRule777);
                    moveChoice25=moveChoice();

                    state._fsp--;

                    adaptor.addChild(root_0, moveChoice25.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "moveRule"


    public static class fightRule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fightRule"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:86:1: fightRule : ( fightAction | fightChoice );
    public final FDLParser.fightRule_return fightRule() throws RecognitionException {
        FDLParser.fightRule_return retval = new FDLParser.fightRule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        FDLParser.fightAction_return fightAction26 =null;

        FDLParser.fightChoice_return fightChoice27 =null;



        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:86:11: ( fightAction | fightChoice )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= 14 && LA5_0 <= 15)||(LA5_0 >= 23 && LA5_0 <= 24)||(LA5_0 >= 31 && LA5_0 <= 32)) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:86:13: fightAction
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_fightAction_in_fightRule784);
                    fightAction26=fightAction();

                    state._fsp--;

                    adaptor.addChild(root_0, fightAction26.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:86:27: fightChoice
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_fightChoice_in_fightRule788);
                    fightChoice27=fightChoice();

                    state._fsp--;

                    adaptor.addChild(root_0, fightChoice27.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fightRule"


    public static class rules_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rules"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:87:1: rules : moveRule fightRule ;
    public final FDLParser.rules_return rules() throws RecognitionException {
        FDLParser.rules_return retval = new FDLParser.rules_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        FDLParser.moveRule_return moveRule28 =null;

        FDLParser.fightRule_return fightRule29 =null;



        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:87:7: ( moveRule fightRule )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:87:9: moveRule fightRule
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_moveRule_in_rules795);
            moveRule28=moveRule();

            state._fsp--;

            adaptor.addChild(root_0, moveRule28.getTree());

            pushFollow(FOLLOW_fightRule_in_rules797);
            fightRule29=fightRule();

            state._fsp--;

            adaptor.addChild(root_0, fightRule29.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rules"


    public static class behaviour_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:89:1: behaviour : conditionExpression '[' ! rules ']' !;
    public final FDLParser.behaviour_return behaviour() throws RecognitionException {
        FDLParser.behaviour_return retval = new FDLParser.behaviour_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal31=null;
        Token char_literal33=null;
        FDLParser.conditionExpression_return conditionExpression30 =null;

        FDLParser.rules_return rules32 =null;


        CommonTree char_literal31_tree=null;
        CommonTree char_literal33_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:89:11: ( conditionExpression '[' ! rules ']' !)
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:89:13: conditionExpression '[' ! rules ']' !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionExpression_in_behaviour805);
            conditionExpression30=conditionExpression();

            state._fsp--;

            adaptor.addChild(root_0, conditionExpression30.getTree());

            char_literal31=(Token)match(input,10,FOLLOW_10_in_behaviour807); 

            pushFollow(FOLLOW_rules_in_behaviour810);
            rules32=rules();

            state._fsp--;

            adaptor.addChild(root_0, rules32.getTree());

            char_literal33=(Token)match(input,11,FOLLOW_11_in_behaviour812); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "behaviour"


    public static class fighterAttribute_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighterAttribute"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:91:1: fighterAttribute : ( personality | behaviour );
    public final FDLParser.fighterAttribute_return fighterAttribute() throws RecognitionException {
        FDLParser.fighterAttribute_return retval = new FDLParser.fighterAttribute_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        FDLParser.personality_return personality34 =null;

        FDLParser.behaviour_return behaviour35 =null;



        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:91:18: ( personality | behaviour )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= 21 && LA6_0 <= 22)||(LA6_0 >= 29 && LA6_0 <= 30)) ) {
                alt6=1;
            }
            else if ( (LA6_0==12||(LA6_0 >= 18 && LA6_0 <= 19)||(LA6_0 >= 25 && LA6_0 <= 27)||LA6_0==36||LA6_0==39) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:91:20: personality
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_personality_in_fighterAttribute839);
                    personality34=personality();

                    state._fsp--;

                    adaptor.addChild(root_0, personality34.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:91:34: behaviour
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_behaviour_in_fighterAttribute843);
                    behaviour35=behaviour();

                    state._fsp--;

                    adaptor.addChild(root_0, behaviour35.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fighterAttribute"


    public static class fighter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:93:1: fighter : fighterName '{' ! ( fighterAttribute )* '}' !;
    public final FDLParser.fighter_return fighter() throws RecognitionException {
        FDLParser.fighter_return retval = new FDLParser.fighter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal37=null;
        Token char_literal39=null;
        FDLParser.fighterName_return fighterName36 =null;

        FDLParser.fighterAttribute_return fighterAttribute38 =null;


        CommonTree char_literal37_tree=null;
        CommonTree char_literal39_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:93:9: ( fighterName '{' ! ( fighterAttribute )* '}' !)
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:93:11: fighterName '{' ! ( fighterAttribute )* '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_fighterName_in_fighter851);
            fighterName36=fighterName();

            state._fsp--;

            adaptor.addChild(root_0, fighterName36.getTree());

            char_literal37=(Token)match(input,40,FOLLOW_40_in_fighter853); 

            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:93:28: ( fighterAttribute )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12||(LA7_0 >= 18 && LA7_0 <= 19)||(LA7_0 >= 21 && LA7_0 <= 22)||(LA7_0 >= 25 && LA7_0 <= 27)||(LA7_0 >= 29 && LA7_0 <= 30)||LA7_0==36||LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:93:28: fighterAttribute
            	    {
            	    pushFollow(FOLLOW_fighterAttribute_in_fighter856);
            	    fighterAttribute38=fighterAttribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fighterAttribute38.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            char_literal39=(Token)match(input,41,FOLLOW_41_in_fighter859); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fighter"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighterName630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_personality639 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_personality641 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INTEGER_in_personality644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_conditionExpression652 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_conditionExpression654 = new BitSet(new long[]{0x000000900E0C1000L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_conditionExpression681 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_conditionExpression683 = new BitSet(new long[]{0x000000900E0C1000L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_conditionExpression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_moveChoice739 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_moveChoice742 = new BitSet(new long[]{0x0000006E00120000L});
    public static final BitSet FOLLOW_moveAction_in_moveChoice745 = new BitSet(new long[]{0x0000006E00120100L});
    public static final BitSet FOLLOW_8_in_moveChoice748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_fightChoice756 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_fightChoice759 = new BitSet(new long[]{0x000000018180C000L});
    public static final BitSet FOLLOW_fightAction_in_fightChoice762 = new BitSet(new long[]{0x000000018180C100L});
    public static final BitSet FOLLOW_8_in_fightChoice765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveAction_in_moveRule773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveChoice_in_moveRule777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fightAction_in_fightRule784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fightChoice_in_fightRule788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveRule_in_rules795 = new BitSet(new long[]{0x000000018181C000L});
    public static final BitSet FOLLOW_fightRule_in_rules797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionExpression_in_behaviour805 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_behaviour807 = new BitSet(new long[]{0x0000006E00130000L});
    public static final BitSet FOLLOW_rules_in_behaviour810 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviour812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personality_in_fighterAttribute839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_fighterAttribute843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fighterName_in_fighter851 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fighter853 = new BitSet(new long[]{0x000002906E6C1000L});
    public static final BitSet FOLLOW_fighterAttribute_in_fighter856 = new BitSet(new long[]{0x000002906E6C1000L});
    public static final BitSet FOLLOW_41_in_fighter859 = new BitSet(new long[]{0x0000000000000002L});

}