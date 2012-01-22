package nl.tamasja.uva.saf;

import nl.tamasja.uva.saf.bot.FighterBot;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BotLoader botLoader = new BotLoader();
		FighterBot bot = botLoader.loadFile("bots/chicken.saf");
		System.out.println(bot.toString());
	}
}