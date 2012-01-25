// $ANTLR 3.4 C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g 2012-01-25 12:32:33

	package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "AND_OPERATOR", "BEHAVIOUR", "CHARACTERISTIC", "CHOOSE", "CONDITION", "DIGIT", "FIGHTER", "IDENTIFIER", "LETTER", "MULTILINE_COMMENT", "NAME", "NUMBER", "OR_OPERATOR", "PERSONALITY", "SINGLELINE_COMMENT", "VALUE", "WHITESPACE", "'('", "')'", "'='", "'['", "']'", "'and'", "'choose'", "'or'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int ACTION=4;
    public static final int AND_OPERATOR=5;
    public static final int BEHAVIOUR=6;
    public static final int CHARACTERISTIC=7;
    public static final int CHOOSE=8;
    public static final int CONDITION=9;
    public static final int DIGIT=10;
    public static final int FIGHTER=11;
    public static final int IDENTIFIER=12;
    public static final int LETTER=13;
    public static final int MULTILINE_COMMENT=14;
    public static final int NAME=15;
    public static final int NUMBER=16;
    public static final int OR_OPERATOR=17;
    public static final int PERSONALITY=18;
    public static final int SINGLELINE_COMMENT=19;
    public static final int VALUE=20;
    public static final int WHITESPACE=21;

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
    public String getGrammarFileName() { return "C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:32:1: fighter : IDENTIFIER '{' personality behaviour '}' -> ^( FIGHTER ^( NAME IDENTIFIER ) ^( PERSONALITY personality ) ^( BEHAVIOUR behaviour ) ) ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER1=null;
        Token char_literal2=null;
        Token char_literal5=null;
        SAFParser.personality_return personality3 =null;

        SAFParser.behaviour_return behaviour4 =null;


        CommonTree IDENTIFIER1_tree=null;
        CommonTree char_literal2_tree=null;
        CommonTree char_literal5_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_behaviour=new RewriteRuleSubtreeStream(adaptor,"rule behaviour");
        RewriteRuleSubtreeStream stream_personality=new RewriteRuleSubtreeStream(adaptor,"rule personality");
        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:32:12: ( IDENTIFIER '{' personality behaviour '}' -> ^( FIGHTER ^( NAME IDENTIFIER ) ^( PERSONALITY personality ) ^( BEHAVIOUR behaviour ) ) )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:32:14: IDENTIFIER '{' personality behaviour '}'
            {
            IDENTIFIER1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fighter107);  
            stream_IDENTIFIER.add(IDENTIFIER1);


            char_literal2=(Token)match(input,30,FOLLOW_30_in_fighter109);  
            stream_30.add(char_literal2);


            pushFollow(FOLLOW_personality_in_fighter118);
            personality3=personality();

            state._fsp--;

            stream_personality.add(personality3.getTree());

            pushFollow(FOLLOW_behaviour_in_fighter127);
            behaviour4=behaviour();

            state._fsp--;

            stream_behaviour.add(behaviour4.getTree());

            char_literal5=(Token)match(input,31,FOLLOW_31_in_fighter135);  
            stream_31.add(char_literal5);


            // AST REWRITE
            // elements: IDENTIFIER, personality, behaviour
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 36:7: -> ^( FIGHTER ^( NAME IDENTIFIER ) ^( PERSONALITY personality ) ^( BEHAVIOUR behaviour ) )
            {
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:36:10: ^( FIGHTER ^( NAME IDENTIFIER ) ^( PERSONALITY personality ) ^( BEHAVIOUR behaviour ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FIGHTER, "FIGHTER")
                , root_1);

                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:37:9: ^( NAME IDENTIFIER )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAME, "NAME")
                , root_2);

                adaptor.addChild(root_2, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:38:9: ^( PERSONALITY personality )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PERSONALITY, "PERSONALITY")
                , root_2);

                adaptor.addChild(root_2, stream_personality.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:39:9: ^( BEHAVIOUR behaviour )
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


    public static class personality_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:43:1: personality : ( characteristic )+ ;
    public final SAFParser.personality_return personality() throws RecognitionException {
        SAFParser.personality_return retval = new SAFParser.personality_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.characteristic_return characteristic6 =null;



        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:43:15: ( ( characteristic )+ )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:43:17: ( characteristic )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:43:17: ( characteristic )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENTIFIER) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==24) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:43:17: characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_personality214);
            	    characteristic6=characteristic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, characteristic6.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "personality"


    public static class characteristic_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:44:1: characteristic : IDENTIFIER '=' NUMBER -> ^( CHARACTERISTIC ^( NAME IDENTIFIER ) ^( VALUE NUMBER ) ) ;
    public final SAFParser.characteristic_return characteristic() throws RecognitionException {
        SAFParser.characteristic_return retval = new SAFParser.characteristic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER7=null;
        Token char_literal8=null;
        Token NUMBER9=null;

        CommonTree IDENTIFIER7_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree NUMBER9_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:44:17: ( IDENTIFIER '=' NUMBER -> ^( CHARACTERISTIC ^( NAME IDENTIFIER ) ^( VALUE NUMBER ) ) )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:44:19: IDENTIFIER '=' NUMBER
            {
            IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_characteristic223);  
            stream_IDENTIFIER.add(IDENTIFIER7);


            char_literal8=(Token)match(input,24,FOLLOW_24_in_characteristic225);  
            stream_24.add(char_literal8);


            NUMBER9=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_characteristic227);  
            stream_NUMBER.add(NUMBER9);


            // AST REWRITE
            // elements: IDENTIFIER, NUMBER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 45:7: -> ^( CHARACTERISTIC ^( NAME IDENTIFIER ) ^( VALUE NUMBER ) )
            {
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:45:10: ^( CHARACTERISTIC ^( NAME IDENTIFIER ) ^( VALUE NUMBER ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CHARACTERISTIC, "CHARACTERISTIC")
                , root_1);

                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:46:9: ^( NAME IDENTIFIER )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAME, "NAME")
                , root_2);

                adaptor.addChild(root_2, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:47:9: ^( VALUE NUMBER )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VALUE, "VALUE")
                , root_2);

                adaptor.addChild(root_2, 
                stream_NUMBER.nextNode()
                );

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
    // $ANTLR end "characteristic"


    public static class behaviour_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:51:1: behaviour : ( rule )+ ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.rule_return rule10 =null;



        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:51:13: ( ( rule )+ )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:51:15: ( rule )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:51:15: ( rule )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENTIFIER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:51:15: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_behaviour291);
            	    rule10=rule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rule10.getTree());

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
    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:52:1: rule : condition '[' actions ']' -> ^( CONDITION condition actions ) ;
    public final SAFParser.rule_return rule() throws RecognitionException {
        SAFParser.rule_return retval = new SAFParser.rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal12=null;
        Token char_literal14=null;
        SAFParser.condition_return condition11 =null;

        SAFParser.actions_return actions13 =null;


        CommonTree char_literal12_tree=null;
        CommonTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_actions=new RewriteRuleSubtreeStream(adaptor,"rule actions");
        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:52:9: ( condition '[' actions ']' -> ^( CONDITION condition actions ) )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:52:11: condition '[' actions ']'
            {
            pushFollow(FOLLOW_condition_in_rule302);
            condition11=condition();

            state._fsp--;

            stream_condition.add(condition11.getTree());

            char_literal12=(Token)match(input,25,FOLLOW_25_in_rule304);  
            stream_25.add(char_literal12);


            pushFollow(FOLLOW_actions_in_rule306);
            actions13=actions();

            state._fsp--;

            stream_actions.add(actions13.getTree());

            char_literal14=(Token)match(input,26,FOLLOW_26_in_rule308);  
            stream_26.add(char_literal14);


            // AST REWRITE
            // elements: condition, actions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 53:7: -> ^( CONDITION condition actions )
            {
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:53:10: ^( CONDITION condition actions )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDITION, "CONDITION")
                , root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_1, stream_actions.nextTree());

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
    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:56:1: condition : ( IDENTIFIER -> ^( NAME IDENTIFIER ) | andStatement | orStatement );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER15=null;
        SAFParser.andStatement_return andStatement16 =null;

        SAFParser.orStatement_return orStatement17 =null;


        CommonTree IDENTIFIER15_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:56:13: ( IDENTIFIER -> ^( NAME IDENTIFIER ) | andStatement | orStatement )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENTIFIER) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt3=2;
                    }
                    break;
                case 29:
                    {
                    alt3=3;
                    }
                    break;
                case 25:
                    {
                    alt3=1;
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
                    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:56:15: IDENTIFIER
                    {
                    IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_condition345);  
                    stream_IDENTIFIER.add(IDENTIFIER15);


                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 56:26: -> ^( NAME IDENTIFIER )
                    {
                        // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:56:29: ^( NAME IDENTIFIER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NAME, "NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:57:8: andStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_andStatement_in_condition362);
                    andStatement16=andStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, andStatement16.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:58:8: orStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_orStatement_in_condition371);
                    orStatement17=orStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, orStatement17.getTree());

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


    public static class andStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andStatement"
    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:61:1: andStatement : c1= IDENTIFIER 'and' c2= IDENTIFIER -> ^( AND_OPERATOR ^( NAME $c1) ^( NAME $c2) ) ;
    public final SAFParser.andStatement_return andStatement() throws RecognitionException {
        SAFParser.andStatement_return retval = new SAFParser.andStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token c1=null;
        Token c2=null;
        Token string_literal18=null;

        CommonTree c1_tree=null;
        CommonTree c2_tree=null;
        CommonTree string_literal18_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");

        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:61:15: (c1= IDENTIFIER 'and' c2= IDENTIFIER -> ^( AND_OPERATOR ^( NAME $c1) ^( NAME $c2) ) )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:61:17: c1= IDENTIFIER 'and' c2= IDENTIFIER
            {
            c1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_andStatement388);  
            stream_IDENTIFIER.add(c1);


            string_literal18=(Token)match(input,27,FOLLOW_27_in_andStatement390);  
            stream_27.add(string_literal18);


            c2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_andStatement394);  
            stream_IDENTIFIER.add(c2);


            // AST REWRITE
            // elements: c2, c1
            // token labels: c1, c2
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_c1=new RewriteRuleTokenStream(adaptor,"token c1",c1);
            RewriteRuleTokenStream stream_c2=new RewriteRuleTokenStream(adaptor,"token c2",c2);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 62:7: -> ^( AND_OPERATOR ^( NAME $c1) ^( NAME $c2) )
            {
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:62:10: ^( AND_OPERATOR ^( NAME $c1) ^( NAME $c2) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(AND_OPERATOR, "AND_OPERATOR")
                , root_1);

                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:62:25: ^( NAME $c1)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAME, "NAME")
                , root_2);

                adaptor.addChild(root_2, stream_c1.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:62:37: ^( NAME $c2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAME, "NAME")
                , root_2);

                adaptor.addChild(root_2, stream_c2.nextNode());

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
    // $ANTLR end "andStatement"


    public static class orStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orStatement"
    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:64:1: orStatement : c1= IDENTIFIER 'or' c2= IDENTIFIER -> ^( OR_OPERATOR ^( NAME $c1) ^( NAME $c2) ) ;
    public final SAFParser.orStatement_return orStatement() throws RecognitionException {
        SAFParser.orStatement_return retval = new SAFParser.orStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token c1=null;
        Token c2=null;
        Token string_literal19=null;

        CommonTree c1_tree=null;
        CommonTree c2_tree=null;
        CommonTree string_literal19_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:64:15: (c1= IDENTIFIER 'or' c2= IDENTIFIER -> ^( OR_OPERATOR ^( NAME $c1) ^( NAME $c2) ) )
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:64:17: c1= IDENTIFIER 'or' c2= IDENTIFIER
            {
            c1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_orStatement437);  
            stream_IDENTIFIER.add(c1);


            string_literal19=(Token)match(input,29,FOLLOW_29_in_orStatement439);  
            stream_29.add(string_literal19);


            c2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_orStatement443);  
            stream_IDENTIFIER.add(c2);


            // AST REWRITE
            // elements: c2, c1
            // token labels: c1, c2
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_c1=new RewriteRuleTokenStream(adaptor,"token c1",c1);
            RewriteRuleTokenStream stream_c2=new RewriteRuleTokenStream(adaptor,"token c2",c2);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 65:7: -> ^( OR_OPERATOR ^( NAME $c1) ^( NAME $c2) )
            {
                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:65:10: ^( OR_OPERATOR ^( NAME $c1) ^( NAME $c2) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(OR_OPERATOR, "OR_OPERATOR")
                , root_1);

                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:65:24: ^( NAME $c1)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAME, "NAME")
                , root_2);

                adaptor.addChild(root_2, stream_c1.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:65:36: ^( NAME $c2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAME, "NAME")
                , root_2);

                adaptor.addChild(root_2, stream_c2.nextNode());

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
    // $ANTLR end "orStatement"


    public static class actions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "actions"
    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:68:1: actions : ( ( action action ) | 'choose' '(' ( action )+ ')' -> ^( CHOOSE ( action )+ ) );
    public final SAFParser.actions_return actions() throws RecognitionException {
        SAFParser.actions_return retval = new SAFParser.actions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal22=null;
        Token char_literal23=null;
        Token char_literal25=null;
        SAFParser.action_return action20 =null;

        SAFParser.action_return action21 =null;

        SAFParser.action_return action24 =null;


        CommonTree string_literal22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree char_literal25_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:68:12: ( ( action action ) | 'choose' '(' ( action )+ ')' -> ^( CHOOSE ( action )+ ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:68:14: ( action action )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:68:14: ( action action )
                    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:68:15: action action
                    {
                    pushFollow(FOLLOW_action_in_actions492);
                    action20=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action20.getTree());

                    pushFollow(FOLLOW_action_in_actions494);
                    action21=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action21.getTree());

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:69:9: 'choose' '(' ( action )+ ')'
                    {
                    string_literal22=(Token)match(input,28,FOLLOW_28_in_actions505);  
                    stream_28.add(string_literal22);


                    char_literal23=(Token)match(input,22,FOLLOW_22_in_actions507);  
                    stream_22.add(char_literal23);


                    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:69:22: ( action )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENTIFIER||LA4_0==28) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:69:22: action
                    	    {
                    	    pushFollow(FOLLOW_action_in_actions509);
                    	    action24=action();

                    	    state._fsp--;

                    	    stream_action.add(action24.getTree());

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


                    char_literal25=(Token)match(input,23,FOLLOW_23_in_actions512);  
                    stream_23.add(char_literal25);


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
                    // 69:34: -> ^( CHOOSE ( action )+ )
                    {
                        // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:69:37: ^( CHOOSE ( action )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHOOSE, "CHOOSE")
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
    // $ANTLR end "actions"


    public static class action_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:72:1: action : ( IDENTIFIER -> ^( ACTION ^( NAME IDENTIFIER ) ) | 'choose' '(' ( IDENTIFIER )+ ')' -> ^( CHOOSE ( IDENTIFIER )+ ) );
    public final SAFParser.action_return action() throws RecognitionException {
        SAFParser.action_return retval = new SAFParser.action_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER26=null;
        Token string_literal27=null;
        Token char_literal28=null;
        Token IDENTIFIER29=null;
        Token char_literal30=null;

        CommonTree IDENTIFIER26_tree=null;
        CommonTree string_literal27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree IDENTIFIER29_tree=null;
        CommonTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");

        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:72:11: ( IDENTIFIER -> ^( ACTION ^( NAME IDENTIFIER ) ) | 'choose' '(' ( IDENTIFIER )+ ')' -> ^( CHOOSE ( IDENTIFIER )+ ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENTIFIER) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:72:13: IDENTIFIER
                    {
                    IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_action538);  
                    stream_IDENTIFIER.add(IDENTIFIER26);


                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 72:24: -> ^( ACTION ^( NAME IDENTIFIER ) )
                    {
                        // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:72:27: ^( ACTION ^( NAME IDENTIFIER ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ACTION, "ACTION")
                        , root_1);

                        // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:72:36: ^( NAME IDENTIFIER )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NAME, "NAME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_IDENTIFIER.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:73:9: 'choose' '(' ( IDENTIFIER )+ ')'
                    {
                    string_literal27=(Token)match(input,28,FOLLOW_28_in_action560);  
                    stream_28.add(string_literal27);


                    char_literal28=(Token)match(input,22,FOLLOW_22_in_action562);  
                    stream_22.add(char_literal28);


                    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:73:22: ( IDENTIFIER )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==IDENTIFIER) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:73:22: IDENTIFIER
                    	    {
                    	    IDENTIFIER29=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_action564);  
                    	    stream_IDENTIFIER.add(IDENTIFIER29);


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


                    char_literal30=(Token)match(input,23,FOLLOW_23_in_action567);  
                    stream_23.add(char_literal30);


                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 73:38: -> ^( CHOOSE ( IDENTIFIER )+ )
                    {
                        // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAF.g:73:41: ^( CHOOSE ( IDENTIFIER )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CHOOSE, "CHOOSE")
                        , root_1);

                        if ( !(stream_IDENTIFIER.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\7\uffff";
    static final String DFA5_eofS =
        "\7\uffff";
    static final String DFA5_minS =
        "\1\14\1\uffff\1\26\2\14\1\uffff\1\14";
    static final String DFA5_maxS =
        "\1\34\1\uffff\1\26\2\34\1\uffff\1\34";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\1\uffff";
    static final String DFA5_specialS =
        "\7\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\17\uffff\1\2",
            "",
            "\1\3",
            "\1\4\17\uffff\1\5",
            "\1\4\12\uffff\1\6\4\uffff\1\5",
            "",
            "\1\1\15\uffff\1\5\1\uffff\1\1"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "68:1: actions : ( ( action action ) | 'choose' '(' ( action )+ ')' -> ^( CHOOSE ( action )+ ) );";
        }
    }
 

    public static final BitSet FOLLOW_IDENTIFIER_in_fighter107 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fighter109 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_personality_in_fighter118 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_behaviour_in_fighter127 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fighter135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_personality214 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_characteristic223 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_characteristic225 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUMBER_in_characteristic227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_behaviour291 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_condition_in_rule302 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rule304 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_actions_in_rule306 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_condition345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andStatement_in_condition362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orStatement_in_condition371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_andStatement388 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_andStatement390 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_andStatement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_orStatement437 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_orStatement439 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_orStatement443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_actions492 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_action_in_actions494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_actions505 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_actions507 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_action_in_actions509 = new BitSet(new long[]{0x0000000010801000L});
    public static final BitSet FOLLOW_23_in_actions512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_action538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_action560 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_action562 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_action564 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_23_in_action567 = new BitSet(new long[]{0x0000000000000002L});

}