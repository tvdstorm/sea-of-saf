// $ANTLR 3.4 C:\\Antlr\\SAF\\SAF.g 2012-03-04 22:04:13

package parser;
import java.util.LinkedList;
import behaviours.*;
import fighter.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHOOSE", "INT", "NAME", "NEWLINE", "OPERATOR", "WS", "'('", "')'", "'='", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int CHOOSE=4;
    public static final int INT=5;
    public static final int NAME=6;
    public static final int NEWLINE=7;
    public static final int OPERATOR=8;
    public static final int WS=9;

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

    public String[] getTokenNames() { return SAFParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Antlr\\SAF\\SAF.g"; }



    // $ANTLR start "fighter"
    // C:\\Antlr\\SAF\\SAF.g:19:1: fighter returns [Fighter f] : n= NAME ( NEWLINE )* '{' ( NEWLINE |p= property |c= activity )* '}' ;
    public final Fighter fighter() throws RecognitionException {
        Fighter f = null;


        Token n=null;
        Property p =null;

        Activity c =null;


        f = new Fighter();
        try {
            // C:\\Antlr\\SAF\\SAF.g:22:3: (n= NAME ( NEWLINE )* '{' ( NEWLINE |p= property |c= activity )* '}' )
            // C:\\Antlr\\SAF\\SAF.g:22:3: n= NAME ( NEWLINE )* '{' ( NEWLINE |p= property |c= activity )* '}'
            {
            n=(Token)match(input,NAME,FOLLOW_NAME_in_fighter152); 

            f.setName((n!=null?n.getText():null));

            // C:\\Antlr\\SAF\\SAF.g:22:33: ( NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:22:33: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_fighter156); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,15,FOLLOW_15_in_fighter159); 

            // C:\\Antlr\\SAF\\SAF.g:23:3: ( NEWLINE |p= property |c= activity )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case NEWLINE:
                    {
                    alt2=1;
                    }
                    break;
                case NAME:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==12) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==OPERATOR||LA2_3==13) ) {
                        alt2=3;
                    }


                    }
                    break;
                case 10:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:24:6: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_fighter171); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Antlr\\SAF\\SAF.g:25:6: p= property
            	    {
            	    pushFollow(FOLLOW_property_in_fighter181);
            	    p=property();

            	    state._fsp--;


            	    f.addProperty(p);

            	    }
            	    break;
            	case 3 :
            	    // C:\\Antlr\\SAF\\SAF.g:26:6: c= activity
            	    {
            	    pushFollow(FOLLOW_activity_in_fighter192);
            	    c=activity();

            	    state._fsp--;


            	    f.addActivity(c);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_fighter203); 



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return f;
    }
    // $ANTLR end "fighter"



    // $ANTLR start "property"
    // C:\\Antlr\\SAF\\SAF.g:30:1: property returns [Property p] : n= NAME '=' v= INT NEWLINE ;
    public final Property property() throws RecognitionException {
        Property p = null;


        Token n=null;
        Token v=null;

        try {
            // C:\\Antlr\\SAF\\SAF.g:30:30: (n= NAME '=' v= INT NEWLINE )
            // C:\\Antlr\\SAF\\SAF.g:30:32: n= NAME '=' v= INT NEWLINE
            {
            n=(Token)match(input,NAME,FOLLOW_NAME_in_property218); 

            match(input,12,FOLLOW_12_in_property220); 

            v=(Token)match(input,INT,FOLLOW_INT_in_property224); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_property226); 

            p =new Property((n!=null?n.getText():null), (v!=null?v.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "property"



    // $ANTLR start "activity"
    // C:\\Antlr\\SAF\\SAF.g:32:1: activity returns [Activity a] : c= condition '[' m= movement ac= action ']' NEWLINE ;
    public final Activity activity() throws RecognitionException {
        Activity a = null;


        Condition c =null;

        Movement m =null;

        Action ac =null;


        try {
            // C:\\Antlr\\SAF\\SAF.g:33:3: (c= condition '[' m= movement ac= action ']' NEWLINE )
            // C:\\Antlr\\SAF\\SAF.g:34:3: c= condition '[' m= movement ac= action ']' NEWLINE
            {
            pushFollow(FOLLOW_condition_in_activity246);
            c=condition();

            state._fsp--;


            match(input,13,FOLLOW_13_in_activity248); 

            pushFollow(FOLLOW_movement_in_activity252);
            m=movement();

            state._fsp--;


            pushFollow(FOLLOW_action_in_activity256);
            ac=action();

            state._fsp--;


            match(input,14,FOLLOW_14_in_activity258); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_activity260); 

            a = new Activity(c,m,ac);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return a;
    }
    // $ANTLR end "activity"



    // $ANTLR start "condition"
    // C:\\Antlr\\SAF\\SAF.g:37:1: condition returns [Condition c] : (n= NAME | '(' cc= condition ')' ) (o= OPERATOR sc= condition )? ;
    public final Condition condition() throws RecognitionException {
        Condition c = null;


        Token n=null;
        Token o=null;
        Condition cc =null;

        Condition sc =null;


        try {
            // C:\\Antlr\\SAF\\SAF.g:38:2: ( (n= NAME | '(' cc= condition ')' ) (o= OPERATOR sc= condition )? )
            // C:\\Antlr\\SAF\\SAF.g:39:4: (n= NAME | '(' cc= condition ')' ) (o= OPERATOR sc= condition )?
            {
            // C:\\Antlr\\SAF\\SAF.g:39:4: (n= NAME | '(' cc= condition ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NAME) ) {
                alt3=1;
            }
            else if ( (LA3_0==10) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:39:5: n= NAME
                    {
                    n=(Token)match(input,NAME,FOLLOW_NAME_in_condition284); 

                    c = new Condition((n!=null?n.getText():null));

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:39:45: '(' cc= condition ')'
                    {
                    match(input,10,FOLLOW_10_in_condition290); 

                    pushFollow(FOLLOW_condition_in_condition294);
                    cc=condition();

                    state._fsp--;


                    c = cc;

                    match(input,11,FOLLOW_11_in_condition298); 

                    }
                    break;

            }


            // C:\\Antlr\\SAF\\SAF.g:39:78: (o= OPERATOR sc= condition )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==OPERATOR) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:39:79: o= OPERATOR sc= condition
                    {
                    o=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_condition304); 

                    pushFollow(FOLLOW_condition_in_condition308);
                    sc=condition();

                    state._fsp--;


                    c.addSubCondition((o!=null?o.getText():null),sc);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return c;
    }
    // $ANTLR end "condition"



    // $ANTLR start "movement"
    // C:\\Antlr\\SAF\\SAF.g:44:1: movement returns [Movement m] : ( (n= NAME ) | (c= choose ) );
    public final Movement movement() throws RecognitionException {
        Movement m = null;


        Token n=null;
        List<String> c =null;


        try {
            // C:\\Antlr\\SAF\\SAF.g:45:2: ( (n= NAME ) | (c= choose ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NAME) ) {
                alt5=1;
            }
            else if ( (LA5_0==CHOOSE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:46:2: (n= NAME )
                    {
                    // C:\\Antlr\\SAF\\SAF.g:46:2: (n= NAME )
                    // C:\\Antlr\\SAF\\SAF.g:46:3: n= NAME
                    {
                    n=(Token)match(input,NAME,FOLLOW_NAME_in_movement330); 

                    m = new Movement((n!=null?n.getText():null));

                    }


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:47:3: (c= choose )
                    {
                    // C:\\Antlr\\SAF\\SAF.g:47:3: (c= choose )
                    // C:\\Antlr\\SAF\\SAF.g:47:4: c= choose
                    {
                    pushFollow(FOLLOW_choose_in_movement340);
                    c=choose();

                    state._fsp--;


                    m = new Movement(c);

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return m;
    }
    // $ANTLR end "movement"



    // $ANTLR start "action"
    // C:\\Antlr\\SAF\\SAF.g:50:1: action returns [Action a] : ( (n= NAME ) | (c= choose ) );
    public final Action action() throws RecognitionException {
        Action a = null;


        Token n=null;
        List<String> c =null;


        try {
            // C:\\Antlr\\SAF\\SAF.g:51:2: ( (n= NAME ) | (c= choose ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NAME) ) {
                alt6=1;
            }
            else if ( (LA6_0==CHOOSE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:52:2: (n= NAME )
                    {
                    // C:\\Antlr\\SAF\\SAF.g:52:2: (n= NAME )
                    // C:\\Antlr\\SAF\\SAF.g:52:3: n= NAME
                    {
                    n=(Token)match(input,NAME,FOLLOW_NAME_in_action361); 

                    a = new Action((n!=null?n.getText():null));

                    }


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:53:3: (c= choose )
                    {
                    // C:\\Antlr\\SAF\\SAF.g:53:3: (c= choose )
                    // C:\\Antlr\\SAF\\SAF.g:53:4: c= choose
                    {
                    pushFollow(FOLLOW_choose_in_action371);
                    c=choose();

                    state._fsp--;


                    a = new Action(c);

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return a;
    }
    // $ANTLR end "action"



    // $ANTLR start "choose"
    // C:\\Antlr\\SAF\\SAF.g:56:1: choose returns [List<String> s] : CHOOSE '(' (n= NAME )+ ')' ;
    public final List<String> choose() throws RecognitionException {
        List<String> s = null;


        Token n=null;

        s = new LinkedList<String>();
        try {
            // C:\\Antlr\\SAF\\SAF.g:58:2: ( CHOOSE '(' (n= NAME )+ ')' )
            // C:\\Antlr\\SAF\\SAF.g:59:2: CHOOSE '(' (n= NAME )+ ')'
            {
            match(input,CHOOSE,FOLLOW_CHOOSE_in_choose393); 

            match(input,10,FOLLOW_10_in_choose395); 

            // C:\\Antlr\\SAF\\SAF.g:60:2: (n= NAME )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==NAME) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:60:3: n= NAME
            	    {
            	    n=(Token)match(input,NAME,FOLLOW_NAME_in_choose401); 

            	    s.add((n!=null?n.getText():null));

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            match(input,11,FOLLOW_11_in_choose409); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "choose"

    // Delegated rules


 

    public static final BitSet FOLLOW_NAME_in_fighter152 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_NEWLINE_in_fighter156 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_15_in_fighter159 = new BitSet(new long[]{0x00000000000104C0L});
    public static final BitSet FOLLOW_NEWLINE_in_fighter171 = new BitSet(new long[]{0x00000000000104C0L});
    public static final BitSet FOLLOW_property_in_fighter181 = new BitSet(new long[]{0x00000000000104C0L});
    public static final BitSet FOLLOW_activity_in_fighter192 = new BitSet(new long[]{0x00000000000104C0L});
    public static final BitSet FOLLOW_16_in_fighter203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_property218 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_property220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_property224 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_property226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_activity246 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_activity248 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_movement_in_activity252 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_action_in_activity256 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_activity258 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_activity260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_condition284 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_10_in_condition290 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_condition_in_condition294 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_condition298 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_OPERATOR_in_condition304 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_condition_in_condition308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_movement330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_movement340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_action361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_action371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_choose393 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_choose395 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NAME_in_choose401 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_11_in_choose409 = new BitSet(new long[]{0x0000000000000002L});

}