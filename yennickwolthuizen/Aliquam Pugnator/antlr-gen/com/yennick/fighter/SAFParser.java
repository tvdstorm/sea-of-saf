// $ANTLR 3.4 /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g 2012-02-20 11:24:33

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHOOSE", "IDENT", "VALUE", "WHITESPACE", "'('", "')'", "'='", "'['", "']'", "'and'", "'or'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int CHOOSE=4;
    public static final int IDENT=5;
    public static final int VALUE=6;
    public static final int WHITESPACE=7;

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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:22:1: fighter returns [Bot fighter] : IDENT '{' ( personality | behaviour )* '}' ;
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:23:2: ( IDENT '{' ( personality | behaviour )* '}' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:23:4: IDENT '{' ( personality | behaviour )* '}'
            {
            root_0 = (Object)adaptor.nil();


            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter70); 
            IDENT1_tree = 
            (Object)adaptor.create(IDENT1)
            ;
            adaptor.addChild(root_0, IDENT1_tree);


            char_literal2=(Token)match(input,15,FOLLOW_15_in_fighter72); 
            char_literal2_tree = 
            (Object)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);


            			retval.fighter = new Bot((IDENT1!=null?IDENT1.getText():null)); 

            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:24:4: ( personality | behaviour )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==10) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==11||(LA1_2 >= 13 && LA1_2 <= 14)) ) {
                        alt1=2;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:24:5: personality
            	    {
            	    pushFollow(FOLLOW_personality_in_fighter80);
            	    personality3=personality();

            	    state._fsp--;

            	    adaptor.addChild(root_0, personality3.getTree());

            	    retval.fighter.addPersonality((personality3!=null?personality3.personality:null));

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:25:5: behaviour
            	    {
            	    pushFollow(FOLLOW_behaviour_in_fighter88);
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


            char_literal5=(Token)match(input,16,FOLLOW_16_in_fighter97); 
            char_literal5_tree = 
            (Object)adaptor.create(char_literal5)
            ;
            adaptor.addChild(root_0, char_literal5_tree);



            			System.out.println( retval.fighter.toString()); 
            		

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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:32:1: behaviour returns [Behaviour behaviour] : ( condition ) '[' a1= action a2= action ']' ;
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:33:2: ( ( condition ) '[' a1= action a2= action ']' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:34:3: ( condition ) '[' a1= action a2= action ']'
            {
            root_0 = (Object)adaptor.nil();



            			retval.behaviour = new Behaviour(); 
            		

            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:37:3: ( condition )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:37:4: condition
            {
            pushFollow(FOLLOW_condition_in_behaviour123);
            condition6=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition6.getTree());

            retval.behaviour.addCondition((condition6!=null?condition6.condition:null));

            }


            char_literal7=(Token)match(input,11,FOLLOW_11_in_behaviour132); 
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);


            pushFollow(FOLLOW_action_in_behaviour136);
            a1=action();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());

            pushFollow(FOLLOW_action_in_behaviour140);
            a2=action();

            state._fsp--;

            adaptor.addChild(root_0, a2.getTree());

            char_literal8=(Token)match(input,12,FOLLOW_12_in_behaviour142); 
            char_literal8_tree = 
            (Object)adaptor.create(char_literal8)
            ;
            adaptor.addChild(root_0, char_literal8_tree);


            retval.behaviour.addAction((a1!=null?a1.action:null),(a2!=null?a2.action:null));

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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:42:1: condition returns [Condition condition] : ( IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token first=null;
        Token second=null;
        Token IDENT9=null;
        Token string_literal10=null;
        Token string_literal11=null;

        Object first_tree=null;
        Object second_tree=null;
        Object IDENT9_tree=null;
        Object string_literal10_tree=null;
        Object string_literal11_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:43:2: ( IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENT) ) {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    alt2=2;
                    }
                    break;
                case 13:
                    {
                    alt2=3;
                    }
                    break;
                case 11:
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
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:43:4: IDENT
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition162); 
                    IDENT9_tree = 
                    (Object)adaptor.create(IDENT9)
                    ;
                    adaptor.addChild(root_0, IDENT9_tree);


                     retval.condition = new Condition((IDENT9!=null?IDENT9.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:44:5: first= IDENT 'or' second= IDENT
                    {
                    root_0 = (Object)adaptor.nil();


                    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition172); 
                    first_tree = 
                    (Object)adaptor.create(first)
                    ;
                    adaptor.addChild(root_0, first_tree);


                    string_literal10=(Token)match(input,14,FOLLOW_14_in_condition174); 
                    string_literal10_tree = 
                    (Object)adaptor.create(string_literal10)
                    ;
                    adaptor.addChild(root_0, string_literal10_tree);


                    second=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition178); 
                    second_tree = 
                    (Object)adaptor.create(second)
                    ;
                    adaptor.addChild(root_0, second_tree);


                     retval.condition = new Condition((first!=null?first.getText():null),(second!=null?second.getText():null),"or"); 

                    }
                    break;
                case 3 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:45:5: first= IDENT 'and' second= IDENT
                    {
                    root_0 = (Object)adaptor.nil();


                    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition188); 
                    first_tree = 
                    (Object)adaptor.create(first)
                    ;
                    adaptor.addChild(root_0, first_tree);


                    string_literal11=(Token)match(input,13,FOLLOW_13_in_condition190); 
                    string_literal11_tree = 
                    (Object)adaptor.create(string_literal11)
                    ;
                    adaptor.addChild(root_0, string_literal11_tree);


                    second=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition194); 
                    second_tree = 
                    (Object)adaptor.create(second)
                    ;
                    adaptor.addChild(root_0, second_tree);


                     retval.condition = new Condition((first!=null?first.getText():null),(second!=null?second.getText():null),"and"); 

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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:49:1: action returns [Action action] : ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT ) ;
    public final SAFParser.action_return action() throws RecognitionException {
        SAFParser.action_return retval = new SAFParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a1=null;
        Token a2=null;
        Token act=null;
        Token string_literal12=null;
        Token char_literal13=null;
        Token char_literal14=null;

        Object a1_tree=null;
        Object a2_tree=null;
        Object act_tree=null;
        Object string_literal12_tree=null;
        Object char_literal13_tree=null;
        Object char_literal14_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:50:2: ( ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:50:4: ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT )
            {
            root_0 = (Object)adaptor.nil();


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:50:4: ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT )
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
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:51:3: 'choose' '(' a1= IDENT a2= IDENT ')'
                    {
                    string_literal12=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_action216); 
                    string_literal12_tree = 
                    (Object)adaptor.create(string_literal12)
                    ;
                    adaptor.addChild(root_0, string_literal12_tree);


                    char_literal13=(Token)match(input,8,FOLLOW_8_in_action218); 
                    char_literal13_tree = 
                    (Object)adaptor.create(char_literal13)
                    ;
                    adaptor.addChild(root_0, char_literal13_tree);


                    a1=(Token)match(input,IDENT,FOLLOW_IDENT_in_action222); 
                    a1_tree = 
                    (Object)adaptor.create(a1)
                    ;
                    adaptor.addChild(root_0, a1_tree);


                    a2=(Token)match(input,IDENT,FOLLOW_IDENT_in_action226); 
                    a2_tree = 
                    (Object)adaptor.create(a2)
                    ;
                    adaptor.addChild(root_0, a2_tree);


                    char_literal14=(Token)match(input,9,FOLLOW_9_in_action228); 
                    char_literal14_tree = 
                    (Object)adaptor.create(char_literal14)
                    ;
                    adaptor.addChild(root_0, char_literal14_tree);


                     retval.action = new Action((a1!=null?a1.getText():null), (a2!=null?a2.getText():null),true); 

                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:52:5: act= IDENT
                    {
                    act=(Token)match(input,IDENT,FOLLOW_IDENT_in_action238); 
                    act_tree = 
                    (Object)adaptor.create(act)
                    ;
                    adaptor.addChild(root_0, act_tree);


                     retval.action = new Action((act!=null?act.getText():null)); 

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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:57:1: personality returns [Personality personality] : IDENT '=' VALUE ;
    public final SAFParser.personality_return personality() throws RecognitionException {
        SAFParser.personality_return retval = new SAFParser.personality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT15=null;
        Token char_literal16=null;
        Token VALUE17=null;

        Object IDENT15_tree=null;
        Object char_literal16_tree=null;
        Object VALUE17_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:58:2: ( IDENT '=' VALUE )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:58:4: IDENT '=' VALUE
            {
            root_0 = (Object)adaptor.nil();


            IDENT15=(Token)match(input,IDENT,FOLLOW_IDENT_in_personality263); 
            IDENT15_tree = 
            (Object)adaptor.create(IDENT15)
            ;
            adaptor.addChild(root_0, IDENT15_tree);


            char_literal16=(Token)match(input,10,FOLLOW_10_in_personality265); 
            char_literal16_tree = 
            (Object)adaptor.create(char_literal16)
            ;
            adaptor.addChild(root_0, char_literal16_tree);


            VALUE17=(Token)match(input,VALUE,FOLLOW_VALUE_in_personality267); 
            VALUE17_tree = 
            (Object)adaptor.create(VALUE17)
            ;
            adaptor.addChild(root_0, VALUE17_tree);



            			retval.personality = new Personality((IDENT15!=null?IDENT15.getText():null),Integer.parseInt((VALUE17!=null?VALUE17.getText():null))); 
            		

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


 

    public static final BitSet FOLLOW_IDENT_in_fighter70 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_fighter72 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_personality_in_fighter80 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_behaviour_in_fighter88 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_fighter97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour123 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviour132 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour136 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour140 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviour142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition172 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_condition174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_condition178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition188 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_condition190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_condition194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_action216 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action226 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_personality263 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_personality265 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_VALUE_in_personality267 = new BitSet(new long[]{0x0000000000000002L});

}