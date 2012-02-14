// $ANTLR 3.4 /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g 2012-02-08 11:15:07

  package com.yennick.fighter;
  import com.yennick.fighter.bot.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHOOSE", "COMMENT", "IDENT", "MULTI_COMMENT", "VALUE", "WHITESPACE", "'('", "')'", "'='", "'['", "']'", "'and'", "'or'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int CHOOSE=4;
    public static final int COMMENT=5;
    public static final int IDENT=6;
    public static final int MULTI_COMMENT=7;
    public static final int VALUE=8;
    public static final int WHITESPACE=9;

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
    public String getGrammarFileName() { return "/Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        public Bot fighter;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:24:1: fighter returns [Bot fighter] : IDENT '{' ( personality | behaviour )* '}' ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT1=null;
        Token char_literal2=null;
        Token char_literal5=null;
        SAFParser.personality_return personality3 =null;

        SAFParser.behaviour_return behaviour4 =null;


        Object IDENT1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal5_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:25:2: ( IDENT '{' ( personality | behaviour )* '}' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:25:4: IDENT '{' ( personality | behaviour )* '}'
            {
            root_0 = (Object)adaptor.nil();


            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter72); 
            IDENT1_tree = 
            (Object)adaptor.create(IDENT1)
            ;
            adaptor.addChild(root_0, IDENT1_tree);


            char_literal2=(Token)match(input,17,FOLLOW_17_in_fighter74); 
            char_literal2_tree = 
            (Object)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);


            			retval.fighter = new Bot((IDENT1!=null?IDENT1.getText():null)); 

            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:26:4: ( personality | behaviour )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==12) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==13||(LA1_2 >= 15 && LA1_2 <= 16)) ) {
                        alt1=2;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:26:5: personality
            	    {
            	    pushFollow(FOLLOW_personality_in_fighter82);
            	    personality3=personality();

            	    state._fsp--;

            	    adaptor.addChild(root_0, personality3.getTree());

            	    retval.fighter.addPersonality((personality3!=null?personality3.personality:null));

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:27:5: behaviour
            	    {
            	    pushFollow(FOLLOW_behaviour_in_fighter90);
            	    behaviour4=behaviour();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviour4.getTree());

            	    retval.fighter.addBehaviour((behaviour4!=null?behaviour4.behaviour:null));

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            char_literal5=(Token)match(input,18,FOLLOW_18_in_fighter99); 
            char_literal5_tree = 
            (Object)adaptor.create(char_literal5)
            ;
            adaptor.addChild(root_0, char_literal5_tree);



            			System.out.println("FighterName:  " + retval.fighter.toString()); 
            		

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


    public static class behaviour_return extends ParserRuleReturnScope {
        public Behaviour behaviour;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:34:1: behaviour returns [Behaviour behaviour] : ( condition ) '[' a1= action a2= action ']' ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal7=null;
        Token char_literal8=null;
        SAFParser.action_return a1 =null;

        SAFParser.action_return a2 =null;

        SAFParser.condition_return condition6 =null;


        Object char_literal7_tree=null;
        Object char_literal8_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:35:2: ( ( condition ) '[' a1= action a2= action ']' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:36:3: ( condition ) '[' a1= action a2= action ']'
            {
            root_0 = (Object)adaptor.nil();



            			retval.behaviour = new Behaviour(); 
            		

            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:39:3: ( condition )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:39:4: condition
            {
            pushFollow(FOLLOW_condition_in_behaviour125);
            condition6=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition6.getTree());

            retval.behaviour.addCondition((condition6!=null?condition6.condition:null));

            }


            char_literal7=(Token)match(input,13,FOLLOW_13_in_behaviour134); 
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);


            pushFollow(FOLLOW_action_in_behaviour138);
            a1=action();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());

            pushFollow(FOLLOW_action_in_behaviour142);
            a2=action();

            state._fsp--;

            adaptor.addChild(root_0, a2.getTree());

            char_literal8=(Token)match(input,14,FOLLOW_14_in_behaviour144); 
            char_literal8_tree = 
            (Object)adaptor.create(char_literal8)
            ;
            adaptor.addChild(root_0, char_literal8_tree);


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


    public static class condition_return extends ParserRuleReturnScope {
        public Condition condition;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:45:1: condition returns [Condition condition] : ( IDENT | IDENT 'or' condition | IDENT 'and' condition );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT9=null;
        Token IDENT10=null;
        Token string_literal11=null;
        Token IDENT13=null;
        Token string_literal14=null;
        SAFParser.condition_return condition12 =null;

        SAFParser.condition_return condition15 =null;


        Object IDENT9_tree=null;
        Object IDENT10_tree=null;
        Object string_literal11_tree=null;
        Object IDENT13_tree=null;
        Object string_literal14_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:46:2: ( IDENT | IDENT 'or' condition | IDENT 'and' condition )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENT) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt2=2;
                    }
                    break;
                case 15:
                    {
                    alt2=3;
                    }
                    break;
                case 13:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:46:4: IDENT
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition163); 
                    IDENT9_tree = 
                    (Object)adaptor.create(IDENT9)
                    ;
                    adaptor.addChild(root_0, IDENT9_tree);


                     retval.condition = new Condition((IDENT9!=null?IDENT9.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:47:5: IDENT 'or' condition
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENT10=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition171); 
                    IDENT10_tree = 
                    (Object)adaptor.create(IDENT10)
                    ;
                    adaptor.addChild(root_0, IDENT10_tree);


                    string_literal11=(Token)match(input,16,FOLLOW_16_in_condition173); 
                    string_literal11_tree = 
                    (Object)adaptor.create(string_literal11)
                    ;
                    adaptor.addChild(root_0, string_literal11_tree);


                    pushFollow(FOLLOW_condition_in_condition175);
                    condition12=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition12.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:48:5: IDENT 'and' condition
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENT13=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition182); 
                    IDENT13_tree = 
                    (Object)adaptor.create(IDENT13)
                    ;
                    adaptor.addChild(root_0, IDENT13_tree);


                    string_literal14=(Token)match(input,15,FOLLOW_15_in_condition184); 
                    string_literal14_tree = 
                    (Object)adaptor.create(string_literal14)
                    ;
                    adaptor.addChild(root_0, string_literal14_tree);


                    pushFollow(FOLLOW_condition_in_condition186);
                    condition15=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition15.getTree());

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


    public static class action_return extends ParserRuleReturnScope {
        public Action action;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:52:1: action returns [Action action] : ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT ) ;
    public final SAFParser.action_return action() throws RecognitionException {
        SAFParser.action_return retval = new SAFParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a1=null;
        Token a2=null;
        Token act=null;
        Token string_literal16=null;
        Token char_literal17=null;
        Token char_literal18=null;

        Object a1_tree=null;
        Object a2_tree=null;
        Object act_tree=null;
        Object string_literal16_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:53:2: ( ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:53:4: ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT )
            {
            root_0 = (Object)adaptor.nil();


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:53:4: ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CHOOSE) ) {
                alt3=1;
            }
            else if ( (LA3_0==IDENT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:54:3: 'choose' '(' a1= IDENT a2= IDENT ')'
                    {
                    string_literal16=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_action207); 
                    string_literal16_tree = 
                    (Object)adaptor.create(string_literal16)
                    ;
                    adaptor.addChild(root_0, string_literal16_tree);


                    char_literal17=(Token)match(input,10,FOLLOW_10_in_action209); 
                    char_literal17_tree = 
                    (Object)adaptor.create(char_literal17)
                    ;
                    adaptor.addChild(root_0, char_literal17_tree);


                    a1=(Token)match(input,IDENT,FOLLOW_IDENT_in_action213); 
                    a1_tree = 
                    (Object)adaptor.create(a1)
                    ;
                    adaptor.addChild(root_0, a1_tree);


                    a2=(Token)match(input,IDENT,FOLLOW_IDENT_in_action217); 
                    a2_tree = 
                    (Object)adaptor.create(a2)
                    ;
                    adaptor.addChild(root_0, a2_tree);


                    char_literal18=(Token)match(input,11,FOLLOW_11_in_action219); 
                    char_literal18_tree = 
                    (Object)adaptor.create(char_literal18)
                    ;
                    adaptor.addChild(root_0, char_literal18_tree);


                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:55:5: act= IDENT
                    {
                    act=(Token)match(input,IDENT,FOLLOW_IDENT_in_action228); 
                    act_tree = 
                    (Object)adaptor.create(act)
                    ;
                    adaptor.addChild(root_0, act_tree);


                    }
                    break;

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
    // $ANTLR end "action"


    public static class personality_return extends ParserRuleReturnScope {
        public Personality personality;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:60:1: personality returns [Personality personality] : IDENT '=' VALUE ;
    public final SAFParser.personality_return personality() throws RecognitionException {
        SAFParser.personality_return retval = new SAFParser.personality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT19=null;
        Token char_literal20=null;
        Token VALUE21=null;

        Object IDENT19_tree=null;
        Object char_literal20_tree=null;
        Object VALUE21_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:61:2: ( IDENT '=' VALUE )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:61:4: IDENT '=' VALUE
            {
            root_0 = (Object)adaptor.nil();


            IDENT19=(Token)match(input,IDENT,FOLLOW_IDENT_in_personality251); 
            IDENT19_tree = 
            (Object)adaptor.create(IDENT19)
            ;
            adaptor.addChild(root_0, IDENT19_tree);


            char_literal20=(Token)match(input,12,FOLLOW_12_in_personality253); 
            char_literal20_tree = 
            (Object)adaptor.create(char_literal20)
            ;
            adaptor.addChild(root_0, char_literal20_tree);


            VALUE21=(Token)match(input,VALUE,FOLLOW_VALUE_in_personality255); 
            VALUE21_tree = 
            (Object)adaptor.create(VALUE21)
            ;
            adaptor.addChild(root_0, VALUE21_tree);



            			retval.personality = new Personality((IDENT19!=null?IDENT19.getText():null),Integer.parseInt((VALUE21!=null?VALUE21.getText():null))); 
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighter72 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_fighter74 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_personality_in_fighter82 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_behaviour_in_fighter90 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_18_in_fighter99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour125 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_behaviour134 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_action_in_behaviour138 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_action_in_behaviour142 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_behaviour144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition171 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_condition173 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_condition_in_condition175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition182 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_condition184 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_condition_in_condition186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_action207 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_action209 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_action213 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_action217 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_action219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_personality251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_personality253 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VALUE_in_personality255 = new BitSet(new long[]{0x0000000000000002L});

}