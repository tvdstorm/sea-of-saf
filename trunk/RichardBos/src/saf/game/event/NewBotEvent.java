package saf.game.event;

import java.util.EventObject;

public class NewBotEvent extends EventObject {
	
	private static final long serialVersionUID = 7422131718689991957L;

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
