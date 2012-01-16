// $ANTLR 3.4 C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g 2012-01-16 22:31:08

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
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:1: characteristic : ( 'kickPower' | 'kickReach' | 'punchPower' | 'punchReach' );
    public final FDLParser.characteristic_return characteristic() throws RecognitionException {
        FDLParser.characteristic_return retval = new FDLParser.characteristic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set1=null;

        Object set1_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:16: ( 'kickPower' | 'kickReach' | 'punchPower' | 'punchReach' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
            {
            root_0 = (Object)adaptor.nil();


            set1=(Token)input.LT(1);

            if ( (input.LA(1) >= 21 && input.LA(1) <= 22)||(input.LA(1) >= 29 && input.LA(1) <= 30) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set1)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "characteristic"


    public static class conditionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionType"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:46:1: conditionType : ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' );
    public final FDLParser.conditionType_return conditionType() throws RecognitionException {
        FDLParser.conditionType_return retval = new FDLParser.conditionType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set2=null;

        Object set2_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:46:15: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
            {
            root_0 = (Object)adaptor.nil();


            set2=(Token)input.LT(1);

            if ( input.LA(1)==12||(input.LA(1) >= 18 && input.LA(1) <= 19)||(input.LA(1) >= 25 && input.LA(1) <= 27)||input.LA(1)==36||input.LA(1)==39 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set2)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionType"


    public static class moveAction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moveAction"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:56:1: moveAction : ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' );
    public final FDLParser.moveAction_return moveAction() throws RecognitionException {
        FDLParser.moveAction_return retval = new FDLParser.moveAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set3=null;

        Object set3_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:56:12: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
            {
            root_0 = (Object)adaptor.nil();


            set3=(Token)input.LT(1);

            if ( input.LA(1)==17||input.LA(1)==20||(input.LA(1) >= 33 && input.LA(1) <= 35)||(input.LA(1) >= 37 && input.LA(1) <= 38) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set3)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "moveAction"


    public static class fightAction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fightAction"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:65:1: fightAction : ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' );
    public final FDLParser.fightAction_return fightAction() throws RecognitionException {
        FDLParser.fightAction_return retval = new FDLParser.fightAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set4=null;

        Object set4_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:65:13: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:
            {
            root_0 = (Object)adaptor.nil();


            set4=(Token)input.LT(1);

            if ( (input.LA(1) >= 14 && input.LA(1) <= 15)||(input.LA(1) >= 23 && input.LA(1) <= 24)||(input.LA(1) >= 31 && input.LA(1) <= 32) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set4)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fightAction"


    public static class fighterName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighterName"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:73:1: fighterName : IDENT ;
    public final FDLParser.fighterName_return fighterName() throws RecognitionException {
        FDLParser.fighterName_return retval = new FDLParser.fighterName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT5=null;

        Object IDENT5_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:73:13: ( IDENT )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:73:15: IDENT
            {
            root_0 = (Object)adaptor.nil();


            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighterName611); 
            IDENT5_tree = 
            (Object)adaptor.create(IDENT5)
            ;
            adaptor.addChild(root_0, IDENT5_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fighterName"


    public static class personality_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:75:1: personality : characteristic '=' INTEGER ;
    public final FDLParser.personality_return personality() throws RecognitionException {
        FDLParser.personality_return retval = new FDLParser.personality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal7=null;
        Token INTEGER8=null;
        FDLParser.characteristic_return characteristic6 =null;


        Object char_literal7_tree=null;
        Object INTEGER8_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:75:13: ( characteristic '=' INTEGER )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:75:15: characteristic '=' INTEGER
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_characteristic_in_personality620);
            characteristic6=characteristic();

            state._fsp--;

            adaptor.addChild(root_0, characteristic6.getTree());

            char_literal7=(Token)match(input,9,FOLLOW_9_in_personality622); 
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);


            INTEGER8=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_personality624); 
            INTEGER8_tree = 
            (Object)adaptor.create(INTEGER8)
            ;
            adaptor.addChild(root_0, INTEGER8_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "personality"


    public static class conditionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionExpression"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:77:1: conditionExpression : ( conditionType 'and' conditionExpression | conditionType 'or' conditionExpression | conditionType );
    public final FDLParser.conditionExpression_return conditionExpression() throws RecognitionException {
        FDLParser.conditionExpression_return retval = new FDLParser.conditionExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal10=null;
        Token string_literal13=null;
        FDLParser.conditionType_return conditionType9 =null;

        FDLParser.conditionExpression_return conditionExpression11 =null;

        FDLParser.conditionType_return conditionType12 =null;

        FDLParser.conditionExpression_return conditionExpression14 =null;

        FDLParser.conditionType_return conditionType15 =null;


        Object string_literal10_tree=null;
        Object string_literal13_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:77:21: ( conditionType 'and' conditionExpression | conditionType 'or' conditionExpression | conditionType )
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
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:77:23: conditionType 'and' conditionExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_conditionExpression632);
                    conditionType9=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionType9.getTree());

                    string_literal10=(Token)match(input,13,FOLLOW_13_in_conditionExpression634); 
                    string_literal10_tree = 
                    (Object)adaptor.create(string_literal10)
                    ;
                    adaptor.addChild(root_0, string_literal10_tree);


                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression636);
                    conditionExpression11=conditionExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionExpression11.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:78:23: conditionType 'or' conditionExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_conditionExpression660);
                    conditionType12=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionType12.getTree());

                    string_literal13=(Token)match(input,28,FOLLOW_28_in_conditionExpression662); 
                    string_literal13_tree = 
                    (Object)adaptor.create(string_literal13)
                    ;
                    adaptor.addChild(root_0, string_literal13_tree);


                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression664);
                    conditionExpression14=conditionExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionExpression14.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:79:23: conditionType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_conditionExpression688);
                    conditionType15=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionType15.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionExpression"


    public static class moveRule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moveRule"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:82:1: moveRule : ( moveAction | 'choose' '(' ( moveAction )+ ')' );
    public final FDLParser.moveRule_return moveRule() throws RecognitionException {
        FDLParser.moveRule_return retval = new FDLParser.moveRule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        FDLParser.moveAction_return moveAction16 =null;

        FDLParser.moveAction_return moveAction19 =null;


        Object string_literal17_tree=null;
        Object char_literal18_tree=null;
        Object char_literal20_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:82:10: ( moveAction | 'choose' '(' ( moveAction )+ ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17||LA3_0==20||(LA3_0 >= 33 && LA3_0 <= 35)||(LA3_0 >= 37 && LA3_0 <= 38)) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:82:12: moveAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_moveAction_in_moveRule717);
                    moveAction16=moveAction();

                    state._fsp--;

                    adaptor.addChild(root_0, moveAction16.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:82:25: 'choose' '(' ( moveAction )+ ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal17=(Token)match(input,16,FOLLOW_16_in_moveRule721); 
                    string_literal17_tree = 
                    (Object)adaptor.create(string_literal17)
                    ;
                    adaptor.addChild(root_0, string_literal17_tree);


                    char_literal18=(Token)match(input,7,FOLLOW_7_in_moveRule723); 
                    char_literal18_tree = 
                    (Object)adaptor.create(char_literal18)
                    ;
                    adaptor.addChild(root_0, char_literal18_tree);


                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:82:38: ( moveAction )+
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
                    	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:82:38: moveAction
                    	    {
                    	    pushFollow(FOLLOW_moveAction_in_moveRule725);
                    	    moveAction19=moveAction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, moveAction19.getTree());

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


                    char_literal20=(Token)match(input,8,FOLLOW_8_in_moveRule728); 
                    char_literal20_tree = 
                    (Object)adaptor.create(char_literal20)
                    ;
                    adaptor.addChild(root_0, char_literal20_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "moveRule"


    public static class fightRule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fightRule"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:1: fightRule : ( fightAction | 'choose' '(' ( fightAction )+ ')' );
    public final FDLParser.fightRule_return fightRule() throws RecognitionException {
        FDLParser.fightRule_return retval = new FDLParser.fightRule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal22=null;
        Token char_literal23=null;
        Token char_literal25=null;
        FDLParser.fightAction_return fightAction21 =null;

        FDLParser.fightAction_return fightAction24 =null;


        Object string_literal22_tree=null;
        Object char_literal23_tree=null;
        Object char_literal25_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:11: ( fightAction | 'choose' '(' ( fightAction )+ ')' )
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
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:13: fightAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fightAction_in_fightRule735);
                    fightAction21=fightAction();

                    state._fsp--;

                    adaptor.addChild(root_0, fightAction21.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:27: 'choose' '(' ( fightAction )+ ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal22=(Token)match(input,16,FOLLOW_16_in_fightRule739); 
                    string_literal22_tree = 
                    (Object)adaptor.create(string_literal22)
                    ;
                    adaptor.addChild(root_0, string_literal22_tree);


                    char_literal23=(Token)match(input,7,FOLLOW_7_in_fightRule741); 
                    char_literal23_tree = 
                    (Object)adaptor.create(char_literal23)
                    ;
                    adaptor.addChild(root_0, char_literal23_tree);


                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:40: ( fightAction )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= 14 && LA4_0 <= 15)||(LA4_0 >= 23 && LA4_0 <= 24)||(LA4_0 >= 31 && LA4_0 <= 32)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:83:40: fightAction
                    	    {
                    	    pushFollow(FOLLOW_fightAction_in_fightRule743);
                    	    fightAction24=fightAction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, fightAction24.getTree());

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


                    char_literal25=(Token)match(input,8,FOLLOW_8_in_fightRule746); 
                    char_literal25_tree = 
                    (Object)adaptor.create(char_literal25)
                    ;
                    adaptor.addChild(root_0, char_literal25_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fightRule"


    public static class rules_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rules"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:84:1: rules : moveRule fightRule ;
    public final FDLParser.rules_return rules() throws RecognitionException {
        FDLParser.rules_return retval = new FDLParser.rules_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FDLParser.moveRule_return moveRule26 =null;

        FDLParser.fightRule_return fightRule27 =null;



        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:84:7: ( moveRule fightRule )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:84:9: moveRule fightRule
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_moveRule_in_rules753);
            moveRule26=moveRule();

            state._fsp--;

            adaptor.addChild(root_0, moveRule26.getTree());

            pushFollow(FOLLOW_fightRule_in_rules755);
            fightRule27=fightRule();

            state._fsp--;

            adaptor.addChild(root_0, fightRule27.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rules"


    public static class behaviour_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:86:1: behaviour : conditionExpression '[' rules ']' ;
    public final FDLParser.behaviour_return behaviour() throws RecognitionException {
        FDLParser.behaviour_return retval = new FDLParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal29=null;
        Token char_literal31=null;
        FDLParser.conditionExpression_return conditionExpression28 =null;

        FDLParser.rules_return rules30 =null;


        Object char_literal29_tree=null;
        Object char_literal31_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:86:11: ( conditionExpression '[' rules ']' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:86:13: conditionExpression '[' rules ']'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditionExpression_in_behaviour763);
            conditionExpression28=conditionExpression();

            state._fsp--;

            adaptor.addChild(root_0, conditionExpression28.getTree());

            char_literal29=(Token)match(input,10,FOLLOW_10_in_behaviour765); 
            char_literal29_tree = 
            (Object)adaptor.create(char_literal29)
            ;
            adaptor.addChild(root_0, char_literal29_tree);


            pushFollow(FOLLOW_rules_in_behaviour767);
            rules30=rules();

            state._fsp--;

            adaptor.addChild(root_0, rules30.getTree());

            char_literal31=(Token)match(input,11,FOLLOW_11_in_behaviour769); 
            char_literal31_tree = 
            (Object)adaptor.create(char_literal31)
            ;
            adaptor.addChild(root_0, char_literal31_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "behaviour"


    public static class fighterAttribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighterAttribute"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:88:1: fighterAttribute : ( personality | behaviour );
    public final FDLParser.fighterAttribute_return fighterAttribute() throws RecognitionException {
        FDLParser.fighterAttribute_return retval = new FDLParser.fighterAttribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FDLParser.personality_return personality32 =null;

        FDLParser.behaviour_return behaviour33 =null;



        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:88:18: ( personality | behaviour )
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
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:88:20: personality
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_personality_in_fighterAttribute795);
                    personality32=personality();

                    state._fsp--;

                    adaptor.addChild(root_0, personality32.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:88:34: behaviour
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_behaviour_in_fighterAttribute799);
                    behaviour33=behaviour();

                    state._fsp--;

                    adaptor.addChild(root_0, behaviour33.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fighterAttribute"


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:90:1: fighter : fighterName '{' ( fighterAttribute )* '}' ;
    public final FDLParser.fighter_return fighter() throws RecognitionException {
        FDLParser.fighter_return retval = new FDLParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal35=null;
        Token char_literal37=null;
        FDLParser.fighterName_return fighterName34 =null;

        FDLParser.fighterAttribute_return fighterAttribute36 =null;


        Object char_literal35_tree=null;
        Object char_literal37_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:90:9: ( fighterName '{' ( fighterAttribute )* '}' )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:90:11: fighterName '{' ( fighterAttribute )* '}'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_fighterName_in_fighter807);
            fighterName34=fighterName();

            state._fsp--;

            adaptor.addChild(root_0, fighterName34.getTree());

            char_literal35=(Token)match(input,40,FOLLOW_40_in_fighter809); 
            char_literal35_tree = 
            (Object)adaptor.create(char_literal35)
            ;
            adaptor.addChild(root_0, char_literal35_tree);


            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:90:27: ( fighterAttribute )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12||(LA7_0 >= 18 && LA7_0 <= 19)||(LA7_0 >= 21 && LA7_0 <= 22)||(LA7_0 >= 25 && LA7_0 <= 27)||(LA7_0 >= 29 && LA7_0 <= 30)||LA7_0==36||LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:90:27: fighterAttribute
            	    {
            	    pushFollow(FOLLOW_fighterAttribute_in_fighter811);
            	    fighterAttribute36=fighterAttribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fighterAttribute36.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            char_literal37=(Token)match(input,41,FOLLOW_41_in_fighter814); 
            char_literal37_tree = 
            (Object)adaptor.create(char_literal37)
            ;
            adaptor.addChild(root_0, char_literal37_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fighter"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighterName611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_personality620 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_personality622 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INTEGER_in_personality624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_conditionExpression632 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_conditionExpression634 = new BitSet(new long[]{0x000000900E0C1000L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_conditionExpression660 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_conditionExpression662 = new BitSet(new long[]{0x000000900E0C1000L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_conditionExpression688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveAction_in_moveRule717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_moveRule721 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_moveRule723 = new BitSet(new long[]{0x0000006E00120000L});
    public static final BitSet FOLLOW_moveAction_in_moveRule725 = new BitSet(new long[]{0x0000006E00120100L});
    public static final BitSet FOLLOW_8_in_moveRule728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fightAction_in_fightRule735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_fightRule739 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_fightRule741 = new BitSet(new long[]{0x000000018180C000L});
    public static final BitSet FOLLOW_fightAction_in_fightRule743 = new BitSet(new long[]{0x000000018180C100L});
    public static final BitSet FOLLOW_8_in_fightRule746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveRule_in_rules753 = new BitSet(new long[]{0x000000018181C000L});
    public static final BitSet FOLLOW_fightRule_in_rules755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionExpression_in_behaviour763 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_behaviour765 = new BitSet(new long[]{0x0000006E00130000L});
    public static final BitSet FOLLOW_rules_in_behaviour767 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviour769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personality_in_fighterAttribute795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_fighterAttribute799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fighterName_in_fighter807 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fighter809 = new BitSet(new long[]{0x000002906E6C1000L});
    public static final BitSet FOLLOW_fighterAttribute_in_fighter811 = new BitSet(new long[]{0x000002906E6C1000L});
    public static final BitSet FOLLOW_41_in_fighter814 = new BitSet(new long[]{0x0000000000000002L});

}