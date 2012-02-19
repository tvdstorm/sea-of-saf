// $ANTLR 3.4 D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g 2012-02-19 20:37:16

package reader.antlr;

import fighter.*;
import fighter.action.*;
import fighter.condition.*;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class SAFParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "ATTACKS", "COMMENTS", "CONDITIONS",
			"IDENT", "INTEGER", "MOVES", "STRENGTHS", "WHITESPACE", "'('",
			"')'", "'='", "'['", "']'", "'always'", "'and'", "'choose('",
			"'or'", "'{'", "'}'" };

	public static final int EOF = -1;
	public static final int T__12 = 12;
	public static final int T__13 = 13;
	public static final int T__14 = 14;
	public static final int T__15 = 15;
	public static final int T__16 = 16;
	public static final int T__17 = 17;
	public static final int T__18 = 18;
	public static final int T__19 = 19;
	public static final int T__20 = 20;
	public static final int T__21 = 21;
	public static final int T__22 = 22;
	public static final int ATTACKS = 4;
	public static final int COMMENTS = 5;
	public static final int CONDITIONS = 6;
	public static final int IDENT = 7;
	public static final int INTEGER = 8;
	public static final int MOVES = 9;
	public static final int STRENGTHS = 10;
	public static final int WHITESPACE = 11;

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

	public String[] getTokenNames() {
		return SAFParser.tokenNames;
	}

	public String getGrammarFileName() {
		return "D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g";
	}

	// $ANTLR start "fighter"
	// D:\\vlad\\serios\\master\\Software
	// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:18:1:
	// fighter returns [Bot bot] : IDENT '{' personality behaviour '}' ;
	public final Bot fighter() throws RecognitionException {
		Bot bot = null;

		Token IDENT1 = null;
		Personality personality2 = null;

		Behaviour behaviour3 = null;

		try {
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:19:3:
			// ( IDENT '{' personality behaviour '}' )
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:20:3:
			// IDENT '{' personality behaviour '}'
			{
				IDENT1 = (Token) match(input, IDENT, FOLLOW_IDENT_in_fighter47);

				match(input, 21, FOLLOW_21_in_fighter49);

				pushFollow(FOLLOW_personality_in_fighter51);
				personality2 = personality();

				state._fsp--;

				pushFollow(FOLLOW_behaviour_in_fighter53);
				behaviour3 = behaviour();

				state._fsp--;

				bot = new Bot(IDENT1.getText(), personality2, behaviour3);

				match(input, 22, FOLLOW_22_in_fighter94);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return bot;
	}

	// $ANTLR end "fighter"

	// $ANTLR start "personality"
	// D:\\vlad\\serios\\master\\Software
	// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:27:1:
	// personality returns [Personality personality] : ( STRENGTHS '=' INTEGER
	// )* ;
	public final Personality personality() throws RecognitionException {
		Personality personality = null;

		Token STRENGTHS4 = null;
		Token INTEGER5 = null;

		try {
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:28:3:
			// ( ( STRENGTHS '=' INTEGER )* )
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:30:4:
			// ( STRENGTHS '=' INTEGER )*
			{

				personality = new Personality();

				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:33:3:
				// ( STRENGTHS '=' INTEGER )*
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if ((LA1_0 == STRENGTHS)) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:33:4:
					// STRENGTHS '=' INTEGER
					{
						STRENGTHS4 = (Token) match(input, STRENGTHS,
								FOLLOW_STRENGTHS_in_personality122);

						match(input, 14, FOLLOW_14_in_personality124);

						INTEGER5 = (Token) match(input, INTEGER,
								FOLLOW_INTEGER_in_personality126);

						if (STRENGTHS4.getText().equals("punchReach")) {
							personality.setPunchReach(Integer
									.parseInt((INTEGER5 != null ? INTEGER5
											.getText() : null)));
						}
						if ((STRENGTHS4 != null ? STRENGTHS4.getText() : null)
								.equals("punchPower")) {
							personality.setPunchPower(Integer
									.parseInt((INTEGER5 != null ? INTEGER5
											.getText() : null)));
						}
						if ((STRENGTHS4 != null ? STRENGTHS4.getText() : null)
								.equals("kickReach")) {
							personality.setKickReach(Integer
									.parseInt((INTEGER5 != null ? INTEGER5
											.getText() : null)));
						}
						if ((STRENGTHS4 != null ? STRENGTHS4.getText() : null)
								.equals("kickPower")) {
							personality.setKickPower(Integer
									.parseInt((INTEGER5 != null ? INTEGER5
											.getText() : null)));
						}
						;

					}
						break;

					default:
						break loop1;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return personality;
	}

	// $ANTLR end "personality"

	// $ANTLR start "behaviour"
	// D:\\vlad\\serios\\master\\Software
	// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:51:1:
	// behaviour returns [Behaviour behaviour] : ( cond '[' moveGen= move
	// attackGen= atack ']' )* 'always' '[' moveAlw= move attackAlw= atack ']' ;
	public final Behaviour behaviour() throws RecognitionException {
		Behaviour behaviour = null;

		Actions<MoveActionType> moveGen = null;

		Actions<FightActionType> attackGen = null;

		Actions<MoveActionType> moveAlw = null;

		Actions<FightActionType> attackAlw = null;

		ICondition cond6 = null;

		try {
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:52:3:
			// ( ( cond '[' moveGen= move attackGen= atack ']' )* 'always' '['
			// moveAlw= move attackAlw= atack ']' )
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:53:3:
			// ( cond '[' moveGen= move attackGen= atack ']' )* 'always' '['
			// moveAlw= move attackAlw= atack ']'
			{

				behaviour = new Behaviour();

				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:56:3:
				// ( cond '[' moveGen= move attackGen= atack ']' )*
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);

					if ((LA2_0 == CONDITIONS || LA2_0 == 12)) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:57:3:
					// cond '[' moveGen= move attackGen= atack ']'
					{
						Rule rule;

						pushFollow(FOLLOW_cond_in_behaviour190);
						cond6 = cond();

						state._fsp--;

						match(input, 15, FOLLOW_15_in_behaviour194);

						pushFollow(FOLLOW_move_in_behaviour203);
						moveGen = move();

						state._fsp--;

						pushFollow(FOLLOW_atack_in_behaviour211);
						attackGen = atack();

						state._fsp--;

						match(input, 16, FOLLOW_16_in_behaviour215);

						rule = new Rule(cond6, moveGen, attackGen);
						behaviour.add(rule);

					}
						break;

					default:
						break loop2;
					}
				} while (true);

				match(input, 17, FOLLOW_17_in_behaviour228);

				match(input, 15, FOLLOW_15_in_behaviour230);

				pushFollow(FOLLOW_move_in_behaviour237);
				moveAlw = move();

				state._fsp--;

				pushFollow(FOLLOW_atack_in_behaviour241);
				attackAlw = atack();

				state._fsp--;

				match(input, 16, FOLLOW_16_in_behaviour243);

				Rule rule;
				rule = new Rule(cond6, moveAlw, attackAlw);
				behaviour.add(rule);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return behaviour;
	}

	// $ANTLR end "behaviour"

	// $ANTLR start "move"
	// D:\\vlad\\serios\\master\\Software
	// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:72:1:
	// move returns [Actions<MoveActionType> moveActions ] : ( (move1= MOVES ) |
	// ( 'choose(' (move2= MOVES )+ ')' ) ) ;
	public final Actions<MoveActionType> move() throws RecognitionException {
		Actions<MoveActionType> moveActions = null;

		Token move1 = null;
		Token move2 = null;

		try {
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:72:52:
			// ( ( (move1= MOVES ) | ( 'choose(' (move2= MOVES )+ ')' ) ) )
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:73:3:
			// ( (move1= MOVES ) | ( 'choose(' (move2= MOVES )+ ')' ) )
			{
				moveActions = new Actions<MoveActionType>();

				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:75:5:
				// ( (move1= MOVES ) | ( 'choose(' (move2= MOVES )+ ')' ) )
				int alt4 = 2;
				int LA4_0 = input.LA(1);

				if ((LA4_0 == MOVES)) {
					alt4 = 1;
				} else if ((LA4_0 == 19)) {
					alt4 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 4,
							0, input);

					throw nvae;

				}
				switch (alt4) {
				case 1:
				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:76:7:
				// (move1= MOVES )
				{
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:76:7:
					// (move1= MOVES )
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:77:8:
					// move1= MOVES
					{
						move1 = (Token) match(input, MOVES,
								FOLLOW_MOVES_in_move293);

						moveActions.add(MoveActionType
								.valueOf((move1 != null ? move1.getText()
										: null)));

					}

				}
					break;
				case 2:
				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:83:7:
				// ( 'choose(' (move2= MOVES )+ ')' )
				{
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:83:7:
					// ( 'choose(' (move2= MOVES )+ ')' )
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:83:8:
					// 'choose(' (move2= MOVES )+ ')'
					{
						match(input, 19, FOLLOW_19_in_move328);

						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:83:18:
						// (move2= MOVES )+
						int cnt3 = 0;
						loop3: do {
							int alt3 = 2;
							int LA3_0 = input.LA(1);

							if ((LA3_0 == MOVES)) {
								alt3 = 1;
							}

							switch (alt3) {
							case 1:
							// D:\\vlad\\serios\\master\\Software
							// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:84:8:
							// move2= MOVES
							{
								move2 = (Token) match(input, MOVES,
										FOLLOW_MOVES_in_move343);

								moveActions.add(MoveActionType
										.valueOf((move2 != null ? move2
												.getText() : null)));

							}
								break;

							default:
								if (cnt3 >= 1)
									break loop3;
								EarlyExitException eee = new EarlyExitException(
										3, input);
								throw eee;
							}
							cnt3++;
						} while (true);

						match(input, 13, FOLLOW_13_in_move364);

					}

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return moveActions;
	}

	// $ANTLR end "move"

	// $ANTLR start "atack"
	// D:\\vlad\\serios\\master\\Software
	// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:92:1:
	// atack returns [ Actions<FightActionType> fightActions] : ( (attack1=
	// ATTACKS ) | 'choose(' (attack2= ATTACKS )+ ')' ) ;
	public final Actions<FightActionType> atack() throws RecognitionException {
		Actions<FightActionType> fightActions = null;

		Token attack1 = null;
		Token attack2 = null;

		try {
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:92:56:
			// ( ( (attack1= ATTACKS ) | 'choose(' (attack2= ATTACKS )+ ')' ) )
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:93:4:
			// ( (attack1= ATTACKS ) | 'choose(' (attack2= ATTACKS )+ ')' )
			{

				fightActions = new Actions<FightActionType>();

				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:96:5:
				// ( (attack1= ATTACKS ) | 'choose(' (attack2= ATTACKS )+ ')' )
				int alt6 = 2;
				int LA6_0 = input.LA(1);

				if ((LA6_0 == ATTACKS)) {
					alt6 = 1;
				} else if ((LA6_0 == 19)) {
					alt6 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 6,
							0, input);

					throw nvae;

				}
				switch (alt6) {
				case 1:
				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:97:6:
				// (attack1= ATTACKS )
				{
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:97:6:
					// (attack1= ATTACKS )
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:98:7:
					// attack1= ATTACKS
					{
						attack1 = (Token) match(input, ATTACKS,
								FOLLOW_ATTACKS_in_atack423);

						fightActions.add(FightActionType
								.valueOf((attack1 != null ? attack1.getText()
										: null)));

					}

				}
					break;
				case 2:
				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:103:9:
				// 'choose(' (attack2= ATTACKS )+ ')'
				{
					match(input, 19, FOLLOW_19_in_atack449);

					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:103:19:
					// (attack2= ATTACKS )+
					int cnt5 = 0;
					loop5: do {
						int alt5 = 2;
						int LA5_0 = input.LA(1);

						if ((LA5_0 == ATTACKS)) {
							alt5 = 1;
						}

						switch (alt5) {
						case 1:
						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:104:8:
						// attack2= ATTACKS
						{
							attack2 = (Token) match(input, ATTACKS,
									FOLLOW_ATTACKS_in_atack464);

							fightActions.add(FightActionType
									.valueOf((attack2 != null ? attack2
											.getText() : null)));

						}
							break;

						default:
							if (cnt5 >= 1)
								break loop5;
							EarlyExitException eee = new EarlyExitException(5,
									input);
							throw eee;
						}
						cnt5++;
					} while (true);

					match(input, 13, FOLLOW_13_in_atack484);

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return fightActions;
	}

	// $ANTLR end "atack"

	// $ANTLR start "cond"
	// D:\\vlad\\serios\\master\\Software
	// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:111:1:
	// cond returns [ ICondition condition] : ( ( orCond ) ) ;
	public final ICondition cond() throws RecognitionException {
		ICondition condition = null;

		ICondition orCond7 = null;

		try {
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:112:2:
			// ( ( ( orCond ) ) )
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:113:3:
			// ( ( orCond ) )
			{
				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:113:3:
				// ( ( orCond ) )
				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:116:7:
				// ( orCond )
				{
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:116:7:
					// ( orCond )
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:116:8:
					// orCond
					{
						pushFollow(FOLLOW_orCond_in_cond528);
						orCond7 = orCond();

						state._fsp--;

						condition = orCond7;

					}

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return condition;
	}

	// $ANTLR end "cond"

	// $ANTLR start "condSimple"
	// D:\\vlad\\serios\\master\\Software
	// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:120:1:
	// condSimple returns [ ICondition condition] : ( ( CONDITIONS ) | ( '('
	// cond ')' ) );
	public final ICondition condSimple() throws RecognitionException {
		ICondition condition = null;

		Token CONDITIONS8 = null;
		ICondition cond9 = null;

		try {
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:121:2:
			// ( ( CONDITIONS ) | ( '(' cond ')' ) )
			int alt7 = 2;
			int LA7_0 = input.LA(1);

			if ((LA7_0 == CONDITIONS)) {
				alt7 = 1;
			} else if ((LA7_0 == 12)) {
				alt7 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 7, 0,
						input);

				throw nvae;

			}
			switch (alt7) {
			case 1:
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:123:2:
			// ( CONDITIONS )
			{
				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:123:2:
				// ( CONDITIONS )
				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:123:3:
				// CONDITIONS
				{
					CONDITIONS8 = (Token) match(input, CONDITIONS,
							FOLLOW_CONDITIONS_in_condSimple562);

					condition = new SimpleCondition(
							(CONDITIONS8 != null ? CONDITIONS8.getText() : null));

				}

			}
				break;
			case 2:
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:126:4:
			// ( '(' cond ')' )
			{
				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:126:4:
				// ( '(' cond ')' )
				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:126:5:
				// '(' cond ')'
				{
					match(input, 12, FOLLOW_12_in_condSimple578);

					pushFollow(FOLLOW_cond_in_condSimple580);
					cond9 = cond();

					state._fsp--;

					match(input, 13, FOLLOW_13_in_condSimple581);

					condition = cond9;

				}

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return condition;
	}

	// $ANTLR end "condSimple"

	// $ANTLR start "andCond"
	// D:\\vlad\\serios\\master\\Software
	// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:128:1:
	// andCond returns [ ICondition condition] : cond1= condSimple ( 'and'
	// cond2= condSimple )* ;
	public final ICondition andCond() throws RecognitionException {
		ICondition condition = null;

		ICondition cond1 = null;

		ICondition cond2 = null;

		try {
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:129:2:
			// (cond1= condSimple ( 'and' cond2= condSimple )* )
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:130:2:
			// cond1= condSimple ( 'and' cond2= condSimple )*
			{
				pushFollow(FOLLOW_condSimple_in_andCond604);
				cond1 = condSimple();

				state._fsp--;

				condition = cond1;

				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:131:2:
				// ( 'and' cond2= condSimple )*
				loop8: do {
					int alt8 = 2;
					int LA8_0 = input.LA(1);

					if ((LA8_0 == 18)) {
						alt8 = 1;
					}

					switch (alt8) {
					case 1:
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:131:3:
					// 'and' cond2= condSimple
					{
						match(input, 18, FOLLOW_18_in_andCond610);

						pushFollow(FOLLOW_condSimple_in_andCond616);
						cond2 = condSimple();

						state._fsp--;

						condition = new AndCondition(condition, cond2);

					}
						break;

					default:
						break loop8;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return condition;
	}

	// $ANTLR end "andCond"

	// $ANTLR start "orCond"
	// D:\\vlad\\serios\\master\\Software
	// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:134:1:
	// orCond returns [ ICondition condition] : cond1= andCond ( 'or' cond2=
	// andCond )* ;
	public final ICondition orCond() throws RecognitionException {
		ICondition condition = null;

		ICondition cond1 = null;

		ICondition cond2 = null;

		try {
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:135:2:
			// (cond1= andCond ( 'or' cond2= andCond )* )
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:136:2:
			// cond1= andCond ( 'or' cond2= andCond )*
			{
				pushFollow(FOLLOW_andCond_in_orCond640);
				cond1 = andCond();

				state._fsp--;

				condition = cond1;

				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:137:2:
				// ( 'or' cond2= andCond )*
				loop9: do {
					int alt9 = 2;
					int LA9_0 = input.LA(1);

					if ((LA9_0 == 20)) {
						alt9 = 1;
					}

					switch (alt9) {
					case 1:
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:137:3:
					// 'or' cond2= andCond
					{
						match(input, 20, FOLLOW_20_in_orCond646);

						pushFollow(FOLLOW_andCond_in_orCond652);
						cond2 = andCond();

						state._fsp--;

						condition = new OrCondition(condition, cond2);

					}
						break;

					default:
						break loop9;
					}
				} while (true);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return condition;
	}

	// $ANTLR end "orCond"

	// Delegated rules

	public static final BitSet FOLLOW_IDENT_in_fighter47 = new BitSet(
			new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_fighter49 = new BitSet(
			new long[] { 0x0000000000021440L });
	public static final BitSet FOLLOW_personality_in_fighter51 = new BitSet(
			new long[] { 0x0000000000021040L });
	public static final BitSet FOLLOW_behaviour_in_fighter53 = new BitSet(
			new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_fighter94 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_STRENGTHS_in_personality122 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_14_in_personality124 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_INTEGER_in_personality126 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_cond_in_behaviour190 = new BitSet(
			new long[] { 0x0000000000008000L });
	public static final BitSet FOLLOW_15_in_behaviour194 = new BitSet(
			new long[] { 0x0000000000080200L });
	public static final BitSet FOLLOW_move_in_behaviour203 = new BitSet(
			new long[] { 0x0000000000080010L });
	public static final BitSet FOLLOW_atack_in_behaviour211 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_16_in_behaviour215 = new BitSet(
			new long[] { 0x0000000000021040L });
	public static final BitSet FOLLOW_17_in_behaviour228 = new BitSet(
			new long[] { 0x0000000000008000L });
	public static final BitSet FOLLOW_15_in_behaviour230 = new BitSet(
			new long[] { 0x0000000000080200L });
	public static final BitSet FOLLOW_move_in_behaviour237 = new BitSet(
			new long[] { 0x0000000000080010L });
	public static final BitSet FOLLOW_atack_in_behaviour241 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_16_in_behaviour243 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_MOVES_in_move293 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_19_in_move328 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_MOVES_in_move343 = new BitSet(
			new long[] { 0x0000000000002200L });
	public static final BitSet FOLLOW_13_in_move364 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ATTACKS_in_atack423 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_19_in_atack449 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_ATTACKS_in_atack464 = new BitSet(
			new long[] { 0x0000000000002010L });
	public static final BitSet FOLLOW_13_in_atack484 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_orCond_in_cond528 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONDITIONS_in_condSimple562 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_12_in_condSimple578 = new BitSet(
			new long[] { 0x0000000000001040L });
	public static final BitSet FOLLOW_cond_in_condSimple580 = new BitSet(
			new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_13_in_condSimple581 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_condSimple_in_andCond604 = new BitSet(
			new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_18_in_andCond610 = new BitSet(
			new long[] { 0x0000000000001040L });
	public static final BitSet FOLLOW_condSimple_in_andCond616 = new BitSet(
			new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_andCond_in_orCond640 = new BitSet(
			new long[] { 0x0000000000100002L });
	public static final BitSet FOLLOW_20_in_orCond646 = new BitSet(
			new long[] { 0x0000000000001040L });
	public static final BitSet FOLLOW_andCond_in_orCond652 = new BitSet(
			new long[] { 0x0000000000100002L });

}