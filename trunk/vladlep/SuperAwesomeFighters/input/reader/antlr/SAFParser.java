// $ANTLR 3.4 D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g 2012-01-22 22:00:42

package reader.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class SAFParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "ATTACKS", "COMMENTS", "CONDITIONS",
			"IDENT", "MOVES", "STRENGTHS", "TWODIGITS", "WHITESPACE", "')'",
			"'='", "'['", "']'", "'always'", "'and'", "'choose('", "'or'",
			"'{'", "'}'" };

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
	public static final int ATTACKS = 4;
	public static final int COMMENTS = 5;
	public static final int CONDITIONS = 6;
	public static final int IDENT = 7;
	public static final int MOVES = 8;
	public static final int STRENGTHS = 9;
	public static final int TWODIGITS = 10;
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
	// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:13:1:
	// fighter : IDENT '{' ( STRENGTHS '=' TWODIGITS )* ( ( CONDITIONS | (
	// CONDITIONS 'and' CONDITIONS ) | ( CONDITIONS 'or' CONDITIONS ) ) '[' (
	// MOVES | ( 'choose(' MOVES MOVES ')' ) ) ( ATTACKS | 'choose(' ATTACKS
	// ATTACKS ')' ) ']' )* 'always' '[' MOVES ATTACKS ']' '}' ;
	public final void fighter() throws RecognitionException {
		try {
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:14:2:
			// ( IDENT '{' ( STRENGTHS '=' TWODIGITS )* ( ( CONDITIONS | (
			// CONDITIONS 'and' CONDITIONS ) | ( CONDITIONS 'or' CONDITIONS ) )
			// '[' ( MOVES | ( 'choose(' MOVES MOVES ')' ) ) ( ATTACKS |
			// 'choose(' ATTACKS ATTACKS ')' ) ']' )* 'always' '[' MOVES ATTACKS
			// ']' '}' )
			// D:\\vlad\\serios\\master\\Software
			// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:14:4:
			// IDENT '{' ( STRENGTHS '=' TWODIGITS )* ( ( CONDITIONS | (
			// CONDITIONS 'and' CONDITIONS ) | ( CONDITIONS 'or' CONDITIONS ) )
			// '[' ( MOVES | ( 'choose(' MOVES MOVES ')' ) ) ( ATTACKS |
			// 'choose(' ATTACKS ATTACKS ')' ) ']' )* 'always' '[' MOVES ATTACKS
			// ']' '}'
			{
				match(input, IDENT, FOLLOW_IDENT_in_fighter39);

				match(input, 20, FOLLOW_20_in_fighter41);

				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:15:2:
				// ( STRENGTHS '=' TWODIGITS )*
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if ((LA1_0 == STRENGTHS)) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:15:3:
					// STRENGTHS '=' TWODIGITS
					{
						match(input, STRENGTHS, FOLLOW_STRENGTHS_in_fighter45);

						match(input, 13, FOLLOW_13_in_fighter47);

						match(input, TWODIGITS, FOLLOW_TWODIGITS_in_fighter48);

					}
						break;

					default:
						break loop1;
					}
				} while (true);

				// D:\\vlad\\serios\\master\\Software
				// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:2:
				// ( ( CONDITIONS | ( CONDITIONS 'and' CONDITIONS ) | (
				// CONDITIONS 'or' CONDITIONS ) ) '[' ( MOVES | ( 'choose('
				// MOVES MOVES ')' ) ) ( ATTACKS | 'choose(' ATTACKS ATTACKS ')'
				// ) ']' )*
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if ((LA5_0 == CONDITIONS)) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
					// D:\\vlad\\serios\\master\\Software
					// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:4:
					// ( CONDITIONS | ( CONDITIONS 'and' CONDITIONS ) | (
					// CONDITIONS 'or' CONDITIONS ) ) '[' ( MOVES | ( 'choose('
					// MOVES MOVES ')' ) ) ( ATTACKS | 'choose(' ATTACKS ATTACKS
					// ')' ) ']'
					{
						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:4:
						// ( CONDITIONS | ( CONDITIONS 'and' CONDITIONS ) | (
						// CONDITIONS 'or' CONDITIONS ) )
						int alt2 = 3;
						int LA2_0 = input.LA(1);

						if ((LA2_0 == CONDITIONS)) {
							switch (input.LA(2)) {
							case 17: {
								alt2 = 2;
							}
								break;
							case 19: {
								alt2 = 3;
							}
								break;
							case 14: {
								alt2 = 1;
							}
								break;
							default:
								NoViableAltException nvae = new NoViableAltException(
										"", 2, 1, input);

								throw nvae;

							}

						} else {
							NoViableAltException nvae = new NoViableAltException(
									"", 2, 0, input);

							throw nvae;

						}
						switch (alt2) {
						case 1:
						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:5:
						// CONDITIONS
						{
							match(input, CONDITIONS,
									FOLLOW_CONDITIONS_in_fighter57);

						}
							break;
						case 2:
						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:18:
						// ( CONDITIONS 'and' CONDITIONS )
						{
							// D:\\vlad\\serios\\master\\Software
							// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:18:
							// ( CONDITIONS 'and' CONDITIONS )
							// D:\\vlad\\serios\\master\\Software
							// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:20:
							// CONDITIONS 'and' CONDITIONS
							{
								match(input, CONDITIONS,
										FOLLOW_CONDITIONS_in_fighter63);

								match(input, 17, FOLLOW_17_in_fighter65);

								match(input, CONDITIONS,
										FOLLOW_CONDITIONS_in_fighter67);

							}

						}
							break;
						case 3:
						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:51:
						// ( CONDITIONS 'or' CONDITIONS )
						{
							// D:\\vlad\\serios\\master\\Software
							// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:51:
							// ( CONDITIONS 'or' CONDITIONS )
							// D:\\vlad\\serios\\master\\Software
							// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:53:
							// CONDITIONS 'or' CONDITIONS
							{
								match(input, CONDITIONS,
										FOLLOW_CONDITIONS_in_fighter74);

								match(input, 19, FOLLOW_19_in_fighter76);

								match(input, CONDITIONS,
										FOLLOW_CONDITIONS_in_fighter78);

							}

						}
							break;

						}

						match(input, 14, FOLLOW_14_in_fighter83);

						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:17:6:
						// ( MOVES | ( 'choose(' MOVES MOVES ')' ) )
						int alt3 = 2;
						int LA3_0 = input.LA(1);

						if ((LA3_0 == MOVES)) {
							alt3 = 1;
						} else if ((LA3_0 == 18)) {
							alt3 = 2;
						} else {
							NoViableAltException nvae = new NoViableAltException(
									"", 3, 0, input);

							throw nvae;

						}
						switch (alt3) {
						case 1:
						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:17:7:
						// MOVES
						{
							match(input, MOVES, FOLLOW_MOVES_in_fighter86);

						}
							break;
						case 2:
						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:17:15:
						// ( 'choose(' MOVES MOVES ')' )
						{
							// D:\\vlad\\serios\\master\\Software
							// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:17:15:
							// ( 'choose(' MOVES MOVES ')' )
							// D:\\vlad\\serios\\master\\Software
							// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:17:17:
							// 'choose(' MOVES MOVES ')'
							{
								match(input, 18, FOLLOW_18_in_fighter92);

								match(input, MOVES, FOLLOW_MOVES_in_fighter94);

								match(input, MOVES, FOLLOW_MOVES_in_fighter96);

								match(input, 12, FOLLOW_12_in_fighter97);

							}

						}
							break;

						}

						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:18:2:
						// ( ATTACKS | 'choose(' ATTACKS ATTACKS ')' )
						int alt4 = 2;
						int LA4_0 = input.LA(1);

						if ((LA4_0 == ATTACKS)) {
							alt4 = 1;
						} else if ((LA4_0 == 18)) {
							alt4 = 2;
						} else {
							NoViableAltException nvae = new NoViableAltException(
									"", 4, 0, input);

							throw nvae;

						}
						switch (alt4) {
						case 1:
						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:18:3:
						// ATTACKS
						{
							match(input, ATTACKS, FOLLOW_ATTACKS_in_fighter105);

						}
							break;
						case 2:
						// D:\\vlad\\serios\\master\\Software
						// Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:18:13:
						// 'choose(' ATTACKS ATTACKS ')'
						{
							match(input, 18, FOLLOW_18_in_fighter109);

							match(input, ATTACKS, FOLLOW_ATTACKS_in_fighter110);

							match(input, ATTACKS, FOLLOW_ATTACKS_in_fighter112);

							match(input, 12, FOLLOW_12_in_fighter114);

						}
							break;

						}

						match(input, 15, FOLLOW_15_in_fighter116);

					}
						break;

					default:
						break loop5;
					}
				} while (true);

				match(input, 16, FOLLOW_16_in_fighter122);

				match(input, 14, FOLLOW_14_in_fighter124);

				match(input, MOVES, FOLLOW_MOVES_in_fighter126);

				match(input, ATTACKS, FOLLOW_ATTACKS_in_fighter128);

				match(input, 15, FOLLOW_15_in_fighter130);

				match(input, 21, FOLLOW_21_in_fighter133);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "fighter"

	// Delegated rules

	public static final BitSet FOLLOW_IDENT_in_fighter39 = new BitSet(
			new long[] { 0x0000000000100000L });
	public static final BitSet FOLLOW_20_in_fighter41 = new BitSet(
			new long[] { 0x0000000000010240L });
	public static final BitSet FOLLOW_STRENGTHS_in_fighter45 = new BitSet(
			new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_13_in_fighter47 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_TWODIGITS_in_fighter48 = new BitSet(
			new long[] { 0x0000000000010240L });
	public static final BitSet FOLLOW_CONDITIONS_in_fighter57 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CONDITIONS_in_fighter63 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_17_in_fighter65 = new BitSet(
			new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_CONDITIONS_in_fighter67 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_CONDITIONS_in_fighter74 = new BitSet(
			new long[] { 0x0000000000080000L });
	public static final BitSet FOLLOW_19_in_fighter76 = new BitSet(
			new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_CONDITIONS_in_fighter78 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_14_in_fighter83 = new BitSet(
			new long[] { 0x0000000000040100L });
	public static final BitSet FOLLOW_MOVES_in_fighter86 = new BitSet(
			new long[] { 0x0000000000040010L });
	public static final BitSet FOLLOW_18_in_fighter92 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_MOVES_in_fighter94 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_MOVES_in_fighter96 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_fighter97 = new BitSet(
			new long[] { 0x0000000000040010L });
	public static final BitSet FOLLOW_ATTACKS_in_fighter105 = new BitSet(
			new long[] { 0x0000000000008000L });
	public static final BitSet FOLLOW_18_in_fighter109 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_ATTACKS_in_fighter110 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_ATTACKS_in_fighter112 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_fighter114 = new BitSet(
			new long[] { 0x0000000000008000L });
	public static final BitSet FOLLOW_15_in_fighter116 = new BitSet(
			new long[] { 0x0000000000010040L });
	public static final BitSet FOLLOW_16_in_fighter122 = new BitSet(
			new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_14_in_fighter124 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_MOVES_in_fighter126 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_ATTACKS_in_fighter128 = new BitSet(
			new long[] { 0x0000000000008000L });
	public static final BitSet FOLLOW_15_in_fighter130 = new BitSet(
			new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_fighter133 = new BitSet(
			new long[] { 0x0000000000000002L });

}