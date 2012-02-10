package saf.game.event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EventSource {

	private List<iEventListener> listEventListeners = new ArrayList<iEventListener>();

	public synchronized void addEventListener(iEventListener listener) {
		listEventListeners.add(listener);
	}

	public synchronized void removeEventListener(iEventListener listener) {
		listEventListeners.remove(listener);
	}

	public synchronized void fireGameStartEvent() {
		for (iEventListener eventListener : listEventListeners) {
			eventListener.handleStartGame();
		}
	}
	
	public synchronized void fireNewBotEvent(String Path, String side) {
		NewBotEvent event = new NewBotEvent(this,Path, side);
		for (iEventListener eventListener : listEventListeners) {
			eventListener.handleNewBot(event);
		}
	}
}
