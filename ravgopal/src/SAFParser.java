// $ANTLR 3.4 /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g 2012-01-23 15:05:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "AND", "BEHAVIOUR", "CHARACTERISTIC", "CHOICE", "CHOICE_END", "CHOICE_START", "CHOOSE", "CONDITION", "EQLS", "FIGHTER_END", "FIGHTER_START", "INT", "NAME", "OR", "PERSONALITY", "RULE_END", "RULE_START", "STRING", "WHITESPACE", "'always'", "'block_high'", "'block_low'", "'crouch'", "'even'", "'far'", "'jump'", "'kickPower'", "'kickReach'", "'kick_high'", "'kick_low'", "'much_stronger'", "'much_weaker'", "'near'", "'punchPower'", "'punchReach'", "'punch_high'", "'punch_low'", "'run_away'", "'run_towards'", "'stand'", "'stronger'", "'walk_away'", "'walk_towards'", "'weaker'"
    };

    public static final int EOF=-1;
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
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
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

                if ( ((LA1_0 >= 31 && LA1_0 <= 32)||(LA1_0 >= 38 && LA1_0 <= 39)) ) {
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

            if ( (input.LA(1) >= 31 && input.LA(1) <= 32)||(input.LA(1) >= 38 && input.LA(1) <= 39) ) {
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

                if ( (LA2_0==24||(LA2_0 >= 28 && LA2_0 <= 29)||(LA2_0 >= 35 && LA2_0 <= 37)||LA2_0==45||LA2_0==48) ) {
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
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:53:1: rule : condition RULE_START ( move fight ) RULE_END -> ^( condition ^( ACTION ^( move fight ) ) ) ;
    public final SAFParser.rule_return rule() throws RecognitionException {
        SAFParser.rule_return retval = new SAFParser.rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RULE_START14=null;
        Token RULE_END17=null;
        SAFParser.condition_return condition13 =null;

        SAFParser.move_return move15 =null;

        SAFParser.fight_return fight16 =null;


        CommonTree RULE_START14_tree=null;
        CommonTree RULE_END17_tree=null;
        RewriteRuleTokenStream stream_RULE_START=new RewriteRuleTokenStream(adaptor,"token RULE_START");
        RewriteRuleTokenStream stream_RULE_END=new RewriteRuleTokenStream(adaptor,"token RULE_END");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_fight=new RewriteRuleSubtreeStream(adaptor,"rule fight");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:3: ( condition RULE_START ( move fight ) RULE_END -> ^( condition ^( ACTION ^( move fight ) ) ) )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:5: condition RULE_START ( move fight ) RULE_END
            {
            pushFollow(FOLLOW_condition_in_rule302);
            condition13=condition();

            state._fsp--;

            stream_condition.add(condition13.getTree());

            RULE_START14=(Token)match(input,RULE_START,FOLLOW_RULE_START_in_rule304);  
            stream_RULE_START.add(RULE_START14);


            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:26: ( move fight )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:27: move fight
            {
            pushFollow(FOLLOW_move_in_rule307);
            move15=move();

            state._fsp--;

            stream_move.add(move15.getTree());

            pushFollow(FOLLOW_fight_in_rule309);
            fight16=fight();

            state._fsp--;

            stream_fight.add(fight16.getTree());

            }


            RULE_END17=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_rule312);  
            stream_RULE_END.add(RULE_END17);


            // AST REWRITE
            // elements: fight, move, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 54:48: -> ^( condition ^( ACTION ^( move fight ) ) )
            {
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:51: ^( condition ^( ACTION ^( move fight ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_condition.nextNode(), root_1);

                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:63: ^( ACTION ^( move fight ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ACTION, "ACTION")
                , root_2);

                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:54:72: ^( move fight )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_move.nextNode(), root_3);

                adaptor.addChild(root_3, stream_fight.nextTree());

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

            if ( (LA3_0==24||(LA3_0 >= 28 && LA3_0 <= 29)||(LA3_0 >= 35 && LA3_0 <= 37)||LA3_0==45||LA3_0==48) ) {
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


    public static class move_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:63:1: move : ( moveAction | CHOOSE CHOICE_START ( moveAction )+ CHOICE_END -> ^( CHOICE ( moveAction )+ ) );
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CHOOSE26=null;
        Token CHOICE_START27=null;
        Token CHOICE_END29=null;
        SAFParser.moveAction_return moveAction25 =null;

        SAFParser.moveAction_return moveAction28 =null;


        CommonTree CHOOSE26_tree=null;
        CommonTree CHOICE_START27_tree=null;
        CommonTree CHOICE_END29_tree=null;
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_CHOICE_START=new RewriteRuleTokenStream(adaptor,"token CHOICE_START");
        RewriteRuleTokenStream stream_CHOICE_END=new RewriteRuleTokenStream(adaptor,"token CHOICE_END");
        RewriteRuleSubtreeStream stream_moveAction=new RewriteRuleSubtreeStream(adaptor,"rule moveAction");
        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:3: ( moveAction | CHOOSE CHOICE_START ( moveAction )+ CHOICE_END -> ^( CHOICE ( moveAction )+ ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27||LA5_0==30||(LA5_0 >= 42 && LA5_0 <= 44)||(LA5_0 >= 46 && LA5_0 <= 47)) ) {
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
                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:5: moveAction
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_moveAction_in_move374);
                    moveAction25=moveAction();

                    state._fsp--;

                    adaptor.addChild(root_0, moveAction25.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:18: CHOOSE CHOICE_START ( moveAction )+ CHOICE_END
                    {
                    CHOOSE26=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_move378);  
                    stream_CHOOSE.add(CHOOSE26);


                    CHOICE_START27=(Token)match(input,CHOICE_START,FOLLOW_CHOICE_START_in_move380);  
                    stream_CHOICE_START.add(CHOICE_START27);


                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:38: ( moveAction )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==27||LA4_0==30||(LA4_0 >= 42 && LA4_0 <= 44)||(LA4_0 >= 46 && LA4_0 <= 47)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:39: moveAction
                    	    {
                    	    pushFollow(FOLLOW_moveAction_in_move383);
                    	    moveAction28=moveAction();

                    	    state._fsp--;

                    	    stream_moveAction.add(moveAction28.getTree());

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


                    CHOICE_END29=(Token)match(input,CHOICE_END,FOLLOW_CHOICE_END_in_move387);  
                    stream_CHOICE_END.add(CHOICE_END29);


                    // AST REWRITE
                    // elements: moveAction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 64:63: -> ^( CHOICE ( moveAction )+ )
                    {
                        // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:64:66: ^( CHOICE ( moveAction )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHOICE, "CHOICE")
                        , root_1);

                        if ( !(stream_moveAction.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_moveAction.hasNext() ) {
                            adaptor.addChild(root_1, stream_moveAction.nextTree());

                        }
                        stream_moveAction.reset();

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
    // $ANTLR end "move"


    public static class fight_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fight"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:67:1: fight : ( fightAction | CHOOSE CHOICE_START ( fightAction )+ CHOICE_END -> ^( CHOICE ( fightAction )+ ) );
    public final SAFParser.fight_return fight() throws RecognitionException {
        SAFParser.fight_return retval = new SAFParser.fight_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CHOOSE31=null;
        Token CHOICE_START32=null;
        Token CHOICE_END34=null;
        SAFParser.fightAction_return fightAction30 =null;

        SAFParser.fightAction_return fightAction33 =null;


        CommonTree CHOOSE31_tree=null;
        CommonTree CHOICE_START32_tree=null;
        CommonTree CHOICE_END34_tree=null;
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_CHOICE_START=new RewriteRuleTokenStream(adaptor,"token CHOICE_START");
        RewriteRuleTokenStream stream_CHOICE_END=new RewriteRuleTokenStream(adaptor,"token CHOICE_END");
        RewriteRuleSubtreeStream stream_fightAction=new RewriteRuleSubtreeStream(adaptor,"rule fightAction");
        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:68:3: ( fightAction | CHOOSE CHOICE_START ( fightAction )+ CHOICE_END -> ^( CHOICE ( fightAction )+ ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= 25 && LA7_0 <= 26)||(LA7_0 >= 33 && LA7_0 <= 34)||(LA7_0 >= 40 && LA7_0 <= 41)) ) {
                alt7=1;
            }
            else if ( (LA7_0==CHOOSE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:68:5: fightAction
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_fightAction_in_fight412);
                    fightAction30=fightAction();

                    state._fsp--;

                    adaptor.addChild(root_0, fightAction30.getTree());

                    }
                    break;
                case 2 :
                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:68:19: CHOOSE CHOICE_START ( fightAction )+ CHOICE_END
                    {
                    CHOOSE31=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_fight416);  
                    stream_CHOOSE.add(CHOOSE31);


                    CHOICE_START32=(Token)match(input,CHOICE_START,FOLLOW_CHOICE_START_in_fight418);  
                    stream_CHOICE_START.add(CHOICE_START32);


                    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:68:39: ( fightAction )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= 25 && LA6_0 <= 26)||(LA6_0 >= 33 && LA6_0 <= 34)||(LA6_0 >= 40 && LA6_0 <= 41)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:68:40: fightAction
                    	    {
                    	    pushFollow(FOLLOW_fightAction_in_fight421);
                    	    fightAction33=fightAction();

                    	    state._fsp--;

                    	    stream_fightAction.add(fightAction33.getTree());

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


                    CHOICE_END34=(Token)match(input,CHOICE_END,FOLLOW_CHOICE_END_in_fight425);  
                    stream_CHOICE_END.add(CHOICE_END34);


                    // AST REWRITE
                    // elements: fightAction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 68:65: -> ^( CHOICE ( fightAction )+ )
                    {
                        // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:68:68: ^( CHOICE ( fightAction )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHOICE, "CHOICE")
                        , root_1);

                        if ( !(stream_fightAction.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_fightAction.hasNext() ) {
                            adaptor.addChild(root_1, stream_fightAction.nextTree());

                        }
                        stream_fightAction.reset();

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
    // $ANTLR end "fight"


    public static class moveAction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moveAction"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:71:1: moveAction : ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' );
    public final SAFParser.moveAction_return moveAction() throws RecognitionException {
        SAFParser.moveAction_return retval = new SAFParser.moveAction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set35=null;

        CommonTree set35_tree=null;

        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:72:3: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set35=(Token)input.LT(1);

            if ( input.LA(1)==27||input.LA(1)==30||(input.LA(1) >= 42 && input.LA(1) <= 44)||(input.LA(1) >= 46 && input.LA(1) <= 47) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set35)
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
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:81:1: fightAction : ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' );
    public final SAFParser.fightAction_return fightAction() throws RecognitionException {
        SAFParser.fightAction_return retval = new SAFParser.fightAction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set36=null;

        CommonTree set36_tree=null;

        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:82:3: ( 'block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set36=(Token)input.LT(1);

            if ( (input.LA(1) >= 25 && input.LA(1) <= 26)||(input.LA(1) >= 33 && input.LA(1) <= 34)||(input.LA(1) >= 40 && input.LA(1) <= 41) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set36)
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


    public static class conditionType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionType"
    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:90:1: conditionType : ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' );
    public final SAFParser.conditionType_return conditionType() throws RecognitionException {
        SAFParser.conditionType_return retval = new SAFParser.conditionType_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set37=null;

        CommonTree set37_tree=null;

        try {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:91:3: ( 'always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set37=(Token)input.LT(1);

            if ( input.LA(1)==24||(input.LA(1) >= 28 && input.LA(1) <= 29)||(input.LA(1) >= 35 && input.LA(1) <= 37)||input.LA(1)==45||input.LA(1)==48 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set37)
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

    // Delegated rules


 

    public static final BitSet FOLLOW_name_in_fighter170 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_FIGHTER_START_in_fighter172 = new BitSet(new long[]{0x000120F9B1004000L});
    public static final BitSet FOLLOW_personality_in_fighter174 = new BitSet(new long[]{0x0001203831004000L});
    public static final BitSet FOLLOW_behaviour_in_fighter176 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FIGHTER_END_in_fighter178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_fighter180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_personality225 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQLS_in_personality227 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_INT_in_personality229 = new BitSet(new long[]{0x000000C180000002L});
    public static final BitSet FOLLOW_rule_in_behaviour287 = new BitSet(new long[]{0x0001203831000002L});
    public static final BitSet FOLLOW_condition_in_rule302 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_START_in_rule304 = new BitSet(new long[]{0x0000DC0048000800L});
    public static final BitSet FOLLOW_move_in_rule307 = new BitSet(new long[]{0x0000030606000800L});
    public static final BitSet FOLLOW_fight_in_rule309 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_END_in_rule312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_condition341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AND_in_condition343 = new BitSet(new long[]{0x0001203831000000L});
    public static final BitSet FOLLOW_condition_in_condition345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_condition351 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_OR_in_condition353 = new BitSet(new long[]{0x0001203831000000L});
    public static final BitSet FOLLOW_condition_in_condition355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_condition361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveAction_in_move374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_move378 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CHOICE_START_in_move380 = new BitSet(new long[]{0x0000DC0048000000L});
    public static final BitSet FOLLOW_moveAction_in_move383 = new BitSet(new long[]{0x0000DC0048000200L});
    public static final BitSet FOLLOW_CHOICE_END_in_move387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fightAction_in_fight412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_fight416 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CHOICE_START_in_fight418 = new BitSet(new long[]{0x0000030606000000L});
    public static final BitSet FOLLOW_fightAction_in_fight421 = new BitSet(new long[]{0x0000030606000200L});
    public static final BitSet FOLLOW_CHOICE_END_in_fight425 = new BitSet(new long[]{0x0000000000000002L});

}