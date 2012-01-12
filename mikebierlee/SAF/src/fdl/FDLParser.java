// $ANTLR 3.4 C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g 2012-01-12 18:46:08

  package fdl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "IDENT", "INTEGER", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int LEFT_PARENTHESIS=7;
    public static final int RIGHT_PARENTHESIS=8;
    public static final int WHITESPACE=9;

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
    public String getGrammarFileName() { return "C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g"; }


    public static class characteristicAssignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristicAssignment"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:1: characteristicAssignment : IDENT ASSIGN INTEGER ;
    public final FDLParser.characteristicAssignment_return characteristicAssignment() throws RecognitionException {
        FDLParser.characteristicAssignment_return retval = new FDLParser.characteristicAssignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT1=null;
        Token ASSIGN2=null;
        Token INTEGER3=null;

        Object IDENT1_tree=null;
        Object ASSIGN2_tree=null;
        Object INTEGER3_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:26: ( IDENT ASSIGN INTEGER )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:39:28: IDENT ASSIGN INTEGER
            {
            root_0 = (Object)adaptor.nil();


            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_characteristicAssignment195); 
            IDENT1_tree = 
            (Object)adaptor.create(IDENT1)
            ;
            adaptor.addChild(root_0, IDENT1_tree);


            ASSIGN2=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_characteristicAssignment197); 
            ASSIGN2_tree = 
            (Object)adaptor.create(ASSIGN2)
            ;
            adaptor.addChild(root_0, ASSIGN2_tree);


            INTEGER3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_characteristicAssignment199); 
            INTEGER3_tree = 
            (Object)adaptor.create(INTEGER3)
            ;
            adaptor.addChild(root_0, INTEGER3_tree);


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
    // $ANTLR end "characteristicAssignment"


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:1: fighter : IDENT ( WHITESPACE )* LEFT_PARENTHESIS ( characteristicAssignment )* RIGHT_PARENTHESIS ;
    public final FDLParser.fighter_return fighter() throws RecognitionException {
        FDLParser.fighter_return retval = new FDLParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT4=null;
        Token WHITESPACE5=null;
        Token LEFT_PARENTHESIS6=null;
        Token RIGHT_PARENTHESIS8=null;
        FDLParser.characteristicAssignment_return characteristicAssignment7 =null;


        Object IDENT4_tree=null;
        Object WHITESPACE5_tree=null;
        Object LEFT_PARENTHESIS6_tree=null;
        Object RIGHT_PARENTHESIS8_tree=null;

        try {
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:9: ( IDENT ( WHITESPACE )* LEFT_PARENTHESIS ( characteristicAssignment )* RIGHT_PARENTHESIS )
            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:11: IDENT ( WHITESPACE )* LEFT_PARENTHESIS ( characteristicAssignment )* RIGHT_PARENTHESIS
            {
            root_0 = (Object)adaptor.nil();


            IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter206); 
            IDENT4_tree = 
            (Object)adaptor.create(IDENT4)
            ;
            adaptor.addChild(root_0, IDENT4_tree);


            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:17: ( WHITESPACE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==WHITESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:17: WHITESPACE
            	    {
            	    WHITESPACE5=(Token)match(input,WHITESPACE,FOLLOW_WHITESPACE_in_fighter208); 
            	    WHITESPACE5_tree = 
            	    (Object)adaptor.create(WHITESPACE5)
            	    ;
            	    adaptor.addChild(root_0, WHITESPACE5_tree);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            LEFT_PARENTHESIS6=(Token)match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_fighter211); 
            LEFT_PARENTHESIS6_tree = 
            (Object)adaptor.create(LEFT_PARENTHESIS6)
            ;
            adaptor.addChild(root_0, LEFT_PARENTHESIS6_tree);


            // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:46: ( characteristicAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Repositories\\SoftwareConstruction\\SAF\\src\\FDL.g:40:46: characteristicAssignment
            	    {
            	    pushFollow(FOLLOW_characteristicAssignment_in_fighter213);
            	    characteristicAssignment7=characteristicAssignment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, characteristicAssignment7.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            RIGHT_PARENTHESIS8=(Token)match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_fighter216); 
            RIGHT_PARENTHESIS8_tree = 
            (Object)adaptor.create(RIGHT_PARENTHESIS8)
            ;
            adaptor.addChild(root_0, RIGHT_PARENTHESIS8_tree);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_characteristicAssignment195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_characteristicAssignment197 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INTEGER_in_characteristicAssignment199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fighter206 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_WHITESPACE_in_fighter208 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_fighter211 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_characteristicAssignment_in_fighter213 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_fighter216 = new BitSet(new long[]{0x0000000000000002L});

}