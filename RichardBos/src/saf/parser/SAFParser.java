// $ANTLR 3.4 C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g 2012-02-06 15:37:16
 
  package saf.parser; 
  import saf.structure.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CHAR", "CHOOSE", "DIGIT", "ID", "INT", "OR", "WS", "'('", "')'", "'='", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int AND=4;
    public static final int CHAR=5;
    public static final int CHOOSE=6;
    public static final int DIGIT=7;
    public static final int ID=8;
    public static final int INT=9;
    public static final int OR=10;
    public static final int WS=11;

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
    public String getGrammarFileName() { return "C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g"; }


    public static class bots_return extends ParserRuleReturnScope {
        public Bots bots;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bots"
    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:17:1: bots returns [Bots bots] : (b= bot )* ;
    public final SAFParser.bots_return bots() throws RecognitionException {
        SAFParser.bots_return retval = new SAFParser.bots_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.bot_return b =null;



        try {
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:17:26: ( (b= bot )* )
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:17:41: (b= bot )*
            {
            root_0 = (CommonTree)adaptor.nil();


                 retval.bots = new Bots();
                                                    

            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:19:3: (b= bot )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:19:4: b= bot
            	    {
            	    pushFollow(FOLLOW_bot_in_bots79);
            	    b=bot();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());

            	         retval.bots.getBots().add(b.bot); 
            	                                            

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bots"


    public static class bot_return extends ParserRuleReturnScope {
        public Bot bot;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bot"
    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:22:1: bot returns [Bot bot] : n= name '{' (b= behavior |c= characteristic )+ '}' ;
    public final SAFParser.bot_return bot() throws RecognitionException {
        SAFParser.bot_return retval = new SAFParser.bot_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal1=null;
        Token char_literal2=null;
        SAFParser.name_return n =null;

        SAFParser.behavior_return b =null;

        SAFParser.characteristic_return c =null;


        CommonTree char_literal1_tree=null;
        CommonTree char_literal2_tree=null;

        try {
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:22:22: (n= name '{' (b= behavior |c= characteristic )+ '}' )
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:23:3: n= name '{' (b= behavior |c= characteristic )+ '}'
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_name_in_bot131);
            n=name();

            state._fsp--;

            adaptor.addChild(root_0, n.getTree());

                 retval.bot = new Bot(n.name); 
                                                    

            char_literal1=(Token)match(input,17,FOLLOW_17_in_bot170); 
            char_literal1_tree = 
            (CommonTree)adaptor.create(char_literal1)
            ;
            adaptor.addChild(root_0, char_literal1_tree);


            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:26:7: (b= behavior |c= characteristic )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==AND||LA2_2==OR||LA2_2==15) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==ID||LA2_2==14) ) {
                        alt2=2;
                    }


                }
                else if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:26:9: b= behavior
            	    {
            	    pushFollow(FOLLOW_behavior_in_bot183);
            	    b=behavior();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());

            	         retval.bot.getBehaviors().add(b.behavior); 
            	                                            

            	    }
            	    break;
            	case 2 :
            	    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:28:9: c= characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_bot218);
            	    c=characteristic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, c.getTree());

            	         retval.bot.getCharacteristics().add(c.character); 
            	                                            

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            char_literal2=(Token)match(input,18,FOLLOW_18_in_bot250); 
            char_literal2_tree = 
            (CommonTree)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bot"


    public static class name_return extends ParserRuleReturnScope {
        public String name;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:33:1: name returns [String name] : ID (sn= subname )* ;
    public final SAFParser.name_return name() throws RecognitionException {
        SAFParser.name_return retval = new SAFParser.name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID3=null;
        SAFParser.subname_return sn =null;


        CommonTree ID3_tree=null;

        try {
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:33:27: ( ID (sn= subname )* )
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:34:3: ID (sn= subname )*
            {
            root_0 = (CommonTree)adaptor.nil();


            ID3=(Token)match(input,ID,FOLLOW_ID_in_name267); 
            ID3_tree = 
            (CommonTree)adaptor.create(ID3)
            ;
            adaptor.addChild(root_0, ID3_tree);


                 retval.name = (ID3!=null?ID3.getText():null);
                                                    

            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:36:3: (sn= subname )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= ID && LA3_0 <= INT)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:36:4: sn= subname
            	    {
            	    pushFollow(FOLLOW_subname_in_name311);
            	    sn=subname();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sn.getTree());

            	         retval.name += (sn!=null?sn.name:null);
            	                                            

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "name"


    public static class subname_return extends ParserRuleReturnScope {
        public String name;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subname"
    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:39:1: subname returns [String name] : ( ID | INT ) ;
    public final SAFParser.subname_return subname() throws RecognitionException {
        SAFParser.subname_return retval = new SAFParser.subname_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID4=null;
        Token INT5=null;

        CommonTree ID4_tree=null;
        CommonTree INT5_tree=null;

        try {
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:39:30: ( ( ID | INT ) )
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:40:3: ( ID | INT )
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:40:3: ( ID | INT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:40:5: ID
                    {
                    ID4=(Token)match(input,ID,FOLLOW_ID_in_subname358); 
                    ID4_tree = 
                    (CommonTree)adaptor.create(ID4)
                    ;
                    adaptor.addChild(root_0, ID4_tree);


                         retval.name = (ID4!=null?ID4.getText():null); 
                                                            

                    }
                    break;
                case 2 :
                    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:42:5: INT
                    {
                    INT5=(Token)match(input,INT,FOLLOW_INT_in_subname399); 
                    INT5_tree = 
                    (CommonTree)adaptor.create(INT5)
                    ;
                    adaptor.addChild(root_0, INT5_tree);


                         retval.name = (INT5!=null?INT5.getText():null); 
                                                            

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subname"


    public static class characteristic_return extends ParserRuleReturnScope {
        public Characteristic character;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:46:1: characteristic returns [Characteristic character] : ( ID )+ '=' INT ;
    public final SAFParser.characteristic_return characteristic() throws RecognitionException {
        SAFParser.characteristic_return retval = new SAFParser.characteristic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID6=null;
        Token char_literal7=null;
        Token INT8=null;

        CommonTree ID6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree INT8_tree=null;

        try {
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:46:50: ( ( ID )+ '=' INT )
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:47:3: ( ID )+ '=' INT
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:47:3: ( ID )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:47:3: ID
            	    {
            	    ID6=(Token)match(input,ID,FOLLOW_ID_in_characteristic450); 
            	    ID6_tree = 
            	    (CommonTree)adaptor.create(ID6)
            	    ;
            	    adaptor.addChild(root_0, ID6_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            char_literal7=(Token)match(input,14,FOLLOW_14_in_characteristic453); 
            char_literal7_tree = 
            (CommonTree)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);


            INT8=(Token)match(input,INT,FOLLOW_INT_in_characteristic455); 
            INT8_tree = 
            (CommonTree)adaptor.create(INT8)
            ;
            adaptor.addChild(root_0, INT8_tree);


                 retval.character = new Characteristic((ID6!=null?ID6.getText():null),Integer.parseInt((INT8!=null?INT8.getText():null)));
                                                    

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "characteristic"


    public static class behavior_return extends ParserRuleReturnScope {
        public Behavior behavior;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behavior"
    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:50:1: behavior returns [Behavior behavior] : c= condition '[' (id1= ID | CHOOSE '(' (c1= ID )* ')' ) (id2= ID | CHOOSE '(' (c2= ID )* ')' ) ']' ;
    public final SAFParser.behavior_return behavior() throws RecognitionException {
        SAFParser.behavior_return retval = new SAFParser.behavior_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token id1=null;
        Token c1=null;
        Token id2=null;
        Token c2=null;
        Token char_literal9=null;
        Token CHOOSE10=null;
        Token char_literal11=null;
        Token char_literal12=null;
        Token CHOOSE13=null;
        Token char_literal14=null;
        Token char_literal15=null;
        Token char_literal16=null;
        SAFParser.condition_return c =null;


        CommonTree id1_tree=null;
        CommonTree c1_tree=null;
        CommonTree id2_tree=null;
        CommonTree c2_tree=null;
        CommonTree char_literal9_tree=null;
        CommonTree CHOOSE10_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree CHOOSE13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree char_literal16_tree=null;

        try {
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:50:37: (c= condition '[' (id1= ID | CHOOSE '(' (c1= ID )* ')' ) (id2= ID | CHOOSE '(' (c2= ID )* ')' ) ']' )
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:51:3: c= condition '[' (id1= ID | CHOOSE '(' (c1= ID )* ')' ) (id2= ID | CHOOSE '(' (c2= ID )* ')' ) ']'
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_condition_in_behavior498);
            c=condition();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());

            char_literal9=(Token)match(input,15,FOLLOW_15_in_behavior501); 
            char_literal9_tree = 
            (CommonTree)adaptor.create(char_literal9)
            ;
            adaptor.addChild(root_0, char_literal9_tree);


                 retval.behavior = new Behavior((c!=null?c.condition:null));
                                                    

            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:54:3: (id1= ID | CHOOSE '(' (c1= ID )* ')' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==CHOOSE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:54:5: id1= ID
                    {
                    id1=(Token)match(input,ID,FOLLOW_ID_in_behavior575); 
                    id1_tree = 
                    (CommonTree)adaptor.create(id1)
                    ;
                    adaptor.addChild(root_0, id1_tree);


                         retval.behavior.addMoveAction(new Action((id1!=null?id1.getText():null)));
                                                            

                    }
                    break;
                case 2 :
                    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:56:5: CHOOSE '(' (c1= ID )* ')'
                    {
                    CHOOSE10=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_behavior610); 
                    CHOOSE10_tree = 
                    (CommonTree)adaptor.create(CHOOSE10)
                    ;
                    adaptor.addChild(root_0, CHOOSE10_tree);


                    char_literal11=(Token)match(input,12,FOLLOW_12_in_behavior613); 
                    char_literal11_tree = 
                    (CommonTree)adaptor.create(char_literal11)
                    ;
                    adaptor.addChild(root_0, char_literal11_tree);


                    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:57:17: (c1= ID )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:58:19: c1= ID
                    	    {
                    	    c1=(Token)match(input,ID,FOLLOW_ID_in_behavior656); 
                    	    c1_tree = 
                    	    (CommonTree)adaptor.create(c1)
                    	    ;
                    	    adaptor.addChild(root_0, c1_tree);


                    	         retval.behavior.addMoveAction(new Action((c1!=null?c1.getText():null)));
                    	                                            

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    char_literal12=(Token)match(input,13,FOLLOW_13_in_behavior705); 
                    char_literal12_tree = 
                    (CommonTree)adaptor.create(char_literal12)
                    ;
                    adaptor.addChild(root_0, char_literal12_tree);


                    }
                    break;

            }


            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:64:3: (id2= ID | CHOOSE '(' (c2= ID )* ')' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==CHOOSE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:64:5: id2= ID
                    {
                    id2=(Token)match(input,ID,FOLLOW_ID_in_behavior722); 
                    id2_tree = 
                    (CommonTree)adaptor.create(id2)
                    ;
                    adaptor.addChild(root_0, id2_tree);


                         retval.behavior.addFightAction(new Action((id2!=null?id2.getText():null)));
                                                            

                    }
                    break;
                case 2 :
                    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:66:5: CHOOSE '(' (c2= ID )* ')'
                    {
                    CHOOSE13=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_behavior757); 
                    CHOOSE13_tree = 
                    (CommonTree)adaptor.create(CHOOSE13)
                    ;
                    adaptor.addChild(root_0, CHOOSE13_tree);


                    char_literal14=(Token)match(input,12,FOLLOW_12_in_behavior760); 
                    char_literal14_tree = 
                    (CommonTree)adaptor.create(char_literal14)
                    ;
                    adaptor.addChild(root_0, char_literal14_tree);


                    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:67:17: (c2= ID )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:68:19: c2= ID
                    	    {
                    	    c2=(Token)match(input,ID,FOLLOW_ID_in_behavior804); 
                    	    c2_tree = 
                    	    (CommonTree)adaptor.create(c2)
                    	    ;
                    	    adaptor.addChild(root_0, c2_tree);


                    	         retval.behavior.addFightAction(new Action((c2!=null?c2.getText():null)));
                    	                                            

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    char_literal15=(Token)match(input,13,FOLLOW_13_in_behavior853); 
                    char_literal15_tree = 
                    (CommonTree)adaptor.create(char_literal15)
                    ;
                    adaptor.addChild(root_0, char_literal15_tree);


                    }
                    break;

            }


            char_literal16=(Token)match(input,16,FOLLOW_16_in_behavior861); 
            char_literal16_tree = 
            (CommonTree)adaptor.create(char_literal16)
            ;
            adaptor.addChild(root_0, char_literal16_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "behavior"


    public static class condition_return extends ParserRuleReturnScope {
        public Condition condition;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:75:1: condition returns [Condition condition] : cr1= conditionRule ( OR cr2= conditionRule )* ;
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR17=null;
        SAFParser.conditionRule_return cr1 =null;

        SAFParser.conditionRule_return cr2 =null;


        CommonTree OR17_tree=null;

        try {
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:75:40: (cr1= conditionRule ( OR cr2= conditionRule )* )
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:76:4: cr1= conditionRule ( OR cr2= conditionRule )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionRule_in_condition877);
            cr1=conditionRule();

            state._fsp--;

            adaptor.addChild(root_0, cr1.getTree());

                 retval.condition = (cr1!=null?cr1.condition:null);
                                                    

            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:78:4: ( OR cr2= conditionRule )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==OR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:78:6: OR cr2= conditionRule
            	    {
            	    OR17=(Token)match(input,OR,FOLLOW_OR_in_condition905); 
            	    OR17_tree = 
            	    (CommonTree)adaptor.create(OR17)
            	    ;
            	    adaptor.addChild(root_0, OR17_tree);


            	    pushFollow(FOLLOW_conditionRule_in_condition909);
            	    cr2=conditionRule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cr2.getTree());

            	         retval.condition = new ConditionOr((cr1!=null?cr1.condition:null), (cr2!=null?cr2.condition:null));
            	                                            

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class conditionRule_return extends ParserRuleReturnScope {
        public Condition condition;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionRule"
    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:82:1: conditionRule returns [Condition condition] : v1= var ( AND v2= var )* ;
    public final SAFParser.conditionRule_return conditionRule() throws RecognitionException {
        SAFParser.conditionRule_return retval = new SAFParser.conditionRule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND18=null;
        SAFParser.var_return v1 =null;

        SAFParser.var_return v2 =null;


        CommonTree AND18_tree=null;

        try {
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:82:44: (v1= var ( AND v2= var )* )
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:83:4: v1= var ( AND v2= var )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_var_in_conditionRule950);
            v1=var();

            state._fsp--;

            adaptor.addChild(root_0, v1.getTree());

                 retval.condition = (v1!=null?v1.condition:null);
                                                    

            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:85:4: ( AND v2= var )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:85:6: AND v2= var
            	    {
            	    AND18=(Token)match(input,AND,FOLLOW_AND_in_conditionRule989); 
            	    AND18_tree = 
            	    (CommonTree)adaptor.create(AND18)
            	    ;
            	    adaptor.addChild(root_0, AND18_tree);


            	    pushFollow(FOLLOW_var_in_conditionRule993);
            	    v2=var();

            	    state._fsp--;

            	    adaptor.addChild(root_0, v2.getTree());

            	         retval.condition = new ConditionAnd((v1!=null?v1.condition:null), (v2!=null?v2.condition:null));   
            	    							                          

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionRule"


    public static class var_return extends ParserRuleReturnScope {
        public Condition condition;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var"
    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:89:1: var returns [Condition condition] : ( ID | '(' c= condition ')' );
    public final SAFParser.var_return var() throws RecognitionException {
        SAFParser.var_return retval = new SAFParser.var_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID19=null;
        Token char_literal20=null;
        Token char_literal21=null;
        SAFParser.condition_return c =null;


        CommonTree ID19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree char_literal21_tree=null;

        try {
            // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:89:34: ( ID | '(' c= condition ')' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==12) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:90:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID19=(Token)match(input,ID,FOLLOW_ID_in_var1042); 
                    ID19_tree = 
                    (CommonTree)adaptor.create(ID19)
                    ;
                    adaptor.addChild(root_0, ID19_tree);


                         retval.condition = new ConditionSimple((ID19!=null?ID19.getText():null));   
                                                            

                    }
                    break;
                case 2 :
                    // C:\\Dropbox\\EclipseWorkSpace\\SuperAwesomeFighters\\SuperAwesomeFighters\\Grammar\\SAF.g:92:6: '(' c= condition ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal20=(Token)match(input,12,FOLLOW_12_in_var1085); 
                    char_literal20_tree = 
                    (CommonTree)adaptor.create(char_literal20)
                    ;
                    adaptor.addChild(root_0, char_literal20_tree);


                    pushFollow(FOLLOW_condition_in_var1089);
                    c=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, c.getTree());

                    char_literal21=(Token)match(input,13,FOLLOW_13_in_var1091); 
                    char_literal21_tree = 
                    (CommonTree)adaptor.create(char_literal21)
                    ;
                    adaptor.addChild(root_0, char_literal21_tree);


                         retval.condition = (c!=null?c.condition:null);    
                                                            

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var"

    // Delegated rules


 

    public static final BitSet FOLLOW_bot_in_bots79 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_name_in_bot131 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_bot170 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_behavior_in_bot183 = new BitSet(new long[]{0x0000000000041100L});
    public static final BitSet FOLLOW_characteristic_in_bot218 = new BitSet(new long[]{0x0000000000041100L});
    public static final BitSet FOLLOW_18_in_bot250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name267 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_subname_in_name311 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_ID_in_subname358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_subname399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_characteristic450 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_14_in_characteristic453 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_characteristic455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behavior498 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_behavior501 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_ID_in_behavior575 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_CHOOSE_in_behavior610 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behavior613 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_ID_in_behavior656 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_13_in_behavior705 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_ID_in_behavior722 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHOOSE_in_behavior757 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behavior760 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_ID_in_behavior804 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_13_in_behavior853 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_behavior861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionRule_in_condition877 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_OR_in_condition905 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_conditionRule_in_condition909 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_var_in_conditionRule950 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_conditionRule989 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_var_in_conditionRule993 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_var1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_var1085 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_condition_in_var1089 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_var1091 = new BitSet(new long[]{0x0000000000000002L});

}