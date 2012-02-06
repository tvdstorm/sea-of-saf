package saf.game.event.source;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import saf.game.event.NewBotEvent;
import saf.game.event.listener.iGameEventListener;

public class EventSource {

	private List<iGameEventListener> _listeners = new ArrayList<iGameEventListener>();

	public synchronized void addEventListener(iGameEventListener listener) {
		_listeners.add(listener);
	}

	public synchronized void removeEventListener(iGameEventListener listener) {
		_listeners.remove(listener);
	}

	// call this method whenever you want to notify
	// the event listeners of the particular event
	public synchronized void fireEvent(String Path, boolean isBotOne) {
		NewBotEvent event = new NewBotEvent(this,Path, isBotOne);
		Iterator<iGameEventListener> i = _listeners.iterator();
		while (i.hasNext()) {
			((iGameEventListener) i.next()).handleNewBot(event);
		}
	}
}
