/* Generated By:JavaCC: Do not edit this line. Saf.java */
package parser;
import java.util.ArrayList;
import abstractSyntaxTree.*;

public class Saf implements SafConstants {

  static final public ArrayList < Fighter > Parse() throws ParseException {
  ArrayList < Fighter > fighters = new ArrayList < Fighter > ();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
        Fighter tempFighter = new Fighter();
  Token tempFighterName = new Token();
  Personality tempFighterPersonality = new Personality();
  PersonalityNode tempPersonalityNode = new PersonalityNode();
  Behavior tempFighterBehavior = new Behavior();
  BehaviorRule tempBehaviorRule = new BehaviorRule();
      tempFighterName = jj_consume_token(IDENTIFIER);
        tempFighter.setName(tempFighterName.toString());
      jj_consume_token(LEFTCURLYBRACKET);
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
        if (jj_2_1(2)) {
          tempPersonalityNode = Personality();
          tempFighterPersonality.addNode(tempPersonalityNode);
        } else {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case IDENTIFIER:
            tempBehaviorRule = Behavior();
          tempFighterBehavior.addRule(tempBehaviorRule);
            break;
          default:
            jj_la1[2] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      }
      jj_consume_token(RIGHTCURLYBRACKET);
      tempFighter.addPersonality(tempFighterPersonality);
      tempFighter.addBehavior(tempFighterBehavior);
      fighters.add(tempFighter);
    }
    jj_consume_token(0);
    {if (true) return fighters;}
    throw new Error("Missing return statement in function");
  }

  static final public PersonalityNode Personality() throws ParseException {
  Token strength = new Token();
  Token value = new Token();
  PersonalityNode temp = new PersonalityNode();
    strength = jj_consume_token(IDENTIFIER);
      temp.setStrength(strength.toString());
    jj_consume_token(ASSIGNMENT);
    value = jj_consume_token(NUM);
      temp.setValue(Integer.parseInt(value.toString()));
    {if (true) return temp;}
    throw new Error("Missing return statement in function");
  }

  static final public BehaviorRule Behavior() throws ParseException {
  Condition conditions = new Condition();
  Move moves = new Move();
  Attack attacks = new Attack();
  BehaviorRule rule = new BehaviorRule();
    conditions = Condition();
      rule.setCondition(conditions);
    jj_consume_token(LEFTSQAREBRACKET);
    moves = Moves();
      rule.setMove(moves);
    attacks = Attacks();
      rule.setAttack(attacks);
    jj_consume_token(RIGHTSQAREBRACKET);
    {if (true) return rule;}
    throw new Error("Missing return statement in function");
  }

  static final public Condition Condition() throws ParseException {
  ArrayList < String > tempCondition = new ArrayList < String > ();
  Token CondToken = new Token();
  Condition condition = new Condition();
    CondToken = jj_consume_token(IDENTIFIER);
      tempCondition.add(CondToken.toString());
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
      case OR:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      if (jj_2_2(2)) {
        CondToken = jj_consume_token(OR);
          tempCondition.add(CondToken.toString());
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case AND:
          CondToken = jj_consume_token(AND);
          tempCondition.add(CondToken.toString());
          break;
        default:
          jj_la1[4] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      CondToken = jj_consume_token(IDENTIFIER);
        tempCondition.add(CondToken.toString());
    }
    condition.setConditions(tempCondition);
    {if (true) return condition;}
    throw new Error("Missing return statement in function");
  }

  static final public Move Moves() throws ParseException {
  ArrayList < String > moveTemp = new ArrayList < String > ();
  Token moveToken = new Token();
  Move moves = new Move();
    if (jj_2_3(2)) {
      moveToken = jj_consume_token(IDENTIFIER);
        moveTemp.add(moveToken.toString());
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CHOOSE:
        jj_consume_token(CHOOSE);
        jj_consume_token(LEFTPARENTHESIS);
        label_4:
        while (true) {
          moveToken = jj_consume_token(IDENTIFIER);
          moveTemp.add(moveToken.toString());
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case IDENTIFIER:
            ;
            break;
          default:
            jj_la1[5] = jj_gen;
            break label_4;
          }
        }
        jj_consume_token(RIGHTPARENTHESIS);
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    moves.setMoves(moveTemp);
    {if (true) return moves;}
    throw new Error("Missing return statement in function");
  }

  static final public Attack Attacks() throws ParseException {
  ArrayList < String > attackTemp = new ArrayList < String > ();
  Token attackToken = new Token();
  Attack attacks = new Attack();
    if (jj_2_4(2)) {
      attackToken = jj_consume_token(IDENTIFIER);
        attackTemp.add(attackToken.toString());
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CHOOSE:
        jj_consume_token(CHOOSE);
        jj_consume_token(LEFTPARENTHESIS);
        label_5:
        while (true) {
          attackToken = jj_consume_token(IDENTIFIER);
          attackTemp.add(attackToken.toString());
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case IDENTIFIER:
            ;
            break;
          default:
            jj_la1[7] = jj_gen;
            break label_5;
          }
        }
        jj_consume_token(RIGHTPARENTHESIS);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    attacks.setAttacks(attackTemp);
    {if (true) return attacks;}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_3R_6() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(ASSIGNMENT)) return true;
    return false;
  }

  static private boolean jj_3_4() {
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_3R_6()) return true;
    return false;
  }

  static private boolean jj_3_3() {
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_scan_token(OR)) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public SafTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[9];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x400,0x400,0x400,0x180,0x80,0x400,0x200,0x400,0x200,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[4];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Saf(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Saf(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SafTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Saf(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SafTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Saf(SafTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(SafTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[18];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 9; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 18; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 4; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

 }