// $ANTLR 3.4 /Users/job/Programming/svn-sc/SAFparser.g 2012-01-22 23:01:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFparser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "ID", "LEFT_BRACE", "LEFT_BRACKET", "NEWLINE", "NUMBER", "PERSONALITY_TYPE", "RIGHT_BRACE", "RIGHT_BRACKET", "WHITESPACE", "BEHAVIOUR", "PERSONALITY", "'test'"
    };

    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int ID=5;
    public static final int LEFT_BRACE=6;
    public static final int LEFT_BRACKET=7;
    public static final int NEWLINE=8;
    public static final int NUMBER=9;
    public static final int PERSONALITY_TYPE=10;
    public static final int RIGHT_BRACE=11;
    public static final int RIGHT_BRACKET=12;
    public static final int WHITESPACE=13;
    public static final int T__16=16;
    public static final int BEHAVIOUR=14;
    public static final int PERSONALITY=15;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SAFparser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SAFparser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SAFparser.tokenNames; }
    public String getGrammarFileName() { return "/Users/job/Programming/svn-sc/SAFparser.g"; }


    public static class file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "file"
    // /Users/job/Programming/svn-sc/SAFparser.g:14:1: file : ( fighter )+ ;
    public final SAFparser.file_return file() throws RecognitionException {
        SAFparser.file_return retval = new SAFparser.file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFparser.fighter_return fighter1 =null;



        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:14:6: ( ( fighter )+ )
            // /Users/job/Programming/svn-sc/SAFparser.g:14:8: ( fighter )+
            {
            root_0 = (Object)adaptor.nil();


            // /Users/job/Programming/svn-sc/SAFparser.g:14:8: ( fighter )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/job/Programming/svn-sc/SAFparser.g:14:9: fighter
            	    {
            	    pushFollow(FOLLOW_fighter_in_file49);
            	    fighter1=fighter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fighter1.getTree());

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
    // $ANTLR end "file"


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Users/job/Programming/svn-sc/SAFparser.g:16:1: fighter : ( ID ^ LEFT_BRACE ( WHITESPACE )* ( property ( WHITESPACE )* )+ RIGHT_BRACE ) ;
    public final SAFparser.fighter_return fighter() throws RecognitionException {
        SAFparser.fighter_return retval = new SAFparser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID2=null;
        Token LEFT_BRACE3=null;
        Token WHITESPACE4=null;
        Token WHITESPACE6=null;
        Token RIGHT_BRACE7=null;
        SAFparser.property_return property5 =null;


        Object ID2_tree=null;
        Object LEFT_BRACE3_tree=null;
        Object WHITESPACE4_tree=null;
        Object WHITESPACE6_tree=null;
        Object RIGHT_BRACE7_tree=null;

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:17:2: ( ( ID ^ LEFT_BRACE ( WHITESPACE )* ( property ( WHITESPACE )* )+ RIGHT_BRACE ) )
            // /Users/job/Programming/svn-sc/SAFparser.g:17:4: ( ID ^ LEFT_BRACE ( WHITESPACE )* ( property ( WHITESPACE )* )+ RIGHT_BRACE )
            {
            root_0 = (Object)adaptor.nil();


            // /Users/job/Programming/svn-sc/SAFparser.g:17:4: ( ID ^ LEFT_BRACE ( WHITESPACE )* ( property ( WHITESPACE )* )+ RIGHT_BRACE )
            // /Users/job/Programming/svn-sc/SAFparser.g:18:3: ID ^ LEFT_BRACE ( WHITESPACE )* ( property ( WHITESPACE )* )+ RIGHT_BRACE
            {
            ID2=(Token)match(input,ID,FOLLOW_ID_in_fighter65); 
            ID2_tree = 
            (Object)adaptor.create(ID2)
            ;
            root_0 = (Object)adaptor.becomeRoot(ID2_tree, root_0);


            LEFT_BRACE3=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_fighter70); 
            LEFT_BRACE3_tree = 
            (Object)adaptor.create(LEFT_BRACE3)
            ;
            adaptor.addChild(root_0, LEFT_BRACE3_tree);


            // /Users/job/Programming/svn-sc/SAFparser.g:20:3: ( WHITESPACE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==WHITESPACE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/job/Programming/svn-sc/SAFparser.g:20:3: WHITESPACE
            	    {
            	    WHITESPACE4=(Token)match(input,WHITESPACE,FOLLOW_WHITESPACE_in_fighter74); 
            	    WHITESPACE4_tree = 
            	    (Object)adaptor.create(WHITESPACE4)
            	    ;
            	    adaptor.addChild(root_0, WHITESPACE4_tree);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // /Users/job/Programming/svn-sc/SAFparser.g:21:3: ( property ( WHITESPACE )* )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==PERSONALITY_TYPE||LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/job/Programming/svn-sc/SAFparser.g:21:4: property ( WHITESPACE )*
            	    {
            	    pushFollow(FOLLOW_property_in_fighter80);
            	    property5=property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property5.getTree());

            	    // /Users/job/Programming/svn-sc/SAFparser.g:21:13: ( WHITESPACE )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==WHITESPACE) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // /Users/job/Programming/svn-sc/SAFparser.g:21:13: WHITESPACE
            	    	    {
            	    	    WHITESPACE6=(Token)match(input,WHITESPACE,FOLLOW_WHITESPACE_in_fighter82); 
            	    	    WHITESPACE6_tree = 
            	    	    (Object)adaptor.create(WHITESPACE6)
            	    	    ;
            	    	    adaptor.addChild(root_0, WHITESPACE6_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


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


            RIGHT_BRACE7=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_fighter89); 
            RIGHT_BRACE7_tree = 
            (Object)adaptor.create(RIGHT_BRACE7)
            ;
            adaptor.addChild(root_0, RIGHT_BRACE7_tree);


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


    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property"
    // /Users/job/Programming/svn-sc/SAFparser.g:25:1: property : ( personality | behaviour );
    public final SAFparser.property_return property() throws RecognitionException {
        SAFparser.property_return retval = new SAFparser.property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFparser.personality_return personality8 =null;

        SAFparser.behaviour_return behaviour9 =null;



        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:25:9: ( personality | behaviour )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==PERSONALITY_TYPE) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFparser.g:25:11: personality
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_personality_in_property101);
                    personality8=personality();

                    state._fsp--;

                    adaptor.addChild(root_0, personality8.getTree());

                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFparser.g:25:25: behaviour
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_behaviour_in_property105);
                    behaviour9=behaviour();

                    state._fsp--;

                    adaptor.addChild(root_0, behaviour9.getTree());

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
    // $ANTLR end "property"


    public static class personality_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // /Users/job/Programming/svn-sc/SAFparser.g:27:1: personality : PERSONALITY_TYPE ( WHITESPACE )? ASSIGN ^ ( WHITESPACE )? NUMBER ;
    public final SAFparser.personality_return personality() throws RecognitionException {
        SAFparser.personality_return retval = new SAFparser.personality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERSONALITY_TYPE10=null;
        Token WHITESPACE11=null;
        Token ASSIGN12=null;
        Token WHITESPACE13=null;
        Token NUMBER14=null;

        Object PERSONALITY_TYPE10_tree=null;
        Object WHITESPACE11_tree=null;
        Object ASSIGN12_tree=null;
        Object WHITESPACE13_tree=null;
        Object NUMBER14_tree=null;

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:28:2: ( PERSONALITY_TYPE ( WHITESPACE )? ASSIGN ^ ( WHITESPACE )? NUMBER )
            // /Users/job/Programming/svn-sc/SAFparser.g:28:4: PERSONALITY_TYPE ( WHITESPACE )? ASSIGN ^ ( WHITESPACE )? NUMBER
            {
            root_0 = (Object)adaptor.nil();


            PERSONALITY_TYPE10=(Token)match(input,PERSONALITY_TYPE,FOLLOW_PERSONALITY_TYPE_in_personality114); 
            PERSONALITY_TYPE10_tree = 
            (Object)adaptor.create(PERSONALITY_TYPE10)
            ;
            adaptor.addChild(root_0, PERSONALITY_TYPE10_tree);


            // /Users/job/Programming/svn-sc/SAFparser.g:28:21: ( WHITESPACE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WHITESPACE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFparser.g:28:21: WHITESPACE
                    {
                    WHITESPACE11=(Token)match(input,WHITESPACE,FOLLOW_WHITESPACE_in_personality116); 
                    WHITESPACE11_tree = 
                    (Object)adaptor.create(WHITESPACE11)
                    ;
                    adaptor.addChild(root_0, WHITESPACE11_tree);


                    }
                    break;

            }


            ASSIGN12=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_personality119); 
            ASSIGN12_tree = 
            (Object)adaptor.create(ASSIGN12)
            ;
            root_0 = (Object)adaptor.becomeRoot(ASSIGN12_tree, root_0);


            // /Users/job/Programming/svn-sc/SAFparser.g:28:41: ( WHITESPACE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WHITESPACE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFparser.g:28:41: WHITESPACE
                    {
                    WHITESPACE13=(Token)match(input,WHITESPACE,FOLLOW_WHITESPACE_in_personality122); 
                    WHITESPACE13_tree = 
                    (Object)adaptor.create(WHITESPACE13)
                    ;
                    adaptor.addChild(root_0, WHITESPACE13_tree);


                    }
                    break;

            }


            NUMBER14=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_personality128); 
            NUMBER14_tree = 
            (Object)adaptor.create(NUMBER14)
            ;
            adaptor.addChild(root_0, NUMBER14_tree);


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


    public static class behaviour_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // /Users/job/Programming/svn-sc/SAFparser.g:32:1: behaviour : 'test' ;
    public final SAFparser.behaviour_return behaviour() throws RecognitionException {
        SAFparser.behaviour_return retval = new SAFparser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal15=null;

        Object string_literal15_tree=null;

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:32:11: ( 'test' )
            // /Users/job/Programming/svn-sc/SAFparser.g:32:13: 'test'
            {
            root_0 = (Object)adaptor.nil();


            string_literal15=(Token)match(input,16,FOLLOW_16_in_behaviour139); 
            string_literal15_tree = 
            (Object)adaptor.create(string_literal15)
            ;
            adaptor.addChild(root_0, string_literal15_tree);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_fighter_in_file49 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_fighter65 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_fighter70 = new BitSet(new long[]{0x0000000000012400L});
    public static final BitSet FOLLOW_WHITESPACE_in_fighter74 = new BitSet(new long[]{0x0000000000012400L});
    public static final BitSet FOLLOW_property_in_fighter80 = new BitSet(new long[]{0x0000000000012C00L});
    public static final BitSet FOLLOW_WHITESPACE_in_fighter82 = new BitSet(new long[]{0x0000000000012C00L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_fighter89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personality_in_property101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_property105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERSONALITY_TYPE_in_personality114 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_WHITESPACE_in_personality116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_personality119 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_WHITESPACE_in_personality122 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_personality128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_behaviour139 = new BitSet(new long[]{0x0000000000000002L});

}