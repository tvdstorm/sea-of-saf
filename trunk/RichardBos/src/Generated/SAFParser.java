// $ANTLR 3.4 C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g 2012-01-17 17:26:57

  package Generated;
  import SAF.Structure.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CHOOSE", "ID", "INT", "NEWLINE", "OR", "WS", "'('", "')'", "'='", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int AND=4;
    public static final int CHOOSE=5;
    public static final int ID=6;
    public static final int INT=7;
    public static final int NEWLINE=8;
    public static final int OR=9;
    public static final int WS=10;

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
    public String getGrammarFileName() { return "C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g"; }


    Bots bots = new Bots();


    public static class bots_return extends ParserRuleReturnScope {
        public Bots bots;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bots"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:19:1: bots returns [Bots bots] : (b= bot )* ;
    public final SAFParser.bots_return bots() throws RecognitionException {
        SAFParser.bots_return retval = new SAFParser.bots_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.bot_return b =null;



        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:19:26: ( (b= bot )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:20:3: (b= bot )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:20:4: (b= bot )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:20:4: b= bot
            	    {
            	    pushFollow(FOLLOW_bot_in_bots54);
            	    b=bot();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


             retval.bots.AddBot(b.bot); 

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
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:21:1: bot returns [Bot bot] : n= name ( NEWLINE )* '{' ( NEWLINE )* (b= behavior |c= characteristic )+ '}' ( NEWLINE )* ;
    public final SAFParser.bot_return bot() throws RecognitionException {
        SAFParser.bot_return retval = new SAFParser.bot_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEWLINE1=null;
        Token char_literal2=null;
        Token NEWLINE3=null;
        Token char_literal4=null;
        Token NEWLINE5=null;
        SAFParser.name_return n =null;

        SAFParser.behavior_return b =null;

        SAFParser.characteristic_return c =null;


        CommonTree NEWLINE1_tree=null;
        CommonTree char_literal2_tree=null;
        CommonTree NEWLINE3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree NEWLINE5_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:21:22: (n= name ( NEWLINE )* '{' ( NEWLINE )* (b= behavior |c= characteristic )+ '}' ( NEWLINE )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:22:3: n= name ( NEWLINE )* '{' ( NEWLINE )* (b= behavior |c= characteristic )+ '}' ( NEWLINE )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_name_in_bot92);
            n=name();

            state._fsp--;

            adaptor.addChild(root_0, n.getTree());

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:22:10: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:22:10: NEWLINE
            	    {
            	    NEWLINE1=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_bot94); 
            	    NEWLINE1_tree = 
            	    (CommonTree)adaptor.create(NEWLINE1)
            	    ;
            	    adaptor.addChild(root_0, NEWLINE1_tree);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


             retval.bot = new Bot(n.name); 

            char_literal2=(Token)match(input,16,FOLLOW_16_in_bot115); 
            char_literal2_tree = 
            (CommonTree)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:23:9: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:23:9: NEWLINE
            	    {
            	    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_bot117); 
            	    NEWLINE3_tree = 
            	    (CommonTree)adaptor.create(NEWLINE3)
            	    ;
            	    adaptor.addChild(root_0, NEWLINE3_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:24:7: (b= behavior |c= characteristic )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:24:9: b= behavior
            	    {
            	    pushFollow(FOLLOW_behavior_in_bot132);
            	    b=behavior();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());

            	     retval.bot.Behavior.add(b.behavior); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:25:9: c= characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_bot157);
            	    c=characteristic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, c.getTree());

            	     retval.bot.Characteristics.add(c.character); 

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


            char_literal4=(Token)match(input,17,FOLLOW_17_in_bot179); 
            char_literal4_tree = 
            (CommonTree)adaptor.create(char_literal4)
            ;
            adaptor.addChild(root_0, char_literal4_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:27:9: ( NEWLINE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:27:9: NEWLINE
            	    {
            	    NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_bot181); 
            	    NEWLINE5_tree = 
            	    (CommonTree)adaptor.create(NEWLINE5)
            	    ;
            	    adaptor.addChild(root_0, NEWLINE5_tree);


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "bot"


    public static class name_return extends ParserRuleReturnScope {
        public String name;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:29:1: name returns [String name] : ID (sn= subname )* ;
    public final SAFParser.name_return name() throws RecognitionException {
        SAFParser.name_return retval = new SAFParser.name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID6=null;
        SAFParser.subname_return sn =null;


        CommonTree ID6_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:29:27: ( ID (sn= subname )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:30:3: ID (sn= subname )*
            {
            root_0 = (CommonTree)adaptor.nil();


            ID6=(Token)match(input,ID,FOLLOW_ID_in_name199); 
            ID6_tree = 
            (CommonTree)adaptor.create(ID6)
            ;
            adaptor.addChild(root_0, ID6_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:30:8: (sn= subname )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= ID && LA6_0 <= INT)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:30:8: sn= subname
            	    {
            	    pushFollow(FOLLOW_subname_in_name203);
            	    sn=subname();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sn.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


             retval.name = (ID6!=null?ID6.getText():null) + (sn!=null?sn.name:null); 

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
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:31:1: subname returns [String name] : ( ID | INT ) ;
    public final SAFParser.subname_return subname() throws RecognitionException {
        SAFParser.subname_return retval = new SAFParser.subname_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID7=null;
        Token INT8=null;

        CommonTree ID7_tree=null;
        CommonTree INT8_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:31:30: ( ( ID | INT ) )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:32:3: ( ID | INT )
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:32:3: ( ID | INT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:32:5: ID
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_subname233); 
                    ID7_tree = 
                    (CommonTree)adaptor.create(ID7)
                    ;
                    adaptor.addChild(root_0, ID7_tree);


                     retval.name = (ID7!=null?ID7.getText():null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:33:5: INT
                    {
                    INT8=(Token)match(input,INT,FOLLOW_INT_in_subname264); 
                    INT8_tree = 
                    (CommonTree)adaptor.create(INT8)
                    ;
                    adaptor.addChild(root_0, INT8_tree);


                     retval.name = (INT8!=null?INT8.getText():null); 

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
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:36:1: characteristic returns [Characteristic character] : ( WS )* ( ID )+ ( WS )* '=' ( WS )* INT NEWLINE ;
    public final SAFParser.characteristic_return characteristic() throws RecognitionException {
        SAFParser.characteristic_return retval = new SAFParser.characteristic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WS9=null;
        Token ID10=null;
        Token WS11=null;
        Token char_literal12=null;
        Token WS13=null;
        Token INT14=null;
        Token NEWLINE15=null;

        CommonTree WS9_tree=null;
        CommonTree ID10_tree=null;
        CommonTree WS11_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree WS13_tree=null;
        CommonTree INT14_tree=null;
        CommonTree NEWLINE15_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:36:50: ( ( WS )* ( ID )+ ( WS )* '=' ( WS )* INT NEWLINE )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:37:3: ( WS )* ( ID )+ ( WS )* '=' ( WS )* INT NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:37:3: ( WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:37:3: WS
            	    {
            	    WS9=(Token)match(input,WS,FOLLOW_WS_in_characteristic308); 
            	    WS9_tree = 
            	    (CommonTree)adaptor.create(WS9)
            	    ;
            	    adaptor.addChild(root_0, WS9_tree);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:37:7: ( ID )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:37:7: ID
            	    {
            	    ID10=(Token)match(input,ID,FOLLOW_ID_in_characteristic311); 
            	    ID10_tree = 
            	    (CommonTree)adaptor.create(ID10)
            	    ;
            	    adaptor.addChild(root_0, ID10_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:37:11: ( WS )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==WS) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:37:11: WS
            	    {
            	    WS11=(Token)match(input,WS,FOLLOW_WS_in_characteristic314); 
            	    WS11_tree = 
            	    (CommonTree)adaptor.create(WS11)
            	    ;
            	    adaptor.addChild(root_0, WS11_tree);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            char_literal12=(Token)match(input,13,FOLLOW_13_in_characteristic317); 
            char_literal12_tree = 
            (CommonTree)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:37:19: ( WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:37:19: WS
            	    {
            	    WS13=(Token)match(input,WS,FOLLOW_WS_in_characteristic319); 
            	    WS13_tree = 
            	    (CommonTree)adaptor.create(WS13)
            	    ;
            	    adaptor.addChild(root_0, WS13_tree);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            INT14=(Token)match(input,INT,FOLLOW_INT_in_characteristic322); 
            INT14_tree = 
            (CommonTree)adaptor.create(INT14)
            ;
            adaptor.addChild(root_0, INT14_tree);


            NEWLINE15=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_characteristic324); 
            NEWLINE15_tree = 
            (CommonTree)adaptor.create(NEWLINE15)
            ;
            adaptor.addChild(root_0, NEWLINE15_tree);


             retval.character = new Characteristic((ID10!=null?ID10.getText():null));
                                            retval.character.value = Integer.parseInt((INT14!=null?INT14.getText():null));

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
        public BehaviorRule behavior;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behavior"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:41:1: behavior returns [BehaviorRule behavior] : ( WS )* c= condition '[' ( (id1= ID )+ |c1= choose ) WS ( (id2= ID )+ |c2= choose ) ']' NEWLINE ;
    public final SAFParser.behavior_return behavior() throws RecognitionException {
        SAFParser.behavior_return retval = new SAFParser.behavior_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token id1=null;
        Token id2=null;
        Token WS16=null;
        Token char_literal17=null;
        Token WS18=null;
        Token char_literal19=null;
        Token NEWLINE20=null;
        SAFParser.condition_return c =null;

        SAFParser.choose_return c1 =null;

        SAFParser.choose_return c2 =null;


        CommonTree id1_tree=null;
        CommonTree id2_tree=null;
        CommonTree WS16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree WS18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree NEWLINE20_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:41:41: ( ( WS )* c= condition '[' ( (id1= ID )+ |c1= choose ) WS ( (id2= ID )+ |c2= choose ) ']' NEWLINE )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:42:3: ( WS )* c= condition '[' ( (id1= ID )+ |c1= choose ) WS ( (id2= ID )+ |c2= choose ) ']' NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:42:3: ( WS )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==WS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:42:3: WS
            	    {
            	    WS16=(Token)match(input,WS,FOLLOW_WS_in_behavior369); 
            	    WS16_tree = 
            	    (CommonTree)adaptor.create(WS16)
            	    ;
            	    adaptor.addChild(root_0, WS16_tree);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            pushFollow(FOLLOW_condition_in_behavior374);
            c=condition();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());

            char_literal17=(Token)match(input,14,FOLLOW_14_in_behavior376); 
            char_literal17_tree = 
            (CommonTree)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);


             retval.behavior = new BehaviorRule();
                                            retval.behavior.condition = (c!=null?c.condition:null); 

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:44:3: ( (id1= ID )+ |c1= choose )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==CHOOSE) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:44:5: (id1= ID )+
                    {
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:44:9: (id1= ID )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:44:9: id1= ID
                    	    {
                    	    id1=(Token)match(input,ID,FOLLOW_ID_in_behavior396); 
                    	    id1_tree = 
                    	    (CommonTree)adaptor.create(id1)
                    	    ;
                    	    adaptor.addChild(root_0, id1_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                     retval.behavior.moveAction = new Action((id1!=null?id1.getText():null));

                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:45:5: c1= choose
                    {
                    pushFollow(FOLLOW_choose_in_behavior426);
                    c1=choose();

                    state._fsp--;

                    adaptor.addChild(root_0, c1.getTree());

                    }
                    break;

            }


            WS18=(Token)match(input,WS,FOLLOW_WS_in_behavior429); 
            WS18_tree = 
            (CommonTree)adaptor.create(WS18)
            ;
            adaptor.addChild(root_0, WS18_tree);


             retval.behavior.moveAction = (c1!=null?c1.action:null);

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:46:3: ( (id2= ID )+ |c2= choose )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==CHOOSE) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:46:5: (id2= ID )+
                    {
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:46:9: (id2= ID )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:46:9: id2= ID
                    	    {
                    	    id2=(Token)match(input,ID,FOLLOW_ID_in_behavior450); 
                    	    id2_tree = 
                    	    (CommonTree)adaptor.create(id2)
                    	    ;
                    	    adaptor.addChild(root_0, id2_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                     retval.behavior.fightAction = new Action((id2!=null?id2.getText():null));

                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:5: c2= choose
                    {
                    pushFollow(FOLLOW_choose_in_behavior480);
                    c2=choose();

                    state._fsp--;

                    adaptor.addChild(root_0, c2.getTree());

                     retval.behavior.moveAction = (c2!=null?c2.action:null);

                    }
                    break;

            }


            char_literal19=(Token)match(input,15,FOLLOW_15_in_behavior501); 
            char_literal19_tree = 
            (CommonTree)adaptor.create(char_literal19)
            ;
            adaptor.addChild(root_0, char_literal19_tree);


            NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_behavior503); 
            NEWLINE20_tree = 
            (CommonTree)adaptor.create(NEWLINE20)
            ;
            adaptor.addChild(root_0, NEWLINE20_tree);


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


    public static class choose_return extends ParserRuleReturnScope {
        public Action action;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "choose"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:50:1: choose returns [Action action] : CHOOSE '(' ( ID )+ ( chooseEnd )+ ')' ;
    public final SAFParser.choose_return choose() throws RecognitionException {
        SAFParser.choose_return retval = new SAFParser.choose_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CHOOSE21=null;
        Token char_literal22=null;
        Token ID23=null;
        Token char_literal25=null;
        SAFParser.chooseEnd_return chooseEnd24 =null;


        CommonTree CHOOSE21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree ID23_tree=null;
        CommonTree char_literal25_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:50:31: ( CHOOSE '(' ( ID )+ ( chooseEnd )+ ')' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:51:3: CHOOSE '(' ( ID )+ ( chooseEnd )+ ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            CHOOSE21=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_choose516); 
            CHOOSE21_tree = 
            (CommonTree)adaptor.create(CHOOSE21)
            ;
            adaptor.addChild(root_0, CHOOSE21_tree);


            char_literal22=(Token)match(input,11,FOLLOW_11_in_choose519); 
            char_literal22_tree = 
            (CommonTree)adaptor.create(char_literal22)
            ;
            adaptor.addChild(root_0, char_literal22_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:51:15: ( ID )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:51:15: ID
            	    {
            	    ID23=(Token)match(input,ID,FOLLOW_ID_in_choose521); 
            	    ID23_tree = 
            	    (CommonTree)adaptor.create(ID23)
            	    ;
            	    adaptor.addChild(root_0, ID23_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


             retval.action = new Action();
                                            retval.action.values.add((ID23!=null?ID23.getText():null)); 

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:53:3: ( chooseEnd )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:54:5: chooseEnd
            	    {
            	    pushFollow(FOLLOW_chooseEnd_in_choose548);
            	    chooseEnd24=chooseEnd();

            	    state._fsp--;

            	    adaptor.addChild(root_0, chooseEnd24.getTree());

            	     retval.action = new Action();
            	                                    retval.action.values.add((chooseEnd24!=null?chooseEnd24.value:null)); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            char_literal25=(Token)match(input,12,FOLLOW_12_in_choose572); 
            char_literal25_tree = 
            (CommonTree)adaptor.create(char_literal25)
            ;
            adaptor.addChild(root_0, char_literal25_tree);


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
    // $ANTLR end "choose"


    public static class chooseEnd_return extends ParserRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chooseEnd"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:58:1: chooseEnd returns [String value] : WS ID ;
    public final SAFParser.chooseEnd_return chooseEnd() throws RecognitionException {
        SAFParser.chooseEnd_return retval = new SAFParser.chooseEnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WS26=null;
        Token ID27=null;

        CommonTree WS26_tree=null;
        CommonTree ID27_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:58:33: ( WS ID )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:59:3: WS ID
            {
            root_0 = (CommonTree)adaptor.nil();


            WS26=(Token)match(input,WS,FOLLOW_WS_in_chooseEnd587); 
            WS26_tree = 
            (CommonTree)adaptor.create(WS26)
            ;
            adaptor.addChild(root_0, WS26_tree);


            ID27=(Token)match(input,ID,FOLLOW_ID_in_chooseEnd589); 
            ID27_tree = 
            (CommonTree)adaptor.create(ID27)
            ;
            adaptor.addChild(root_0, ID27_tree);


            retval.value = (ID27!=null?ID27.getText():null);

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
    // $ANTLR end "chooseEnd"


    public static class condition_return extends ParserRuleReturnScope {
        public Condition condition;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:61:1: condition returns [Condition condition] : cr1= conditionRule ( OR WS cr2= conditionRule )* ;
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR28=null;
        Token WS29=null;
        SAFParser.conditionRule_return cr1 =null;

        SAFParser.conditionRule_return cr2 =null;


        CommonTree OR28_tree=null;
        CommonTree WS29_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:61:40: (cr1= conditionRule ( OR WS cr2= conditionRule )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:62:4: cr1= conditionRule ( OR WS cr2= conditionRule )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionRule_in_condition629);
            cr1=conditionRule();

            state._fsp--;

            adaptor.addChild(root_0, cr1.getTree());

             retval.condition = (cr1!=null?cr1.condition:null);

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:63:4: ( OR WS cr2= conditionRule )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==OR) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:63:6: OR WS cr2= conditionRule
            	    {
            	    OR28=(Token)match(input,OR,FOLLOW_OR_in_condition647); 
            	    OR28_tree = 
            	    (CommonTree)adaptor.create(OR28)
            	    ;
            	    adaptor.addChild(root_0, OR28_tree);


            	    WS29=(Token)match(input,WS,FOLLOW_WS_in_condition649); 
            	    WS29_tree = 
            	    (CommonTree)adaptor.create(WS29)
            	    ;
            	    adaptor.addChild(root_0, WS29_tree);


            	    pushFollow(FOLLOW_conditionRule_in_condition653);
            	    cr2=conditionRule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cr2.getTree());

            	    ChoiceCondition cc = new ChoiceCondition(ChoiceCondition.ConditionType.OR, (cr2!=null?cr2.condition:null));
            	                                   cc.condition = (cr1!=null?cr1.condition:null);
            	                                   retval.condition =cc;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:68:1: conditionRule returns [Condition condition] : v1= var ( AND WS v2= var )* ;
    public final SAFParser.conditionRule_return conditionRule() throws RecognitionException {
        SAFParser.conditionRule_return retval = new SAFParser.conditionRule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND30=null;
        Token WS31=null;
        SAFParser.var_return v1 =null;

        SAFParser.var_return v2 =null;


        CommonTree AND30_tree=null;
        CommonTree WS31_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:68:44: (v1= var ( AND WS v2= var )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:69:4: v1= var ( AND WS v2= var )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_var_in_conditionRule682);
            v1=var();

            state._fsp--;

            adaptor.addChild(root_0, v1.getTree());

            retval.condition = new Condition((v1!=null?v1._condition:null));

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:70:4: ( AND WS v2= var )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AND) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:70:6: AND WS v2= var
            	    {
            	    AND30=(Token)match(input,AND,FOLLOW_AND_in_conditionRule711); 
            	    AND30_tree = 
            	    (CommonTree)adaptor.create(AND30)
            	    ;
            	    adaptor.addChild(root_0, AND30_tree);


            	    WS31=(Token)match(input,WS,FOLLOW_WS_in_conditionRule713); 
            	    WS31_tree = 
            	    (CommonTree)adaptor.create(WS31)
            	    ;
            	    adaptor.addChild(root_0, WS31_tree);


            	    pushFollow(FOLLOW_var_in_conditionRule717);
            	    v2=var();

            	    state._fsp--;

            	    adaptor.addChild(root_0, v2.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            ChoiceCondition cc = new ChoiceCondition(ChoiceCondition.ConditionType.AND,(v2!=null?v2._condition:null));
                                           cc.condition = (v1!=null?v1._condition:null);
                                           retval.condition = new Condition(cc);

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
        public Condition _condition;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:74:1: var returns [Condition _condition] : ( ID ( WS )* | '(' ( WS )* c= condition ( WS )* ')' ( WS )* );
    public final SAFParser.var_return var() throws RecognitionException {
        SAFParser.var_return retval = new SAFParser.var_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID32=null;
        Token WS33=null;
        Token char_literal34=null;
        Token WS35=null;
        Token WS36=null;
        Token char_literal37=null;
        Token WS38=null;
        SAFParser.condition_return c =null;


        CommonTree ID32_tree=null;
        CommonTree WS33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree WS35_tree=null;
        CommonTree WS36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree WS38_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:74:35: ( ID ( WS )* | '(' ( WS )* c= condition ( WS )* ')' ( WS )* )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==11) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:75:4: ID ( WS )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID32=(Token)match(input,ID,FOLLOW_ID_in_var748); 
                    ID32_tree = 
                    (CommonTree)adaptor.create(ID32)
                    ;
                    adaptor.addChild(root_0, ID32_tree);


                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:75:7: ( WS )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==WS) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:75:7: WS
                    	    {
                    	    WS33=(Token)match(input,WS,FOLLOW_WS_in_var750); 
                    	    WS33_tree = 
                    	    (CommonTree)adaptor.create(WS33)
                    	    ;
                    	    adaptor.addChild(root_0, WS33_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    retval._condition = new Condition(new StringCondition((ID32!=null?ID32.getText():null)));

                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:6: '(' ( WS )* c= condition ( WS )* ')' ( WS )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal34=(Token)match(input,11,FOLLOW_11_in_var788); 
                    char_literal34_tree = 
                    (CommonTree)adaptor.create(char_literal34)
                    ;
                    adaptor.addChild(root_0, char_literal34_tree);


                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:10: ( WS )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==WS) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:10: WS
                    	    {
                    	    WS35=(Token)match(input,WS,FOLLOW_WS_in_var790); 
                    	    WS35_tree = 
                    	    (CommonTree)adaptor.create(WS35)
                    	    ;
                    	    adaptor.addChild(root_0, WS35_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    pushFollow(FOLLOW_condition_in_var795);
                    c=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, c.getTree());

                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:26: ( WS )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==WS) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:26: WS
                    	    {
                    	    WS36=(Token)match(input,WS,FOLLOW_WS_in_var797); 
                    	    WS36_tree = 
                    	    (CommonTree)adaptor.create(WS36)
                    	    ;
                    	    adaptor.addChild(root_0, WS36_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    char_literal37=(Token)match(input,12,FOLLOW_12_in_var800); 
                    char_literal37_tree = 
                    (CommonTree)adaptor.create(char_literal37)
                    ;
                    adaptor.addChild(root_0, char_literal37_tree);


                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:34: ( WS )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==WS) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:34: WS
                    	    {
                    	    WS38=(Token)match(input,WS,FOLLOW_WS_in_var802); 
                    	    WS38_tree = 
                    	    (CommonTree)adaptor.create(WS38)
                    	    ;
                    	    adaptor.addChild(root_0, WS38_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    retval._condition = new Condition((c!=null?c.condition:null));

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\7\uffff";
    static final String DFA4_eofS =
        "\7\uffff";
    static final String DFA4_minS =
        "\1\6\1\uffff\1\6\1\4\1\uffff\1\4\1\uffff";
    static final String DFA4_maxS =
        "\1\21\1\uffff\1\13\1\16\1\uffff\1\16\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\3\2\uffff\1\1\1\uffff\1\2";
    static final String DFA4_specialS =
        "\7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\3\uffff\1\2\1\4\5\uffff\1\1",
            "",
            "\1\3\3\uffff\1\2\1\4",
            "\1\4\1\uffff\1\6\2\uffff\1\4\1\5\2\uffff\1\6\1\4",
            "",
            "\1\4\4\uffff\1\4\1\5\2\uffff\1\6\1\4",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()+ loopback of 24:7: (b= behavior |c= characteristic )+";
        }
    }
 

    public static final BitSet FOLLOW_bot_in_bots54 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_name_in_bot92 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_NEWLINE_in_bot94 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_16_in_bot115 = new BitSet(new long[]{0x0000000000000D40L});
    public static final BitSet FOLLOW_NEWLINE_in_bot117 = new BitSet(new long[]{0x0000000000000D40L});
    public static final BitSet FOLLOW_behavior_in_bot132 = new BitSet(new long[]{0x0000000000020C40L});
    public static final BitSet FOLLOW_characteristic_in_bot157 = new BitSet(new long[]{0x0000000000020C40L});
    public static final BitSet FOLLOW_17_in_bot179 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NEWLINE_in_bot181 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ID_in_name199 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_subname_in_name203 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_ID_in_subname233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_subname264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_characteristic308 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_ID_in_characteristic311 = new BitSet(new long[]{0x0000000000002440L});
    public static final BitSet FOLLOW_WS_in_characteristic314 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_13_in_characteristic317 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_WS_in_characteristic319 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_INT_in_characteristic322 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_characteristic324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_behavior369 = new BitSet(new long[]{0x0000000000000C40L});
    public static final BitSet FOLLOW_condition_in_behavior374 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_behavior376 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ID_in_behavior396 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_choose_in_behavior426 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_WS_in_behavior429 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ID_in_behavior450 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_choose_in_behavior480 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_behavior501 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_behavior503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_choose516 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_choose519 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_choose521 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_chooseEnd_in_choose548 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_12_in_choose572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_chooseEnd587 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_chooseEnd589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionRule_in_condition629 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_OR_in_condition647 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_WS_in_condition649 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_conditionRule_in_condition653 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_var_in_conditionRule682 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_conditionRule711 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_WS_in_conditionRule713 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_var_in_conditionRule717 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_var748 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_WS_in_var750 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_11_in_var788 = new BitSet(new long[]{0x0000000000000C40L});
    public static final BitSet FOLLOW_WS_in_var790 = new BitSet(new long[]{0x0000000000000C40L});
    public static final BitSet FOLLOW_condition_in_var795 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_WS_in_var797 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_12_in_var800 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_WS_in_var802 = new BitSet(new long[]{0x0000000000000402L});

}