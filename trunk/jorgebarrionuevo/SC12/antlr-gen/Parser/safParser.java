// $ANTLR 3.4 D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g 2012-02-23 10:48:58

  package Parser;
  import model.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class safParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BEHAVIOUR", "BETWEEN", "CHARACTERISTIC", "DIGIT", "ID", "L_BRACKET", "L_CURLY", "L_PAR", "OR", "PROGRAM", "R_BRACKET", "R_CURLY", "R_PAR", "WS"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int BEHAVIOUR=5;
    public static final int BETWEEN=6;
    public static final int CHARACTERISTIC=7;
    public static final int DIGIT=8;
    public static final int ID=9;
    public static final int L_BRACKET=10;
    public static final int L_CURLY=11;
    public static final int L_PAR=12;
    public static final int OR=13;
    public static final int PROGRAM=14;
    public static final int R_BRACKET=15;
    public static final int R_CURLY=16;
    public static final int R_PAR=17;
    public static final int WS=18;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public safParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public safParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return safParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g"; }


        //Fighter fighter;
        //List<Characteristic> personality = new ArrayList<Characteristic>();
        //List<Rule> behaviour = new ArrayList<Rule>();


    public static class program_return extends ParserRuleReturnScope {
        public Arena arena;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:30:1: program returns [Arena arena] : ( fighter )+ EOF ;
    public final safParser.program_return program() throws RecognitionException {
        safParser.program_return retval = new safParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        safParser.fighter_return fighter1 =null;


        Object EOF2_tree=null;

        retval.arena = new Arena();
        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:31:3: ( ( fighter )+ EOF )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:32:5: ( fighter )+ EOF
            {
            root_0 = (Object)adaptor.nil();


            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:32:5: ( fighter )+
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
            	    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:32:6: fighter
            	    {
            	    pushFollow(FOLLOW_fighter_in_program100);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program104); 
            EOF2_tree = 
            (Object)adaptor.create(EOF2)
            ;
            adaptor.addChild(root_0, EOF2_tree);


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
    // $ANTLR end "program"


    public static class fighter_return extends ParserRuleReturnScope {
        public Fighter fighter;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:34:1: fighter returns [Fighter fighter] : ID L_CURLY R_CURLY ;
    public final safParser.fighter_return fighter() throws RecognitionException {
        safParser.fighter_return retval = new safParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID3=null;
        Token L_CURLY4=null;
        Token R_CURLY5=null;

        Object ID3_tree=null;
        Object L_CURLY4_tree=null;
        Object R_CURLY5_tree=null;

        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:35:3: ( ID L_CURLY R_CURLY )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:35:5: ID L_CURLY R_CURLY
            {
            root_0 = (Object)adaptor.nil();


            ID3=(Token)match(input,ID,FOLLOW_ID_in_fighter119); 
            ID3_tree = 
            (Object)adaptor.create(ID3)
            ;
            adaptor.addChild(root_0, ID3_tree);


            L_CURLY4=(Token)match(input,L_CURLY,FOLLOW_L_CURLY_in_fighter121); 
            L_CURLY4_tree = 
            (Object)adaptor.create(L_CURLY4)
            ;
            adaptor.addChild(root_0, L_CURLY4_tree);


            R_CURLY5=(Token)match(input,R_CURLY,FOLLOW_R_CURLY_in_fighter123); 
            R_CURLY5_tree = 
            (Object)adaptor.create(R_CURLY5)
            ;
            adaptor.addChild(root_0, R_CURLY5_tree);


             
                      String figtherName = (ID3!=null?ID3.getText():null);
                      retval.fighter = new Fighter();
                

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


 

    public static final BitSet FOLLOW_fighter_in_program100 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EOF_in_program104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fighter119 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_L_CURLY_in_fighter121 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_R_CURLY_in_fighter123 = new BitSet(new long[]{0x0000000000000002L});

}