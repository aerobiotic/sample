package org.jxfs.events;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EventPublisher implements IWeatherEventListener {
	  Map<WeatherEvent, Collection<IWeatherEventListener>> listeners = new HashMap<WeatherEvent, Collection<IWeatherEventListener>>(); 

	  @Override 
	  public synchronized void eventReceived(WeatherEvent event) {
	      for (IWeatherEventListener listener : listeners.get(event)){ 
	          listener.eventReceived(event); 
	      }
	  }

	  public synchronized void register(IWeatherEventListener listener, WeatherEvent event){
	      Collection<IWeatherEventListener> list = listeners.get(event); 
	      if (list == null) {
	          list = new LinkedList<IWeatherEventListener>();
	          listeners.put(event, list); 
	      }
	      list.add(listener);
	  }

	  public synchronized void deregister(IWeatherEventListener listener, WeatherEvent event) {
	      listeners.get(event).remove(listener); 
	  }

	  public String toString() {
	      String ret = ""; 
	      Iterator<WeatherEvent> i = listeners.keySet().iterator();
	      while (i.hasNext()) {
	          Iterator<IWeatherEventListener> j = listeners.get(i.next()).iterator();
	          while (j.hasNext()) {
	              ret = ret + i.next() + "::" + j.next() + "\n"; 
	          }
	      }
	      return ret; 
	  }
	}

