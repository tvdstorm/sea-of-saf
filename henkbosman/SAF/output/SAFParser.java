// $ANTLR 3.4 C:\\Antlr\\SAF\\SAF.g 2012-01-23 22:35:20
import java.util.LinkedList;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHOOSE", "CURLYCLOSE", "CURLYOPEN", "INT", "IS", "NAME", "NEWLINE", "OPERATOR", "PARENTHESESCLOSE", "PARENTHESESOPEN", "SQUARECLOSE", "SQUAREOPEN", "WS"
    };

    public static final int EOF=-1;
    public static final int CHOOSE=4;
    public static final int CURLYCLOSE=5;
    public static final int CURLYOPEN=6;
    public static final int INT=7;
    public static final int IS=8;
    public static final int NAME=9;
    public static final int NEWLINE=10;
    public static final int OPERATOR=11;
    public static final int PARENTHESESCLOSE=12;
    public static final int PARENTHESESOPEN=13;
    public static final int SQUARECLOSE=14;
    public static final int SQUAREOPEN=15;
    public static final int WS=16;

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
    // C:\\Antlr\\SAF\\SAF.g:20:1: fighter returns [Fighter f] : n= NAME NEWLINE CURLYOPEN ( NEWLINE |p= property |c= activity )* CURLYCLOSE ;
    public final Fighter fighter() throws RecognitionException {
        Fighter f = null;


        Token n=null;
        Property p =null;

        Activity c =null;


        f = new Fighter();
        try {
            // C:\\Antlr\\SAF\\SAF.g:23:3: (n= NAME NEWLINE CURLYOPEN ( NEWLINE |p= property |c= activity )* CURLYCLOSE )
            // C:\\Antlr\\SAF\\SAF.g:23:3: n= NAME NEWLINE CURLYOPEN ( NEWLINE |p= property |c= activity )* CURLYCLOSE
            {
            n=(Token)match(input,NAME,FOLLOW_NAME_in_fighter214); 

            f.Name((n!=null?n.getText():null));

            match(input,NEWLINE,FOLLOW_NEWLINE_in_fighter218); 

            match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_fighter220); 

            // C:\\Antlr\\SAF\\SAF.g:24:3: ( NEWLINE |p= property |c= activity )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case NEWLINE:
                    {
                    alt1=1;
                    }
                    break;
                case NAME:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==IS) ) {
                        alt1=2;
                    }
                    else if ( (LA1_3==NAME||LA1_3==OPERATOR||LA1_3==SQUAREOPEN) ) {
                        alt1=3;
                    }


                    }
                    break;
                case OPERATOR:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:25:6: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_fighter232); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Antlr\\SAF\\SAF.g:26:6: p= property
            	    {
            	    pushFollow(FOLLOW_property_in_fighter242);
            	    p=property();

            	    state._fsp--;


            	    f.AddProperty(p);

            	    }
            	    break;
            	case 3 :
            	    // C:\\Antlr\\SAF\\SAF.g:27:6: c= activity
            	    {
            	    pushFollow(FOLLOW_activity_in_fighter253);
            	    c=activity();

            	    state._fsp--;


            	    f.AddActivity(c);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_fighter264); 



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
    // C:\\Antlr\\SAF\\SAF.g:31:1: property returns [Property p] : n= NAME IS v= INT NEWLINE ;
    public final Property property() throws RecognitionException {
        Property p = null;


        Token n=null;
        Token v=null;

        try {
            // C:\\Antlr\\SAF\\SAF.g:31:30: (n= NAME IS v= INT NEWLINE )
            // C:\\Antlr\\SAF\\SAF.g:31:32: n= NAME IS v= INT NEWLINE
            {
            n=(Token)match(input,NAME,FOLLOW_NAME_in_property279); 

            match(input,IS,FOLLOW_IS_in_property281); 

            v=(Token)match(input,INT,FOLLOW_INT_in_property285); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_property287); 

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
    // C:\\Antlr\\SAF\\SAF.g:33:1: activity returns [Activity a] : (c= condition )+ SQUAREOPEN m= movement ac= action SQUARECLOSE ;
    public final Activity activity() throws RecognitionException {
        Activity a = null;


        Condition c =null;

        Movement m =null;

        Action ac =null;


        a = new Activity();
        try {
            // C:\\Antlr\\SAF\\SAF.g:35:3: ( (c= condition )+ SQUAREOPEN m= movement ac= action SQUARECLOSE )
            // C:\\Antlr\\SAF\\SAF.g:36:3: (c= condition )+ SQUAREOPEN m= movement ac= action SQUARECLOSE
            {
            // C:\\Antlr\\SAF\\SAF.g:36:3: (c= condition )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NAME||LA2_0==OPERATOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:36:4: c= condition
            	    {
            	    pushFollow(FOLLOW_condition_in_activity312);
            	    c=condition();

            	    state._fsp--;


            	    a.AddCondition(c);

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


            match(input,SQUAREOPEN,FOLLOW_SQUAREOPEN_in_activity321); 

            pushFollow(FOLLOW_movement_in_activity325);
            m=movement();

            state._fsp--;


            a.AddMovement(m);

            pushFollow(FOLLOW_action_in_activity331);
            ac=action();

            state._fsp--;


            a.AddAction(ac);

            match(input,SQUARECLOSE,FOLLOW_SQUARECLOSE_in_activity335); 

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
    // C:\\Antlr\\SAF\\SAF.g:41:1: condition returns [Condition c] : ( (n= NAME ) | (o= OPERATOR m= NAME ) );
    public final Condition condition() throws RecognitionException {
        Condition c = null;


        Token n=null;
        Token o=null;
        Token m=null;

        try {
            // C:\\Antlr\\SAF\\SAF.g:42:3: ( (n= NAME ) | (o= OPERATOR m= NAME ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NAME) ) {
                alt3=1;
            }
            else if ( (LA3_0==OPERATOR) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:43:3: (n= NAME )
                    {
                    // C:\\Antlr\\SAF\\SAF.g:43:3: (n= NAME )
                    // C:\\Antlr\\SAF\\SAF.g:43:4: n= NAME
                    {
                    n=(Token)match(input,NAME,FOLLOW_NAME_in_condition354); 

                    c =new Condition((n!=null?n.getText():null));

                    }


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:44:3: (o= OPERATOR m= NAME )
                    {
                    // C:\\Antlr\\SAF\\SAF.g:44:3: (o= OPERATOR m= NAME )
                    // C:\\Antlr\\SAF\\SAF.g:44:4: o= OPERATOR m= NAME
                    {
                    o=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_condition364); 

                    m=(Token)match(input,NAME,FOLLOW_NAME_in_condition368); 

                    c =new Condition((m!=null?m.getText():null), (o!=null?o.getText():null));

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
        return c;
    }
    // $ANTLR end "condition"



    // $ANTLR start "movement"
    // C:\\Antlr\\SAF\\SAF.g:47:1: movement returns [Movement m] : ( (n= NAME ) | (c= choose ) );
    public final Movement movement() throws RecognitionException {
        Movement m = null;


        Token n=null;
        List<String> c =null;


        m = new Movement();
        try {
            // C:\\Antlr\\SAF\\SAF.g:49:2: ( (n= NAME ) | (c= choose ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==NAME) ) {
                alt4=1;
            }
            else if ( (LA4_0==CHOOSE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:50:2: (n= NAME )
                    {
                    // C:\\Antlr\\SAF\\SAF.g:50:2: (n= NAME )
                    // C:\\Antlr\\SAF\\SAF.g:50:3: n= NAME
                    {
                    n=(Token)match(input,NAME,FOLLOW_NAME_in_movement392); 

                    m.AddMovement((n!=null?n.getText():null));

                    }


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:51:3: (c= choose )
                    {
                    // C:\\Antlr\\SAF\\SAF.g:51:3: (c= choose )
                    // C:\\Antlr\\SAF\\SAF.g:51:4: c= choose
                    {
                    pushFollow(FOLLOW_choose_in_movement402);
                    c=choose();

                    state._fsp--;


                    m.AddMovement(c);

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
    // C:\\Antlr\\SAF\\SAF.g:54:1: action returns [Action a] : ( (n= NAME ) | (c= choose ) );
    public final Action action() throws RecognitionException {
        Action a = null;


        Token n=null;
        List<String> c =null;


        a = new Action();
        try {
            // C:\\Antlr\\SAF\\SAF.g:56:2: ( (n= NAME ) | (c= choose ) )
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
                    // C:\\Antlr\\SAF\\SAF.g:57:2: (n= NAME )
                    {
                    // C:\\Antlr\\SAF\\SAF.g:57:2: (n= NAME )
                    // C:\\Antlr\\SAF\\SAF.g:57:3: n= NAME
                    {
                    n=(Token)match(input,NAME,FOLLOW_NAME_in_action427); 

                    a.AddAction((n!=null?n.getText():null));

                    }


                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:58:3: (c= choose )
                    {
                    // C:\\Antlr\\SAF\\SAF.g:58:3: (c= choose )
                    // C:\\Antlr\\SAF\\SAF.g:58:4: c= choose
                    {
                    pushFollow(FOLLOW_choose_in_action437);
                    c=choose();

                    state._fsp--;


                    a.AddAction(c);

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
    // C:\\Antlr\\SAF\\SAF.g:61:1: choose returns [List<String> s] : CHOOSE PARENTHESESOPEN (n= NAME )+ PARENTHESESCLOSE ;
    public final List<String> choose() throws RecognitionException {
        List<String> s = null;


        Token n=null;

        s = new LinkedList<String>();
        try {
            // C:\\Antlr\\SAF\\SAF.g:63:2: ( CHOOSE PARENTHESESOPEN (n= NAME )+ PARENTHESESCLOSE )
            // C:\\Antlr\\SAF\\SAF.g:64:2: CHOOSE PARENTHESESOPEN (n= NAME )+ PARENTHESESCLOSE
            {
            match(input,CHOOSE,FOLLOW_CHOOSE_in_choose459); 

            match(input,PARENTHESESOPEN,FOLLOW_PARENTHESESOPEN_in_choose461); 

            // C:\\Antlr\\SAF\\SAF.g:65:2: (n= NAME )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NAME) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:65:3: n= NAME
            	    {
            	    n=(Token)match(input,NAME,FOLLOW_NAME_in_choose467); 

            	    s.add((n!=null?n.getText():null));

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match(input,PARENTHESESCLOSE,FOLLOW_PARENTHESESCLOSE_in_choose475); 

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


 

    public static final BitSet FOLLOW_NAME_in_fighter214 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_fighter218 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CURLYOPEN_in_fighter220 = new BitSet(new long[]{0x0000000000000E20L});
    public static final BitSet FOLLOW_NEWLINE_in_fighter232 = new BitSet(new long[]{0x0000000000000E20L});
    public static final BitSet FOLLOW_property_in_fighter242 = new BitSet(new long[]{0x0000000000000E20L});
    public static final BitSet FOLLOW_activity_in_fighter253 = new BitSet(new long[]{0x0000000000000E20L});
    public static final BitSet FOLLOW_CURLYCLOSE_in_fighter264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_property279 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IS_in_property281 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INT_in_property285 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_property287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_activity312 = new BitSet(new long[]{0x0000000000008A00L});
    public static final BitSet FOLLOW_SQUAREOPEN_in_activity321 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_movement_in_activity325 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_action_in_activity331 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SQUARECLOSE_in_activity335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_condition354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATOR_in_condition364 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAME_in_condition368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_movement392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_movement402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_action427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_action437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_choose459 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARENTHESESOPEN_in_choose461 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAME_in_choose467 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_PARENTHESESCLOSE_in_choose475 = new BitSet(new long[]{0x0000000000000002L});

}