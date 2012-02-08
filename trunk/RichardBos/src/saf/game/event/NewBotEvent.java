package saf.game.event;

import java.util.EventObject;

@SuppressWarnings("serial")
public class NewBotEvent extends EventObject {
	public NewBotEvent(Object source, String Path, String side) {
		super(source);
		this.path = Path;
		this.side = side;
	}
	private final String side;
	private final String path;
	public String getPath() {
		return path;
	}
	public String getSide() {
		return side;
	}
}
