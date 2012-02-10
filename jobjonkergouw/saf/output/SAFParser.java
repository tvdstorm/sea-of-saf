// $ANTLR 3.4 /Users/job/Programming/svn-sc/saf/SAF.g 2012-02-10 00:26:11

	//package saf;
	import ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "WS", "'lol'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int ID=4;
    public static final int INT=5;
    public static final int WS=6;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "fighter", "defs"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public SAFParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public SAFParser(TokenStream input, int port, RecognizerSharedState state) {
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

public SAFParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return SAFParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/job/Programming/svn-sc/saf/SAF.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        public Fighter n;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Users/job/Programming/svn-sc/saf/SAF.g:17:1: fighter returns [Fighter n] : ID '{' ( defs )* '}' ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID1=null;
        Token char_literal2=null;
        Token char_literal4=null;
        SAFParser.defs_return defs3 =null;


        Object ID1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal4_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fighter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // /Users/job/Programming/svn-sc/saf/SAF.g:18:2: ( ID '{' ( defs )* '}' )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/saf/SAF.g:18:5: ID '{' ( defs )* '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(18,5);
            ID1=(Token)match(input,ID,FOLLOW_ID_in_fighter54); 
            ID1_tree = 
            (Object)adaptor.create(ID1)
            ;
            adaptor.addChild(root_0, ID1_tree);

            dbg.location(18,8);
            char_literal2=(Token)match(input,8,FOLLOW_8_in_fighter56); 
            char_literal2_tree = 
            (Object)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);

            dbg.location(18,12);
            // /Users/job/Programming/svn-sc/saf/SAF.g:18:12: ( defs )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==7) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/job/Programming/svn-sc/saf/SAF.g:18:13: defs
            	    {
            	    dbg.location(18,13);
            	    pushFollow(FOLLOW_defs_in_fighter59);
            	    defs3=defs();

            	    state._fsp--;

            	    adaptor.addChild(root_0, defs3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(18,20);
            char_literal4=(Token)match(input,9,FOLLOW_9_in_fighter63); 
            char_literal4_tree = 
            (Object)adaptor.create(char_literal4)
            ;
            adaptor.addChild(root_0, char_literal4_tree);


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
        dbg.location(19, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fighter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fighter"


    public static class defs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defs"
    // /Users/job/Programming/svn-sc/saf/SAF.g:21:1: defs : 'lol' ;
    public final SAFParser.defs_return defs() throws RecognitionException {
        SAFParser.defs_return retval = new SAFParser.defs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal5=null;

        Object string_literal5_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // /Users/job/Programming/svn-sc/saf/SAF.g:21:5: ( 'lol' )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/saf/SAF.g:21:7: 'lol'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(21,7);
            string_literal5=(Token)match(input,7,FOLLOW_7_in_defs75); 
            string_literal5_tree = 
            (Object)adaptor.create(string_literal5)
            ;
            adaptor.addChild(root_0, string_literal5_tree);


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
        dbg.location(21, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defs"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_fighter54 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_fighter56 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_defs_in_fighter59 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_9_in_fighter63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_defs75 = new BitSet(new long[]{0x0000000000000002L});

}