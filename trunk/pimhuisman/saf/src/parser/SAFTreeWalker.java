// $ANTLR 3.4 C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAFTreeWalker.g 2012-01-25 12:32:34

	package parser;
	import data.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFTreeWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "AND_OPERATOR", "BEHAVIOUR", "CHARACTERISTIC", "CHOOSE", "CONDITION", "DIGIT", "FIGHTER", "IDENTIFIER", "LETTER", "MULTILINE_COMMENT", "NAME", "NUMBER", "OR_OPERATOR", "PERSONALITY", "SINGLELINE_COMMENT", "VALUE", "WHITESPACE", "'('", "')'", "'='", "'['", "']'", "'and'", "'choose'", "'or'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int ACTION=4;
    public static final int AND_OPERATOR=5;
    public static final int BEHAVIOUR=6;
    public static final int CHARACTERISTIC=7;
    public static final int CHOOSE=8;
    public static final int CONDITION=9;
    public static final int DIGIT=10;
    public static final int FIGHTER=11;
    public static final int IDENTIFIER=12;
    public static final int LETTER=13;
    public static final int MULTILINE_COMMENT=14;
    public static final int NAME=15;
    public static final int NUMBER=16;
    public static final int OR_OPERATOR=17;
    public static final int PERSONALITY=18;
    public static final int SINGLELINE_COMMENT=19;
    public static final int VALUE=20;
    public static final int WHITESPACE=21;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SAFTreeWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SAFTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SAFTreeWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAFTreeWalker.g"; }



    // $ANTLR start "fighter"
    // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAFTreeWalker.g:15:1: fighter returns [Fighter result] :;
    public final Fighter fighter() throws RecognitionException {
        Fighter result = null;


        try {
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAFTreeWalker.g:16:2: ()
            // C:\\Users\\Pim\\Projects\\SoftwareConstruction\\saf\\src\\parser\\SAFTreeWalker.g:16:4: 
            {
             result = new Fighter("", null, null); 

            }

        }
        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "fighter"

    // Delegated rules


 

}