// $ANTLR 3.4 /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g 2012-01-20 23:40:22

    package saf.fighter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "INT", "LETTER", "NEW_LINE", "NL_CHAR", "STRING", "UNDER_SCORE", "WHITESPACE", "WHITE_CHAR"
    };

    public static final int EOF=-1;
    public static final int DIGIT=4;
    public static final int INT=5;
    public static final int LETTER=6;
    public static final int NEW_LINE=7;
    public static final int NL_CHAR=8;
    public static final int STRING=9;
    public static final int UNDER_SCORE=10;
    public static final int WHITESPACE=11;
    public static final int WHITE_CHAR=12;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "property", "move", "value", "attack", "condition"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public FDLParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public FDLParser(TokenStream input, int port, RecognizerSharedState state) {
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

public FDLParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return FDLParser.tokenNames; }
    public String getGrammarFileName() { return "/home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g"; }


    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property"
    // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:39:1: property : STRING ;
    public final FDLParser.property_return property() throws RecognitionException {
        FDLParser.property_return retval = new FDLParser.property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING1=null;

        Object STRING1_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "property");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 0);

        try {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:39:9: ( STRING )
            dbg.enterAlt(1);

            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:39:17: STRING
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(39,17);
            STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_property83); 
            STRING1_tree = 
            (Object)adaptor.create(STRING1)
            ;
            adaptor.addChild(root_0, STRING1_tree);


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
        dbg.location(39, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "property");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "property"


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:40:1: value : INT ;
    public final FDLParser.value_return value() throws RecognitionException {
        FDLParser.value_return retval = new FDLParser.value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INT2=null;

        Object INT2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 0);

        try {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:40:6: ( INT )
            dbg.enterAlt(1);

            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:40:17: INT
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(40,17);
            INT2=(Token)match(input,INT,FOLLOW_INT_in_value98); 
            INT2_tree = 
            (Object)adaptor.create(INT2)
            ;
            adaptor.addChild(root_0, INT2_tree);


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
        dbg.location(40, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "value"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:41:1: condition : STRING ;
    public final FDLParser.condition_return condition() throws RecognitionException {
        FDLParser.condition_return retval = new FDLParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING3=null;

        Object STRING3_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "condition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 0);

        try {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:41:10: ( STRING )
            dbg.enterAlt(1);

            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:41:17: STRING
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(41,17);
            STRING3=(Token)match(input,STRING,FOLLOW_STRING_in_condition109); 
            STRING3_tree = 
            (Object)adaptor.create(STRING3)
            ;
            adaptor.addChild(root_0, STRING3_tree);


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
        dbg.location(41, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "condition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "condition"


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:42:1: move : STRING ;
    public final FDLParser.move_return move() throws RecognitionException {
        FDLParser.move_return retval = new FDLParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING4=null;

        Object STRING4_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "move");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 0);

        try {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:42:5: ( STRING )
            dbg.enterAlt(1);

            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:42:17: STRING
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(42,17);
            STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_move125); 
            STRING4_tree = 
            (Object)adaptor.create(STRING4)
            ;
            adaptor.addChild(root_0, STRING4_tree);


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
        dbg.location(42, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "move");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "move"


    public static class attack_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attack"
    // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:43:1: attack : STRING ;
    public final FDLParser.attack_return attack() throws RecognitionException {
        FDLParser.attack_return retval = new FDLParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING5=null;

        Object STRING5_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attack");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 0);

        try {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:43:7: ( STRING )
            dbg.enterAlt(1);

            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:43:17: STRING
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(43,17);
            STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_attack139); 
            STRING5_tree = 
            (Object)adaptor.create(STRING5)
            ;
            adaptor.addChild(root_0, STRING5_tree);


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
        dbg.location(43, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attack");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "attack"

    // Delegated rules


 

    public static final BitSet FOLLOW_STRING_in_property83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_condition109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_move125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_attack139 = new BitSet(new long[]{0x0000000000000002L});

}