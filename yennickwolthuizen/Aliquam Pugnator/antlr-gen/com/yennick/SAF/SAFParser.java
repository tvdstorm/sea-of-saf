// $ANTLR 3.4 /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g 2012-01-23 14:52:17

  package com.yennick.SAF;


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
    public String getGrammarFileName() { return "/Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:21:1: fighter : IDENT '{' ( personality | behaviour )* '}' ;
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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:22:2: ( IDENT '{' ( personality | behaviour )* '}' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:22:4: IDENT '{' ( personality | behaviour )* '}'
            {
            root_0 = (Object)adaptor.nil();


            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter66); 
            IDENT1_tree = 
            (Object)adaptor.create(IDENT1)
            ;
            adaptor.addChild(root_0, IDENT1_tree);


            char_literal2=(Token)match(input,13,FOLLOW_13_in_fighter68); 
            char_literal2_tree = 
            (Object)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:23:4: ( personality | behaviour )*
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
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:23:5: personality
            	    {
            	    pushFollow(FOLLOW_personality_in_fighter74);
            	    personality3=personality();

            	    state._fsp--;

            	    adaptor.addChild(root_0, personality3.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:23:17: behaviour
            	    {
            	    pushFollow(FOLLOW_behaviour_in_fighter76);
            	    behaviour4=behaviour();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviour4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            char_literal5=(Token)match(input,14,FOLLOW_14_in_fighter82); 
            char_literal5_tree = 
            (Object)adaptor.create(char_literal5)
            ;
            adaptor.addChild(root_0, char_literal5_tree);


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
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:27:1: behaviour : IDENT '[' action action ']' ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT6=null;
        Token char_literal7=null;
        Token char_literal10=null;
        SAFParser.action_return action8 =null;

        SAFParser.action_return action9 =null;


        Object IDENT6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal10_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:28:2: ( IDENT '[' action action ']' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:28:4: IDENT '[' action action ']'
            {
            root_0 = (Object)adaptor.nil();


            IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_behaviour93); 
            IDENT6_tree = 
            (Object)adaptor.create(IDENT6)
            ;
            adaptor.addChild(root_0, IDENT6_tree);


            char_literal7=(Token)match(input,11,FOLLOW_11_in_behaviour95); 
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);


            pushFollow(FOLLOW_action_in_behaviour97);
            action8=action();

            state._fsp--;

            adaptor.addChild(root_0, action8.getTree());

            pushFollow(FOLLOW_action_in_behaviour99);
            action9=action();

            state._fsp--;

            adaptor.addChild(root_0, action9.getTree());

            char_literal10=(Token)match(input,12,FOLLOW_12_in_behaviour101); 
            char_literal10_tree = 
            (Object)adaptor.create(char_literal10)
            ;
            adaptor.addChild(root_0, char_literal10_tree);


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
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:31:1: action : ( CHOOSE '(' IDENT IDENT ')' | IDENT );
    public final SAFParser.action_return action() throws RecognitionException {
        SAFParser.action_return retval = new SAFParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE11=null;
        Token char_literal12=null;
        Token IDENT13=null;
        Token IDENT14=null;
        Token char_literal15=null;
        Token IDENT16=null;

        Object CHOOSE11_tree=null;
        Object char_literal12_tree=null;
        Object IDENT13_tree=null;
        Object IDENT14_tree=null;
        Object char_literal15_tree=null;
        Object IDENT16_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:32:2: ( CHOOSE '(' IDENT IDENT ')' | IDENT )
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
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:32:4: CHOOSE '(' IDENT IDENT ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    CHOOSE11=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_action114); 
                    CHOOSE11_tree = 
                    (Object)adaptor.create(CHOOSE11)
                    ;
                    adaptor.addChild(root_0, CHOOSE11_tree);


                    char_literal12=(Token)match(input,8,FOLLOW_8_in_action116); 
                    char_literal12_tree = 
                    (Object)adaptor.create(char_literal12)
                    ;
                    adaptor.addChild(root_0, char_literal12_tree);


                    IDENT13=(Token)match(input,IDENT,FOLLOW_IDENT_in_action118); 
                    IDENT13_tree = 
                    (Object)adaptor.create(IDENT13)
                    ;
                    adaptor.addChild(root_0, IDENT13_tree);


                    IDENT14=(Token)match(input,IDENT,FOLLOW_IDENT_in_action120); 
                    IDENT14_tree = 
                    (Object)adaptor.create(IDENT14)
                    ;
                    adaptor.addChild(root_0, IDENT14_tree);


                    char_literal15=(Token)match(input,9,FOLLOW_9_in_action122); 
                    char_literal15_tree = 
                    (Object)adaptor.create(char_literal15)
                    ;
                    adaptor.addChild(root_0, char_literal15_tree);


                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:32:33: IDENT
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENT16=(Token)match(input,IDENT,FOLLOW_IDENT_in_action126); 
                    IDENT16_tree = 
                    (Object)adaptor.create(IDENT16)
                    ;
                    adaptor.addChild(root_0, IDENT16_tree);


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
    // $ANTLR end "action"


    public static class personality_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:36:1: personality : IDENT '=' VALUE ;
    public final SAFParser.personality_return personality() throws RecognitionException {
        SAFParser.personality_return retval = new SAFParser.personality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT17=null;
        Token char_literal18=null;
        Token VALUE19=null;

        Object IDENT17_tree=null;
        Object char_literal18_tree=null;
        Object VALUE19_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:37:2: ( IDENT '=' VALUE )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:37:4: IDENT '=' VALUE
            {
            root_0 = (Object)adaptor.nil();


            IDENT17=(Token)match(input,IDENT,FOLLOW_IDENT_in_personality140); 
            IDENT17_tree = 
            (Object)adaptor.create(IDENT17)
            ;
            adaptor.addChild(root_0, IDENT17_tree);


            char_literal18=(Token)match(input,10,FOLLOW_10_in_personality142); 
            char_literal18_tree = 
            (Object)adaptor.create(char_literal18)
            ;
            adaptor.addChild(root_0, char_literal18_tree);


            VALUE19=(Token)match(input,VALUE,FOLLOW_VALUE_in_personality144); 
            VALUE19_tree = 
            (Object)adaptor.create(VALUE19)
            ;
            adaptor.addChild(root_0, VALUE19_tree);


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


 

    public static final BitSet FOLLOW_IDENT_in_fighter66 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_fighter68 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_personality_in_fighter74 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_behaviour_in_fighter76 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_fighter82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behaviour93 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviour95 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour97 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour99 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviour101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_action114 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action120 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_personality140 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_personality142 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_VALUE_in_personality144 = new BitSet(new long[]{0x0000000000000002L});

}