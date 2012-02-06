package saf.game.event;

import java.util.EventObject;

@SuppressWarnings("serial")
public class NewBotEvent extends EventObject {
	public NewBotEvent(Object source, String Path, boolean botOne) {
		super(source);
		this.path = Path;
		this.BotOne = botOne;
	}
	private final boolean BotOne;
	private final String path;
	public String getPath() {
		return path;
	}
	public boolean isBotOne() {
		return BotOne;
	}
}
