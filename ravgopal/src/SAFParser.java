// $ANTLR 3.4 /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g 2012-01-24 14:31:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "AND", "BEHAVIOUR", "CHARACTERISTIC", "CHOICE", "CHOICE_END", "CHOICE_START", "CHOOSE", "CONDITION", "EQLS", "FIGHTER_END", "FIGHTER_START", "INT", "NAME", "OR", "PERSONALITY", "RULE_END", "RULE_START", "STRING", "WHITESPACE", "'kickPower'", "'kickReach'", "'punchPower'", "'punchReach'"
    };

    public static final int EOF=-1;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int ACTION=4;
    public static final int AND=5;
    public static final int BEHAVIOUR=6;
    public static final int CHARACTERISTIC=7;
    public static final int CHOICE=8;
    public static final int CHOICE_END=9;
    public static final int CHOICE_START=10;
    public static final int CHOOSE=11;
    public static final int CONDITION=12;
    public static final int EQLS=13;
    public static final int FIGHTER_END=14;
    public static final int FIGHTER_START=15;
    public static final int INT=16;
    public static final int NAME=17;
    public static final int OR=18;
    public static final int PERSONALITY=19;
    public static final int RULE_END=20;
    public static final int RULE_START=21;
    public static final int STRING=22;
    public static final int WHITESPACE=23;

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
    public String getGrammarFileName() { return "/Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:30:1: fighter : name FIGHTER_START personality behaviour FIGHTER_END EOF -> ^( name ^( PERSONALITY personality ) ^( BEHAVIOUR behaviour ) ) ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FIGHTER_START2=null;
        Token FIGHTER_END5=null;
        Token EOF6=null;
        SAFParser.name_return name1 =null;

        SAFParser.personality_return personality3 =null;

        SAFParser.behaviour_return behaviour4 =null;


        CommonTree FIGHTER_START2_tree=null;
        CommonTree FIGHTER_END5_tree=null;
        CommonTree EOF6_tree=null;
        RewriteRuleTokenStream stream_FIGHTER_END=new RewriteRuleTokenStream(adaptor,"token FIGHTER_END");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_FIGHTER_START=new RewriteRuleTokenStream(adaptor,"token FIGHTER_START");
        RewriteRuleSubtreeStream stream_behaviour=new RewriteRuleSubtreeStream(adaptor,"rule behaviour");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_personality=new RewriteRuleSubtreeStream(adaptor,"rule personality");
        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:31:3: ( name FIGHTER_START personality behaviour FIGHTER_END EOF -> ^( name ^( PERSONALITY personality ) ^( BEHAVIOUR behaviour ) ) )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:31:5: name FIGHTER_START personality behaviour FIGHTER_END EOF
            {
            pushFollow(FOLLOW_name_in_fighter170);
            name1=name();

            state._fsp--;

            stream_name.add(name1.getTree());

            FIGHTER_START2=(Token)match(input,FIGHTER_START,FOLLOW_FIGHTER_START_in_fighter172);  
            stream_FIGHTER_START.add(FIGHTER_START2);


            pushFollow(FOLLOW_personality_in_fighter174);
            personality3=personality();

            state._fsp--;

            stream_personality.add(personality3.getTree());

            pushFollow(FOLLOW_behaviour_in_fighter176);
            behaviour4=behaviour();

            state._fsp--;

            stream_behaviour.add(behaviour4.getTree());

            FIGHTER_END5=(Token)match(input,FIGHTER_END,FOLLOW_FIGHTER_END_in_fighter178);  
            stream_FIGHTER_END.add(FIGHTER_END5);


            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_fighter180);  
            stream_EOF.add(EOF6);


            // AST REWRITE
            // elements: personality, name, behaviour
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 31:62: -> ^( name ^( PERSONALITY personality ) ^( BEHAVIOUR behaviour ) )
            {
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:31:65: ^( name ^( PERSONALITY personality ) ^( BEHAVIOUR behaviour ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:31:72: ^( PERSONALITY personality )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PERSONALITY, "PERSONALITY")
                , root_2);

                adaptor.addChild(root_2, stream_personality.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:31:99: ^( BEHAVIOUR behaviour )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BEHAVIOUR, "BEHAVIOUR")
                , root_2);

                adaptor.addChild(root_2, stream_behaviour.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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


    public static class name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:34:1: name : STRING ;
    public final SAFParser.name_return name() throws RecognitionException {
        SAFParser.name_return retval = new SAFParser.name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING7=null;

        CommonTree STRING7_tree=null;

        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:35:3: ( STRING )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:35:5: STRING
            {
            root_0 = (CommonTree)adaptor.nil();


            STRING7=(Token)match(input,STRING,FOLLOW_STRING_in_name211); 
            STRING7_tree = 
            (CommonTree)adaptor.create(STRING7)
            ;
            adaptor.addChild(root_0, STRING7_tree);


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
    // $ANTLR end "name"


    public static class personality_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:38:1: personality : ( characteristic EQLS INT )* -> ( ^( characteristic INT ) )* ;
    public final SAFParser.personality_return personality() throws RecognitionException {
        SAFParser.personality_return retval = new SAFParser.personality_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQLS9=null;
        Token INT10=null;
        SAFParser.characteristic_return characteristic8 =null;


        CommonTree EQLS9_tree=null;
        CommonTree INT10_tree=null;
        RewriteRuleTokenStream stream_EQLS=new RewriteRuleTokenStream(adaptor,"token EQLS");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_characteristic=new RewriteRuleSubtreeStream(adaptor,"rule characteristic");
        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:39:3: ( ( characteristic EQLS INT )* -> ( ^( characteristic INT ) )* )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:39:5: ( characteristic EQLS INT )*
            {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:39:5: ( characteristic EQLS INT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 24 && LA1_0 <= 27)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:39:6: characteristic EQLS INT
            	    {
            	    pushFollow(FOLLOW_characteristic_in_personality225);
            	    characteristic8=characteristic();

            	    state._fsp--;

            	    stream_characteristic.add(characteristic8.getTree());

            	    EQLS9=(Token)match(input,EQLS,FOLLOW_EQLS_in_personality227);  
            	    stream_EQLS.add(EQLS9);


            	    INT10=(Token)match(input,INT,FOLLOW_INT_in_personality229);  
            	    stream_INT.add(INT10);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: INT, characteristic
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 39:32: -> ( ^( characteristic INT ) )*
            {
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:39:35: ( ^( characteristic INT ) )*
                while ( stream_INT.hasNext()||stream_characteristic.hasNext() ) {
                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:39:35: ^( characteristic INT )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_characteristic.nextNode(), root_1);

                    adaptor.addChild(root_1, 
                    stream_INT.nextNode()
                    );

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_INT.reset();
                stream_characteristic.reset();

            }


            retval.tree = root_0;

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


    public static class characteristic_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:42:1: characteristic : ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' );
    public final SAFParser.characteristic_return characteristic() throws RecognitionException {
        SAFParser.characteristic_return retval = new SAFParser.characteristic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:43:3: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set11=(Token)input.LT(1);

            if ( (input.LA(1) >= 24 && input.LA(1) <= 27) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set11)
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


    public static class behaviour_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:49:1: behaviour : ( rule )* ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.rule_return rule12 =null;



        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:50:3: ( ( rule )* )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:50:5: ( rule )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:50:5: ( rule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:50:6: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_behaviour287);
            	    rule12=rule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rule12.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "behaviour"


    public static class rule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:53:1: rule : condition RULE_START ( action action ) RULE_END -> ^( condition ^( ACTION ^( action action ) ) ) ;
    public final SAFParser.rule_return rule() throws RecognitionException {
        SAFParser.rule_return retval = new SAFParser.rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RULE_START14=null;
        Token RULE_END17=null;
        SAFParser.condition_return condition13 =null;

        SAFParser.action_return action15 =null;

        SAFParser.action_return action16 =null;


        CommonTree RULE_START14_tree=null;
        CommonTree RULE_END17_tree=null;
        RewriteRuleTokenStream stream_RULE_START=new RewriteRuleTokenStream(adaptor,"token RULE_START");
        RewriteRuleTokenStream stream_RULE_END=new RewriteRuleTokenStream(adaptor,"token RULE_END");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:3: ( condition RULE_START ( action action ) RULE_END -> ^( condition ^( ACTION ^( action action ) ) ) )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:5: condition RULE_START ( action action ) RULE_END
            {
            pushFollow(FOLLOW_condition_in_rule302);
            condition13=condition();

            state._fsp--;

            stream_condition.add(condition13.getTree());

            RULE_START14=(Token)match(input,RULE_START,FOLLOW_RULE_START_in_rule304);  
            stream_RULE_START.add(RULE_START14);


            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:26: ( action action )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:27: action action
            {
            pushFollow(FOLLOW_action_in_rule307);
            action15=action();

            state._fsp--;

            stream_action.add(action15.getTree());

            pushFollow(FOLLOW_action_in_rule309);
            action16=action();

            state._fsp--;

            stream_action.add(action16.getTree());

            }


            RULE_END17=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_rule312);  
            stream_RULE_END.add(RULE_END17);


            // AST REWRITE
            // elements: action, action, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 54:51: -> ^( condition ^( ACTION ^( action action ) ) )
            {
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:54: ^( condition ^( ACTION ^( action action ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_condition.nextNode(), root_1);

                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:66: ^( ACTION ^( action action ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ACTION, "ACTION")
                , root_2);

                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:75: ^( action action )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_action.nextNode(), root_3);

                adaptor.addChild(root_3, stream_action.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
    // $ANTLR end "rule"


    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:57:1: condition : ( conditionType AND condition | conditionType OR condition | conditionType );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND19=null;
        Token OR22=null;
        SAFParser.conditionType_return conditionType18 =null;

        SAFParser.condition_return condition20 =null;

        SAFParser.conditionType_return conditionType21 =null;

        SAFParser.condition_return condition23 =null;

        SAFParser.conditionType_return conditionType24 =null;


        CommonTree AND19_tree=null;
        CommonTree OR22_tree=null;

        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:58:3: ( conditionType AND condition | conditionType OR condition | conditionType )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==STRING) ) {
                switch ( input.LA(2) ) {
                case AND:
                    {
                    alt3=1;
                    }
                    break;
                case OR:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_START:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:58:5: conditionType AND condition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_condition341);
                    conditionType18=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionType18.getTree());

                    AND19=(Token)match(input,AND,FOLLOW_AND_in_condition343); 
                    AND19_tree = 
                    (CommonTree)adaptor.create(AND19)
                    ;
                    adaptor.addChild(root_0, AND19_tree);


                    pushFollow(FOLLOW_condition_in_condition345);
                    condition20=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition20.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:59:5: conditionType OR condition
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_condition351);
                    conditionType21=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionType21.getTree());

                    OR22=(Token)match(input,OR,FOLLOW_OR_in_condition353); 
                    OR22_tree = 
                    (CommonTree)adaptor.create(OR22)
                    ;
                    adaptor.addChild(root_0, OR22_tree);


                    pushFollow(FOLLOW_condition_in_condition355);
                    condition23=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition23.getTree());

                    }
                    break;
                case 3 :
                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:60:5: conditionType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_condition361);
                    conditionType24=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionType24.getTree());

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
    // $ANTLR end "condition"


    public static class action_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:63:1: action : ( actionType | CHOOSE CHOICE_START ( action )+ CHOICE_END -> ^( CHOICE ( action )+ ) );
    public final SAFParser.action_return action() throws RecognitionException {
        SAFParser.action_return retval = new SAFParser.action_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CHOOSE26=null;
        Token CHOICE_START27=null;
        Token CHOICE_END29=null;
        SAFParser.actionType_return actionType25 =null;

        SAFParser.action_return action28 =null;


        CommonTree CHOOSE26_tree=null;
        CommonTree CHOICE_START27_tree=null;
        CommonTree CHOICE_END29_tree=null;
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_CHOICE_START=new RewriteRuleTokenStream(adaptor,"token CHOICE_START");
        RewriteRuleTokenStream stream_CHOICE_END=new RewriteRuleTokenStream(adaptor,"token CHOICE_END");
        RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:3: ( actionType | CHOOSE CHOICE_START ( action )+ CHOICE_END -> ^( CHOICE ( action )+ ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==STRING) ) {
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
                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:5: actionType
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_actionType_in_action374);
                    actionType25=actionType();

                    state._fsp--;

                    adaptor.addChild(root_0, actionType25.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:18: CHOOSE CHOICE_START ( action )+ CHOICE_END
                    {
                    CHOOSE26=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_action378);  
                    stream_CHOOSE.add(CHOOSE26);


                    CHOICE_START27=(Token)match(input,CHOICE_START,FOLLOW_CHOICE_START_in_action380);  
                    stream_CHOICE_START.add(CHOICE_START27);


                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:38: ( action )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==CHOOSE||LA4_0==STRING) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:39: action
                    	    {
                    	    pushFollow(FOLLOW_action_in_action383);
                    	    action28=action();

                    	    state._fsp--;

                    	    stream_action.add(action28.getTree());

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


                    CHOICE_END29=(Token)match(input,CHOICE_END,FOLLOW_CHOICE_END_in_action387);  
                    stream_CHOICE_END.add(CHOICE_END29);


                    // AST REWRITE
                    // elements: action
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 64:59: -> ^( CHOICE ( action )+ )
                    {
                        // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:62: ^( CHOICE ( action )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHOICE, "CHOICE")
                        , root_1);

                        if ( !(stream_action.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_action.hasNext() ) {
                            adaptor.addChild(root_1, stream_action.nextTree());

                        }
                        stream_action.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "action"


    public static class actionType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "actionType"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:67:1: actionType : STRING ;
    public final SAFParser.actionType_return actionType() throws RecognitionException {
        SAFParser.actionType_return retval = new SAFParser.actionType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING30=null;

        CommonTree STRING30_tree=null;

        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:68:3: ( STRING )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:68:5: STRING
            {
            root_0 = (CommonTree)adaptor.nil();


            STRING30=(Token)match(input,STRING,FOLLOW_STRING_in_actionType412); 
            STRING30_tree = 
            (CommonTree)adaptor.create(STRING30)
            ;
            adaptor.addChild(root_0, STRING30_tree);


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
    // $ANTLR end "actionType"


    public static class conditionType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionType"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:71:1: conditionType : STRING ;
    public final SAFParser.conditionType_return conditionType() throws RecognitionException {
        SAFParser.conditionType_return retval = new SAFParser.conditionType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING31=null;

        CommonTree STRING31_tree=null;

        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:72:3: ( STRING )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:72:5: STRING
            {
            root_0 = (CommonTree)adaptor.nil();


            STRING31=(Token)match(input,STRING,FOLLOW_STRING_in_conditionType425); 
            STRING31_tree = 
            (CommonTree)adaptor.create(STRING31)
            ;
            adaptor.addChild(root_0, STRING31_tree);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_name_in_fighter170 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIGHTER_START_in_fighter172 = new BitSet(new long[]{0x000000000F404000L});
    public static final BitSet FOLLOW_personality_in_fighter174 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_behaviour_in_fighter176 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FIGHTER_END_in_fighter178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_fighter180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_personality225 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQLS_in_personality227 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_INT_in_personality229 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_rule_in_behaviour287 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_condition_in_rule302 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_START_in_rule304 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_action_in_rule307 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_action_in_rule309 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_END_in_rule312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_condition341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AND_in_condition343 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_condition_in_condition345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_condition351 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_OR_in_condition353 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_condition_in_condition355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_condition361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionType_in_action374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_action378 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CHOICE_START_in_action380 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_action_in_action383 = new BitSet(new long[]{0x0000000000400A00L});
    public static final BitSet FOLLOW_CHOICE_END_in_action387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_actionType412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_conditionType425 = new BitSet(new long[]{0x0000000000000002L});

}