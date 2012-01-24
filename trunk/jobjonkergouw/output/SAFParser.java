// $ANTLR 3.4 /Users/job/Programming/svn-sc/SAFParser.g 2012-01-24 14:54:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "ATTACK_TYPE", "CHOOSE", "CONDITION_TYPE", "DIGIT", "ID", "LEFT_BRACE", "LEFT_BRACKET", "LEFT_PAREN", "LOGICAL_OPERATOR", "MOVE_TYPE", "NEWLINE", "RIGHT_BRACE", "RIGHT_BRACKET", "RIGHT_PAREN", "STRENGTH_TYPE", "WHITESPACE", "CHARACTERISTIC", "CONDITION", "FIGHTACTION", "FIGHTER", "MOVEACTION", "NAME", "RULE", "STRENGTH", "VALUE"
    };

    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int ATTACK_TYPE=5;
    public static final int CHOOSE=6;
    public static final int CONDITION_TYPE=7;
    public static final int DIGIT=8;
    public static final int ID=9;
    public static final int LEFT_BRACE=10;
    public static final int LEFT_BRACKET=11;
    public static final int LEFT_PAREN=12;
    public static final int LOGICAL_OPERATOR=13;
    public static final int MOVE_TYPE=14;
    public static final int NEWLINE=15;
    public static final int RIGHT_BRACE=16;
    public static final int RIGHT_BRACKET=17;
    public static final int RIGHT_PAREN=18;
    public static final int STRENGTH_TYPE=19;
    public static final int WHITESPACE=20;
    public static final int CHARACTERISTIC=21;
    public static final int CONDITION=22;
    public static final int FIGHTACTION=23;
    public static final int FIGHTER=24;
    public static final int MOVEACTION=25;
    public static final int NAME=26;
    public static final int RULE=27;
    public static final int STRENGTH=28;
    public static final int VALUE=29;

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
    public String getGrammarFileName() { return "/Users/job/Programming/svn-sc/SAFParser.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Users/job/Programming/svn-sc/SAFParser.g:21:1: fighter : name LEFT_BRACE ( characteristic | rule )* RIGHT_BRACE -> ^( FIGHTER name ( characteristic )* ( rule )* ) ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACE2=null;
        Token RIGHT_BRACE5=null;
        SAFParser.name_return name1 =null;

        SAFParser.characteristic_return characteristic3 =null;

        SAFParser.rule_return rule4 =null;


        Object LEFT_BRACE2_tree=null;
        Object RIGHT_BRACE5_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_rule=new RewriteRuleSubtreeStream(adaptor,"rule rule");
        RewriteRuleSubtreeStream stream_characteristic=new RewriteRuleSubtreeStream(adaptor,"rule characteristic");
        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:21:11: ( name LEFT_BRACE ( characteristic | rule )* RIGHT_BRACE -> ^( FIGHTER name ( characteristic )* ( rule )* ) )
            // /Users/job/Programming/svn-sc/SAFParser.g:21:14: name LEFT_BRACE ( characteristic | rule )* RIGHT_BRACE
            {
            pushFollow(FOLLOW_name_in_fighter79);
            name1=name();

            state._fsp--;

            stream_name.add(name1.getTree());

            LEFT_BRACE2=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_fighter81);  
            stream_LEFT_BRACE.add(LEFT_BRACE2);


            // /Users/job/Programming/svn-sc/SAFParser.g:21:30: ( characteristic | rule )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRENGTH_TYPE) ) {
                    alt1=1;
                }
                else if ( (LA1_0==CONDITION_TYPE) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/job/Programming/svn-sc/SAFParser.g:21:31: characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_fighter84);
            	    characteristic3=characteristic();

            	    state._fsp--;

            	    stream_characteristic.add(characteristic3.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/job/Programming/svn-sc/SAFParser.g:21:48: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_fighter88);
            	    rule4=rule();

            	    state._fsp--;

            	    stream_rule.add(rule4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            RIGHT_BRACE5=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_fighter92);  
            stream_RIGHT_BRACE.add(RIGHT_BRACE5);


            // AST REWRITE
            // elements: rule, characteristic, name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 21:67: -> ^( FIGHTER name ( characteristic )* ( rule )* )
            {
                // /Users/job/Programming/svn-sc/SAFParser.g:21:70: ^( FIGHTER name ( characteristic )* ( rule )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIGHTER, "FIGHTER")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextTree());

                // /Users/job/Programming/svn-sc/SAFParser.g:21:85: ( characteristic )*
                while ( stream_characteristic.hasNext() ) {
                    adaptor.addChild(root_1, stream_characteristic.nextTree());

                }
                stream_characteristic.reset();

                // /Users/job/Programming/svn-sc/SAFParser.g:21:101: ( rule )*
                while ( stream_rule.hasNext() ) {
                    adaptor.addChild(root_1, stream_rule.nextTree());

                }
                stream_rule.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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


    public static class name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // /Users/job/Programming/svn-sc/SAFParser.g:23:1: name : ID -> ^( NAME ID ) ;
    public final SAFParser.name_return name() throws RecognitionException {
        SAFParser.name_return retval = new SAFParser.name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID6=null;

        Object ID6_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:23:8: ( ID -> ^( NAME ID ) )
            // /Users/job/Programming/svn-sc/SAFParser.g:23:10: ID
            {
            ID6=(Token)match(input,ID,FOLLOW_ID_in_name116);  
            stream_ID.add(ID6);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 23:13: -> ^( NAME ID )
            {
                // /Users/job/Programming/svn-sc/SAFParser.g:23:16: ^( NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
    // $ANTLR end "name"


    public static class characteristic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // /Users/job/Programming/svn-sc/SAFParser.g:25:1: characteristic : STRENGTH_TYPE ASSIGN DIGIT -> ^( CHARACTERISTIC ^( STRENGTH STRENGTH_TYPE ) ^( VALUE DIGIT ) ) ;
    public final SAFParser.characteristic_return characteristic() throws RecognitionException {
        SAFParser.characteristic_return retval = new SAFParser.characteristic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRENGTH_TYPE7=null;
        Token ASSIGN8=null;
        Token DIGIT9=null;

        Object STRENGTH_TYPE7_tree=null;
        Object ASSIGN8_tree=null;
        Object DIGIT9_tree=null;
        RewriteRuleTokenStream stream_DIGIT=new RewriteRuleTokenStream(adaptor,"token DIGIT");
        RewriteRuleTokenStream stream_STRENGTH_TYPE=new RewriteRuleTokenStream(adaptor,"token STRENGTH_TYPE");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:25:16: ( STRENGTH_TYPE ASSIGN DIGIT -> ^( CHARACTERISTIC ^( STRENGTH STRENGTH_TYPE ) ^( VALUE DIGIT ) ) )
            // /Users/job/Programming/svn-sc/SAFParser.g:25:18: STRENGTH_TYPE ASSIGN DIGIT
            {
            STRENGTH_TYPE7=(Token)match(input,STRENGTH_TYPE,FOLLOW_STRENGTH_TYPE_in_characteristic132);  
            stream_STRENGTH_TYPE.add(STRENGTH_TYPE7);


            ASSIGN8=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_characteristic134);  
            stream_ASSIGN.add(ASSIGN8);


            DIGIT9=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_characteristic136);  
            stream_DIGIT.add(DIGIT9);


            // AST REWRITE
            // elements: DIGIT, STRENGTH_TYPE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 25:45: -> ^( CHARACTERISTIC ^( STRENGTH STRENGTH_TYPE ) ^( VALUE DIGIT ) )
            {
                // /Users/job/Programming/svn-sc/SAFParser.g:25:48: ^( CHARACTERISTIC ^( STRENGTH STRENGTH_TYPE ) ^( VALUE DIGIT ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHARACTERISTIC, "CHARACTERISTIC")
                , root_1);

                // /Users/job/Programming/svn-sc/SAFParser.g:25:65: ^( STRENGTH STRENGTH_TYPE )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STRENGTH, "STRENGTH")
                , root_2);

                adaptor.addChild(root_2, 
                stream_STRENGTH_TYPE.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                // /Users/job/Programming/svn-sc/SAFParser.g:25:91: ^( VALUE DIGIT )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VALUE, "VALUE")
                , root_2);

                adaptor.addChild(root_2, 
                stream_DIGIT.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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


    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /Users/job/Programming/svn-sc/SAFParser.g:27:1: rule : condition LEFT_BRACKET move attack RIGHT_BRACKET -> ^( RULE condition move attack ) ;
    public final SAFParser.rule_return rule() throws RecognitionException {
        SAFParser.rule_return retval = new SAFParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET11=null;
        Token RIGHT_BRACKET14=null;
        SAFParser.condition_return condition10 =null;

        SAFParser.move_return move12 =null;

        SAFParser.attack_return attack13 =null;


        Object LEFT_BRACKET11_tree=null;
        Object RIGHT_BRACKET14_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_attack=new RewriteRuleSubtreeStream(adaptor,"rule attack");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:27:8: ( condition LEFT_BRACKET move attack RIGHT_BRACKET -> ^( RULE condition move attack ) )
            // /Users/job/Programming/svn-sc/SAFParser.g:27:10: condition LEFT_BRACKET move attack RIGHT_BRACKET
            {
            pushFollow(FOLLOW_condition_in_rule165);
            condition10=condition();

            state._fsp--;

            stream_condition.add(condition10.getTree());

            LEFT_BRACKET11=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_rule167);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET11);


            pushFollow(FOLLOW_move_in_rule169);
            move12=move();

            state._fsp--;

            stream_move.add(move12.getTree());

            pushFollow(FOLLOW_attack_in_rule171);
            attack13=attack();

            state._fsp--;

            stream_attack.add(attack13.getTree());

            RIGHT_BRACKET14=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_rule173);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET14);


            // AST REWRITE
            // elements: attack, move, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 27:59: -> ^( RULE condition move attack )
            {
                // /Users/job/Programming/svn-sc/SAFParser.g:27:62: ^( RULE condition move attack )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RULE, "RULE")
                , root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_1, stream_move.nextTree());

                adaptor.addChild(root_1, stream_attack.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
    // $ANTLR end "rule"


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // /Users/job/Programming/svn-sc/SAFParser.g:29:1: move : ( CHOOSE LEFT_PAREN MOVE_TYPE MOVE_TYPE RIGHT_PAREN -> ^( MOVEACTION MOVE_TYPE MOVE_TYPE ) | MOVE_TYPE -> ^( MOVEACTION MOVE_TYPE ) );
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE15=null;
        Token LEFT_PAREN16=null;
        Token MOVE_TYPE17=null;
        Token MOVE_TYPE18=null;
        Token RIGHT_PAREN19=null;
        Token MOVE_TYPE20=null;

        Object CHOOSE15_tree=null;
        Object LEFT_PAREN16_tree=null;
        Object MOVE_TYPE17_tree=null;
        Object MOVE_TYPE18_tree=null;
        Object RIGHT_PAREN19_tree=null;
        Object MOVE_TYPE20_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_MOVE_TYPE=new RewriteRuleTokenStream(adaptor,"token MOVE_TYPE");

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:29:8: ( CHOOSE LEFT_PAREN MOVE_TYPE MOVE_TYPE RIGHT_PAREN -> ^( MOVEACTION MOVE_TYPE MOVE_TYPE ) | MOVE_TYPE -> ^( MOVEACTION MOVE_TYPE ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CHOOSE) ) {
                alt2=1;
            }
            else if ( (LA2_0==MOVE_TYPE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFParser.g:29:10: CHOOSE LEFT_PAREN MOVE_TYPE MOVE_TYPE RIGHT_PAREN
                    {
                    CHOOSE15=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_move195);  
                    stream_CHOOSE.add(CHOOSE15);


                    LEFT_PAREN16=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_move197);  
                    stream_LEFT_PAREN.add(LEFT_PAREN16);


                    MOVE_TYPE17=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move199);  
                    stream_MOVE_TYPE.add(MOVE_TYPE17);


                    MOVE_TYPE18=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move201);  
                    stream_MOVE_TYPE.add(MOVE_TYPE18);


                    RIGHT_PAREN19=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_move203);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN19);


                    // AST REWRITE
                    // elements: MOVE_TYPE, MOVE_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 29:60: -> ^( MOVEACTION MOVE_TYPE MOVE_TYPE )
                    {
                        // /Users/job/Programming/svn-sc/SAFParser.g:29:63: ^( MOVEACTION MOVE_TYPE MOVE_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MOVEACTION, "MOVEACTION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_MOVE_TYPE.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_MOVE_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFParser.g:30:7: MOVE_TYPE
                    {
                    MOVE_TYPE20=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move221);  
                    stream_MOVE_TYPE.add(MOVE_TYPE20);


                    // AST REWRITE
                    // elements: MOVE_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 30:17: -> ^( MOVEACTION MOVE_TYPE )
                    {
                        // /Users/job/Programming/svn-sc/SAFParser.g:30:20: ^( MOVEACTION MOVE_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MOVEACTION, "MOVEACTION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_MOVE_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "move"


    public static class attack_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attack"
    // /Users/job/Programming/svn-sc/SAFParser.g:32:1: attack : ( CHOOSE LEFT_PAREN ATTACK_TYPE ATTACK_TYPE RIGHT_PAREN -> ^( FIGHTACTION ATTACK_TYPE ATTACK_TYPE ) | ATTACK_TYPE -> ^( FIGHTACTION ATTACK_TYPE ) );
    public final SAFParser.attack_return attack() throws RecognitionException {
        SAFParser.attack_return retval = new SAFParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE21=null;
        Token LEFT_PAREN22=null;
        Token ATTACK_TYPE23=null;
        Token ATTACK_TYPE24=null;
        Token RIGHT_PAREN25=null;
        Token ATTACK_TYPE26=null;

        Object CHOOSE21_tree=null;
        Object LEFT_PAREN22_tree=null;
        Object ATTACK_TYPE23_tree=null;
        Object ATTACK_TYPE24_tree=null;
        Object RIGHT_PAREN25_tree=null;
        Object ATTACK_TYPE26_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_ATTACK_TYPE=new RewriteRuleTokenStream(adaptor,"token ATTACK_TYPE");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:32:10: ( CHOOSE LEFT_PAREN ATTACK_TYPE ATTACK_TYPE RIGHT_PAREN -> ^( FIGHTACTION ATTACK_TYPE ATTACK_TYPE ) | ATTACK_TYPE -> ^( FIGHTACTION ATTACK_TYPE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CHOOSE) ) {
                alt3=1;
            }
            else if ( (LA3_0==ATTACK_TYPE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFParser.g:32:12: CHOOSE LEFT_PAREN ATTACK_TYPE ATTACK_TYPE RIGHT_PAREN
                    {
                    CHOOSE21=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_attack239);  
                    stream_CHOOSE.add(CHOOSE21);


                    LEFT_PAREN22=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attack241);  
                    stream_LEFT_PAREN.add(LEFT_PAREN22);


                    ATTACK_TYPE23=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack243);  
                    stream_ATTACK_TYPE.add(ATTACK_TYPE23);


                    ATTACK_TYPE24=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack245);  
                    stream_ATTACK_TYPE.add(ATTACK_TYPE24);


                    RIGHT_PAREN25=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attack247);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN25);


                    // AST REWRITE
                    // elements: ATTACK_TYPE, ATTACK_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 32:66: -> ^( FIGHTACTION ATTACK_TYPE ATTACK_TYPE )
                    {
                        // /Users/job/Programming/svn-sc/SAFParser.g:32:69: ^( FIGHTACTION ATTACK_TYPE ATTACK_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIGHTACTION, "FIGHTACTION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ATTACK_TYPE.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ATTACK_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFParser.g:33:7: ATTACK_TYPE
                    {
                    ATTACK_TYPE26=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack265);  
                    stream_ATTACK_TYPE.add(ATTACK_TYPE26);


                    // AST REWRITE
                    // elements: ATTACK_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 33:19: -> ^( FIGHTACTION ATTACK_TYPE )
                    {
                        // /Users/job/Programming/svn-sc/SAFParser.g:33:22: ^( FIGHTACTION ATTACK_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIGHTACTION, "FIGHTACTION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ATTACK_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "attack"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // /Users/job/Programming/svn-sc/SAFParser.g:35:1: condition : ( CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE -> ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE ) | CONDITION_TYPE -> ^( CONDITION CONDITION_TYPE ) );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONDITION_TYPE27=null;
        Token LOGICAL_OPERATOR28=null;
        Token CONDITION_TYPE29=null;
        Token CONDITION_TYPE30=null;

        Object CONDITION_TYPE27_tree=null;
        Object LOGICAL_OPERATOR28_tree=null;
        Object CONDITION_TYPE29_tree=null;
        Object CONDITION_TYPE30_tree=null;
        RewriteRuleTokenStream stream_LOGICAL_OPERATOR=new RewriteRuleTokenStream(adaptor,"token LOGICAL_OPERATOR");
        RewriteRuleTokenStream stream_CONDITION_TYPE=new RewriteRuleTokenStream(adaptor,"token CONDITION_TYPE");

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:35:12: ( CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE -> ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE ) | CONDITION_TYPE -> ^( CONDITION CONDITION_TYPE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CONDITION_TYPE) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==LOGICAL_OPERATOR) ) {
                    alt4=1;
                }
                else if ( (LA4_1==LEFT_BRACKET) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

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
                    // /Users/job/Programming/svn-sc/SAFParser.g:35:14: CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE
                    {
                    CONDITION_TYPE27=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition282);  
                    stream_CONDITION_TYPE.add(CONDITION_TYPE27);


                    LOGICAL_OPERATOR28=(Token)match(input,LOGICAL_OPERATOR,FOLLOW_LOGICAL_OPERATOR_in_condition284);  
                    stream_LOGICAL_OPERATOR.add(LOGICAL_OPERATOR28);


                    CONDITION_TYPE29=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition286);  
                    stream_CONDITION_TYPE.add(CONDITION_TYPE29);


                    // AST REWRITE
                    // elements: CONDITION_TYPE, CONDITION_TYPE, LOGICAL_OPERATOR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 35:61: -> ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE )
                    {
                        // /Users/job/Programming/svn-sc/SAFParser.g:35:64: ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONDITION, "CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_LOGICAL_OPERATOR.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_CONDITION_TYPE.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_CONDITION_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFParser.g:36:8: CONDITION_TYPE
                    {
                    CONDITION_TYPE30=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition307);  
                    stream_CONDITION_TYPE.add(CONDITION_TYPE30);


                    // AST REWRITE
                    // elements: CONDITION_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 36:23: -> ^( CONDITION CONDITION_TYPE )
                    {
                        // /Users/job/Programming/svn-sc/SAFParser.g:36:26: ^( CONDITION CONDITION_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONDITION, "CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CONDITION_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "condition"

    // Delegated rules


 

    public static final BitSet FOLLOW_name_in_fighter79 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_fighter81 = new BitSet(new long[]{0x0000000000090080L});
    public static final BitSet FOLLOW_characteristic_in_fighter84 = new BitSet(new long[]{0x0000000000090080L});
    public static final BitSet FOLLOW_rule_in_fighter88 = new BitSet(new long[]{0x0000000000090080L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_fighter92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRENGTH_TYPE_in_characteristic132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_characteristic134 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DIGIT_in_characteristic136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_rule165 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_rule167 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_move_in_rule169 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_attack_in_rule171 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_rule173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_move195 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_move197 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move199 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move201 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_move203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_attack239 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attack241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack245 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attack247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition282 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LOGICAL_OPERATOR_in_condition284 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition307 = new BitSet(new long[]{0x0000000000000002L});

}