// $ANTLR 3.4 /Users/job/Programming/svn-sc/SAFparser.g 2012-01-22 23:54:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFparser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "ATTACK", "CONDITION", "ID", "LEFT_BRACE", "LEFT_BRACKET", "MOVE", "NEWLINE", "NUMBER", "RIGHT_BRACE", "RIGHT_BRACKET", "STRENGTH", "WHITESPACE", "BEHAVIOUR", "PERSONALITY"
    };

    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int ATTACK=5;
    public static final int CONDITION=6;
    public static final int ID=7;
    public static final int LEFT_BRACE=8;
    public static final int LEFT_BRACKET=9;
    public static final int MOVE=10;
    public static final int NEWLINE=11;
    public static final int NUMBER=12;
    public static final int RIGHT_BRACE=13;
    public static final int RIGHT_BRACKET=14;
    public static final int STRENGTH=15;
    public static final int WHITESPACE=16;
    public static final int BEHAVIOUR=17;
    public static final int PERSONALITY=18;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "fighter", "property", "file", "characteristic", "behaviour"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public SAFparser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public SAFparser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public SAFparser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


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
    // /Users/job/Programming/svn-sc/SAFparser.g:13:1: file : ( fighter )+ ;
    public final SAFparser.file_return file() throws RecognitionException {
        SAFparser.file_return retval = new SAFparser.file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFparser.fighter_return fighter1 =null;



        try { dbg.enterRule(getGrammarFileName(), "file");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:13:8: ( ( fighter )+ )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFparser.g:13:10: ( fighter )+
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(13,10);
            // /Users/job/Programming/svn-sc/SAFparser.g:13:10: ( fighter )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/job/Programming/svn-sc/SAFparser.g:13:10: fighter
            	    {
            	    dbg.location(13,10);
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
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


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
        dbg.location(13, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "file");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "file"


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Users/job/Programming/svn-sc/SAFparser.g:15:1: fighter : ID ^ LEFT_BRACE ! ( property )+ RIGHT_BRACE !;
    public final SAFparser.fighter_return fighter() throws RecognitionException {
        SAFparser.fighter_return retval = new SAFparser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID2=null;
        Token LEFT_BRACE3=null;
        Token RIGHT_BRACE5=null;
        SAFparser.property_return property4 =null;


        Object ID2_tree=null;
        Object LEFT_BRACE3_tree=null;
        Object RIGHT_BRACE5_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fighter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:15:11: ( ID ^ LEFT_BRACE ! ( property )+ RIGHT_BRACE !)
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFparser.g:15:14: ID ^ LEFT_BRACE ! ( property )+ RIGHT_BRACE !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(15,16);
            ID2=(Token)match(input,ID,FOLLOW_ID_in_fighter61); 
            ID2_tree = 
            (Object)adaptor.create(ID2)
            ;
            root_0 = (Object)adaptor.becomeRoot(ID2_tree, root_0);

            dbg.location(15,28);
            LEFT_BRACE3=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_fighter64); 
            dbg.location(15,30);
            // /Users/job/Programming/svn-sc/SAFparser.g:15:30: ( property )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==CONDITION||LA2_0==STRENGTH) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/job/Programming/svn-sc/SAFparser.g:15:30: property
            	    {
            	    dbg.location(15,30);
            	    pushFollow(FOLLOW_property_in_fighter67);
            	    property4=property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property4.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(15,51);
            RIGHT_BRACE5=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_fighter70); 

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
        dbg.location(15, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fighter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fighter"


    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property"
    // /Users/job/Programming/svn-sc/SAFparser.g:17:1: property : ( characteristic | behaviour );
    public final SAFparser.property_return property() throws RecognitionException {
        SAFparser.property_return retval = new SAFparser.property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFparser.characteristic_return characteristic6 =null;

        SAFparser.behaviour_return behaviour7 =null;



        try { dbg.enterRule(getGrammarFileName(), "property");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:17:11: ( characteristic | behaviour )
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==STRENGTH) ) {
                alt3=1;
            }
            else if ( (LA3_0==CONDITION) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/job/Programming/svn-sc/SAFparser.g:17:13: characteristic
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(17,13);
                    pushFollow(FOLLOW_characteristic_in_property80);
                    characteristic6=characteristic();

                    state._fsp--;

                    adaptor.addChild(root_0, characteristic6.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/job/Programming/svn-sc/SAFparser.g:17:30: behaviour
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(17,30);
                    pushFollow(FOLLOW_behaviour_in_property84);
                    behaviour7=behaviour();

                    state._fsp--;

                    adaptor.addChild(root_0, behaviour7.getTree());

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
        dbg.location(17, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "property");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "property"


    public static class characteristic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // /Users/job/Programming/svn-sc/SAFparser.g:19:1: characteristic : STRENGTH ^ ASSIGN ! NUMBER ;
    public final SAFparser.characteristic_return characteristic() throws RecognitionException {
        SAFparser.characteristic_return retval = new SAFparser.characteristic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRENGTH8=null;
        Token ASSIGN9=null;
        Token NUMBER10=null;

        Object STRENGTH8_tree=null;
        Object ASSIGN9_tree=null;
        Object NUMBER10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "characteristic");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:19:16: ( STRENGTH ^ ASSIGN ! NUMBER )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFparser.g:19:18: STRENGTH ^ ASSIGN ! NUMBER
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(19,26);
            STRENGTH8=(Token)match(input,STRENGTH,FOLLOW_STRENGTH_in_characteristic92); 
            STRENGTH8_tree = 
            (Object)adaptor.create(STRENGTH8)
            ;
            root_0 = (Object)adaptor.becomeRoot(STRENGTH8_tree, root_0);

            dbg.location(19,34);
            ASSIGN9=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_characteristic95); 
            dbg.location(19,36);
            NUMBER10=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_characteristic98); 
            NUMBER10_tree = 
            (Object)adaptor.create(NUMBER10)
            ;
            adaptor.addChild(root_0, NUMBER10_tree);


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
        dbg.location(19, 41);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "characteristic");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "characteristic"


    public static class behaviour_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // /Users/job/Programming/svn-sc/SAFparser.g:21:1: behaviour : CONDITION ^ LEFT_BRACKET ! MOVE ATTACK RIGHT_BRACKET !;
    public final SAFparser.behaviour_return behaviour() throws RecognitionException {
        SAFparser.behaviour_return retval = new SAFparser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONDITION11=null;
        Token LEFT_BRACKET12=null;
        Token MOVE13=null;
        Token ATTACK14=null;
        Token RIGHT_BRACKET15=null;

        Object CONDITION11_tree=null;
        Object LEFT_BRACKET12_tree=null;
        Object MOVE13_tree=null;
        Object ATTACK14_tree=null;
        Object RIGHT_BRACKET15_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "behaviour");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:21:12: ( CONDITION ^ LEFT_BRACKET ! MOVE ATTACK RIGHT_BRACKET !)
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFparser.g:21:14: CONDITION ^ LEFT_BRACKET ! MOVE ATTACK RIGHT_BRACKET !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(21,23);
            CONDITION11=(Token)match(input,CONDITION,FOLLOW_CONDITION_in_behaviour108); 
            CONDITION11_tree = 
            (Object)adaptor.create(CONDITION11)
            ;
            root_0 = (Object)adaptor.becomeRoot(CONDITION11_tree, root_0);

            dbg.location(21,37);
            LEFT_BRACKET12=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_behaviour111); 
            dbg.location(21,39);
            MOVE13=(Token)match(input,MOVE,FOLLOW_MOVE_in_behaviour114); 
            MOVE13_tree = 
            (Object)adaptor.create(MOVE13)
            ;
            adaptor.addChild(root_0, MOVE13_tree);

            dbg.location(21,44);
            ATTACK14=(Token)match(input,ATTACK,FOLLOW_ATTACK_in_behaviour116); 
            ATTACK14_tree = 
            (Object)adaptor.create(ATTACK14)
            ;
            adaptor.addChild(root_0, ATTACK14_tree);

            dbg.location(21,64);
            RIGHT_BRACKET15=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_behaviour118); 

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
        dbg.location(21, 64);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "behaviour");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "behaviour"

    // Delegated rules


 

    public static final BitSet FOLLOW_fighter_in_file49 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_fighter61 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_fighter64 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_property_in_fighter67 = new BitSet(new long[]{0x000000000000A040L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_fighter70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_property80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_property84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRENGTH_in_characteristic92 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_characteristic95 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NUMBER_in_characteristic98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_in_behaviour108 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_behaviour111 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_MOVE_in_behaviour114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ATTACK_in_behaviour116 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_behaviour118 = new BitSet(new long[]{0x0000000000000002L});

}