// $ANTLR 3.4 D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g 2012-01-22 12:58:24

  package nl.uva.lap.saf;
  import nl.uva.lap.saf.Fighter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "IDENT", "INTEGER", "MULTICOMMENT", "WS", "'('", "')'", "'='", "'['", "']'", "'always'", "'and'", "'block_high'", "'block_low'", "'choose'", "'crouch'", "'far'", "'kickPower'", "'kickReach'", "'kick_high'", "'kick_low'", "'much_stronger'", "'much_weaker'", "'near'", "'or'", "'punchPower'", "'punchReach'", "'punch_high'", "'punch_low'", "'run_away'", "'run_towards'", "'stand'", "'stronger'", "'walk_away'", "'walk_towards'", "'weaker'", "'{'", "'}'"
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

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SAFParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:20:1: fighter : IDENT ^ '{' ! ( statement )* '}' !;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT1=null;
        Token char_literal2=null;
        Token char_literal4=null;
        SAFParser.statement_return statement3 =null;


        CommonTree IDENT1_tree=null;
        CommonTree char_literal2_tree=null;
        CommonTree char_literal4_tree=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:20:8: ( IDENT ^ '{' ! ( statement )* '}' !)
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:20:10: IDENT ^ '{' ! ( statement )* '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter54); 
            IDENT1_tree = 
            (CommonTree)adaptor.create(IDENT1)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IDENT1_tree, root_0);


            char_literal2=(Token)match(input,40,FOLLOW_40_in_fighter57); 

            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:20:22: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9||LA1_0==14||(LA1_0 >= 20 && LA1_0 <= 22)||(LA1_0 >= 25 && LA1_0 <= 27)||(LA1_0 >= 29 && LA1_0 <= 30)||LA1_0==36||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:20:22: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_fighter60);
            	    statement3=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            char_literal4=(Token)match(input,41,FOLLOW_41_in_fighter63); 

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


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:22:1: statement : ( personalityStatement | behaviourStatement );
    public final SAFParser.statement_return statement() throws RecognitionException {
        SAFParser.statement_return retval = new SAFParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.personalityStatement_return personalityStatement5 =null;

        SAFParser.behaviourStatement_return behaviourStatement6 =null;



        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:22:10: ( personalityStatement | behaviourStatement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 21 && LA2_0 <= 22)||(LA2_0 >= 29 && LA2_0 <= 30)) ) {
                alt2=1;
            }
            else if ( (LA2_0==9||LA2_0==14||LA2_0==20||(LA2_0 >= 25 && LA2_0 <= 27)||LA2_0==36||LA2_0==39) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:22:12: personalityStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_personalityStatement_in_statement72);
                    personalityStatement5=personalityStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, personalityStatement5.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:22:35: behaviourStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_behaviourStatement_in_statement76);
                    behaviourStatement6=behaviourStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, behaviourStatement6.getTree());

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
    // $ANTLR end "statement"


    public static class personalityStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personalityStatement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:24:1: personalityStatement : personality ^ '=' ! INTEGER ;
    public final SAFParser.personalityStatement_return personalityStatement() throws RecognitionException {
        SAFParser.personalityStatement_return retval = new SAFParser.personalityStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal8=null;
        Token INTEGER9=null;
        SAFParser.personality_return personality7 =null;


        CommonTree char_literal8_tree=null;
        CommonTree INTEGER9_tree=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:24:21: ( personality ^ '=' ! INTEGER )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:24:23: personality ^ '=' ! INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_personality_in_personalityStatement83);
            personality7=personality();

            state._fsp--;

            root_0 = (CommonTree)adaptor.becomeRoot(personality7.getTree(), root_0);

            char_literal8=(Token)match(input,11,FOLLOW_11_in_personalityStatement86); 

            INTEGER9=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_personalityStatement89); 
            INTEGER9_tree = 
            (CommonTree)adaptor.create(INTEGER9)
            ;
            adaptor.addChild(root_0, INTEGER9_tree);


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
    // $ANTLR end "personalityStatement"


    public static class personality_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:25:1: personality : ( 'kickPower' | 'punchPower' | 'kickReach' | 'punchReach' );
    public final SAFParser.personality_return personality() throws RecognitionException {
        SAFParser.personality_return retval = new SAFParser.personality_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:25:13: ( 'kickPower' | 'punchPower' | 'kickReach' | 'punchReach' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set10=(Token)input.LT(1);

            if ( (input.LA(1) >= 21 && input.LA(1) <= 22)||(input.LA(1) >= 29 && input.LA(1) <= 30) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set10)
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
    // $ANTLR end "personality"


    public static class behaviourStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviourStatement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:27:1: behaviourStatement : conditions ^ '[' ! abstractActionStatement ']' !;
    public final SAFParser.behaviourStatement_return behaviourStatement() throws RecognitionException {
        SAFParser.behaviourStatement_return retval = new SAFParser.behaviourStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal12=null;
        Token char_literal14=null;
        SAFParser.conditions_return conditions11 =null;

        SAFParser.abstractActionStatement_return abstractActionStatement13 =null;


        CommonTree char_literal12_tree=null;
        CommonTree char_literal14_tree=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:27:20: ( conditions ^ '[' ! abstractActionStatement ']' !)
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:27:22: conditions ^ '[' ! abstractActionStatement ']' !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditions_in_behaviourStatement116);
            conditions11=conditions();

            state._fsp--;

            root_0 = (CommonTree)adaptor.becomeRoot(conditions11.getTree(), root_0);

            char_literal12=(Token)match(input,12,FOLLOW_12_in_behaviourStatement119); 

            pushFollow(FOLLOW_abstractActionStatement_in_behaviourStatement122);
            abstractActionStatement13=abstractActionStatement();

            state._fsp--;

            adaptor.addChild(root_0, abstractActionStatement13.getTree());

            char_literal14=(Token)match(input,13,FOLLOW_13_in_behaviourStatement124); 

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
    // $ANTLR end "behaviourStatement"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:29:1: expression : ( condition | '(' ! conditions ')' !);
    public final SAFParser.expression_return expression() throws RecognitionException {
        SAFParser.expression_return retval = new SAFParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal16=null;
        Token char_literal18=null;
        SAFParser.condition_return condition15 =null;

        SAFParser.conditions_return conditions17 =null;


        CommonTree char_literal16_tree=null;
        CommonTree char_literal18_tree=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:29:12: ( condition | '(' ! conditions ')' !)
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14||LA3_0==20||(LA3_0 >= 25 && LA3_0 <= 27)||LA3_0==36||LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==9) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:29:14: condition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_condition_in_expression133);
                    condition15=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition15.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:29:26: '(' ! conditions ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal16=(Token)match(input,9,FOLLOW_9_in_expression137); 

                    pushFollow(FOLLOW_conditions_in_expression140);
                    conditions17=conditions();

                    state._fsp--;

                    adaptor.addChild(root_0, conditions17.getTree());

                    char_literal18=(Token)match(input,10,FOLLOW_10_in_expression142); 

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
    // $ANTLR end "expression"


    public static class conditions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditions"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:30:1: conditions : expression ^ ( ( 'and' | 'or' ) ^ expression )* ;
    public final SAFParser.conditions_return conditions() throws RecognitionException {
        SAFParser.conditions_return retval = new SAFParser.conditions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set20=null;
        SAFParser.expression_return expression19 =null;

        SAFParser.expression_return expression21 =null;


        CommonTree set20_tree=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:30:12: ( expression ^ ( ( 'and' | 'or' ) ^ expression )* )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:30:14: expression ^ ( ( 'and' | 'or' ) ^ expression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_conditions150);
            expression19=expression();

            state._fsp--;

            root_0 = (CommonTree)adaptor.becomeRoot(expression19.getTree(), root_0);

            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:30:26: ( ( 'and' | 'or' ) ^ expression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:30:27: ( 'and' | 'or' ) ^ expression
            	    {
            	    set20=(Token)input.LT(1);

            	    set20=(Token)input.LT(1);

            	    if ( input.LA(1)==15||input.LA(1)==28 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set20)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_expression_in_conditions163);
            	    expression21=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression21.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "conditions"


    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:31:1: condition : ( 'far' | 'near' | 'stronger' | 'much_stronger' | 'weaker' | 'much_weaker' | 'always' );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set22=null;

        CommonTree set22_tree=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:31:11: ( 'far' | 'near' | 'stronger' | 'much_stronger' | 'weaker' | 'much_weaker' | 'always' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set22=(Token)input.LT(1);

            if ( input.LA(1)==14||input.LA(1)==20||(input.LA(1) >= 25 && input.LA(1) <= 27)||input.LA(1)==36||input.LA(1)==39 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set22)
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
    // $ANTLR end "condition"


    public static class abstractActionStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "abstractActionStatement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:34:1: abstractActionStatement : ( actionStatement )+ ;
    public final SAFParser.abstractActionStatement_return abstractActionStatement() throws RecognitionException {
        SAFParser.abstractActionStatement_return retval = new SAFParser.abstractActionStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.actionStatement_return actionStatement23 =null;



        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:34:25: ( ( actionStatement )+ )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:34:27: ( actionStatement )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:34:27: ( actionStatement )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= 16 && LA5_0 <= 19)||(LA5_0 >= 23 && LA5_0 <= 24)||(LA5_0 >= 31 && LA5_0 <= 35)||(LA5_0 >= 37 && LA5_0 <= 38)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:34:27: actionStatement
            	    {
            	    pushFollow(FOLLOW_actionStatement_in_abstractActionStatement205);
            	    actionStatement23=actionStatement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actionStatement23.getTree());

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
    // $ANTLR end "abstractActionStatement"


    public static class actionStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "actionStatement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:35:1: actionStatement : ( action | ( 'choose' ^ '(' ! ( action )+ ')' !) ) ;
    public final SAFParser.actionStatement_return actionStatement() throws RecognitionException {
        SAFParser.actionStatement_return retval = new SAFParser.actionStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal25=null;
        Token char_literal26=null;
        Token char_literal28=null;
        SAFParser.action_return action24 =null;

        SAFParser.action_return action27 =null;


        CommonTree string_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal28_tree=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:35:17: ( ( action | ( 'choose' ^ '(' ! ( action )+ ')' !) ) )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:35:19: ( action | ( 'choose' ^ '(' ! ( action )+ ')' !) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:35:19: ( action | ( 'choose' ^ '(' ! ( action )+ ')' !) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= 16 && LA7_0 <= 17)||LA7_0==19||(LA7_0 >= 23 && LA7_0 <= 24)||(LA7_0 >= 31 && LA7_0 <= 35)||(LA7_0 >= 37 && LA7_0 <= 38)) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:35:20: action
                    {
                    pushFollow(FOLLOW_action_in_actionStatement214);
                    action24=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action24.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:35:29: ( 'choose' ^ '(' ! ( action )+ ')' !)
                    {
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:35:29: ( 'choose' ^ '(' ! ( action )+ ')' !)
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:35:30: 'choose' ^ '(' ! ( action )+ ')' !
                    {
                    string_literal25=(Token)match(input,18,FOLLOW_18_in_actionStatement219); 
                    string_literal25_tree = 
                    (CommonTree)adaptor.create(string_literal25)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal25_tree, root_0);


                    char_literal26=(Token)match(input,9,FOLLOW_9_in_actionStatement222); 

                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:35:45: ( action )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= 16 && LA6_0 <= 17)||LA6_0==19||(LA6_0 >= 23 && LA6_0 <= 24)||(LA6_0 >= 31 && LA6_0 <= 35)||(LA6_0 >= 37 && LA6_0 <= 38)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:35:45: action
                    	    {
                    	    pushFollow(FOLLOW_action_in_actionStatement225);
                    	    action27=action();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, action27.getTree());

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


                    char_literal28=(Token)match(input,10,FOLLOW_10_in_actionStatement228); 

                    }


                    }
                    break;

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
    // $ANTLR end "actionStatement"


    public static class action_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:36:1: action : ( 'kick_low' | 'kick_high' | 'punch_low' | 'punch_high' | 'run_away' | 'run_towards' | 'walk_away' | 'walk_towards' | 'stand' | 'crouch' | 'block_low' | 'block_high' );
    public final SAFParser.action_return action() throws RecognitionException {
        SAFParser.action_return retval = new SAFParser.action_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set29=null;

        CommonTree set29_tree=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:36:8: ( 'kick_low' | 'kick_high' | 'punch_low' | 'punch_high' | 'run_away' | 'run_towards' | 'walk_away' | 'walk_towards' | 'stand' | 'crouch' | 'block_low' | 'block_high' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set29=(Token)input.LT(1);

            if ( (input.LA(1) >= 16 && input.LA(1) <= 17)||input.LA(1)==19||(input.LA(1) >= 23 && input.LA(1) <= 24)||(input.LA(1) >= 31 && input.LA(1) <= 35)||(input.LA(1) >= 37 && input.LA(1) <= 38) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set29)
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
    // $ANTLR end "action"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighter54 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fighter57 = new BitSet(new long[]{0x000002906E704200L});
    public static final BitSet FOLLOW_statement_in_fighter60 = new BitSet(new long[]{0x000002906E704200L});
    public static final BitSet FOLLOW_41_in_fighter63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personalityStatement_in_statement72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviourStatement_in_statement76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personality_in_personalityStatement83 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_personalityStatement86 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INTEGER_in_personalityStatement89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditions_in_behaviourStatement116 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviourStatement119 = new BitSet(new long[]{0x0000006F818F0000L});
    public static final BitSet FOLLOW_abstractActionStatement_in_behaviourStatement122 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_behaviourStatement124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_expression133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_expression137 = new BitSet(new long[]{0x000000900E104200L});
    public static final BitSet FOLLOW_conditions_in_expression140 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_conditions150 = new BitSet(new long[]{0x0000000010008002L});
    public static final BitSet FOLLOW_set_in_conditions154 = new BitSet(new long[]{0x000000900E104200L});
    public static final BitSet FOLLOW_expression_in_conditions163 = new BitSet(new long[]{0x0000000010008002L});
    public static final BitSet FOLLOW_actionStatement_in_abstractActionStatement205 = new BitSet(new long[]{0x0000006F818F0002L});
    public static final BitSet FOLLOW_action_in_actionStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_actionStatement219 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_actionStatement222 = new BitSet(new long[]{0x0000006F818B0000L});
    public static final BitSet FOLLOW_action_in_actionStatement225 = new BitSet(new long[]{0x0000006F818B0400L});
    public static final BitSet FOLLOW_10_in_actionStatement228 = new BitSet(new long[]{0x0000000000000002L});

}