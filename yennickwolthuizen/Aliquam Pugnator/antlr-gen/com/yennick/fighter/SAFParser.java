// $ANTLR 3.4 /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g 2013-05-17 15:15:11

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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:22:1: fighter returns [Bot fighter] : IDENT ( '{' )? ( personality | behaviour )* ( '}' )? ;
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:23:2: ( IDENT ( '{' )? ( personality | behaviour )* ( '}' )? )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:23:4: IDENT ( '{' )? ( personality | behaviour )* ( '}' )?
            {
            root_0 = (Object)adaptor.nil();


            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter70); 
            IDENT1_tree = 
            (Object)adaptor.create(IDENT1)
            ;
            adaptor.addChild(root_0, IDENT1_tree);


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:23:10: ( '{' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:23:10: '{'
                    {
                    char_literal2=(Token)match(input,15,FOLLOW_15_in_fighter72); 
                    char_literal2_tree = 
                    (Object)adaptor.create(char_literal2)
                    ;
                    adaptor.addChild(root_0, char_literal2_tree);


                    }
                    break;

            }


             retval.fighter = new Bot((IDENT1!=null?IDENT1.getText():null)); 


            			System.out.println( retval.fighter.toString()); 
            		

            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:27:4: ( personality | behaviour )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==10) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==IDENT||LA2_2==11||(LA2_2 >= 13 && LA2_2 <= 14)) ) {
                        alt2=2;
                    }


                }
                else if ( (LA2_0==11) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:27:5: personality
            	    {
            	    pushFollow(FOLLOW_personality_in_fighter85);
            	    personality3=personality();

            	    state._fsp--;

            	    adaptor.addChild(root_0, personality3.getTree());

            	    retval.fighter.addPersonality((personality3!=null?personality3.personality:null));

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:28:5: behaviour
            	    {
            	    pushFollow(FOLLOW_behaviour_in_fighter93);
            	    behaviour4=behaviour();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviour4.getTree());

            	    retval.fighter.addBehaviour((behaviour4!=null?behaviour4.behaviour:null));

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:29:3: ( '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:29:3: '}'
                    {
                    char_literal5=(Token)match(input,16,FOLLOW_16_in_fighter102); 
                    char_literal5_tree = 
                    (Object)adaptor.create(char_literal5)
                    ;
                    adaptor.addChild(root_0, char_literal5_tree);


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

            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:35:3: ( condition )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:35:4: condition
            {
            pushFollow(FOLLOW_condition_in_behaviour127);
            condition6=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition6.getTree());

            retval.behaviour.addCondition((condition6!=null?condition6.condition:null));

            }


            char_literal7=(Token)match(input,11,FOLLOW_11_in_behaviour136); 
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);


            pushFollow(FOLLOW_action_in_behaviour140);
            a1=action();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());

            pushFollow(FOLLOW_action_in_behaviour144);
            a2=action();

            state._fsp--;

            adaptor.addChild(root_0, a2.getTree());

            char_literal8=(Token)match(input,12,FOLLOW_12_in_behaviour146); 
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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:39:1: condition returns [Condition condition] : (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )* ;
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token first=null;
        Token second=null;
        Token string_literal9=null;
        Token string_literal10=null;

        Object first_tree=null;
        Object second_tree=null;
        Object string_literal9_tree=null;
        Object string_literal10_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:40:2: ( (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )* )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:40:4: (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )*
            {
            root_0 = (Object)adaptor.nil();


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:40:4: (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )*
            loop4:
            do {
                int alt4=4;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IDENT) ) {
                    switch ( input.LA(2) ) {
                    case 14:
                        {
                        alt4=2;
                        }
                        break;
                    case 13:
                        {
                        alt4=3;
                        }
                        break;
                    case IDENT:
                    case 11:
                        {
                        alt4=1;
                        }
                        break;

                    }

                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:40:5: first= IDENT
            	    {
            	    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition168); 
            	    first_tree = 
            	    (Object)adaptor.create(first)
            	    ;
            	    adaptor.addChild(root_0, first_tree);


            	     retval.condition = new Condition((first!=null?first.getText():null)); 

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:41:2: first= IDENT 'or' second= IDENT
            	    {
            	    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition178); 
            	    first_tree = 
            	    (Object)adaptor.create(first)
            	    ;
            	    adaptor.addChild(root_0, first_tree);


            	    string_literal9=(Token)match(input,14,FOLLOW_14_in_condition180); 
            	    string_literal9_tree = 
            	    (Object)adaptor.create(string_literal9)
            	    ;
            	    adaptor.addChild(root_0, string_literal9_tree);


            	    second=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition184); 
            	    second_tree = 
            	    (Object)adaptor.create(second)
            	    ;
            	    adaptor.addChild(root_0, second_tree);


            	     retval.condition = new Condition((first!=null?first.getText():null),(second!=null?second.getText():null),"or"); 

            	    }
            	    break;
            	case 3 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:42:2: first= IDENT 'and' second= IDENT
            	    {
            	    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition194); 
            	    first_tree = 
            	    (Object)adaptor.create(first)
            	    ;
            	    adaptor.addChild(root_0, first_tree);


            	    string_literal10=(Token)match(input,13,FOLLOW_13_in_condition196); 
            	    string_literal10_tree = 
            	    (Object)adaptor.create(string_literal10)
            	    ;
            	    adaptor.addChild(root_0, string_literal10_tree);


            	    second=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition200); 
            	    second_tree = 
            	    (Object)adaptor.create(second)
            	    ;
            	    adaptor.addChild(root_0, second_tree);


            	     retval.condition = new Condition((first!=null?first.getText():null),(second!=null?second.getText():null),"and"); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);



            			System.out.println(retval.condition.toString()); 
            		

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
        Token string_literal11=null;
        Token char_literal12=null;
        Token char_literal13=null;

        Object a1_tree=null;
        Object a2_tree=null;
        Object act_tree=null;
        Object string_literal11_tree=null;
        Object char_literal12_tree=null;
        Object char_literal13_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:50:2: ( ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:50:4: ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT )
            {
            root_0 = (Object)adaptor.nil();


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:50:4: ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CHOOSE) ) {
                alt5=1;
            }
            else if ( (LA5_0==IDENT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:51:3: 'choose' '(' a1= IDENT a2= IDENT ')'
                    {
                    string_literal11=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_action231); 
                    string_literal11_tree = 
                    (Object)adaptor.create(string_literal11)
                    ;
                    adaptor.addChild(root_0, string_literal11_tree);


                    char_literal12=(Token)match(input,8,FOLLOW_8_in_action233); 
                    char_literal12_tree = 
                    (Object)adaptor.create(char_literal12)
                    ;
                    adaptor.addChild(root_0, char_literal12_tree);


                    a1=(Token)match(input,IDENT,FOLLOW_IDENT_in_action237); 
                    a1_tree = 
                    (Object)adaptor.create(a1)
                    ;
                    adaptor.addChild(root_0, a1_tree);


                    a2=(Token)match(input,IDENT,FOLLOW_IDENT_in_action241); 
                    a2_tree = 
                    (Object)adaptor.create(a2)
                    ;
                    adaptor.addChild(root_0, a2_tree);


                    char_literal13=(Token)match(input,9,FOLLOW_9_in_action243); 
                    char_literal13_tree = 
                    (Object)adaptor.create(char_literal13)
                    ;
                    adaptor.addChild(root_0, char_literal13_tree);


                     retval.action = new Action((a1!=null?a1.getText():null), (a2!=null?a2.getText():null),true); 

                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:52:5: act= IDENT
                    {
                    act=(Token)match(input,IDENT,FOLLOW_IDENT_in_action253); 
                    act_tree = 
                    (Object)adaptor.create(act)
                    ;
                    adaptor.addChild(root_0, act_tree);


                     retval.action = new Action((act!=null?act.getText():null)); 

                    }
                    break;

            }



            			System.out.println( "   " + retval.action.toString()); 
            		

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

        Token IDENT14=null;
        Token char_literal15=null;
        Token VALUE16=null;

        Object IDENT14_tree=null;
        Object char_literal15_tree=null;
        Object VALUE16_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:61:2: ( IDENT '=' VALUE )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:61:4: IDENT '=' VALUE
            {
            root_0 = (Object)adaptor.nil();


            IDENT14=(Token)match(input,IDENT,FOLLOW_IDENT_in_personality281); 
            IDENT14_tree = 
            (Object)adaptor.create(IDENT14)
            ;
            adaptor.addChild(root_0, IDENT14_tree);


            char_literal15=(Token)match(input,10,FOLLOW_10_in_personality283); 
            char_literal15_tree = 
            (Object)adaptor.create(char_literal15)
            ;
            adaptor.addChild(root_0, char_literal15_tree);


            VALUE16=(Token)match(input,VALUE,FOLLOW_VALUE_in_personality285); 
            VALUE16_tree = 
            (Object)adaptor.create(VALUE16)
            ;
            adaptor.addChild(root_0, VALUE16_tree);



            			retval.personality = new Personality((IDENT14!=null?IDENT14.getText():null),Integer.parseInt((VALUE16!=null?VALUE16.getText():null))); 
            		


            			System.out.println( retval.personality.toString()); 
            		

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


 

    public static final BitSet FOLLOW_IDENT_in_fighter70 = new BitSet(new long[]{0x0000000000018822L});
    public static final BitSet FOLLOW_15_in_fighter72 = new BitSet(new long[]{0x0000000000010822L});
    public static final BitSet FOLLOW_personality_in_fighter85 = new BitSet(new long[]{0x0000000000010822L});
    public static final BitSet FOLLOW_behaviour_in_fighter93 = new BitSet(new long[]{0x0000000000010822L});
    public static final BitSet FOLLOW_16_in_fighter102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour127 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviour136 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour140 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour144 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviour146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition168 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENT_in_condition178 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_condition180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_condition184 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENT_in_condition194 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_condition196 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_condition200 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_CHOOSE_in_action231 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action237 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action241 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_personality281 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_personality283 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_VALUE_in_personality285 = new BitSet(new long[]{0x0000000000000002L});

}