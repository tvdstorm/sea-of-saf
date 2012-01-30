// $ANTLR 3.4 /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g 2012-01-30 17:29:53

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHOOSE", "IDENT", "VALUE", "WHITESPACE", "'('", "')'", "'='", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


            char_literal2=(Token)match(input,13,FOLLOW_13_in_fighter74); 
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

                    if ( (LA1_2==10) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==11) ) {
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


            char_literal5=(Token)match(input,14,FOLLOW_14_in_fighter99); 
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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:34:1: behaviour returns [Behaviour behaviour] : IDENT '[' a1= action a2= action ']' ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT6=null;
        Token char_literal7=null;
        Token char_literal8=null;
        SAFParser.action_return a1 =null;

        SAFParser.action_return a2 =null;


        Object IDENT6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal8_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:35:2: ( IDENT '[' a1= action a2= action ']' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:35:4: IDENT '[' a1= action a2= action ']'
            {
            root_0 = (Object)adaptor.nil();


            IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_behaviour118); 
            IDENT6_tree = 
            (Object)adaptor.create(IDENT6)
            ;
            adaptor.addChild(root_0, IDENT6_tree);


            char_literal7=(Token)match(input,11,FOLLOW_11_in_behaviour120); 
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);


            pushFollow(FOLLOW_action_in_behaviour124);
            a1=action();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());

            pushFollow(FOLLOW_action_in_behaviour128);
            a2=action();

            state._fsp--;

            adaptor.addChild(root_0, a2.getTree());

            char_literal8=(Token)match(input,12,FOLLOW_12_in_behaviour130); 
            char_literal8_tree = 
            (Object)adaptor.create(char_literal8)
            ;
            adaptor.addChild(root_0, char_literal8_tree);



            			retval.behaviour = new Behaviour((IDENT6!=null?IDENT6.getText():null)); 
            		

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


    public static class action_return extends ParserRuleReturnScope {
        public Action action;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:41:1: action returns [Action action] : ( CHOOSE '(' a1= IDENT a2= IDENT ')' |act= IDENT ) ;
    public final SAFParser.action_return action() throws RecognitionException {
        SAFParser.action_return retval = new SAFParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a1=null;
        Token a2=null;
        Token act=null;
        Token CHOOSE9=null;
        Token char_literal10=null;
        Token char_literal11=null;

        Object a1_tree=null;
        Object a2_tree=null;
        Object act_tree=null;
        Object CHOOSE9_tree=null;
        Object char_literal10_tree=null;
        Object char_literal11_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:42:2: ( ( CHOOSE '(' a1= IDENT a2= IDENT ')' |act= IDENT ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:42:4: ( CHOOSE '(' a1= IDENT a2= IDENT ')' |act= IDENT )
            {
            root_0 = (Object)adaptor.nil();


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:42:4: ( CHOOSE '(' a1= IDENT a2= IDENT ')' |act= IDENT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CHOOSE) ) {
                alt2=1;
            }
            else if ( (LA2_0==IDENT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:43:3: CHOOSE '(' a1= IDENT a2= IDENT ')'
                    {
                    CHOOSE9=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_action153); 
                    CHOOSE9_tree = 
                    (Object)adaptor.create(CHOOSE9)
                    ;
                    adaptor.addChild(root_0, CHOOSE9_tree);


                    char_literal10=(Token)match(input,8,FOLLOW_8_in_action155); 
                    char_literal10_tree = 
                    (Object)adaptor.create(char_literal10)
                    ;
                    adaptor.addChild(root_0, char_literal10_tree);


                    a1=(Token)match(input,IDENT,FOLLOW_IDENT_in_action159); 
                    a1_tree = 
                    (Object)adaptor.create(a1)
                    ;
                    adaptor.addChild(root_0, a1_tree);


                    a2=(Token)match(input,IDENT,FOLLOW_IDENT_in_action163); 
                    a2_tree = 
                    (Object)adaptor.create(a2)
                    ;
                    adaptor.addChild(root_0, a2_tree);


                    char_literal11=(Token)match(input,9,FOLLOW_9_in_action165); 
                    char_literal11_tree = 
                    (Object)adaptor.create(char_literal11)
                    ;
                    adaptor.addChild(root_0, char_literal11_tree);


                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:44:5: act= IDENT
                    {
                    act=(Token)match(input,IDENT,FOLLOW_IDENT_in_action174); 
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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:49:1: personality returns [Personality personality] : IDENT '=' VALUE ;
    public final SAFParser.personality_return personality() throws RecognitionException {
        SAFParser.personality_return retval = new SAFParser.personality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT12=null;
        Token char_literal13=null;
        Token VALUE14=null;

        Object IDENT12_tree=null;
        Object char_literal13_tree=null;
        Object VALUE14_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:50:2: ( IDENT '=' VALUE )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:50:4: IDENT '=' VALUE
            {
            root_0 = (Object)adaptor.nil();


            IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_personality197); 
            IDENT12_tree = 
            (Object)adaptor.create(IDENT12)
            ;
            adaptor.addChild(root_0, IDENT12_tree);


            char_literal13=(Token)match(input,10,FOLLOW_10_in_personality199); 
            char_literal13_tree = 
            (Object)adaptor.create(char_literal13)
            ;
            adaptor.addChild(root_0, char_literal13_tree);


            VALUE14=(Token)match(input,VALUE,FOLLOW_VALUE_in_personality201); 
            VALUE14_tree = 
            (Object)adaptor.create(VALUE14)
            ;
            adaptor.addChild(root_0, VALUE14_tree);



            			retval.personality = new Personality((IDENT12!=null?IDENT12.getText():null),Integer.parseInt((VALUE14!=null?VALUE14.getText():null))); 
            		

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


 

    public static final BitSet FOLLOW_IDENT_in_fighter72 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_fighter74 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_personality_in_fighter82 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_behaviour_in_fighter90 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_fighter99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behaviour118 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviour120 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour124 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour128 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviour130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_action153 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action163 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_personality197 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_personality199 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_VALUE_in_personality201 = new BitSet(new long[]{0x0000000000000002L});

}