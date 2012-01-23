// $ANTLR 3.4 /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g 2012-01-23 19:29:07

  package saf.generation.output; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTRIBUTE", "BEHAVIOUR", "CHOOSE", "CONDITIONTYPE", "DIGIT", "EQUALS", "FIGHTACTIONTYPE", "IDENT", "LEFT_BRACKET", "LEFT_CURLY", "LEFT_PAREN", "MOVEACTIONTYPE", "ONEDIGIT", "PERSONALITY", "RIGHT_BRACKET", "RIGHT_CURLY", "RIGHT_PAREN", "WS"
    };

    public static final int EOF=-1;
    public static final int ATTRIBUTE=4;
    public static final int BEHAVIOUR=5;
    public static final int CHOOSE=6;
    public static final int CONDITIONTYPE=7;
    public static final int DIGIT=8;
    public static final int EQUALS=9;
    public static final int FIGHTACTIONTYPE=10;
    public static final int IDENT=11;
    public static final int LEFT_BRACKET=12;
    public static final int LEFT_CURLY=13;
    public static final int LEFT_PAREN=14;
    public static final int MOVEACTIONTYPE=15;
    public static final int ONEDIGIT=16;
    public static final int PERSONALITY=17;
    public static final int RIGHT_BRACKET=18;
    public static final int RIGHT_CURLY=19;
    public static final int RIGHT_PAREN=20;
    public static final int WS=21;

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
    public String getGrammarFileName() { return "/Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:16:1: fighter : IDENT ^ LEFT_CURLY ! personality behaviour RIGHT_CURLY !;
    public final FDLParser.fighter_return fighter() throws RecognitionException {
        FDLParser.fighter_return retval = new FDLParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT1=null;
        Token LEFT_CURLY2=null;
        Token RIGHT_CURLY5=null;
        FDLParser.personality_return personality3 =null;

        FDLParser.behaviour_return behaviour4 =null;


        Object IDENT1_tree=null;
        Object LEFT_CURLY2_tree=null;
        Object RIGHT_CURLY5_tree=null;

        try {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:17:2: ( IDENT ^ LEFT_CURLY ! personality behaviour RIGHT_CURLY !)
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:17:5: IDENT ^ LEFT_CURLY ! personality behaviour RIGHT_CURLY !
            {
            root_0 = (Object)adaptor.nil();


            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter48); 
            IDENT1_tree = 
            (Object)adaptor.create(IDENT1)
            ;
            root_0 = (Object)adaptor.becomeRoot(IDENT1_tree, root_0);


            LEFT_CURLY2=(Token)match(input,LEFT_CURLY,FOLLOW_LEFT_CURLY_in_fighter54); 

            pushFollow(FOLLOW_personality_in_fighter60);
            personality3=personality();

            state._fsp--;

            adaptor.addChild(root_0, personality3.getTree());

            pushFollow(FOLLOW_behaviour_in_fighter65);
            behaviour4=behaviour();

            state._fsp--;

            adaptor.addChild(root_0, behaviour4.getTree());

            RIGHT_CURLY5=(Token)match(input,RIGHT_CURLY,FOLLOW_RIGHT_CURLY_in_fighter70); 

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


    public static class personality_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:25:1: personality : ( ( characteristic )* ) -> ^( PERSONALITY ( characteristic )* ) ;
    public final FDLParser.personality_return personality() throws RecognitionException {
        FDLParser.personality_return retval = new FDLParser.personality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FDLParser.characteristic_return characteristic6 =null;


        RewriteRuleSubtreeStream stream_characteristic=new RewriteRuleSubtreeStream(adaptor,"rule characteristic");
        try {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:26:2: ( ( ( characteristic )* ) -> ^( PERSONALITY ( characteristic )* ) )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:26:4: ( ( characteristic )* )
            {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:26:4: ( ( characteristic )* )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:26:5: ( characteristic )*
            {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:26:5: ( characteristic )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ATTRIBUTE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:26:5: characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_personality84);
            	    characteristic6=characteristic();

            	    state._fsp--;

            	    stream_characteristic.add(characteristic6.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: characteristic
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 26:22: -> ^( PERSONALITY ( characteristic )* )
            {
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:26:25: ^( PERSONALITY ( characteristic )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PERSONALITY, "PERSONALITY")
                , root_1);

                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:26:39: ( characteristic )*
                while ( stream_characteristic.hasNext() ) {
                    adaptor.addChild(root_1, stream_characteristic.nextTree());

                }
                stream_characteristic.reset();

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
    // $ANTLR end "personality"


    public static class characteristic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:29:1: characteristic : ( ATTRIBUTE EQUALS ONEDIGIT ) -> ^( ATTRIBUTE ^( ONEDIGIT ) ) ;
    public final FDLParser.characteristic_return characteristic() throws RecognitionException {
        FDLParser.characteristic_return retval = new FDLParser.characteristic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATTRIBUTE7=null;
        Token EQUALS8=null;
        Token ONEDIGIT9=null;

        Object ATTRIBUTE7_tree=null;
        Object EQUALS8_tree=null;
        Object ONEDIGIT9_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_ONEDIGIT=new RewriteRuleTokenStream(adaptor,"token ONEDIGIT");
        RewriteRuleTokenStream stream_ATTRIBUTE=new RewriteRuleTokenStream(adaptor,"token ATTRIBUTE");

        try {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:30:2: ( ( ATTRIBUTE EQUALS ONEDIGIT ) -> ^( ATTRIBUTE ^( ONEDIGIT ) ) )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:30:4: ( ATTRIBUTE EQUALS ONEDIGIT )
            {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:30:4: ( ATTRIBUTE EQUALS ONEDIGIT )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:30:5: ATTRIBUTE EQUALS ONEDIGIT
            {
            ATTRIBUTE7=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_characteristic107);  
            stream_ATTRIBUTE.add(ATTRIBUTE7);


            EQUALS8=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_characteristic109);  
            stream_EQUALS.add(EQUALS8);


            ONEDIGIT9=(Token)match(input,ONEDIGIT,FOLLOW_ONEDIGIT_in_characteristic111);  
            stream_ONEDIGIT.add(ONEDIGIT9);


            }


            // AST REWRITE
            // elements: ONEDIGIT, ATTRIBUTE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 30:32: -> ^( ATTRIBUTE ^( ONEDIGIT ) )
            {
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:30:35: ^( ATTRIBUTE ^( ONEDIGIT ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ATTRIBUTE.nextNode()
                , root_1);

                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:30:47: ^( ONEDIGIT )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_ONEDIGIT.nextNode()
                , root_2);

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


    public static class behaviour_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:33:1: behaviour : ( ( rule )* ) -> ^( BEHAVIOUR ( rule )* ) ;
    public final FDLParser.behaviour_return behaviour() throws RecognitionException {
        FDLParser.behaviour_return retval = new FDLParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FDLParser.rule_return rule10 =null;


        RewriteRuleSubtreeStream stream_rule=new RewriteRuleSubtreeStream(adaptor,"rule rule");
        try {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:34:2: ( ( ( rule )* ) -> ^( BEHAVIOUR ( rule )* ) )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:34:4: ( ( rule )* )
            {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:34:4: ( ( rule )* )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:34:5: ( rule )*
            {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:34:5: ( rule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CONDITIONTYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:34:5: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_behaviour135);
            	    rule10=rule();

            	    state._fsp--;

            	    stream_rule.add(rule10.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: rule
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:12: -> ^( BEHAVIOUR ( rule )* )
            {
                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:34:15: ^( BEHAVIOUR ( rule )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BEHAVIOUR, "BEHAVIOUR")
                , root_1);

                // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:34:27: ( rule )*
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
    // $ANTLR end "behaviour"


    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:37:1: rule : ( CONDITIONTYPE ^ LEFT_BRACKET ! ( MOVEACTIONTYPE | chooseMoveActionType ) ( FIGHTACTIONTYPE | chooseFightActionType ) RIGHT_BRACKET !) ;
    public final FDLParser.rule_return rule() throws RecognitionException {
        FDLParser.rule_return retval = new FDLParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONDITIONTYPE11=null;
        Token LEFT_BRACKET12=null;
        Token MOVEACTIONTYPE13=null;
        Token FIGHTACTIONTYPE15=null;
        Token RIGHT_BRACKET17=null;
        FDLParser.chooseMoveActionType_return chooseMoveActionType14 =null;

        FDLParser.chooseFightActionType_return chooseFightActionType16 =null;


        Object CONDITIONTYPE11_tree=null;
        Object LEFT_BRACKET12_tree=null;
        Object MOVEACTIONTYPE13_tree=null;
        Object FIGHTACTIONTYPE15_tree=null;
        Object RIGHT_BRACKET17_tree=null;

        try {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:38:2: ( ( CONDITIONTYPE ^ LEFT_BRACKET ! ( MOVEACTIONTYPE | chooseMoveActionType ) ( FIGHTACTIONTYPE | chooseFightActionType ) RIGHT_BRACKET !) )
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:38:5: ( CONDITIONTYPE ^ LEFT_BRACKET ! ( MOVEACTIONTYPE | chooseMoveActionType ) ( FIGHTACTIONTYPE | chooseFightActionType ) RIGHT_BRACKET !)
            {
            root_0 = (Object)adaptor.nil();


            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:38:5: ( CONDITIONTYPE ^ LEFT_BRACKET ! ( MOVEACTIONTYPE | chooseMoveActionType ) ( FIGHTACTIONTYPE | chooseFightActionType ) RIGHT_BRACKET !)
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:39:4: CONDITIONTYPE ^ LEFT_BRACKET ! ( MOVEACTIONTYPE | chooseMoveActionType ) ( FIGHTACTIONTYPE | chooseFightActionType ) RIGHT_BRACKET !
            {
            CONDITIONTYPE11=(Token)match(input,CONDITIONTYPE,FOLLOW_CONDITIONTYPE_in_rule163); 
            CONDITIONTYPE11_tree = 
            (Object)adaptor.create(CONDITIONTYPE11)
            ;
            root_0 = (Object)adaptor.becomeRoot(CONDITIONTYPE11_tree, root_0);


            LEFT_BRACKET12=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_rule169); 

            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:41:5: ( MOVEACTIONTYPE | chooseMoveActionType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==MOVEACTIONTYPE) ) {
                alt3=1;
            }
            else if ( (LA3_0==CHOOSE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:41:6: MOVEACTIONTYPE
                    {
                    MOVEACTIONTYPE13=(Token)match(input,MOVEACTIONTYPE,FOLLOW_MOVEACTIONTYPE_in_rule177); 
                    MOVEACTIONTYPE13_tree = 
                    (Object)adaptor.create(MOVEACTIONTYPE13)
                    ;
                    adaptor.addChild(root_0, MOVEACTIONTYPE13_tree);


                    }
                    break;
                case 2 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:41:23: chooseMoveActionType
                    {
                    pushFollow(FOLLOW_chooseMoveActionType_in_rule181);
                    chooseMoveActionType14=chooseMoveActionType();

                    state._fsp--;

                    adaptor.addChild(root_0, chooseMoveActionType14.getTree());

                    }
                    break;

            }


            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:41:45: ( FIGHTACTIONTYPE | chooseFightActionType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==FIGHTACTIONTYPE) ) {
                alt4=1;
            }
            else if ( (LA4_0==CHOOSE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:41:46: FIGHTACTIONTYPE
                    {
                    FIGHTACTIONTYPE15=(Token)match(input,FIGHTACTIONTYPE,FOLLOW_FIGHTACTIONTYPE_in_rule185); 
                    FIGHTACTIONTYPE15_tree = 
                    (Object)adaptor.create(FIGHTACTIONTYPE15)
                    ;
                    adaptor.addChild(root_0, FIGHTACTIONTYPE15_tree);


                    }
                    break;
                case 2 :
                    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:41:64: chooseFightActionType
                    {
                    pushFollow(FOLLOW_chooseFightActionType_in_rule189);
                    chooseFightActionType16=chooseFightActionType();

                    state._fsp--;

                    adaptor.addChild(root_0, chooseFightActionType16.getTree());

                    }
                    break;

            }


            RIGHT_BRACKET17=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_rule195); 

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
    // $ANTLR end "rule"


    public static class chooseFightActionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chooseFightActionType"
    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:46:1: chooseFightActionType : CHOOSE ^ LEFT_PAREN ! ( FIGHTACTIONTYPE )+ RIGHT_PAREN !;
    public final FDLParser.chooseFightActionType_return chooseFightActionType() throws RecognitionException {
        FDLParser.chooseFightActionType_return retval = new FDLParser.chooseFightActionType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE18=null;
        Token LEFT_PAREN19=null;
        Token FIGHTACTIONTYPE20=null;
        Token RIGHT_PAREN21=null;

        Object CHOOSE18_tree=null;
        Object LEFT_PAREN19_tree=null;
        Object FIGHTACTIONTYPE20_tree=null;
        Object RIGHT_PAREN21_tree=null;

        try {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:47:2: ( CHOOSE ^ LEFT_PAREN ! ( FIGHTACTIONTYPE )+ RIGHT_PAREN !)
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:47:4: CHOOSE ^ LEFT_PAREN ! ( FIGHTACTIONTYPE )+ RIGHT_PAREN !
            {
            root_0 = (Object)adaptor.nil();


            CHOOSE18=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_chooseFightActionType212); 
            CHOOSE18_tree = 
            (Object)adaptor.create(CHOOSE18)
            ;
            root_0 = (Object)adaptor.becomeRoot(CHOOSE18_tree, root_0);


            LEFT_PAREN19=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_chooseFightActionType217); 

            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:49:4: ( FIGHTACTIONTYPE )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==FIGHTACTIONTYPE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:49:4: FIGHTACTIONTYPE
            	    {
            	    FIGHTACTIONTYPE20=(Token)match(input,FIGHTACTIONTYPE,FOLLOW_FIGHTACTIONTYPE_in_chooseFightActionType223); 
            	    FIGHTACTIONTYPE20_tree = 
            	    (Object)adaptor.create(FIGHTACTIONTYPE20)
            	    ;
            	    adaptor.addChild(root_0, FIGHTACTIONTYPE20_tree);


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


            RIGHT_PAREN21=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_chooseFightActionType229); 

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
    // $ANTLR end "chooseFightActionType"


    public static class chooseMoveActionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chooseMoveActionType"
    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:53:1: chooseMoveActionType : CHOOSE ^ LEFT_PAREN ! ( MOVEACTIONTYPE )+ RIGHT_PAREN !;
    public final FDLParser.chooseMoveActionType_return chooseMoveActionType() throws RecognitionException {
        FDLParser.chooseMoveActionType_return retval = new FDLParser.chooseMoveActionType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE22=null;
        Token LEFT_PAREN23=null;
        Token MOVEACTIONTYPE24=null;
        Token RIGHT_PAREN25=null;

        Object CHOOSE22_tree=null;
        Object LEFT_PAREN23_tree=null;
        Object MOVEACTIONTYPE24_tree=null;
        Object RIGHT_PAREN25_tree=null;

        try {
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:54:2: ( CHOOSE ^ LEFT_PAREN ! ( MOVEACTIONTYPE )+ RIGHT_PAREN !)
            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:54:4: CHOOSE ^ LEFT_PAREN ! ( MOVEACTIONTYPE )+ RIGHT_PAREN !
            {
            root_0 = (Object)adaptor.nil();


            CHOOSE22=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_chooseMoveActionType242); 
            CHOOSE22_tree = 
            (Object)adaptor.create(CHOOSE22)
            ;
            root_0 = (Object)adaptor.becomeRoot(CHOOSE22_tree, root_0);


            LEFT_PAREN23=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_chooseMoveActionType247); 

            // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:56:4: ( MOVEACTIONTYPE )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MOVEACTIONTYPE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/jorrite/School/SoftwareConstruction/SC-SAF/src/saf/generation/input/FDL.g:56:4: MOVEACTIONTYPE
            	    {
            	    MOVEACTIONTYPE24=(Token)match(input,MOVEACTIONTYPE,FOLLOW_MOVEACTIONTYPE_in_chooseMoveActionType253); 
            	    MOVEACTIONTYPE24_tree = 
            	    (Object)adaptor.create(MOVEACTIONTYPE24)
            	    ;
            	    adaptor.addChild(root_0, MOVEACTIONTYPE24_tree);


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


            RIGHT_PAREN25=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_chooseMoveActionType259); 

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
    // $ANTLR end "chooseMoveActionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighter48 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LEFT_CURLY_in_fighter54 = new BitSet(new long[]{0x0000000000080090L});
    public static final BitSet FOLLOW_personality_in_fighter60 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_behaviour_in_fighter65 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RIGHT_CURLY_in_fighter70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_personality84 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_characteristic107 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUALS_in_characteristic109 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ONEDIGIT_in_characteristic111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_behaviour135 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_CONDITIONTYPE_in_rule163 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_rule169 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_MOVEACTIONTYPE_in_rule177 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_chooseMoveActionType_in_rule181 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_FIGHTACTIONTYPE_in_rule185 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_chooseFightActionType_in_rule189 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_rule195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_chooseFightActionType212 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_chooseFightActionType217 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FIGHTACTIONTYPE_in_chooseFightActionType223 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_chooseFightActionType229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_chooseMoveActionType242 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_chooseMoveActionType247 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOVEACTIONTYPE_in_chooseMoveActionType253 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_chooseMoveActionType259 = new BitSet(new long[]{0x0000000000000002L});

}