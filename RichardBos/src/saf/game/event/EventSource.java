package saf.game.event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EventSource {

	private List<iEventListener> _listeners = new ArrayList<iEventListener>();

	public synchronized void addEventListener(iEventListener listener) {
		_listeners.add(listener);
	}

	public synchronized void removeEventListener(iEventListener listener) {
		_listeners.remove(listener);
	}

	// call this method whenever you want to notify
	// the event listeners of the particular event
	public synchronized void fireEvent(String Path, String side) {
		NewBotEvent event = new NewBotEvent(this,Path, side);
		Iterator<iEventListener> i = _listeners.iterator();
		while (i.hasNext()) {
			((iEventListener) i.next()).handleNewBot(event);
		}
	}
}
